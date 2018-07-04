package com.wd.apiaccount.model.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AcctDayendAccExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AcctDayendAccExample() {
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

        public Criteria andAcctTypeNameIsNull() {
            addCriterion("acct_type_name is null");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNameIsNotNull() {
            addCriterion("acct_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNameEqualTo(String value) {
            addCriterion("acct_type_name =", value, "acctTypeName");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNameNotEqualTo(String value) {
            addCriterion("acct_type_name <>", value, "acctTypeName");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNameGreaterThan(String value) {
            addCriterion("acct_type_name >", value, "acctTypeName");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("acct_type_name >=", value, "acctTypeName");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNameLessThan(String value) {
            addCriterion("acct_type_name <", value, "acctTypeName");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNameLessThanOrEqualTo(String value) {
            addCriterion("acct_type_name <=", value, "acctTypeName");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNameLike(String value) {
            addCriterion("acct_type_name like", value, "acctTypeName");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNameNotLike(String value) {
            addCriterion("acct_type_name not like", value, "acctTypeName");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNameIn(List<String> values) {
            addCriterion("acct_type_name in", values, "acctTypeName");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNameNotIn(List<String> values) {
            addCriterion("acct_type_name not in", values, "acctTypeName");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNameBetween(String value1, String value2) {
            addCriterion("acct_type_name between", value1, value2, "acctTypeName");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNameNotBetween(String value1, String value2) {
            addCriterion("acct_type_name not between", value1, value2, "acctTypeName");
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

        public Criteria andAccStatusIsNull() {
            addCriterion("acc_status is null");
            return (Criteria) this;
        }

        public Criteria andAccStatusIsNotNull() {
            addCriterion("acc_status is not null");
            return (Criteria) this;
        }

        public Criteria andAccStatusEqualTo(String value) {
            addCriterion("acc_status =", value, "accStatus");
            return (Criteria) this;
        }

        public Criteria andAccStatusNotEqualTo(String value) {
            addCriterion("acc_status <>", value, "accStatus");
            return (Criteria) this;
        }

        public Criteria andAccStatusGreaterThan(String value) {
            addCriterion("acc_status >", value, "accStatus");
            return (Criteria) this;
        }

        public Criteria andAccStatusGreaterThanOrEqualTo(String value) {
            addCriterion("acc_status >=", value, "accStatus");
            return (Criteria) this;
        }

        public Criteria andAccStatusLessThan(String value) {
            addCriterion("acc_status <", value, "accStatus");
            return (Criteria) this;
        }

        public Criteria andAccStatusLessThanOrEqualTo(String value) {
            addCriterion("acc_status <=", value, "accStatus");
            return (Criteria) this;
        }

        public Criteria andAccStatusLike(String value) {
            addCriterion("acc_status like", value, "accStatus");
            return (Criteria) this;
        }

        public Criteria andAccStatusNotLike(String value) {
            addCriterion("acc_status not like", value, "accStatus");
            return (Criteria) this;
        }

        public Criteria andAccStatusIn(List<String> values) {
            addCriterion("acc_status in", values, "accStatus");
            return (Criteria) this;
        }

        public Criteria andAccStatusNotIn(List<String> values) {
            addCriterion("acc_status not in", values, "accStatus");
            return (Criteria) this;
        }

        public Criteria andAccStatusBetween(String value1, String value2) {
            addCriterion("acc_status between", value1, value2, "accStatus");
            return (Criteria) this;
        }

        public Criteria andAccStatusNotBetween(String value1, String value2) {
            addCriterion("acc_status not between", value1, value2, "accStatus");
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

        public Criteria andTotalCountIsNull() {
            addCriterion("total_count is null");
            return (Criteria) this;
        }

        public Criteria andTotalCountIsNotNull() {
            addCriterion("total_count is not null");
            return (Criteria) this;
        }

        public Criteria andTotalCountEqualTo(Integer value) {
            addCriterion("total_count =", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountNotEqualTo(Integer value) {
            addCriterion("total_count <>", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountGreaterThan(Integer value) {
            addCriterion("total_count >", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_count >=", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountLessThan(Integer value) {
            addCriterion("total_count <", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountLessThanOrEqualTo(Integer value) {
            addCriterion("total_count <=", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountIn(List<Integer> values) {
            addCriterion("total_count in", values, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountNotIn(List<Integer> values) {
            addCriterion("total_count not in", values, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountBetween(Integer value1, Integer value2) {
            addCriterion("total_count between", value1, value2, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountNotBetween(Integer value1, Integer value2) {
            addCriterion("total_count not between", value1, value2, "totalCount");
            return (Criteria) this;
        }

        public Criteria andSumBalIsNull() {
            addCriterion("sum_bal is null");
            return (Criteria) this;
        }

        public Criteria andSumBalIsNotNull() {
            addCriterion("sum_bal is not null");
            return (Criteria) this;
        }

        public Criteria andSumBalEqualTo(BigDecimal value) {
            addCriterion("sum_bal =", value, "sumBal");
            return (Criteria) this;
        }

        public Criteria andSumBalNotEqualTo(BigDecimal value) {
            addCriterion("sum_bal <>", value, "sumBal");
            return (Criteria) this;
        }

        public Criteria andSumBalGreaterThan(BigDecimal value) {
            addCriterion("sum_bal >", value, "sumBal");
            return (Criteria) this;
        }

        public Criteria andSumBalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sum_bal >=", value, "sumBal");
            return (Criteria) this;
        }

        public Criteria andSumBalLessThan(BigDecimal value) {
            addCriterion("sum_bal <", value, "sumBal");
            return (Criteria) this;
        }

        public Criteria andSumBalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sum_bal <=", value, "sumBal");
            return (Criteria) this;
        }

        public Criteria andSumBalIn(List<BigDecimal> values) {
            addCriterion("sum_bal in", values, "sumBal");
            return (Criteria) this;
        }

        public Criteria andSumBalNotIn(List<BigDecimal> values) {
            addCriterion("sum_bal not in", values, "sumBal");
            return (Criteria) this;
        }

        public Criteria andSumBalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sum_bal between", value1, value2, "sumBal");
            return (Criteria) this;
        }

        public Criteria andSumBalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sum_bal not between", value1, value2, "sumBal");
            return (Criteria) this;
        }

        public Criteria andSumFrzBalIsNull() {
            addCriterion("sum_frz_bal is null");
            return (Criteria) this;
        }

        public Criteria andSumFrzBalIsNotNull() {
            addCriterion("sum_frz_bal is not null");
            return (Criteria) this;
        }

        public Criteria andSumFrzBalEqualTo(BigDecimal value) {
            addCriterion("sum_frz_bal =", value, "sumFrzBal");
            return (Criteria) this;
        }

        public Criteria andSumFrzBalNotEqualTo(BigDecimal value) {
            addCriterion("sum_frz_bal <>", value, "sumFrzBal");
            return (Criteria) this;
        }

        public Criteria andSumFrzBalGreaterThan(BigDecimal value) {
            addCriterion("sum_frz_bal >", value, "sumFrzBal");
            return (Criteria) this;
        }

        public Criteria andSumFrzBalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sum_frz_bal >=", value, "sumFrzBal");
            return (Criteria) this;
        }

        public Criteria andSumFrzBalLessThan(BigDecimal value) {
            addCriterion("sum_frz_bal <", value, "sumFrzBal");
            return (Criteria) this;
        }

        public Criteria andSumFrzBalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sum_frz_bal <=", value, "sumFrzBal");
            return (Criteria) this;
        }

        public Criteria andSumFrzBalIn(List<BigDecimal> values) {
            addCriterion("sum_frz_bal in", values, "sumFrzBal");
            return (Criteria) this;
        }

        public Criteria andSumFrzBalNotIn(List<BigDecimal> values) {
            addCriterion("sum_frz_bal not in", values, "sumFrzBal");
            return (Criteria) this;
        }

        public Criteria andSumFrzBalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sum_frz_bal between", value1, value2, "sumFrzBal");
            return (Criteria) this;
        }

        public Criteria andSumFrzBalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sum_frz_bal not between", value1, value2, "sumFrzBal");
            return (Criteria) this;
        }

        public Criteria andSumRecBalIsNull() {
            addCriterion("sum_rec_bal is null");
            return (Criteria) this;
        }

        public Criteria andSumRecBalIsNotNull() {
            addCriterion("sum_rec_bal is not null");
            return (Criteria) this;
        }

        public Criteria andSumRecBalEqualTo(BigDecimal value) {
            addCriterion("sum_rec_bal =", value, "sumRecBal");
            return (Criteria) this;
        }

        public Criteria andSumRecBalNotEqualTo(BigDecimal value) {
            addCriterion("sum_rec_bal <>", value, "sumRecBal");
            return (Criteria) this;
        }

        public Criteria andSumRecBalGreaterThan(BigDecimal value) {
            addCriterion("sum_rec_bal >", value, "sumRecBal");
            return (Criteria) this;
        }

        public Criteria andSumRecBalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sum_rec_bal >=", value, "sumRecBal");
            return (Criteria) this;
        }

        public Criteria andSumRecBalLessThan(BigDecimal value) {
            addCriterion("sum_rec_bal <", value, "sumRecBal");
            return (Criteria) this;
        }

        public Criteria andSumRecBalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sum_rec_bal <=", value, "sumRecBal");
            return (Criteria) this;
        }

        public Criteria andSumRecBalIn(List<BigDecimal> values) {
            addCriterion("sum_rec_bal in", values, "sumRecBal");
            return (Criteria) this;
        }

        public Criteria andSumRecBalNotIn(List<BigDecimal> values) {
            addCriterion("sum_rec_bal not in", values, "sumRecBal");
            return (Criteria) this;
        }

        public Criteria andSumRecBalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sum_rec_bal between", value1, value2, "sumRecBal");
            return (Criteria) this;
        }

        public Criteria andSumRecBalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sum_rec_bal not between", value1, value2, "sumRecBal");
            return (Criteria) this;
        }

        public Criteria andSumNumIsNull() {
            addCriterion("sum_num is null");
            return (Criteria) this;
        }

        public Criteria andSumNumIsNotNull() {
            addCriterion("sum_num is not null");
            return (Criteria) this;
        }

        public Criteria andSumNumEqualTo(Integer value) {
            addCriterion("sum_num =", value, "sumNum");
            return (Criteria) this;
        }

        public Criteria andSumNumNotEqualTo(Integer value) {
            addCriterion("sum_num <>", value, "sumNum");
            return (Criteria) this;
        }

        public Criteria andSumNumGreaterThan(Integer value) {
            addCriterion("sum_num >", value, "sumNum");
            return (Criteria) this;
        }

        public Criteria andSumNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("sum_num >=", value, "sumNum");
            return (Criteria) this;
        }

        public Criteria andSumNumLessThan(Integer value) {
            addCriterion("sum_num <", value, "sumNum");
            return (Criteria) this;
        }

        public Criteria andSumNumLessThanOrEqualTo(Integer value) {
            addCriterion("sum_num <=", value, "sumNum");
            return (Criteria) this;
        }

        public Criteria andSumNumIn(List<Integer> values) {
            addCriterion("sum_num in", values, "sumNum");
            return (Criteria) this;
        }

        public Criteria andSumNumNotIn(List<Integer> values) {
            addCriterion("sum_num not in", values, "sumNum");
            return (Criteria) this;
        }

        public Criteria andSumNumBetween(Integer value1, Integer value2) {
            addCriterion("sum_num between", value1, value2, "sumNum");
            return (Criteria) this;
        }

        public Criteria andSumNumNotBetween(Integer value1, Integer value2) {
            addCriterion("sum_num not between", value1, value2, "sumNum");
            return (Criteria) this;
        }

        public Criteria andUserTypeLikeInsensitive(String value) {
            addCriterion("upper(user_type) like", value.toUpperCase(), "userType");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNoLikeInsensitive(String value) {
            addCriterion("upper(acct_type_no) like", value.toUpperCase(), "acctTypeNo");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNameLikeInsensitive(String value) {
            addCriterion("upper(acct_type_name) like", value.toUpperCase(), "acctTypeName");
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

        public Criteria andAccStatusLikeInsensitive(String value) {
            addCriterion("upper(acc_status) like", value.toUpperCase(), "accStatus");
            return (Criteria) this;
        }

        public Criteria andExpLikeInsensitive(String value) {
            addCriterion("upper(exp) like", value.toUpperCase(), "exp");
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