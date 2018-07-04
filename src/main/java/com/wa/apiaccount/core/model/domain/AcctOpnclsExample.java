package com.wa.apiaccount.core.model.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AcctOpnclsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AcctOpnclsExample() {
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

        public Criteria andRequestIdIsNull() {
            addCriterion("request_id is null");
            return (Criteria) this;
        }

        public Criteria andRequestIdIsNotNull() {
            addCriterion("request_id is not null");
            return (Criteria) this;
        }

        public Criteria andRequestIdEqualTo(String value) {
            addCriterion("request_id =", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdNotEqualTo(String value) {
            addCriterion("request_id <>", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdGreaterThan(String value) {
            addCriterion("request_id >", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdGreaterThanOrEqualTo(String value) {
            addCriterion("request_id >=", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdLessThan(String value) {
            addCriterion("request_id <", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdLessThanOrEqualTo(String value) {
            addCriterion("request_id <=", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdLike(String value) {
            addCriterion("request_id like", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdNotLike(String value) {
            addCriterion("request_id not like", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdIn(List<String> values) {
            addCriterion("request_id in", values, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdNotIn(List<String> values) {
            addCriterion("request_id not in", values, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdBetween(String value1, String value2) {
            addCriterion("request_id between", value1, value2, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdNotBetween(String value1, String value2) {
            addCriterion("request_id not between", value1, value2, "requestId");
            return (Criteria) this;
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

        public Criteria andOpenDateIsNull() {
            addCriterion("open_date is null");
            return (Criteria) this;
        }

        public Criteria andOpenDateIsNotNull() {
            addCriterion("open_date is not null");
            return (Criteria) this;
        }

        public Criteria andOpenDateEqualTo(Date value) {
            addCriterion("open_date =", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateNotEqualTo(Date value) {
            addCriterion("open_date <>", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateGreaterThan(Date value) {
            addCriterion("open_date >", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateGreaterThanOrEqualTo(Date value) {
            addCriterion("open_date >=", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateLessThan(Date value) {
            addCriterion("open_date <", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateLessThanOrEqualTo(Date value) {
            addCriterion("open_date <=", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateIn(List<Date> values) {
            addCriterion("open_date in", values, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateNotIn(List<Date> values) {
            addCriterion("open_date not in", values, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateBetween(Date value1, Date value2) {
            addCriterion("open_date between", value1, value2, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateNotBetween(Date value1, Date value2) {
            addCriterion("open_date not between", value1, value2, "openDate");
            return (Criteria) this;
        }

        public Criteria andAcctStateIsNull() {
            addCriterion("acct_state is null");
            return (Criteria) this;
        }

        public Criteria andAcctStateIsNotNull() {
            addCriterion("acct_state is not null");
            return (Criteria) this;
        }

        public Criteria andAcctStateEqualTo(String value) {
            addCriterion("acct_state =", value, "acctState");
            return (Criteria) this;
        }

        public Criteria andAcctStateNotEqualTo(String value) {
            addCriterion("acct_state <>", value, "acctState");
            return (Criteria) this;
        }

        public Criteria andAcctStateGreaterThan(String value) {
            addCriterion("acct_state >", value, "acctState");
            return (Criteria) this;
        }

        public Criteria andAcctStateGreaterThanOrEqualTo(String value) {
            addCriterion("acct_state >=", value, "acctState");
            return (Criteria) this;
        }

        public Criteria andAcctStateLessThan(String value) {
            addCriterion("acct_state <", value, "acctState");
            return (Criteria) this;
        }

        public Criteria andAcctStateLessThanOrEqualTo(String value) {
            addCriterion("acct_state <=", value, "acctState");
            return (Criteria) this;
        }

        public Criteria andAcctStateLike(String value) {
            addCriterion("acct_state like", value, "acctState");
            return (Criteria) this;
        }

        public Criteria andAcctStateNotLike(String value) {
            addCriterion("acct_state not like", value, "acctState");
            return (Criteria) this;
        }

        public Criteria andAcctStateIn(List<String> values) {
            addCriterion("acct_state in", values, "acctState");
            return (Criteria) this;
        }

        public Criteria andAcctStateNotIn(List<String> values) {
            addCriterion("acct_state not in", values, "acctState");
            return (Criteria) this;
        }

        public Criteria andAcctStateBetween(String value1, String value2) {
            addCriterion("acct_state between", value1, value2, "acctState");
            return (Criteria) this;
        }

        public Criteria andAcctStateNotBetween(String value1, String value2) {
            addCriterion("acct_state not between", value1, value2, "acctState");
            return (Criteria) this;
        }

        public Criteria andCloseDateIsNull() {
            addCriterion("close_date is null");
            return (Criteria) this;
        }

        public Criteria andCloseDateIsNotNull() {
            addCriterion("close_date is not null");
            return (Criteria) this;
        }

        public Criteria andCloseDateEqualTo(Date value) {
            addCriterion("close_date =", value, "closeDate");
            return (Criteria) this;
        }

        public Criteria andCloseDateNotEqualTo(Date value) {
            addCriterion("close_date <>", value, "closeDate");
            return (Criteria) this;
        }

        public Criteria andCloseDateGreaterThan(Date value) {
            addCriterion("close_date >", value, "closeDate");
            return (Criteria) this;
        }

        public Criteria andCloseDateGreaterThanOrEqualTo(Date value) {
            addCriterion("close_date >=", value, "closeDate");
            return (Criteria) this;
        }

        public Criteria andCloseDateLessThan(Date value) {
            addCriterion("close_date <", value, "closeDate");
            return (Criteria) this;
        }

        public Criteria andCloseDateLessThanOrEqualTo(Date value) {
            addCriterion("close_date <=", value, "closeDate");
            return (Criteria) this;
        }

        public Criteria andCloseDateIn(List<Date> values) {
            addCriterion("close_date in", values, "closeDate");
            return (Criteria) this;
        }

        public Criteria andCloseDateNotIn(List<Date> values) {
            addCriterion("close_date not in", values, "closeDate");
            return (Criteria) this;
        }

        public Criteria andCloseDateBetween(Date value1, Date value2) {
            addCriterion("close_date between", value1, value2, "closeDate");
            return (Criteria) this;
        }

        public Criteria andCloseDateNotBetween(Date value1, Date value2) {
            addCriterion("close_date not between", value1, value2, "closeDate");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andRequestIdLikeInsensitive(String value) {
            addCriterion("upper(request_id) like", value.toUpperCase(), "requestId");
            return (Criteria) this;
        }

        public Criteria andAcctNoLikeInsensitive(String value) {
            addCriterion("upper(acct_no) like", value.toUpperCase(), "acctNo");
            return (Criteria) this;
        }

        public Criteria andAcctStateLikeInsensitive(String value) {
            addCriterion("upper(acct_state) like", value.toUpperCase(), "acctState");
            return (Criteria) this;
        }

        public Criteria andNoteLikeInsensitive(String value) {
            addCriterion("upper(note) like", value.toUpperCase(), "note");
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