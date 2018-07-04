package com.wa.apiaccount.core.model.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AcctMktSlotExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AcctMktSlotExample() {
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

        public Criteria andTranSeqIsNull() {
            addCriterion("tran_seq is null");
            return (Criteria) this;
        }

        public Criteria andTranSeqIsNotNull() {
            addCriterion("tran_seq is not null");
            return (Criteria) this;
        }

        public Criteria andTranSeqEqualTo(Integer value) {
            addCriterion("tran_seq =", value, "tranSeq");
            return (Criteria) this;
        }

        public Criteria andTranSeqNotEqualTo(Integer value) {
            addCriterion("tran_seq <>", value, "tranSeq");
            return (Criteria) this;
        }

        public Criteria andTranSeqGreaterThan(Integer value) {
            addCriterion("tran_seq >", value, "tranSeq");
            return (Criteria) this;
        }

        public Criteria andTranSeqGreaterThanOrEqualTo(Integer value) {
            addCriterion("tran_seq >=", value, "tranSeq");
            return (Criteria) this;
        }

        public Criteria andTranSeqLessThan(Integer value) {
            addCriterion("tran_seq <", value, "tranSeq");
            return (Criteria) this;
        }

        public Criteria andTranSeqLessThanOrEqualTo(Integer value) {
            addCriterion("tran_seq <=", value, "tranSeq");
            return (Criteria) this;
        }

        public Criteria andTranSeqIn(List<Integer> values) {
            addCriterion("tran_seq in", values, "tranSeq");
            return (Criteria) this;
        }

        public Criteria andTranSeqNotIn(List<Integer> values) {
            addCriterion("tran_seq not in", values, "tranSeq");
            return (Criteria) this;
        }

        public Criteria andTranSeqBetween(Integer value1, Integer value2) {
            addCriterion("tran_seq between", value1, value2, "tranSeq");
            return (Criteria) this;
        }

        public Criteria andTranSeqNotBetween(Integer value1, Integer value2) {
            addCriterion("tran_seq not between", value1, value2, "tranSeq");
            return (Criteria) this;
        }

        public Criteria andSlotSeqIsNull() {
            addCriterion("slot_seq is null");
            return (Criteria) this;
        }

        public Criteria andSlotSeqIsNotNull() {
            addCriterion("slot_seq is not null");
            return (Criteria) this;
        }

        public Criteria andSlotSeqEqualTo(Integer value) {
            addCriterion("slot_seq =", value, "slotSeq");
            return (Criteria) this;
        }

        public Criteria andSlotSeqNotEqualTo(Integer value) {
            addCriterion("slot_seq <>", value, "slotSeq");
            return (Criteria) this;
        }

        public Criteria andSlotSeqGreaterThan(Integer value) {
            addCriterion("slot_seq >", value, "slotSeq");
            return (Criteria) this;
        }

        public Criteria andSlotSeqGreaterThanOrEqualTo(Integer value) {
            addCriterion("slot_seq >=", value, "slotSeq");
            return (Criteria) this;
        }

        public Criteria andSlotSeqLessThan(Integer value) {
            addCriterion("slot_seq <", value, "slotSeq");
            return (Criteria) this;
        }

        public Criteria andSlotSeqLessThanOrEqualTo(Integer value) {
            addCriterion("slot_seq <=", value, "slotSeq");
            return (Criteria) this;
        }

        public Criteria andSlotSeqIn(List<Integer> values) {
            addCriterion("slot_seq in", values, "slotSeq");
            return (Criteria) this;
        }

        public Criteria andSlotSeqNotIn(List<Integer> values) {
            addCriterion("slot_seq not in", values, "slotSeq");
            return (Criteria) this;
        }

        public Criteria andSlotSeqBetween(Integer value1, Integer value2) {
            addCriterion("slot_seq between", value1, value2, "slotSeq");
            return (Criteria) this;
        }

        public Criteria andSlotSeqNotBetween(Integer value1, Integer value2) {
            addCriterion("slot_seq not between", value1, value2, "slotSeq");
            return (Criteria) this;
        }

        public Criteria andSlotBalIsNull() {
            addCriterion("slot_bal is null");
            return (Criteria) this;
        }

        public Criteria andSlotBalIsNotNull() {
            addCriterion("slot_bal is not null");
            return (Criteria) this;
        }

        public Criteria andSlotBalEqualTo(BigDecimal value) {
            addCriterion("slot_bal =", value, "slotBal");
            return (Criteria) this;
        }

        public Criteria andSlotBalNotEqualTo(BigDecimal value) {
            addCriterion("slot_bal <>", value, "slotBal");
            return (Criteria) this;
        }

        public Criteria andSlotBalGreaterThan(BigDecimal value) {
            addCriterion("slot_bal >", value, "slotBal");
            return (Criteria) this;
        }

        public Criteria andSlotBalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("slot_bal >=", value, "slotBal");
            return (Criteria) this;
        }

        public Criteria andSlotBalLessThan(BigDecimal value) {
            addCriterion("slot_bal <", value, "slotBal");
            return (Criteria) this;
        }

        public Criteria andSlotBalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("slot_bal <=", value, "slotBal");
            return (Criteria) this;
        }

        public Criteria andSlotBalIn(List<BigDecimal> values) {
            addCriterion("slot_bal in", values, "slotBal");
            return (Criteria) this;
        }

        public Criteria andSlotBalNotIn(List<BigDecimal> values) {
            addCriterion("slot_bal not in", values, "slotBal");
            return (Criteria) this;
        }

        public Criteria andSlotBalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("slot_bal between", value1, value2, "slotBal");
            return (Criteria) this;
        }

        public Criteria andSlotBalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("slot_bal not between", value1, value2, "slotBal");
            return (Criteria) this;
        }

        public Criteria andSlotFrzBalIsNull() {
            addCriterion("slot_frz_bal is null");
            return (Criteria) this;
        }

        public Criteria andSlotFrzBalIsNotNull() {
            addCriterion("slot_frz_bal is not null");
            return (Criteria) this;
        }

        public Criteria andSlotFrzBalEqualTo(BigDecimal value) {
            addCriterion("slot_frz_bal =", value, "slotFrzBal");
            return (Criteria) this;
        }

        public Criteria andSlotFrzBalNotEqualTo(BigDecimal value) {
            addCriterion("slot_frz_bal <>", value, "slotFrzBal");
            return (Criteria) this;
        }

        public Criteria andSlotFrzBalGreaterThan(BigDecimal value) {
            addCriterion("slot_frz_bal >", value, "slotFrzBal");
            return (Criteria) this;
        }

        public Criteria andSlotFrzBalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("slot_frz_bal >=", value, "slotFrzBal");
            return (Criteria) this;
        }

        public Criteria andSlotFrzBalLessThan(BigDecimal value) {
            addCriterion("slot_frz_bal <", value, "slotFrzBal");
            return (Criteria) this;
        }

        public Criteria andSlotFrzBalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("slot_frz_bal <=", value, "slotFrzBal");
            return (Criteria) this;
        }

        public Criteria andSlotFrzBalIn(List<BigDecimal> values) {
            addCriterion("slot_frz_bal in", values, "slotFrzBal");
            return (Criteria) this;
        }

        public Criteria andSlotFrzBalNotIn(List<BigDecimal> values) {
            addCriterion("slot_frz_bal not in", values, "slotFrzBal");
            return (Criteria) this;
        }

        public Criteria andSlotFrzBalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("slot_frz_bal between", value1, value2, "slotFrzBal");
            return (Criteria) this;
        }

        public Criteria andSlotFrzBalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("slot_frz_bal not between", value1, value2, "slotFrzBal");
            return (Criteria) this;
        }

        public Criteria andTranNumIsNull() {
            addCriterion("tran_num is null");
            return (Criteria) this;
        }

        public Criteria andTranNumIsNotNull() {
            addCriterion("tran_num is not null");
            return (Criteria) this;
        }

        public Criteria andTranNumEqualTo(Integer value) {
            addCriterion("tran_num =", value, "tranNum");
            return (Criteria) this;
        }

        public Criteria andTranNumNotEqualTo(Integer value) {
            addCriterion("tran_num <>", value, "tranNum");
            return (Criteria) this;
        }

        public Criteria andTranNumGreaterThan(Integer value) {
            addCriterion("tran_num >", value, "tranNum");
            return (Criteria) this;
        }

        public Criteria andTranNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("tran_num >=", value, "tranNum");
            return (Criteria) this;
        }

        public Criteria andTranNumLessThan(Integer value) {
            addCriterion("tran_num <", value, "tranNum");
            return (Criteria) this;
        }

        public Criteria andTranNumLessThanOrEqualTo(Integer value) {
            addCriterion("tran_num <=", value, "tranNum");
            return (Criteria) this;
        }

        public Criteria andTranNumIn(List<Integer> values) {
            addCriterion("tran_num in", values, "tranNum");
            return (Criteria) this;
        }

        public Criteria andTranNumNotIn(List<Integer> values) {
            addCriterion("tran_num not in", values, "tranNum");
            return (Criteria) this;
        }

        public Criteria andTranNumBetween(Integer value1, Integer value2) {
            addCriterion("tran_num between", value1, value2, "tranNum");
            return (Criteria) this;
        }

        public Criteria andTranNumNotBetween(Integer value1, Integer value2) {
            addCriterion("tran_num not between", value1, value2, "tranNum");
            return (Criteria) this;
        }

        public Criteria andSlotAmtIsNull() {
            addCriterion("slot_amt is null");
            return (Criteria) this;
        }

        public Criteria andSlotAmtIsNotNull() {
            addCriterion("slot_amt is not null");
            return (Criteria) this;
        }

        public Criteria andSlotAmtEqualTo(BigDecimal value) {
            addCriterion("slot_amt =", value, "slotAmt");
            return (Criteria) this;
        }

        public Criteria andSlotAmtNotEqualTo(BigDecimal value) {
            addCriterion("slot_amt <>", value, "slotAmt");
            return (Criteria) this;
        }

        public Criteria andSlotAmtGreaterThan(BigDecimal value) {
            addCriterion("slot_amt >", value, "slotAmt");
            return (Criteria) this;
        }

        public Criteria andSlotAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("slot_amt >=", value, "slotAmt");
            return (Criteria) this;
        }

        public Criteria andSlotAmtLessThan(BigDecimal value) {
            addCriterion("slot_amt <", value, "slotAmt");
            return (Criteria) this;
        }

        public Criteria andSlotAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("slot_amt <=", value, "slotAmt");
            return (Criteria) this;
        }

        public Criteria andSlotAmtIn(List<BigDecimal> values) {
            addCriterion("slot_amt in", values, "slotAmt");
            return (Criteria) this;
        }

        public Criteria andSlotAmtNotIn(List<BigDecimal> values) {
            addCriterion("slot_amt not in", values, "slotAmt");
            return (Criteria) this;
        }

        public Criteria andSlotAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("slot_amt between", value1, value2, "slotAmt");
            return (Criteria) this;
        }

        public Criteria andSlotAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("slot_amt not between", value1, value2, "slotAmt");
            return (Criteria) this;
        }

        public Criteria andLstTimeIsNull() {
            addCriterion("lst_time is null");
            return (Criteria) this;
        }

        public Criteria andLstTimeIsNotNull() {
            addCriterion("lst_time is not null");
            return (Criteria) this;
        }

        public Criteria andLstTimeEqualTo(Date value) {
            addCriterion("lst_time =", value, "lstTime");
            return (Criteria) this;
        }

        public Criteria andLstTimeNotEqualTo(Date value) {
            addCriterion("lst_time <>", value, "lstTime");
            return (Criteria) this;
        }

        public Criteria andLstTimeGreaterThan(Date value) {
            addCriterion("lst_time >", value, "lstTime");
            return (Criteria) this;
        }

        public Criteria andLstTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lst_time >=", value, "lstTime");
            return (Criteria) this;
        }

        public Criteria andLstTimeLessThan(Date value) {
            addCriterion("lst_time <", value, "lstTime");
            return (Criteria) this;
        }

        public Criteria andLstTimeLessThanOrEqualTo(Date value) {
            addCriterion("lst_time <=", value, "lstTime");
            return (Criteria) this;
        }

        public Criteria andLstTimeIn(List<Date> values) {
            addCriterion("lst_time in", values, "lstTime");
            return (Criteria) this;
        }

        public Criteria andLstTimeNotIn(List<Date> values) {
            addCriterion("lst_time not in", values, "lstTime");
            return (Criteria) this;
        }

        public Criteria andLstTimeBetween(Date value1, Date value2) {
            addCriterion("lst_time between", value1, value2, "lstTime");
            return (Criteria) this;
        }

        public Criteria andLstTimeNotBetween(Date value1, Date value2) {
            addCriterion("lst_time not between", value1, value2, "lstTime");
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