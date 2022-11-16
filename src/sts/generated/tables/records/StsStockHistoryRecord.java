/*
 * This file is generated by jOOQ.
 */
package sts.generated.tables.records;


import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;

import sts.generated.enums.StsStockHistoryPriceType;
import sts.generated.tables.StsStockHistory;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StsStockHistoryRecord extends UpdatableRecordImpl<StsStockHistoryRecord> implements Record6<Integer, String, BigDecimal, StsStockHistoryPriceType, LocalDateTime, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>mydev.sts_stock_history.uniqid</code>.
     */
    public void setUniqid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mydev.sts_stock_history.uniqid</code>.
     */
    public Integer getUniqid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mydev.sts_stock_history.ticker</code>.
     */
    public void setTicker(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>mydev.sts_stock_history.ticker</code>.
     */
    public String getTicker() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mydev.sts_stock_history.price</code>.
     */
    public void setPrice(BigDecimal value) {
        set(2, value);
    }

    /**
     * Getter for <code>mydev.sts_stock_history.price</code>.
     */
    public BigDecimal getPrice() {
        return (BigDecimal) get(2);
    }

    /**
     * Setter for <code>mydev.sts_stock_history.price_type</code>.
     */
    public void setPriceType(StsStockHistoryPriceType value) {
        set(3, value);
    }

    /**
     * Getter for <code>mydev.sts_stock_history.price_type</code>.
     */
    public StsStockHistoryPriceType getPriceType() {
        return (StsStockHistoryPriceType) get(3);
    }

    /**
     * Setter for <code>mydev.sts_stock_history.generated_at</code>.
     */
    public void setGeneratedAt(LocalDateTime value) {
        set(4, value);
    }

    /**
     * Getter for <code>mydev.sts_stock_history.generated_at</code>.
     */
    public LocalDateTime getGeneratedAt() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>mydev.sts_stock_history.market_day</code>.
     */
    public void setMarketDay(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>mydev.sts_stock_history.market_day</code>.
     */
    public Integer getMarketDay() {
        return (Integer) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, String, BigDecimal, StsStockHistoryPriceType, LocalDateTime, Integer> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Integer, String, BigDecimal, StsStockHistoryPriceType, LocalDateTime, Integer> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return StsStockHistory.STS_STOCK_HISTORY.UNIQID;
    }

    @Override
    public Field<String> field2() {
        return StsStockHistory.STS_STOCK_HISTORY.TICKER;
    }

    @Override
    public Field<BigDecimal> field3() {
        return StsStockHistory.STS_STOCK_HISTORY.PRICE;
    }

    @Override
    public Field<StsStockHistoryPriceType> field4() {
        return StsStockHistory.STS_STOCK_HISTORY.PRICE_TYPE;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return StsStockHistory.STS_STOCK_HISTORY.GENERATED_AT;
    }

    @Override
    public Field<Integer> field6() {
        return StsStockHistory.STS_STOCK_HISTORY.MARKET_DAY;
    }

    @Override
    public Integer component1() {
        return getUniqid();
    }

    @Override
    public String component2() {
        return getTicker();
    }

    @Override
    public BigDecimal component3() {
        return getPrice();
    }

    @Override
    public StsStockHistoryPriceType component4() {
        return getPriceType();
    }

    @Override
    public LocalDateTime component5() {
        return getGeneratedAt();
    }

    @Override
    public Integer component6() {
        return getMarketDay();
    }

    @Override
    public Integer value1() {
        return getUniqid();
    }

    @Override
    public String value2() {
        return getTicker();
    }

    @Override
    public BigDecimal value3() {
        return getPrice();
    }

    @Override
    public StsStockHistoryPriceType value4() {
        return getPriceType();
    }

    @Override
    public LocalDateTime value5() {
        return getGeneratedAt();
    }

    @Override
    public Integer value6() {
        return getMarketDay();
    }

    @Override
    public StsStockHistoryRecord value1(Integer value) {
        setUniqid(value);
        return this;
    }

    @Override
    public StsStockHistoryRecord value2(String value) {
        setTicker(value);
        return this;
    }

    @Override
    public StsStockHistoryRecord value3(BigDecimal value) {
        setPrice(value);
        return this;
    }

    @Override
    public StsStockHistoryRecord value4(StsStockHistoryPriceType value) {
        setPriceType(value);
        return this;
    }

    @Override
    public StsStockHistoryRecord value5(LocalDateTime value) {
        setGeneratedAt(value);
        return this;
    }

    @Override
    public StsStockHistoryRecord value6(Integer value) {
        setMarketDay(value);
        return this;
    }

    @Override
    public StsStockHistoryRecord values(Integer value1, String value2, BigDecimal value3, StsStockHistoryPriceType value4, LocalDateTime value5, Integer value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached StsStockHistoryRecord
     */
    public StsStockHistoryRecord() {
        super(StsStockHistory.STS_STOCK_HISTORY);
    }

    /**
     * Create a detached, initialised StsStockHistoryRecord
     */
    public StsStockHistoryRecord(Integer uniqid, String ticker, BigDecimal price, StsStockHistoryPriceType priceType, LocalDateTime generatedAt, Integer marketDay) {
        super(StsStockHistory.STS_STOCK_HISTORY);

        setUniqid(uniqid);
        setTicker(ticker);
        setPrice(price);
        setPriceType(priceType);
        setGeneratedAt(generatedAt);
        setMarketDay(marketDay);
    }
}
