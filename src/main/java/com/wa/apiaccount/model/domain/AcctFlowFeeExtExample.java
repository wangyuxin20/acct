package com.wd.apiaccount.model.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AcctFlowFeeExtExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AcctFlowFeeExtExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTranCodeIsNull() {
            addCriterion("tran_code is null");
            return (Criteria) this;
        }

        public Criteria andTranCodeIsNotNull() {
            addCriterion("tran_code is not null");
            return (Criteria) this;
        }

        public Criteria andTranCodeEqualTo(String value) {
            addCriterion("tran_code =", value, "tranCode");
            return (Criteria) this;
        }

        public Criteria andTranCodeNotEqualTo(String value) {
            addCriterion("tran_code <>", value, "tranCode");
            return (Criteria) this;
        }

        public Criteria andTranCodeGreaterThan(String value) {
            addCriterion("tran_code >", value, "tranCode");
            return (Criteria) this;
        }

        public Criteria andTranCodeGreaterThanOrEqualTo(String value) {
            addCriterion("tran_code >=", value, "tranCode");
            return (Criteria) this;
        }

        public Criteria andTranCodeLessThan(String value) {
            addCriterion("tran_code <", value, "tranCode");
            return (Criteria) this;
        }

        public Criteria andTranCodeLessThanOrEqualTo(String value) {
            addCriterion("tran_code <=", value, "tranCode");
            return (Criteria) this;
        }

        public Criteria andTranCodeLike(String value) {
            addCriterion("tran_code like", value, "tranCode");
            return (Criteria) this;
        }

        public Criteria andTranCodeNotLike(String value) {
            addCriterion("tran_code not like", value, "tranCode");
            return (Criteria) this;
        }

        public Criteria andTranCodeIn(List<String> values) {
            addCriterion("tran_code in", values, "tranCode");
            return (Criteria) this;
        }

        public Criteria andTranCodeNotIn(List<String> values) {
            addCriterion("tran_code not in", values, "tranCode");
            return (Criteria) this;
        }

        public Criteria andTranCodeBetween(String value1, String value2) {
            addCriterion("tran_code between", value1, value2, "tranCode");
            return (Criteria) this;
        }

        public Criteria andTranCodeNotBetween(String value1, String value2) {
            addCriterion("tran_code not between", value1, value2, "tranCode");
            return (Criteria) this;
        }

        public Criteria andExcodeIsNull() {
            addCriterion("excode is null");
            return (Criteria) this;
        }

        public Criteria andExcodeIsNotNull() {
            addCriterion("excode is not null");
            return (Criteria) this;
        }

        public Criteria andExcodeEqualTo(String value) {
            addCriterion("excode =", value, "excode");
            return (Criteria) this;
        }

        public Criteria andExcodeNotEqualTo(String value) {
            addCriterion("excode <>", value, "excode");
            return (Criteria) this;
        }

        public Criteria andExcodeGreaterThan(String value) {
            addCriterion("excode >", value, "excode");
            return (Criteria) this;
        }

        public Criteria andExcodeGreaterThanOrEqualTo(String value) {
            addCriterion("excode >=", value, "excode");
            return (Criteria) this;
        }

        public Criteria andExcodeLessThan(String value) {
            addCriterion("excode <", value, "excode");
            return (Criteria) this;
        }

        public Criteria andExcodeLessThanOrEqualTo(String value) {
            addCriterion("excode <=", value, "excode");
            return (Criteria) this;
        }

        public Criteria andExcodeLike(String value) {
            addCriterion("excode like", value, "excode");
            return (Criteria) this;
        }

        public Criteria andExcodeNotLike(String value) {
            addCriterion("excode not like", value, "excode");
            return (Criteria) this;
        }

        public Criteria andExcodeIn(List<String> values) {
            addCriterion("excode in", values, "excode");
            return (Criteria) this;
        }

        public Criteria andExcodeNotIn(List<String> values) {
            addCriterion("excode not in", values, "excode");
            return (Criteria) this;
        }

        public Criteria andExcodeBetween(String value1, String value2) {
            addCriterion("excode between", value1, value2, "excode");
            return (Criteria) this;
        }

        public Criteria andExcodeNotBetween(String value1, String value2) {
            addCriterion("excode not between", value1, value2, "excode");
            return (Criteria) this;
        }

        public Criteria andExnameIsNull() {
            addCriterion("exname is null");
            return (Criteria) this;
        }

        public Criteria andExnameIsNotNull() {
            addCriterion("exname is not null");
            return (Criteria) this;
        }

        public Criteria andExnameEqualTo(String value) {
            addCriterion("exname =", value, "exname");
            return (Criteria) this;
        }

        public Criteria andExnameNotEqualTo(String value) {
            addCriterion("exname <>", value, "exname");
            return (Criteria) this;
        }

        public Criteria andExnameGreaterThan(String value) {
            addCriterion("exname >", value, "exname");
            return (Criteria) this;
        }

        public Criteria andExnameGreaterThanOrEqualTo(String value) {
            addCriterion("exname >=", value, "exname");
            return (Criteria) this;
        }

        public Criteria andExnameLessThan(String value) {
            addCriterion("exname <", value, "exname");
            return (Criteria) this;
        }

        public Criteria andExnameLessThanOrEqualTo(String value) {
            addCriterion("exname <=", value, "exname");
            return (Criteria) this;
        }

        public Criteria andExnameLike(String value) {
            addCriterion("exname like", value, "exname");
            return (Criteria) this;
        }

        public Criteria andExnameNotLike(String value) {
            addCriterion("exname not like", value, "exname");
            return (Criteria) this;
        }

        public Criteria andExnameIn(List<String> values) {
            addCriterion("exname in", values, "exname");
            return (Criteria) this;
        }

        public Criteria andExnameNotIn(List<String> values) {
            addCriterion("exname not in", values, "exname");
            return (Criteria) this;
        }

        public Criteria andExnameBetween(String value1, String value2) {
            addCriterion("exname between", value1, value2, "exname");
            return (Criteria) this;
        }

        public Criteria andExnameNotBetween(String value1, String value2) {
            addCriterion("exname not between", value1, value2, "exname");
            return (Criteria) this;
        }

        public Criteria andTranAmtIsNull() {
            addCriterion("tran_amt is null");
            return (Criteria) this;
        }

        public Criteria andTranAmtIsNotNull() {
            addCriterion("tran_amt is not null");
            return (Criteria) this;
        }

        public Criteria andTranAmtEqualTo(BigDecimal value) {
            addCriterion("tran_amt =", value, "tranAmt");
            return (Criteria) this;
        }

        public Criteria andTranAmtNotEqualTo(BigDecimal value) {
            addCriterion("tran_amt <>", value, "tranAmt");
            return (Criteria) this;
        }

        public Criteria andTranAmtGreaterThan(BigDecimal value) {
            addCriterion("tran_amt >", value, "tranAmt");
            return (Criteria) this;
        }

        public Criteria andTranAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tran_amt >=", value, "tranAmt");
            return (Criteria) this;
        }

        public Criteria andTranAmtLessThan(BigDecimal value) {
            addCriterion("tran_amt <", value, "tranAmt");
            return (Criteria) this;
        }

        public Criteria andTranAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tran_amt <=", value, "tranAmt");
            return (Criteria) this;
        }

        public Criteria andTranAmtIn(List<BigDecimal> values) {
            addCriterion("tran_amt in", values, "tranAmt");
            return (Criteria) this;
        }

        public Criteria andTranAmtNotIn(List<BigDecimal> values) {
            addCriterion("tran_amt not in", values, "tranAmt");
            return (Criteria) this;
        }

        public Criteria andTranAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tran_amt between", value1, value2, "tranAmt");
            return (Criteria) this;
        }

        public Criteria andTranAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tran_amt not between", value1, value2, "tranAmt");
            return (Criteria) this;
        }

        public Criteria andDctAmtIsNull() {
            addCriterion("dct_amt is null");
            return (Criteria) this;
        }

        public Criteria andDctAmtIsNotNull() {
            addCriterion("dct_amt is not null");
            return (Criteria) this;
        }

        public Criteria andDctAmtEqualTo(BigDecimal value) {
            addCriterion("dct_amt =", value, "dctAmt");
            return (Criteria) this;
        }

        public Criteria andDctAmtNotEqualTo(BigDecimal value) {
            addCriterion("dct_amt <>", value, "dctAmt");
            return (Criteria) this;
        }

        public Criteria andDctAmtGreaterThan(BigDecimal value) {
            addCriterion("dct_amt >", value, "dctAmt");
            return (Criteria) this;
        }

        public Criteria andDctAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dct_amt >=", value, "dctAmt");
            return (Criteria) this;
        }

        public Criteria andDctAmtLessThan(BigDecimal value) {
            addCriterion("dct_amt <", value, "dctAmt");
            return (Criteria) this;
        }

        public Criteria andDctAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dct_amt <=", value, "dctAmt");
            return (Criteria) this;
        }

        public Criteria andDctAmtIn(List<BigDecimal> values) {
            addCriterion("dct_amt in", values, "dctAmt");
            return (Criteria) this;
        }

        public Criteria andDctAmtNotIn(List<BigDecimal> values) {
            addCriterion("dct_amt not in", values, "dctAmt");
            return (Criteria) this;
        }

        public Criteria andDctAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dct_amt between", value1, value2, "dctAmt");
            return (Criteria) this;
        }

        public Criteria andDctAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dct_amt not between", value1, value2, "dctAmt");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(BigDecimal value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(BigDecimal value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(BigDecimal value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(BigDecimal value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<BigDecimal> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<BigDecimal> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("num not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andSettleAmtIsNull() {
            addCriterion("settle_amt is null");
            return (Criteria) this;
        }

        public Criteria andSettleAmtIsNotNull() {
            addCriterion("settle_amt is not null");
            return (Criteria) this;
        }

        public Criteria andSettleAmtEqualTo(BigDecimal value) {
            addCriterion("settle_amt =", value, "settleAmt");
            return (Criteria) this;
        }

        public Criteria andSettleAmtNotEqualTo(BigDecimal value) {
            addCriterion("settle_amt <>", value, "settleAmt");
            return (Criteria) this;
        }

        public Criteria andSettleAmtGreaterThan(BigDecimal value) {
            addCriterion("settle_amt >", value, "settleAmt");
            return (Criteria) this;
        }

        public Criteria andSettleAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("settle_amt >=", value, "settleAmt");
            return (Criteria) this;
        }

        public Criteria andSettleAmtLessThan(BigDecimal value) {
            addCriterion("settle_amt <", value, "settleAmt");
            return (Criteria) this;
        }

        public Criteria andSettleAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("settle_amt <=", value, "settleAmt");
            return (Criteria) this;
        }

        public Criteria andSettleAmtIn(List<BigDecimal> values) {
            addCriterion("settle_amt in", values, "settleAmt");
            return (Criteria) this;
        }

        public Criteria andSettleAmtNotIn(List<BigDecimal> values) {
            addCriterion("settle_amt not in", values, "settleAmt");
            return (Criteria) this;
        }

        public Criteria andSettleAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("settle_amt between", value1, value2, "settleAmt");
            return (Criteria) this;
        }

        public Criteria andSettleAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("settle_amt not between", value1, value2, "settleAmt");
            return (Criteria) this;
        }

        public Criteria andFeeAmtIsNull() {
            addCriterion("fee_amt is null");
            return (Criteria) this;
        }

        public Criteria andFeeAmtIsNotNull() {
            addCriterion("fee_amt is not null");
            return (Criteria) this;
        }

        public Criteria andFeeAmtEqualTo(BigDecimal value) {
            addCriterion("fee_amt =", value, "feeAmt");
            return (Criteria) this;
        }

        public Criteria andFeeAmtNotEqualTo(BigDecimal value) {
            addCriterion("fee_amt <>", value, "feeAmt");
            return (Criteria) this;
        }

        public Criteria andFeeAmtGreaterThan(BigDecimal value) {
            addCriterion("fee_amt >", value, "feeAmt");
            return (Criteria) this;
        }

        public Criteria andFeeAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fee_amt >=", value, "feeAmt");
            return (Criteria) this;
        }

        public Criteria andFeeAmtLessThan(BigDecimal value) {
            addCriterion("fee_amt <", value, "feeAmt");
            return (Criteria) this;
        }

        public Criteria andFeeAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fee_amt <=", value, "feeAmt");
            return (Criteria) this;
        }

        public Criteria andFeeAmtIn(List<BigDecimal> values) {
            addCriterion("fee_amt in", values, "feeAmt");
            return (Criteria) this;
        }

        public Criteria andFeeAmtNotIn(List<BigDecimal> values) {
            addCriterion("fee_amt not in", values, "feeAmt");
            return (Criteria) this;
        }

        public Criteria andFeeAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee_amt between", value1, value2, "feeAmt");
            return (Criteria) this;
        }

        public Criteria andFeeAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee_amt not between", value1, value2, "feeAmt");
            return (Criteria) this;
        }

        public Criteria andFeeTypeIsNull() {
            addCriterion("fee_type is null");
            return (Criteria) this;
        }

        public Criteria andFeeTypeIsNotNull() {
            addCriterion("fee_type is not null");
            return (Criteria) this;
        }

        public Criteria andFeeTypeEqualTo(String value) {
            addCriterion("fee_type =", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeNotEqualTo(String value) {
            addCriterion("fee_type <>", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeGreaterThan(String value) {
            addCriterion("fee_type >", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("fee_type >=", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeLessThan(String value) {
            addCriterion("fee_type <", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeLessThanOrEqualTo(String value) {
            addCriterion("fee_type <=", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeLike(String value) {
            addCriterion("fee_type like", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeNotLike(String value) {
            addCriterion("fee_type not like", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeIn(List<String> values) {
            addCriterion("fee_type in", values, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeNotIn(List<String> values) {
            addCriterion("fee_type not in", values, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeBetween(String value1, String value2) {
            addCriterion("fee_type between", value1, value2, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeNotBetween(String value1, String value2) {
            addCriterion("fee_type not between", value1, value2, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeValueIsNull() {
            addCriterion("fee_value is null");
            return (Criteria) this;
        }

        public Criteria andFeeValueIsNotNull() {
            addCriterion("fee_value is not null");
            return (Criteria) this;
        }

        public Criteria andFeeValueEqualTo(BigDecimal value) {
            addCriterion("fee_value =", value, "feeValue");
            return (Criteria) this;
        }

        public Criteria andFeeValueNotEqualTo(BigDecimal value) {
            addCriterion("fee_value <>", value, "feeValue");
            return (Criteria) this;
        }

        public Criteria andFeeValueGreaterThan(BigDecimal value) {
            addCriterion("fee_value >", value, "feeValue");
            return (Criteria) this;
        }

        public Criteria andFeeValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fee_value >=", value, "feeValue");
            return (Criteria) this;
        }

        public Criteria andFeeValueLessThan(BigDecimal value) {
            addCriterion("fee_value <", value, "feeValue");
            return (Criteria) this;
        }

        public Criteria andFeeValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fee_value <=", value, "feeValue");
            return (Criteria) this;
        }

        public Criteria andFeeValueIn(List<BigDecimal> values) {
            addCriterion("fee_value in", values, "feeValue");
            return (Criteria) this;
        }

        public Criteria andFeeValueNotIn(List<BigDecimal> values) {
            addCriterion("fee_value not in", values, "feeValue");
            return (Criteria) this;
        }

        public Criteria andFeeValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee_value between", value1, value2, "feeValue");
            return (Criteria) this;
        }

        public Criteria andFeeValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee_value not between", value1, value2, "feeValue");
            return (Criteria) this;
        }

        public Criteria andUserNoIsNull() {
            addCriterion("user_no is null");
            return (Criteria) this;
        }

        public Criteria andUserNoIsNotNull() {
            addCriterion("user_no is not null");
            return (Criteria) this;
        }

        public Criteria andUserNoEqualTo(String value) {
            addCriterion("user_no =", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotEqualTo(String value) {
            addCriterion("user_no <>", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoGreaterThan(String value) {
            addCriterion("user_no >", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoGreaterThanOrEqualTo(String value) {
            addCriterion("user_no >=", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoLessThan(String value) {
            addCriterion("user_no <", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoLessThanOrEqualTo(String value) {
            addCriterion("user_no <=", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoLike(String value) {
            addCriterion("user_no like", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotLike(String value) {
            addCriterion("user_no not like", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoIn(List<String> values) {
            addCriterion("user_no in", values, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotIn(List<String> values) {
            addCriterion("user_no not in", values, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoBetween(String value1, String value2) {
            addCriterion("user_no between", value1, value2, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotBetween(String value1, String value2) {
            addCriterion("user_no not between", value1, value2, "userNo");
            return (Criteria) this;
        }

        public Criteria andMerNoIsNull() {
            addCriterion("mer_no is null");
            return (Criteria) this;
        }

        public Criteria andMerNoIsNotNull() {
            addCriterion("mer_no is not null");
            return (Criteria) this;
        }

        public Criteria andMerNoEqualTo(String value) {
            addCriterion("mer_no =", value, "merNo");
            return (Criteria) this;
        }

        public Criteria andMerNoNotEqualTo(String value) {
            addCriterion("mer_no <>", value, "merNo");
            return (Criteria) this;
        }

        public Criteria andMerNoGreaterThan(String value) {
            addCriterion("mer_no >", value, "merNo");
            return (Criteria) this;
        }

        public Criteria andMerNoGreaterThanOrEqualTo(String value) {
            addCriterion("mer_no >=", value, "merNo");
            return (Criteria) this;
        }

        public Criteria andMerNoLessThan(String value) {
            addCriterion("mer_no <", value, "merNo");
            return (Criteria) this;
        }

        public Criteria andMerNoLessThanOrEqualTo(String value) {
            addCriterion("mer_no <=", value, "merNo");
            return (Criteria) this;
        }

        public Criteria andMerNoLike(String value) {
            addCriterion("mer_no like", value, "merNo");
            return (Criteria) this;
        }

        public Criteria andMerNoNotLike(String value) {
            addCriterion("mer_no not like", value, "merNo");
            return (Criteria) this;
        }

        public Criteria andMerNoIn(List<String> values) {
            addCriterion("mer_no in", values, "merNo");
            return (Criteria) this;
        }

        public Criteria andMerNoNotIn(List<String> values) {
            addCriterion("mer_no not in", values, "merNo");
            return (Criteria) this;
        }

        public Criteria andMerNoBetween(String value1, String value2) {
            addCriterion("mer_no between", value1, value2, "merNo");
            return (Criteria) this;
        }

        public Criteria andMerNoNotBetween(String value1, String value2) {
            addCriterion("mer_no not between", value1, value2, "merNo");
            return (Criteria) this;
        }

        public Criteria andMerNameIsNull() {
            addCriterion("mer_name is null");
            return (Criteria) this;
        }

        public Criteria andMerNameIsNotNull() {
            addCriterion("mer_name is not null");
            return (Criteria) this;
        }

        public Criteria andMerNameEqualTo(String value) {
            addCriterion("mer_name =", value, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameNotEqualTo(String value) {
            addCriterion("mer_name <>", value, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameGreaterThan(String value) {
            addCriterion("mer_name >", value, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameGreaterThanOrEqualTo(String value) {
            addCriterion("mer_name >=", value, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameLessThan(String value) {
            addCriterion("mer_name <", value, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameLessThanOrEqualTo(String value) {
            addCriterion("mer_name <=", value, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameLike(String value) {
            addCriterion("mer_name like", value, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameNotLike(String value) {
            addCriterion("mer_name not like", value, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameIn(List<String> values) {
            addCriterion("mer_name in", values, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameNotIn(List<String> values) {
            addCriterion("mer_name not in", values, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameBetween(String value1, String value2) {
            addCriterion("mer_name between", value1, value2, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameNotBetween(String value1, String value2) {
            addCriterion("mer_name not between", value1, value2, "merName");
            return (Criteria) this;
        }

        public Criteria andLastDateIsNull() {
            addCriterion("last_date is null");
            return (Criteria) this;
        }

        public Criteria andLastDateIsNotNull() {
            addCriterion("last_date is not null");
            return (Criteria) this;
        }

        public Criteria andLastDateEqualTo(String value) {
            addCriterion("last_date =", value, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateNotEqualTo(String value) {
            addCriterion("last_date <>", value, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateGreaterThan(String value) {
            addCriterion("last_date >", value, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateGreaterThanOrEqualTo(String value) {
            addCriterion("last_date >=", value, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateLessThan(String value) {
            addCriterion("last_date <", value, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateLessThanOrEqualTo(String value) {
            addCriterion("last_date <=", value, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateLike(String value) {
            addCriterion("last_date like", value, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateNotLike(String value) {
            addCriterion("last_date not like", value, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateIn(List<String> values) {
            addCriterion("last_date in", values, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateNotIn(List<String> values) {
            addCriterion("last_date not in", values, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateBetween(String value1, String value2) {
            addCriterion("last_date between", value1, value2, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateNotBetween(String value1, String value2) {
            addCriterion("last_date not between", value1, value2, "lastDate");
            return (Criteria) this;
        }

        public Criteria andBillIdIsNull() {
            addCriterion("bill_id is null");
            return (Criteria) this;
        }

        public Criteria andBillIdIsNotNull() {
            addCriterion("bill_id is not null");
            return (Criteria) this;
        }

        public Criteria andBillIdEqualTo(Long value) {
            addCriterion("bill_id =", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdNotEqualTo(Long value) {
            addCriterion("bill_id <>", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdGreaterThan(Long value) {
            addCriterion("bill_id >", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdGreaterThanOrEqualTo(Long value) {
            addCriterion("bill_id >=", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdLessThan(Long value) {
            addCriterion("bill_id <", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdLessThanOrEqualTo(Long value) {
            addCriterion("bill_id <=", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdIn(List<Long> values) {
            addCriterion("bill_id in", values, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdNotIn(List<Long> values) {
            addCriterion("bill_id not in", values, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdBetween(Long value1, Long value2) {
            addCriterion("bill_id between", value1, value2, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdNotBetween(Long value1, Long value2) {
            addCriterion("bill_id not between", value1, value2, "billId");
            return (Criteria) this;
        }

        public Criteria andIdLikeInsensitive(String value) {
            addCriterion("upper(id) like", value.toUpperCase(), "id");
            return (Criteria) this;
        }

        public Criteria andTranCodeLikeInsensitive(String value) {
            addCriterion("upper(tran_code) like", value.toUpperCase(), "tranCode");
            return (Criteria) this;
        }

        public Criteria andExcodeLikeInsensitive(String value) {
            addCriterion("upper(excode) like", value.toUpperCase(), "excode");
            return (Criteria) this;
        }

        public Criteria andExnameLikeInsensitive(String value) {
            addCriterion("upper(exname) like", value.toUpperCase(), "exname");
            return (Criteria) this;
        }

        public Criteria andFeeTypeLikeInsensitive(String value) {
            addCriterion("upper(fee_type) like", value.toUpperCase(), "feeType");
            return (Criteria) this;
        }

        public Criteria andUserNoLikeInsensitive(String value) {
            addCriterion("upper(user_no) like", value.toUpperCase(), "userNo");
            return (Criteria) this;
        }

        public Criteria andMerNoLikeInsensitive(String value) {
            addCriterion("upper(mer_no) like", value.toUpperCase(), "merNo");
            return (Criteria) this;
        }

        public Criteria andMerNameLikeInsensitive(String value) {
            addCriterion("upper(mer_name) like", value.toUpperCase(), "merName");
            return (Criteria) this;
        }

        public Criteria andLastDateLikeInsensitive(String value) {
            addCriterion("upper(last_date) like", value.toUpperCase(), "lastDate");
            return (Criteria) this;
        }
    }

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