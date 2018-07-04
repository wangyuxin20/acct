package com.wd.apiaccount.model.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AcctMktExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AcctMktExample() {
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

        public Criteria andMktNoIsNull() {
            addCriterion("mkt_no is null");
            return (Criteria) this;
        }

        public Criteria andMktNoIsNotNull() {
            addCriterion("mkt_no is not null");
            return (Criteria) this;
        }

        public Criteria andMktNoEqualTo(String value) {
            addCriterion("mkt_no =", value, "mktNo");
            return (Criteria) this;
        }

        public Criteria andMktNoNotEqualTo(String value) {
            addCriterion("mkt_no <>", value, "mktNo");
            return (Criteria) this;
        }

        public Criteria andMktNoGreaterThan(String value) {
            addCriterion("mkt_no >", value, "mktNo");
            return (Criteria) this;
        }

        public Criteria andMktNoGreaterThanOrEqualTo(String value) {
            addCriterion("mkt_no >=", value, "mktNo");
            return (Criteria) this;
        }

        public Criteria andMktNoLessThan(String value) {
            addCriterion("mkt_no <", value, "mktNo");
            return (Criteria) this;
        }

        public Criteria andMktNoLessThanOrEqualTo(String value) {
            addCriterion("mkt_no <=", value, "mktNo");
            return (Criteria) this;
        }

        public Criteria andMktNoLike(String value) {
            addCriterion("mkt_no like", value, "mktNo");
            return (Criteria) this;
        }

        public Criteria andMktNoNotLike(String value) {
            addCriterion("mkt_no not like", value, "mktNo");
            return (Criteria) this;
        }

        public Criteria andMktNoIn(List<String> values) {
            addCriterion("mkt_no in", values, "mktNo");
            return (Criteria) this;
        }

        public Criteria andMktNoNotIn(List<String> values) {
            addCriterion("mkt_no not in", values, "mktNo");
            return (Criteria) this;
        }

        public Criteria andMktNoBetween(String value1, String value2) {
            addCriterion("mkt_no between", value1, value2, "mktNo");
            return (Criteria) this;
        }

        public Criteria andMktNoNotBetween(String value1, String value2) {
            addCriterion("mkt_no not between", value1, value2, "mktNo");
            return (Criteria) this;
        }

        public Criteria andMktNameIsNull() {
            addCriterion("mkt_name is null");
            return (Criteria) this;
        }

        public Criteria andMktNameIsNotNull() {
            addCriterion("mkt_name is not null");
            return (Criteria) this;
        }

        public Criteria andMktNameEqualTo(String value) {
            addCriterion("mkt_name =", value, "mktName");
            return (Criteria) this;
        }

        public Criteria andMktNameNotEqualTo(String value) {
            addCriterion("mkt_name <>", value, "mktName");
            return (Criteria) this;
        }

        public Criteria andMktNameGreaterThan(String value) {
            addCriterion("mkt_name >", value, "mktName");
            return (Criteria) this;
        }

        public Criteria andMktNameGreaterThanOrEqualTo(String value) {
            addCriterion("mkt_name >=", value, "mktName");
            return (Criteria) this;
        }

        public Criteria andMktNameLessThan(String value) {
            addCriterion("mkt_name <", value, "mktName");
            return (Criteria) this;
        }

        public Criteria andMktNameLessThanOrEqualTo(String value) {
            addCriterion("mkt_name <=", value, "mktName");
            return (Criteria) this;
        }

        public Criteria andMktNameLike(String value) {
            addCriterion("mkt_name like", value, "mktName");
            return (Criteria) this;
        }

        public Criteria andMktNameNotLike(String value) {
            addCriterion("mkt_name not like", value, "mktName");
            return (Criteria) this;
        }

        public Criteria andMktNameIn(List<String> values) {
            addCriterion("mkt_name in", values, "mktName");
            return (Criteria) this;
        }

        public Criteria andMktNameNotIn(List<String> values) {
            addCriterion("mkt_name not in", values, "mktName");
            return (Criteria) this;
        }

        public Criteria andMktNameBetween(String value1, String value2) {
            addCriterion("mkt_name between", value1, value2, "mktName");
            return (Criteria) this;
        }

        public Criteria andMktNameNotBetween(String value1, String value2) {
            addCriterion("mkt_name not between", value1, value2, "mktName");
            return (Criteria) this;
        }

        public Criteria andMktSubAcctNameIsNull() {
            addCriterion("mkt_sub_acct_name is null");
            return (Criteria) this;
        }

        public Criteria andMktSubAcctNameIsNotNull() {
            addCriterion("mkt_sub_acct_name is not null");
            return (Criteria) this;
        }

        public Criteria andMktSubAcctNameEqualTo(String value) {
            addCriterion("mkt_sub_acct_name =", value, "mktSubAcctName");
            return (Criteria) this;
        }

        public Criteria andMktSubAcctNameNotEqualTo(String value) {
            addCriterion("mkt_sub_acct_name <>", value, "mktSubAcctName");
            return (Criteria) this;
        }

        public Criteria andMktSubAcctNameGreaterThan(String value) {
            addCriterion("mkt_sub_acct_name >", value, "mktSubAcctName");
            return (Criteria) this;
        }

        public Criteria andMktSubAcctNameGreaterThanOrEqualTo(String value) {
            addCriterion("mkt_sub_acct_name >=", value, "mktSubAcctName");
            return (Criteria) this;
        }

        public Criteria andMktSubAcctNameLessThan(String value) {
            addCriterion("mkt_sub_acct_name <", value, "mktSubAcctName");
            return (Criteria) this;
        }

        public Criteria andMktSubAcctNameLessThanOrEqualTo(String value) {
            addCriterion("mkt_sub_acct_name <=", value, "mktSubAcctName");
            return (Criteria) this;
        }

        public Criteria andMktSubAcctNameLike(String value) {
            addCriterion("mkt_sub_acct_name like", value, "mktSubAcctName");
            return (Criteria) this;
        }

        public Criteria andMktSubAcctNameNotLike(String value) {
            addCriterion("mkt_sub_acct_name not like", value, "mktSubAcctName");
            return (Criteria) this;
        }

        public Criteria andMktSubAcctNameIn(List<String> values) {
            addCriterion("mkt_sub_acct_name in", values, "mktSubAcctName");
            return (Criteria) this;
        }

        public Criteria andMktSubAcctNameNotIn(List<String> values) {
            addCriterion("mkt_sub_acct_name not in", values, "mktSubAcctName");
            return (Criteria) this;
        }

        public Criteria andMktSubAcctNameBetween(String value1, String value2) {
            addCriterion("mkt_sub_acct_name between", value1, value2, "mktSubAcctName");
            return (Criteria) this;
        }

        public Criteria andMktSubAcctNameNotBetween(String value1, String value2) {
            addCriterion("mkt_sub_acct_name not between", value1, value2, "mktSubAcctName");
            return (Criteria) this;
        }

        public Criteria andFfbDueTimeIsNull() {
            addCriterion("ffb_due_time is null");
            return (Criteria) this;
        }

        public Criteria andFfbDueTimeIsNotNull() {
            addCriterion("ffb_due_time is not null");
            return (Criteria) this;
        }

        public Criteria andFfbDueTimeEqualTo(Date value) {
            addCriterion("ffb_due_time =", value, "ffbDueTime");
            return (Criteria) this;
        }

        public Criteria andFfbDueTimeNotEqualTo(Date value) {
            addCriterion("ffb_due_time <>", value, "ffbDueTime");
            return (Criteria) this;
        }

        public Criteria andFfbDueTimeGreaterThan(Date value) {
            addCriterion("ffb_due_time >", value, "ffbDueTime");
            return (Criteria) this;
        }

        public Criteria andFfbDueTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ffb_due_time >=", value, "ffbDueTime");
            return (Criteria) this;
        }

        public Criteria andFfbDueTimeLessThan(Date value) {
            addCriterion("ffb_due_time <", value, "ffbDueTime");
            return (Criteria) this;
        }

        public Criteria andFfbDueTimeLessThanOrEqualTo(Date value) {
            addCriterion("ffb_due_time <=", value, "ffbDueTime");
            return (Criteria) this;
        }

        public Criteria andFfbDueTimeIn(List<Date> values) {
            addCriterion("ffb_due_time in", values, "ffbDueTime");
            return (Criteria) this;
        }

        public Criteria andFfbDueTimeNotIn(List<Date> values) {
            addCriterion("ffb_due_time not in", values, "ffbDueTime");
            return (Criteria) this;
        }

        public Criteria andFfbDueTimeBetween(Date value1, Date value2) {
            addCriterion("ffb_due_time between", value1, value2, "ffbDueTime");
            return (Criteria) this;
        }

        public Criteria andFfbDueTimeNotBetween(Date value1, Date value2) {
            addCriterion("ffb_due_time not between", value1, value2, "ffbDueTime");
            return (Criteria) this;
        }

        public Criteria andMktAmtIsNull() {
            addCriterion("mkt_amt is null");
            return (Criteria) this;
        }

        public Criteria andMktAmtIsNotNull() {
            addCriterion("mkt_amt is not null");
            return (Criteria) this;
        }

        public Criteria andMktAmtEqualTo(BigDecimal value) {
            addCriterion("mkt_amt =", value, "mktAmt");
            return (Criteria) this;
        }

        public Criteria andMktAmtNotEqualTo(BigDecimal value) {
            addCriterion("mkt_amt <>", value, "mktAmt");
            return (Criteria) this;
        }

        public Criteria andMktAmtGreaterThan(BigDecimal value) {
            addCriterion("mkt_amt >", value, "mktAmt");
            return (Criteria) this;
        }

        public Criteria andMktAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("mkt_amt >=", value, "mktAmt");
            return (Criteria) this;
        }

        public Criteria andMktAmtLessThan(BigDecimal value) {
            addCriterion("mkt_amt <", value, "mktAmt");
            return (Criteria) this;
        }

        public Criteria andMktAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("mkt_amt <=", value, "mktAmt");
            return (Criteria) this;
        }

        public Criteria andMktAmtIn(List<BigDecimal> values) {
            addCriterion("mkt_amt in", values, "mktAmt");
            return (Criteria) this;
        }

        public Criteria andMktAmtNotIn(List<BigDecimal> values) {
            addCriterion("mkt_amt not in", values, "mktAmt");
            return (Criteria) this;
        }

        public Criteria andMktAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mkt_amt between", value1, value2, "mktAmt");
            return (Criteria) this;
        }

        public Criteria andMktAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mkt_amt not between", value1, value2, "mktAmt");
            return (Criteria) this;
        }

        public Criteria andOutAmtIsNull() {
            addCriterion("out_amt is null");
            return (Criteria) this;
        }

        public Criteria andOutAmtIsNotNull() {
            addCriterion("out_amt is not null");
            return (Criteria) this;
        }

        public Criteria andOutAmtEqualTo(BigDecimal value) {
            addCriterion("out_amt =", value, "outAmt");
            return (Criteria) this;
        }

        public Criteria andOutAmtNotEqualTo(BigDecimal value) {
            addCriterion("out_amt <>", value, "outAmt");
            return (Criteria) this;
        }

        public Criteria andOutAmtGreaterThan(BigDecimal value) {
            addCriterion("out_amt >", value, "outAmt");
            return (Criteria) this;
        }

        public Criteria andOutAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("out_amt >=", value, "outAmt");
            return (Criteria) this;
        }

        public Criteria andOutAmtLessThan(BigDecimal value) {
            addCriterion("out_amt <", value, "outAmt");
            return (Criteria) this;
        }

        public Criteria andOutAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("out_amt <=", value, "outAmt");
            return (Criteria) this;
        }

        public Criteria andOutAmtIn(List<BigDecimal> values) {
            addCriterion("out_amt in", values, "outAmt");
            return (Criteria) this;
        }

        public Criteria andOutAmtNotIn(List<BigDecimal> values) {
            addCriterion("out_amt not in", values, "outAmt");
            return (Criteria) this;
        }

        public Criteria andOutAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("out_amt between", value1, value2, "outAmt");
            return (Criteria) this;
        }

        public Criteria andOutAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("out_amt not between", value1, value2, "outAmt");
            return (Criteria) this;
        }

        public Criteria andOutNumIsNull() {
            addCriterion("out_num is null");
            return (Criteria) this;
        }

        public Criteria andOutNumIsNotNull() {
            addCriterion("out_num is not null");
            return (Criteria) this;
        }

        public Criteria andOutNumEqualTo(Integer value) {
            addCriterion("out_num =", value, "outNum");
            return (Criteria) this;
        }

        public Criteria andOutNumNotEqualTo(Integer value) {
            addCriterion("out_num <>", value, "outNum");
            return (Criteria) this;
        }

        public Criteria andOutNumGreaterThan(Integer value) {
            addCriterion("out_num >", value, "outNum");
            return (Criteria) this;
        }

        public Criteria andOutNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("out_num >=", value, "outNum");
            return (Criteria) this;
        }

        public Criteria andOutNumLessThan(Integer value) {
            addCriterion("out_num <", value, "outNum");
            return (Criteria) this;
        }

        public Criteria andOutNumLessThanOrEqualTo(Integer value) {
            addCriterion("out_num <=", value, "outNum");
            return (Criteria) this;
        }

        public Criteria andOutNumIn(List<Integer> values) {
            addCriterion("out_num in", values, "outNum");
            return (Criteria) this;
        }

        public Criteria andOutNumNotIn(List<Integer> values) {
            addCriterion("out_num not in", values, "outNum");
            return (Criteria) this;
        }

        public Criteria andOutNumBetween(Integer value1, Integer value2) {
            addCriterion("out_num between", value1, value2, "outNum");
            return (Criteria) this;
        }

        public Criteria andOutNumNotBetween(Integer value1, Integer value2) {
            addCriterion("out_num not between", value1, value2, "outNum");
            return (Criteria) this;
        }

        public Criteria andMktDateStartIsNull() {
            addCriterion("mkt_date_start is null");
            return (Criteria) this;
        }

        public Criteria andMktDateStartIsNotNull() {
            addCriterion("mkt_date_start is not null");
            return (Criteria) this;
        }

        public Criteria andMktDateStartEqualTo(Date value) {
            addCriterion("mkt_date_start =", value, "mktDateStart");
            return (Criteria) this;
        }

        public Criteria andMktDateStartNotEqualTo(Date value) {
            addCriterion("mkt_date_start <>", value, "mktDateStart");
            return (Criteria) this;
        }

        public Criteria andMktDateStartGreaterThan(Date value) {
            addCriterion("mkt_date_start >", value, "mktDateStart");
            return (Criteria) this;
        }

        public Criteria andMktDateStartGreaterThanOrEqualTo(Date value) {
            addCriterion("mkt_date_start >=", value, "mktDateStart");
            return (Criteria) this;
        }

        public Criteria andMktDateStartLessThan(Date value) {
            addCriterion("mkt_date_start <", value, "mktDateStart");
            return (Criteria) this;
        }

        public Criteria andMktDateStartLessThanOrEqualTo(Date value) {
            addCriterion("mkt_date_start <=", value, "mktDateStart");
            return (Criteria) this;
        }

        public Criteria andMktDateStartIn(List<Date> values) {
            addCriterion("mkt_date_start in", values, "mktDateStart");
            return (Criteria) this;
        }

        public Criteria andMktDateStartNotIn(List<Date> values) {
            addCriterion("mkt_date_start not in", values, "mktDateStart");
            return (Criteria) this;
        }

        public Criteria andMktDateStartBetween(Date value1, Date value2) {
            addCriterion("mkt_date_start between", value1, value2, "mktDateStart");
            return (Criteria) this;
        }

        public Criteria andMktDateStartNotBetween(Date value1, Date value2) {
            addCriterion("mkt_date_start not between", value1, value2, "mktDateStart");
            return (Criteria) this;
        }

        public Criteria andMktDateEndIsNull() {
            addCriterion("mkt_date_end is null");
            return (Criteria) this;
        }

        public Criteria andMktDateEndIsNotNull() {
            addCriterion("mkt_date_end is not null");
            return (Criteria) this;
        }

        public Criteria andMktDateEndEqualTo(Date value) {
            addCriterion("mkt_date_end =", value, "mktDateEnd");
            return (Criteria) this;
        }

        public Criteria andMktDateEndNotEqualTo(Date value) {
            addCriterion("mkt_date_end <>", value, "mktDateEnd");
            return (Criteria) this;
        }

        public Criteria andMktDateEndGreaterThan(Date value) {
            addCriterion("mkt_date_end >", value, "mktDateEnd");
            return (Criteria) this;
        }

        public Criteria andMktDateEndGreaterThanOrEqualTo(Date value) {
            addCriterion("mkt_date_end >=", value, "mktDateEnd");
            return (Criteria) this;
        }

        public Criteria andMktDateEndLessThan(Date value) {
            addCriterion("mkt_date_end <", value, "mktDateEnd");
            return (Criteria) this;
        }

        public Criteria andMktDateEndLessThanOrEqualTo(Date value) {
            addCriterion("mkt_date_end <=", value, "mktDateEnd");
            return (Criteria) this;
        }

        public Criteria andMktDateEndIn(List<Date> values) {
            addCriterion("mkt_date_end in", values, "mktDateEnd");
            return (Criteria) this;
        }

        public Criteria andMktDateEndNotIn(List<Date> values) {
            addCriterion("mkt_date_end not in", values, "mktDateEnd");
            return (Criteria) this;
        }

        public Criteria andMktDateEndBetween(Date value1, Date value2) {
            addCriterion("mkt_date_end between", value1, value2, "mktDateEnd");
            return (Criteria) this;
        }

        public Criteria andMktDateEndNotBetween(Date value1, Date value2) {
            addCriterion("mkt_date_end not between", value1, value2, "mktDateEnd");
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

        public Criteria andAcctTypeIsNull() {
            addCriterion("acct_type is null");
            return (Criteria) this;
        }

        public Criteria andAcctTypeIsNotNull() {
            addCriterion("acct_type is not null");
            return (Criteria) this;
        }

        public Criteria andAcctTypeEqualTo(String value) {
            addCriterion("acct_type =", value, "acctType");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNotEqualTo(String value) {
            addCriterion("acct_type <>", value, "acctType");
            return (Criteria) this;
        }

        public Criteria andAcctTypeGreaterThan(String value) {
            addCriterion("acct_type >", value, "acctType");
            return (Criteria) this;
        }

        public Criteria andAcctTypeGreaterThanOrEqualTo(String value) {
            addCriterion("acct_type >=", value, "acctType");
            return (Criteria) this;
        }

        public Criteria andAcctTypeLessThan(String value) {
            addCriterion("acct_type <", value, "acctType");
            return (Criteria) this;
        }

        public Criteria andAcctTypeLessThanOrEqualTo(String value) {
            addCriterion("acct_type <=", value, "acctType");
            return (Criteria) this;
        }

        public Criteria andAcctTypeLike(String value) {
            addCriterion("acct_type like", value, "acctType");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNotLike(String value) {
            addCriterion("acct_type not like", value, "acctType");
            return (Criteria) this;
        }

        public Criteria andAcctTypeIn(List<String> values) {
            addCriterion("acct_type in", values, "acctType");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNotIn(List<String> values) {
            addCriterion("acct_type not in", values, "acctType");
            return (Criteria) this;
        }

        public Criteria andAcctTypeBetween(String value1, String value2) {
            addCriterion("acct_type between", value1, value2, "acctType");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNotBetween(String value1, String value2) {
            addCriterion("acct_type not between", value1, value2, "acctType");
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

        public Criteria andCreTimeIsNull() {
            addCriterion("cre_time is null");
            return (Criteria) this;
        }

        public Criteria andCreTimeIsNotNull() {
            addCriterion("cre_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreTimeEqualTo(Date value) {
            addCriterion("cre_time =", value, "creTime");
            return (Criteria) this;
        }

        public Criteria andCreTimeNotEqualTo(Date value) {
            addCriterion("cre_time <>", value, "creTime");
            return (Criteria) this;
        }

        public Criteria andCreTimeGreaterThan(Date value) {
            addCriterion("cre_time >", value, "creTime");
            return (Criteria) this;
        }

        public Criteria andCreTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cre_time >=", value, "creTime");
            return (Criteria) this;
        }

        public Criteria andCreTimeLessThan(Date value) {
            addCriterion("cre_time <", value, "creTime");
            return (Criteria) this;
        }

        public Criteria andCreTimeLessThanOrEqualTo(Date value) {
            addCriterion("cre_time <=", value, "creTime");
            return (Criteria) this;
        }

        public Criteria andCreTimeIn(List<Date> values) {
            addCriterion("cre_time in", values, "creTime");
            return (Criteria) this;
        }

        public Criteria andCreTimeNotIn(List<Date> values) {
            addCriterion("cre_time not in", values, "creTime");
            return (Criteria) this;
        }

        public Criteria andCreTimeBetween(Date value1, Date value2) {
            addCriterion("cre_time between", value1, value2, "creTime");
            return (Criteria) this;
        }

        public Criteria andCreTimeNotBetween(Date value1, Date value2) {
            addCriterion("cre_time not between", value1, value2, "creTime");
            return (Criteria) this;
        }

        public Criteria andMinInvlLimitIsNull() {
            addCriterion("min_invl_limit is null");
            return (Criteria) this;
        }

        public Criteria andMinInvlLimitIsNotNull() {
            addCriterion("min_invl_limit is not null");
            return (Criteria) this;
        }

        public Criteria andMinInvlLimitEqualTo(Integer value) {
            addCriterion("min_invl_limit =", value, "minInvlLimit");
            return (Criteria) this;
        }

        public Criteria andMinInvlLimitNotEqualTo(Integer value) {
            addCriterion("min_invl_limit <>", value, "minInvlLimit");
            return (Criteria) this;
        }

        public Criteria andMinInvlLimitGreaterThan(Integer value) {
            addCriterion("min_invl_limit >", value, "minInvlLimit");
            return (Criteria) this;
        }

        public Criteria andMinInvlLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("min_invl_limit >=", value, "minInvlLimit");
            return (Criteria) this;
        }

        public Criteria andMinInvlLimitLessThan(Integer value) {
            addCriterion("min_invl_limit <", value, "minInvlLimit");
            return (Criteria) this;
        }

        public Criteria andMinInvlLimitLessThanOrEqualTo(Integer value) {
            addCriterion("min_invl_limit <=", value, "minInvlLimit");
            return (Criteria) this;
        }

        public Criteria andMinInvlLimitIn(List<Integer> values) {
            addCriterion("min_invl_limit in", values, "minInvlLimit");
            return (Criteria) this;
        }

        public Criteria andMinInvlLimitNotIn(List<Integer> values) {
            addCriterion("min_invl_limit not in", values, "minInvlLimit");
            return (Criteria) this;
        }

        public Criteria andMinInvlLimitBetween(Integer value1, Integer value2) {
            addCriterion("min_invl_limit between", value1, value2, "minInvlLimit");
            return (Criteria) this;
        }

        public Criteria andMinInvlLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("min_invl_limit not between", value1, value2, "minInvlLimit");
            return (Criteria) this;
        }

        public Criteria andJoinNumLimitIsNull() {
            addCriterion("join_num_limit is null");
            return (Criteria) this;
        }

        public Criteria andJoinNumLimitIsNotNull() {
            addCriterion("join_num_limit is not null");
            return (Criteria) this;
        }

        public Criteria andJoinNumLimitEqualTo(Integer value) {
            addCriterion("join_num_limit =", value, "joinNumLimit");
            return (Criteria) this;
        }

        public Criteria andJoinNumLimitNotEqualTo(Integer value) {
            addCriterion("join_num_limit <>", value, "joinNumLimit");
            return (Criteria) this;
        }

        public Criteria andJoinNumLimitGreaterThan(Integer value) {
            addCriterion("join_num_limit >", value, "joinNumLimit");
            return (Criteria) this;
        }

        public Criteria andJoinNumLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("join_num_limit >=", value, "joinNumLimit");
            return (Criteria) this;
        }

        public Criteria andJoinNumLimitLessThan(Integer value) {
            addCriterion("join_num_limit <", value, "joinNumLimit");
            return (Criteria) this;
        }

        public Criteria andJoinNumLimitLessThanOrEqualTo(Integer value) {
            addCriterion("join_num_limit <=", value, "joinNumLimit");
            return (Criteria) this;
        }

        public Criteria andJoinNumLimitIn(List<Integer> values) {
            addCriterion("join_num_limit in", values, "joinNumLimit");
            return (Criteria) this;
        }

        public Criteria andJoinNumLimitNotIn(List<Integer> values) {
            addCriterion("join_num_limit not in", values, "joinNumLimit");
            return (Criteria) this;
        }

        public Criteria andJoinNumLimitBetween(Integer value1, Integer value2) {
            addCriterion("join_num_limit between", value1, value2, "joinNumLimit");
            return (Criteria) this;
        }

        public Criteria andJoinNumLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("join_num_limit not between", value1, value2, "joinNumLimit");
            return (Criteria) this;
        }

        public Criteria andAmtLimitIsNull() {
            addCriterion("amt_limit is null");
            return (Criteria) this;
        }

        public Criteria andAmtLimitIsNotNull() {
            addCriterion("amt_limit is not null");
            return (Criteria) this;
        }

        public Criteria andAmtLimitEqualTo(BigDecimal value) {
            addCriterion("amt_limit =", value, "amtLimit");
            return (Criteria) this;
        }

        public Criteria andAmtLimitNotEqualTo(BigDecimal value) {
            addCriterion("amt_limit <>", value, "amtLimit");
            return (Criteria) this;
        }

        public Criteria andAmtLimitGreaterThan(BigDecimal value) {
            addCriterion("amt_limit >", value, "amtLimit");
            return (Criteria) this;
        }

        public Criteria andAmtLimitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amt_limit >=", value, "amtLimit");
            return (Criteria) this;
        }

        public Criteria andAmtLimitLessThan(BigDecimal value) {
            addCriterion("amt_limit <", value, "amtLimit");
            return (Criteria) this;
        }

        public Criteria andAmtLimitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amt_limit <=", value, "amtLimit");
            return (Criteria) this;
        }

        public Criteria andAmtLimitIn(List<BigDecimal> values) {
            addCriterion("amt_limit in", values, "amtLimit");
            return (Criteria) this;
        }

        public Criteria andAmtLimitNotIn(List<BigDecimal> values) {
            addCriterion("amt_limit not in", values, "amtLimit");
            return (Criteria) this;
        }

        public Criteria andAmtLimitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amt_limit between", value1, value2, "amtLimit");
            return (Criteria) this;
        }

        public Criteria andAmtLimitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amt_limit not between", value1, value2, "amtLimit");
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

        public Criteria andMktNoLikeInsensitive(String value) {
            addCriterion("upper(mkt_no) like", value.toUpperCase(), "mktNo");
            return (Criteria) this;
        }

        public Criteria andMktNameLikeInsensitive(String value) {
            addCriterion("upper(mkt_name) like", value.toUpperCase(), "mktName");
            return (Criteria) this;
        }

        public Criteria andMktSubAcctNameLikeInsensitive(String value) {
            addCriterion("upper(mkt_sub_acct_name) like", value.toUpperCase(), "mktSubAcctName");
            return (Criteria) this;
        }

        public Criteria andStatusLikeInsensitive(String value) {
            addCriterion("upper(status) like", value.toUpperCase(), "status");
            return (Criteria) this;
        }

        public Criteria andAcctTypeLikeInsensitive(String value) {
            addCriterion("upper(acct_type) like", value.toUpperCase(), "acctType");
            return (Criteria) this;
        }

        public Criteria andAcctNoLikeInsensitive(String value) {
            addCriterion("upper(acct_no) like", value.toUpperCase(), "acctNo");
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