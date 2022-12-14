/*
 * This file is generated by jOOQ.
 */
package sts.generated.tables.records;


import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.TableRecordImpl;

import sts.generated.enums.StsStockOrderExecType;
import sts.generated.enums.StsStockOrderOrderStatus;
import sts.generated.tables.StsStockOrder;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StsStockOrderRecord extends TableRecordImpl<StsStockOrderRecord> implements Record11<Integer, String, StsStockOrderOrderStatus, Integer, BigDecimal, BigDecimal, Integer, LocalDateTime, LocalDateTime, StsStockOrderExecType, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>mydev.sts_stock_order.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mydev.sts_stock_order.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mydev.sts_stock_order.ticker</code>.
     */
    public void setTicker(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>mydev.sts_stock_order.ticker</code>.
     */
    public String getTicker() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mydev.sts_stock_order.order_status</code>.
     */
    public void setOrderStatus(StsStockOrderOrderStatus value) {
        set(2, value);
    }

    /**
     * Getter for <code>mydev.sts_stock_order.order_status</code>.
     */
    public StsStockOrderOrderStatus getOrderStatus() {
        return (StsStockOrderOrderStatus) get(2);
    }

    /**
     * Setter for <code>mydev.sts_stock_order.expiration</code>.
     */
    public void setExpiration(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>mydev.sts_stock_order.expiration</code>.
     */
    public Integer getExpiration() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>mydev.sts_stock_order.limit_price</code>.
     */
    public void setLimitPrice(BigDecimal value) {
        set(4, value);
    }

    /**
     * Getter for <code>mydev.sts_stock_order.limit_price</code>.
     */
    public BigDecimal getLimitPrice() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>mydev.sts_stock_order.exec_price</code>.
     */
    public void setExecPrice(BigDecimal value) {
        set(5, value);
    }

    /**
     * Getter for <code>mydev.sts_stock_order.exec_price</code>.
     */
    public BigDecimal getExecPrice() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>mydev.sts_stock_order.shares</code>.
     */
    public void setShares(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>mydev.sts_stock_order.shares</code>.
     */
    public Integer getShares() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>mydev.sts_stock_order.order_time</code>.
     */
    public void setOrderTime(LocalDateTime value) {
        set(7, value);
    }

    /**
     * Getter for <code>mydev.sts_stock_order.order_time</code>.
     */
    public LocalDateTime getOrderTime() {
        return (LocalDateTime) get(7);
    }

    /**
     * Setter for <code>mydev.sts_stock_order.exec_time</code>.
     */
    public void setExecTime(LocalDateTime value) {
        set(8, value);
    }

    /**
     * Getter for <code>mydev.sts_stock_order.exec_time</code>.
     */
    public LocalDateTime getExecTime() {
        return (LocalDateTime) get(8);
    }

    /**
     * Setter for <code>mydev.sts_stock_order.exec_type</code>.
     */
    public void setExecType(StsStockOrderExecType value) {
        set(9, value);
    }

    /**
     * Getter for <code>mydev.sts_stock_order.exec_type</code>.
     */
    public StsStockOrderExecType getExecType() {
        return (StsStockOrderExecType) get(9);
    }

    /**
     * Setter for <code>mydev.sts_stock_order.market_day</code>.
     */
    public void setMarketDay(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>mydev.sts_stock_order.market_day</code>.
     */
    public Integer getMarketDay() {
        return (Integer) get(10);
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row11<Integer, String, StsStockOrderOrderStatus, Integer, BigDecimal, BigDecimal, Integer, LocalDateTime, LocalDateTime, StsStockOrderExecType, Integer> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    @Override
    public Row11<Integer, String, StsStockOrderOrderStatus, Integer, BigDecimal, BigDecimal, Integer, LocalDateTime, LocalDateTime, StsStockOrderExecType, Integer> valuesRow() {
        return (Row11) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return StsStockOrder.STS_STOCK_ORDER.USER_ID;
    }

    @Override
    public Field<String> field2() {
        return StsStockOrder.STS_STOCK_ORDER.TICKER;
    }

    @Override
    public Field<StsStockOrderOrderStatus> field3() {
        return StsStockOrder.STS_STOCK_ORDER.ORDER_STATUS;
    }

    @Override
    public Field<Integer> field4() {
        return StsStockOrder.STS_STOCK_ORDER.EXPIRATION;
    }

    @Override
    public Field<BigDecimal> field5() {
        return StsStockOrder.STS_STOCK_ORDER.LIMIT_PRICE;
    }

    @Override
    public Field<BigDecimal> field6() {
        return StsStockOrder.STS_STOCK_ORDER.EXEC_PRICE;
    }

    @Override
    public Field<Integer> field7() {
        return StsStockOrder.STS_STOCK_ORDER.SHARES;
    }

    @Override
    public Field<LocalDateTime> field8() {
        return StsStockOrder.STS_STOCK_ORDER.ORDER_TIME;
    }

    @Override
    public Field<LocalDateTime> field9() {
        return StsStockOrder.STS_STOCK_ORDER.EXEC_TIME;
    }

    @Override
    public Field<StsStockOrderExecType> field10() {
        return StsStockOrder.STS_STOCK_ORDER.EXEC_TYPE;
    }

    @Override
    public Field<Integer> field11() {
        return StsStockOrder.STS_STOCK_ORDER.MARKET_DAY;
    }

    @Override
    public Integer component1() {
        return getUserId();
    }

    @Override
    public String component2() {
        return getTicker();
    }

    @Override
    public StsStockOrderOrderStatus component3() {
        return getOrderStatus();
    }

    @Override
    public Integer component4() {
        return getExpiration();
    }

    @Override
    public BigDecimal component5() {
        return getLimitPrice();
    }

    @Override
    public BigDecimal component6() {
        return getExecPrice();
    }

    @Override
    public Integer component7() {
        return getShares();
    }

    @Override
    public LocalDateTime component8() {
        return getOrderTime();
    }

    @Override
    public LocalDateTime component9() {
        return getExecTime();
    }

    @Override
    public StsStockOrderExecType component10() {
        return getExecType();
    }

    @Override
    public Integer component11() {
        return getMarketDay();
    }

    @Override
    public Integer value1() {
        return getUserId();
    }

    @Override
    public String value2() {
        return getTicker();
    }

    @Override
    public StsStockOrderOrderStatus value3() {
        return getOrderStatus();
    }

    @Override
    public Integer value4() {
        return getExpiration();
    }

    @Override
    public BigDecimal value5() {
        return getLimitPrice();
    }

    @Override
    public BigDecimal value6() {
        return getExecPrice();
    }

    @Override
    public Integer value7() {
        return getShares();
    }

    @Override
    public LocalDateTime value8() {
        return getOrderTime();
    }

    @Override
    public LocalDateTime value9() {
        return getExecTime();
    }

    @Override
    public StsStockOrderExecType value10() {
        return getExecType();
    }

    @Override
    public Integer value11() {
        return getMarketDay();
    }

    @Override
    public StsStockOrderRecord value1(Integer value) {
        setUserId(value);
        return this;
    }

    @Override
    public StsStockOrderRecord value2(String value) {
        setTicker(value);
        return this;
    }

    @Override
    public StsStockOrderRecord value3(StsStockOrderOrderStatus value) {
        setOrderStatus(value);
        return this;
    }

    @Override
    public StsStockOrderRecord value4(Integer value) {
        setExpiration(value);
        return this;
    }

    @Override
    public StsStockOrderRecord value5(BigDecimal value) {
        setLimitPrice(value);
        return this;
    }

    @Override
    public StsStockOrderRecord value6(BigDecimal value) {
        setExecPrice(value);
        return this;
    }

    @Override
    public StsStockOrderRecord value7(Integer value) {
        setShares(value);
        return this;
    }

    @Override
    public StsStockOrderRecord value8(LocalDateTime value) {
        setOrderTime(value);
        return this;
    }

    @Override
    public StsStockOrderRecord value9(LocalDateTime value) {
        setExecTime(value);
        return this;
    }

    @Override
    public StsStockOrderRecord value10(StsStockOrderExecType value) {
        setExecType(value);
        return this;
    }

    @Override
    public StsStockOrderRecord value11(Integer value) {
        setMarketDay(value);
        return this;
    }

    @Override
    public StsStockOrderRecord values(Integer value1, String value2, StsStockOrderOrderStatus value3, Integer value4, BigDecimal value5, BigDecimal value6, Integer value7, LocalDateTime value8, LocalDateTime value9, StsStockOrderExecType value10, Integer value11) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached StsStockOrderRecord
     */
    public StsStockOrderRecord() {
        super(StsStockOrder.STS_STOCK_ORDER);
    }

    /**
     * Create a detached, initialised StsStockOrderRecord
     */
    public StsStockOrderRecord(Integer userId, String ticker, StsStockOrderOrderStatus orderStatus, Integer expiration, BigDecimal limitPrice, BigDecimal execPrice, Integer shares, LocalDateTime orderTime, LocalDateTime execTime, StsStockOrderExecType execType, Integer marketDay) {
        super(StsStockOrder.STS_STOCK_ORDER);

        setUserId(userId);
        setTicker(ticker);
        setOrderStatus(orderStatus);
        setExpiration(expiration);
        setLimitPrice(limitPrice);
        setExecPrice(execPrice);
        setShares(shares);
        setOrderTime(orderTime);
        setExecTime(execTime);
        setExecType(execType);
        setMarketDay(marketDay);
    }
}
