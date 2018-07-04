package com.wd.apiaccount.model.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AcctFlowInnerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AcctFlowInnerExample() {
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

        public Criteria andFlowIdIsNull() {
            addCriterion("flow_id is null");
            return (Criteria) this;
        }

        public Criteria andFlowIdIsNotNull() {
            addCriterion("flow_id is not null");
            return (Criteria) this;
        }

        public Criteria andFlowIdEqualTo(String value) {
            addCriterion("flow_id =", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdNotEqualTo(String value) {
            addCriterion("flow_id <>", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdGreaterThan(String value) {
            addCriterion("flow_id >", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdGreaterThanOrEqualTo(String value) {
            addCriterion("flow_id >=", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdLessThan(String value) {
            addCriterion("flow_id <", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdLessThanOrEqualTo(String value) {
            addCriterion("flow_id <=", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdLike(String value) {
            addCriterion("flow_id like", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdNotLike(String value) {
            addCriterion("flow_id not like", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdIn(List<String> values) {
            addCriterion("flow_id in", values, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdNotIn(List<String> values) {
            addCriterion("flow_id not in", values, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdBetween(String value1, String value2) {
            addCriterion("flow_id between", value1, value2, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdNotBetween(String value1, String value2) {
            addCriterion("flow_id not between", value1, value2, "flowId");
            return (Criteria) this;
        }

        public Criteria andReqNoteIsNull() {
            addCriterion("req_note is null");
            return (Criteria) this;
        }

        public Criteria andReqNoteIsNotNull() {
            addCriterion("req_note is not null");
            return (Criteria) this;
        }

        public Criteria andReqNoteEqualTo(String value) {
            addCriterion("req_note =", value, "reqNote");
            return (Criteria) this;
        }

        public Criteria andReqNoteNotEqualTo(String value) {
            addCriterion("req_note <>", value, "reqNote");
            return (Criteria) this;
        }

        public Criteria andReqNoteGreaterThan(String value) {
            addCriterion("req_note >", value, "reqNote");
            return (Criteria) this;
        }

        public Criteria andReqNoteGreaterThanOrEqualTo(String value) {
            addCriterion("req_note >=", value, "reqNote");
            return (Criteria) this;
        }

        public Criteria andReqNoteLessThan(String value) {
            addCriterion("req_note <", value, "reqNote");
            return (Criteria) this;
        }

        public Criteria andReqNoteLessThanOrEqualTo(String value) {
            addCriterion("req_note <=", value, "reqNote");
            return (Criteria) this;
        }

        public Criteria andReqNoteLike(String value) {
            addCriterion("req_note like", value, "reqNote");
            return (Criteria) this;
        }

        public Criteria andReqNoteNotLike(String value) {
            addCriterion("req_note not like", value, "reqNote");
            return (Criteria) this;
        }

        public Criteria andReqNoteIn(List<String> values) {
            addCriterion("req_note in", values, "reqNote");
            return (Criteria) this;
        }

        public Criteria andReqNoteNotIn(List<String> values) {
            addCriterion("req_note not in", values, "reqNote");
            return (Criteria) this;
        }

        public Criteria andReqNoteBetween(String value1, String value2) {
            addCriterion("req_note between", value1, value2, "reqNote");
            return (Criteria) this;
        }

        public Criteria andReqNoteNotBetween(String value1, String value2) {
            addCriterion("req_note not between", value1, value2, "reqNote");
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

        public Criteria andTranTypeIsNull() {
            addCriterion("tran_type is null");
            return (Criteria) this;
        }

        public Criteria andTranTypeIsNotNull() {
            addCriterion("tran_type is not null");
            return (Criteria) this;
        }

        public Criteria andTranTypeEqualTo(String value) {
            addCriterion("tran_type =", value, "tranType");
            return (Criteria) this;
        }

        public Criteria andTranTypeNotEqualTo(String value) {
            addCriterion("tran_type <>", value, "tranType");
            return (Criteria) this;
        }

        public Criteria andTranTypeGreaterThan(String value) {
            addCriterion("tran_type >", value, "tranType");
            return (Criteria) this;
        }

        public Criteria andTranTypeGreaterThanOrEqualTo(String value) {
            addCriterion("tran_type >=", value, "tranType");
            return (Criteria) this;
        }

        public Criteria andTranTypeLessThan(String value) {
            addCriterion("tran_type <", value, "tranType");
            return (Criteria) this;
        }

        public Criteria andTranTypeLessThanOrEqualTo(String value) {
            addCriterion("tran_type <=", value, "tranType");
            return (Criteria) this;
        }

        public Criteria andTranTypeLike(String value) {
            addCriterion("tran_type like", value, "tranType");
            return (Criteria) this;
        }

        public Criteria andTranTypeNotLike(String value) {
            addCriterion("tran_type not like", value, "tranType");
            return (Criteria) this;
        }

        public Criteria andTranTypeIn(List<String> values) {
            addCriterion("tran_type in", values, "tranType");
            return (Criteria) this;
        }

        public Criteria andTranTypeNotIn(List<String> values) {
            addCriterion("tran_type not in", values, "tranType");
            return (Criteria) this;
        }

        public Criteria andTranTypeBetween(String value1, String value2) {
            addCriterion("tran_type between", value1, value2, "tranType");
            return (Criteria) this;
        }

        public Criteria andTranTypeNotBetween(String value1, String value2) {
            addCriterion("tran_type not between", value1, value2, "tranType");
            return (Criteria) this;
        }

        public Criteria andTsfUserNoIsNull() {
            addCriterion("tsf_user_no is null");
            return (Criteria) this;
        }

        public Criteria andTsfUserNoIsNotNull() {
            addCriterion("tsf_user_no is not null");
            return (Criteria) this;
        }

        public Criteria andTsfUserNoEqualTo(String value) {
            addCriterion("tsf_user_no =", value, "tsfUserNo");
            return (Criteria) this;
        }

        public Criteria andTsfUserNoNotEqualTo(String value) {
            addCriterion("tsf_user_no <>", value, "tsfUserNo");
            return (Criteria) this;
        }

        public Criteria andTsfUserNoGreaterThan(String value) {
            addCriterion("tsf_user_no >", value, "tsfUserNo");
            return (Criteria) this;
        }

        public Criteria andTsfUserNoGreaterThanOrEqualTo(String value) {
            addCriterion("tsf_user_no >=", value, "tsfUserNo");
            return (Criteria) this;
        }

        public Criteria andTsfUserNoLessThan(String value) {
            addCriterion("tsf_user_no <", value, "tsfUserNo");
            return (Criteria) this;
        }

        public Criteria andTsfUserNoLessThanOrEqualTo(String value) {
            addCriterion("tsf_user_no <=", value, "tsfUserNo");
            return (Criteria) this;
        }

        public Criteria andTsfUserNoLike(String value) {
            addCriterion("tsf_user_no like", value, "tsfUserNo");
            return (Criteria) this;
        }

        public Criteria andTsfUserNoNotLike(String value) {
            addCriterion("tsf_user_no not like", value, "tsfUserNo");
            return (Criteria) this;
        }

        public Criteria andTsfUserNoIn(List<String> values) {
            addCriterion("tsf_user_no in", values, "tsfUserNo");
            return (Criteria) this;
        }

        public Criteria andTsfUserNoNotIn(List<String> values) {
            addCriterion("tsf_user_no not in", values, "tsfUserNo");
            return (Criteria) this;
        }

        public Criteria andTsfUserNoBetween(String value1, String value2) {
            addCriterion("tsf_user_no between", value1, value2, "tsfUserNo");
            return (Criteria) this;
        }

        public Criteria andTsfUserNoNotBetween(String value1, String value2) {
            addCriterion("tsf_user_no not between", value1, value2, "tsfUserNo");
            return (Criteria) this;
        }

        public Criteria andTsfUserTypeIsNull() {
            addCriterion("tsf_user_type is null");
            return (Criteria) this;
        }

        public Criteria andTsfUserTypeIsNotNull() {
            addCriterion("tsf_user_type is not null");
            return (Criteria) this;
        }

        public Criteria andTsfUserTypeEqualTo(String value) {
            addCriterion("tsf_user_type =", value, "tsfUserType");
            return (Criteria) this;
        }

        public Criteria andTsfUserTypeNotEqualTo(String value) {
            addCriterion("tsf_user_type <>", value, "tsfUserType");
            return (Criteria) this;
        }

        public Criteria andTsfUserTypeGreaterThan(String value) {
            addCriterion("tsf_user_type >", value, "tsfUserType");
            return (Criteria) this;
        }

        public Criteria andTsfUserTypeGreaterThanOrEqualTo(String value) {
            addCriterion("tsf_user_type >=", value, "tsfUserType");
            return (Criteria) this;
        }

        public Criteria andTsfUserTypeLessThan(String value) {
            addCriterion("tsf_user_type <", value, "tsfUserType");
            return (Criteria) this;
        }

        public Criteria andTsfUserTypeLessThanOrEqualTo(String value) {
            addCriterion("tsf_user_type <=", value, "tsfUserType");
            return (Criteria) this;
        }

        public Criteria andTsfUserTypeLike(String value) {
            addCriterion("tsf_user_type like", value, "tsfUserType");
            return (Criteria) this;
        }

        public Criteria andTsfUserTypeNotLike(String value) {
            addCriterion("tsf_user_type not like", value, "tsfUserType");
            return (Criteria) this;
        }

        public Criteria andTsfUserTypeIn(List<String> values) {
            addCriterion("tsf_user_type in", values, "tsfUserType");
            return (Criteria) this;
        }

        public Criteria andTsfUserTypeNotIn(List<String> values) {
            addCriterion("tsf_user_type not in", values, "tsfUserType");
            return (Criteria) this;
        }

        public Criteria andTsfUserTypeBetween(String value1, String value2) {
            addCriterion("tsf_user_type between", value1, value2, "tsfUserType");
            return (Criteria) this;
        }

        public Criteria andTsfUserTypeNotBetween(String value1, String value2) {
            addCriterion("tsf_user_type not between", value1, value2, "tsfUserType");
            return (Criteria) this;
        }

        public Criteria andTsfAcctNoIsNull() {
            addCriterion("tsf_acct_no is null");
            return (Criteria) this;
        }

        public Criteria andTsfAcctNoIsNotNull() {
            addCriterion("tsf_acct_no is not null");
            return (Criteria) this;
        }

        public Criteria andTsfAcctNoEqualTo(String value) {
            addCriterion("tsf_acct_no =", value, "tsfAcctNo");
            return (Criteria) this;
        }

        public Criteria andTsfAcctNoNotEqualTo(String value) {
            addCriterion("tsf_acct_no <>", value, "tsfAcctNo");
            return (Criteria) this;
        }

        public Criteria andTsfAcctNoGreaterThan(String value) {
            addCriterion("tsf_acct_no >", value, "tsfAcctNo");
            return (Criteria) this;
        }

        public Criteria andTsfAcctNoGreaterThanOrEqualTo(String value) {
            addCriterion("tsf_acct_no >=", value, "tsfAcctNo");
            return (Criteria) this;
        }

        public Criteria andTsfAcctNoLessThan(String value) {
            addCriterion("tsf_acct_no <", value, "tsfAcctNo");
            return (Criteria) this;
        }

        public Criteria andTsfAcctNoLessThanOrEqualTo(String value) {
            addCriterion("tsf_acct_no <=", value, "tsfAcctNo");
            return (Criteria) this;
        }

        public Criteria andTsfAcctNoLike(String value) {
            addCriterion("tsf_acct_no like", value, "tsfAcctNo");
            return (Criteria) this;
        }

        public Criteria andTsfAcctNoNotLike(String value) {
            addCriterion("tsf_acct_no not like", value, "tsfAcctNo");
            return (Criteria) this;
        }

        public Criteria andTsfAcctNoIn(List<String> values) {
            addCriterion("tsf_acct_no in", values, "tsfAcctNo");
            return (Criteria) this;
        }

        public Criteria andTsfAcctNoNotIn(List<String> values) {
            addCriterion("tsf_acct_no not in", values, "tsfAcctNo");
            return (Criteria) this;
        }

        public Criteria andTsfAcctNoBetween(String value1, String value2) {
            addCriterion("tsf_acct_no between", value1, value2, "tsfAcctNo");
            return (Criteria) this;
        }

        public Criteria andTsfAcctNoNotBetween(String value1, String value2) {
            addCriterion("tsf_acct_no not between", value1, value2, "tsfAcctNo");
            return (Criteria) this;
        }

        public Criteria andTsfAcctTypeIsNull() {
            addCriterion("tsf_acct_type is null");
            return (Criteria) this;
        }

        public Criteria andTsfAcctTypeIsNotNull() {
            addCriterion("tsf_acct_type is not null");
            return (Criteria) this;
        }

        public Criteria andTsfAcctTypeEqualTo(String value) {
            addCriterion("tsf_acct_type =", value, "tsfAcctType");
            return (Criteria) this;
        }

        public Criteria andTsfAcctTypeNotEqualTo(String value) {
            addCriterion("tsf_acct_type <>", value, "tsfAcctType");
            return (Criteria) this;
        }

        public Criteria andTsfAcctTypeGreaterThan(String value) {
            addCriterion("tsf_acct_type >", value, "tsfAcctType");
            return (Criteria) this;
        }

        public Criteria andTsfAcctTypeGreaterThanOrEqualTo(String value) {
            addCriterion("tsf_acct_type >=", value, "tsfAcctType");
            return (Criteria) this;
        }

        public Criteria andTsfAcctTypeLessThan(String value) {
            addCriterion("tsf_acct_type <", value, "tsfAcctType");
            return (Criteria) this;
        }

        public Criteria andTsfAcctTypeLessThanOrEqualTo(String value) {
            addCriterion("tsf_acct_type <=", value, "tsfAcctType");
            return (Criteria) this;
        }

        public Criteria andTsfAcctTypeLike(String value) {
            addCriterion("tsf_acct_type like", value, "tsfAcctType");
            return (Criteria) this;
        }

        public Criteria andTsfAcctTypeNotLike(String value) {
            addCriterion("tsf_acct_type not like", value, "tsfAcctType");
            return (Criteria) this;
        }

        public Criteria andTsfAcctTypeIn(List<String> values) {
            addCriterion("tsf_acct_type in", values, "tsfAcctType");
            return (Criteria) this;
        }

        public Criteria andTsfAcctTypeNotIn(List<String> values) {
            addCriterion("tsf_acct_type not in", values, "tsfAcctType");
            return (Criteria) this;
        }

        public Criteria andTsfAcctTypeBetween(String value1, String value2) {
            addCriterion("tsf_acct_type between", value1, value2, "tsfAcctType");
            return (Criteria) this;
        }

        public Criteria andTsfAcctTypeNotBetween(String value1, String value2) {
            addCriterion("tsf_acct_type not between", value1, value2, "tsfAcctType");
            return (Criteria) this;
        }

        public Criteria andTsfAcctDirIsNull() {
            addCriterion("tsf_acct_dir is null");
            return (Criteria) this;
        }

        public Criteria andTsfAcctDirIsNotNull() {
            addCriterion("tsf_acct_dir is not null");
            return (Criteria) this;
        }

        public Criteria andTsfAcctDirEqualTo(String value) {
            addCriterion("tsf_acct_dir =", value, "tsfAcctDir");
            return (Criteria) this;
        }

        public Criteria andTsfAcctDirNotEqualTo(String value) {
            addCriterion("tsf_acct_dir <>", value, "tsfAcctDir");
            return (Criteria) this;
        }

        public Criteria andTsfAcctDirGreaterThan(String value) {
            addCriterion("tsf_acct_dir >", value, "tsfAcctDir");
            return (Criteria) this;
        }

        public Criteria andTsfAcctDirGreaterThanOrEqualTo(String value) {
            addCriterion("tsf_acct_dir >=", value, "tsfAcctDir");
            return (Criteria) this;
        }

        public Criteria andTsfAcctDirLessThan(String value) {
            addCriterion("tsf_acct_dir <", value, "tsfAcctDir");
            return (Criteria) this;
        }

        public Criteria andTsfAcctDirLessThanOrEqualTo(String value) {
            addCriterion("tsf_acct_dir <=", value, "tsfAcctDir");
            return (Criteria) this;
        }

        public Criteria andTsfAcctDirLike(String value) {
            addCriterion("tsf_acct_dir like", value, "tsfAcctDir");
            return (Criteria) this;
        }

        public Criteria andTsfAcctDirNotLike(String value) {
            addCriterion("tsf_acct_dir not like", value, "tsfAcctDir");
            return (Criteria) this;
        }

        public Criteria andTsfAcctDirIn(List<String> values) {
            addCriterion("tsf_acct_dir in", values, "tsfAcctDir");
            return (Criteria) this;
        }

        public Criteria andTsfAcctDirNotIn(List<String> values) {
            addCriterion("tsf_acct_dir not in", values, "tsfAcctDir");
            return (Criteria) this;
        }

        public Criteria andTsfAcctDirBetween(String value1, String value2) {
            addCriterion("tsf_acct_dir between", value1, value2, "tsfAcctDir");
            return (Criteria) this;
        }

        public Criteria andTsfAcctDirNotBetween(String value1, String value2) {
            addCriterion("tsf_acct_dir not between", value1, value2, "tsfAcctDir");
            return (Criteria) this;
        }

        public Criteria andTsfAcctBalBIsNull() {
            addCriterion("tsf_acct_bal_b is null");
            return (Criteria) this;
        }

        public Criteria andTsfAcctBalBIsNotNull() {
            addCriterion("tsf_acct_bal_b is not null");
            return (Criteria) this;
        }

        public Criteria andTsfAcctBalBEqualTo(BigDecimal value) {
            addCriterion("tsf_acct_bal_b =", value, "tsfAcctBalB");
            return (Criteria) this;
        }

        public Criteria andTsfAcctBalBNotEqualTo(BigDecimal value) {
            addCriterion("tsf_acct_bal_b <>", value, "tsfAcctBalB");
            return (Criteria) this;
        }

        public Criteria andTsfAcctBalBGreaterThan(BigDecimal value) {
            addCriterion("tsf_acct_bal_b >", value, "tsfAcctBalB");
            return (Criteria) this;
        }

        public Criteria andTsfAcctBalBGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tsf_acct_bal_b >=", value, "tsfAcctBalB");
            return (Criteria) this;
        }

        public Criteria andTsfAcctBalBLessThan(BigDecimal value) {
            addCriterion("tsf_acct_bal_b <", value, "tsfAcctBalB");
            return (Criteria) this;
        }

        public Criteria andTsfAcctBalBLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tsf_acct_bal_b <=", value, "tsfAcctBalB");
            return (Criteria) this;
        }

        public Criteria andTsfAcctBalBIn(List<BigDecimal> values) {
            addCriterion("tsf_acct_bal_b in", values, "tsfAcctBalB");
            return (Criteria) this;
        }

        public Criteria andTsfAcctBalBNotIn(List<BigDecimal> values) {
            addCriterion("tsf_acct_bal_b not in", values, "tsfAcctBalB");
            return (Criteria) this;
        }

        public Criteria andTsfAcctBalBBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tsf_acct_bal_b between", value1, value2, "tsfAcctBalB");
            return (Criteria) this;
        }

        public Criteria andTsfAcctBalBNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tsf_acct_bal_b not between", value1, value2, "tsfAcctBalB");
            return (Criteria) this;
        }

        public Criteria andTsfAcctBalAIsNull() {
            addCriterion("tsf_acct_bal_a is null");
            return (Criteria) this;
        }

        public Criteria andTsfAcctBalAIsNotNull() {
            addCriterion("tsf_acct_bal_a is not null");
            return (Criteria) this;
        }

        public Criteria andTsfAcctBalAEqualTo(BigDecimal value) {
            addCriterion("tsf_acct_bal_a =", value, "tsfAcctBalA");
            return (Criteria) this;
        }

        public Criteria andTsfAcctBalANotEqualTo(BigDecimal value) {
            addCriterion("tsf_acct_bal_a <>", value, "tsfAcctBalA");
            return (Criteria) this;
        }

        public Criteria andTsfAcctBalAGreaterThan(BigDecimal value) {
            addCriterion("tsf_acct_bal_a >", value, "tsfAcctBalA");
            return (Criteria) this;
        }

        public Criteria andTsfAcctBalAGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tsf_acct_bal_a >=", value, "tsfAcctBalA");
            return (Criteria) this;
        }

        public Criteria andTsfAcctBalALessThan(BigDecimal value) {
            addCriterion("tsf_acct_bal_a <", value, "tsfAcctBalA");
            return (Criteria) this;
        }

        public Criteria andTsfAcctBalALessThanOrEqualTo(BigDecimal value) {
            addCriterion("tsf_acct_bal_a <=", value, "tsfAcctBalA");
            return (Criteria) this;
        }

        public Criteria andTsfAcctBalAIn(List<BigDecimal> values) {
            addCriterion("tsf_acct_bal_a in", values, "tsfAcctBalA");
            return (Criteria) this;
        }

        public Criteria andTsfAcctBalANotIn(List<BigDecimal> values) {
            addCriterion("tsf_acct_bal_a not in", values, "tsfAcctBalA");
            return (Criteria) this;
        }

        public Criteria andTsfAcctBalABetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tsf_acct_bal_a between", value1, value2, "tsfAcctBalA");
            return (Criteria) this;
        }

        public Criteria andTsfAcctBalANotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tsf_acct_bal_a not between", value1, value2, "tsfAcctBalA");
            return (Criteria) this;
        }

        public Criteria andTsfAcctBalSumAIsNull() {
            addCriterion("tsf_acct_bal_sum_a is null");
            return (Criteria) this;
        }

        public Criteria andTsfAcctBalSumAIsNotNull() {
            addCriterion("tsf_acct_bal_sum_a is not null");
            return (Criteria) this;
        }

        public Criteria andTsfAcctBalSumAEqualTo(BigDecimal value) {
            addCriterion("tsf_acct_bal_sum_a =", value, "tsfAcctBalSumA");
            return (Criteria) this;
        }

        public Criteria andTsfAcctBalSumANotEqualTo(BigDecimal value) {
            addCriterion("tsf_acct_bal_sum_a <>", value, "tsfAcctBalSumA");
            return (Criteria) this;
        }

        public Criteria andTsfAcctBalSumAGreaterThan(BigDecimal value) {
            addCriterion("tsf_acct_bal_sum_a >", value, "tsfAcctBalSumA");
            return (Criteria) this;
        }

        public Criteria andTsfAcctBalSumAGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tsf_acct_bal_sum_a >=", value, "tsfAcctBalSumA");
            return (Criteria) this;
        }

        public Criteria andTsfAcctBalSumALessThan(BigDecimal value) {
            addCriterion("tsf_acct_bal_sum_a <", value, "tsfAcctBalSumA");
            return (Criteria) this;
        }

        public Criteria andTsfAcctBalSumALessThanOrEqualTo(BigDecimal value) {
            addCriterion("tsf_acct_bal_sum_a <=", value, "tsfAcctBalSumA");
            return (Criteria) this;
        }

        public Criteria andTsfAcctBalSumAIn(List<BigDecimal> values) {
            addCriterion("tsf_acct_bal_sum_a in", values, "tsfAcctBalSumA");
            return (Criteria) this;
        }

        public Criteria andTsfAcctBalSumANotIn(List<BigDecimal> values) {
            addCriterion("tsf_acct_bal_sum_a not in", values, "tsfAcctBalSumA");
            return (Criteria) this;
        }

        public Criteria andTsfAcctBalSumABetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tsf_acct_bal_sum_a between", value1, value2, "tsfAcctBalSumA");
            return (Criteria) this;
        }

        public Criteria andTsfAcctBalSumANotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tsf_acct_bal_sum_a not between", value1, value2, "tsfAcctBalSumA");
            return (Criteria) this;
        }

        public Criteria andTsfAcctFrzBalBIsNull() {
            addCriterion("tsf_acct_frz_bal_b is null");
            return (Criteria) this;
        }

        public Criteria andTsfAcctFrzBalBIsNotNull() {
            addCriterion("tsf_acct_frz_bal_b is not null");
            return (Criteria) this;
        }

        public Criteria andTsfAcctFrzBalBEqualTo(BigDecimal value) {
            addCriterion("tsf_acct_frz_bal_b =", value, "tsfAcctFrzBalB");
            return (Criteria) this;
        }

        public Criteria andTsfAcctFrzBalBNotEqualTo(BigDecimal value) {
            addCriterion("tsf_acct_frz_bal_b <>", value, "tsfAcctFrzBalB");
            return (Criteria) this;
        }

        public Criteria andTsfAcctFrzBalBGreaterThan(BigDecimal value) {
            addCriterion("tsf_acct_frz_bal_b >", value, "tsfAcctFrzBalB");
            return (Criteria) this;
        }

        public Criteria andTsfAcctFrzBalBGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tsf_acct_frz_bal_b >=", value, "tsfAcctFrzBalB");
            return (Criteria) this;
        }

        public Criteria andTsfAcctFrzBalBLessThan(BigDecimal value) {
            addCriterion("tsf_acct_frz_bal_b <", value, "tsfAcctFrzBalB");
            return (Criteria) this;
        }

        public Criteria andTsfAcctFrzBalBLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tsf_acct_frz_bal_b <=", value, "tsfAcctFrzBalB");
            return (Criteria) this;
        }

        public Criteria andTsfAcctFrzBalBIn(List<BigDecimal> values) {
            addCriterion("tsf_acct_frz_bal_b in", values, "tsfAcctFrzBalB");
            return (Criteria) this;
        }

        public Criteria andTsfAcctFrzBalBNotIn(List<BigDecimal> values) {
            addCriterion("tsf_acct_frz_bal_b not in", values, "tsfAcctFrzBalB");
            return (Criteria) this;
        }

        public Criteria andTsfAcctFrzBalBBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tsf_acct_frz_bal_b between", value1, value2, "tsfAcctFrzBalB");
            return (Criteria) this;
        }

        public Criteria andTsfAcctFrzBalBNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tsf_acct_frz_bal_b not between", value1, value2, "tsfAcctFrzBalB");
            return (Criteria) this;
        }

        public Criteria andTsfAcctFrzBalAIsNull() {
            addCriterion("tsf_acct_frz_bal_a is null");
            return (Criteria) this;
        }

        public Criteria andTsfAcctFrzBalAIsNotNull() {
            addCriterion("tsf_acct_frz_bal_a is not null");
            return (Criteria) this;
        }

        public Criteria andTsfAcctFrzBalAEqualTo(BigDecimal value) {
            addCriterion("tsf_acct_frz_bal_a =", value, "tsfAcctFrzBalA");
            return (Criteria) this;
        }

        public Criteria andTsfAcctFrzBalANotEqualTo(BigDecimal value) {
            addCriterion("tsf_acct_frz_bal_a <>", value, "tsfAcctFrzBalA");
            return (Criteria) this;
        }

        public Criteria andTsfAcctFrzBalAGreaterThan(BigDecimal value) {
            addCriterion("tsf_acct_frz_bal_a >", value, "tsfAcctFrzBalA");
            return (Criteria) this;
        }

        public Criteria andTsfAcctFrzBalAGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tsf_acct_frz_bal_a >=", value, "tsfAcctFrzBalA");
            return (Criteria) this;
        }

        public Criteria andTsfAcctFrzBalALessThan(BigDecimal value) {
            addCriterion("tsf_acct_frz_bal_a <", value, "tsfAcctFrzBalA");
            return (Criteria) this;
        }

        public Criteria andTsfAcctFrzBalALessThanOrEqualTo(BigDecimal value) {
            addCriterion("tsf_acct_frz_bal_a <=", value, "tsfAcctFrzBalA");
            return (Criteria) this;
        }

        public Criteria andTsfAcctFrzBalAIn(List<BigDecimal> values) {
            addCriterion("tsf_acct_frz_bal_a in", values, "tsfAcctFrzBalA");
            return (Criteria) this;
        }

        public Criteria andTsfAcctFrzBalANotIn(List<BigDecimal> values) {
            addCriterion("tsf_acct_frz_bal_a not in", values, "tsfAcctFrzBalA");
            return (Criteria) this;
        }

        public Criteria andTsfAcctFrzBalABetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tsf_acct_frz_bal_a between", value1, value2, "tsfAcctFrzBalA");
            return (Criteria) this;
        }

        public Criteria andTsfAcctFrzBalANotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tsf_acct_frz_bal_a not between", value1, value2, "tsfAcctFrzBalA");
            return (Criteria) this;
        }

        public Criteria andTsfAcctFrzBalSumAIsNull() {
            addCriterion("tsf_acct_frz_bal_sum_a is null");
            return (Criteria) this;
        }

        public Criteria andTsfAcctFrzBalSumAIsNotNull() {
            addCriterion("tsf_acct_frz_bal_sum_a is not null");
            return (Criteria) this;
        }

        public Criteria andTsfAcctFrzBalSumAEqualTo(BigDecimal value) {
            addCriterion("tsf_acct_frz_bal_sum_a =", value, "tsfAcctFrzBalSumA");
            return (Criteria) this;
        }

        public Criteria andTsfAcctFrzBalSumANotEqualTo(BigDecimal value) {
            addCriterion("tsf_acct_frz_bal_sum_a <>", value, "tsfAcctFrzBalSumA");
            return (Criteria) this;
        }

        public Criteria andTsfAcctFrzBalSumAGreaterThan(BigDecimal value) {
            addCriterion("tsf_acct_frz_bal_sum_a >", value, "tsfAcctFrzBalSumA");
            return (Criteria) this;
        }

        public Criteria andTsfAcctFrzBalSumAGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tsf_acct_frz_bal_sum_a >=", value, "tsfAcctFrzBalSumA");
            return (Criteria) this;
        }

        public Criteria andTsfAcctFrzBalSumALessThan(BigDecimal value) {
            addCriterion("tsf_acct_frz_bal_sum_a <", value, "tsfAcctFrzBalSumA");
            return (Criteria) this;
        }

        public Criteria andTsfAcctFrzBalSumALessThanOrEqualTo(BigDecimal value) {
            addCriterion("tsf_acct_frz_bal_sum_a <=", value, "tsfAcctFrzBalSumA");
            return (Criteria) this;
        }

        public Criteria andTsfAcctFrzBalSumAIn(List<BigDecimal> values) {
            addCriterion("tsf_acct_frz_bal_sum_a in", values, "tsfAcctFrzBalSumA");
            return (Criteria) this;
        }

        public Criteria andTsfAcctFrzBalSumANotIn(List<BigDecimal> values) {
            addCriterion("tsf_acct_frz_bal_sum_a not in", values, "tsfAcctFrzBalSumA");
            return (Criteria) this;
        }

        public Criteria andTsfAcctFrzBalSumABetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tsf_acct_frz_bal_sum_a between", value1, value2, "tsfAcctFrzBalSumA");
            return (Criteria) this;
        }

        public Criteria andTsfAcctFrzBalSumANotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tsf_acct_frz_bal_sum_a not between", value1, value2, "tsfAcctFrzBalSumA");
            return (Criteria) this;
        }

        public Criteria andOppUserNoIsNull() {
            addCriterion("opp_user_no is null");
            return (Criteria) this;
        }

        public Criteria andOppUserNoIsNotNull() {
            addCriterion("opp_user_no is not null");
            return (Criteria) this;
        }

        public Criteria andOppUserNoEqualTo(String value) {
            addCriterion("opp_user_no =", value, "oppUserNo");
            return (Criteria) this;
        }

        public Criteria andOppUserNoNotEqualTo(String value) {
            addCriterion("opp_user_no <>", value, "oppUserNo");
            return (Criteria) this;
        }

        public Criteria andOppUserNoGreaterThan(String value) {
            addCriterion("opp_user_no >", value, "oppUserNo");
            return (Criteria) this;
        }

        public Criteria andOppUserNoGreaterThanOrEqualTo(String value) {
            addCriterion("opp_user_no >=", value, "oppUserNo");
            return (Criteria) this;
        }

        public Criteria andOppUserNoLessThan(String value) {
            addCriterion("opp_user_no <", value, "oppUserNo");
            return (Criteria) this;
        }

        public Criteria andOppUserNoLessThanOrEqualTo(String value) {
            addCriterion("opp_user_no <=", value, "oppUserNo");
            return (Criteria) this;
        }

        public Criteria andOppUserNoLike(String value) {
            addCriterion("opp_user_no like", value, "oppUserNo");
            return (Criteria) this;
        }

        public Criteria andOppUserNoNotLike(String value) {
            addCriterion("opp_user_no not like", value, "oppUserNo");
            return (Criteria) this;
        }

        public Criteria andOppUserNoIn(List<String> values) {
            addCriterion("opp_user_no in", values, "oppUserNo");
            return (Criteria) this;
        }

        public Criteria andOppUserNoNotIn(List<String> values) {
            addCriterion("opp_user_no not in", values, "oppUserNo");
            return (Criteria) this;
        }

        public Criteria andOppUserNoBetween(String value1, String value2) {
            addCriterion("opp_user_no between", value1, value2, "oppUserNo");
            return (Criteria) this;
        }

        public Criteria andOppUserNoNotBetween(String value1, String value2) {
            addCriterion("opp_user_no not between", value1, value2, "oppUserNo");
            return (Criteria) this;
        }

        public Criteria andOppUserTypeIsNull() {
            addCriterion("opp_user_type is null");
            return (Criteria) this;
        }

        public Criteria andOppUserTypeIsNotNull() {
            addCriterion("opp_user_type is not null");
            return (Criteria) this;
        }

        public Criteria andOppUserTypeEqualTo(String value) {
            addCriterion("opp_user_type =", value, "oppUserType");
            return (Criteria) this;
        }

        public Criteria andOppUserTypeNotEqualTo(String value) {
            addCriterion("opp_user_type <>", value, "oppUserType");
            return (Criteria) this;
        }

        public Criteria andOppUserTypeGreaterThan(String value) {
            addCriterion("opp_user_type >", value, "oppUserType");
            return (Criteria) this;
        }

        public Criteria andOppUserTypeGreaterThanOrEqualTo(String value) {
            addCriterion("opp_user_type >=", value, "oppUserType");
            return (Criteria) this;
        }

        public Criteria andOppUserTypeLessThan(String value) {
            addCriterion("opp_user_type <", value, "oppUserType");
            return (Criteria) this;
        }

        public Criteria andOppUserTypeLessThanOrEqualTo(String value) {
            addCriterion("opp_user_type <=", value, "oppUserType");
            return (Criteria) this;
        }

        public Criteria andOppUserTypeLike(String value) {
            addCriterion("opp_user_type like", value, "oppUserType");
            return (Criteria) this;
        }

        public Criteria andOppUserTypeNotLike(String value) {
            addCriterion("opp_user_type not like", value, "oppUserType");
            return (Criteria) this;
        }

        public Criteria andOppUserTypeIn(List<String> values) {
            addCriterion("opp_user_type in", values, "oppUserType");
            return (Criteria) this;
        }

        public Criteria andOppUserTypeNotIn(List<String> values) {
            addCriterion("opp_user_type not in", values, "oppUserType");
            return (Criteria) this;
        }

        public Criteria andOppUserTypeBetween(String value1, String value2) {
            addCriterion("opp_user_type between", value1, value2, "oppUserType");
            return (Criteria) this;
        }

        public Criteria andOppUserTypeNotBetween(String value1, String value2) {
            addCriterion("opp_user_type not between", value1, value2, "oppUserType");
            return (Criteria) this;
        }

        public Criteria andOppAcctNoIsNull() {
            addCriterion("opp_acct_no is null");
            return (Criteria) this;
        }

        public Criteria andOppAcctNoIsNotNull() {
            addCriterion("opp_acct_no is not null");
            return (Criteria) this;
        }

        public Criteria andOppAcctNoEqualTo(String value) {
            addCriterion("opp_acct_no =", value, "oppAcctNo");
            return (Criteria) this;
        }

        public Criteria andOppAcctNoNotEqualTo(String value) {
            addCriterion("opp_acct_no <>", value, "oppAcctNo");
            return (Criteria) this;
        }

        public Criteria andOppAcctNoGreaterThan(String value) {
            addCriterion("opp_acct_no >", value, "oppAcctNo");
            return (Criteria) this;
        }

        public Criteria andOppAcctNoGreaterThanOrEqualTo(String value) {
            addCriterion("opp_acct_no >=", value, "oppAcctNo");
            return (Criteria) this;
        }

        public Criteria andOppAcctNoLessThan(String value) {
            addCriterion("opp_acct_no <", value, "oppAcctNo");
            return (Criteria) this;
        }

        public Criteria andOppAcctNoLessThanOrEqualTo(String value) {
            addCriterion("opp_acct_no <=", value, "oppAcctNo");
            return (Criteria) this;
        }

        public Criteria andOppAcctNoLike(String value) {
            addCriterion("opp_acct_no like", value, "oppAcctNo");
            return (Criteria) this;
        }

        public Criteria andOppAcctNoNotLike(String value) {
            addCriterion("opp_acct_no not like", value, "oppAcctNo");
            return (Criteria) this;
        }

        public Criteria andOppAcctNoIn(List<String> values) {
            addCriterion("opp_acct_no in", values, "oppAcctNo");
            return (Criteria) this;
        }

        public Criteria andOppAcctNoNotIn(List<String> values) {
            addCriterion("opp_acct_no not in", values, "oppAcctNo");
            return (Criteria) this;
        }

        public Criteria andOppAcctNoBetween(String value1, String value2) {
            addCriterion("opp_acct_no between", value1, value2, "oppAcctNo");
            return (Criteria) this;
        }

        public Criteria andOppAcctNoNotBetween(String value1, String value2) {
            addCriterion("opp_acct_no not between", value1, value2, "oppAcctNo");
            return (Criteria) this;
        }

        public Criteria andOppAcctTypeIsNull() {
            addCriterion("opp_acct_type is null");
            return (Criteria) this;
        }

        public Criteria andOppAcctTypeIsNotNull() {
            addCriterion("opp_acct_type is not null");
            return (Criteria) this;
        }

        public Criteria andOppAcctTypeEqualTo(String value) {
            addCriterion("opp_acct_type =", value, "oppAcctType");
            return (Criteria) this;
        }

        public Criteria andOppAcctTypeNotEqualTo(String value) {
            addCriterion("opp_acct_type <>", value, "oppAcctType");
            return (Criteria) this;
        }

        public Criteria andOppAcctTypeGreaterThan(String value) {
            addCriterion("opp_acct_type >", value, "oppAcctType");
            return (Criteria) this;
        }

        public Criteria andOppAcctTypeGreaterThanOrEqualTo(String value) {
            addCriterion("opp_acct_type >=", value, "oppAcctType");
            return (Criteria) this;
        }

        public Criteria andOppAcctTypeLessThan(String value) {
            addCriterion("opp_acct_type <", value, "oppAcctType");
            return (Criteria) this;
        }

        public Criteria andOppAcctTypeLessThanOrEqualTo(String value) {
            addCriterion("opp_acct_type <=", value, "oppAcctType");
            return (Criteria) this;
        }

        public Criteria andOppAcctTypeLike(String value) {
            addCriterion("opp_acct_type like", value, "oppAcctType");
            return (Criteria) this;
        }

        public Criteria andOppAcctTypeNotLike(String value) {
            addCriterion("opp_acct_type not like", value, "oppAcctType");
            return (Criteria) this;
        }

        public Criteria andOppAcctTypeIn(List<String> values) {
            addCriterion("opp_acct_type in", values, "oppAcctType");
            return (Criteria) this;
        }

        public Criteria andOppAcctTypeNotIn(List<String> values) {
            addCriterion("opp_acct_type not in", values, "oppAcctType");
            return (Criteria) this;
        }

        public Criteria andOppAcctTypeBetween(String value1, String value2) {
            addCriterion("opp_acct_type between", value1, value2, "oppAcctType");
            return (Criteria) this;
        }

        public Criteria andOppAcctTypeNotBetween(String value1, String value2) {
            addCriterion("opp_acct_type not between", value1, value2, "oppAcctType");
            return (Criteria) this;
        }

        public Criteria andOppAcctDirIsNull() {
            addCriterion("opp_acct_dir is null");
            return (Criteria) this;
        }

        public Criteria andOppAcctDirIsNotNull() {
            addCriterion("opp_acct_dir is not null");
            return (Criteria) this;
        }

        public Criteria andOppAcctDirEqualTo(String value) {
            addCriterion("opp_acct_dir =", value, "oppAcctDir");
            return (Criteria) this;
        }

        public Criteria andOppAcctDirNotEqualTo(String value) {
            addCriterion("opp_acct_dir <>", value, "oppAcctDir");
            return (Criteria) this;
        }

        public Criteria andOppAcctDirGreaterThan(String value) {
            addCriterion("opp_acct_dir >", value, "oppAcctDir");
            return (Criteria) this;
        }

        public Criteria andOppAcctDirGreaterThanOrEqualTo(String value) {
            addCriterion("opp_acct_dir >=", value, "oppAcctDir");
            return (Criteria) this;
        }

        public Criteria andOppAcctDirLessThan(String value) {
            addCriterion("opp_acct_dir <", value, "oppAcctDir");
            return (Criteria) this;
        }

        public Criteria andOppAcctDirLessThanOrEqualTo(String value) {
            addCriterion("opp_acct_dir <=", value, "oppAcctDir");
            return (Criteria) this;
        }

        public Criteria andOppAcctDirLike(String value) {
            addCriterion("opp_acct_dir like", value, "oppAcctDir");
            return (Criteria) this;
        }

        public Criteria andOppAcctDirNotLike(String value) {
            addCriterion("opp_acct_dir not like", value, "oppAcctDir");
            return (Criteria) this;
        }

        public Criteria andOppAcctDirIn(List<String> values) {
            addCriterion("opp_acct_dir in", values, "oppAcctDir");
            return (Criteria) this;
        }

        public Criteria andOppAcctDirNotIn(List<String> values) {
            addCriterion("opp_acct_dir not in", values, "oppAcctDir");
            return (Criteria) this;
        }

        public Criteria andOppAcctDirBetween(String value1, String value2) {
            addCriterion("opp_acct_dir between", value1, value2, "oppAcctDir");
            return (Criteria) this;
        }

        public Criteria andOppAcctDirNotBetween(String value1, String value2) {
            addCriterion("opp_acct_dir not between", value1, value2, "oppAcctDir");
            return (Criteria) this;
        }

        public Criteria andOppAcctBalBIsNull() {
            addCriterion("opp_acct_bal_b is null");
            return (Criteria) this;
        }

        public Criteria andOppAcctBalBIsNotNull() {
            addCriterion("opp_acct_bal_b is not null");
            return (Criteria) this;
        }

        public Criteria andOppAcctBalBEqualTo(BigDecimal value) {
            addCriterion("opp_acct_bal_b =", value, "oppAcctBalB");
            return (Criteria) this;
        }

        public Criteria andOppAcctBalBNotEqualTo(BigDecimal value) {
            addCriterion("opp_acct_bal_b <>", value, "oppAcctBalB");
            return (Criteria) this;
        }

        public Criteria andOppAcctBalBGreaterThan(BigDecimal value) {
            addCriterion("opp_acct_bal_b >", value, "oppAcctBalB");
            return (Criteria) this;
        }

        public Criteria andOppAcctBalBGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("opp_acct_bal_b >=", value, "oppAcctBalB");
            return (Criteria) this;
        }

        public Criteria andOppAcctBalBLessThan(BigDecimal value) {
            addCriterion("opp_acct_bal_b <", value, "oppAcctBalB");
            return (Criteria) this;
        }

        public Criteria andOppAcctBalBLessThanOrEqualTo(BigDecimal value) {
            addCriterion("opp_acct_bal_b <=", value, "oppAcctBalB");
            return (Criteria) this;
        }

        public Criteria andOppAcctBalBIn(List<BigDecimal> values) {
            addCriterion("opp_acct_bal_b in", values, "oppAcctBalB");
            return (Criteria) this;
        }

        public Criteria andOppAcctBalBNotIn(List<BigDecimal> values) {
            addCriterion("opp_acct_bal_b not in", values, "oppAcctBalB");
            return (Criteria) this;
        }

        public Criteria andOppAcctBalBBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("opp_acct_bal_b between", value1, value2, "oppAcctBalB");
            return (Criteria) this;
        }

        public Criteria andOppAcctBalBNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("opp_acct_bal_b not between", value1, value2, "oppAcctBalB");
            return (Criteria) this;
        }

        public Criteria andOppAcctBalAIsNull() {
            addCriterion("opp_acct_bal_a is null");
            return (Criteria) this;
        }

        public Criteria andOppAcctBalAIsNotNull() {
            addCriterion("opp_acct_bal_a is not null");
            return (Criteria) this;
        }

        public Criteria andOppAcctBalAEqualTo(BigDecimal value) {
            addCriterion("opp_acct_bal_a =", value, "oppAcctBalA");
            return (Criteria) this;
        }

        public Criteria andOppAcctBalANotEqualTo(BigDecimal value) {
            addCriterion("opp_acct_bal_a <>", value, "oppAcctBalA");
            return (Criteria) this;
        }

        public Criteria andOppAcctBalAGreaterThan(BigDecimal value) {
            addCriterion("opp_acct_bal_a >", value, "oppAcctBalA");
            return (Criteria) this;
        }

        public Criteria andOppAcctBalAGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("opp_acct_bal_a >=", value, "oppAcctBalA");
            return (Criteria) this;
        }

        public Criteria andOppAcctBalALessThan(BigDecimal value) {
            addCriterion("opp_acct_bal_a <", value, "oppAcctBalA");
            return (Criteria) this;
        }

        public Criteria andOppAcctBalALessThanOrEqualTo(BigDecimal value) {
            addCriterion("opp_acct_bal_a <=", value, "oppAcctBalA");
            return (Criteria) this;
        }

        public Criteria andOppAcctBalAIn(List<BigDecimal> values) {
            addCriterion("opp_acct_bal_a in", values, "oppAcctBalA");
            return (Criteria) this;
        }

        public Criteria andOppAcctBalANotIn(List<BigDecimal> values) {
            addCriterion("opp_acct_bal_a not in", values, "oppAcctBalA");
            return (Criteria) this;
        }

        public Criteria andOppAcctBalABetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("opp_acct_bal_a between", value1, value2, "oppAcctBalA");
            return (Criteria) this;
        }

        public Criteria andOppAcctBalANotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("opp_acct_bal_a not between", value1, value2, "oppAcctBalA");
            return (Criteria) this;
        }

        public Criteria andOppAcctBalSumAIsNull() {
            addCriterion("opp_acct_bal_sum_a is null");
            return (Criteria) this;
        }

        public Criteria andOppAcctBalSumAIsNotNull() {
            addCriterion("opp_acct_bal_sum_a is not null");
            return (Criteria) this;
        }

        public Criteria andOppAcctBalSumAEqualTo(BigDecimal value) {
            addCriterion("opp_acct_bal_sum_a =", value, "oppAcctBalSumA");
            return (Criteria) this;
        }

        public Criteria andOppAcctBalSumANotEqualTo(BigDecimal value) {
            addCriterion("opp_acct_bal_sum_a <>", value, "oppAcctBalSumA");
            return (Criteria) this;
        }

        public Criteria andOppAcctBalSumAGreaterThan(BigDecimal value) {
            addCriterion("opp_acct_bal_sum_a >", value, "oppAcctBalSumA");
            return (Criteria) this;
        }

        public Criteria andOppAcctBalSumAGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("opp_acct_bal_sum_a >=", value, "oppAcctBalSumA");
            return (Criteria) this;
        }

        public Criteria andOppAcctBalSumALessThan(BigDecimal value) {
            addCriterion("opp_acct_bal_sum_a <", value, "oppAcctBalSumA");
            return (Criteria) this;
        }

        public Criteria andOppAcctBalSumALessThanOrEqualTo(BigDecimal value) {
            addCriterion("opp_acct_bal_sum_a <=", value, "oppAcctBalSumA");
            return (Criteria) this;
        }

        public Criteria andOppAcctBalSumAIn(List<BigDecimal> values) {
            addCriterion("opp_acct_bal_sum_a in", values, "oppAcctBalSumA");
            return (Criteria) this;
        }

        public Criteria andOppAcctBalSumANotIn(List<BigDecimal> values) {
            addCriterion("opp_acct_bal_sum_a not in", values, "oppAcctBalSumA");
            return (Criteria) this;
        }

        public Criteria andOppAcctBalSumABetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("opp_acct_bal_sum_a between", value1, value2, "oppAcctBalSumA");
            return (Criteria) this;
        }

        public Criteria andOppAcctBalSumANotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("opp_acct_bal_sum_a not between", value1, value2, "oppAcctBalSumA");
            return (Criteria) this;
        }

        public Criteria andOppAcctFrzBalBIsNull() {
            addCriterion("opp_acct_frz_bal_b is null");
            return (Criteria) this;
        }

        public Criteria andOppAcctFrzBalBIsNotNull() {
            addCriterion("opp_acct_frz_bal_b is not null");
            return (Criteria) this;
        }

        public Criteria andOppAcctFrzBalBEqualTo(BigDecimal value) {
            addCriterion("opp_acct_frz_bal_b =", value, "oppAcctFrzBalB");
            return (Criteria) this;
        }

        public Criteria andOppAcctFrzBalBNotEqualTo(BigDecimal value) {
            addCriterion("opp_acct_frz_bal_b <>", value, "oppAcctFrzBalB");
            return (Criteria) this;
        }

        public Criteria andOppAcctFrzBalBGreaterThan(BigDecimal value) {
            addCriterion("opp_acct_frz_bal_b >", value, "oppAcctFrzBalB");
            return (Criteria) this;
        }

        public Criteria andOppAcctFrzBalBGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("opp_acct_frz_bal_b >=", value, "oppAcctFrzBalB");
            return (Criteria) this;
        }

        public Criteria andOppAcctFrzBalBLessThan(BigDecimal value) {
            addCriterion("opp_acct_frz_bal_b <", value, "oppAcctFrzBalB");
            return (Criteria) this;
        }

        public Criteria andOppAcctFrzBalBLessThanOrEqualTo(BigDecimal value) {
            addCriterion("opp_acct_frz_bal_b <=", value, "oppAcctFrzBalB");
            return (Criteria) this;
        }

        public Criteria andOppAcctFrzBalBIn(List<BigDecimal> values) {
            addCriterion("opp_acct_frz_bal_b in", values, "oppAcctFrzBalB");
            return (Criteria) this;
        }

        public Criteria andOppAcctFrzBalBNotIn(List<BigDecimal> values) {
            addCriterion("opp_acct_frz_bal_b not in", values, "oppAcctFrzBalB");
            return (Criteria) this;
        }

        public Criteria andOppAcctFrzBalBBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("opp_acct_frz_bal_b between", value1, value2, "oppAcctFrzBalB");
            return (Criteria) this;
        }

        public Criteria andOppAcctFrzBalBNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("opp_acct_frz_bal_b not between", value1, value2, "oppAcctFrzBalB");
            return (Criteria) this;
        }

        public Criteria andOppAcctFrzBalAIsNull() {
            addCriterion("opp_acct_frz_bal_a is null");
            return (Criteria) this;
        }

        public Criteria andOppAcctFrzBalAIsNotNull() {
            addCriterion("opp_acct_frz_bal_a is not null");
            return (Criteria) this;
        }

        public Criteria andOppAcctFrzBalAEqualTo(BigDecimal value) {
            addCriterion("opp_acct_frz_bal_a =", value, "oppAcctFrzBalA");
            return (Criteria) this;
        }

        public Criteria andOppAcctFrzBalANotEqualTo(BigDecimal value) {
            addCriterion("opp_acct_frz_bal_a <>", value, "oppAcctFrzBalA");
            return (Criteria) this;
        }

        public Criteria andOppAcctFrzBalAGreaterThan(BigDecimal value) {
            addCriterion("opp_acct_frz_bal_a >", value, "oppAcctFrzBalA");
            return (Criteria) this;
        }

        public Criteria andOppAcctFrzBalAGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("opp_acct_frz_bal_a >=", value, "oppAcctFrzBalA");
            return (Criteria) this;
        }

        public Criteria andOppAcctFrzBalALessThan(BigDecimal value) {
            addCriterion("opp_acct_frz_bal_a <", value, "oppAcctFrzBalA");
            return (Criteria) this;
        }

        public Criteria andOppAcctFrzBalALessThanOrEqualTo(BigDecimal value) {
            addCriterion("opp_acct_frz_bal_a <=", value, "oppAcctFrzBalA");
            return (Criteria) this;
        }

        public Criteria andOppAcctFrzBalAIn(List<BigDecimal> values) {
            addCriterion("opp_acct_frz_bal_a in", values, "oppAcctFrzBalA");
            return (Criteria) this;
        }

        public Criteria andOppAcctFrzBalANotIn(List<BigDecimal> values) {
            addCriterion("opp_acct_frz_bal_a not in", values, "oppAcctFrzBalA");
            return (Criteria) this;
        }

        public Criteria andOppAcctFrzBalABetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("opp_acct_frz_bal_a between", value1, value2, "oppAcctFrzBalA");
            return (Criteria) this;
        }

        public Criteria andOppAcctFrzBalANotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("opp_acct_frz_bal_a not between", value1, value2, "oppAcctFrzBalA");
            return (Criteria) this;
        }

        public Criteria andOppAcctFrzBalSumAIsNull() {
            addCriterion("opp_acct_frz_bal_sum_a is null");
            return (Criteria) this;
        }

        public Criteria andOppAcctFrzBalSumAIsNotNull() {
            addCriterion("opp_acct_frz_bal_sum_a is not null");
            return (Criteria) this;
        }

        public Criteria andOppAcctFrzBalSumAEqualTo(BigDecimal value) {
            addCriterion("opp_acct_frz_bal_sum_a =", value, "oppAcctFrzBalSumA");
            return (Criteria) this;
        }

        public Criteria andOppAcctFrzBalSumANotEqualTo(BigDecimal value) {
            addCriterion("opp_acct_frz_bal_sum_a <>", value, "oppAcctFrzBalSumA");
            return (Criteria) this;
        }

        public Criteria andOppAcctFrzBalSumAGreaterThan(BigDecimal value) {
            addCriterion("opp_acct_frz_bal_sum_a >", value, "oppAcctFrzBalSumA");
            return (Criteria) this;
        }

        public Criteria andOppAcctFrzBalSumAGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("opp_acct_frz_bal_sum_a >=", value, "oppAcctFrzBalSumA");
            return (Criteria) this;
        }

        public Criteria andOppAcctFrzBalSumALessThan(BigDecimal value) {
            addCriterion("opp_acct_frz_bal_sum_a <", value, "oppAcctFrzBalSumA");
            return (Criteria) this;
        }

        public Criteria andOppAcctFrzBalSumALessThanOrEqualTo(BigDecimal value) {
            addCriterion("opp_acct_frz_bal_sum_a <=", value, "oppAcctFrzBalSumA");
            return (Criteria) this;
        }

        public Criteria andOppAcctFrzBalSumAIn(List<BigDecimal> values) {
            addCriterion("opp_acct_frz_bal_sum_a in", values, "oppAcctFrzBalSumA");
            return (Criteria) this;
        }

        public Criteria andOppAcctFrzBalSumANotIn(List<BigDecimal> values) {
            addCriterion("opp_acct_frz_bal_sum_a not in", values, "oppAcctFrzBalSumA");
            return (Criteria) this;
        }

        public Criteria andOppAcctFrzBalSumABetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("opp_acct_frz_bal_sum_a between", value1, value2, "oppAcctFrzBalSumA");
            return (Criteria) this;
        }

        public Criteria andOppAcctFrzBalSumANotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("opp_acct_frz_bal_sum_a not between", value1, value2, "oppAcctFrzBalSumA");
            return (Criteria) this;
        }

        public Criteria andAcctDateIsNull() {
            addCriterion("acct_date is null");
            return (Criteria) this;
        }

        public Criteria andAcctDateIsNotNull() {
            addCriterion("acct_date is not null");
            return (Criteria) this;
        }

        public Criteria andAcctDateEqualTo(String value) {
            addCriterion("acct_date =", value, "acctDate");
            return (Criteria) this;
        }

        public Criteria andAcctDateNotEqualTo(String value) {
            addCriterion("acct_date <>", value, "acctDate");
            return (Criteria) this;
        }

        public Criteria andAcctDateGreaterThan(String value) {
            addCriterion("acct_date >", value, "acctDate");
            return (Criteria) this;
        }

        public Criteria andAcctDateGreaterThanOrEqualTo(String value) {
            addCriterion("acct_date >=", value, "acctDate");
            return (Criteria) this;
        }

        public Criteria andAcctDateLessThan(String value) {
            addCriterion("acct_date <", value, "acctDate");
            return (Criteria) this;
        }

        public Criteria andAcctDateLessThanOrEqualTo(String value) {
            addCriterion("acct_date <=", value, "acctDate");
            return (Criteria) this;
        }

        public Criteria andAcctDateLike(String value) {
            addCriterion("acct_date like", value, "acctDate");
            return (Criteria) this;
        }

        public Criteria andAcctDateNotLike(String value) {
            addCriterion("acct_date not like", value, "acctDate");
            return (Criteria) this;
        }

        public Criteria andAcctDateIn(List<String> values) {
            addCriterion("acct_date in", values, "acctDate");
            return (Criteria) this;
        }

        public Criteria andAcctDateNotIn(List<String> values) {
            addCriterion("acct_date not in", values, "acctDate");
            return (Criteria) this;
        }

        public Criteria andAcctDateBetween(String value1, String value2) {
            addCriterion("acct_date between", value1, value2, "acctDate");
            return (Criteria) this;
        }

        public Criteria andAcctDateNotBetween(String value1, String value2) {
            addCriterion("acct_date not between", value1, value2, "acctDate");
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

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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

        public Criteria andFlowIdLikeInsensitive(String value) {
            addCriterion("upper(flow_id) like", value.toUpperCase(), "flowId");
            return (Criteria) this;
        }

        public Criteria andReqNoteLikeInsensitive(String value) {
            addCriterion("upper(req_note) like", value.toUpperCase(), "reqNote");
            return (Criteria) this;
        }

        public Criteria andTranCodeLikeInsensitive(String value) {
            addCriterion("upper(tran_code) like", value.toUpperCase(), "tranCode");
            return (Criteria) this;
        }

        public Criteria andTranTypeLikeInsensitive(String value) {
            addCriterion("upper(tran_type) like", value.toUpperCase(), "tranType");
            return (Criteria) this;
        }

        public Criteria andTsfUserNoLikeInsensitive(String value) {
            addCriterion("upper(tsf_user_no) like", value.toUpperCase(), "tsfUserNo");
            return (Criteria) this;
        }

        public Criteria andTsfUserTypeLikeInsensitive(String value) {
            addCriterion("upper(tsf_user_type) like", value.toUpperCase(), "tsfUserType");
            return (Criteria) this;
        }

        public Criteria andTsfAcctNoLikeInsensitive(String value) {
            addCriterion("upper(tsf_acct_no) like", value.toUpperCase(), "tsfAcctNo");
            return (Criteria) this;
        }

        public Criteria andTsfAcctTypeLikeInsensitive(String value) {
            addCriterion("upper(tsf_acct_type) like", value.toUpperCase(), "tsfAcctType");
            return (Criteria) this;
        }

        public Criteria andTsfAcctDirLikeInsensitive(String value) {
            addCriterion("upper(tsf_acct_dir) like", value.toUpperCase(), "tsfAcctDir");
            return (Criteria) this;
        }

        public Criteria andOppUserNoLikeInsensitive(String value) {
            addCriterion("upper(opp_user_no) like", value.toUpperCase(), "oppUserNo");
            return (Criteria) this;
        }

        public Criteria andOppUserTypeLikeInsensitive(String value) {
            addCriterion("upper(opp_user_type) like", value.toUpperCase(), "oppUserType");
            return (Criteria) this;
        }

        public Criteria andOppAcctNoLikeInsensitive(String value) {
            addCriterion("upper(opp_acct_no) like", value.toUpperCase(), "oppAcctNo");
            return (Criteria) this;
        }

        public Criteria andOppAcctTypeLikeInsensitive(String value) {
            addCriterion("upper(opp_acct_type) like", value.toUpperCase(), "oppAcctType");
            return (Criteria) this;
        }

        public Criteria andOppAcctDirLikeInsensitive(String value) {
            addCriterion("upper(opp_acct_dir) like", value.toUpperCase(), "oppAcctDir");
            return (Criteria) this;
        }

        public Criteria andAcctDateLikeInsensitive(String value) {
            addCriterion("upper(acct_date) like", value.toUpperCase(), "acctDate");
            return (Criteria) this;
        }

        public Criteria andCurrNoLikeInsensitive(String value) {
            addCriterion("upper(curr_no) like", value.toUpperCase(), "currNo");
            return (Criteria) this;
        }

        public Criteria andNoteLikeInsensitive(String value) {
            addCriterion("upper(note) like", value.toUpperCase(), "note");
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