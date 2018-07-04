package com.wd.apiaccount.model.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AcctParamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AcctParamExample() {
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

        public Criteria andPrmTypeIsNull() {
            addCriterion("prm_type is null");
            return (Criteria) this;
        }

        public Criteria andPrmTypeIsNotNull() {
            addCriterion("prm_type is not null");
            return (Criteria) this;
        }

        public Criteria andPrmTypeEqualTo(String value) {
            addCriterion("prm_type =", value, "prmType");
            return (Criteria) this;
        }

        public Criteria andPrmTypeNotEqualTo(String value) {
            addCriterion("prm_type <>", value, "prmType");
            return (Criteria) this;
        }

        public Criteria andPrmTypeGreaterThan(String value) {
            addCriterion("prm_type >", value, "prmType");
            return (Criteria) this;
        }

        public Criteria andPrmTypeGreaterThanOrEqualTo(String value) {
            addCriterion("prm_type >=", value, "prmType");
            return (Criteria) this;
        }

        public Criteria andPrmTypeLessThan(String value) {
            addCriterion("prm_type <", value, "prmType");
            return (Criteria) this;
        }

        public Criteria andPrmTypeLessThanOrEqualTo(String value) {
            addCriterion("prm_type <=", value, "prmType");
            return (Criteria) this;
        }

        public Criteria andPrmTypeLike(String value) {
            addCriterion("prm_type like", value, "prmType");
            return (Criteria) this;
        }

        public Criteria andPrmTypeNotLike(String value) {
            addCriterion("prm_type not like", value, "prmType");
            return (Criteria) this;
        }

        public Criteria andPrmTypeIn(List<String> values) {
            addCriterion("prm_type in", values, "prmType");
            return (Criteria) this;
        }

        public Criteria andPrmTypeNotIn(List<String> values) {
            addCriterion("prm_type not in", values, "prmType");
            return (Criteria) this;
        }

        public Criteria andPrmTypeBetween(String value1, String value2) {
            addCriterion("prm_type between", value1, value2, "prmType");
            return (Criteria) this;
        }

        public Criteria andPrmTypeNotBetween(String value1, String value2) {
            addCriterion("prm_type not between", value1, value2, "prmType");
            return (Criteria) this;
        }

        public Criteria andPrmCodeIsNull() {
            addCriterion("prm_code is null");
            return (Criteria) this;
        }

        public Criteria andPrmCodeIsNotNull() {
            addCriterion("prm_code is not null");
            return (Criteria) this;
        }

        public Criteria andPrmCodeEqualTo(String value) {
            addCriterion("prm_code =", value, "prmCode");
            return (Criteria) this;
        }

        public Criteria andPrmCodeNotEqualTo(String value) {
            addCriterion("prm_code <>", value, "prmCode");
            return (Criteria) this;
        }

        public Criteria andPrmCodeGreaterThan(String value) {
            addCriterion("prm_code >", value, "prmCode");
            return (Criteria) this;
        }

        public Criteria andPrmCodeGreaterThanOrEqualTo(String value) {
            addCriterion("prm_code >=", value, "prmCode");
            return (Criteria) this;
        }

        public Criteria andPrmCodeLessThan(String value) {
            addCriterion("prm_code <", value, "prmCode");
            return (Criteria) this;
        }

        public Criteria andPrmCodeLessThanOrEqualTo(String value) {
            addCriterion("prm_code <=", value, "prmCode");
            return (Criteria) this;
        }

        public Criteria andPrmCodeLike(String value) {
            addCriterion("prm_code like", value, "prmCode");
            return (Criteria) this;
        }

        public Criteria andPrmCodeNotLike(String value) {
            addCriterion("prm_code not like", value, "prmCode");
            return (Criteria) this;
        }

        public Criteria andPrmCodeIn(List<String> values) {
            addCriterion("prm_code in", values, "prmCode");
            return (Criteria) this;
        }

        public Criteria andPrmCodeNotIn(List<String> values) {
            addCriterion("prm_code not in", values, "prmCode");
            return (Criteria) this;
        }

        public Criteria andPrmCodeBetween(String value1, String value2) {
            addCriterion("prm_code between", value1, value2, "prmCode");
            return (Criteria) this;
        }

        public Criteria andPrmCodeNotBetween(String value1, String value2) {
            addCriterion("prm_code not between", value1, value2, "prmCode");
            return (Criteria) this;
        }

        public Criteria andPrmEnumIdIsNull() {
            addCriterion("prm_enum_id is null");
            return (Criteria) this;
        }

        public Criteria andPrmEnumIdIsNotNull() {
            addCriterion("prm_enum_id is not null");
            return (Criteria) this;
        }

        public Criteria andPrmEnumIdEqualTo(Integer value) {
            addCriterion("prm_enum_id =", value, "prmEnumId");
            return (Criteria) this;
        }

        public Criteria andPrmEnumIdNotEqualTo(Integer value) {
            addCriterion("prm_enum_id <>", value, "prmEnumId");
            return (Criteria) this;
        }

        public Criteria andPrmEnumIdGreaterThan(Integer value) {
            addCriterion("prm_enum_id >", value, "prmEnumId");
            return (Criteria) this;
        }

        public Criteria andPrmEnumIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("prm_enum_id >=", value, "prmEnumId");
            return (Criteria) this;
        }

        public Criteria andPrmEnumIdLessThan(Integer value) {
            addCriterion("prm_enum_id <", value, "prmEnumId");
            return (Criteria) this;
        }

        public Criteria andPrmEnumIdLessThanOrEqualTo(Integer value) {
            addCriterion("prm_enum_id <=", value, "prmEnumId");
            return (Criteria) this;
        }

        public Criteria andPrmEnumIdIn(List<Integer> values) {
            addCriterion("prm_enum_id in", values, "prmEnumId");
            return (Criteria) this;
        }

        public Criteria andPrmEnumIdNotIn(List<Integer> values) {
            addCriterion("prm_enum_id not in", values, "prmEnumId");
            return (Criteria) this;
        }

        public Criteria andPrmEnumIdBetween(Integer value1, Integer value2) {
            addCriterion("prm_enum_id between", value1, value2, "prmEnumId");
            return (Criteria) this;
        }

        public Criteria andPrmEnumIdNotBetween(Integer value1, Integer value2) {
            addCriterion("prm_enum_id not between", value1, value2, "prmEnumId");
            return (Criteria) this;
        }

        public Criteria andPrmCnNameIsNull() {
            addCriterion("prm_cn_name is null");
            return (Criteria) this;
        }

        public Criteria andPrmCnNameIsNotNull() {
            addCriterion("prm_cn_name is not null");
            return (Criteria) this;
        }

        public Criteria andPrmCnNameEqualTo(String value) {
            addCriterion("prm_cn_name =", value, "prmCnName");
            return (Criteria) this;
        }

        public Criteria andPrmCnNameNotEqualTo(String value) {
            addCriterion("prm_cn_name <>", value, "prmCnName");
            return (Criteria) this;
        }

        public Criteria andPrmCnNameGreaterThan(String value) {
            addCriterion("prm_cn_name >", value, "prmCnName");
            return (Criteria) this;
        }

        public Criteria andPrmCnNameGreaterThanOrEqualTo(String value) {
            addCriterion("prm_cn_name >=", value, "prmCnName");
            return (Criteria) this;
        }

        public Criteria andPrmCnNameLessThan(String value) {
            addCriterion("prm_cn_name <", value, "prmCnName");
            return (Criteria) this;
        }

        public Criteria andPrmCnNameLessThanOrEqualTo(String value) {
            addCriterion("prm_cn_name <=", value, "prmCnName");
            return (Criteria) this;
        }

        public Criteria andPrmCnNameLike(String value) {
            addCriterion("prm_cn_name like", value, "prmCnName");
            return (Criteria) this;
        }

        public Criteria andPrmCnNameNotLike(String value) {
            addCriterion("prm_cn_name not like", value, "prmCnName");
            return (Criteria) this;
        }

        public Criteria andPrmCnNameIn(List<String> values) {
            addCriterion("prm_cn_name in", values, "prmCnName");
            return (Criteria) this;
        }

        public Criteria andPrmCnNameNotIn(List<String> values) {
            addCriterion("prm_cn_name not in", values, "prmCnName");
            return (Criteria) this;
        }

        public Criteria andPrmCnNameBetween(String value1, String value2) {
            addCriterion("prm_cn_name between", value1, value2, "prmCnName");
            return (Criteria) this;
        }

        public Criteria andPrmCnNameNotBetween(String value1, String value2) {
            addCriterion("prm_cn_name not between", value1, value2, "prmCnName");
            return (Criteria) this;
        }

        public Criteria andPrmValueIsNull() {
            addCriterion("prm_value is null");
            return (Criteria) this;
        }

        public Criteria andPrmValueIsNotNull() {
            addCriterion("prm_value is not null");
            return (Criteria) this;
        }

        public Criteria andPrmValueEqualTo(String value) {
            addCriterion("prm_value =", value, "prmValue");
            return (Criteria) this;
        }

        public Criteria andPrmValueNotEqualTo(String value) {
            addCriterion("prm_value <>", value, "prmValue");
            return (Criteria) this;
        }

        public Criteria andPrmValueGreaterThan(String value) {
            addCriterion("prm_value >", value, "prmValue");
            return (Criteria) this;
        }

        public Criteria andPrmValueGreaterThanOrEqualTo(String value) {
            addCriterion("prm_value >=", value, "prmValue");
            return (Criteria) this;
        }

        public Criteria andPrmValueLessThan(String value) {
            addCriterion("prm_value <", value, "prmValue");
            return (Criteria) this;
        }

        public Criteria andPrmValueLessThanOrEqualTo(String value) {
            addCriterion("prm_value <=", value, "prmValue");
            return (Criteria) this;
        }

        public Criteria andPrmValueLike(String value) {
            addCriterion("prm_value like", value, "prmValue");
            return (Criteria) this;
        }

        public Criteria andPrmValueNotLike(String value) {
            addCriterion("prm_value not like", value, "prmValue");
            return (Criteria) this;
        }

        public Criteria andPrmValueIn(List<String> values) {
            addCriterion("prm_value in", values, "prmValue");
            return (Criteria) this;
        }

        public Criteria andPrmValueNotIn(List<String> values) {
            addCriterion("prm_value not in", values, "prmValue");
            return (Criteria) this;
        }

        public Criteria andPrmValueBetween(String value1, String value2) {
            addCriterion("prm_value between", value1, value2, "prmValue");
            return (Criteria) this;
        }

        public Criteria andPrmValueNotBetween(String value1, String value2) {
            addCriterion("prm_value not between", value1, value2, "prmValue");
            return (Criteria) this;
        }

        public Criteria andPrmRemarkIsNull() {
            addCriterion("prm_remark is null");
            return (Criteria) this;
        }

        public Criteria andPrmRemarkIsNotNull() {
            addCriterion("prm_remark is not null");
            return (Criteria) this;
        }

        public Criteria andPrmRemarkEqualTo(String value) {
            addCriterion("prm_remark =", value, "prmRemark");
            return (Criteria) this;
        }

        public Criteria andPrmRemarkNotEqualTo(String value) {
            addCriterion("prm_remark <>", value, "prmRemark");
            return (Criteria) this;
        }

        public Criteria andPrmRemarkGreaterThan(String value) {
            addCriterion("prm_remark >", value, "prmRemark");
            return (Criteria) this;
        }

        public Criteria andPrmRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("prm_remark >=", value, "prmRemark");
            return (Criteria) this;
        }

        public Criteria andPrmRemarkLessThan(String value) {
            addCriterion("prm_remark <", value, "prmRemark");
            return (Criteria) this;
        }

        public Criteria andPrmRemarkLessThanOrEqualTo(String value) {
            addCriterion("prm_remark <=", value, "prmRemark");
            return (Criteria) this;
        }

        public Criteria andPrmRemarkLike(String value) {
            addCriterion("prm_remark like", value, "prmRemark");
            return (Criteria) this;
        }

        public Criteria andPrmRemarkNotLike(String value) {
            addCriterion("prm_remark not like", value, "prmRemark");
            return (Criteria) this;
        }

        public Criteria andPrmRemarkIn(List<String> values) {
            addCriterion("prm_remark in", values, "prmRemark");
            return (Criteria) this;
        }

        public Criteria andPrmRemarkNotIn(List<String> values) {
            addCriterion("prm_remark not in", values, "prmRemark");
            return (Criteria) this;
        }

        public Criteria andPrmRemarkBetween(String value1, String value2) {
            addCriterion("prm_remark between", value1, value2, "prmRemark");
            return (Criteria) this;
        }

        public Criteria andPrmRemarkNotBetween(String value1, String value2) {
            addCriterion("prm_remark not between", value1, value2, "prmRemark");
            return (Criteria) this;
        }

        public Criteria andPrmStatusIsNull() {
            addCriterion("prm_status is null");
            return (Criteria) this;
        }

        public Criteria andPrmStatusIsNotNull() {
            addCriterion("prm_status is not null");
            return (Criteria) this;
        }

        public Criteria andPrmStatusEqualTo(String value) {
            addCriterion("prm_status =", value, "prmStatus");
            return (Criteria) this;
        }

        public Criteria andPrmStatusNotEqualTo(String value) {
            addCriterion("prm_status <>", value, "prmStatus");
            return (Criteria) this;
        }

        public Criteria andPrmStatusGreaterThan(String value) {
            addCriterion("prm_status >", value, "prmStatus");
            return (Criteria) this;
        }

        public Criteria andPrmStatusGreaterThanOrEqualTo(String value) {
            addCriterion("prm_status >=", value, "prmStatus");
            return (Criteria) this;
        }

        public Criteria andPrmStatusLessThan(String value) {
            addCriterion("prm_status <", value, "prmStatus");
            return (Criteria) this;
        }

        public Criteria andPrmStatusLessThanOrEqualTo(String value) {
            addCriterion("prm_status <=", value, "prmStatus");
            return (Criteria) this;
        }

        public Criteria andPrmStatusLike(String value) {
            addCriterion("prm_status like", value, "prmStatus");
            return (Criteria) this;
        }

        public Criteria andPrmStatusNotLike(String value) {
            addCriterion("prm_status not like", value, "prmStatus");
            return (Criteria) this;
        }

        public Criteria andPrmStatusIn(List<String> values) {
            addCriterion("prm_status in", values, "prmStatus");
            return (Criteria) this;
        }

        public Criteria andPrmStatusNotIn(List<String> values) {
            addCriterion("prm_status not in", values, "prmStatus");
            return (Criteria) this;
        }

        public Criteria andPrmStatusBetween(String value1, String value2) {
            addCriterion("prm_status between", value1, value2, "prmStatus");
            return (Criteria) this;
        }

        public Criteria andPrmStatusNotBetween(String value1, String value2) {
            addCriterion("prm_status not between", value1, value2, "prmStatus");
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

        public Criteria andPrmTypeLikeInsensitive(String value) {
            addCriterion("upper(prm_type) like", value.toUpperCase(), "prmType");
            return (Criteria) this;
        }

        public Criteria andPrmCodeLikeInsensitive(String value) {
            addCriterion("upper(prm_code) like", value.toUpperCase(), "prmCode");
            return (Criteria) this;
        }

        public Criteria andPrmCnNameLikeInsensitive(String value) {
            addCriterion("upper(prm_cn_name) like", value.toUpperCase(), "prmCnName");
            return (Criteria) this;
        }

        public Criteria andPrmValueLikeInsensitive(String value) {
            addCriterion("upper(prm_value) like", value.toUpperCase(), "prmValue");
            return (Criteria) this;
        }

        public Criteria andPrmRemarkLikeInsensitive(String value) {
            addCriterion("upper(prm_remark) like", value.toUpperCase(), "prmRemark");
            return (Criteria) this;
        }

        public Criteria andPrmStatusLikeInsensitive(String value) {
            addCriterion("upper(prm_status) like", value.toUpperCase(), "prmStatus");
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