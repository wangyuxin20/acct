package com.wa.apiaccount.core.model.domain;

import java.util.ArrayList;
import java.util.List;

public class AcctProcExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AcctProcExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
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

        public Criteria andBkChkIsNull() {
            addCriterion("bk_chk is null");
            return (Criteria) this;
        }

        public Criteria andBkChkIsNotNull() {
            addCriterion("bk_chk is not null");
            return (Criteria) this;
        }

        public Criteria andBkChkEqualTo(Integer value) {
            addCriterion("bk_chk =", value, "bkChk");
            return (Criteria) this;
        }

        public Criteria andBkChkNotEqualTo(Integer value) {
            addCriterion("bk_chk <>", value, "bkChk");
            return (Criteria) this;
        }

        public Criteria andBkChkGreaterThan(Integer value) {
            addCriterion("bk_chk >", value, "bkChk");
            return (Criteria) this;
        }

        public Criteria andBkChkGreaterThanOrEqualTo(Integer value) {
            addCriterion("bk_chk >=", value, "bkChk");
            return (Criteria) this;
        }

        public Criteria andBkChkLessThan(Integer value) {
            addCriterion("bk_chk <", value, "bkChk");
            return (Criteria) this;
        }

        public Criteria andBkChkLessThanOrEqualTo(Integer value) {
            addCriterion("bk_chk <=", value, "bkChk");
            return (Criteria) this;
        }

        public Criteria andBkChkIn(List<Integer> values) {
            addCriterion("bk_chk in", values, "bkChk");
            return (Criteria) this;
        }

        public Criteria andBkChkNotIn(List<Integer> values) {
            addCriterion("bk_chk not in", values, "bkChk");
            return (Criteria) this;
        }

        public Criteria andBkChkBetween(Integer value1, Integer value2) {
            addCriterion("bk_chk between", value1, value2, "bkChk");
            return (Criteria) this;
        }

        public Criteria andBkChkNotBetween(Integer value1, Integer value2) {
            addCriterion("bk_chk not between", value1, value2, "bkChk");
            return (Criteria) this;
        }

        public Criteria andLimChkIsNull() {
            addCriterion("lim_chk is null");
            return (Criteria) this;
        }

        public Criteria andLimChkIsNotNull() {
            addCriterion("lim_chk is not null");
            return (Criteria) this;
        }

        public Criteria andLimChkEqualTo(Integer value) {
            addCriterion("lim_chk =", value, "limChk");
            return (Criteria) this;
        }

        public Criteria andLimChkNotEqualTo(Integer value) {
            addCriterion("lim_chk <>", value, "limChk");
            return (Criteria) this;
        }

        public Criteria andLimChkGreaterThan(Integer value) {
            addCriterion("lim_chk >", value, "limChk");
            return (Criteria) this;
        }

        public Criteria andLimChkGreaterThanOrEqualTo(Integer value) {
            addCriterion("lim_chk >=", value, "limChk");
            return (Criteria) this;
        }

        public Criteria andLimChkLessThan(Integer value) {
            addCriterion("lim_chk <", value, "limChk");
            return (Criteria) this;
        }

        public Criteria andLimChkLessThanOrEqualTo(Integer value) {
            addCriterion("lim_chk <=", value, "limChk");
            return (Criteria) this;
        }

        public Criteria andLimChkIn(List<Integer> values) {
            addCriterion("lim_chk in", values, "limChk");
            return (Criteria) this;
        }

        public Criteria andLimChkNotIn(List<Integer> values) {
            addCriterion("lim_chk not in", values, "limChk");
            return (Criteria) this;
        }

        public Criteria andLimChkBetween(Integer value1, Integer value2) {
            addCriterion("lim_chk between", value1, value2, "limChk");
            return (Criteria) this;
        }

        public Criteria andLimChkNotBetween(Integer value1, Integer value2) {
            addCriterion("lim_chk not between", value1, value2, "limChk");
            return (Criteria) this;
        }

        public Criteria andPathIsNull() {
            addCriterion("path is null");
            return (Criteria) this;
        }

        public Criteria andPathIsNotNull() {
            addCriterion("path is not null");
            return (Criteria) this;
        }

        public Criteria andPathEqualTo(String value) {
            addCriterion("path =", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotEqualTo(String value) {
            addCriterion("path <>", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThan(String value) {
            addCriterion("path >", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThanOrEqualTo(String value) {
            addCriterion("path >=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThan(String value) {
            addCriterion("path <", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThanOrEqualTo(String value) {
            addCriterion("path <=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLike(String value) {
            addCriterion("path like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotLike(String value) {
            addCriterion("path not like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathIn(List<String> values) {
            addCriterion("path in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotIn(List<String> values) {
            addCriterion("path not in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathBetween(String value1, String value2) {
            addCriterion("path between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotBetween(String value1, String value2) {
            addCriterion("path not between", value1, value2, "path");
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

        public Criteria andTranCodeLikeInsensitive(String value) {
            addCriterion("upper(tran_code) like", value.toUpperCase(), "tranCode");
            return (Criteria) this;
        }

        public Criteria andNameLikeInsensitive(String value) {
            addCriterion("upper(name) like", value.toUpperCase(), "name");
            return (Criteria) this;
        }

        public Criteria andRpTypeLikeInsensitive(String value) {
            addCriterion("upper(rp_type) like", value.toUpperCase(), "rpType");
            return (Criteria) this;
        }

        public Criteria andPathLikeInsensitive(String value) {
            addCriterion("upper(path) like", value.toUpperCase(), "path");
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