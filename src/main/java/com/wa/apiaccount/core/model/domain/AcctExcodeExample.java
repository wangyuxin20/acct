package com.wa.apiaccount.core.model.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AcctExcodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AcctExcodeExample() {
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

        public Criteria andExSimpleIsNull() {
            addCriterion("ex_simple is null");
            return (Criteria) this;
        }

        public Criteria andExSimpleIsNotNull() {
            addCriterion("ex_simple is not null");
            return (Criteria) this;
        }

        public Criteria andExSimpleEqualTo(String value) {
            addCriterion("ex_simple =", value, "exSimple");
            return (Criteria) this;
        }

        public Criteria andExSimpleNotEqualTo(String value) {
            addCriterion("ex_simple <>", value, "exSimple");
            return (Criteria) this;
        }

        public Criteria andExSimpleGreaterThan(String value) {
            addCriterion("ex_simple >", value, "exSimple");
            return (Criteria) this;
        }

        public Criteria andExSimpleGreaterThanOrEqualTo(String value) {
            addCriterion("ex_simple >=", value, "exSimple");
            return (Criteria) this;
        }

        public Criteria andExSimpleLessThan(String value) {
            addCriterion("ex_simple <", value, "exSimple");
            return (Criteria) this;
        }

        public Criteria andExSimpleLessThanOrEqualTo(String value) {
            addCriterion("ex_simple <=", value, "exSimple");
            return (Criteria) this;
        }

        public Criteria andExSimpleLike(String value) {
            addCriterion("ex_simple like", value, "exSimple");
            return (Criteria) this;
        }

        public Criteria andExSimpleNotLike(String value) {
            addCriterion("ex_simple not like", value, "exSimple");
            return (Criteria) this;
        }

        public Criteria andExSimpleIn(List<String> values) {
            addCriterion("ex_simple in", values, "exSimple");
            return (Criteria) this;
        }

        public Criteria andExSimpleNotIn(List<String> values) {
            addCriterion("ex_simple not in", values, "exSimple");
            return (Criteria) this;
        }

        public Criteria andExSimpleBetween(String value1, String value2) {
            addCriterion("ex_simple between", value1, value2, "exSimple");
            return (Criteria) this;
        }

        public Criteria andExSimpleNotBetween(String value1, String value2) {
            addCriterion("ex_simple not between", value1, value2, "exSimple");
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

        public Criteria andExStatusIsNull() {
            addCriterion("ex_status is null");
            return (Criteria) this;
        }

        public Criteria andExStatusIsNotNull() {
            addCriterion("ex_status is not null");
            return (Criteria) this;
        }

        public Criteria andExStatusEqualTo(String value) {
            addCriterion("ex_status =", value, "exStatus");
            return (Criteria) this;
        }

        public Criteria andExStatusNotEqualTo(String value) {
            addCriterion("ex_status <>", value, "exStatus");
            return (Criteria) this;
        }

        public Criteria andExStatusGreaterThan(String value) {
            addCriterion("ex_status >", value, "exStatus");
            return (Criteria) this;
        }

        public Criteria andExStatusGreaterThanOrEqualTo(String value) {
            addCriterion("ex_status >=", value, "exStatus");
            return (Criteria) this;
        }

        public Criteria andExStatusLessThan(String value) {
            addCriterion("ex_status <", value, "exStatus");
            return (Criteria) this;
        }

        public Criteria andExStatusLessThanOrEqualTo(String value) {
            addCriterion("ex_status <=", value, "exStatus");
            return (Criteria) this;
        }

        public Criteria andExStatusLike(String value) {
            addCriterion("ex_status like", value, "exStatus");
            return (Criteria) this;
        }

        public Criteria andExStatusNotLike(String value) {
            addCriterion("ex_status not like", value, "exStatus");
            return (Criteria) this;
        }

        public Criteria andExStatusIn(List<String> values) {
            addCriterion("ex_status in", values, "exStatus");
            return (Criteria) this;
        }

        public Criteria andExStatusNotIn(List<String> values) {
            addCriterion("ex_status not in", values, "exStatus");
            return (Criteria) this;
        }

        public Criteria andExStatusBetween(String value1, String value2) {
            addCriterion("ex_status between", value1, value2, "exStatus");
            return (Criteria) this;
        }

        public Criteria andExStatusNotBetween(String value1, String value2) {
            addCriterion("ex_status not between", value1, value2, "exStatus");
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

        public Criteria andCurrCodeIsNull() {
            addCriterion("curr_code is null");
            return (Criteria) this;
        }

        public Criteria andCurrCodeIsNotNull() {
            addCriterion("curr_code is not null");
            return (Criteria) this;
        }

        public Criteria andCurrCodeEqualTo(Integer value) {
            addCriterion("curr_code =", value, "currCode");
            return (Criteria) this;
        }

        public Criteria andCurrCodeNotEqualTo(Integer value) {
            addCriterion("curr_code <>", value, "currCode");
            return (Criteria) this;
        }

        public Criteria andCurrCodeGreaterThan(Integer value) {
            addCriterion("curr_code >", value, "currCode");
            return (Criteria) this;
        }

        public Criteria andCurrCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("curr_code >=", value, "currCode");
            return (Criteria) this;
        }

        public Criteria andCurrCodeLessThan(Integer value) {
            addCriterion("curr_code <", value, "currCode");
            return (Criteria) this;
        }

        public Criteria andCurrCodeLessThanOrEqualTo(Integer value) {
            addCriterion("curr_code <=", value, "currCode");
            return (Criteria) this;
        }

        public Criteria andCurrCodeIn(List<Integer> values) {
            addCriterion("curr_code in", values, "currCode");
            return (Criteria) this;
        }

        public Criteria andCurrCodeNotIn(List<Integer> values) {
            addCriterion("curr_code not in", values, "currCode");
            return (Criteria) this;
        }

        public Criteria andCurrCodeBetween(Integer value1, Integer value2) {
            addCriterion("curr_code between", value1, value2, "currCode");
            return (Criteria) this;
        }

        public Criteria andCurrCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("curr_code not between", value1, value2, "currCode");
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

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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

        public Criteria andExSimpleLikeInsensitive(String value) {
            addCriterion("upper(ex_simple) like", value.toUpperCase(), "exSimple");
            return (Criteria) this;
        }

        public Criteria andExTypeLikeInsensitive(String value) {
            addCriterion("upper(ex_type) like", value.toUpperCase(), "exType");
            return (Criteria) this;
        }

        public Criteria andExStatusLikeInsensitive(String value) {
            addCriterion("upper(ex_status) like", value.toUpperCase(), "exStatus");
            return (Criteria) this;
        }

        public Criteria andCurrNoLikeInsensitive(String value) {
            addCriterion("upper(curr_no) like", value.toUpperCase(), "currNo");
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