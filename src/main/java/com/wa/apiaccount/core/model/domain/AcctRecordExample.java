package com.wa.apiaccount.core.model.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AcctRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AcctRecordExample() {
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

        public Criteria andAcctAliasIsNull() {
            addCriterion("acct_alias is null");
            return (Criteria) this;
        }

        public Criteria andAcctAliasIsNotNull() {
            addCriterion("acct_alias is not null");
            return (Criteria) this;
        }

        public Criteria andAcctAliasEqualTo(String value) {
            addCriterion("acct_alias =", value, "acctAlias");
            return (Criteria) this;
        }

        public Criteria andAcctAliasNotEqualTo(String value) {
            addCriterion("acct_alias <>", value, "acctAlias");
            return (Criteria) this;
        }

        public Criteria andAcctAliasGreaterThan(String value) {
            addCriterion("acct_alias >", value, "acctAlias");
            return (Criteria) this;
        }

        public Criteria andAcctAliasGreaterThanOrEqualTo(String value) {
            addCriterion("acct_alias >=", value, "acctAlias");
            return (Criteria) this;
        }

        public Criteria andAcctAliasLessThan(String value) {
            addCriterion("acct_alias <", value, "acctAlias");
            return (Criteria) this;
        }

        public Criteria andAcctAliasLessThanOrEqualTo(String value) {
            addCriterion("acct_alias <=", value, "acctAlias");
            return (Criteria) this;
        }

        public Criteria andAcctAliasLike(String value) {
            addCriterion("acct_alias like", value, "acctAlias");
            return (Criteria) this;
        }

        public Criteria andAcctAliasNotLike(String value) {
            addCriterion("acct_alias not like", value, "acctAlias");
            return (Criteria) this;
        }

        public Criteria andAcctAliasIn(List<String> values) {
            addCriterion("acct_alias in", values, "acctAlias");
            return (Criteria) this;
        }

        public Criteria andAcctAliasNotIn(List<String> values) {
            addCriterion("acct_alias not in", values, "acctAlias");
            return (Criteria) this;
        }

        public Criteria andAcctAliasBetween(String value1, String value2) {
            addCriterion("acct_alias between", value1, value2, "acctAlias");
            return (Criteria) this;
        }

        public Criteria andAcctAliasNotBetween(String value1, String value2) {
            addCriterion("acct_alias not between", value1, value2, "acctAlias");
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

        public Criteria andOpnBalIsNull() {
            addCriterion("opn_bal is null");
            return (Criteria) this;
        }

        public Criteria andOpnBalIsNotNull() {
            addCriterion("opn_bal is not null");
            return (Criteria) this;
        }

        public Criteria andOpnBalEqualTo(BigDecimal value) {
            addCriterion("opn_bal =", value, "opnBal");
            return (Criteria) this;
        }

        public Criteria andOpnBalNotEqualTo(BigDecimal value) {
            addCriterion("opn_bal <>", value, "opnBal");
            return (Criteria) this;
        }

        public Criteria andOpnBalGreaterThan(BigDecimal value) {
            addCriterion("opn_bal >", value, "opnBal");
            return (Criteria) this;
        }

        public Criteria andOpnBalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("opn_bal >=", value, "opnBal");
            return (Criteria) this;
        }

        public Criteria andOpnBalLessThan(BigDecimal value) {
            addCriterion("opn_bal <", value, "opnBal");
            return (Criteria) this;
        }

        public Criteria andOpnBalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("opn_bal <=", value, "opnBal");
            return (Criteria) this;
        }

        public Criteria andOpnBalIn(List<BigDecimal> values) {
            addCriterion("opn_bal in", values, "opnBal");
            return (Criteria) this;
        }

        public Criteria andOpnBalNotIn(List<BigDecimal> values) {
            addCriterion("opn_bal not in", values, "opnBal");
            return (Criteria) this;
        }

        public Criteria andOpnBalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("opn_bal between", value1, value2, "opnBal");
            return (Criteria) this;
        }

        public Criteria andOpnBalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("opn_bal not between", value1, value2, "opnBal");
            return (Criteria) this;
        }

        public Criteria andClsBalIsNull() {
            addCriterion("cls_bal is null");
            return (Criteria) this;
        }

        public Criteria andClsBalIsNotNull() {
            addCriterion("cls_bal is not null");
            return (Criteria) this;
        }

        public Criteria andClsBalEqualTo(BigDecimal value) {
            addCriterion("cls_bal =", value, "clsBal");
            return (Criteria) this;
        }

        public Criteria andClsBalNotEqualTo(BigDecimal value) {
            addCriterion("cls_bal <>", value, "clsBal");
            return (Criteria) this;
        }

        public Criteria andClsBalGreaterThan(BigDecimal value) {
            addCriterion("cls_bal >", value, "clsBal");
            return (Criteria) this;
        }

        public Criteria andClsBalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cls_bal >=", value, "clsBal");
            return (Criteria) this;
        }

        public Criteria andClsBalLessThan(BigDecimal value) {
            addCriterion("cls_bal <", value, "clsBal");
            return (Criteria) this;
        }

        public Criteria andClsBalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cls_bal <=", value, "clsBal");
            return (Criteria) this;
        }

        public Criteria andClsBalIn(List<BigDecimal> values) {
            addCriterion("cls_bal in", values, "clsBal");
            return (Criteria) this;
        }

        public Criteria andClsBalNotIn(List<BigDecimal> values) {
            addCriterion("cls_bal not in", values, "clsBal");
            return (Criteria) this;
        }

        public Criteria andClsBalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cls_bal between", value1, value2, "clsBal");
            return (Criteria) this;
        }

        public Criteria andClsBalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cls_bal not between", value1, value2, "clsBal");
            return (Criteria) this;
        }

        public Criteria andTranAmtIsNull() {
            addCriterion("tran_amt is null");
            return (Criteria) this;
        }

        public Criteria andTranAmtIsNotNull() {
            addCriterion("tran_amt is not null");
            return (Criteria) this;
        }

        public Criteria andTranAmtEqualTo(BigDecimal value) {
            addCriterion("tran_amt =", value, "tranAmt");
            return (Criteria) this;
        }

        public Criteria andTranAmtNotEqualTo(BigDecimal value) {
            addCriterion("tran_amt <>", value, "tranAmt");
            return (Criteria) this;
        }

        public Criteria andTranAmtGreaterThan(BigDecimal value) {
            addCriterion("tran_amt >", value, "tranAmt");
            return (Criteria) this;
        }

        public Criteria andTranAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tran_amt >=", value, "tranAmt");
            return (Criteria) this;
        }

        public Criteria andTranAmtLessThan(BigDecimal value) {
            addCriterion("tran_amt <", value, "tranAmt");
            return (Criteria) this;
        }

        public Criteria andTranAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tran_amt <=", value, "tranAmt");
            return (Criteria) this;
        }

        public Criteria andTranAmtIn(List<BigDecimal> values) {
            addCriterion("tran_amt in", values, "tranAmt");
            return (Criteria) this;
        }

        public Criteria andTranAmtNotIn(List<BigDecimal> values) {
            addCriterion("tran_amt not in", values, "tranAmt");
            return (Criteria) this;
        }

        public Criteria andTranAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tran_amt between", value1, value2, "tranAmt");
            return (Criteria) this;
        }

        public Criteria andTranAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tran_amt not between", value1, value2, "tranAmt");
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

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
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

        public Criteria andAcctNoLikeInsensitive(String value) {
            addCriterion("upper(acct_no) like", value.toUpperCase(), "acctNo");
            return (Criteria) this;
        }

        public Criteria andAcctAliasLikeInsensitive(String value) {
            addCriterion("upper(acct_alias) like", value.toUpperCase(), "acctAlias");
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