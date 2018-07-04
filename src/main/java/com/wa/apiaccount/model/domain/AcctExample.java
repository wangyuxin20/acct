package com.wd.apiaccount.model.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AcctExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AcctExample() {
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

        public Criteria andUserNoIsNull() {
            addCriterion("user_no is null");
            return (Criteria) this;
        }

        public Criteria andUserNoIsNotNull() {
            addCriterion("user_no is not null");
            return (Criteria) this;
        }

        public Criteria andUserNoEqualTo(String value) {
            addCriterion("user_no =", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotEqualTo(String value) {
            addCriterion("user_no <>", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoGreaterThan(String value) {
            addCriterion("user_no >", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoGreaterThanOrEqualTo(String value) {
            addCriterion("user_no >=", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoLessThan(String value) {
            addCriterion("user_no <", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoLessThanOrEqualTo(String value) {
            addCriterion("user_no <=", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoLike(String value) {
            addCriterion("user_no like", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotLike(String value) {
            addCriterion("user_no not like", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoIn(List<String> values) {
            addCriterion("user_no in", values, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotIn(List<String> values) {
            addCriterion("user_no not in", values, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoBetween(String value1, String value2) {
            addCriterion("user_no between", value1, value2, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotBetween(String value1, String value2) {
            addCriterion("user_no not between", value1, value2, "userNo");
            return (Criteria) this;
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

        public Criteria andAcctTypeNoIsNull() {
            addCriterion("acct_type_no is null");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNoIsNotNull() {
            addCriterion("acct_type_no is not null");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNoEqualTo(String value) {
            addCriterion("acct_type_no =", value, "acctTypeNo");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNoNotEqualTo(String value) {
            addCriterion("acct_type_no <>", value, "acctTypeNo");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNoGreaterThan(String value) {
            addCriterion("acct_type_no >", value, "acctTypeNo");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNoGreaterThanOrEqualTo(String value) {
            addCriterion("acct_type_no >=", value, "acctTypeNo");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNoLessThan(String value) {
            addCriterion("acct_type_no <", value, "acctTypeNo");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNoLessThanOrEqualTo(String value) {
            addCriterion("acct_type_no <=", value, "acctTypeNo");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNoLike(String value) {
            addCriterion("acct_type_no like", value, "acctTypeNo");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNoNotLike(String value) {
            addCriterion("acct_type_no not like", value, "acctTypeNo");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNoIn(List<String> values) {
            addCriterion("acct_type_no in", values, "acctTypeNo");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNoNotIn(List<String> values) {
            addCriterion("acct_type_no not in", values, "acctTypeNo");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNoBetween(String value1, String value2) {
            addCriterion("acct_type_no between", value1, value2, "acctTypeNo");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNoNotBetween(String value1, String value2) {
            addCriterion("acct_type_no not between", value1, value2, "acctTypeNo");
            return (Criteria) this;
        }

        public Criteria andExpIsNull() {
            addCriterion("exp is null");
            return (Criteria) this;
        }

        public Criteria andExpIsNotNull() {
            addCriterion("exp is not null");
            return (Criteria) this;
        }

        public Criteria andExpEqualTo(String value) {
            addCriterion("exp =", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpNotEqualTo(String value) {
            addCriterion("exp <>", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpGreaterThan(String value) {
            addCriterion("exp >", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpGreaterThanOrEqualTo(String value) {
            addCriterion("exp >=", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpLessThan(String value) {
            addCriterion("exp <", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpLessThanOrEqualTo(String value) {
            addCriterion("exp <=", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpLike(String value) {
            addCriterion("exp like", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpNotLike(String value) {
            addCriterion("exp not like", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpIn(List<String> values) {
            addCriterion("exp in", values, "exp");
            return (Criteria) this;
        }

        public Criteria andExpNotIn(List<String> values) {
            addCriterion("exp not in", values, "exp");
            return (Criteria) this;
        }

        public Criteria andExpBetween(String value1, String value2) {
            addCriterion("exp between", value1, value2, "exp");
            return (Criteria) this;
        }

        public Criteria andExpNotBetween(String value1, String value2) {
            addCriterion("exp not between", value1, value2, "exp");
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

        public Criteria andUserTypeIsNull() {
            addCriterion("user_type is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("user_type is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(String value) {
            addCriterion("user_type =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(String value) {
            addCriterion("user_type <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(String value) {
            addCriterion("user_type >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(String value) {
            addCriterion("user_type >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(String value) {
            addCriterion("user_type <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(String value) {
            addCriterion("user_type <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLike(String value) {
            addCriterion("user_type like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotLike(String value) {
            addCriterion("user_type not like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<String> values) {
            addCriterion("user_type in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<String> values) {
            addCriterion("user_type not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(String value1, String value2) {
            addCriterion("user_type between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(String value1, String value2) {
            addCriterion("user_type not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andBalIsNull() {
            addCriterion("bal is null");
            return (Criteria) this;
        }

        public Criteria andBalIsNotNull() {
            addCriterion("bal is not null");
            return (Criteria) this;
        }

        public Criteria andBalEqualTo(BigDecimal value) {
            addCriterion("bal =", value, "bal");
            return (Criteria) this;
        }

        public Criteria andBalNotEqualTo(BigDecimal value) {
            addCriterion("bal <>", value, "bal");
            return (Criteria) this;
        }

        public Criteria andBalGreaterThan(BigDecimal value) {
            addCriterion("bal >", value, "bal");
            return (Criteria) this;
        }

        public Criteria andBalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bal >=", value, "bal");
            return (Criteria) this;
        }

        public Criteria andBalLessThan(BigDecimal value) {
            addCriterion("bal <", value, "bal");
            return (Criteria) this;
        }

        public Criteria andBalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bal <=", value, "bal");
            return (Criteria) this;
        }

        public Criteria andBalIn(List<BigDecimal> values) {
            addCriterion("bal in", values, "bal");
            return (Criteria) this;
        }

        public Criteria andBalNotIn(List<BigDecimal> values) {
            addCriterion("bal not in", values, "bal");
            return (Criteria) this;
        }

        public Criteria andBalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bal between", value1, value2, "bal");
            return (Criteria) this;
        }

        public Criteria andBalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bal not between", value1, value2, "bal");
            return (Criteria) this;
        }

        public Criteria andIncBalIsNull() {
            addCriterion("inc_bal is null");
            return (Criteria) this;
        }

        public Criteria andIncBalIsNotNull() {
            addCriterion("inc_bal is not null");
            return (Criteria) this;
        }

        public Criteria andIncBalEqualTo(BigDecimal value) {
            addCriterion("inc_bal =", value, "incBal");
            return (Criteria) this;
        }

        public Criteria andIncBalNotEqualTo(BigDecimal value) {
            addCriterion("inc_bal <>", value, "incBal");
            return (Criteria) this;
        }

        public Criteria andIncBalGreaterThan(BigDecimal value) {
            addCriterion("inc_bal >", value, "incBal");
            return (Criteria) this;
        }

        public Criteria andIncBalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("inc_bal >=", value, "incBal");
            return (Criteria) this;
        }

        public Criteria andIncBalLessThan(BigDecimal value) {
            addCriterion("inc_bal <", value, "incBal");
            return (Criteria) this;
        }

        public Criteria andIncBalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("inc_bal <=", value, "incBal");
            return (Criteria) this;
        }

        public Criteria andIncBalIn(List<BigDecimal> values) {
            addCriterion("inc_bal in", values, "incBal");
            return (Criteria) this;
        }

        public Criteria andIncBalNotIn(List<BigDecimal> values) {
            addCriterion("inc_bal not in", values, "incBal");
            return (Criteria) this;
        }

        public Criteria andIncBalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("inc_bal between", value1, value2, "incBal");
            return (Criteria) this;
        }

        public Criteria andIncBalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("inc_bal not between", value1, value2, "incBal");
            return (Criteria) this;
        }

        public Criteria andFrzBalIsNull() {
            addCriterion("frz_bal is null");
            return (Criteria) this;
        }

        public Criteria andFrzBalIsNotNull() {
            addCriterion("frz_bal is not null");
            return (Criteria) this;
        }

        public Criteria andFrzBalEqualTo(BigDecimal value) {
            addCriterion("frz_bal =", value, "frzBal");
            return (Criteria) this;
        }

        public Criteria andFrzBalNotEqualTo(BigDecimal value) {
            addCriterion("frz_bal <>", value, "frzBal");
            return (Criteria) this;
        }

        public Criteria andFrzBalGreaterThan(BigDecimal value) {
            addCriterion("frz_bal >", value, "frzBal");
            return (Criteria) this;
        }

        public Criteria andFrzBalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("frz_bal >=", value, "frzBal");
            return (Criteria) this;
        }

        public Criteria andFrzBalLessThan(BigDecimal value) {
            addCriterion("frz_bal <", value, "frzBal");
            return (Criteria) this;
        }

        public Criteria andFrzBalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("frz_bal <=", value, "frzBal");
            return (Criteria) this;
        }

        public Criteria andFrzBalIn(List<BigDecimal> values) {
            addCriterion("frz_bal in", values, "frzBal");
            return (Criteria) this;
        }

        public Criteria andFrzBalNotIn(List<BigDecimal> values) {
            addCriterion("frz_bal not in", values, "frzBal");
            return (Criteria) this;
        }

        public Criteria andFrzBalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("frz_bal between", value1, value2, "frzBal");
            return (Criteria) this;
        }

        public Criteria andFrzBalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("frz_bal not between", value1, value2, "frzBal");
            return (Criteria) this;
        }

        public Criteria andRecBalIsNull() {
            addCriterion("rec_bal is null");
            return (Criteria) this;
        }

        public Criteria andRecBalIsNotNull() {
            addCriterion("rec_bal is not null");
            return (Criteria) this;
        }

        public Criteria andRecBalEqualTo(BigDecimal value) {
            addCriterion("rec_bal =", value, "recBal");
            return (Criteria) this;
        }

        public Criteria andRecBalNotEqualTo(BigDecimal value) {
            addCriterion("rec_bal <>", value, "recBal");
            return (Criteria) this;
        }

        public Criteria andRecBalGreaterThan(BigDecimal value) {
            addCriterion("rec_bal >", value, "recBal");
            return (Criteria) this;
        }

        public Criteria andRecBalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rec_bal >=", value, "recBal");
            return (Criteria) this;
        }

        public Criteria andRecBalLessThan(BigDecimal value) {
            addCriterion("rec_bal <", value, "recBal");
            return (Criteria) this;
        }

        public Criteria andRecBalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("rec_bal <=", value, "recBal");
            return (Criteria) this;
        }

        public Criteria andRecBalIn(List<BigDecimal> values) {
            addCriterion("rec_bal in", values, "recBal");
            return (Criteria) this;
        }

        public Criteria andRecBalNotIn(List<BigDecimal> values) {
            addCriterion("rec_bal not in", values, "recBal");
            return (Criteria) this;
        }

        public Criteria andRecBalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rec_bal between", value1, value2, "recBal");
            return (Criteria) this;
        }

        public Criteria andRecBalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rec_bal not between", value1, value2, "recBal");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andDacIsNull() {
            addCriterion("dac is null");
            return (Criteria) this;
        }

        public Criteria andDacIsNotNull() {
            addCriterion("dac is not null");
            return (Criteria) this;
        }

        public Criteria andDacEqualTo(String value) {
            addCriterion("dac =", value, "dac");
            return (Criteria) this;
        }

        public Criteria andDacNotEqualTo(String value) {
            addCriterion("dac <>", value, "dac");
            return (Criteria) this;
        }

        public Criteria andDacGreaterThan(String value) {
            addCriterion("dac >", value, "dac");
            return (Criteria) this;
        }

        public Criteria andDacGreaterThanOrEqualTo(String value) {
            addCriterion("dac >=", value, "dac");
            return (Criteria) this;
        }

        public Criteria andDacLessThan(String value) {
            addCriterion("dac <", value, "dac");
            return (Criteria) this;
        }

        public Criteria andDacLessThanOrEqualTo(String value) {
            addCriterion("dac <=", value, "dac");
            return (Criteria) this;
        }

        public Criteria andDacLike(String value) {
            addCriterion("dac like", value, "dac");
            return (Criteria) this;
        }

        public Criteria andDacNotLike(String value) {
            addCriterion("dac not like", value, "dac");
            return (Criteria) this;
        }

        public Criteria andDacIn(List<String> values) {
            addCriterion("dac in", values, "dac");
            return (Criteria) this;
        }

        public Criteria andDacNotIn(List<String> values) {
            addCriterion("dac not in", values, "dac");
            return (Criteria) this;
        }

        public Criteria andDacBetween(String value1, String value2) {
            addCriterion("dac between", value1, value2, "dac");
            return (Criteria) this;
        }

        public Criteria andDacNotBetween(String value1, String value2) {
            addCriterion("dac not between", value1, value2, "dac");
            return (Criteria) this;
        }

        public Criteria andNodeIsNull() {
            addCriterion("node is null");
            return (Criteria) this;
        }

        public Criteria andNodeIsNotNull() {
            addCriterion("node is not null");
            return (Criteria) this;
        }

        public Criteria andNodeEqualTo(Integer value) {
            addCriterion("node =", value, "node");
            return (Criteria) this;
        }

        public Criteria andNodeNotEqualTo(Integer value) {
            addCriterion("node <>", value, "node");
            return (Criteria) this;
        }

        public Criteria andNodeGreaterThan(Integer value) {
            addCriterion("node >", value, "node");
            return (Criteria) this;
        }

        public Criteria andNodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("node >=", value, "node");
            return (Criteria) this;
        }

        public Criteria andNodeLessThan(Integer value) {
            addCriterion("node <", value, "node");
            return (Criteria) this;
        }

        public Criteria andNodeLessThanOrEqualTo(Integer value) {
            addCriterion("node <=", value, "node");
            return (Criteria) this;
        }

        public Criteria andNodeIn(List<Integer> values) {
            addCriterion("node in", values, "node");
            return (Criteria) this;
        }

        public Criteria andNodeNotIn(List<Integer> values) {
            addCriterion("node not in", values, "node");
            return (Criteria) this;
        }

        public Criteria andNodeBetween(Integer value1, Integer value2) {
            addCriterion("node between", value1, value2, "node");
            return (Criteria) this;
        }

        public Criteria andNodeNotBetween(Integer value1, Integer value2) {
            addCriterion("node not between", value1, value2, "node");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(Integer value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Integer value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Integer value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Integer value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Integer value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<Integer> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<Integer> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(Integer value1, Integer value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(Integer value1, Integer value2) {
            addCriterion("num not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andLastTimeIsNull() {
            addCriterion("last_time is null");
            return (Criteria) this;
        }

        public Criteria andLastTimeIsNotNull() {
            addCriterion("last_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastTimeEqualTo(Date value) {
            addCriterion("last_time =", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotEqualTo(Date value) {
            addCriterion("last_time <>", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeGreaterThan(Date value) {
            addCriterion("last_time >", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_time >=", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeLessThan(Date value) {
            addCriterion("last_time <", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_time <=", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeIn(List<Date> values) {
            addCriterion("last_time in", values, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotIn(List<Date> values) {
            addCriterion("last_time not in", values, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeBetween(Date value1, Date value2) {
            addCriterion("last_time between", value1, value2, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_time not between", value1, value2, "lastTime");
            return (Criteria) this;
        }

        public Criteria andUserNoLikeInsensitive(String value) {
            addCriterion("upper(user_no) like", value.toUpperCase(), "userNo");
            return (Criteria) this;
        }

        public Criteria andCurrNoLikeInsensitive(String value) {
            addCriterion("upper(curr_no) like", value.toUpperCase(), "currNo");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNoLikeInsensitive(String value) {
            addCriterion("upper(acct_type_no) like", value.toUpperCase(), "acctTypeNo");
            return (Criteria) this;
        }

        public Criteria andExpLikeInsensitive(String value) {
            addCriterion("upper(exp) like", value.toUpperCase(), "exp");
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

        public Criteria andUserTypeLikeInsensitive(String value) {
            addCriterion("upper(user_type) like", value.toUpperCase(), "userType");
            return (Criteria) this;
        }

        public Criteria andStatusLikeInsensitive(String value) {
            addCriterion("upper(status) like", value.toUpperCase(), "status");
            return (Criteria) this;
        }

        public Criteria andDacLikeInsensitive(String value) {
            addCriterion("upper(dac) like", value.toUpperCase(), "dac");
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