package com.wd.apiaccount.model.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AcctErrExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AcctErrExample() {
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

        public Criteria andErrTimeIsNull() {
            addCriterion("err_time is null");
            return (Criteria) this;
        }

        public Criteria andErrTimeIsNotNull() {
            addCriterion("err_time is not null");
            return (Criteria) this;
        }

        public Criteria andErrTimeEqualTo(Date value) {
            addCriterion("err_time =", value, "errTime");
            return (Criteria) this;
        }

        public Criteria andErrTimeNotEqualTo(Date value) {
            addCriterion("err_time <>", value, "errTime");
            return (Criteria) this;
        }

        public Criteria andErrTimeGreaterThan(Date value) {
            addCriterion("err_time >", value, "errTime");
            return (Criteria) this;
        }

        public Criteria andErrTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("err_time >=", value, "errTime");
            return (Criteria) this;
        }

        public Criteria andErrTimeLessThan(Date value) {
            addCriterion("err_time <", value, "errTime");
            return (Criteria) this;
        }

        public Criteria andErrTimeLessThanOrEqualTo(Date value) {
            addCriterion("err_time <=", value, "errTime");
            return (Criteria) this;
        }

        public Criteria andErrTimeIn(List<Date> values) {
            addCriterion("err_time in", values, "errTime");
            return (Criteria) this;
        }

        public Criteria andErrTimeNotIn(List<Date> values) {
            addCriterion("err_time not in", values, "errTime");
            return (Criteria) this;
        }

        public Criteria andErrTimeBetween(Date value1, Date value2) {
            addCriterion("err_time between", value1, value2, "errTime");
            return (Criteria) this;
        }

        public Criteria andErrTimeNotBetween(Date value1, Date value2) {
            addCriterion("err_time not between", value1, value2, "errTime");
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

        public Criteria andErrCodeIsNull() {
            addCriterion("err_code is null");
            return (Criteria) this;
        }

        public Criteria andErrCodeIsNotNull() {
            addCriterion("err_code is not null");
            return (Criteria) this;
        }

        public Criteria andErrCodeEqualTo(Integer value) {
            addCriterion("err_code =", value, "errCode");
            return (Criteria) this;
        }

        public Criteria andErrCodeNotEqualTo(Integer value) {
            addCriterion("err_code <>", value, "errCode");
            return (Criteria) this;
        }

        public Criteria andErrCodeGreaterThan(Integer value) {
            addCriterion("err_code >", value, "errCode");
            return (Criteria) this;
        }

        public Criteria andErrCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("err_code >=", value, "errCode");
            return (Criteria) this;
        }

        public Criteria andErrCodeLessThan(Integer value) {
            addCriterion("err_code <", value, "errCode");
            return (Criteria) this;
        }

        public Criteria andErrCodeLessThanOrEqualTo(Integer value) {
            addCriterion("err_code <=", value, "errCode");
            return (Criteria) this;
        }

        public Criteria andErrCodeIn(List<Integer> values) {
            addCriterion("err_code in", values, "errCode");
            return (Criteria) this;
        }

        public Criteria andErrCodeNotIn(List<Integer> values) {
            addCriterion("err_code not in", values, "errCode");
            return (Criteria) this;
        }

        public Criteria andErrCodeBetween(Integer value1, Integer value2) {
            addCriterion("err_code between", value1, value2, "errCode");
            return (Criteria) this;
        }

        public Criteria andErrCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("err_code not between", value1, value2, "errCode");
            return (Criteria) this;
        }

        public Criteria andErrMessageIsNull() {
            addCriterion("err_message is null");
            return (Criteria) this;
        }

        public Criteria andErrMessageIsNotNull() {
            addCriterion("err_message is not null");
            return (Criteria) this;
        }

        public Criteria andErrMessageEqualTo(String value) {
            addCriterion("err_message =", value, "errMessage");
            return (Criteria) this;
        }

        public Criteria andErrMessageNotEqualTo(String value) {
            addCriterion("err_message <>", value, "errMessage");
            return (Criteria) this;
        }

        public Criteria andErrMessageGreaterThan(String value) {
            addCriterion("err_message >", value, "errMessage");
            return (Criteria) this;
        }

        public Criteria andErrMessageGreaterThanOrEqualTo(String value) {
            addCriterion("err_message >=", value, "errMessage");
            return (Criteria) this;
        }

        public Criteria andErrMessageLessThan(String value) {
            addCriterion("err_message <", value, "errMessage");
            return (Criteria) this;
        }

        public Criteria andErrMessageLessThanOrEqualTo(String value) {
            addCriterion("err_message <=", value, "errMessage");
            return (Criteria) this;
        }

        public Criteria andErrMessageLike(String value) {
            addCriterion("err_message like", value, "errMessage");
            return (Criteria) this;
        }

        public Criteria andErrMessageNotLike(String value) {
            addCriterion("err_message not like", value, "errMessage");
            return (Criteria) this;
        }

        public Criteria andErrMessageIn(List<String> values) {
            addCriterion("err_message in", values, "errMessage");
            return (Criteria) this;
        }

        public Criteria andErrMessageNotIn(List<String> values) {
            addCriterion("err_message not in", values, "errMessage");
            return (Criteria) this;
        }

        public Criteria andErrMessageBetween(String value1, String value2) {
            addCriterion("err_message between", value1, value2, "errMessage");
            return (Criteria) this;
        }

        public Criteria andErrMessageNotBetween(String value1, String value2) {
            addCriterion("err_message not between", value1, value2, "errMessage");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andRequestIdLikeInsensitive(String value) {
            addCriterion("upper(request_id) like", value.toUpperCase(), "requestId");
            return (Criteria) this;
        }

        public Criteria andErrMessageLikeInsensitive(String value) {
            addCriterion("upper(err_message) like", value.toUpperCase(), "errMessage");
            return (Criteria) this;
        }

        public Criteria andStateLikeInsensitive(String value) {
            addCriterion("upper(state) like", value.toUpperCase(), "state");
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