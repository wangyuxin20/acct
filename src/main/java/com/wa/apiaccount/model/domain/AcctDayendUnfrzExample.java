package com.wd.apiaccount.model.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AcctDayendUnfrzExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AcctDayendUnfrzExample() {
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

        public Criteria andDayendIdIsNull() {
            addCriterion("dayend_id is null");
            return (Criteria) this;
        }

        public Criteria andDayendIdIsNotNull() {
            addCriterion("dayend_id is not null");
            return (Criteria) this;
        }

        public Criteria andDayendIdEqualTo(Long value) {
            addCriterion("dayend_id =", value, "dayendId");
            return (Criteria) this;
        }

        public Criteria andDayendIdNotEqualTo(Long value) {
            addCriterion("dayend_id <>", value, "dayendId");
            return (Criteria) this;
        }

        public Criteria andDayendIdGreaterThan(Long value) {
            addCriterion("dayend_id >", value, "dayendId");
            return (Criteria) this;
        }

        public Criteria andDayendIdGreaterThanOrEqualTo(Long value) {
            addCriterion("dayend_id >=", value, "dayendId");
            return (Criteria) this;
        }

        public Criteria andDayendIdLessThan(Long value) {
            addCriterion("dayend_id <", value, "dayendId");
            return (Criteria) this;
        }

        public Criteria andDayendIdLessThanOrEqualTo(Long value) {
            addCriterion("dayend_id <=", value, "dayendId");
            return (Criteria) this;
        }

        public Criteria andDayendIdIn(List<Long> values) {
            addCriterion("dayend_id in", values, "dayendId");
            return (Criteria) this;
        }

        public Criteria andDayendIdNotIn(List<Long> values) {
            addCriterion("dayend_id not in", values, "dayendId");
            return (Criteria) this;
        }

        public Criteria andDayendIdBetween(Long value1, Long value2) {
            addCriterion("dayend_id between", value1, value2, "dayendId");
            return (Criteria) this;
        }

        public Criteria andDayendIdNotBetween(Long value1, Long value2) {
            addCriterion("dayend_id not between", value1, value2, "dayendId");
            return (Criteria) this;
        }

        public Criteria andUnfrzExpIsNull() {
            addCriterion("unfrz_exp is null");
            return (Criteria) this;
        }

        public Criteria andUnfrzExpIsNotNull() {
            addCriterion("unfrz_exp is not null");
            return (Criteria) this;
        }

        public Criteria andUnfrzExpEqualTo(String value) {
            addCriterion("unfrz_exp =", value, "unfrzExp");
            return (Criteria) this;
        }

        public Criteria andUnfrzExpNotEqualTo(String value) {
            addCriterion("unfrz_exp <>", value, "unfrzExp");
            return (Criteria) this;
        }

        public Criteria andUnfrzExpGreaterThan(String value) {
            addCriterion("unfrz_exp >", value, "unfrzExp");
            return (Criteria) this;
        }

        public Criteria andUnfrzExpGreaterThanOrEqualTo(String value) {
            addCriterion("unfrz_exp >=", value, "unfrzExp");
            return (Criteria) this;
        }

        public Criteria andUnfrzExpLessThan(String value) {
            addCriterion("unfrz_exp <", value, "unfrzExp");
            return (Criteria) this;
        }

        public Criteria andUnfrzExpLessThanOrEqualTo(String value) {
            addCriterion("unfrz_exp <=", value, "unfrzExp");
            return (Criteria) this;
        }

        public Criteria andUnfrzExpLike(String value) {
            addCriterion("unfrz_exp like", value, "unfrzExp");
            return (Criteria) this;
        }

        public Criteria andUnfrzExpNotLike(String value) {
            addCriterion("unfrz_exp not like", value, "unfrzExp");
            return (Criteria) this;
        }

        public Criteria andUnfrzExpIn(List<String> values) {
            addCriterion("unfrz_exp in", values, "unfrzExp");
            return (Criteria) this;
        }

        public Criteria andUnfrzExpNotIn(List<String> values) {
            addCriterion("unfrz_exp not in", values, "unfrzExp");
            return (Criteria) this;
        }

        public Criteria andUnfrzExpBetween(String value1, String value2) {
            addCriterion("unfrz_exp between", value1, value2, "unfrzExp");
            return (Criteria) this;
        }

        public Criteria andUnfrzExpNotBetween(String value1, String value2) {
            addCriterion("unfrz_exp not between", value1, value2, "unfrzExp");
            return (Criteria) this;
        }

        public Criteria andUnfrzCountIsNull() {
            addCriterion("unfrz_count is null");
            return (Criteria) this;
        }

        public Criteria andUnfrzCountIsNotNull() {
            addCriterion("unfrz_count is not null");
            return (Criteria) this;
        }

        public Criteria andUnfrzCountEqualTo(Integer value) {
            addCriterion("unfrz_count =", value, "unfrzCount");
            return (Criteria) this;
        }

        public Criteria andUnfrzCountNotEqualTo(Integer value) {
            addCriterion("unfrz_count <>", value, "unfrzCount");
            return (Criteria) this;
        }

        public Criteria andUnfrzCountGreaterThan(Integer value) {
            addCriterion("unfrz_count >", value, "unfrzCount");
            return (Criteria) this;
        }

        public Criteria andUnfrzCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("unfrz_count >=", value, "unfrzCount");
            return (Criteria) this;
        }

        public Criteria andUnfrzCountLessThan(Integer value) {
            addCriterion("unfrz_count <", value, "unfrzCount");
            return (Criteria) this;
        }

        public Criteria andUnfrzCountLessThanOrEqualTo(Integer value) {
            addCriterion("unfrz_count <=", value, "unfrzCount");
            return (Criteria) this;
        }

        public Criteria andUnfrzCountIn(List<Integer> values) {
            addCriterion("unfrz_count in", values, "unfrzCount");
            return (Criteria) this;
        }

        public Criteria andUnfrzCountNotIn(List<Integer> values) {
            addCriterion("unfrz_count not in", values, "unfrzCount");
            return (Criteria) this;
        }

        public Criteria andUnfrzCountBetween(Integer value1, Integer value2) {
            addCriterion("unfrz_count between", value1, value2, "unfrzCount");
            return (Criteria) this;
        }

        public Criteria andUnfrzCountNotBetween(Integer value1, Integer value2) {
            addCriterion("unfrz_count not between", value1, value2, "unfrzCount");
            return (Criteria) this;
        }

        public Criteria andUnfrzAmtIsNull() {
            addCriterion("unfrz_amt is null");
            return (Criteria) this;
        }

        public Criteria andUnfrzAmtIsNotNull() {
            addCriterion("unfrz_amt is not null");
            return (Criteria) this;
        }

        public Criteria andUnfrzAmtEqualTo(BigDecimal value) {
            addCriterion("unfrz_amt =", value, "unfrzAmt");
            return (Criteria) this;
        }

        public Criteria andUnfrzAmtNotEqualTo(BigDecimal value) {
            addCriterion("unfrz_amt <>", value, "unfrzAmt");
            return (Criteria) this;
        }

        public Criteria andUnfrzAmtGreaterThan(BigDecimal value) {
            addCriterion("unfrz_amt >", value, "unfrzAmt");
            return (Criteria) this;
        }

        public Criteria andUnfrzAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("unfrz_amt >=", value, "unfrzAmt");
            return (Criteria) this;
        }

        public Criteria andUnfrzAmtLessThan(BigDecimal value) {
            addCriterion("unfrz_amt <", value, "unfrzAmt");
            return (Criteria) this;
        }

        public Criteria andUnfrzAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("unfrz_amt <=", value, "unfrzAmt");
            return (Criteria) this;
        }

        public Criteria andUnfrzAmtIn(List<BigDecimal> values) {
            addCriterion("unfrz_amt in", values, "unfrzAmt");
            return (Criteria) this;
        }

        public Criteria andUnfrzAmtNotIn(List<BigDecimal> values) {
            addCriterion("unfrz_amt not in", values, "unfrzAmt");
            return (Criteria) this;
        }

        public Criteria andUnfrzAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unfrz_amt between", value1, value2, "unfrzAmt");
            return (Criteria) this;
        }

        public Criteria andUnfrzAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unfrz_amt not between", value1, value2, "unfrzAmt");
            return (Criteria) this;
        }

        public Criteria andUnfrzAccountingCountIsNull() {
            addCriterion("unfrz_accounting_count is null");
            return (Criteria) this;
        }

        public Criteria andUnfrzAccountingCountIsNotNull() {
            addCriterion("unfrz_accounting_count is not null");
            return (Criteria) this;
        }

        public Criteria andUnfrzAccountingCountEqualTo(Integer value) {
            addCriterion("unfrz_accounting_count =", value, "unfrzAccountingCount");
            return (Criteria) this;
        }

        public Criteria andUnfrzAccountingCountNotEqualTo(Integer value) {
            addCriterion("unfrz_accounting_count <>", value, "unfrzAccountingCount");
            return (Criteria) this;
        }

        public Criteria andUnfrzAccountingCountGreaterThan(Integer value) {
            addCriterion("unfrz_accounting_count >", value, "unfrzAccountingCount");
            return (Criteria) this;
        }

        public Criteria andUnfrzAccountingCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("unfrz_accounting_count >=", value, "unfrzAccountingCount");
            return (Criteria) this;
        }

        public Criteria andUnfrzAccountingCountLessThan(Integer value) {
            addCriterion("unfrz_accounting_count <", value, "unfrzAccountingCount");
            return (Criteria) this;
        }

        public Criteria andUnfrzAccountingCountLessThanOrEqualTo(Integer value) {
            addCriterion("unfrz_accounting_count <=", value, "unfrzAccountingCount");
            return (Criteria) this;
        }

        public Criteria andUnfrzAccountingCountIn(List<Integer> values) {
            addCriterion("unfrz_accounting_count in", values, "unfrzAccountingCount");
            return (Criteria) this;
        }

        public Criteria andUnfrzAccountingCountNotIn(List<Integer> values) {
            addCriterion("unfrz_accounting_count not in", values, "unfrzAccountingCount");
            return (Criteria) this;
        }

        public Criteria andUnfrzAccountingCountBetween(Integer value1, Integer value2) {
            addCriterion("unfrz_accounting_count between", value1, value2, "unfrzAccountingCount");
            return (Criteria) this;
        }

        public Criteria andUnfrzAccountingCountNotBetween(Integer value1, Integer value2) {
            addCriterion("unfrz_accounting_count not between", value1, value2, "unfrzAccountingCount");
            return (Criteria) this;
        }

        public Criteria andUnfrzAccountingAmtIsNull() {
            addCriterion("unfrz_accounting_amt is null");
            return (Criteria) this;
        }

        public Criteria andUnfrzAccountingAmtIsNotNull() {
            addCriterion("unfrz_accounting_amt is not null");
            return (Criteria) this;
        }

        public Criteria andUnfrzAccountingAmtEqualTo(BigDecimal value) {
            addCriterion("unfrz_accounting_amt =", value, "unfrzAccountingAmt");
            return (Criteria) this;
        }

        public Criteria andUnfrzAccountingAmtNotEqualTo(BigDecimal value) {
            addCriterion("unfrz_accounting_amt <>", value, "unfrzAccountingAmt");
            return (Criteria) this;
        }

        public Criteria andUnfrzAccountingAmtGreaterThan(BigDecimal value) {
            addCriterion("unfrz_accounting_amt >", value, "unfrzAccountingAmt");
            return (Criteria) this;
        }

        public Criteria andUnfrzAccountingAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("unfrz_accounting_amt >=", value, "unfrzAccountingAmt");
            return (Criteria) this;
        }

        public Criteria andUnfrzAccountingAmtLessThan(BigDecimal value) {
            addCriterion("unfrz_accounting_amt <", value, "unfrzAccountingAmt");
            return (Criteria) this;
        }

        public Criteria andUnfrzAccountingAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("unfrz_accounting_amt <=", value, "unfrzAccountingAmt");
            return (Criteria) this;
        }

        public Criteria andUnfrzAccountingAmtIn(List<BigDecimal> values) {
            addCriterion("unfrz_accounting_amt in", values, "unfrzAccountingAmt");
            return (Criteria) this;
        }

        public Criteria andUnfrzAccountingAmtNotIn(List<BigDecimal> values) {
            addCriterion("unfrz_accounting_amt not in", values, "unfrzAccountingAmt");
            return (Criteria) this;
        }

        public Criteria andUnfrzAccountingAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unfrz_accounting_amt between", value1, value2, "unfrzAccountingAmt");
            return (Criteria) this;
        }

        public Criteria andUnfrzAccountingAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unfrz_accounting_amt not between", value1, value2, "unfrzAccountingAmt");
            return (Criteria) this;
        }

        public Criteria andUnfrzAcctCountIsNull() {
            addCriterion("unfrz_acct_count is null");
            return (Criteria) this;
        }

        public Criteria andUnfrzAcctCountIsNotNull() {
            addCriterion("unfrz_acct_count is not null");
            return (Criteria) this;
        }

        public Criteria andUnfrzAcctCountEqualTo(Integer value) {
            addCriterion("unfrz_acct_count =", value, "unfrzAcctCount");
            return (Criteria) this;
        }

        public Criteria andUnfrzAcctCountNotEqualTo(Integer value) {
            addCriterion("unfrz_acct_count <>", value, "unfrzAcctCount");
            return (Criteria) this;
        }

        public Criteria andUnfrzAcctCountGreaterThan(Integer value) {
            addCriterion("unfrz_acct_count >", value, "unfrzAcctCount");
            return (Criteria) this;
        }

        public Criteria andUnfrzAcctCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("unfrz_acct_count >=", value, "unfrzAcctCount");
            return (Criteria) this;
        }

        public Criteria andUnfrzAcctCountLessThan(Integer value) {
            addCriterion("unfrz_acct_count <", value, "unfrzAcctCount");
            return (Criteria) this;
        }

        public Criteria andUnfrzAcctCountLessThanOrEqualTo(Integer value) {
            addCriterion("unfrz_acct_count <=", value, "unfrzAcctCount");
            return (Criteria) this;
        }

        public Criteria andUnfrzAcctCountIn(List<Integer> values) {
            addCriterion("unfrz_acct_count in", values, "unfrzAcctCount");
            return (Criteria) this;
        }

        public Criteria andUnfrzAcctCountNotIn(List<Integer> values) {
            addCriterion("unfrz_acct_count not in", values, "unfrzAcctCount");
            return (Criteria) this;
        }

        public Criteria andUnfrzAcctCountBetween(Integer value1, Integer value2) {
            addCriterion("unfrz_acct_count between", value1, value2, "unfrzAcctCount");
            return (Criteria) this;
        }

        public Criteria andUnfrzAcctCountNotBetween(Integer value1, Integer value2) {
            addCriterion("unfrz_acct_count not between", value1, value2, "unfrzAcctCount");
            return (Criteria) this;
        }

        public Criteria andRecBalSumIsNull() {
            addCriterion("rec_bal_sum is null");
            return (Criteria) this;
        }

        public Criteria andRecBalSumIsNotNull() {
            addCriterion("rec_bal_sum is not null");
            return (Criteria) this;
        }

        public Criteria andRecBalSumEqualTo(BigDecimal value) {
            addCriterion("rec_bal_sum =", value, "recBalSum");
            return (Criteria) this;
        }

        public Criteria andRecBalSumNotEqualTo(BigDecimal value) {
            addCriterion("rec_bal_sum <>", value, "recBalSum");
            return (Criteria) this;
        }

        public Criteria andRecBalSumGreaterThan(BigDecimal value) {
            addCriterion("rec_bal_sum >", value, "recBalSum");
            return (Criteria) this;
        }

        public Criteria andRecBalSumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rec_bal_sum >=", value, "recBalSum");
            return (Criteria) this;
        }

        public Criteria andRecBalSumLessThan(BigDecimal value) {
            addCriterion("rec_bal_sum <", value, "recBalSum");
            return (Criteria) this;
        }

        public Criteria andRecBalSumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("rec_bal_sum <=", value, "recBalSum");
            return (Criteria) this;
        }

        public Criteria andRecBalSumIn(List<BigDecimal> values) {
            addCriterion("rec_bal_sum in", values, "recBalSum");
            return (Criteria) this;
        }

        public Criteria andRecBalSumNotIn(List<BigDecimal> values) {
            addCriterion("rec_bal_sum not in", values, "recBalSum");
            return (Criteria) this;
        }

        public Criteria andRecBalSumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rec_bal_sum between", value1, value2, "recBalSum");
            return (Criteria) this;
        }

        public Criteria andRecBalSumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rec_bal_sum not between", value1, value2, "recBalSum");
            return (Criteria) this;
        }

        public Criteria andUnfrzTimeIsNull() {
            addCriterion("unfrz_time is null");
            return (Criteria) this;
        }

        public Criteria andUnfrzTimeIsNotNull() {
            addCriterion("unfrz_time is not null");
            return (Criteria) this;
        }

        public Criteria andUnfrzTimeEqualTo(Date value) {
            addCriterion("unfrz_time =", value, "unfrzTime");
            return (Criteria) this;
        }

        public Criteria andUnfrzTimeNotEqualTo(Date value) {
            addCriterion("unfrz_time <>", value, "unfrzTime");
            return (Criteria) this;
        }

        public Criteria andUnfrzTimeGreaterThan(Date value) {
            addCriterion("unfrz_time >", value, "unfrzTime");
            return (Criteria) this;
        }

        public Criteria andUnfrzTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("unfrz_time >=", value, "unfrzTime");
            return (Criteria) this;
        }

        public Criteria andUnfrzTimeLessThan(Date value) {
            addCriterion("unfrz_time <", value, "unfrzTime");
            return (Criteria) this;
        }

        public Criteria andUnfrzTimeLessThanOrEqualTo(Date value) {
            addCriterion("unfrz_time <=", value, "unfrzTime");
            return (Criteria) this;
        }

        public Criteria andUnfrzTimeIn(List<Date> values) {
            addCriterion("unfrz_time in", values, "unfrzTime");
            return (Criteria) this;
        }

        public Criteria andUnfrzTimeNotIn(List<Date> values) {
            addCriterion("unfrz_time not in", values, "unfrzTime");
            return (Criteria) this;
        }

        public Criteria andUnfrzTimeBetween(Date value1, Date value2) {
            addCriterion("unfrz_time between", value1, value2, "unfrzTime");
            return (Criteria) this;
        }

        public Criteria andUnfrzTimeNotBetween(Date value1, Date value2) {
            addCriterion("unfrz_time not between", value1, value2, "unfrzTime");
            return (Criteria) this;
        }

        public Criteria andUnfrzExpLikeInsensitive(String value) {
            addCriterion("upper(unfrz_exp) like", value.toUpperCase(), "unfrzExp");
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