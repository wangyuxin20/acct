package com.wd.apiaccount.model.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AcctClusterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AcctClusterExample() {
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

        public Criteria andHostNameIsNull() {
            addCriterion("host_name is null");
            return (Criteria) this;
        }

        public Criteria andHostNameIsNotNull() {
            addCriterion("host_name is not null");
            return (Criteria) this;
        }

        public Criteria andHostNameEqualTo(String value) {
            addCriterion("host_name =", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameNotEqualTo(String value) {
            addCriterion("host_name <>", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameGreaterThan(String value) {
            addCriterion("host_name >", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameGreaterThanOrEqualTo(String value) {
            addCriterion("host_name >=", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameLessThan(String value) {
            addCriterion("host_name <", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameLessThanOrEqualTo(String value) {
            addCriterion("host_name <=", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameLike(String value) {
            addCriterion("host_name like", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameNotLike(String value) {
            addCriterion("host_name not like", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameIn(List<String> values) {
            addCriterion("host_name in", values, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameNotIn(List<String> values) {
            addCriterion("host_name not in", values, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameBetween(String value1, String value2) {
            addCriterion("host_name between", value1, value2, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameNotBetween(String value1, String value2) {
            addCriterion("host_name not between", value1, value2, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostAddressIsNull() {
            addCriterion("host_address is null");
            return (Criteria) this;
        }

        public Criteria andHostAddressIsNotNull() {
            addCriterion("host_address is not null");
            return (Criteria) this;
        }

        public Criteria andHostAddressEqualTo(String value) {
            addCriterion("host_address =", value, "hostAddress");
            return (Criteria) this;
        }

        public Criteria andHostAddressNotEqualTo(String value) {
            addCriterion("host_address <>", value, "hostAddress");
            return (Criteria) this;
        }

        public Criteria andHostAddressGreaterThan(String value) {
            addCriterion("host_address >", value, "hostAddress");
            return (Criteria) this;
        }

        public Criteria andHostAddressGreaterThanOrEqualTo(String value) {
            addCriterion("host_address >=", value, "hostAddress");
            return (Criteria) this;
        }

        public Criteria andHostAddressLessThan(String value) {
            addCriterion("host_address <", value, "hostAddress");
            return (Criteria) this;
        }

        public Criteria andHostAddressLessThanOrEqualTo(String value) {
            addCriterion("host_address <=", value, "hostAddress");
            return (Criteria) this;
        }

        public Criteria andHostAddressLike(String value) {
            addCriterion("host_address like", value, "hostAddress");
            return (Criteria) this;
        }

        public Criteria andHostAddressNotLike(String value) {
            addCriterion("host_address not like", value, "hostAddress");
            return (Criteria) this;
        }

        public Criteria andHostAddressIn(List<String> values) {
            addCriterion("host_address in", values, "hostAddress");
            return (Criteria) this;
        }

        public Criteria andHostAddressNotIn(List<String> values) {
            addCriterion("host_address not in", values, "hostAddress");
            return (Criteria) this;
        }

        public Criteria andHostAddressBetween(String value1, String value2) {
            addCriterion("host_address between", value1, value2, "hostAddress");
            return (Criteria) this;
        }

        public Criteria andHostAddressNotBetween(String value1, String value2) {
            addCriterion("host_address not between", value1, value2, "hostAddress");
            return (Criteria) this;
        }

        public Criteria andHostStatusIsNull() {
            addCriterion("host_status is null");
            return (Criteria) this;
        }

        public Criteria andHostStatusIsNotNull() {
            addCriterion("host_status is not null");
            return (Criteria) this;
        }

        public Criteria andHostStatusEqualTo(String value) {
            addCriterion("host_status =", value, "hostStatus");
            return (Criteria) this;
        }

        public Criteria andHostStatusNotEqualTo(String value) {
            addCriterion("host_status <>", value, "hostStatus");
            return (Criteria) this;
        }

        public Criteria andHostStatusGreaterThan(String value) {
            addCriterion("host_status >", value, "hostStatus");
            return (Criteria) this;
        }

        public Criteria andHostStatusGreaterThanOrEqualTo(String value) {
            addCriterion("host_status >=", value, "hostStatus");
            return (Criteria) this;
        }

        public Criteria andHostStatusLessThan(String value) {
            addCriterion("host_status <", value, "hostStatus");
            return (Criteria) this;
        }

        public Criteria andHostStatusLessThanOrEqualTo(String value) {
            addCriterion("host_status <=", value, "hostStatus");
            return (Criteria) this;
        }

        public Criteria andHostStatusLike(String value) {
            addCriterion("host_status like", value, "hostStatus");
            return (Criteria) this;
        }

        public Criteria andHostStatusNotLike(String value) {
            addCriterion("host_status not like", value, "hostStatus");
            return (Criteria) this;
        }

        public Criteria andHostStatusIn(List<String> values) {
            addCriterion("host_status in", values, "hostStatus");
            return (Criteria) this;
        }

        public Criteria andHostStatusNotIn(List<String> values) {
            addCriterion("host_status not in", values, "hostStatus");
            return (Criteria) this;
        }

        public Criteria andHostStatusBetween(String value1, String value2) {
            addCriterion("host_status between", value1, value2, "hostStatus");
            return (Criteria) this;
        }

        public Criteria andHostStatusNotBetween(String value1, String value2) {
            addCriterion("host_status not between", value1, value2, "hostStatus");
            return (Criteria) this;
        }

        public Criteria andInsertTimeIsNull() {
            addCriterion("insert_time is null");
            return (Criteria) this;
        }

        public Criteria andInsertTimeIsNotNull() {
            addCriterion("insert_time is not null");
            return (Criteria) this;
        }

        public Criteria andInsertTimeEqualTo(Date value) {
            addCriterion("insert_time =", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeNotEqualTo(Date value) {
            addCriterion("insert_time <>", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeGreaterThan(Date value) {
            addCriterion("insert_time >", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("insert_time >=", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeLessThan(Date value) {
            addCriterion("insert_time <", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeLessThanOrEqualTo(Date value) {
            addCriterion("insert_time <=", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeIn(List<Date> values) {
            addCriterion("insert_time in", values, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeNotIn(List<Date> values) {
            addCriterion("insert_time not in", values, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeBetween(Date value1, Date value2) {
            addCriterion("insert_time between", value1, value2, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeNotBetween(Date value1, Date value2) {
            addCriterion("insert_time not between", value1, value2, "insertTime");
            return (Criteria) this;
        }

        public Criteria andCanonicalHostNameIsNull() {
            addCriterion("canonical_host_name is null");
            return (Criteria) this;
        }

        public Criteria andCanonicalHostNameIsNotNull() {
            addCriterion("canonical_host_name is not null");
            return (Criteria) this;
        }

        public Criteria andCanonicalHostNameEqualTo(String value) {
            addCriterion("canonical_host_name =", value, "canonicalHostName");
            return (Criteria) this;
        }

        public Criteria andCanonicalHostNameNotEqualTo(String value) {
            addCriterion("canonical_host_name <>", value, "canonicalHostName");
            return (Criteria) this;
        }

        public Criteria andCanonicalHostNameGreaterThan(String value) {
            addCriterion("canonical_host_name >", value, "canonicalHostName");
            return (Criteria) this;
        }

        public Criteria andCanonicalHostNameGreaterThanOrEqualTo(String value) {
            addCriterion("canonical_host_name >=", value, "canonicalHostName");
            return (Criteria) this;
        }

        public Criteria andCanonicalHostNameLessThan(String value) {
            addCriterion("canonical_host_name <", value, "canonicalHostName");
            return (Criteria) this;
        }

        public Criteria andCanonicalHostNameLessThanOrEqualTo(String value) {
            addCriterion("canonical_host_name <=", value, "canonicalHostName");
            return (Criteria) this;
        }

        public Criteria andCanonicalHostNameLike(String value) {
            addCriterion("canonical_host_name like", value, "canonicalHostName");
            return (Criteria) this;
        }

        public Criteria andCanonicalHostNameNotLike(String value) {
            addCriterion("canonical_host_name not like", value, "canonicalHostName");
            return (Criteria) this;
        }

        public Criteria andCanonicalHostNameIn(List<String> values) {
            addCriterion("canonical_host_name in", values, "canonicalHostName");
            return (Criteria) this;
        }

        public Criteria andCanonicalHostNameNotIn(List<String> values) {
            addCriterion("canonical_host_name not in", values, "canonicalHostName");
            return (Criteria) this;
        }

        public Criteria andCanonicalHostNameBetween(String value1, String value2) {
            addCriterion("canonical_host_name between", value1, value2, "canonicalHostName");
            return (Criteria) this;
        }

        public Criteria andCanonicalHostNameNotBetween(String value1, String value2) {
            addCriterion("canonical_host_name not between", value1, value2, "canonicalHostName");
            return (Criteria) this;
        }

        public Criteria andHostEditCacheIsNull() {
            addCriterion("host_edit_cache is null");
            return (Criteria) this;
        }

        public Criteria andHostEditCacheIsNotNull() {
            addCriterion("host_edit_cache is not null");
            return (Criteria) this;
        }

        public Criteria andHostEditCacheEqualTo(String value) {
            addCriterion("host_edit_cache =", value, "hostEditCache");
            return (Criteria) this;
        }

        public Criteria andHostEditCacheNotEqualTo(String value) {
            addCriterion("host_edit_cache <>", value, "hostEditCache");
            return (Criteria) this;
        }

        public Criteria andHostEditCacheGreaterThan(String value) {
            addCriterion("host_edit_cache >", value, "hostEditCache");
            return (Criteria) this;
        }

        public Criteria andHostEditCacheGreaterThanOrEqualTo(String value) {
            addCriterion("host_edit_cache >=", value, "hostEditCache");
            return (Criteria) this;
        }

        public Criteria andHostEditCacheLessThan(String value) {
            addCriterion("host_edit_cache <", value, "hostEditCache");
            return (Criteria) this;
        }

        public Criteria andHostEditCacheLessThanOrEqualTo(String value) {
            addCriterion("host_edit_cache <=", value, "hostEditCache");
            return (Criteria) this;
        }

        public Criteria andHostEditCacheLike(String value) {
            addCriterion("host_edit_cache like", value, "hostEditCache");
            return (Criteria) this;
        }

        public Criteria andHostEditCacheNotLike(String value) {
            addCriterion("host_edit_cache not like", value, "hostEditCache");
            return (Criteria) this;
        }

        public Criteria andHostEditCacheIn(List<String> values) {
            addCriterion("host_edit_cache in", values, "hostEditCache");
            return (Criteria) this;
        }

        public Criteria andHostEditCacheNotIn(List<String> values) {
            addCriterion("host_edit_cache not in", values, "hostEditCache");
            return (Criteria) this;
        }

        public Criteria andHostEditCacheBetween(String value1, String value2) {
            addCriterion("host_edit_cache between", value1, value2, "hostEditCache");
            return (Criteria) this;
        }

        public Criteria andHostEditCacheNotBetween(String value1, String value2) {
            addCriterion("host_edit_cache not between", value1, value2, "hostEditCache");
            return (Criteria) this;
        }

        public Criteria andHostNameLikeInsensitive(String value) {
            addCriterion("upper(host_name) like", value.toUpperCase(), "hostName");
            return (Criteria) this;
        }

        public Criteria andHostAddressLikeInsensitive(String value) {
            addCriterion("upper(host_address) like", value.toUpperCase(), "hostAddress");
            return (Criteria) this;
        }

        public Criteria andHostStatusLikeInsensitive(String value) {
            addCriterion("upper(host_status) like", value.toUpperCase(), "hostStatus");
            return (Criteria) this;
        }

        public Criteria andCanonicalHostNameLikeInsensitive(String value) {
            addCriterion("upper(canonical_host_name) like", value.toUpperCase(), "canonicalHostName");
            return (Criteria) this;
        }

        public Criteria andHostEditCacheLikeInsensitive(String value) {
            addCriterion("upper(host_edit_cache) like", value.toUpperCase(), "hostEditCache");
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