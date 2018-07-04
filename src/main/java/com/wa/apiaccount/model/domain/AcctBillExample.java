package com.wd.apiaccount.model.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AcctBillExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AcctBillExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDayendIdIsNull() {
            addCriterion("dayend_id is null");
            return (Criteria) this;
        }

        public Criteria andDayendIdIsNotNull() {
            addCriterion("dayend_id is not null");
            return (Criteria) this;
        }

        public Criteria andDayendIdEqualTo(Long value) {
            addCriterion("dayend_id =", value, "dayendId");
            return (Criteria) this;
        }

        public Criteria andDayendIdNotEqualTo(Long value) {
            addCriterion("dayend_id <>", value, "dayendId");
            return (Criteria) this;
        }

        public Criteria andDayendIdGreaterThan(Long value) {
            addCriterion("dayend_id >", value, "dayendId");
            return (Criteria) this;
        }

        public Criteria andDayendIdGreaterThanOrEqualTo(Long value) {
            addCriterion("dayend_id >=", value, "dayendId");
            return (Criteria) this;
        }

        public Criteria andDayendIdLessThan(Long value) {
            addCriterion("dayend_id <", value, "dayendId");
            return (Criteria) this;
        }

        public Criteria andDayendIdLessThanOrEqualTo(Long value) {
            addCriterion("dayend_id <=", value, "dayendId");
            return (Criteria) this;
        }

        public Criteria andDayendIdIn(List<Long> values) {
            addCriterion("dayend_id in", values, "dayendId");
            return (Criteria) this;
        }

        public Criteria andDayendIdNotIn(List<Long> values) {
            addCriterion("dayend_id not in", values, "dayendId");
            return (Criteria) this;
        }

        public Criteria andDayendIdBetween(Long value1, Long value2) {
            addCriterion("dayend_id between", value1, value2, "dayendId");
            return (Criteria) this;
        }

        public Criteria andDayendIdNotBetween(Long value1, Long value2) {
            addCriterion("dayend_id not between", value1, value2, "dayendId");
            return (Criteria) this;
        }

        public Criteria andDayendCodeIsNull() {
            addCriterion("dayend_code is null");
            return (Criteria) this;
        }

        public Criteria andDayendCodeIsNotNull() {
            addCriterion("dayend_code is not null");
            return (Criteria) this;
        }

        public Criteria andDayendCodeEqualTo(String value) {
            addCriterion("dayend_code =", value, "dayendCode");
            return (Criteria) this;
        }

        public Criteria andDayendCodeNotEqualTo(String value) {
            addCriterion("dayend_code <>", value, "dayendCode");
            return (Criteria) this;
        }

        public Criteria andDayendCodeGreaterThan(String value) {
            addCriterion("dayend_code >", value, "dayendCode");
            return (Criteria) this;
        }

        public Criteria andDayendCodeGreaterThanOrEqualTo(String value) {
            addCriterion("dayend_code >=", value, "dayendCode");
            return (Criteria) this;
        }

        public Criteria andDayendCodeLessThan(String value) {
            addCriterion("dayend_code <", value, "dayendCode");
            return (Criteria) this;
        }

        public Criteria andDayendCodeLessThanOrEqualTo(String value) {
            addCriterion("dayend_code <=", value, "dayendCode");
            return (Criteria) this;
        }

        public Criteria andDayendCodeLike(String value) {
            addCriterion("dayend_code like", value, "dayendCode");
            return (Criteria) this;
        }

        public Criteria andDayendCodeNotLike(String value) {
            addCriterion("dayend_code not like", value, "dayendCode");
            return (Criteria) this;
        }

        public Criteria andDayendCodeIn(List<String> values) {
            addCriterion("dayend_code in", values, "dayendCode");
            return (Criteria) this;
        }

        public Criteria andDayendCodeNotIn(List<String> values) {
            addCriterion("dayend_code not in", values, "dayendCode");
            return (Criteria) this;
        }

        public Criteria andDayendCodeBetween(String value1, String value2) {
            addCriterion("dayend_code between", value1, value2, "dayendCode");
            return (Criteria) this;
        }

        public Criteria andDayendCodeNotBetween(String value1, String value2) {
            addCriterion("dayend_code not between", value1, value2, "dayendCode");
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

        public Criteria andRpTypeIsNull() {
            addCriterion("rp_type is null");
            return (Criteria) this;
        }

        public Criteria andRpTypeIsNotNull() {
            addCriterion("rp_type is not null");
            return (Criteria) this;
        }

        public Criteria andRpTypeEqualTo(String value) {
            addCriterion("rp_type =", value, "rpType");
            return (Criteria) this;
        }

        public Criteria andRpTypeNotEqualTo(String value) {
            addCriterion("rp_type <>", value, "rpType");
            return (Criteria) this;
        }

        public Criteria andRpTypeGreaterThan(String value) {
            addCriterion("rp_type >", value, "rpType");
            return (Criteria) this;
        }

        public Criteria andRpTypeGreaterThanOrEqualTo(String value) {
            addCriterion("rp_type >=", value, "rpType");
            return (Criteria) this;
        }

        public Criteria andRpTypeLessThan(String value) {
            addCriterion("rp_type <", value, "rpType");
            return (Criteria) this;
        }

        public Criteria andRpTypeLessThanOrEqualTo(String value) {
            addCriterion("rp_type <=", value, "rpType");
            return (Criteria) this;
        }

        public Criteria andRpTypeLike(String value) {
            addCriterion("rp_type like", value, "rpType");
            return (Criteria) this;
        }

        public Criteria andRpTypeNotLike(String value) {
            addCriterion("rp_type not like", value, "rpType");
            return (Criteria) this;
        }

        public Criteria andRpTypeIn(List<String> values) {
            addCriterion("rp_type in", values, "rpType");
            return (Criteria) this;
        }

        public Criteria andRpTypeNotIn(List<String> values) {
            addCriterion("rp_type not in", values, "rpType");
            return (Criteria) this;
        }

        public Criteria andRpTypeBetween(String value1, String value2) {
            addCriterion("rp_type between", value1, value2, "rpType");
            return (Criteria) this;
        }

        public Criteria andRpTypeNotBetween(String value1, String value2) {
            addCriterion("rp_type not between", value1, value2, "rpType");
            return (Criteria) this;
        }

        public Criteria andMerIdIsNull() {
            addCriterion("mer_id is null");
            return (Criteria) this;
        }

        public Criteria andMerIdIsNotNull() {
            addCriterion("mer_id is not null");
            return (Criteria) this;
        }

        public Criteria andMerIdEqualTo(String value) {
            addCriterion("mer_id =", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdNotEqualTo(String value) {
            addCriterion("mer_id <>", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdGreaterThan(String value) {
            addCriterion("mer_id >", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdGreaterThanOrEqualTo(String value) {
            addCriterion("mer_id >=", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdLessThan(String value) {
            addCriterion("mer_id <", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdLessThanOrEqualTo(String value) {
            addCriterion("mer_id <=", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdLike(String value) {
            addCriterion("mer_id like", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdNotLike(String value) {
            addCriterion("mer_id not like", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdIn(List<String> values) {
            addCriterion("mer_id in", values, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdNotIn(List<String> values) {
            addCriterion("mer_id not in", values, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdBetween(String value1, String value2) {
            addCriterion("mer_id between", value1, value2, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdNotBetween(String value1, String value2) {
            addCriterion("mer_id not between", value1, value2, "merId");
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

        public Criteria andExCodeIsNull() {
            addCriterion("ex_code is null");
            return (Criteria) this;
        }

        public Criteria andExCodeIsNotNull() {
            addCriterion("ex_code is not null");
            return (Criteria) this;
        }

        public Criteria andExCodeEqualTo(String value) {
            addCriterion("ex_code =", value, "exCode");
            return (Criteria) this;
        }

        public Criteria andExCodeNotEqualTo(String value) {
            addCriterion("ex_code <>", value, "exCode");
            return (Criteria) this;
        }

        public Criteria andExCodeGreaterThan(String value) {
            addCriterion("ex_code >", value, "exCode");
            return (Criteria) this;
        }

        public Criteria andExCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ex_code >=", value, "exCode");
            return (Criteria) this;
        }

        public Criteria andExCodeLessThan(String value) {
            addCriterion("ex_code <", value, "exCode");
            return (Criteria) this;
        }

        public Criteria andExCodeLessThanOrEqualTo(String value) {
            addCriterion("ex_code <=", value, "exCode");
            return (Criteria) this;
        }

        public Criteria andExCodeLike(String value) {
            addCriterion("ex_code like", value, "exCode");
            return (Criteria) this;
        }

        public Criteria andExCodeNotLike(String value) {
            addCriterion("ex_code not like", value, "exCode");
            return (Criteria) this;
        }

        public Criteria andExCodeIn(List<String> values) {
            addCriterion("ex_code in", values, "exCode");
            return (Criteria) this;
        }

        public Criteria andExCodeNotIn(List<String> values) {
            addCriterion("ex_code not in", values, "exCode");
            return (Criteria) this;
        }

        public Criteria andExCodeBetween(String value1, String value2) {
            addCriterion("ex_code between", value1, value2, "exCode");
            return (Criteria) this;
        }

        public Criteria andExCodeNotBetween(String value1, String value2) {
            addCriterion("ex_code not between", value1, value2, "exCode");
            return (Criteria) this;
        }

        public Criteria andExNameIsNull() {
            addCriterion("ex_name is null");
            return (Criteria) this;
        }

        public Criteria andExNameIsNotNull() {
            addCriterion("ex_name is not null");
            return (Criteria) this;
        }

        public Criteria andExNameEqualTo(String value) {
            addCriterion("ex_name =", value, "exName");
            return (Criteria) this;
        }

        public Criteria andExNameNotEqualTo(String value) {
            addCriterion("ex_name <>", value, "exName");
            return (Criteria) this;
        }

        public Criteria andExNameGreaterThan(String value) {
            addCriterion("ex_name >", value, "exName");
            return (Criteria) this;
        }

        public Criteria andExNameGreaterThanOrEqualTo(String value) {
            addCriterion("ex_name >=", value, "exName");
            return (Criteria) this;
        }

        public Criteria andExNameLessThan(String value) {
            addCriterion("ex_name <", value, "exName");
            return (Criteria) this;
        }

        public Criteria andExNameLessThanOrEqualTo(String value) {
            addCriterion("ex_name <=", value, "exName");
            return (Criteria) this;
        }

        public Criteria andExNameLike(String value) {
            addCriterion("ex_name like", value, "exName");
            return (Criteria) this;
        }

        public Criteria andExNameNotLike(String value) {
            addCriterion("ex_name not like", value, "exName");
            return (Criteria) this;
        }

        public Criteria andExNameIn(List<String> values) {
            addCriterion("ex_name in", values, "exName");
            return (Criteria) this;
        }

        public Criteria andExNameNotIn(List<String> values) {
            addCriterion("ex_name not in", values, "exName");
            return (Criteria) this;
        }

        public Criteria andExNameBetween(String value1, String value2) {
            addCriterion("ex_name between", value1, value2, "exName");
            return (Criteria) this;
        }

        public Criteria andExNameNotBetween(String value1, String value2) {
            addCriterion("ex_name not between", value1, value2, "exName");
            return (Criteria) this;
        }

        public Criteria andExTypeIsNull() {
            addCriterion("ex_type is null");
            return (Criteria) this;
        }

        public Criteria andExTypeIsNotNull() {
            addCriterion("ex_type is not null");
            return (Criteria) this;
        }

        public Criteria andExTypeEqualTo(String value) {
            addCriterion("ex_type =", value, "exType");
            return (Criteria) this;
        }

        public Criteria andExTypeNotEqualTo(String value) {
            addCriterion("ex_type <>", value, "exType");
            return (Criteria) this;
        }

        public Criteria andExTypeGreaterThan(String value) {
            addCriterion("ex_type >", value, "exType");
            return (Criteria) this;
        }

        public Criteria andExTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ex_type >=", value, "exType");
            return (Criteria) this;
        }

        public Criteria andExTypeLessThan(String value) {
            addCriterion("ex_type <", value, "exType");
            return (Criteria) this;
        }

        public Criteria andExTypeLessThanOrEqualTo(String value) {
            addCriterion("ex_type <=", value, "exType");
            return (Criteria) this;
        }

        public Criteria andExTypeLike(String value) {
            addCriterion("ex_type like", value, "exType");
            return (Criteria) this;
        }

        public Criteria andExTypeNotLike(String value) {
            addCriterion("ex_type not like", value, "exType");
            return (Criteria) this;
        }

        public Criteria andExTypeIn(List<String> values) {
            addCriterion("ex_type in", values, "exType");
            return (Criteria) this;
        }

        public Criteria andExTypeNotIn(List<String> values) {
            addCriterion("ex_type not in", values, "exType");
            return (Criteria) this;
        }

        public Criteria andExTypeBetween(String value1, String value2) {
            addCriterion("ex_type between", value1, value2, "exType");
            return (Criteria) this;
        }

        public Criteria andExTypeNotBetween(String value1, String value2) {
            addCriterion("ex_type not between", value1, value2, "exType");
            return (Criteria) this;
        }

        public Criteria andSettleGoodsNumIsNull() {
            addCriterion("settle_goods_num is null");
            return (Criteria) this;
        }

        public Criteria andSettleGoodsNumIsNotNull() {
            addCriterion("settle_goods_num is not null");
            return (Criteria) this;
        }

        public Criteria andSettleGoodsNumEqualTo(BigDecimal value) {
            addCriterion("settle_goods_num =", value, "settleGoodsNum");
            return (Criteria) this;
        }

        public Criteria andSettleGoodsNumNotEqualTo(BigDecimal value) {
            addCriterion("settle_goods_num <>", value, "settleGoodsNum");
            return (Criteria) this;
        }

        public Criteria andSettleGoodsNumGreaterThan(BigDecimal value) {
            addCriterion("settle_goods_num >", value, "settleGoodsNum");
            return (Criteria) this;
        }

        public Criteria andSettleGoodsNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("settle_goods_num >=", value, "settleGoodsNum");
            return (Criteria) this;
        }

        public Criteria andSettleGoodsNumLessThan(BigDecimal value) {
            addCriterion("settle_goods_num <", value, "settleGoodsNum");
            return (Criteria) this;
        }

        public Criteria andSettleGoodsNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("settle_goods_num <=", value, "settleGoodsNum");
            return (Criteria) this;
        }

        public Criteria andSettleGoodsNumIn(List<BigDecimal> values) {
            addCriterion("settle_goods_num in", values, "settleGoodsNum");
            return (Criteria) this;
        }

        public Criteria andSettleGoodsNumNotIn(List<BigDecimal> values) {
            addCriterion("settle_goods_num not in", values, "settleGoodsNum");
            return (Criteria) this;
        }

        public Criteria andSettleGoodsNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("settle_goods_num between", value1, value2, "settleGoodsNum");
            return (Criteria) this;
        }

        public Criteria andSettleGoodsNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("settle_goods_num not between", value1, value2, "settleGoodsNum");
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

        public Criteria andSettleCurrIsNull() {
            addCriterion("settle_curr is null");
            return (Criteria) this;
        }

        public Criteria andSettleCurrIsNotNull() {
            addCriterion("settle_curr is not null");
            return (Criteria) this;
        }

        public Criteria andSettleCurrEqualTo(String value) {
            addCriterion("settle_curr =", value, "settleCurr");
            return (Criteria) this;
        }

        public Criteria andSettleCurrNotEqualTo(String value) {
            addCriterion("settle_curr <>", value, "settleCurr");
            return (Criteria) this;
        }

        public Criteria andSettleCurrGreaterThan(String value) {
            addCriterion("settle_curr >", value, "settleCurr");
            return (Criteria) this;
        }

        public Criteria andSettleCurrGreaterThanOrEqualTo(String value) {
            addCriterion("settle_curr >=", value, "settleCurr");
            return (Criteria) this;
        }

        public Criteria andSettleCurrLessThan(String value) {
            addCriterion("settle_curr <", value, "settleCurr");
            return (Criteria) this;
        }

        public Criteria andSettleCurrLessThanOrEqualTo(String value) {
            addCriterion("settle_curr <=", value, "settleCurr");
            return (Criteria) this;
        }

        public Criteria andSettleCurrLike(String value) {
            addCriterion("settle_curr like", value, "settleCurr");
            return (Criteria) this;
        }

        public Criteria andSettleCurrNotLike(String value) {
            addCriterion("settle_curr not like", value, "settleCurr");
            return (Criteria) this;
        }

        public Criteria andSettleCurrIn(List<String> values) {
            addCriterion("settle_curr in", values, "settleCurr");
            return (Criteria) this;
        }

        public Criteria andSettleCurrNotIn(List<String> values) {
            addCriterion("settle_curr not in", values, "settleCurr");
            return (Criteria) this;
        }

        public Criteria andSettleCurrBetween(String value1, String value2) {
            addCriterion("settle_curr between", value1, value2, "settleCurr");
            return (Criteria) this;
        }

        public Criteria andSettleCurrNotBetween(String value1, String value2) {
            addCriterion("settle_curr not between", value1, value2, "settleCurr");
            return (Criteria) this;
        }

        public Criteria andSettleCountIsNull() {
            addCriterion("settle_count is null");
            return (Criteria) this;
        }

        public Criteria andSettleCountIsNotNull() {
            addCriterion("settle_count is not null");
            return (Criteria) this;
        }

        public Criteria andSettleCountEqualTo(Integer value) {
            addCriterion("settle_count =", value, "settleCount");
            return (Criteria) this;
        }

        public Criteria andSettleCountNotEqualTo(Integer value) {
            addCriterion("settle_count <>", value, "settleCount");
            return (Criteria) this;
        }

        public Criteria andSettleCountGreaterThan(Integer value) {
            addCriterion("settle_count >", value, "settleCount");
            return (Criteria) this;
        }

        public Criteria andSettleCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("settle_count >=", value, "settleCount");
            return (Criteria) this;
        }

        public Criteria andSettleCountLessThan(Integer value) {
            addCriterion("settle_count <", value, "settleCount");
            return (Criteria) this;
        }

        public Criteria andSettleCountLessThanOrEqualTo(Integer value) {
            addCriterion("settle_count <=", value, "settleCount");
            return (Criteria) this;
        }

        public Criteria andSettleCountIn(List<Integer> values) {
            addCriterion("settle_count in", values, "settleCount");
            return (Criteria) this;
        }

        public Criteria andSettleCountNotIn(List<Integer> values) {
            addCriterion("settle_count not in", values, "settleCount");
            return (Criteria) this;
        }

        public Criteria andSettleCountBetween(Integer value1, Integer value2) {
            addCriterion("settle_count between", value1, value2, "settleCount");
            return (Criteria) this;
        }

        public Criteria andSettleCountNotBetween(Integer value1, Integer value2) {
            addCriterion("settle_count not between", value1, value2, "settleCount");
            return (Criteria) this;
        }

        public Criteria andSettleFeeAmtIsNull() {
            addCriterion("settle_fee_amt is null");
            return (Criteria) this;
        }

        public Criteria andSettleFeeAmtIsNotNull() {
            addCriterion("settle_fee_amt is not null");
            return (Criteria) this;
        }

        public Criteria andSettleFeeAmtEqualTo(BigDecimal value) {
            addCriterion("settle_fee_amt =", value, "settleFeeAmt");
            return (Criteria) this;
        }

        public Criteria andSettleFeeAmtNotEqualTo(BigDecimal value) {
            addCriterion("settle_fee_amt <>", value, "settleFeeAmt");
            return (Criteria) this;
        }

        public Criteria andSettleFeeAmtGreaterThan(BigDecimal value) {
            addCriterion("settle_fee_amt >", value, "settleFeeAmt");
            return (Criteria) this;
        }

        public Criteria andSettleFeeAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("settle_fee_amt >=", value, "settleFeeAmt");
            return (Criteria) this;
        }

        public Criteria andSettleFeeAmtLessThan(BigDecimal value) {
            addCriterion("settle_fee_amt <", value, "settleFeeAmt");
            return (Criteria) this;
        }

        public Criteria andSettleFeeAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("settle_fee_amt <=", value, "settleFeeAmt");
            return (Criteria) this;
        }

        public Criteria andSettleFeeAmtIn(List<BigDecimal> values) {
            addCriterion("settle_fee_amt in", values, "settleFeeAmt");
            return (Criteria) this;
        }

        public Criteria andSettleFeeAmtNotIn(List<BigDecimal> values) {
            addCriterion("settle_fee_amt not in", values, "settleFeeAmt");
            return (Criteria) this;
        }

        public Criteria andSettleFeeAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("settle_fee_amt between", value1, value2, "settleFeeAmt");
            return (Criteria) this;
        }

        public Criteria andSettleFeeAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("settle_fee_amt not between", value1, value2, "settleFeeAmt");
            return (Criteria) this;
        }

        public Criteria andSettleDateIsNull() {
            addCriterion("settle_date is null");
            return (Criteria) this;
        }

        public Criteria andSettleDateIsNotNull() {
            addCriterion("settle_date is not null");
            return (Criteria) this;
        }

        public Criteria andSettleDateEqualTo(String value) {
            addCriterion("settle_date =", value, "settleDate");
            return (Criteria) this;
        }

        public Criteria andSettleDateNotEqualTo(String value) {
            addCriterion("settle_date <>", value, "settleDate");
            return (Criteria) this;
        }

        public Criteria andSettleDateGreaterThan(String value) {
            addCriterion("settle_date >", value, "settleDate");
            return (Criteria) this;
        }

        public Criteria andSettleDateGreaterThanOrEqualTo(String value) {
            addCriterion("settle_date >=", value, "settleDate");
            return (Criteria) this;
        }

        public Criteria andSettleDateLessThan(String value) {
            addCriterion("settle_date <", value, "settleDate");
            return (Criteria) this;
        }

        public Criteria andSettleDateLessThanOrEqualTo(String value) {
            addCriterion("settle_date <=", value, "settleDate");
            return (Criteria) this;
        }

        public Criteria andSettleDateLike(String value) {
            addCriterion("settle_date like", value, "settleDate");
            return (Criteria) this;
        }

        public Criteria andSettleDateNotLike(String value) {
            addCriterion("settle_date not like", value, "settleDate");
            return (Criteria) this;
        }

        public Criteria andSettleDateIn(List<String> values) {
            addCriterion("settle_date in", values, "settleDate");
            return (Criteria) this;
        }

        public Criteria andSettleDateNotIn(List<String> values) {
            addCriterion("settle_date not in", values, "settleDate");
            return (Criteria) this;
        }

        public Criteria andSettleDateBetween(String value1, String value2) {
            addCriterion("settle_date between", value1, value2, "settleDate");
            return (Criteria) this;
        }

        public Criteria andSettleDateNotBetween(String value1, String value2) {
            addCriterion("settle_date not between", value1, value2, "settleDate");
            return (Criteria) this;
        }

        public Criteria andSettleStatusIsNull() {
            addCriterion("settle_status is null");
            return (Criteria) this;
        }

        public Criteria andSettleStatusIsNotNull() {
            addCriterion("settle_status is not null");
            return (Criteria) this;
        }

        public Criteria andSettleStatusEqualTo(String value) {
            addCriterion("settle_status =", value, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andSettleStatusNotEqualTo(String value) {
            addCriterion("settle_status <>", value, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andSettleStatusGreaterThan(String value) {
            addCriterion("settle_status >", value, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andSettleStatusGreaterThanOrEqualTo(String value) {
            addCriterion("settle_status >=", value, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andSettleStatusLessThan(String value) {
            addCriterion("settle_status <", value, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andSettleStatusLessThanOrEqualTo(String value) {
            addCriterion("settle_status <=", value, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andSettleStatusLike(String value) {
            addCriterion("settle_status like", value, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andSettleStatusNotLike(String value) {
            addCriterion("settle_status not like", value, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andSettleStatusIn(List<String> values) {
            addCriterion("settle_status in", values, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andSettleStatusNotIn(List<String> values) {
            addCriterion("settle_status not in", values, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andSettleStatusBetween(String value1, String value2) {
            addCriterion("settle_status between", value1, value2, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andSettleStatusNotBetween(String value1, String value2) {
            addCriterion("settle_status not between", value1, value2, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andSettleIdIsNull() {
            addCriterion("settle_id is null");
            return (Criteria) this;
        }

        public Criteria andSettleIdIsNotNull() {
            addCriterion("settle_id is not null");
            return (Criteria) this;
        }

        public Criteria andSettleIdEqualTo(Long value) {
            addCriterion("settle_id =", value, "settleId");
            return (Criteria) this;
        }

        public Criteria andSettleIdNotEqualTo(Long value) {
            addCriterion("settle_id <>", value, "settleId");
            return (Criteria) this;
        }

        public Criteria andSettleIdGreaterThan(Long value) {
            addCriterion("settle_id >", value, "settleId");
            return (Criteria) this;
        }

        public Criteria andSettleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("settle_id >=", value, "settleId");
            return (Criteria) this;
        }

        public Criteria andSettleIdLessThan(Long value) {
            addCriterion("settle_id <", value, "settleId");
            return (Criteria) this;
        }

        public Criteria andSettleIdLessThanOrEqualTo(Long value) {
            addCriterion("settle_id <=", value, "settleId");
            return (Criteria) this;
        }

        public Criteria andSettleIdIn(List<Long> values) {
            addCriterion("settle_id in", values, "settleId");
            return (Criteria) this;
        }

        public Criteria andSettleIdNotIn(List<Long> values) {
            addCriterion("settle_id not in", values, "settleId");
            return (Criteria) this;
        }

        public Criteria andSettleIdBetween(Long value1, Long value2) {
            addCriterion("settle_id between", value1, value2, "settleId");
            return (Criteria) this;
        }

        public Criteria andSettleIdNotBetween(Long value1, Long value2) {
            addCriterion("settle_id not between", value1, value2, "settleId");
            return (Criteria) this;
        }

        public Criteria andDrSettleIdIsNull() {
            addCriterion("dr_settle_id is null");
            return (Criteria) this;
        }

        public Criteria andDrSettleIdIsNotNull() {
            addCriterion("dr_settle_id is not null");
            return (Criteria) this;
        }

        public Criteria andDrSettleIdEqualTo(String value) {
            addCriterion("dr_settle_id =", value, "drSettleId");
            return (Criteria) this;
        }

        public Criteria andDrSettleIdNotEqualTo(String value) {
            addCriterion("dr_settle_id <>", value, "drSettleId");
            return (Criteria) this;
        }

        public Criteria andDrSettleIdGreaterThan(String value) {
            addCriterion("dr_settle_id >", value, "drSettleId");
            return (Criteria) this;
        }

        public Criteria andDrSettleIdGreaterThanOrEqualTo(String value) {
            addCriterion("dr_settle_id >=", value, "drSettleId");
            return (Criteria) this;
        }

        public Criteria andDrSettleIdLessThan(String value) {
            addCriterion("dr_settle_id <", value, "drSettleId");
            return (Criteria) this;
        }

        public Criteria andDrSettleIdLessThanOrEqualTo(String value) {
            addCriterion("dr_settle_id <=", value, "drSettleId");
            return (Criteria) this;
        }

        public Criteria andDrSettleIdLike(String value) {
            addCriterion("dr_settle_id like", value, "drSettleId");
            return (Criteria) this;
        }

        public Criteria andDrSettleIdNotLike(String value) {
            addCriterion("dr_settle_id not like", value, "drSettleId");
            return (Criteria) this;
        }

        public Criteria andDrSettleIdIn(List<String> values) {
            addCriterion("dr_settle_id in", values, "drSettleId");
            return (Criteria) this;
        }

        public Criteria andDrSettleIdNotIn(List<String> values) {
            addCriterion("dr_settle_id not in", values, "drSettleId");
            return (Criteria) this;
        }

        public Criteria andDrSettleIdBetween(String value1, String value2) {
            addCriterion("dr_settle_id between", value1, value2, "drSettleId");
            return (Criteria) this;
        }

        public Criteria andDrSettleIdNotBetween(String value1, String value2) {
            addCriterion("dr_settle_id not between", value1, value2, "drSettleId");
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

        public Criteria andCreTimeIsNull() {
            addCriterion("cre_time is null");
            return (Criteria) this;
        }

        public Criteria andCreTimeIsNotNull() {
            addCriterion("cre_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreTimeEqualTo(String value) {
            addCriterion("cre_time =", value, "creTime");
            return (Criteria) this;
        }

        public Criteria andCreTimeNotEqualTo(String value) {
            addCriterion("cre_time <>", value, "creTime");
            return (Criteria) this;
        }

        public Criteria andCreTimeGreaterThan(String value) {
            addCriterion("cre_time >", value, "creTime");
            return (Criteria) this;
        }

        public Criteria andCreTimeGreaterThanOrEqualTo(String value) {
            addCriterion("cre_time >=", value, "creTime");
            return (Criteria) this;
        }

        public Criteria andCreTimeLessThan(String value) {
            addCriterion("cre_time <", value, "creTime");
            return (Criteria) this;
        }

        public Criteria andCreTimeLessThanOrEqualTo(String value) {
            addCriterion("cre_time <=", value, "creTime");
            return (Criteria) this;
        }

        public Criteria andCreTimeLike(String value) {
            addCriterion("cre_time like", value, "creTime");
            return (Criteria) this;
        }

        public Criteria andCreTimeNotLike(String value) {
            addCriterion("cre_time not like", value, "creTime");
            return (Criteria) this;
        }

        public Criteria andCreTimeIn(List<String> values) {
            addCriterion("cre_time in", values, "creTime");
            return (Criteria) this;
        }

        public Criteria andCreTimeNotIn(List<String> values) {
            addCriterion("cre_time not in", values, "creTime");
            return (Criteria) this;
        }

        public Criteria andCreTimeBetween(String value1, String value2) {
            addCriterion("cre_time between", value1, value2, "creTime");
            return (Criteria) this;
        }

        public Criteria andCreTimeNotBetween(String value1, String value2) {
            addCriterion("cre_time not between", value1, value2, "creTime");
            return (Criteria) this;
        }

        public Criteria andDayendCodeLikeInsensitive(String value) {
            addCriterion("upper(dayend_code) like", value.toUpperCase(), "dayendCode");
            return (Criteria) this;
        }

        public Criteria andTranCodeLikeInsensitive(String value) {
            addCriterion("upper(tran_code) like", value.toUpperCase(), "tranCode");
            return (Criteria) this;
        }

        public Criteria andRpTypeLikeInsensitive(String value) {
            addCriterion("upper(rp_type) like", value.toUpperCase(), "rpType");
            return (Criteria) this;
        }

        public Criteria andMerIdLikeInsensitive(String value) {
            addCriterion("upper(mer_id) like", value.toUpperCase(), "merId");
            return (Criteria) this;
        }

        public Criteria andMerNameLikeInsensitive(String value) {
            addCriterion("upper(mer_name) like", value.toUpperCase(), "merName");
            return (Criteria) this;
        }

        public Criteria andExCodeLikeInsensitive(String value) {
            addCriterion("upper(ex_code) like", value.toUpperCase(), "exCode");
            return (Criteria) this;
        }

        public Criteria andExNameLikeInsensitive(String value) {
            addCriterion("upper(ex_name) like", value.toUpperCase(), "exName");
            return (Criteria) this;
        }

        public Criteria andExTypeLikeInsensitive(String value) {
            addCriterion("upper(ex_type) like", value.toUpperCase(), "exType");
            return (Criteria) this;
        }

        public Criteria andSettleCurrLikeInsensitive(String value) {
            addCriterion("upper(settle_curr) like", value.toUpperCase(), "settleCurr");
            return (Criteria) this;
        }

        public Criteria andSettleDateLikeInsensitive(String value) {
            addCriterion("upper(settle_date) like", value.toUpperCase(), "settleDate");
            return (Criteria) this;
        }

        public Criteria andSettleStatusLikeInsensitive(String value) {
            addCriterion("upper(settle_status) like", value.toUpperCase(), "settleStatus");
            return (Criteria) this;
        }

        public Criteria andDrSettleIdLikeInsensitive(String value) {
            addCriterion("upper(dr_settle_id) like", value.toUpperCase(), "drSettleId");
            return (Criteria) this;
        }

        public Criteria andFeeTypeLikeInsensitive(String value) {
            addCriterion("upper(fee_type) like", value.toUpperCase(), "feeType");
            return (Criteria) this;
        }

        public Criteria andCreTimeLikeInsensitive(String value) {
            addCriterion("upper(cre_time) like", value.toUpperCase(), "creTime");
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