package com.wd.apiaccount.model.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PayCheckDiffExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public PayCheckDiffExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTimeStartIsNull() {
            addCriterion("time_start is null");
            return (Criteria) this;
        }

        public Criteria andTimeStartIsNotNull() {
            addCriterion("time_start is not null");
            return (Criteria) this;
        }

        public Criteria andTimeStartEqualTo(Date value) {
            addCriterion("time_start =", value, "timeStart");
            return (Criteria) this;
        }

        public Criteria andTimeStartNotEqualTo(Date value) {
            addCriterion("time_start <>", value, "timeStart");
            return (Criteria) this;
        }

        public Criteria andTimeStartGreaterThan(Date value) {
            addCriterion("time_start >", value, "timeStart");
            return (Criteria) this;
        }

        public Criteria andTimeStartGreaterThanOrEqualTo(Date value) {
            addCriterion("time_start >=", value, "timeStart");
            return (Criteria) this;
        }

        public Criteria andTimeStartLessThan(Date value) {
            addCriterion("time_start <", value, "timeStart");
            return (Criteria) this;
        }

        public Criteria andTimeStartLessThanOrEqualTo(Date value) {
            addCriterion("time_start <=", value, "timeStart");
            return (Criteria) this;
        }

        public Criteria andTimeStartIn(List<Date> values) {
            addCriterion("time_start in", values, "timeStart");
            return (Criteria) this;
        }

        public Criteria andTimeStartNotIn(List<Date> values) {
            addCriterion("time_start not in", values, "timeStart");
            return (Criteria) this;
        }

        public Criteria andTimeStartBetween(Date value1, Date value2) {
            addCriterion("time_start between", value1, value2, "timeStart");
            return (Criteria) this;
        }

        public Criteria andTimeStartNotBetween(Date value1, Date value2) {
            addCriterion("time_start not between", value1, value2, "timeStart");
            return (Criteria) this;
        }

        public Criteria andTransactionIdIsNull() {
            addCriterion("transaction_id is null");
            return (Criteria) this;
        }

        public Criteria andTransactionIdIsNotNull() {
            addCriterion("transaction_id is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionIdEqualTo(String value) {
            addCriterion("transaction_id =", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotEqualTo(String value) {
            addCriterion("transaction_id <>", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdGreaterThan(String value) {
            addCriterion("transaction_id >", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdGreaterThanOrEqualTo(String value) {
            addCriterion("transaction_id >=", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdLessThan(String value) {
            addCriterion("transaction_id <", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdLessThanOrEqualTo(String value) {
            addCriterion("transaction_id <=", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdLike(String value) {
            addCriterion("transaction_id like", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotLike(String value) {
            addCriterion("transaction_id not like", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdIn(List<String> values) {
            addCriterion("transaction_id in", values, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotIn(List<String> values) {
            addCriterion("transaction_id not in", values, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdBetween(String value1, String value2) {
            addCriterion("transaction_id between", value1, value2, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotBetween(String value1, String value2) {
            addCriterion("transaction_id not between", value1, value2, "transactionId");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoIsNull() {
            addCriterion("out_trade_no is null");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoIsNotNull() {
            addCriterion("out_trade_no is not null");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoEqualTo(String value) {
            addCriterion("out_trade_no =", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotEqualTo(String value) {
            addCriterion("out_trade_no <>", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoGreaterThan(String value) {
            addCriterion("out_trade_no >", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoGreaterThanOrEqualTo(String value) {
            addCriterion("out_trade_no >=", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoLessThan(String value) {
            addCriterion("out_trade_no <", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoLessThanOrEqualTo(String value) {
            addCriterion("out_trade_no <=", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoLike(String value) {
            addCriterion("out_trade_no like", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotLike(String value) {
            addCriterion("out_trade_no not like", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoIn(List<String> values) {
            addCriterion("out_trade_no in", values, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotIn(List<String> values) {
            addCriterion("out_trade_no not in", values, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoBetween(String value1, String value2) {
            addCriterion("out_trade_no between", value1, value2, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotBetween(String value1, String value2) {
            addCriterion("out_trade_no not between", value1, value2, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNull() {
            addCriterion("order_type is null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNotNull() {
            addCriterion("order_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeEqualTo(Integer value) {
            addCriterion("order_type =", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotEqualTo(Integer value) {
            addCriterion("order_type <>", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThan(Integer value) {
            addCriterion("order_type >", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_type >=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThan(Integer value) {
            addCriterion("order_type <", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThanOrEqualTo(Integer value) {
            addCriterion("order_type <=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIn(List<Integer> values) {
            addCriterion("order_type in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotIn(List<Integer> values) {
            addCriterion("order_type not in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeBetween(Integer value1, Integer value2) {
            addCriterion("order_type between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("order_type not between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(Integer value) {
            addCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(Integer value) {
            addCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(Integer value) {
            addCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(Integer value) {
            addCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(Integer value) {
            addCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<Integer> values) {
            addCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<Integer> values) {
            addCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(Integer value1, Integer value2) {
            addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("order_status not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andTotalFeeIsNull() {
            addCriterion("total_fee is null");
            return (Criteria) this;
        }

        public Criteria andTotalFeeIsNotNull() {
            addCriterion("total_fee is not null");
            return (Criteria) this;
        }

        public Criteria andTotalFeeEqualTo(BigDecimal value) {
            addCriterion("total_fee =", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeNotEqualTo(BigDecimal value) {
            addCriterion("total_fee <>", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeGreaterThan(BigDecimal value) {
            addCriterion("total_fee >", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_fee >=", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeLessThan(BigDecimal value) {
            addCriterion("total_fee <", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_fee <=", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeIn(List<BigDecimal> values) {
            addCriterion("total_fee in", values, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeNotIn(List<BigDecimal> values) {
            addCriterion("total_fee not in", values, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_fee between", value1, value2, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_fee not between", value1, value2, "totalFee");
            return (Criteria) this;
        }

        public Criteria andFeeIsNull() {
            addCriterion("fee is null");
            return (Criteria) this;
        }

        public Criteria andFeeIsNotNull() {
            addCriterion("fee is not null");
            return (Criteria) this;
        }

        public Criteria andFeeEqualTo(BigDecimal value) {
            addCriterion("fee =", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotEqualTo(BigDecimal value) {
            addCriterion("fee <>", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeGreaterThan(BigDecimal value) {
            addCriterion("fee >", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fee >=", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLessThan(BigDecimal value) {
            addCriterion("fee <", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fee <=", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeIn(List<BigDecimal> values) {
            addCriterion("fee in", values, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotIn(List<BigDecimal> values) {
            addCriterion("fee not in", values, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee between", value1, value2, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee not between", value1, value2, "fee");
            return (Criteria) this;
        }

        public Criteria andRateIsNull() {
            addCriterion("rate is null");
            return (Criteria) this;
        }

        public Criteria andRateIsNotNull() {
            addCriterion("rate is not null");
            return (Criteria) this;
        }

        public Criteria andRateEqualTo(BigDecimal value) {
            addCriterion("rate =", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotEqualTo(BigDecimal value) {
            addCriterion("rate <>", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThan(BigDecimal value) {
            addCriterion("rate >", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rate >=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThan(BigDecimal value) {
            addCriterion("rate <", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("rate <=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateIn(List<BigDecimal> values) {
            addCriterion("rate in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotIn(List<BigDecimal> values) {
            addCriterion("rate not in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rate between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rate not between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andPayChannelIsNull() {
            addCriterion("pay_channel is null");
            return (Criteria) this;
        }

        public Criteria andPayChannelIsNotNull() {
            addCriterion("pay_channel is not null");
            return (Criteria) this;
        }

        public Criteria andPayChannelEqualTo(Integer value) {
            addCriterion("pay_channel =", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelNotEqualTo(Integer value) {
            addCriterion("pay_channel <>", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelGreaterThan(Integer value) {
            addCriterion("pay_channel >", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_channel >=", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelLessThan(Integer value) {
            addCriterion("pay_channel <", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelLessThanOrEqualTo(Integer value) {
            addCriterion("pay_channel <=", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelIn(List<Integer> values) {
            addCriterion("pay_channel in", values, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelNotIn(List<Integer> values) {
            addCriterion("pay_channel not in", values, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelBetween(Integer value1, Integer value2) {
            addCriterion("pay_channel between", value1, value2, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_channel not between", value1, value2, "payChannel");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIsNull() {
            addCriterion("check_time is null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIsNotNull() {
            addCriterion("check_time is not null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeEqualTo(Date value) {
            addCriterion("check_time =", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotEqualTo(Date value) {
            addCriterion("check_time <>", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeGreaterThan(Date value) {
            addCriterion("check_time >", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("check_time >=", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLessThan(Date value) {
            addCriterion("check_time <", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLessThanOrEqualTo(Date value) {
            addCriterion("check_time <=", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIn(List<Date> values) {
            addCriterion("check_time in", values, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotIn(List<Date> values) {
            addCriterion("check_time not in", values, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeBetween(Date value1, Date value2) {
            addCriterion("check_time between", value1, value2, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotBetween(Date value1, Date value2) {
            addCriterion("check_time not between", value1, value2, "checkTime");
            return (Criteria) this;
        }

        public Criteria andErrorTypeIsNull() {
            addCriterion("error_type is null");
            return (Criteria) this;
        }

        public Criteria andErrorTypeIsNotNull() {
            addCriterion("error_type is not null");
            return (Criteria) this;
        }

        public Criteria andErrorTypeEqualTo(Integer value) {
            addCriterion("error_type =", value, "errorType");
            return (Criteria) this;
        }

        public Criteria andErrorTypeNotEqualTo(Integer value) {
            addCriterion("error_type <>", value, "errorType");
            return (Criteria) this;
        }

        public Criteria andErrorTypeGreaterThan(Integer value) {
            addCriterion("error_type >", value, "errorType");
            return (Criteria) this;
        }

        public Criteria andErrorTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("error_type >=", value, "errorType");
            return (Criteria) this;
        }

        public Criteria andErrorTypeLessThan(Integer value) {
            addCriterion("error_type <", value, "errorType");
            return (Criteria) this;
        }

        public Criteria andErrorTypeLessThanOrEqualTo(Integer value) {
            addCriterion("error_type <=", value, "errorType");
            return (Criteria) this;
        }

        public Criteria andErrorTypeIn(List<Integer> values) {
            addCriterion("error_type in", values, "errorType");
            return (Criteria) this;
        }

        public Criteria andErrorTypeNotIn(List<Integer> values) {
            addCriterion("error_type not in", values, "errorType");
            return (Criteria) this;
        }

        public Criteria andErrorTypeBetween(Integer value1, Integer value2) {
            addCriterion("error_type between", value1, value2, "errorType");
            return (Criteria) this;
        }

        public Criteria andErrorTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("error_type not between", value1, value2, "errorType");
            return (Criteria) this;
        }

        public Criteria andHandlingMethodIsNull() {
            addCriterion("handling_method is null");
            return (Criteria) this;
        }

        public Criteria andHandlingMethodIsNotNull() {
            addCriterion("handling_method is not null");
            return (Criteria) this;
        }

        public Criteria andHandlingMethodEqualTo(Integer value) {
            addCriterion("handling_method =", value, "handlingMethod");
            return (Criteria) this;
        }

        public Criteria andHandlingMethodNotEqualTo(Integer value) {
            addCriterion("handling_method <>", value, "handlingMethod");
            return (Criteria) this;
        }

        public Criteria andHandlingMethodGreaterThan(Integer value) {
            addCriterion("handling_method >", value, "handlingMethod");
            return (Criteria) this;
        }

        public Criteria andHandlingMethodGreaterThanOrEqualTo(Integer value) {
            addCriterion("handling_method >=", value, "handlingMethod");
            return (Criteria) this;
        }

        public Criteria andHandlingMethodLessThan(Integer value) {
            addCriterion("handling_method <", value, "handlingMethod");
            return (Criteria) this;
        }

        public Criteria andHandlingMethodLessThanOrEqualTo(Integer value) {
            addCriterion("handling_method <=", value, "handlingMethod");
            return (Criteria) this;
        }

        public Criteria andHandlingMethodIn(List<Integer> values) {
            addCriterion("handling_method in", values, "handlingMethod");
            return (Criteria) this;
        }

        public Criteria andHandlingMethodNotIn(List<Integer> values) {
            addCriterion("handling_method not in", values, "handlingMethod");
            return (Criteria) this;
        }

        public Criteria andHandlingMethodBetween(Integer value1, Integer value2) {
            addCriterion("handling_method between", value1, value2, "handlingMethod");
            return (Criteria) this;
        }

        public Criteria andHandlingMethodNotBetween(Integer value1, Integer value2) {
            addCriterion("handling_method not between", value1, value2, "handlingMethod");
            return (Criteria) this;
        }

        public Criteria andSubmitterIsNull() {
            addCriterion("submitter is null");
            return (Criteria) this;
        }

        public Criteria andSubmitterIsNotNull() {
            addCriterion("submitter is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitterEqualTo(String value) {
            addCriterion("submitter =", value, "submitter");
            return (Criteria) this;
        }

        public Criteria andSubmitterNotEqualTo(String value) {
            addCriterion("submitter <>", value, "submitter");
            return (Criteria) this;
        }

        public Criteria andSubmitterGreaterThan(String value) {
            addCriterion("submitter >", value, "submitter");
            return (Criteria) this;
        }

        public Criteria andSubmitterGreaterThanOrEqualTo(String value) {
            addCriterion("submitter >=", value, "submitter");
            return (Criteria) this;
        }

        public Criteria andSubmitterLessThan(String value) {
            addCriterion("submitter <", value, "submitter");
            return (Criteria) this;
        }

        public Criteria andSubmitterLessThanOrEqualTo(String value) {
            addCriterion("submitter <=", value, "submitter");
            return (Criteria) this;
        }

        public Criteria andSubmitterLike(String value) {
            addCriterion("submitter like", value, "submitter");
            return (Criteria) this;
        }

        public Criteria andSubmitterNotLike(String value) {
            addCriterion("submitter not like", value, "submitter");
            return (Criteria) this;
        }

        public Criteria andSubmitterIn(List<String> values) {
            addCriterion("submitter in", values, "submitter");
            return (Criteria) this;
        }

        public Criteria andSubmitterNotIn(List<String> values) {
            addCriterion("submitter not in", values, "submitter");
            return (Criteria) this;
        }

        public Criteria andSubmitterBetween(String value1, String value2) {
            addCriterion("submitter between", value1, value2, "submitter");
            return (Criteria) this;
        }

        public Criteria andSubmitterNotBetween(String value1, String value2) {
            addCriterion("submitter not between", value1, value2, "submitter");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeIsNull() {
            addCriterion("submit_time is null");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeIsNotNull() {
            addCriterion("submit_time is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeEqualTo(Date value) {
            addCriterion("submit_time =", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeNotEqualTo(Date value) {
            addCriterion("submit_time <>", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeGreaterThan(Date value) {
            addCriterion("submit_time >", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("submit_time >=", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeLessThan(Date value) {
            addCriterion("submit_time <", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeLessThanOrEqualTo(Date value) {
            addCriterion("submit_time <=", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeIn(List<Date> values) {
            addCriterion("submit_time in", values, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeNotIn(List<Date> values) {
            addCriterion("submit_time not in", values, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeBetween(Date value1, Date value2) {
            addCriterion("submit_time between", value1, value2, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeNotBetween(Date value1, Date value2) {
            addCriterion("submit_time not between", value1, value2, "submitTime");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusIsNull() {
            addCriterion("approval_status is null");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusIsNotNull() {
            addCriterion("approval_status is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusEqualTo(Integer value) {
            addCriterion("approval_status =", value, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusNotEqualTo(Integer value) {
            addCriterion("approval_status <>", value, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusGreaterThan(Integer value) {
            addCriterion("approval_status >", value, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("approval_status >=", value, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusLessThan(Integer value) {
            addCriterion("approval_status <", value, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusLessThanOrEqualTo(Integer value) {
            addCriterion("approval_status <=", value, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusIn(List<Integer> values) {
            addCriterion("approval_status in", values, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusNotIn(List<Integer> values) {
            addCriterion("approval_status not in", values, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusBetween(Integer value1, Integer value2) {
            addCriterion("approval_status between", value1, value2, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("approval_status not between", value1, value2, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalReasonIsNull() {
            addCriterion("approval_reason is null");
            return (Criteria) this;
        }

        public Criteria andApprovalReasonIsNotNull() {
            addCriterion("approval_reason is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalReasonEqualTo(String value) {
            addCriterion("approval_reason =", value, "approvalReason");
            return (Criteria) this;
        }

        public Criteria andApprovalReasonNotEqualTo(String value) {
            addCriterion("approval_reason <>", value, "approvalReason");
            return (Criteria) this;
        }

        public Criteria andApprovalReasonGreaterThan(String value) {
            addCriterion("approval_reason >", value, "approvalReason");
            return (Criteria) this;
        }

        public Criteria andApprovalReasonGreaterThanOrEqualTo(String value) {
            addCriterion("approval_reason >=", value, "approvalReason");
            return (Criteria) this;
        }

        public Criteria andApprovalReasonLessThan(String value) {
            addCriterion("approval_reason <", value, "approvalReason");
            return (Criteria) this;
        }

        public Criteria andApprovalReasonLessThanOrEqualTo(String value) {
            addCriterion("approval_reason <=", value, "approvalReason");
            return (Criteria) this;
        }

        public Criteria andApprovalReasonLike(String value) {
            addCriterion("approval_reason like", value, "approvalReason");
            return (Criteria) this;
        }

        public Criteria andApprovalReasonNotLike(String value) {
            addCriterion("approval_reason not like", value, "approvalReason");
            return (Criteria) this;
        }

        public Criteria andApprovalReasonIn(List<String> values) {
            addCriterion("approval_reason in", values, "approvalReason");
            return (Criteria) this;
        }

        public Criteria andApprovalReasonNotIn(List<String> values) {
            addCriterion("approval_reason not in", values, "approvalReason");
            return (Criteria) this;
        }

        public Criteria andApprovalReasonBetween(String value1, String value2) {
            addCriterion("approval_reason between", value1, value2, "approvalReason");
            return (Criteria) this;
        }

        public Criteria andApprovalReasonNotBetween(String value1, String value2) {
            addCriterion("approval_reason not between", value1, value2, "approvalReason");
            return (Criteria) this;
        }

        public Criteria andAttachmentIsNull() {
            addCriterion("attachment is null");
            return (Criteria) this;
        }

        public Criteria andAttachmentIsNotNull() {
            addCriterion("attachment is not null");
            return (Criteria) this;
        }

        public Criteria andAttachmentEqualTo(String value) {
            addCriterion("attachment =", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentNotEqualTo(String value) {
            addCriterion("attachment <>", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentGreaterThan(String value) {
            addCriterion("attachment >", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentGreaterThanOrEqualTo(String value) {
            addCriterion("attachment >=", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentLessThan(String value) {
            addCriterion("attachment <", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentLessThanOrEqualTo(String value) {
            addCriterion("attachment <=", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentLike(String value) {
            addCriterion("attachment like", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentNotLike(String value) {
            addCriterion("attachment not like", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentIn(List<String> values) {
            addCriterion("attachment in", values, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentNotIn(List<String> values) {
            addCriterion("attachment not in", values, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentBetween(String value1, String value2) {
            addCriterion("attachment between", value1, value2, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentNotBetween(String value1, String value2) {
            addCriterion("attachment not between", value1, value2, "attachment");
            return (Criteria) this;
        }

        public Criteria andAccountingIdIsNull() {
            addCriterion("accounting_id is null");
            return (Criteria) this;
        }

        public Criteria andAccountingIdIsNotNull() {
            addCriterion("accounting_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccountingIdEqualTo(String value) {
            addCriterion("accounting_id =", value, "accountingId");
            return (Criteria) this;
        }

        public Criteria andAccountingIdNotEqualTo(String value) {
            addCriterion("accounting_id <>", value, "accountingId");
            return (Criteria) this;
        }

        public Criteria andAccountingIdGreaterThan(String value) {
            addCriterion("accounting_id >", value, "accountingId");
            return (Criteria) this;
        }

        public Criteria andAccountingIdGreaterThanOrEqualTo(String value) {
            addCriterion("accounting_id >=", value, "accountingId");
            return (Criteria) this;
        }

        public Criteria andAccountingIdLessThan(String value) {
            addCriterion("accounting_id <", value, "accountingId");
            return (Criteria) this;
        }

        public Criteria andAccountingIdLessThanOrEqualTo(String value) {
            addCriterion("accounting_id <=", value, "accountingId");
            return (Criteria) this;
        }

        public Criteria andAccountingIdLike(String value) {
            addCriterion("accounting_id like", value, "accountingId");
            return (Criteria) this;
        }

        public Criteria andAccountingIdNotLike(String value) {
            addCriterion("accounting_id not like", value, "accountingId");
            return (Criteria) this;
        }

        public Criteria andAccountingIdIn(List<String> values) {
            addCriterion("accounting_id in", values, "accountingId");
            return (Criteria) this;
        }

        public Criteria andAccountingIdNotIn(List<String> values) {
            addCriterion("accounting_id not in", values, "accountingId");
            return (Criteria) this;
        }

        public Criteria andAccountingIdBetween(String value1, String value2) {
            addCriterion("accounting_id between", value1, value2, "accountingId");
            return (Criteria) this;
        }

        public Criteria andAccountingIdNotBetween(String value1, String value2) {
            addCriterion("accounting_id not between", value1, value2, "accountingId");
            return (Criteria) this;
        }

        public Criteria andAccountingTimeIsNull() {
            addCriterion("accounting_time is null");
            return (Criteria) this;
        }

        public Criteria andAccountingTimeIsNotNull() {
            addCriterion("accounting_time is not null");
            return (Criteria) this;
        }

        public Criteria andAccountingTimeEqualTo(Date value) {
            addCriterion("accounting_time =", value, "accountingTime");
            return (Criteria) this;
        }

        public Criteria andAccountingTimeNotEqualTo(Date value) {
            addCriterion("accounting_time <>", value, "accountingTime");
            return (Criteria) this;
        }

        public Criteria andAccountingTimeGreaterThan(Date value) {
            addCriterion("accounting_time >", value, "accountingTime");
            return (Criteria) this;
        }

        public Criteria andAccountingTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("accounting_time >=", value, "accountingTime");
            return (Criteria) this;
        }

        public Criteria andAccountingTimeLessThan(Date value) {
            addCriterion("accounting_time <", value, "accountingTime");
            return (Criteria) this;
        }

        public Criteria andAccountingTimeLessThanOrEqualTo(Date value) {
            addCriterion("accounting_time <=", value, "accountingTime");
            return (Criteria) this;
        }

        public Criteria andAccountingTimeIn(List<Date> values) {
            addCriterion("accounting_time in", values, "accountingTime");
            return (Criteria) this;
        }

        public Criteria andAccountingTimeNotIn(List<Date> values) {
            addCriterion("accounting_time not in", values, "accountingTime");
            return (Criteria) this;
        }

        public Criteria andAccountingTimeBetween(Date value1, Date value2) {
            addCriterion("accounting_time between", value1, value2, "accountingTime");
            return (Criteria) this;
        }

        public Criteria andAccountingTimeNotBetween(Date value1, Date value2) {
            addCriterion("accounting_time not between", value1, value2, "accountingTime");
            return (Criteria) this;
        }

        public Criteria andAccountingResultIsNull() {
            addCriterion("accounting_result is null");
            return (Criteria) this;
        }

        public Criteria andAccountingResultIsNotNull() {
            addCriterion("accounting_result is not null");
            return (Criteria) this;
        }

        public Criteria andAccountingResultEqualTo(String value) {
            addCriterion("accounting_result =", value, "accountingResult");
            return (Criteria) this;
        }

        public Criteria andAccountingResultNotEqualTo(String value) {
            addCriterion("accounting_result <>", value, "accountingResult");
            return (Criteria) this;
        }

        public Criteria andAccountingResultGreaterThan(String value) {
            addCriterion("accounting_result >", value, "accountingResult");
            return (Criteria) this;
        }

        public Criteria andAccountingResultGreaterThanOrEqualTo(String value) {
            addCriterion("accounting_result >=", value, "accountingResult");
            return (Criteria) this;
        }

        public Criteria andAccountingResultLessThan(String value) {
            addCriterion("accounting_result <", value, "accountingResult");
            return (Criteria) this;
        }

        public Criteria andAccountingResultLessThanOrEqualTo(String value) {
            addCriterion("accounting_result <=", value, "accountingResult");
            return (Criteria) this;
        }

        public Criteria andAccountingResultLike(String value) {
            addCriterion("accounting_result like", value, "accountingResult");
            return (Criteria) this;
        }

        public Criteria andAccountingResultNotLike(String value) {
            addCriterion("accounting_result not like", value, "accountingResult");
            return (Criteria) this;
        }

        public Criteria andAccountingResultIn(List<String> values) {
            addCriterion("accounting_result in", values, "accountingResult");
            return (Criteria) this;
        }

        public Criteria andAccountingResultNotIn(List<String> values) {
            addCriterion("accounting_result not in", values, "accountingResult");
            return (Criteria) this;
        }

        public Criteria andAccountingResultBetween(String value1, String value2) {
            addCriterion("accounting_result between", value1, value2, "accountingResult");
            return (Criteria) this;
        }

        public Criteria andAccountingResultNotBetween(String value1, String value2) {
            addCriterion("accounting_result not between", value1, value2, "accountingResult");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}