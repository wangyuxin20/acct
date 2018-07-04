package com.wd.apiaccount.model.domain;

import java.util.ArrayList;
import java.util.List;

public class AcctCurrExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AcctCurrExample() {
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

        public Criteria andCurrNameIsNull() {
            addCriterion("curr_name is null");
            return (Criteria) this;
        }

        public Criteria andCurrNameIsNotNull() {
            addCriterion("curr_name is not null");
            return (Criteria) this;
        }

        public Criteria andCurrNameEqualTo(String value) {
            addCriterion("curr_name =", value, "currName");
            return (Criteria) this;
        }

        public Criteria andCurrNameNotEqualTo(String value) {
            addCriterion("curr_name <>", value, "currName");
            return (Criteria) this;
        }

        public Criteria andCurrNameGreaterThan(String value) {
            addCriterion("curr_name >", value, "currName");
            return (Criteria) this;
        }

        public Criteria andCurrNameGreaterThanOrEqualTo(String value) {
            addCriterion("curr_name >=", value, "currName");
            return (Criteria) this;
        }

        public Criteria andCurrNameLessThan(String value) {
            addCriterion("curr_name <", value, "currName");
            return (Criteria) this;
        }

        public Criteria andCurrNameLessThanOrEqualTo(String value) {
            addCriterion("curr_name <=", value, "currName");
            return (Criteria) this;
        }

        public Criteria andCurrNameLike(String value) {
            addCriterion("curr_name like", value, "currName");
            return (Criteria) this;
        }

        public Criteria andCurrNameNotLike(String value) {
            addCriterion("curr_name not like", value, "currName");
            return (Criteria) this;
        }

        public Criteria andCurrNameIn(List<String> values) {
            addCriterion("curr_name in", values, "currName");
            return (Criteria) this;
        }

        public Criteria andCurrNameNotIn(List<String> values) {
            addCriterion("curr_name not in", values, "currName");
            return (Criteria) this;
        }

        public Criteria andCurrNameBetween(String value1, String value2) {
            addCriterion("curr_name between", value1, value2, "currName");
            return (Criteria) this;
        }

        public Criteria andCurrNameNotBetween(String value1, String value2) {
            addCriterion("curr_name not between", value1, value2, "currName");
            return (Criteria) this;
        }

        public Criteria andCurrMemIsNull() {
            addCriterion("curr_mem is null");
            return (Criteria) this;
        }

        public Criteria andCurrMemIsNotNull() {
            addCriterion("curr_mem is not null");
            return (Criteria) this;
        }

        public Criteria andCurrMemEqualTo(String value) {
            addCriterion("curr_mem =", value, "currMem");
            return (Criteria) this;
        }

        public Criteria andCurrMemNotEqualTo(String value) {
            addCriterion("curr_mem <>", value, "currMem");
            return (Criteria) this;
        }

        public Criteria andCurrMemGreaterThan(String value) {
            addCriterion("curr_mem >", value, "currMem");
            return (Criteria) this;
        }

        public Criteria andCurrMemGreaterThanOrEqualTo(String value) {
            addCriterion("curr_mem >=", value, "currMem");
            return (Criteria) this;
        }

        public Criteria andCurrMemLessThan(String value) {
            addCriterion("curr_mem <", value, "currMem");
            return (Criteria) this;
        }

        public Criteria andCurrMemLessThanOrEqualTo(String value) {
            addCriterion("curr_mem <=", value, "currMem");
            return (Criteria) this;
        }

        public Criteria andCurrMemLike(String value) {
            addCriterion("curr_mem like", value, "currMem");
            return (Criteria) this;
        }

        public Criteria andCurrMemNotLike(String value) {
            addCriterion("curr_mem not like", value, "currMem");
            return (Criteria) this;
        }

        public Criteria andCurrMemIn(List<String> values) {
            addCriterion("curr_mem in", values, "currMem");
            return (Criteria) this;
        }

        public Criteria andCurrMemNotIn(List<String> values) {
            addCriterion("curr_mem not in", values, "currMem");
            return (Criteria) this;
        }

        public Criteria andCurrMemBetween(String value1, String value2) {
            addCriterion("curr_mem between", value1, value2, "currMem");
            return (Criteria) this;
        }

        public Criteria andCurrMemNotBetween(String value1, String value2) {
            addCriterion("curr_mem not between", value1, value2, "currMem");
            return (Criteria) this;
        }

        public Criteria andCurrMerIsNull() {
            addCriterion("curr_mer is null");
            return (Criteria) this;
        }

        public Criteria andCurrMerIsNotNull() {
            addCriterion("curr_mer is not null");
            return (Criteria) this;
        }

        public Criteria andCurrMerEqualTo(String value) {
            addCriterion("curr_mer =", value, "currMer");
            return (Criteria) this;
        }

        public Criteria andCurrMerNotEqualTo(String value) {
            addCriterion("curr_mer <>", value, "currMer");
            return (Criteria) this;
        }

        public Criteria andCurrMerGreaterThan(String value) {
            addCriterion("curr_mer >", value, "currMer");
            return (Criteria) this;
        }

        public Criteria andCurrMerGreaterThanOrEqualTo(String value) {
            addCriterion("curr_mer >=", value, "currMer");
            return (Criteria) this;
        }

        public Criteria andCurrMerLessThan(String value) {
            addCriterion("curr_mer <", value, "currMer");
            return (Criteria) this;
        }

        public Criteria andCurrMerLessThanOrEqualTo(String value) {
            addCriterion("curr_mer <=", value, "currMer");
            return (Criteria) this;
        }

        public Criteria andCurrMerLike(String value) {
            addCriterion("curr_mer like", value, "currMer");
            return (Criteria) this;
        }

        public Criteria andCurrMerNotLike(String value) {
            addCriterion("curr_mer not like", value, "currMer");
            return (Criteria) this;
        }

        public Criteria andCurrMerIn(List<String> values) {
            addCriterion("curr_mer in", values, "currMer");
            return (Criteria) this;
        }

        public Criteria andCurrMerNotIn(List<String> values) {
            addCriterion("curr_mer not in", values, "currMer");
            return (Criteria) this;
        }

        public Criteria andCurrMerBetween(String value1, String value2) {
            addCriterion("curr_mer between", value1, value2, "currMer");
            return (Criteria) this;
        }

        public Criteria andCurrMerNotBetween(String value1, String value2) {
            addCriterion("curr_mer not between", value1, value2, "currMer");
            return (Criteria) this;
        }

        public Criteria andCurrInstIsNull() {
            addCriterion("curr_inst is null");
            return (Criteria) this;
        }

        public Criteria andCurrInstIsNotNull() {
            addCriterion("curr_inst is not null");
            return (Criteria) this;
        }

        public Criteria andCurrInstEqualTo(String value) {
            addCriterion("curr_inst =", value, "currInst");
            return (Criteria) this;
        }

        public Criteria andCurrInstNotEqualTo(String value) {
            addCriterion("curr_inst <>", value, "currInst");
            return (Criteria) this;
        }

        public Criteria andCurrInstGreaterThan(String value) {
            addCriterion("curr_inst >", value, "currInst");
            return (Criteria) this;
        }

        public Criteria andCurrInstGreaterThanOrEqualTo(String value) {
            addCriterion("curr_inst >=", value, "currInst");
            return (Criteria) this;
        }

        public Criteria andCurrInstLessThan(String value) {
            addCriterion("curr_inst <", value, "currInst");
            return (Criteria) this;
        }

        public Criteria andCurrInstLessThanOrEqualTo(String value) {
            addCriterion("curr_inst <=", value, "currInst");
            return (Criteria) this;
        }

        public Criteria andCurrInstLike(String value) {
            addCriterion("curr_inst like", value, "currInst");
            return (Criteria) this;
        }

        public Criteria andCurrInstNotLike(String value) {
            addCriterion("curr_inst not like", value, "currInst");
            return (Criteria) this;
        }

        public Criteria andCurrInstIn(List<String> values) {
            addCriterion("curr_inst in", values, "currInst");
            return (Criteria) this;
        }

        public Criteria andCurrInstNotIn(List<String> values) {
            addCriterion("curr_inst not in", values, "currInst");
            return (Criteria) this;
        }

        public Criteria andCurrInstBetween(String value1, String value2) {
            addCriterion("curr_inst between", value1, value2, "currInst");
            return (Criteria) this;
        }

        public Criteria andCurrInstNotBetween(String value1, String value2) {
            addCriterion("curr_inst not between", value1, value2, "currInst");
            return (Criteria) this;
        }

        public Criteria andCurrStatusIsNull() {
            addCriterion("curr_status is null");
            return (Criteria) this;
        }

        public Criteria andCurrStatusIsNotNull() {
            addCriterion("curr_status is not null");
            return (Criteria) this;
        }

        public Criteria andCurrStatusEqualTo(String value) {
            addCriterion("curr_status =", value, "currStatus");
            return (Criteria) this;
        }

        public Criteria andCurrStatusNotEqualTo(String value) {
            addCriterion("curr_status <>", value, "currStatus");
            return (Criteria) this;
        }

        public Criteria andCurrStatusGreaterThan(String value) {
            addCriterion("curr_status >", value, "currStatus");
            return (Criteria) this;
        }

        public Criteria andCurrStatusGreaterThanOrEqualTo(String value) {
            addCriterion("curr_status >=", value, "currStatus");
            return (Criteria) this;
        }

        public Criteria andCurrStatusLessThan(String value) {
            addCriterion("curr_status <", value, "currStatus");
            return (Criteria) this;
        }

        public Criteria andCurrStatusLessThanOrEqualTo(String value) {
            addCriterion("curr_status <=", value, "currStatus");
            return (Criteria) this;
        }

        public Criteria andCurrStatusLike(String value) {
            addCriterion("curr_status like", value, "currStatus");
            return (Criteria) this;
        }

        public Criteria andCurrStatusNotLike(String value) {
            addCriterion("curr_status not like", value, "currStatus");
            return (Criteria) this;
        }

        public Criteria andCurrStatusIn(List<String> values) {
            addCriterion("curr_status in", values, "currStatus");
            return (Criteria) this;
        }

        public Criteria andCurrStatusNotIn(List<String> values) {
            addCriterion("curr_status not in", values, "currStatus");
            return (Criteria) this;
        }

        public Criteria andCurrStatusBetween(String value1, String value2) {
            addCriterion("curr_status between", value1, value2, "currStatus");
            return (Criteria) this;
        }

        public Criteria andCurrStatusNotBetween(String value1, String value2) {
            addCriterion("curr_status not between", value1, value2, "currStatus");
            return (Criteria) this;
        }

        public Criteria andCurrListIsNull() {
            addCriterion("curr_list is null");
            return (Criteria) this;
        }

        public Criteria andCurrListIsNotNull() {
            addCriterion("curr_list is not null");
            return (Criteria) this;
        }

        public Criteria andCurrListEqualTo(Integer value) {
            addCriterion("curr_list =", value, "currList");
            return (Criteria) this;
        }

        public Criteria andCurrListNotEqualTo(Integer value) {
            addCriterion("curr_list <>", value, "currList");
            return (Criteria) this;
        }

        public Criteria andCurrListGreaterThan(Integer value) {
            addCriterion("curr_list >", value, "currList");
            return (Criteria) this;
        }

        public Criteria andCurrListGreaterThanOrEqualTo(Integer value) {
            addCriterion("curr_list >=", value, "currList");
            return (Criteria) this;
        }

        public Criteria andCurrListLessThan(Integer value) {
            addCriterion("curr_list <", value, "currList");
            return (Criteria) this;
        }

        public Criteria andCurrListLessThanOrEqualTo(Integer value) {
            addCriterion("curr_list <=", value, "currList");
            return (Criteria) this;
        }

        public Criteria andCurrListIn(List<Integer> values) {
            addCriterion("curr_list in", values, "currList");
            return (Criteria) this;
        }

        public Criteria andCurrListNotIn(List<Integer> values) {
            addCriterion("curr_list not in", values, "currList");
            return (Criteria) this;
        }

        public Criteria andCurrListBetween(Integer value1, Integer value2) {
            addCriterion("curr_list between", value1, value2, "currList");
            return (Criteria) this;
        }

        public Criteria andCurrListNotBetween(Integer value1, Integer value2) {
            addCriterion("curr_list not between", value1, value2, "currList");
            return (Criteria) this;
        }

        public Criteria andCurrNoLikeInsensitive(String value) {
            addCriterion("upper(curr_no) like", value.toUpperCase(), "currNo");
            return (Criteria) this;
        }

        public Criteria andCurrNameLikeInsensitive(String value) {
            addCriterion("upper(curr_name) like", value.toUpperCase(), "currName");
            return (Criteria) this;
        }

        public Criteria andCurrMemLikeInsensitive(String value) {
            addCriterion("upper(curr_mem) like", value.toUpperCase(), "currMem");
            return (Criteria) this;
        }

        public Criteria andCurrMerLikeInsensitive(String value) {
            addCriterion("upper(curr_mer) like", value.toUpperCase(), "currMer");
            return (Criteria) this;
        }

        public Criteria andCurrInstLikeInsensitive(String value) {
            addCriterion("upper(curr_inst) like", value.toUpperCase(), "currInst");
            return (Criteria) this;
        }

        public Criteria andCurrStatusLikeInsensitive(String value) {
            addCriterion("upper(curr_status) like", value.toUpperCase(), "currStatus");
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