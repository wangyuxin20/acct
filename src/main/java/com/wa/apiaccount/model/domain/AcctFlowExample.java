package com.wd.apiaccount.model.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AcctFlowExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AcctFlowExample() {
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

        public Criteria andReqIdIsNull() {
            addCriterion("req_id is null");
            return (Criteria) this;
        }

        public Criteria andReqIdIsNotNull() {
            addCriterion("req_id is not null");
            return (Criteria) this;
        }

        public Criteria andReqIdEqualTo(String value) {
            addCriterion("req_id =", value, "reqId");
            return (Criteria) this;
        }

        public Criteria andReqIdNotEqualTo(String value) {
            addCriterion("req_id <>", value, "reqId");
            return (Criteria) this;
        }

        public Criteria andReqIdGreaterThan(String value) {
            addCriterion("req_id >", value, "reqId");
            return (Criteria) this;
        }

        public Criteria andReqIdGreaterThanOrEqualTo(String value) {
            addCriterion("req_id >=", value, "reqId");
            return (Criteria) this;
        }

        public Criteria andReqIdLessThan(String value) {
            addCriterion("req_id <", value, "reqId");
            return (Criteria) this;
        }

        public Criteria andReqIdLessThanOrEqualTo(String value) {
            addCriterion("req_id <=", value, "reqId");
            return (Criteria) this;
        }

        public Criteria andReqIdLike(String value) {
            addCriterion("req_id like", value, "reqId");
            return (Criteria) this;
        }

        public Criteria andReqIdNotLike(String value) {
            addCriterion("req_id not like", value, "reqId");
            return (Criteria) this;
        }

        public Criteria andReqIdIn(List<String> values) {
            addCriterion("req_id in", values, "reqId");
            return (Criteria) this;
        }

        public Criteria andReqIdNotIn(List<String> values) {
            addCriterion("req_id not in", values, "reqId");
            return (Criteria) this;
        }

        public Criteria andReqIdBetween(String value1, String value2) {
            addCriterion("req_id between", value1, value2, "reqId");
            return (Criteria) this;
        }

        public Criteria andReqIdNotBetween(String value1, String value2) {
            addCriterion("req_id not between", value1, value2, "reqId");
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

        public Criteria andOppUserNameIsNull() {
            addCriterion("opp_user_name is null");
            return (Criteria) this;
        }

        public Criteria andOppUserNameIsNotNull() {
            addCriterion("opp_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andOppUserNameEqualTo(String value) {
            addCriterion("opp_user_name =", value, "oppUserName");
            return (Criteria) this;
        }

        public Criteria andOppUserNameNotEqualTo(String value) {
            addCriterion("opp_user_name <>", value, "oppUserName");
            return (Criteria) this;
        }

        public Criteria andOppUserNameGreaterThan(String value) {
            addCriterion("opp_user_name >", value, "oppUserName");
            return (Criteria) this;
        }

        public Criteria andOppUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("opp_user_name >=", value, "oppUserName");
            return (Criteria) this;
        }

        public Criteria andOppUserNameLessThan(String value) {
            addCriterion("opp_user_name <", value, "oppUserName");
            return (Criteria) this;
        }

        public Criteria andOppUserNameLessThanOrEqualTo(String value) {
            addCriterion("opp_user_name <=", value, "oppUserName");
            return (Criteria) this;
        }

        public Criteria andOppUserNameLike(String value) {
            addCriterion("opp_user_name like", value, "oppUserName");
            return (Criteria) this;
        }

        public Criteria andOppUserNameNotLike(String value) {
            addCriterion("opp_user_name not like", value, "oppUserName");
            return (Criteria) this;
        }

        public Criteria andOppUserNameIn(List<String> values) {
            addCriterion("opp_user_name in", values, "oppUserName");
            return (Criteria) this;
        }

        public Criteria andOppUserNameNotIn(List<String> values) {
            addCriterion("opp_user_name not in", values, "oppUserName");
            return (Criteria) this;
        }

        public Criteria andOppUserNameBetween(String value1, String value2) {
            addCriterion("opp_user_name between", value1, value2, "oppUserName");
            return (Criteria) this;
        }

        public Criteria andOppUserNameNotBetween(String value1, String value2) {
            addCriterion("opp_user_name not between", value1, value2, "oppUserName");
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

        public Criteria andDctAmtIsNull() {
            addCriterion("dct_amt is null");
            return (Criteria) this;
        }

        public Criteria andDctAmtIsNotNull() {
            addCriterion("dct_amt is not null");
            return (Criteria) this;
        }

        public Criteria andDctAmtEqualTo(BigDecimal value) {
            addCriterion("dct_amt =", value, "dctAmt");
            return (Criteria) this;
        }

        public Criteria andDctAmtNotEqualTo(BigDecimal value) {
            addCriterion("dct_amt <>", value, "dctAmt");
            return (Criteria) this;
        }

        public Criteria andDctAmtGreaterThan(BigDecimal value) {
            addCriterion("dct_amt >", value, "dctAmt");
            return (Criteria) this;
        }

        public Criteria andDctAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dct_amt >=", value, "dctAmt");
            return (Criteria) this;
        }

        public Criteria andDctAmtLessThan(BigDecimal value) {
            addCriterion("dct_amt <", value, "dctAmt");
            return (Criteria) this;
        }

        public Criteria andDctAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dct_amt <=", value, "dctAmt");
            return (Criteria) this;
        }

        public Criteria andDctAmtIn(List<BigDecimal> values) {
            addCriterion("dct_amt in", values, "dctAmt");
            return (Criteria) this;
        }

        public Criteria andDctAmtNotIn(List<BigDecimal> values) {
            addCriterion("dct_amt not in", values, "dctAmt");
            return (Criteria) this;
        }

        public Criteria andDctAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dct_amt between", value1, value2, "dctAmt");
            return (Criteria) this;
        }

        public Criteria andDctAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dct_amt not between", value1, value2, "dctAmt");
            return (Criteria) this;
        }

        public Criteria andFeeAmtIsNull() {
            addCriterion("fee_amt is null");
            return (Criteria) this;
        }

        public Criteria andFeeAmtIsNotNull() {
            addCriterion("fee_amt is not null");
            return (Criteria) this;
        }

        public Criteria andFeeAmtEqualTo(BigDecimal value) {
            addCriterion("fee_amt =", value, "feeAmt");
            return (Criteria) this;
        }

        public Criteria andFeeAmtNotEqualTo(BigDecimal value) {
            addCriterion("fee_amt <>", value, "feeAmt");
            return (Criteria) this;
        }

        public Criteria andFeeAmtGreaterThan(BigDecimal value) {
            addCriterion("fee_amt >", value, "feeAmt");
            return (Criteria) this;
        }

        public Criteria andFeeAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fee_amt >=", value, "feeAmt");
            return (Criteria) this;
        }

        public Criteria andFeeAmtLessThan(BigDecimal value) {
            addCriterion("fee_amt <", value, "feeAmt");
            return (Criteria) this;
        }

        public Criteria andFeeAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fee_amt <=", value, "feeAmt");
            return (Criteria) this;
        }

        public Criteria andFeeAmtIn(List<BigDecimal> values) {
            addCriterion("fee_amt in", values, "feeAmt");
            return (Criteria) this;
        }

        public Criteria andFeeAmtNotIn(List<BigDecimal> values) {
            addCriterion("fee_amt not in", values, "feeAmt");
            return (Criteria) this;
        }

        public Criteria andFeeAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee_amt between", value1, value2, "feeAmt");
            return (Criteria) this;
        }

        public Criteria andFeeAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee_amt not between", value1, value2, "feeAmt");
            return (Criteria) this;
        }

        public Criteria andFeeTypeIsNull() {
            addCriterion("fee_type is null");
            return (Criteria) this;
        }

        public Criteria andFeeTypeIsNotNull() {
            addCriterion("fee_type is not null");
            return (Criteria) this;
        }

        public Criteria andFeeTypeEqualTo(String value) {
            addCriterion("fee_type =", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeNotEqualTo(String value) {
            addCriterion("fee_type <>", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeGreaterThan(String value) {
            addCriterion("fee_type >", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("fee_type >=", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeLessThan(String value) {
            addCriterion("fee_type <", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeLessThanOrEqualTo(String value) {
            addCriterion("fee_type <=", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeLike(String value) {
            addCriterion("fee_type like", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeNotLike(String value) {
            addCriterion("fee_type not like", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeIn(List<String> values) {
            addCriterion("fee_type in", values, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeNotIn(List<String> values) {
            addCriterion("fee_type not in", values, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeBetween(String value1, String value2) {
            addCriterion("fee_type between", value1, value2, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeNotBetween(String value1, String value2) {
            addCriterion("fee_type not between", value1, value2, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeValueIsNull() {
            addCriterion("fee_value is null");
            return (Criteria) this;
        }

        public Criteria andFeeValueIsNotNull() {
            addCriterion("fee_value is not null");
            return (Criteria) this;
        }

        public Criteria andFeeValueEqualTo(BigDecimal value) {
            addCriterion("fee_value =", value, "feeValue");
            return (Criteria) this;
        }

        public Criteria andFeeValueNotEqualTo(BigDecimal value) {
            addCriterion("fee_value <>", value, "feeValue");
            return (Criteria) this;
        }

        public Criteria andFeeValueGreaterThan(BigDecimal value) {
            addCriterion("fee_value >", value, "feeValue");
            return (Criteria) this;
        }

        public Criteria andFeeValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fee_value >=", value, "feeValue");
            return (Criteria) this;
        }

        public Criteria andFeeValueLessThan(BigDecimal value) {
            addCriterion("fee_value <", value, "feeValue");
            return (Criteria) this;
        }

        public Criteria andFeeValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fee_value <=", value, "feeValue");
            return (Criteria) this;
        }

        public Criteria andFeeValueIn(List<BigDecimal> values) {
            addCriterion("fee_value in", values, "feeValue");
            return (Criteria) this;
        }

        public Criteria andFeeValueNotIn(List<BigDecimal> values) {
            addCriterion("fee_value not in", values, "feeValue");
            return (Criteria) this;
        }

        public Criteria andFeeValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee_value between", value1, value2, "feeValue");
            return (Criteria) this;
        }

        public Criteria andFeeValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee_value not between", value1, value2, "feeValue");
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

        public Criteria andClusterIdIsNull() {
            addCriterion("cluster_id is null");
            return (Criteria) this;
        }

        public Criteria andClusterIdIsNotNull() {
            addCriterion("cluster_id is not null");
            return (Criteria) this;
        }

        public Criteria andClusterIdEqualTo(Integer value) {
            addCriterion("cluster_id =", value, "clusterId");
            return (Criteria) this;
        }

        public Criteria andClusterIdNotEqualTo(Integer value) {
            addCriterion("cluster_id <>", value, "clusterId");
            return (Criteria) this;
        }

        public Criteria andClusterIdGreaterThan(Integer value) {
            addCriterion("cluster_id >", value, "clusterId");
            return (Criteria) this;
        }

        public Criteria andClusterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cluster_id >=", value, "clusterId");
            return (Criteria) this;
        }

        public Criteria andClusterIdLessThan(Integer value) {
            addCriterion("cluster_id <", value, "clusterId");
            return (Criteria) this;
        }

        public Criteria andClusterIdLessThanOrEqualTo(Integer value) {
            addCriterion("cluster_id <=", value, "clusterId");
            return (Criteria) this;
        }

        public Criteria andClusterIdIn(List<Integer> values) {
            addCriterion("cluster_id in", values, "clusterId");
            return (Criteria) this;
        }

        public Criteria andClusterIdNotIn(List<Integer> values) {
            addCriterion("cluster_id not in", values, "clusterId");
            return (Criteria) this;
        }

        public Criteria andClusterIdBetween(Integer value1, Integer value2) {
            addCriterion("cluster_id between", value1, value2, "clusterId");
            return (Criteria) this;
        }

        public Criteria andClusterIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cluster_id not between", value1, value2, "clusterId");
            return (Criteria) this;
        }

        public Criteria andErrCodeIsNull() {
            addCriterion("err_code is null");
            return (Criteria) this;
        }

        public Criteria andErrCodeIsNotNull() {
            addCriterion("err_code is not null");
            return (Criteria) this;
        }

        public Criteria andErrCodeEqualTo(String value) {
            addCriterion("err_code =", value, "errCode");
            return (Criteria) this;
        }

        public Criteria andErrCodeNotEqualTo(String value) {
            addCriterion("err_code <>", value, "errCode");
            return (Criteria) this;
        }

        public Criteria andErrCodeGreaterThan(String value) {
            addCriterion("err_code >", value, "errCode");
            return (Criteria) this;
        }

        public Criteria andErrCodeGreaterThanOrEqualTo(String value) {
            addCriterion("err_code >=", value, "errCode");
            return (Criteria) this;
        }

        public Criteria andErrCodeLessThan(String value) {
            addCriterion("err_code <", value, "errCode");
            return (Criteria) this;
        }

        public Criteria andErrCodeLessThanOrEqualTo(String value) {
            addCriterion("err_code <=", value, "errCode");
            return (Criteria) this;
        }

        public Criteria andErrCodeLike(String value) {
            addCriterion("err_code like", value, "errCode");
            return (Criteria) this;
        }

        public Criteria andErrCodeNotLike(String value) {
            addCriterion("err_code not like", value, "errCode");
            return (Criteria) this;
        }

        public Criteria andErrCodeIn(List<String> values) {
            addCriterion("err_code in", values, "errCode");
            return (Criteria) this;
        }

        public Criteria andErrCodeNotIn(List<String> values) {
            addCriterion("err_code not in", values, "errCode");
            return (Criteria) this;
        }

        public Criteria andErrCodeBetween(String value1, String value2) {
            addCriterion("err_code between", value1, value2, "errCode");
            return (Criteria) this;
        }

        public Criteria andErrCodeNotBetween(String value1, String value2) {
            addCriterion("err_code not between", value1, value2, "errCode");
            return (Criteria) this;
        }

        public Criteria andExCodeIsNull() {
            addCriterion("ex_code is null");
            return (Criteria) this;
        }

        public Criteria andExCodeIsNotNull() {
            addCriterion("ex_code is not null");
            return (Criteria) this;
        }

        public Criteria andExCodeEqualTo(String value) {
            addCriterion("ex_code =", value, "exCode");
            return (Criteria) this;
        }

        public Criteria andExCodeNotEqualTo(String value) {
            addCriterion("ex_code <>", value, "exCode");
            return (Criteria) this;
        }

        public Criteria andExCodeGreaterThan(String value) {
            addCriterion("ex_code >", value, "exCode");
            return (Criteria) this;
        }

        public Criteria andExCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ex_code >=", value, "exCode");
            return (Criteria) this;
        }

        public Criteria andExCodeLessThan(String value) {
            addCriterion("ex_code <", value, "exCode");
            return (Criteria) this;
        }

        public Criteria andExCodeLessThanOrEqualTo(String value) {
            addCriterion("ex_code <=", value, "exCode");
            return (Criteria) this;
        }

        public Criteria andExCodeLike(String value) {
            addCriterion("ex_code like", value, "exCode");
            return (Criteria) this;
        }

        public Criteria andExCodeNotLike(String value) {
            addCriterion("ex_code not like", value, "exCode");
            return (Criteria) this;
        }

        public Criteria andExCodeIn(List<String> values) {
            addCriterion("ex_code in", values, "exCode");
            return (Criteria) this;
        }

        public Criteria andExCodeNotIn(List<String> values) {
            addCriterion("ex_code not in", values, "exCode");
            return (Criteria) this;
        }

        public Criteria andExCodeBetween(String value1, String value2) {
            addCriterion("ex_code between", value1, value2, "exCode");
            return (Criteria) this;
        }

        public Criteria andExCodeNotBetween(String value1, String value2) {
            addCriterion("ex_code not between", value1, value2, "exCode");
            return (Criteria) this;
        }

        public Criteria andExNameIsNull() {
            addCriterion("ex_name is null");
            return (Criteria) this;
        }

        public Criteria andExNameIsNotNull() {
            addCriterion("ex_name is not null");
            return (Criteria) this;
        }

        public Criteria andExNameEqualTo(String value) {
            addCriterion("ex_name =", value, "exName");
            return (Criteria) this;
        }

        public Criteria andExNameNotEqualTo(String value) {
            addCriterion("ex_name <>", value, "exName");
            return (Criteria) this;
        }

        public Criteria andExNameGreaterThan(String value) {
            addCriterion("ex_name >", value, "exName");
            return (Criteria) this;
        }

        public Criteria andExNameGreaterThanOrEqualTo(String value) {
            addCriterion("ex_name >=", value, "exName");
            return (Criteria) this;
        }

        public Criteria andExNameLessThan(String value) {
            addCriterion("ex_name <", value, "exName");
            return (Criteria) this;
        }

        public Criteria andExNameLessThanOrEqualTo(String value) {
            addCriterion("ex_name <=", value, "exName");
            return (Criteria) this;
        }

        public Criteria andExNameLike(String value) {
            addCriterion("ex_name like", value, "exName");
            return (Criteria) this;
        }

        public Criteria andExNameNotLike(String value) {
            addCriterion("ex_name not like", value, "exName");
            return (Criteria) this;
        }

        public Criteria andExNameIn(List<String> values) {
            addCriterion("ex_name in", values, "exName");
            return (Criteria) this;
        }

        public Criteria andExNameNotIn(List<String> values) {
            addCriterion("ex_name not in", values, "exName");
            return (Criteria) this;
        }

        public Criteria andExNameBetween(String value1, String value2) {
            addCriterion("ex_name between", value1, value2, "exName");
            return (Criteria) this;
        }

        public Criteria andExNameNotBetween(String value1, String value2) {
            addCriterion("ex_name not between", value1, value2, "exName");
            return (Criteria) this;
        }

        public Criteria andExPriceIsNull() {
            addCriterion("ex_price is null");
            return (Criteria) this;
        }

        public Criteria andExPriceIsNotNull() {
            addCriterion("ex_price is not null");
            return (Criteria) this;
        }

        public Criteria andExPriceEqualTo(BigDecimal value) {
            addCriterion("ex_price =", value, "exPrice");
            return (Criteria) this;
        }

        public Criteria andExPriceNotEqualTo(BigDecimal value) {
            addCriterion("ex_price <>", value, "exPrice");
            return (Criteria) this;
        }

        public Criteria andExPriceGreaterThan(BigDecimal value) {
            addCriterion("ex_price >", value, "exPrice");
            return (Criteria) this;
        }

        public Criteria andExPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ex_price >=", value, "exPrice");
            return (Criteria) this;
        }

        public Criteria andExPriceLessThan(BigDecimal value) {
            addCriterion("ex_price <", value, "exPrice");
            return (Criteria) this;
        }

        public Criteria andExPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ex_price <=", value, "exPrice");
            return (Criteria) this;
        }

        public Criteria andExPriceIn(List<BigDecimal> values) {
            addCriterion("ex_price in", values, "exPrice");
            return (Criteria) this;
        }

        public Criteria andExPriceNotIn(List<BigDecimal> values) {
            addCriterion("ex_price not in", values, "exPrice");
            return (Criteria) this;
        }

        public Criteria andExPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ex_price between", value1, value2, "exPrice");
            return (Criteria) this;
        }

        public Criteria andExPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ex_price not between", value1, value2, "exPrice");
            return (Criteria) this;
        }

        public Criteria andExNumIsNull() {
            addCriterion("ex_num is null");
            return (Criteria) this;
        }

        public Criteria andExNumIsNotNull() {
            addCriterion("ex_num is not null");
            return (Criteria) this;
        }

        public Criteria andExNumEqualTo(BigDecimal value) {
            addCriterion("ex_num =", value, "exNum");
            return (Criteria) this;
        }

        public Criteria andExNumNotEqualTo(BigDecimal value) {
            addCriterion("ex_num <>", value, "exNum");
            return (Criteria) this;
        }

        public Criteria andExNumGreaterThan(BigDecimal value) {
            addCriterion("ex_num >", value, "exNum");
            return (Criteria) this;
        }

        public Criteria andExNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ex_num >=", value, "exNum");
            return (Criteria) this;
        }

        public Criteria andExNumLessThan(BigDecimal value) {
            addCriterion("ex_num <", value, "exNum");
            return (Criteria) this;
        }

        public Criteria andExNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ex_num <=", value, "exNum");
            return (Criteria) this;
        }

        public Criteria andExNumIn(List<BigDecimal> values) {
            addCriterion("ex_num in", values, "exNum");
            return (Criteria) this;
        }

        public Criteria andExNumNotIn(List<BigDecimal> values) {
            addCriterion("ex_num not in", values, "exNum");
            return (Criteria) this;
        }

        public Criteria andExNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ex_num between", value1, value2, "exNum");
            return (Criteria) this;
        }

        public Criteria andExNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ex_num not between", value1, value2, "exNum");
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

        public Criteria andFrzFlowIdIsNull() {
            addCriterion("frz_flow_id is null");
            return (Criteria) this;
        }

        public Criteria andFrzFlowIdIsNotNull() {
            addCriterion("frz_flow_id is not null");
            return (Criteria) this;
        }

        public Criteria andFrzFlowIdEqualTo(Long value) {
            addCriterion("frz_flow_id =", value, "frzFlowId");
            return (Criteria) this;
        }

        public Criteria andFrzFlowIdNotEqualTo(Long value) {
            addCriterion("frz_flow_id <>", value, "frzFlowId");
            return (Criteria) this;
        }

        public Criteria andFrzFlowIdGreaterThan(Long value) {
            addCriterion("frz_flow_id >", value, "frzFlowId");
            return (Criteria) this;
        }

        public Criteria andFrzFlowIdGreaterThanOrEqualTo(Long value) {
            addCriterion("frz_flow_id >=", value, "frzFlowId");
            return (Criteria) this;
        }

        public Criteria andFrzFlowIdLessThan(Long value) {
            addCriterion("frz_flow_id <", value, "frzFlowId");
            return (Criteria) this;
        }

        public Criteria andFrzFlowIdLessThanOrEqualTo(Long value) {
            addCriterion("frz_flow_id <=", value, "frzFlowId");
            return (Criteria) this;
        }

        public Criteria andFrzFlowIdIn(List<Long> values) {
            addCriterion("frz_flow_id in", values, "frzFlowId");
            return (Criteria) this;
        }

        public Criteria andFrzFlowIdNotIn(List<Long> values) {
            addCriterion("frz_flow_id not in", values, "frzFlowId");
            return (Criteria) this;
        }

        public Criteria andFrzFlowIdBetween(Long value1, Long value2) {
            addCriterion("frz_flow_id between", value1, value2, "frzFlowId");
            return (Criteria) this;
        }

        public Criteria andFrzFlowIdNotBetween(Long value1, Long value2) {
            addCriterion("frz_flow_id not between", value1, value2, "frzFlowId");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(String value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(String value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(String value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(String value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(String value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(String value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLike(String value) {
            addCriterion("number like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotLike(String value) {
            addCriterion("number not like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<String> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<String> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(String value1, String value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(String value1, String value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andBillIdIsNull() {
            addCriterion("bill_id is null");
            return (Criteria) this;
        }

        public Criteria andBillIdIsNotNull() {
            addCriterion("bill_id is not null");
            return (Criteria) this;
        }

        public Criteria andBillIdEqualTo(Long value) {
            addCriterion("bill_id =", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdNotEqualTo(Long value) {
            addCriterion("bill_id <>", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdGreaterThan(Long value) {
            addCriterion("bill_id >", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdGreaterThanOrEqualTo(Long value) {
            addCriterion("bill_id >=", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdLessThan(Long value) {
            addCriterion("bill_id <", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdLessThanOrEqualTo(Long value) {
            addCriterion("bill_id <=", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdIn(List<Long> values) {
            addCriterion("bill_id in", values, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdNotIn(List<Long> values) {
            addCriterion("bill_id not in", values, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdBetween(Long value1, Long value2) {
            addCriterion("bill_id between", value1, value2, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdNotBetween(Long value1, Long value2) {
            addCriterion("bill_id not between", value1, value2, "billId");
            return (Criteria) this;
        }

        public Criteria andReqIdLikeInsensitive(String value) {
            addCriterion("upper(req_id) like", value.toUpperCase(), "reqId");
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

        public Criteria andTsfUserNoLikeInsensitive(String value) {
            addCriterion("upper(tsf_user_no) like", value.toUpperCase(), "tsfUserNo");
            return (Criteria) this;
        }

        public Criteria andTsfUserTypeLikeInsensitive(String value) {
            addCriterion("upper(tsf_user_type) like", value.toUpperCase(), "tsfUserType");
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

        public Criteria andOppUserNameLikeInsensitive(String value) {
            addCriterion("upper(opp_user_name) like", value.toUpperCase(), "oppUserName");
            return (Criteria) this;
        }

        public Criteria andOppUserTypeLikeInsensitive(String value) {
            addCriterion("upper(opp_user_type) like", value.toUpperCase(), "oppUserType");
            return (Criteria) this;
        }

        public Criteria andOppAcctDirLikeInsensitive(String value) {
            addCriterion("upper(opp_acct_dir) like", value.toUpperCase(), "oppAcctDir");
            return (Criteria) this;
        }

        public Criteria andFeeTypeLikeInsensitive(String value) {
            addCriterion("upper(fee_type) like", value.toUpperCase(), "feeType");
            return (Criteria) this;
        }

        public Criteria andCurrNoLikeInsensitive(String value) {
            addCriterion("upper(curr_no) like", value.toUpperCase(), "currNo");
            return (Criteria) this;
        }

        public Criteria andAcctDateLikeInsensitive(String value) {
            addCriterion("upper(acct_date) like", value.toUpperCase(), "acctDate");
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

        public Criteria andErrCodeLikeInsensitive(String value) {
            addCriterion("upper(err_code) like", value.toUpperCase(), "errCode");
            return (Criteria) this;
        }

        public Criteria andExCodeLikeInsensitive(String value) {
            addCriterion("upper(ex_code) like", value.toUpperCase(), "exCode");
            return (Criteria) this;
        }

        public Criteria andExNameLikeInsensitive(String value) {
            addCriterion("upper(ex_name) like", value.toUpperCase(), "exName");
            return (Criteria) this;
        }

        public Criteria andNumberLikeInsensitive(String value) {
            addCriterion("upper(number) like", value.toUpperCase(), "number");
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