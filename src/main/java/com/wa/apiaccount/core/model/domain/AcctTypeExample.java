package com.wa.apiaccount.core.model.domain;

import java.util.ArrayList;
import java.util.List;

public class AcctTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AcctTypeExample() {
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

        public Criteria andAcctTypeNameIsNull() {
            addCriterion("acct_type_name is null");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNameIsNotNull() {
            addCriterion("acct_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNameEqualTo(String value) {
            addCriterion("acct_type_name =", value, "acctTypeName");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNameNotEqualTo(String value) {
            addCriterion("acct_type_name <>", value, "acctTypeName");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNameGreaterThan(String value) {
            addCriterion("acct_type_name >", value, "acctTypeName");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("acct_type_name >=", value, "acctTypeName");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNameLessThan(String value) {
            addCriterion("acct_type_name <", value, "acctTypeName");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNameLessThanOrEqualTo(String value) {
            addCriterion("acct_type_name <=", value, "acctTypeName");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNameLike(String value) {
            addCriterion("acct_type_name like", value, "acctTypeName");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNameNotLike(String value) {
            addCriterion("acct_type_name not like", value, "acctTypeName");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNameIn(List<String> values) {
            addCriterion("acct_type_name in", values, "acctTypeName");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNameNotIn(List<String> values) {
            addCriterion("acct_type_name not in", values, "acctTypeName");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNameBetween(String value1, String value2) {
            addCriterion("acct_type_name between", value1, value2, "acctTypeName");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNameNotBetween(String value1, String value2) {
            addCriterion("acct_type_name not between", value1, value2, "acctTypeName");
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

        public Criteria andUserTypeIsNull() {
            addCriterion("user_type is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("user_type is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(String value) {
            addCriterion("user_type =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(String value) {
            addCriterion("user_type <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(String value) {
            addCriterion("user_type >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(String value) {
            addCriterion("user_type >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(String value) {
            addCriterion("user_type <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(String value) {
            addCriterion("user_type <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLike(String value) {
            addCriterion("user_type like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotLike(String value) {
            addCriterion("user_type not like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<String> values) {
            addCriterion("user_type in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<String> values) {
            addCriterion("user_type not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(String value1, String value2) {
            addCriterion("user_type between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(String value1, String value2) {
            addCriterion("user_type not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andAcctDirIsNull() {
            addCriterion("acct_dir is null");
            return (Criteria) this;
        }

        public Criteria andAcctDirIsNotNull() {
            addCriterion("acct_dir is not null");
            return (Criteria) this;
        }

        public Criteria andAcctDirEqualTo(String value) {
            addCriterion("acct_dir =", value, "acctDir");
            return (Criteria) this;
        }

        public Criteria andAcctDirNotEqualTo(String value) {
            addCriterion("acct_dir <>", value, "acctDir");
            return (Criteria) this;
        }

        public Criteria andAcctDirGreaterThan(String value) {
            addCriterion("acct_dir >", value, "acctDir");
            return (Criteria) this;
        }

        public Criteria andAcctDirGreaterThanOrEqualTo(String value) {
            addCriterion("acct_dir >=", value, "acctDir");
            return (Criteria) this;
        }

        public Criteria andAcctDirLessThan(String value) {
            addCriterion("acct_dir <", value, "acctDir");
            return (Criteria) this;
        }

        public Criteria andAcctDirLessThanOrEqualTo(String value) {
            addCriterion("acct_dir <=", value, "acctDir");
            return (Criteria) this;
        }

        public Criteria andAcctDirLike(String value) {
            addCriterion("acct_dir like", value, "acctDir");
            return (Criteria) this;
        }

        public Criteria andAcctDirNotLike(String value) {
            addCriterion("acct_dir not like", value, "acctDir");
            return (Criteria) this;
        }

        public Criteria andAcctDirIn(List<String> values) {
            addCriterion("acct_dir in", values, "acctDir");
            return (Criteria) this;
        }

        public Criteria andAcctDirNotIn(List<String> values) {
            addCriterion("acct_dir not in", values, "acctDir");
            return (Criteria) this;
        }

        public Criteria andAcctDirBetween(String value1, String value2) {
            addCriterion("acct_dir between", value1, value2, "acctDir");
            return (Criteria) this;
        }

        public Criteria andAcctDirNotBetween(String value1, String value2) {
            addCriterion("acct_dir not between", value1, value2, "acctDir");
            return (Criteria) this;
        }

        public Criteria andAcctIncIsNull() {
            addCriterion("acct_inc is null");
            return (Criteria) this;
        }

        public Criteria andAcctIncIsNotNull() {
            addCriterion("acct_inc is not null");
            return (Criteria) this;
        }

        public Criteria andAcctIncEqualTo(String value) {
            addCriterion("acct_inc =", value, "acctInc");
            return (Criteria) this;
        }

        public Criteria andAcctIncNotEqualTo(String value) {
            addCriterion("acct_inc <>", value, "acctInc");
            return (Criteria) this;
        }

        public Criteria andAcctIncGreaterThan(String value) {
            addCriterion("acct_inc >", value, "acctInc");
            return (Criteria) this;
        }

        public Criteria andAcctIncGreaterThanOrEqualTo(String value) {
            addCriterion("acct_inc >=", value, "acctInc");
            return (Criteria) this;
        }

        public Criteria andAcctIncLessThan(String value) {
            addCriterion("acct_inc <", value, "acctInc");
            return (Criteria) this;
        }

        public Criteria andAcctIncLessThanOrEqualTo(String value) {
            addCriterion("acct_inc <=", value, "acctInc");
            return (Criteria) this;
        }

        public Criteria andAcctIncLike(String value) {
            addCriterion("acct_inc like", value, "acctInc");
            return (Criteria) this;
        }

        public Criteria andAcctIncNotLike(String value) {
            addCriterion("acct_inc not like", value, "acctInc");
            return (Criteria) this;
        }

        public Criteria andAcctIncIn(List<String> values) {
            addCriterion("acct_inc in", values, "acctInc");
            return (Criteria) this;
        }

        public Criteria andAcctIncNotIn(List<String> values) {
            addCriterion("acct_inc not in", values, "acctInc");
            return (Criteria) this;
        }

        public Criteria andAcctIncBetween(String value1, String value2) {
            addCriterion("acct_inc between", value1, value2, "acctInc");
            return (Criteria) this;
        }

        public Criteria andAcctIncNotBetween(String value1, String value2) {
            addCriterion("acct_inc not between", value1, value2, "acctInc");
            return (Criteria) this;
        }

        public Criteria andAcctRedIsNull() {
            addCriterion("acct_red is null");
            return (Criteria) this;
        }

        public Criteria andAcctRedIsNotNull() {
            addCriterion("acct_red is not null");
            return (Criteria) this;
        }

        public Criteria andAcctRedEqualTo(String value) {
            addCriterion("acct_red =", value, "acctRed");
            return (Criteria) this;
        }

        public Criteria andAcctRedNotEqualTo(String value) {
            addCriterion("acct_red <>", value, "acctRed");
            return (Criteria) this;
        }

        public Criteria andAcctRedGreaterThan(String value) {
            addCriterion("acct_red >", value, "acctRed");
            return (Criteria) this;
        }

        public Criteria andAcctRedGreaterThanOrEqualTo(String value) {
            addCriterion("acct_red >=", value, "acctRed");
            return (Criteria) this;
        }

        public Criteria andAcctRedLessThan(String value) {
            addCriterion("acct_red <", value, "acctRed");
            return (Criteria) this;
        }

        public Criteria andAcctRedLessThanOrEqualTo(String value) {
            addCriterion("acct_red <=", value, "acctRed");
            return (Criteria) this;
        }

        public Criteria andAcctRedLike(String value) {
            addCriterion("acct_red like", value, "acctRed");
            return (Criteria) this;
        }

        public Criteria andAcctRedNotLike(String value) {
            addCriterion("acct_red not like", value, "acctRed");
            return (Criteria) this;
        }

        public Criteria andAcctRedIn(List<String> values) {
            addCriterion("acct_red in", values, "acctRed");
            return (Criteria) this;
        }

        public Criteria andAcctRedNotIn(List<String> values) {
            addCriterion("acct_red not in", values, "acctRed");
            return (Criteria) this;
        }

        public Criteria andAcctRedBetween(String value1, String value2) {
            addCriterion("acct_red between", value1, value2, "acctRed");
            return (Criteria) this;
        }

        public Criteria andAcctRedNotBetween(String value1, String value2) {
            addCriterion("acct_red not between", value1, value2, "acctRed");
            return (Criteria) this;
        }

        public Criteria andAcctAutoIsNull() {
            addCriterion("acct_auto is null");
            return (Criteria) this;
        }

        public Criteria andAcctAutoIsNotNull() {
            addCriterion("acct_auto is not null");
            return (Criteria) this;
        }

        public Criteria andAcctAutoEqualTo(String value) {
            addCriterion("acct_auto =", value, "acctAuto");
            return (Criteria) this;
        }

        public Criteria andAcctAutoNotEqualTo(String value) {
            addCriterion("acct_auto <>", value, "acctAuto");
            return (Criteria) this;
        }

        public Criteria andAcctAutoGreaterThan(String value) {
            addCriterion("acct_auto >", value, "acctAuto");
            return (Criteria) this;
        }

        public Criteria andAcctAutoGreaterThanOrEqualTo(String value) {
            addCriterion("acct_auto >=", value, "acctAuto");
            return (Criteria) this;
        }

        public Criteria andAcctAutoLessThan(String value) {
            addCriterion("acct_auto <", value, "acctAuto");
            return (Criteria) this;
        }

        public Criteria andAcctAutoLessThanOrEqualTo(String value) {
            addCriterion("acct_auto <=", value, "acctAuto");
            return (Criteria) this;
        }

        public Criteria andAcctAutoLike(String value) {
            addCriterion("acct_auto like", value, "acctAuto");
            return (Criteria) this;
        }

        public Criteria andAcctAutoNotLike(String value) {
            addCriterion("acct_auto not like", value, "acctAuto");
            return (Criteria) this;
        }

        public Criteria andAcctAutoIn(List<String> values) {
            addCriterion("acct_auto in", values, "acctAuto");
            return (Criteria) this;
        }

        public Criteria andAcctAutoNotIn(List<String> values) {
            addCriterion("acct_auto not in", values, "acctAuto");
            return (Criteria) this;
        }

        public Criteria andAcctAutoBetween(String value1, String value2) {
            addCriterion("acct_auto between", value1, value2, "acctAuto");
            return (Criteria) this;
        }

        public Criteria andAcctAutoNotBetween(String value1, String value2) {
            addCriterion("acct_auto not between", value1, value2, "acctAuto");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNoLikeInsensitive(String value) {
            addCriterion("upper(acct_type_no) like", value.toUpperCase(), "acctTypeNo");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNameLikeInsensitive(String value) {
            addCriterion("upper(acct_type_name) like", value.toUpperCase(), "acctTypeName");
            return (Criteria) this;
        }

        public Criteria andCurrNoLikeInsensitive(String value) {
            addCriterion("upper(curr_no) like", value.toUpperCase(), "currNo");
            return (Criteria) this;
        }

        public Criteria andUserTypeLikeInsensitive(String value) {
            addCriterion("upper(user_type) like", value.toUpperCase(), "userType");
            return (Criteria) this;
        }

        public Criteria andAcctDirLikeInsensitive(String value) {
            addCriterion("upper(acct_dir) like", value.toUpperCase(), "acctDir");
            return (Criteria) this;
        }

        public Criteria andAcctIncLikeInsensitive(String value) {
            addCriterion("upper(acct_inc) like", value.toUpperCase(), "acctInc");
            return (Criteria) this;
        }

        public Criteria andAcctRedLikeInsensitive(String value) {
            addCriterion("upper(acct_red) like", value.toUpperCase(), "acctRed");
            return (Criteria) this;
        }

        public Criteria andAcctAutoLikeInsensitive(String value) {
            addCriterion("upper(acct_auto) like", value.toUpperCase(), "acctAuto");
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