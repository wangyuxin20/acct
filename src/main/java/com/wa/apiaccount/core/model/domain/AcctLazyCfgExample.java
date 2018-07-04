package com.wa.apiaccount.core.model.domain;

import java.util.ArrayList;
import java.util.List;

public class AcctLazyCfgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AcctLazyCfgExample() {
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

        public Criteria andAcctNoIsNull() {
            addCriterion("acct_no is null");
            return (Criteria) this;
        }

        public Criteria andAcctNoIsNotNull() {
            addCriterion("acct_no is not null");
            return (Criteria) this;
        }

        public Criteria andAcctNoEqualTo(String value) {
            addCriterion("acct_no =", value, "acctNo");
            return (Criteria) this;
        }

        public Criteria andAcctNoNotEqualTo(String value) {
            addCriterion("acct_no <>", value, "acctNo");
            return (Criteria) this;
        }

        public Criteria andAcctNoGreaterThan(String value) {
            addCriterion("acct_no >", value, "acctNo");
            return (Criteria) this;
        }

        public Criteria andAcctNoGreaterThanOrEqualTo(String value) {
            addCriterion("acct_no >=", value, "acctNo");
            return (Criteria) this;
        }

        public Criteria andAcctNoLessThan(String value) {
            addCriterion("acct_no <", value, "acctNo");
            return (Criteria) this;
        }

        public Criteria andAcctNoLessThanOrEqualTo(String value) {
            addCriterion("acct_no <=", value, "acctNo");
            return (Criteria) this;
        }

        public Criteria andAcctNoLike(String value) {
            addCriterion("acct_no like", value, "acctNo");
            return (Criteria) this;
        }

        public Criteria andAcctNoNotLike(String value) {
            addCriterion("acct_no not like", value, "acctNo");
            return (Criteria) this;
        }

        public Criteria andAcctNoIn(List<String> values) {
            addCriterion("acct_no in", values, "acctNo");
            return (Criteria) this;
        }

        public Criteria andAcctNoNotIn(List<String> values) {
            addCriterion("acct_no not in", values, "acctNo");
            return (Criteria) this;
        }

        public Criteria andAcctNoBetween(String value1, String value2) {
            addCriterion("acct_no between", value1, value2, "acctNo");
            return (Criteria) this;
        }

        public Criteria andAcctNoNotBetween(String value1, String value2) {
            addCriterion("acct_no not between", value1, value2, "acctNo");
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

        public Criteria andCurrNoIsNull() {
            addCriterion("curr_no is null");
            return (Criteria) this;
        }

        public Criteria andCurrNoIsNotNull() {
            addCriterion("curr_no is not null");
            return (Criteria) this;
        }

        public Criteria andCurrNoEqualTo(String value) {
            addCriterion("curr_no =", value, "currNo");
            return (Criteria) this;
        }

        public Criteria andCurrNoNotEqualTo(String value) {
            addCriterion("curr_no <>", value, "currNo");
            return (Criteria) this;
        }

        public Criteria andCurrNoGreaterThan(String value) {
            addCriterion("curr_no >", value, "currNo");
            return (Criteria) this;
        }

        public Criteria andCurrNoGreaterThanOrEqualTo(String value) {
            addCriterion("curr_no >=", value, "currNo");
            return (Criteria) this;
        }

        public Criteria andCurrNoLessThan(String value) {
            addCriterion("curr_no <", value, "currNo");
            return (Criteria) this;
        }

        public Criteria andCurrNoLessThanOrEqualTo(String value) {
            addCriterion("curr_no <=", value, "currNo");
            return (Criteria) this;
        }

        public Criteria andCurrNoLike(String value) {
            addCriterion("curr_no like", value, "currNo");
            return (Criteria) this;
        }

        public Criteria andCurrNoNotLike(String value) {
            addCriterion("curr_no not like", value, "currNo");
            return (Criteria) this;
        }

        public Criteria andCurrNoIn(List<String> values) {
            addCriterion("curr_no in", values, "currNo");
            return (Criteria) this;
        }

        public Criteria andCurrNoNotIn(List<String> values) {
            addCriterion("curr_no not in", values, "currNo");
            return (Criteria) this;
        }

        public Criteria andCurrNoBetween(String value1, String value2) {
            addCriterion("curr_no between", value1, value2, "currNo");
            return (Criteria) this;
        }

        public Criteria andCurrNoNotBetween(String value1, String value2) {
            addCriterion("curr_no not between", value1, value2, "currNo");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNoIsNull() {
            addCriterion("acct_type_no is null");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNoIsNotNull() {
            addCriterion("acct_type_no is not null");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNoEqualTo(String value) {
            addCriterion("acct_type_no =", value, "acctTypeNo");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNoNotEqualTo(String value) {
            addCriterion("acct_type_no <>", value, "acctTypeNo");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNoGreaterThan(String value) {
            addCriterion("acct_type_no >", value, "acctTypeNo");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNoGreaterThanOrEqualTo(String value) {
            addCriterion("acct_type_no >=", value, "acctTypeNo");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNoLessThan(String value) {
            addCriterion("acct_type_no <", value, "acctTypeNo");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNoLessThanOrEqualTo(String value) {
            addCriterion("acct_type_no <=", value, "acctTypeNo");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNoLike(String value) {
            addCriterion("acct_type_no like", value, "acctTypeNo");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNoNotLike(String value) {
            addCriterion("acct_type_no not like", value, "acctTypeNo");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNoIn(List<String> values) {
            addCriterion("acct_type_no in", values, "acctTypeNo");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNoNotIn(List<String> values) {
            addCriterion("acct_type_no not in", values, "acctTypeNo");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNoBetween(String value1, String value2) {
            addCriterion("acct_type_no between", value1, value2, "acctTypeNo");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNoNotBetween(String value1, String value2) {
            addCriterion("acct_type_no not between", value1, value2, "acctTypeNo");
            return (Criteria) this;
        }

        public Criteria andExpIsNull() {
            addCriterion("exp is null");
            return (Criteria) this;
        }

        public Criteria andExpIsNotNull() {
            addCriterion("exp is not null");
            return (Criteria) this;
        }

        public Criteria andExpEqualTo(String value) {
            addCriterion("exp =", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpNotEqualTo(String value) {
            addCriterion("exp <>", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpGreaterThan(String value) {
            addCriterion("exp >", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpGreaterThanOrEqualTo(String value) {
            addCriterion("exp >=", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpLessThan(String value) {
            addCriterion("exp <", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpLessThanOrEqualTo(String value) {
            addCriterion("exp <=", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpLike(String value) {
            addCriterion("exp like", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpNotLike(String value) {
            addCriterion("exp not like", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpIn(List<String> values) {
            addCriterion("exp in", values, "exp");
            return (Criteria) this;
        }

        public Criteria andExpNotIn(List<String> values) {
            addCriterion("exp not in", values, "exp");
            return (Criteria) this;
        }

        public Criteria andExpBetween(String value1, String value2) {
            addCriterion("exp between", value1, value2, "exp");
            return (Criteria) this;
        }

        public Criteria andExpNotBetween(String value1, String value2) {
            addCriterion("exp not between", value1, value2, "exp");
            return (Criteria) this;
        }

        public Criteria andLazyNumIsNull() {
            addCriterion("lazy_num is null");
            return (Criteria) this;
        }

        public Criteria andLazyNumIsNotNull() {
            addCriterion("lazy_num is not null");
            return (Criteria) this;
        }

        public Criteria andLazyNumEqualTo(Integer value) {
            addCriterion("lazy_num =", value, "lazyNum");
            return (Criteria) this;
        }

        public Criteria andLazyNumNotEqualTo(Integer value) {
            addCriterion("lazy_num <>", value, "lazyNum");
            return (Criteria) this;
        }

        public Criteria andLazyNumGreaterThan(Integer value) {
            addCriterion("lazy_num >", value, "lazyNum");
            return (Criteria) this;
        }

        public Criteria andLazyNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("lazy_num >=", value, "lazyNum");
            return (Criteria) this;
        }

        public Criteria andLazyNumLessThan(Integer value) {
            addCriterion("lazy_num <", value, "lazyNum");
            return (Criteria) this;
        }

        public Criteria andLazyNumLessThanOrEqualTo(Integer value) {
            addCriterion("lazy_num <=", value, "lazyNum");
            return (Criteria) this;
        }

        public Criteria andLazyNumIn(List<Integer> values) {
            addCriterion("lazy_num in", values, "lazyNum");
            return (Criteria) this;
        }

        public Criteria andLazyNumNotIn(List<Integer> values) {
            addCriterion("lazy_num not in", values, "lazyNum");
            return (Criteria) this;
        }

        public Criteria andLazyNumBetween(Integer value1, Integer value2) {
            addCriterion("lazy_num between", value1, value2, "lazyNum");
            return (Criteria) this;
        }

        public Criteria andLazyNumNotBetween(Integer value1, Integer value2) {
            addCriterion("lazy_num not between", value1, value2, "lazyNum");
            return (Criteria) this;
        }

        public Criteria andLazyTimeSecIsNull() {
            addCriterion("lazy_time_sec is null");
            return (Criteria) this;
        }

        public Criteria andLazyTimeSecIsNotNull() {
            addCriterion("lazy_time_sec is not null");
            return (Criteria) this;
        }

        public Criteria andLazyTimeSecEqualTo(Integer value) {
            addCriterion("lazy_time_sec =", value, "lazyTimeSec");
            return (Criteria) this;
        }

        public Criteria andLazyTimeSecNotEqualTo(Integer value) {
            addCriterion("lazy_time_sec <>", value, "lazyTimeSec");
            return (Criteria) this;
        }

        public Criteria andLazyTimeSecGreaterThan(Integer value) {
            addCriterion("lazy_time_sec >", value, "lazyTimeSec");
            return (Criteria) this;
        }

        public Criteria andLazyTimeSecGreaterThanOrEqualTo(Integer value) {
            addCriterion("lazy_time_sec >=", value, "lazyTimeSec");
            return (Criteria) this;
        }

        public Criteria andLazyTimeSecLessThan(Integer value) {
            addCriterion("lazy_time_sec <", value, "lazyTimeSec");
            return (Criteria) this;
        }

        public Criteria andLazyTimeSecLessThanOrEqualTo(Integer value) {
            addCriterion("lazy_time_sec <=", value, "lazyTimeSec");
            return (Criteria) this;
        }

        public Criteria andLazyTimeSecIn(List<Integer> values) {
            addCriterion("lazy_time_sec in", values, "lazyTimeSec");
            return (Criteria) this;
        }

        public Criteria andLazyTimeSecNotIn(List<Integer> values) {
            addCriterion("lazy_time_sec not in", values, "lazyTimeSec");
            return (Criteria) this;
        }

        public Criteria andLazyTimeSecBetween(Integer value1, Integer value2) {
            addCriterion("lazy_time_sec between", value1, value2, "lazyTimeSec");
            return (Criteria) this;
        }

        public Criteria andLazyTimeSecNotBetween(Integer value1, Integer value2) {
            addCriterion("lazy_time_sec not between", value1, value2, "lazyTimeSec");
            return (Criteria) this;
        }

        public Criteria andAcctAliasIsNull() {
            addCriterion("acct_alias is null");
            return (Criteria) this;
        }

        public Criteria andAcctAliasIsNotNull() {
            addCriterion("acct_alias is not null");
            return (Criteria) this;
        }

        public Criteria andAcctAliasEqualTo(String value) {
            addCriterion("acct_alias =", value, "acctAlias");
            return (Criteria) this;
        }

        public Criteria andAcctAliasNotEqualTo(String value) {
            addCriterion("acct_alias <>", value, "acctAlias");
            return (Criteria) this;
        }

        public Criteria andAcctAliasGreaterThan(String value) {
            addCriterion("acct_alias >", value, "acctAlias");
            return (Criteria) this;
        }

        public Criteria andAcctAliasGreaterThanOrEqualTo(String value) {
            addCriterion("acct_alias >=", value, "acctAlias");
            return (Criteria) this;
        }

        public Criteria andAcctAliasLessThan(String value) {
            addCriterion("acct_alias <", value, "acctAlias");
            return (Criteria) this;
        }

        public Criteria andAcctAliasLessThanOrEqualTo(String value) {
            addCriterion("acct_alias <=", value, "acctAlias");
            return (Criteria) this;
        }

        public Criteria andAcctAliasLike(String value) {
            addCriterion("acct_alias like", value, "acctAlias");
            return (Criteria) this;
        }

        public Criteria andAcctAliasNotLike(String value) {
            addCriterion("acct_alias not like", value, "acctAlias");
            return (Criteria) this;
        }

        public Criteria andAcctAliasIn(List<String> values) {
            addCriterion("acct_alias in", values, "acctAlias");
            return (Criteria) this;
        }

        public Criteria andAcctAliasNotIn(List<String> values) {
            addCriterion("acct_alias not in", values, "acctAlias");
            return (Criteria) this;
        }

        public Criteria andAcctAliasBetween(String value1, String value2) {
            addCriterion("acct_alias between", value1, value2, "acctAlias");
            return (Criteria) this;
        }

        public Criteria andAcctAliasNotBetween(String value1, String value2) {
            addCriterion("acct_alias not between", value1, value2, "acctAlias");
            return (Criteria) this;
        }

        public Criteria andAcctNoLikeInsensitive(String value) {
            addCriterion("upper(acct_no) like", value.toUpperCase(), "acctNo");
            return (Criteria) this;
        }

        public Criteria andUserNoLikeInsensitive(String value) {
            addCriterion("upper(user_no) like", value.toUpperCase(), "userNo");
            return (Criteria) this;
        }

        public Criteria andCurrNoLikeInsensitive(String value) {
            addCriterion("upper(curr_no) like", value.toUpperCase(), "currNo");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNoLikeInsensitive(String value) {
            addCriterion("upper(acct_type_no) like", value.toUpperCase(), "acctTypeNo");
            return (Criteria) this;
        }

        public Criteria andExpLikeInsensitive(String value) {
            addCriterion("upper(exp) like", value.toUpperCase(), "exp");
            return (Criteria) this;
        }

        public Criteria andAcctAliasLikeInsensitive(String value) {
            addCriterion("upper(acct_alias) like", value.toUpperCase(), "acctAlias");
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