import static sts.generated.Tables.*;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.*;
import java.time.Clock;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.io.File;
import java.util.Map;

import io.r2dbc.spi.ConnectionFactory;
import org.jooq.Record;
import org.jooq.*;
import org.jooq.conf.Settings;
import org.jooq.impl.*;
import sts.generated.enums.StsStockHistoryPriceType;

public class TradingProgram {
    static DSLContext db = null;
    static String marketName = "DOW";
    static int openTime = 0;
    static int closeTime = 0;
    static boolean isOpen = false;
    static int curMarketDay = 0;
    static String stopFile = "c:/temp/sts.stop";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/mydev","root","Zb121101")){

                System.out.println("Connected");
                db = DSL.using(conn, SQLDialect.MYSQL);
                initMarket();
                File f = new File(stopFile);
                while(true) {
                    if(f.exists() && !f.isDirectory()) {
                        System.out.println("Found stop file: " + stopFile);
                        break;
                    }
                    runMarket();
                    Thread.sleep(1000);
                }
                System.out.println("Done");

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void initMarket() {
        Record market = (Record) db.select().from(STS_MARKET).fetchSingle(); // assume 1 market
        openTime = market.getValue(STS_MARKET.OPEN_TIME);
        closeTime = market.getValue(STS_MARKET.CLOSE_TIME);
        isOpen = market.getValue(STS_MARKET.IS_OPEN) == 1 ? true : false;
        curMarketDay = market.getValue(STS_MARKET.CURRENT_MARKET_DAY) ;
    }

    public static void runMarket(){
        Calendar now = Calendar.getInstance();
        int nowHM = now.get(Calendar.HOUR_OF_DAY)*100 + now.get(Calendar.MINUTE);

        if(nowHM >= openTime && nowHM <= closeTime){
            if(!isOpen) {
                isOpen = true;
                newMarketDay();
                System.out.println("Open stock market, day=" + curMarketDay);
                generateStockPriceHistory("open");
            }else {
                System.out.println("Stock market is open");
                generateStockPriceHistory("normal");
            }
        } else if (nowHM > closeTime && isOpen){
            System.out.println("Close stock market");
            isOpen = false;
            generateStockPriceHistory("close");
            closeMarketDay();
        } else {
            System.out.println("Stock Market is closed. Current Time: " + nowHM);
        }
    }

    public static void newMarketDay()
    {
        Record r = db.insertInto(STS_MARKET_HISTORY, STS_MARKET_HISTORY.OPEN_TIME)
                .values(LocalDateTime.now())
                .returningResult(STS_MARKET_HISTORY.MARKET_DAY)
                .fetchOne();

        curMarketDay = r.getValue(STS_MARKET_HISTORY.MARKET_DAY);

        db.update(STS_MARKET)
                .set(STS_MARKET.CURRENT_MARKET_DAY, curMarketDay)
                .set(STS_MARKET.IS_OPEN, (byte)1)
                .where(STS_MARKET.MARKET_NAME.eq(marketName))
                .execute();
    }

    public static int closeMarketDay()
    {
        db.update(STS_MARKET_HISTORY)
                .set(STS_MARKET_HISTORY.CLOSE_TIME, LocalDateTime.now())
                .where(STS_MARKET_HISTORY.MARKET_DAY.eq(curMarketDay))
                .execute();
        db.update(STS_MARKET)
                .set(STS_MARKET.IS_OPEN, (byte)0)
                .where(STS_MARKET.MARKET_NAME.eq(marketName))
                .execute();
        return 0;
    }

    public static void generateStockPriceHistory(String priceType){

        Result<Record> stocks = db.select().from(STS_STOCK).fetch();

        for (Record r : stocks){
            String ticker = r.getValue(STS_STOCK.TICKER);
            BigDecimal init_price = r.getValue(STS_STOCK.INIT_PRICE);
            System.out.println("Stock ticker: " + ticker + ", Init price: " + init_price);

            BigDecimal random = new BigDecimal(Math.random() + 0.5);
            BigDecimal newPrice = init_price.multiply(random);
            System.out.println( "New price: " + newPrice.setScale(2, RoundingMode.CEILING));
            db.insertInto(STS_STOCK_HISTORY,
                STS_STOCK_HISTORY.TICKER, STS_STOCK_HISTORY.PRICE, STS_STOCK_HISTORY.PRICE_TYPE, STS_STOCK_HISTORY.MARKET_DAY, STS_STOCK_HISTORY.GENERATED_AT)
                .values(ticker, newPrice, StsStockHistoryPriceType.valueOf(priceType), curMarketDay, LocalDateTime.now())
                .execute();
        }
    }
}





