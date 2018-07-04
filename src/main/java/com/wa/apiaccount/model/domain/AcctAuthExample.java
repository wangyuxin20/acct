package com.wd.apiaccount.model.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AcctAuthExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AcctAuthExample() {
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

        public Criteria andRequestLicIsNull() {
            addCriterion("request_lic is null");
            return (Criteria) this;
        }

        public Criteria andRequestLicIsNotNull() {
            addCriterion("request_lic is not null");
            return (Criteria) this;
        }

        public Criteria andRequestLicEqualTo(String value) {
            addCriterion("request_lic =", value, "requestLic");
            return (Criteria) this;
        }

        public Criteria andRequestLicNotEqualTo(String value) {
            addCriterion("request_lic <>", value, "requestLic");
            return (Criteria) this;
        }

        public Criteria andRequestLicGreaterThan(String value) {
            addCriterion("request_lic >", value, "requestLic");
            return (Criteria) this;
        }

        public Criteria andRequestLicGreaterThanOrEqualTo(String value) {
            addCriterion("request_lic >=", value, "requestLic");
            return (Criteria) this;
        }

        public Criteria andRequestLicLessThan(String value) {
            addCriterion("request_lic <", value, "requestLic");
            return (Criteria) this;
        }

        public Criteria andRequestLicLessThanOrEqualTo(String value) {
            addCriterion("request_lic <=", value, "requestLic");
            return (Criteria) this;
        }

        public Criteria andRequestLicLike(String value) {
            addCriterion("request_lic like", value, "requestLic");
            return (Criteria) this;
        }

        public Criteria andRequestLicNotLike(String value) {
            addCriterion("request_lic not like", value, "requestLic");
            return (Criteria) this;
        }

        public Criteria andRequestLicIn(List<String> values) {
            addCriterion("request_lic in", values, "requestLic");
            return (Criteria) this;
        }

        public Criteria andRequestLicNotIn(List<String> values) {
            addCriterion("request_lic not in", values, "requestLic");
            return (Criteria) this;
        }

        public Criteria andRequestLicBetween(String value1, String value2) {
            addCriterion("request_lic between", value1, value2, "requestLic");
            return (Criteria) this;
        }

        public Criteria andRequestLicNotBetween(String value1, String value2) {
            addCriterion("request_lic not between", value1, value2, "requestLic");
            return (Criteria) this;
        }

        public Criteria andRequestSysNameIsNull() {
            addCriterion("request_sys_name is null");
            return (Criteria) this;
        }

        public Criteria andRequestSysNameIsNotNull() {
            addCriterion("request_sys_name is not null");
            return (Criteria) this;
        }

        public Criteria andRequestSysNameEqualTo(String value) {
            addCriterion("request_sys_name =", value, "requestSysName");
            return (Criteria) this;
        }

        public Criteria andRequestSysNameNotEqualTo(String value) {
            addCriterion("request_sys_name <>", value, "requestSysName");
            return (Criteria) this;
        }

        public Criteria andRequestSysNameGreaterThan(String value) {
            addCriterion("request_sys_name >", value, "requestSysName");
            return (Criteria) this;
        }

        public Criteria andRequestSysNameGreaterThanOrEqualTo(String value) {
            addCriterion("request_sys_name >=", value, "requestSysName");
            return (Criteria) this;
        }

        public Criteria andRequestSysNameLessThan(String value) {
            addCriterion("request_sys_name <", value, "requestSysName");
            return (Criteria) this;
        }

        public Criteria andRequestSysNameLessThanOrEqualTo(String value) {
            addCriterion("request_sys_name <=", value, "requestSysName");
            return (Criteria) this;
        }

        public Criteria andRequestSysNameLike(String value) {
            addCriterion("request_sys_name like", value, "requestSysName");
            return (Criteria) this;
        }

        public Criteria andRequestSysNameNotLike(String value) {
            addCriterion("request_sys_name not like", value, "requestSysName");
            return (Criteria) this;
        }

        public Criteria andRequestSysNameIn(List<String> values) {
            addCriterion("request_sys_name in", values, "requestSysName");
            return (Criteria) this;
        }

        public Criteria andRequestSysNameNotIn(List<String> values) {
            addCriterion("request_sys_name not in", values, "requestSysName");
            return (Criteria) this;
        }

        public Criteria andRequestSysNameBetween(String value1, String value2) {
            addCriterion("request_sys_name between", value1, value2, "requestSysName");
            return (Criteria) this;
        }

        public Criteria andRequestSysNameNotBetween(String value1, String value2) {
            addCriterion("request_sys_name not between", value1, value2, "requestSysName");
            return (Criteria) this;
        }

        public Criteria andRequestIpIsNull() {
            addCriterion("request_ip is null");
            return (Criteria) this;
        }

        public Criteria andRequestIpIsNotNull() {
            addCriterion("request_ip is not null");
            return (Criteria) this;
        }

        public Criteria andRequestIpEqualTo(String value) {
            addCriterion("request_ip =", value, "requestIp");
            return (Criteria) this;
        }

        public Criteria andRequestIpNotEqualTo(String value) {
            addCriterion("request_ip <>", value, "requestIp");
            return (Criteria) this;
        }

        public Criteria andRequestIpGreaterThan(String value) {
            addCriterion("request_ip >", value, "requestIp");
            return (Criteria) this;
        }

        public Criteria andRequestIpGreaterThanOrEqualTo(String value) {
            addCriterion("request_ip >=", value, "requestIp");
            return (Criteria) this;
        }

        public Criteria andRequestIpLessThan(String value) {
            addCriterion("request_ip <", value, "requestIp");
            return (Criteria) this;
        }

        public Criteria andRequestIpLessThanOrEqualTo(String value) {
            addCriterion("request_ip <=", value, "requestIp");
            return (Criteria) this;
        }

        public Criteria andRequestIpLike(String value) {
            addCriterion("request_ip like", value, "requestIp");
            return (Criteria) this;
        }

        public Criteria andRequestIpNotLike(String value) {
            addCriterion("request_ip not like", value, "requestIp");
            return (Criteria) this;
        }

        public Criteria andRequestIpIn(List<String> values) {
            addCriterion("request_ip in", values, "requestIp");
            return (Criteria) this;
        }

        public Criteria andRequestIpNotIn(List<String> values) {
            addCriterion("request_ip not in", values, "requestIp");
            return (Criteria) this;
        }

        public Criteria andRequestIpBetween(String value1, String value2) {
            addCriterion("request_ip between", value1, value2, "requestIp");
            return (Criteria) this;
        }

        public Criteria andRequestIpNotBetween(String value1, String value2) {
            addCriterion("request_ip not between", value1, value2, "requestIp");
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

        public Criteria andCountIsNull() {
            addCriterion("count is null");
            return (Criteria) this;
        }

        public Criteria andCountIsNotNull() {
            addCriterion("count is not null");
            return (Criteria) this;
        }

        public Criteria andCountEqualTo(Long value) {
            addCriterion("count =", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotEqualTo(Long value) {
            addCriterion("count <>", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThan(Long value) {
            addCriterion("count >", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThanOrEqualTo(Long value) {
            addCriterion("count >=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThan(Long value) {
            addCriterion("count <", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThanOrEqualTo(Long value) {
            addCriterion("count <=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountIn(List<Long> values) {
            addCriterion("count in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotIn(List<Long> values) {
            addCriterion("count not in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountBetween(Long value1, Long value2) {
            addCriterion("count between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotBetween(Long value1, Long value2) {
            addCriterion("count not between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andCountTimeIsNull() {
            addCriterion("count_time is null");
            return (Criteria) this;
        }

        public Criteria andCountTimeIsNotNull() {
            addCriterion("count_time is not null");
            return (Criteria) this;
        }

        public Criteria andCountTimeEqualTo(Date value) {
            addCriterion("count_time =", value, "countTime");
            return (Criteria) this;
        }

        public Criteria andCountTimeNotEqualTo(Date value) {
            addCriterion("count_time <>", value, "countTime");
            return (Criteria) this;
        }

        public Criteria andCountTimeGreaterThan(Date value) {
            addCriterion("count_time >", value, "countTime");
            return (Criteria) this;
        }

        public Criteria andCountTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("count_time >=", value, "countTime");
            return (Criteria) this;
        }

        public Criteria andCountTimeLessThan(Date value) {
            addCriterion("count_time <", value, "countTime");
            return (Criteria) this;
        }

        public Criteria andCountTimeLessThanOrEqualTo(Date value) {
            addCriterion("count_time <=", value, "countTime");
            return (Criteria) this;
        }

        public Criteria andCountTimeIn(List<Date> values) {
            addCriterion("count_time in", values, "countTime");
            return (Criteria) this;
        }

        public Criteria andCountTimeNotIn(List<Date> values) {
            addCriterion("count_time not in", values, "countTime");
            return (Criteria) this;
        }

        public Criteria andCountTimeBetween(Date value1, Date value2) {
            addCriterion("count_time between", value1, value2, "countTime");
            return (Criteria) this;
        }

        public Criteria andCountTimeNotBetween(Date value1, Date value2) {
            addCriterion("count_time not between", value1, value2, "countTime");
            return (Criteria) this;
        }

        public Criteria andAuthStateIsNull() {
            addCriterion("auth_state is null");
            return (Criteria) this;
        }

        public Criteria andAuthStateIsNotNull() {
            addCriterion("auth_state is not null");
            return (Criteria) this;
        }

        public Criteria andAuthStateEqualTo(Integer value) {
            addCriterion("auth_state =", value, "authState");
            return (Criteria) this;
        }

        public Criteria andAuthStateNotEqualTo(Integer value) {
            addCriterion("auth_state <>", value, "authState");
            return (Criteria) this;
        }

        public Criteria andAuthStateGreaterThan(Integer value) {
            addCriterion("auth_state >", value, "authState");
            return (Criteria) this;
        }

        public Criteria andAuthStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("auth_state >=", value, "authState");
            return (Criteria) this;
        }

        public Criteria andAuthStateLessThan(Integer value) {
            addCriterion("auth_state <", value, "authState");
            return (Criteria) this;
        }

        public Criteria andAuthStateLessThanOrEqualTo(Integer value) {
            addCriterion("auth_state <=", value, "authState");
            return (Criteria) this;
        }

        public Criteria andAuthStateIn(List<Integer> values) {
            addCriterion("auth_state in", values, "authState");
            return (Criteria) this;
        }

        public Criteria andAuthStateNotIn(List<Integer> values) {
            addCriterion("auth_state not in", values, "authState");
            return (Criteria) this;
        }

        public Criteria andAuthStateBetween(Integer value1, Integer value2) {
            addCriterion("auth_state between", value1, value2, "authState");
            return (Criteria) this;
        }

        public Criteria andAuthStateNotBetween(Integer value1, Integer value2) {
            addCriterion("auth_state not between", value1, value2, "authState");
            return (Criteria) this;
        }

        public Criteria andAuthTimeIsNull() {
            addCriterion("auth_time is null");
            return (Criteria) this;
        }

        public Criteria andAuthTimeIsNotNull() {
            addCriterion("auth_time is not null");
            return (Criteria) this;
        }

        public Criteria andAuthTimeEqualTo(Date value) {
            addCriterion("auth_time =", value, "authTime");
            return (Criteria) this;
        }

        public Criteria andAuthTimeNotEqualTo(Date value) {
            addCriterion("auth_time <>", value, "authTime");
            return (Criteria) this;
        }

        public Criteria andAuthTimeGreaterThan(Date value) {
            addCriterion("auth_time >", value, "authTime");
            return (Criteria) this;
        }

        public Criteria andAuthTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("auth_time >=", value, "authTime");
            return (Criteria) this;
        }

        public Criteria andAuthTimeLessThan(Date value) {
            addCriterion("auth_time <", value, "authTime");
            return (Criteria) this;
        }

        public Criteria andAuthTimeLessThanOrEqualTo(Date value) {
            addCriterion("auth_time <=", value, "authTime");
            return (Criteria) this;
        }

        public Criteria andAuthTimeIn(List<Date> values) {
            addCriterion("auth_time in", values, "authTime");
            return (Criteria) this;
        }

        public Criteria andAuthTimeNotIn(List<Date> values) {
            addCriterion("auth_time not in", values, "authTime");
            return (Criteria) this;
        }

        public Criteria andAuthTimeBetween(Date value1, Date value2) {
            addCriterion("auth_time between", value1, value2, "authTime");
            return (Criteria) this;
        }

        public Criteria andAuthTimeNotBetween(Date value1, Date value2) {
            addCriterion("auth_time not between", value1, value2, "authTime");
            return (Criteria) this;
        }

        public Criteria andRequestLicLikeInsensitive(String value) {
            addCriterion("upper(request_lic) like", value.toUpperCase(), "requestLic");
            return (Criteria) this;
        }

        public Criteria andRequestSysNameLikeInsensitive(String value) {
            addCriterion("upper(request_sys_name) like", value.toUpperCase(), "requestSysName");
            return (Criteria) this;
        }

        public Criteria andRequestIpLikeInsensitive(String value) {
            addCriterion("upper(request_ip) like", value.toUpperCase(), "requestIp");
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