package com.wd.apiaccount.model.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AcctSqlExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AcctSqlExample() {
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

        public Criteria andSqlIdIsNull() {
            addCriterion("sql_id is null");
            return (Criteria) this;
        }

        public Criteria andSqlIdIsNotNull() {
            addCriterion("sql_id is not null");
            return (Criteria) this;
        }

        public Criteria andSqlIdEqualTo(Integer value) {
            addCriterion("sql_id =", value, "sqlId");
            return (Criteria) this;
        }

        public Criteria andSqlIdNotEqualTo(Integer value) {
            addCriterion("sql_id <>", value, "sqlId");
            return (Criteria) this;
        }

        public Criteria andSqlIdGreaterThan(Integer value) {
            addCriterion("sql_id >", value, "sqlId");
            return (Criteria) this;
        }

        public Criteria andSqlIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sql_id >=", value, "sqlId");
            return (Criteria) this;
        }

        public Criteria andSqlIdLessThan(Integer value) {
            addCriterion("sql_id <", value, "sqlId");
            return (Criteria) this;
        }

        public Criteria andSqlIdLessThanOrEqualTo(Integer value) {
            addCriterion("sql_id <=", value, "sqlId");
            return (Criteria) this;
        }

        public Criteria andSqlIdIn(List<Integer> values) {
            addCriterion("sql_id in", values, "sqlId");
            return (Criteria) this;
        }

        public Criteria andSqlIdNotIn(List<Integer> values) {
            addCriterion("sql_id not in", values, "sqlId");
            return (Criteria) this;
        }

        public Criteria andSqlIdBetween(Integer value1, Integer value2) {
            addCriterion("sql_id between", value1, value2, "sqlId");
            return (Criteria) this;
        }

        public Criteria andSqlIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sql_id not between", value1, value2, "sqlId");
            return (Criteria) this;
        }

        public Criteria andSqlNameIsNull() {
            addCriterion("sql_name is null");
            return (Criteria) this;
        }

        public Criteria andSqlNameIsNotNull() {
            addCriterion("sql_name is not null");
            return (Criteria) this;
        }

        public Criteria andSqlNameEqualTo(String value) {
            addCriterion("sql_name =", value, "sqlName");
            return (Criteria) this;
        }

        public Criteria andSqlNameNotEqualTo(String value) {
            addCriterion("sql_name <>", value, "sqlName");
            return (Criteria) this;
        }

        public Criteria andSqlNameGreaterThan(String value) {
            addCriterion("sql_name >", value, "sqlName");
            return (Criteria) this;
        }

        public Criteria andSqlNameGreaterThanOrEqualTo(String value) {
            addCriterion("sql_name >=", value, "sqlName");
            return (Criteria) this;
        }

        public Criteria andSqlNameLessThan(String value) {
            addCriterion("sql_name <", value, "sqlName");
            return (Criteria) this;
        }

        public Criteria andSqlNameLessThanOrEqualTo(String value) {
            addCriterion("sql_name <=", value, "sqlName");
            return (Criteria) this;
        }

        public Criteria andSqlNameLike(String value) {
            addCriterion("sql_name like", value, "sqlName");
            return (Criteria) this;
        }

        public Criteria andSqlNameNotLike(String value) {
            addCriterion("sql_name not like", value, "sqlName");
            return (Criteria) this;
        }

        public Criteria andSqlNameIn(List<String> values) {
            addCriterion("sql_name in", values, "sqlName");
            return (Criteria) this;
        }

        public Criteria andSqlNameNotIn(List<String> values) {
            addCriterion("sql_name not in", values, "sqlName");
            return (Criteria) this;
        }

        public Criteria andSqlNameBetween(String value1, String value2) {
            addCriterion("sql_name between", value1, value2, "sqlName");
            return (Criteria) this;
        }

        public Criteria andSqlNameNotBetween(String value1, String value2) {
            addCriterion("sql_name not between", value1, value2, "sqlName");
            return (Criteria) this;
        }

        public Criteria andCrudTypeIsNull() {
            addCriterion("crud_type is null");
            return (Criteria) this;
        }

        public Criteria andCrudTypeIsNotNull() {
            addCriterion("crud_type is not null");
            return (Criteria) this;
        }

        public Criteria andCrudTypeEqualTo(String value) {
            addCriterion("crud_type =", value, "crudType");
            return (Criteria) this;
        }

        public Criteria andCrudTypeNotEqualTo(String value) {
            addCriterion("crud_type <>", value, "crudType");
            return (Criteria) this;
        }

        public Criteria andCrudTypeGreaterThan(String value) {
            addCriterion("crud_type >", value, "crudType");
            return (Criteria) this;
        }

        public Criteria andCrudTypeGreaterThanOrEqualTo(String value) {
            addCriterion("crud_type >=", value, "crudType");
            return (Criteria) this;
        }

        public Criteria andCrudTypeLessThan(String value) {
            addCriterion("crud_type <", value, "crudType");
            return (Criteria) this;
        }

        public Criteria andCrudTypeLessThanOrEqualTo(String value) {
            addCriterion("crud_type <=", value, "crudType");
            return (Criteria) this;
        }

        public Criteria andCrudTypeLike(String value) {
            addCriterion("crud_type like", value, "crudType");
            return (Criteria) this;
        }

        public Criteria andCrudTypeNotLike(String value) {
            addCriterion("crud_type not like", value, "crudType");
            return (Criteria) this;
        }

        public Criteria andCrudTypeIn(List<String> values) {
            addCriterion("crud_type in", values, "crudType");
            return (Criteria) this;
        }

        public Criteria andCrudTypeNotIn(List<String> values) {
            addCriterion("crud_type not in", values, "crudType");
            return (Criteria) this;
        }

        public Criteria andCrudTypeBetween(String value1, String value2) {
            addCriterion("crud_type between", value1, value2, "crudType");
            return (Criteria) this;
        }

        public Criteria andCrudTypeNotBetween(String value1, String value2) {
            addCriterion("crud_type not between", value1, value2, "crudType");
            return (Criteria) this;
        }

        public Criteria andSqlBodyIsNull() {
            addCriterion("sql_body is null");
            return (Criteria) this;
        }

        public Criteria andSqlBodyIsNotNull() {
            addCriterion("sql_body is not null");
            return (Criteria) this;
        }

        public Criteria andSqlBodyEqualTo(String value) {
            addCriterion("sql_body =", value, "sqlBody");
            return (Criteria) this;
        }

        public Criteria andSqlBodyNotEqualTo(String value) {
            addCriterion("sql_body <>", value, "sqlBody");
            return (Criteria) this;
        }

        public Criteria andSqlBodyGreaterThan(String value) {
            addCriterion("sql_body >", value, "sqlBody");
            return (Criteria) this;
        }

        public Criteria andSqlBodyGreaterThanOrEqualTo(String value) {
            addCriterion("sql_body >=", value, "sqlBody");
            return (Criteria) this;
        }

        public Criteria andSqlBodyLessThan(String value) {
            addCriterion("sql_body <", value, "sqlBody");
            return (Criteria) this;
        }

        public Criteria andSqlBodyLessThanOrEqualTo(String value) {
            addCriterion("sql_body <=", value, "sqlBody");
            return (Criteria) this;
        }

        public Criteria andSqlBodyLike(String value) {
            addCriterion("sql_body like", value, "sqlBody");
            return (Criteria) this;
        }

        public Criteria andSqlBodyNotLike(String value) {
            addCriterion("sql_body not like", value, "sqlBody");
            return (Criteria) this;
        }

        public Criteria andSqlBodyIn(List<String> values) {
            addCriterion("sql_body in", values, "sqlBody");
            return (Criteria) this;
        }

        public Criteria andSqlBodyNotIn(List<String> values) {
            addCriterion("sql_body not in", values, "sqlBody");
            return (Criteria) this;
        }

        public Criteria andSqlBodyBetween(String value1, String value2) {
            addCriterion("sql_body between", value1, value2, "sqlBody");
            return (Criteria) this;
        }

        public Criteria andSqlBodyNotBetween(String value1, String value2) {
            addCriterion("sql_body not between", value1, value2, "sqlBody");
            return (Criteria) this;
        }

        public Criteria andCatheFlagIsNull() {
            addCriterion("cathe_flag is null");
            return (Criteria) this;
        }

        public Criteria andCatheFlagIsNotNull() {
            addCriterion("cathe_flag is not null");
            return (Criteria) this;
        }

        public Criteria andCatheFlagEqualTo(Integer value) {
            addCriterion("cathe_flag =", value, "catheFlag");
            return (Criteria) this;
        }

        public Criteria andCatheFlagNotEqualTo(Integer value) {
            addCriterion("cathe_flag <>", value, "catheFlag");
            return (Criteria) this;
        }

        public Criteria andCatheFlagGreaterThan(Integer value) {
            addCriterion("cathe_flag >", value, "catheFlag");
            return (Criteria) this;
        }

        public Criteria andCatheFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("cathe_flag >=", value, "catheFlag");
            return (Criteria) this;
        }

        public Criteria andCatheFlagLessThan(Integer value) {
            addCriterion("cathe_flag <", value, "catheFlag");
            return (Criteria) this;
        }

        public Criteria andCatheFlagLessThanOrEqualTo(Integer value) {
            addCriterion("cathe_flag <=", value, "catheFlag");
            return (Criteria) this;
        }

        public Criteria andCatheFlagIn(List<Integer> values) {
            addCriterion("cathe_flag in", values, "catheFlag");
            return (Criteria) this;
        }

        public Criteria andCatheFlagNotIn(List<Integer> values) {
            addCriterion("cathe_flag not in", values, "catheFlag");
            return (Criteria) this;
        }

        public Criteria andCatheFlagBetween(Integer value1, Integer value2) {
            addCriterion("cathe_flag between", value1, value2, "catheFlag");
            return (Criteria) this;
        }

        public Criteria andCatheFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("cathe_flag not between", value1, value2, "catheFlag");
            return (Criteria) this;
        }

        public Criteria andSqlStatusIsNull() {
            addCriterion("sql_status is null");
            return (Criteria) this;
        }

        public Criteria andSqlStatusIsNotNull() {
            addCriterion("sql_status is not null");
            return (Criteria) this;
        }

        public Criteria andSqlStatusEqualTo(Byte value) {
            addCriterion("sql_status =", value, "sqlStatus");
            return (Criteria) this;
        }

        public Criteria andSqlStatusNotEqualTo(Byte value) {
            addCriterion("sql_status <>", value, "sqlStatus");
            return (Criteria) this;
        }

        public Criteria andSqlStatusGreaterThan(Byte value) {
            addCriterion("sql_status >", value, "sqlStatus");
            return (Criteria) this;
        }

        public Criteria andSqlStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("sql_status >=", value, "sqlStatus");
            return (Criteria) this;
        }

        public Criteria andSqlStatusLessThan(Byte value) {
            addCriterion("sql_status <", value, "sqlStatus");
            return (Criteria) this;
        }

        public Criteria andSqlStatusLessThanOrEqualTo(Byte value) {
            addCriterion("sql_status <=", value, "sqlStatus");
            return (Criteria) this;
        }

        public Criteria andSqlStatusIn(List<Byte> values) {
            addCriterion("sql_status in", values, "sqlStatus");
            return (Criteria) this;
        }

        public Criteria andSqlStatusNotIn(List<Byte> values) {
            addCriterion("sql_status not in", values, "sqlStatus");
            return (Criteria) this;
        }

        public Criteria andSqlStatusBetween(Byte value1, Byte value2) {
            addCriterion("sql_status between", value1, value2, "sqlStatus");
            return (Criteria) this;
        }

        public Criteria andSqlStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("sql_status not between", value1, value2, "sqlStatus");
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

        public Criteria andSqlNameLikeInsensitive(String value) {
            addCriterion("upper(sql_name) like", value.toUpperCase(), "sqlName");
            return (Criteria) this;
        }

        public Criteria andCrudTypeLikeInsensitive(String value) {
            addCriterion("upper(crud_type) like", value.toUpperCase(), "crudType");
            return (Criteria) this;
        }

        public Criteria andSqlBodyLikeInsensitive(String value) {
            addCriterion("upper(sql_body) like", value.toUpperCase(), "sqlBody");
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