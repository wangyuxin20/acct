package com.wa.apiaccount.core.model.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AcctRecordSumExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AcctRecordSumExample() {
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

        public Criteria andAmtIsNull() {
            addCriterion("amt is null");
            return (Criteria) this;
        }

        public Criteria andAmtIsNotNull() {
            addCriterion("amt is not null");
            return (Criteria) this;
        }

        public Criteria andAmtEqualTo(BigDecimal value) {
            addCriterion("amt =", value, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtNotEqualTo(BigDecimal value) {
            addCriterion("amt <>", value, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtGreaterThan(BigDecimal value) {
            addCriterion("amt >", value, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amt >=", value, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtLessThan(BigDecimal value) {
            addCriterion("amt <", value, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amt <=", value, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtIn(List<BigDecimal> values) {
            addCriterion("amt in", values, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtNotIn(List<BigDecimal> values) {
            addCriterion("amt not in", values, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amt between", value1, value2, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amt not between", value1, value2, "amt");
            return (Criteria) this;
        }

        public Criteria andInrFlowIdIsNull() {
            addCriterion("inr_flow_id is null");
            return (Criteria) this;
        }

        public Criteria andInrFlowIdIsNotNull() {
            addCriterion("inr_flow_id is not null");
            return (Criteria) this;
        }

        public Criteria andInrFlowIdEqualTo(Long value) {
            addCriterion("inr_flow_id =", value, "inrFlowId");
            return (Criteria) this;
        }

        public Criteria andInrFlowIdNotEqualTo(Long value) {
            addCriterion("inr_flow_id <>", value, "inrFlowId");
            return (Criteria) this;
        }

        public Criteria andInrFlowIdGreaterThan(Long value) {
            addCriterion("inr_flow_id >", value, "inrFlowId");
            return (Criteria) this;
        }

        public Criteria andInrFlowIdGreaterThanOrEqualTo(Long value) {
            addCriterion("inr_flow_id >=", value, "inrFlowId");
            return (Criteria) this;
        }

        public Criteria andInrFlowIdLessThan(Long value) {
            addCriterion("inr_flow_id <", value, "inrFlowId");
            return (Criteria) this;
        }

        public Criteria andInrFlowIdLessThanOrEqualTo(Long value) {
            addCriterion("inr_flow_id <=", value, "inrFlowId");
            return (Criteria) this;
        }

        public Criteria andInrFlowIdIn(List<Long> values) {
            addCriterion("inr_flow_id in", values, "inrFlowId");
            return (Criteria) this;
        }

        public Criteria andInrFlowIdNotIn(List<Long> values) {
            addCriterion("inr_flow_id not in", values, "inrFlowId");
            return (Criteria) this;
        }

        public Criteria andInrFlowIdBetween(Long value1, Long value2) {
            addCriterion("inr_flow_id between", value1, value2, "inrFlowId");
            return (Criteria) this;
        }

        public Criteria andInrFlowIdNotBetween(Long value1, Long value2) {
            addCriterion("inr_flow_id not between", value1, value2, "inrFlowId");
            return (Criteria) this;
        }

        public Criteria andTsfOppDirIsNull() {
            addCriterion("tsf_opp_dir is null");
            return (Criteria) this;
        }

        public Criteria andTsfOppDirIsNotNull() {
            addCriterion("tsf_opp_dir is not null");
            return (Criteria) this;
        }

        public Criteria andTsfOppDirEqualTo(String value) {
            addCriterion("tsf_opp_dir =", value, "tsfOppDir");
            return (Criteria) this;
        }

        public Criteria andTsfOppDirNotEqualTo(String value) {
            addCriterion("tsf_opp_dir <>", value, "tsfOppDir");
            return (Criteria) this;
        }

        public Criteria andTsfOppDirGreaterThan(String value) {
            addCriterion("tsf_opp_dir >", value, "tsfOppDir");
            return (Criteria) this;
        }

        public Criteria andTsfOppDirGreaterThanOrEqualTo(String value) {
            addCriterion("tsf_opp_dir >=", value, "tsfOppDir");
            return (Criteria) this;
        }

        public Criteria andTsfOppDirLessThan(String value) {
            addCriterion("tsf_opp_dir <", value, "tsfOppDir");
            return (Criteria) this;
        }

        public Criteria andTsfOppDirLessThanOrEqualTo(String value) {
            addCriterion("tsf_opp_dir <=", value, "tsfOppDir");
            return (Criteria) this;
        }

        public Criteria andTsfOppDirLike(String value) {
            addCriterion("tsf_opp_dir like", value, "tsfOppDir");
            return (Criteria) this;
        }

        public Criteria andTsfOppDirNotLike(String value) {
            addCriterion("tsf_opp_dir not like", value, "tsfOppDir");
            return (Criteria) this;
        }

        public Criteria andTsfOppDirIn(List<String> values) {
            addCriterion("tsf_opp_dir in", values, "tsfOppDir");
            return (Criteria) this;
        }

        public Criteria andTsfOppDirNotIn(List<String> values) {
            addCriterion("tsf_opp_dir not in", values, "tsfOppDir");
            return (Criteria) this;
        }

        public Criteria andTsfOppDirBetween(String value1, String value2) {
            addCriterion("tsf_opp_dir between", value1, value2, "tsfOppDir");
            return (Criteria) this;
        }

        public Criteria andTsfOppDirNotBetween(String value1, String value2) {
            addCriterion("tsf_opp_dir not between", value1, value2, "tsfOppDir");
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

        public Criteria andLastTimeIsNull() {
            addCriterion("last_time is null");
            return (Criteria) this;
        }

        public Criteria andLastTimeIsNotNull() {
            addCriterion("last_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastTimeEqualTo(String value) {
            addCriterion("last_time =", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotEqualTo(String value) {
            addCriterion("last_time <>", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeGreaterThan(String value) {
            addCriterion("last_time >", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeGreaterThanOrEqualTo(String value) {
            addCriterion("last_time >=", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeLessThan(String value) {
            addCriterion("last_time <", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeLessThanOrEqualTo(String value) {
            addCriterion("last_time <=", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeLike(String value) {
            addCriterion("last_time like", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotLike(String value) {
            addCriterion("last_time not like", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeIn(List<String> values) {
            addCriterion("last_time in", values, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotIn(List<String> values) {
            addCriterion("last_time not in", values, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeBetween(String value1, String value2) {
            addCriterion("last_time between", value1, value2, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotBetween(String value1, String value2) {
            addCriterion("last_time not between", value1, value2, "lastTime");
            return (Criteria) this;
        }

        public Criteria andAcctNoLikeInsensitive(String value) {
            addCriterion("upper(acct_no) like", value.toUpperCase(), "acctNo");
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

        public Criteria andTsfOppDirLikeInsensitive(String value) {
            addCriterion("upper(tsf_opp_dir) like", value.toUpperCase(), "tsfOppDir");
            return (Criteria) this;
        }

        public Criteria andLastTimeLikeInsensitive(String value) {
            addCriterion("upper(last_time) like", value.toUpperCase(), "lastTime");
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