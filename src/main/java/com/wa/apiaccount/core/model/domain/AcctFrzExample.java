package com.wa.apiaccount.core.model.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AcctFrzExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AcctFrzExample() {
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

        public Criteria andFrzNoIsNull() {
            addCriterion("frz_no is null");
            return (Criteria) this;
        }

        public Criteria andFrzNoIsNotNull() {
            addCriterion("frz_no is not null");
            return (Criteria) this;
        }

        public Criteria andFrzNoEqualTo(String value) {
            addCriterion("frz_no =", value, "frzNo");
            return (Criteria) this;
        }

        public Criteria andFrzNoNotEqualTo(String value) {
            addCriterion("frz_no <>", value, "frzNo");
            return (Criteria) this;
        }

        public Criteria andFrzNoGreaterThan(String value) {
            addCriterion("frz_no >", value, "frzNo");
            return (Criteria) this;
        }

        public Criteria andFrzNoGreaterThanOrEqualTo(String value) {
            addCriterion("frz_no >=", value, "frzNo");
            return (Criteria) this;
        }

        public Criteria andFrzNoLessThan(String value) {
            addCriterion("frz_no <", value, "frzNo");
            return (Criteria) this;
        }

        public Criteria andFrzNoLessThanOrEqualTo(String value) {
            addCriterion("frz_no <=", value, "frzNo");
            return (Criteria) this;
        }

        public Criteria andFrzNoLike(String value) {
            addCriterion("frz_no like", value, "frzNo");
            return (Criteria) this;
        }

        public Criteria andFrzNoNotLike(String value) {
            addCriterion("frz_no not like", value, "frzNo");
            return (Criteria) this;
        }

        public Criteria andFrzNoIn(List<String> values) {
            addCriterion("frz_no in", values, "frzNo");
            return (Criteria) this;
        }

        public Criteria andFrzNoNotIn(List<String> values) {
            addCriterion("frz_no not in", values, "frzNo");
            return (Criteria) this;
        }

        public Criteria andFrzNoBetween(String value1, String value2) {
            addCriterion("frz_no between", value1, value2, "frzNo");
            return (Criteria) this;
        }

        public Criteria andFrzNoNotBetween(String value1, String value2) {
            addCriterion("frz_no not between", value1, value2, "frzNo");
            return (Criteria) this;
        }

        public Criteria andFlowInrIdIsNull() {
            addCriterion("flow_inr_id is null");
            return (Criteria) this;
        }

        public Criteria andFlowInrIdIsNotNull() {
            addCriterion("flow_inr_id is not null");
            return (Criteria) this;
        }

        public Criteria andFlowInrIdEqualTo(String value) {
            addCriterion("flow_inr_id =", value, "flowInrId");
            return (Criteria) this;
        }

        public Criteria andFlowInrIdNotEqualTo(String value) {
            addCriterion("flow_inr_id <>", value, "flowInrId");
            return (Criteria) this;
        }

        public Criteria andFlowInrIdGreaterThan(String value) {
            addCriterion("flow_inr_id >", value, "flowInrId");
            return (Criteria) this;
        }

        public Criteria andFlowInrIdGreaterThanOrEqualTo(String value) {
            addCriterion("flow_inr_id >=", value, "flowInrId");
            return (Criteria) this;
        }

        public Criteria andFlowInrIdLessThan(String value) {
            addCriterion("flow_inr_id <", value, "flowInrId");
            return (Criteria) this;
        }

        public Criteria andFlowInrIdLessThanOrEqualTo(String value) {
            addCriterion("flow_inr_id <=", value, "flowInrId");
            return (Criteria) this;
        }

        public Criteria andFlowInrIdLike(String value) {
            addCriterion("flow_inr_id like", value, "flowInrId");
            return (Criteria) this;
        }

        public Criteria andFlowInrIdNotLike(String value) {
            addCriterion("flow_inr_id not like", value, "flowInrId");
            return (Criteria) this;
        }

        public Criteria andFlowInrIdIn(List<String> values) {
            addCriterion("flow_inr_id in", values, "flowInrId");
            return (Criteria) this;
        }

        public Criteria andFlowInrIdNotIn(List<String> values) {
            addCriterion("flow_inr_id not in", values, "flowInrId");
            return (Criteria) this;
        }

        public Criteria andFlowInrIdBetween(String value1, String value2) {
            addCriterion("flow_inr_id between", value1, value2, "flowInrId");
            return (Criteria) this;
        }

        public Criteria andFlowInrIdNotBetween(String value1, String value2) {
            addCriterion("flow_inr_id not between", value1, value2, "flowInrId");
            return (Criteria) this;
        }

        public Criteria andFrzExpIsNull() {
            addCriterion("frz_exp is null");
            return (Criteria) this;
        }

        public Criteria andFrzExpIsNotNull() {
            addCriterion("frz_exp is not null");
            return (Criteria) this;
        }

        public Criteria andFrzExpEqualTo(String value) {
            addCriterion("frz_exp =", value, "frzExp");
            return (Criteria) this;
        }

        public Criteria andFrzExpNotEqualTo(String value) {
            addCriterion("frz_exp <>", value, "frzExp");
            return (Criteria) this;
        }

        public Criteria andFrzExpGreaterThan(String value) {
            addCriterion("frz_exp >", value, "frzExp");
            return (Criteria) this;
        }

        public Criteria andFrzExpGreaterThanOrEqualTo(String value) {
            addCriterion("frz_exp >=", value, "frzExp");
            return (Criteria) this;
        }

        public Criteria andFrzExpLessThan(String value) {
            addCriterion("frz_exp <", value, "frzExp");
            return (Criteria) this;
        }

        public Criteria andFrzExpLessThanOrEqualTo(String value) {
            addCriterion("frz_exp <=", value, "frzExp");
            return (Criteria) this;
        }

        public Criteria andFrzExpLike(String value) {
            addCriterion("frz_exp like", value, "frzExp");
            return (Criteria) this;
        }

        public Criteria andFrzExpNotLike(String value) {
            addCriterion("frz_exp not like", value, "frzExp");
            return (Criteria) this;
        }

        public Criteria andFrzExpIn(List<String> values) {
            addCriterion("frz_exp in", values, "frzExp");
            return (Criteria) this;
        }

        public Criteria andFrzExpNotIn(List<String> values) {
            addCriterion("frz_exp not in", values, "frzExp");
            return (Criteria) this;
        }

        public Criteria andFrzExpBetween(String value1, String value2) {
            addCriterion("frz_exp between", value1, value2, "frzExp");
            return (Criteria) this;
        }

        public Criteria andFrzExpNotBetween(String value1, String value2) {
            addCriterion("frz_exp not between", value1, value2, "frzExp");
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

        public Criteria andFrzAmtIsNull() {
            addCriterion("frz_amt is null");
            return (Criteria) this;
        }

        public Criteria andFrzAmtIsNotNull() {
            addCriterion("frz_amt is not null");
            return (Criteria) this;
        }

        public Criteria andFrzAmtEqualTo(BigDecimal value) {
            addCriterion("frz_amt =", value, "frzAmt");
            return (Criteria) this;
        }

        public Criteria andFrzAmtNotEqualTo(BigDecimal value) {
            addCriterion("frz_amt <>", value, "frzAmt");
            return (Criteria) this;
        }

        public Criteria andFrzAmtGreaterThan(BigDecimal value) {
            addCriterion("frz_amt >", value, "frzAmt");
            return (Criteria) this;
        }

        public Criteria andFrzAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("frz_amt >=", value, "frzAmt");
            return (Criteria) this;
        }

        public Criteria andFrzAmtLessThan(BigDecimal value) {
            addCriterion("frz_amt <", value, "frzAmt");
            return (Criteria) this;
        }

        public Criteria andFrzAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("frz_amt <=", value, "frzAmt");
            return (Criteria) this;
        }

        public Criteria andFrzAmtIn(List<BigDecimal> values) {
            addCriterion("frz_amt in", values, "frzAmt");
            return (Criteria) this;
        }

        public Criteria andFrzAmtNotIn(List<BigDecimal> values) {
            addCriterion("frz_amt not in", values, "frzAmt");
            return (Criteria) this;
        }

        public Criteria andFrzAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("frz_amt between", value1, value2, "frzAmt");
            return (Criteria) this;
        }

        public Criteria andFrzAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("frz_amt not between", value1, value2, "frzAmt");
            return (Criteria) this;
        }

        public Criteria andFrzDateIsNull() {
            addCriterion("frz_date is null");
            return (Criteria) this;
        }

        public Criteria andFrzDateIsNotNull() {
            addCriterion("frz_date is not null");
            return (Criteria) this;
        }

        public Criteria andFrzDateEqualTo(String value) {
            addCriterion("frz_date =", value, "frzDate");
            return (Criteria) this;
        }

        public Criteria andFrzDateNotEqualTo(String value) {
            addCriterion("frz_date <>", value, "frzDate");
            return (Criteria) this;
        }

        public Criteria andFrzDateGreaterThan(String value) {
            addCriterion("frz_date >", value, "frzDate");
            return (Criteria) this;
        }

        public Criteria andFrzDateGreaterThanOrEqualTo(String value) {
            addCriterion("frz_date >=", value, "frzDate");
            return (Criteria) this;
        }

        public Criteria andFrzDateLessThan(String value) {
            addCriterion("frz_date <", value, "frzDate");
            return (Criteria) this;
        }

        public Criteria andFrzDateLessThanOrEqualTo(String value) {
            addCriterion("frz_date <=", value, "frzDate");
            return (Criteria) this;
        }

        public Criteria andFrzDateLike(String value) {
            addCriterion("frz_date like", value, "frzDate");
            return (Criteria) this;
        }

        public Criteria andFrzDateNotLike(String value) {
            addCriterion("frz_date not like", value, "frzDate");
            return (Criteria) this;
        }

        public Criteria andFrzDateIn(List<String> values) {
            addCriterion("frz_date in", values, "frzDate");
            return (Criteria) this;
        }

        public Criteria andFrzDateNotIn(List<String> values) {
            addCriterion("frz_date not in", values, "frzDate");
            return (Criteria) this;
        }

        public Criteria andFrzDateBetween(String value1, String value2) {
            addCriterion("frz_date between", value1, value2, "frzDate");
            return (Criteria) this;
        }

        public Criteria andFrzDateNotBetween(String value1, String value2) {
            addCriterion("frz_date not between", value1, value2, "frzDate");
            return (Criteria) this;
        }

        public Criteria andFrzStateIsNull() {
            addCriterion("frz_state is null");
            return (Criteria) this;
        }

        public Criteria andFrzStateIsNotNull() {
            addCriterion("frz_state is not null");
            return (Criteria) this;
        }

        public Criteria andFrzStateEqualTo(Integer value) {
            addCriterion("frz_state =", value, "frzState");
            return (Criteria) this;
        }

        public Criteria andFrzStateNotEqualTo(Integer value) {
            addCriterion("frz_state <>", value, "frzState");
            return (Criteria) this;
        }

        public Criteria andFrzStateGreaterThan(Integer value) {
            addCriterion("frz_state >", value, "frzState");
            return (Criteria) this;
        }

        public Criteria andFrzStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("frz_state >=", value, "frzState");
            return (Criteria) this;
        }

        public Criteria andFrzStateLessThan(Integer value) {
            addCriterion("frz_state <", value, "frzState");
            return (Criteria) this;
        }

        public Criteria andFrzStateLessThanOrEqualTo(Integer value) {
            addCriterion("frz_state <=", value, "frzState");
            return (Criteria) this;
        }

        public Criteria andFrzStateIn(List<Integer> values) {
            addCriterion("frz_state in", values, "frzState");
            return (Criteria) this;
        }

        public Criteria andFrzStateNotIn(List<Integer> values) {
            addCriterion("frz_state not in", values, "frzState");
            return (Criteria) this;
        }

        public Criteria andFrzStateBetween(Integer value1, Integer value2) {
            addCriterion("frz_state between", value1, value2, "frzState");
            return (Criteria) this;
        }

        public Criteria andFrzStateNotBetween(Integer value1, Integer value2) {
            addCriterion("frz_state not between", value1, value2, "frzState");
            return (Criteria) this;
        }

        public Criteria andUnfrzDateIsNull() {
            addCriterion("unfrz_date is null");
            return (Criteria) this;
        }

        public Criteria andUnfrzDateIsNotNull() {
            addCriterion("unfrz_date is not null");
            return (Criteria) this;
        }

        public Criteria andUnfrzDateEqualTo(String value) {
            addCriterion("unfrz_date =", value, "unfrzDate");
            return (Criteria) this;
        }

        public Criteria andUnfrzDateNotEqualTo(String value) {
            addCriterion("unfrz_date <>", value, "unfrzDate");
            return (Criteria) this;
        }

        public Criteria andUnfrzDateGreaterThan(String value) {
            addCriterion("unfrz_date >", value, "unfrzDate");
            return (Criteria) this;
        }

        public Criteria andUnfrzDateGreaterThanOrEqualTo(String value) {
            addCriterion("unfrz_date >=", value, "unfrzDate");
            return (Criteria) this;
        }

        public Criteria andUnfrzDateLessThan(String value) {
            addCriterion("unfrz_date <", value, "unfrzDate");
            return (Criteria) this;
        }

        public Criteria andUnfrzDateLessThanOrEqualTo(String value) {
            addCriterion("unfrz_date <=", value, "unfrzDate");
            return (Criteria) this;
        }

        public Criteria andUnfrzDateLike(String value) {
            addCriterion("unfrz_date like", value, "unfrzDate");
            return (Criteria) this;
        }

        public Criteria andUnfrzDateNotLike(String value) {
            addCriterion("unfrz_date not like", value, "unfrzDate");
            return (Criteria) this;
        }

        public Criteria andUnfrzDateIn(List<String> values) {
            addCriterion("unfrz_date in", values, "unfrzDate");
            return (Criteria) this;
        }

        public Criteria andUnfrzDateNotIn(List<String> values) {
            addCriterion("unfrz_date not in", values, "unfrzDate");
            return (Criteria) this;
        }

        public Criteria andUnfrzDateBetween(String value1, String value2) {
            addCriterion("unfrz_date between", value1, value2, "unfrzDate");
            return (Criteria) this;
        }

        public Criteria andUnfrzDateNotBetween(String value1, String value2) {
            addCriterion("unfrz_date not between", value1, value2, "unfrzDate");
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

        public Criteria andFrzNoLikeInsensitive(String value) {
            addCriterion("upper(frz_no) like", value.toUpperCase(), "frzNo");
            return (Criteria) this;
        }

        public Criteria andFlowInrIdLikeInsensitive(String value) {
            addCriterion("upper(flow_inr_id) like", value.toUpperCase(), "flowInrId");
            return (Criteria) this;
        }

        public Criteria andFrzExpLikeInsensitive(String value) {
            addCriterion("upper(frz_exp) like", value.toUpperCase(), "frzExp");
            return (Criteria) this;
        }

        public Criteria andAcctNoLikeInsensitive(String value) {
            addCriterion("upper(acct_no) like", value.toUpperCase(), "acctNo");
            return (Criteria) this;
        }

        public Criteria andFrzDateLikeInsensitive(String value) {
            addCriterion("upper(frz_date) like", value.toUpperCase(), "frzDate");
            return (Criteria) this;
        }

        public Criteria andUnfrzDateLikeInsensitive(String value) {
            addCriterion("upper(unfrz_date) like", value.toUpperCase(), "unfrzDate");
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