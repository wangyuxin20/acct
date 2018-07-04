package com.wa.apiaccount.core.model.domain;

import java.util.ArrayList;
import java.util.List;

public class AcctDayendSettleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AcctDayendSettleExample() {
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

        public Criteria andAcctDateIsNull() {
            addCriterion("acct_date is null");
            return (Criteria) this;
        }

        public Criteria andAcctDateIsNotNull() {
            addCriterion("acct_date is not null");
            return (Criteria) this;
        }

        public Criteria andAcctDateEqualTo(String value) {
            addCriterion("acct_date =", value, "acctDate");
            return (Criteria) this;
        }

        public Criteria andAcctDateNotEqualTo(String value) {
            addCriterion("acct_date <>", value, "acctDate");
            return (Criteria) this;
        }

        public Criteria andAcctDateGreaterThan(String value) {
            addCriterion("acct_date >", value, "acctDate");
            return (Criteria) this;
        }

        public Criteria andAcctDateGreaterThanOrEqualTo(String value) {
            addCriterion("acct_date >=", value, "acctDate");
            return (Criteria) this;
        }

        public Criteria andAcctDateLessThan(String value) {
            addCriterion("acct_date <", value, "acctDate");
            return (Criteria) this;
        }

        public Criteria andAcctDateLessThanOrEqualTo(String value) {
            addCriterion("acct_date <=", value, "acctDate");
            return (Criteria) this;
        }

        public Criteria andAcctDateLike(String value) {
            addCriterion("acct_date like", value, "acctDate");
            return (Criteria) this;
        }

        public Criteria andAcctDateNotLike(String value) {
            addCriterion("acct_date not like", value, "acctDate");
            return (Criteria) this;
        }

        public Criteria andAcctDateIn(List<String> values) {
            addCriterion("acct_date in", values, "acctDate");
            return (Criteria) this;
        }

        public Criteria andAcctDateNotIn(List<String> values) {
            addCriterion("acct_date not in", values, "acctDate");
            return (Criteria) this;
        }

        public Criteria andAcctDateBetween(String value1, String value2) {
            addCriterion("acct_date between", value1, value2, "acctDate");
            return (Criteria) this;
        }

        public Criteria andAcctDateNotBetween(String value1, String value2) {
            addCriterion("acct_date not between", value1, value2, "acctDate");
            return (Criteria) this;
        }

        public Criteria andClusterIdIsNull() {
            addCriterion("cluster_id is null");
            return (Criteria) this;
        }

        public Criteria andClusterIdIsNotNull() {
            addCriterion("cluster_id is not null");
            return (Criteria) this;
        }

        public Criteria andClusterIdEqualTo(Integer value) {
            addCriterion("cluster_id =", value, "clusterId");
            return (Criteria) this;
        }

        public Criteria andClusterIdNotEqualTo(Integer value) {
            addCriterion("cluster_id <>", value, "clusterId");
            return (Criteria) this;
        }

        public Criteria andClusterIdGreaterThan(Integer value) {
            addCriterion("cluster_id >", value, "clusterId");
            return (Criteria) this;
        }

        public Criteria andClusterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cluster_id >=", value, "clusterId");
            return (Criteria) this;
        }

        public Criteria andClusterIdLessThan(Integer value) {
            addCriterion("cluster_id <", value, "clusterId");
            return (Criteria) this;
        }

        public Criteria andClusterIdLessThanOrEqualTo(Integer value) {
            addCriterion("cluster_id <=", value, "clusterId");
            return (Criteria) this;
        }

        public Criteria andClusterIdIn(List<Integer> values) {
            addCriterion("cluster_id in", values, "clusterId");
            return (Criteria) this;
        }

        public Criteria andClusterIdNotIn(List<Integer> values) {
            addCriterion("cluster_id not in", values, "clusterId");
            return (Criteria) this;
        }

        public Criteria andClusterIdBetween(Integer value1, Integer value2) {
            addCriterion("cluster_id between", value1, value2, "clusterId");
            return (Criteria) this;
        }

        public Criteria andClusterIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cluster_id not between", value1, value2, "clusterId");
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

        public Criteria andTranNumIsNull() {
            addCriterion("tran_num is null");
            return (Criteria) this;
        }

        public Criteria andTranNumIsNotNull() {
            addCriterion("tran_num is not null");
            return (Criteria) this;
        }

        public Criteria andTranNumEqualTo(Integer value) {
            addCriterion("tran_num =", value, "tranNum");
            return (Criteria) this;
        }

        public Criteria andTranNumNotEqualTo(Integer value) {
            addCriterion("tran_num <>", value, "tranNum");
            return (Criteria) this;
        }

        public Criteria andTranNumGreaterThan(Integer value) {
            addCriterion("tran_num >", value, "tranNum");
            return (Criteria) this;
        }

        public Criteria andTranNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("tran_num >=", value, "tranNum");
            return (Criteria) this;
        }

        public Criteria andTranNumLessThan(Integer value) {
            addCriterion("tran_num <", value, "tranNum");
            return (Criteria) this;
        }

        public Criteria andTranNumLessThanOrEqualTo(Integer value) {
            addCriterion("tran_num <=", value, "tranNum");
            return (Criteria) this;
        }

        public Criteria andTranNumIn(List<Integer> values) {
            addCriterion("tran_num in", values, "tranNum");
            return (Criteria) this;
        }

        public Criteria andTranNumNotIn(List<Integer> values) {
            addCriterion("tran_num not in", values, "tranNum");
            return (Criteria) this;
        }

        public Criteria andTranNumBetween(Integer value1, Integer value2) {
            addCriterion("tran_num between", value1, value2, "tranNum");
            return (Criteria) this;
        }

        public Criteria andTranNumNotBetween(Integer value1, Integer value2) {
            addCriterion("tran_num not between", value1, value2, "tranNum");
            return (Criteria) this;
        }

        public Criteria andFailNumIsNull() {
            addCriterion("fail_num is null");
            return (Criteria) this;
        }

        public Criteria andFailNumIsNotNull() {
            addCriterion("fail_num is not null");
            return (Criteria) this;
        }

        public Criteria andFailNumEqualTo(Integer value) {
            addCriterion("fail_num =", value, "failNum");
            return (Criteria) this;
        }

        public Criteria andFailNumNotEqualTo(Integer value) {
            addCriterion("fail_num <>", value, "failNum");
            return (Criteria) this;
        }

        public Criteria andFailNumGreaterThan(Integer value) {
            addCriterion("fail_num >", value, "failNum");
            return (Criteria) this;
        }

        public Criteria andFailNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("fail_num >=", value, "failNum");
            return (Criteria) this;
        }

        public Criteria andFailNumLessThan(Integer value) {
            addCriterion("fail_num <", value, "failNum");
            return (Criteria) this;
        }

        public Criteria andFailNumLessThanOrEqualTo(Integer value) {
            addCriterion("fail_num <=", value, "failNum");
            return (Criteria) this;
        }

        public Criteria andFailNumIn(List<Integer> values) {
            addCriterion("fail_num in", values, "failNum");
            return (Criteria) this;
        }

        public Criteria andFailNumNotIn(List<Integer> values) {
            addCriterion("fail_num not in", values, "failNum");
            return (Criteria) this;
        }

        public Criteria andFailNumBetween(Integer value1, Integer value2) {
            addCriterion("fail_num between", value1, value2, "failNum");
            return (Criteria) this;
        }

        public Criteria andFailNumNotBetween(Integer value1, Integer value2) {
            addCriterion("fail_num not between", value1, value2, "failNum");
            return (Criteria) this;
        }

        public Criteria andSuccNumIsNull() {
            addCriterion("succ_num is null");
            return (Criteria) this;
        }

        public Criteria andSuccNumIsNotNull() {
            addCriterion("succ_num is not null");
            return (Criteria) this;
        }

        public Criteria andSuccNumEqualTo(Integer value) {
            addCriterion("succ_num =", value, "succNum");
            return (Criteria) this;
        }

        public Criteria andSuccNumNotEqualTo(Integer value) {
            addCriterion("succ_num <>", value, "succNum");
            return (Criteria) this;
        }

        public Criteria andSuccNumGreaterThan(Integer value) {
            addCriterion("succ_num >", value, "succNum");
            return (Criteria) this;
        }

        public Criteria andSuccNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("succ_num >=", value, "succNum");
            return (Criteria) this;
        }

        public Criteria andSuccNumLessThan(Integer value) {
            addCriterion("succ_num <", value, "succNum");
            return (Criteria) this;
        }

        public Criteria andSuccNumLessThanOrEqualTo(Integer value) {
            addCriterion("succ_num <=", value, "succNum");
            return (Criteria) this;
        }

        public Criteria andSuccNumIn(List<Integer> values) {
            addCriterion("succ_num in", values, "succNum");
            return (Criteria) this;
        }

        public Criteria andSuccNumNotIn(List<Integer> values) {
            addCriterion("succ_num not in", values, "succNum");
            return (Criteria) this;
        }

        public Criteria andSuccNumBetween(Integer value1, Integer value2) {
            addCriterion("succ_num between", value1, value2, "succNum");
            return (Criteria) this;
        }

        public Criteria andSuccNumNotBetween(Integer value1, Integer value2) {
            addCriterion("succ_num not between", value1, value2, "succNum");
            return (Criteria) this;
        }

        public Criteria andChargeNumIsNull() {
            addCriterion("charge_num is null");
            return (Criteria) this;
        }

        public Criteria andChargeNumIsNotNull() {
            addCriterion("charge_num is not null");
            return (Criteria) this;
        }

        public Criteria andChargeNumEqualTo(Integer value) {
            addCriterion("charge_num =", value, "chargeNum");
            return (Criteria) this;
        }

        public Criteria andChargeNumNotEqualTo(Integer value) {
            addCriterion("charge_num <>", value, "chargeNum");
            return (Criteria) this;
        }

        public Criteria andChargeNumGreaterThan(Integer value) {
            addCriterion("charge_num >", value, "chargeNum");
            return (Criteria) this;
        }

        public Criteria andChargeNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("charge_num >=", value, "chargeNum");
            return (Criteria) this;
        }

        public Criteria andChargeNumLessThan(Integer value) {
            addCriterion("charge_num <", value, "chargeNum");
            return (Criteria) this;
        }

        public Criteria andChargeNumLessThanOrEqualTo(Integer value) {
            addCriterion("charge_num <=", value, "chargeNum");
            return (Criteria) this;
        }

        public Criteria andChargeNumIn(List<Integer> values) {
            addCriterion("charge_num in", values, "chargeNum");
            return (Criteria) this;
        }

        public Criteria andChargeNumNotIn(List<Integer> values) {
            addCriterion("charge_num not in", values, "chargeNum");
            return (Criteria) this;
        }

        public Criteria andChargeNumBetween(Integer value1, Integer value2) {
            addCriterion("charge_num between", value1, value2, "chargeNum");
            return (Criteria) this;
        }

        public Criteria andChargeNumNotBetween(Integer value1, Integer value2) {
            addCriterion("charge_num not between", value1, value2, "chargeNum");
            return (Criteria) this;
        }

        public Criteria andExtChargeNumIsNull() {
            addCriterion("ext_charge_num is null");
            return (Criteria) this;
        }

        public Criteria andExtChargeNumIsNotNull() {
            addCriterion("ext_charge_num is not null");
            return (Criteria) this;
        }

        public Criteria andExtChargeNumEqualTo(Integer value) {
            addCriterion("ext_charge_num =", value, "extChargeNum");
            return (Criteria) this;
        }

        public Criteria andExtChargeNumNotEqualTo(Integer value) {
            addCriterion("ext_charge_num <>", value, "extChargeNum");
            return (Criteria) this;
        }

        public Criteria andExtChargeNumGreaterThan(Integer value) {
            addCriterion("ext_charge_num >", value, "extChargeNum");
            return (Criteria) this;
        }

        public Criteria andExtChargeNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("ext_charge_num >=", value, "extChargeNum");
            return (Criteria) this;
        }

        public Criteria andExtChargeNumLessThan(Integer value) {
            addCriterion("ext_charge_num <", value, "extChargeNum");
            return (Criteria) this;
        }

        public Criteria andExtChargeNumLessThanOrEqualTo(Integer value) {
            addCriterion("ext_charge_num <=", value, "extChargeNum");
            return (Criteria) this;
        }

        public Criteria andExtChargeNumIn(List<Integer> values) {
            addCriterion("ext_charge_num in", values, "extChargeNum");
            return (Criteria) this;
        }

        public Criteria andExtChargeNumNotIn(List<Integer> values) {
            addCriterion("ext_charge_num not in", values, "extChargeNum");
            return (Criteria) this;
        }

        public Criteria andExtChargeNumBetween(Integer value1, Integer value2) {
            addCriterion("ext_charge_num between", value1, value2, "extChargeNum");
            return (Criteria) this;
        }

        public Criteria andExtChargeNumNotBetween(Integer value1, Integer value2) {
            addCriterion("ext_charge_num not between", value1, value2, "extChargeNum");
            return (Criteria) this;
        }

        public Criteria andAcctDateLikeInsensitive(String value) {
            addCriterion("upper(acct_date) like", value.toUpperCase(), "acctDate");
            return (Criteria) this;
        }

        public Criteria andExTypeLikeInsensitive(String value) {
            addCriterion("upper(ex_type) like", value.toUpperCase(), "exType");
            return (Criteria) this;
        }

        public Criteria andTranCodeLikeInsensitive(String value) {
            addCriterion("upper(tran_code) like", value.toUpperCase(), "tranCode");
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