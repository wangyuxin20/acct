package com.wd.apiaccount.model.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AcctOdrCardJointlyKqResvExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AcctOdrCardJointlyKqResvExample() {
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

        public Criteria andJointlyIdIsNull() {
            addCriterion("jointly_id is null");
            return (Criteria) this;
        }

        public Criteria andJointlyIdIsNotNull() {
            addCriterion("jointly_id is not null");
            return (Criteria) this;
        }

        public Criteria andJointlyIdEqualTo(Long value) {
            addCriterion("jointly_id =", value, "jointlyId");
            return (Criteria) this;
        }

        public Criteria andJointlyIdNotEqualTo(Long value) {
            addCriterion("jointly_id <>", value, "jointlyId");
            return (Criteria) this;
        }

        public Criteria andJointlyIdGreaterThan(Long value) {
            addCriterion("jointly_id >", value, "jointlyId");
            return (Criteria) this;
        }

        public Criteria andJointlyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("jointly_id >=", value, "jointlyId");
            return (Criteria) this;
        }

        public Criteria andJointlyIdLessThan(Long value) {
            addCriterion("jointly_id <", value, "jointlyId");
            return (Criteria) this;
        }

        public Criteria andJointlyIdLessThanOrEqualTo(Long value) {
            addCriterion("jointly_id <=", value, "jointlyId");
            return (Criteria) this;
        }

        public Criteria andJointlyIdIn(List<Long> values) {
            addCriterion("jointly_id in", values, "jointlyId");
            return (Criteria) this;
        }

        public Criteria andJointlyIdNotIn(List<Long> values) {
            addCriterion("jointly_id not in", values, "jointlyId");
            return (Criteria) this;
        }

        public Criteria andJointlyIdBetween(Long value1, Long value2) {
            addCriterion("jointly_id between", value1, value2, "jointlyId");
            return (Criteria) this;
        }

        public Criteria andJointlyIdNotBetween(Long value1, Long value2) {
            addCriterion("jointly_id not between", value1, value2, "jointlyId");
            return (Criteria) this;
        }

        public Criteria andJointlySeqIsNull() {
            addCriterion("jointly_seq is null");
            return (Criteria) this;
        }

        public Criteria andJointlySeqIsNotNull() {
            addCriterion("jointly_seq is not null");
            return (Criteria) this;
        }

        public Criteria andJointlySeqEqualTo(Integer value) {
            addCriterion("jointly_seq =", value, "jointlySeq");
            return (Criteria) this;
        }

        public Criteria andJointlySeqNotEqualTo(Integer value) {
            addCriterion("jointly_seq <>", value, "jointlySeq");
            return (Criteria) this;
        }

        public Criteria andJointlySeqGreaterThan(Integer value) {
            addCriterion("jointly_seq >", value, "jointlySeq");
            return (Criteria) this;
        }

        public Criteria andJointlySeqGreaterThanOrEqualTo(Integer value) {
            addCriterion("jointly_seq >=", value, "jointlySeq");
            return (Criteria) this;
        }

        public Criteria andJointlySeqLessThan(Integer value) {
            addCriterion("jointly_seq <", value, "jointlySeq");
            return (Criteria) this;
        }

        public Criteria andJointlySeqLessThanOrEqualTo(Integer value) {
            addCriterion("jointly_seq <=", value, "jointlySeq");
            return (Criteria) this;
        }

        public Criteria andJointlySeqIn(List<Integer> values) {
            addCriterion("jointly_seq in", values, "jointlySeq");
            return (Criteria) this;
        }

        public Criteria andJointlySeqNotIn(List<Integer> values) {
            addCriterion("jointly_seq not in", values, "jointlySeq");
            return (Criteria) this;
        }

        public Criteria andJointlySeqBetween(Integer value1, Integer value2) {
            addCriterion("jointly_seq between", value1, value2, "jointlySeq");
            return (Criteria) this;
        }

        public Criteria andJointlySeqNotBetween(Integer value1, Integer value2) {
            addCriterion("jointly_seq not between", value1, value2, "jointlySeq");
            return (Criteria) this;
        }

        public Criteria andKqIdIsNull() {
            addCriterion("kq_id is null");
            return (Criteria) this;
        }

        public Criteria andKqIdIsNotNull() {
            addCriterion("kq_id is not null");
            return (Criteria) this;
        }

        public Criteria andKqIdEqualTo(String value) {
            addCriterion("kq_id =", value, "kqId");
            return (Criteria) this;
        }

        public Criteria andKqIdNotEqualTo(String value) {
            addCriterion("kq_id <>", value, "kqId");
            return (Criteria) this;
        }

        public Criteria andKqIdGreaterThan(String value) {
            addCriterion("kq_id >", value, "kqId");
            return (Criteria) this;
        }

        public Criteria andKqIdGreaterThanOrEqualTo(String value) {
            addCriterion("kq_id >=", value, "kqId");
            return (Criteria) this;
        }

        public Criteria andKqIdLessThan(String value) {
            addCriterion("kq_id <", value, "kqId");
            return (Criteria) this;
        }

        public Criteria andKqIdLessThanOrEqualTo(String value) {
            addCriterion("kq_id <=", value, "kqId");
            return (Criteria) this;
        }

        public Criteria andKqIdLike(String value) {
            addCriterion("kq_id like", value, "kqId");
            return (Criteria) this;
        }

        public Criteria andKqIdNotLike(String value) {
            addCriterion("kq_id not like", value, "kqId");
            return (Criteria) this;
        }

        public Criteria andKqIdIn(List<String> values) {
            addCriterion("kq_id in", values, "kqId");
            return (Criteria) this;
        }

        public Criteria andKqIdNotIn(List<String> values) {
            addCriterion("kq_id not in", values, "kqId");
            return (Criteria) this;
        }

        public Criteria andKqIdBetween(String value1, String value2) {
            addCriterion("kq_id between", value1, value2, "kqId");
            return (Criteria) this;
        }

        public Criteria andKqIdNotBetween(String value1, String value2) {
            addCriterion("kq_id not between", value1, value2, "kqId");
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

        public Criteria andMerNoIsNull() {
            addCriterion("mer_no is null");
            return (Criteria) this;
        }

        public Criteria andMerNoIsNotNull() {
            addCriterion("mer_no is not null");
            return (Criteria) this;
        }

        public Criteria andMerNoEqualTo(String value) {
            addCriterion("mer_no =", value, "merNo");
            return (Criteria) this;
        }

        public Criteria andMerNoNotEqualTo(String value) {
            addCriterion("mer_no <>", value, "merNo");
            return (Criteria) this;
        }

        public Criteria andMerNoGreaterThan(String value) {
            addCriterion("mer_no >", value, "merNo");
            return (Criteria) this;
        }

        public Criteria andMerNoGreaterThanOrEqualTo(String value) {
            addCriterion("mer_no >=", value, "merNo");
            return (Criteria) this;
        }

        public Criteria andMerNoLessThan(String value) {
            addCriterion("mer_no <", value, "merNo");
            return (Criteria) this;
        }

        public Criteria andMerNoLessThanOrEqualTo(String value) {
            addCriterion("mer_no <=", value, "merNo");
            return (Criteria) this;
        }

        public Criteria andMerNoLike(String value) {
            addCriterion("mer_no like", value, "merNo");
            return (Criteria) this;
        }

        public Criteria andMerNoNotLike(String value) {
            addCriterion("mer_no not like", value, "merNo");
            return (Criteria) this;
        }

        public Criteria andMerNoIn(List<String> values) {
            addCriterion("mer_no in", values, "merNo");
            return (Criteria) this;
        }

        public Criteria andMerNoNotIn(List<String> values) {
            addCriterion("mer_no not in", values, "merNo");
            return (Criteria) this;
        }

        public Criteria andMerNoBetween(String value1, String value2) {
            addCriterion("mer_no between", value1, value2, "merNo");
            return (Criteria) this;
        }

        public Criteria andMerNoNotBetween(String value1, String value2) {
            addCriterion("mer_no not between", value1, value2, "merNo");
            return (Criteria) this;
        }

        public Criteria andBizMerNameIsNull() {
            addCriterion("biz_mer_name is null");
            return (Criteria) this;
        }

        public Criteria andBizMerNameIsNotNull() {
            addCriterion("biz_mer_name is not null");
            return (Criteria) this;
        }

        public Criteria andBizMerNameEqualTo(String value) {
            addCriterion("biz_mer_name =", value, "bizMerName");
            return (Criteria) this;
        }

        public Criteria andBizMerNameNotEqualTo(String value) {
            addCriterion("biz_mer_name <>", value, "bizMerName");
            return (Criteria) this;
        }

        public Criteria andBizMerNameGreaterThan(String value) {
            addCriterion("biz_mer_name >", value, "bizMerName");
            return (Criteria) this;
        }

        public Criteria andBizMerNameGreaterThanOrEqualTo(String value) {
            addCriterion("biz_mer_name >=", value, "bizMerName");
            return (Criteria) this;
        }

        public Criteria andBizMerNameLessThan(String value) {
            addCriterion("biz_mer_name <", value, "bizMerName");
            return (Criteria) this;
        }

        public Criteria andBizMerNameLessThanOrEqualTo(String value) {
            addCriterion("biz_mer_name <=", value, "bizMerName");
            return (Criteria) this;
        }

        public Criteria andBizMerNameLike(String value) {
            addCriterion("biz_mer_name like", value, "bizMerName");
            return (Criteria) this;
        }

        public Criteria andBizMerNameNotLike(String value) {
            addCriterion("biz_mer_name not like", value, "bizMerName");
            return (Criteria) this;
        }

        public Criteria andBizMerNameIn(List<String> values) {
            addCriterion("biz_mer_name in", values, "bizMerName");
            return (Criteria) this;
        }

        public Criteria andBizMerNameNotIn(List<String> values) {
            addCriterion("biz_mer_name not in", values, "bizMerName");
            return (Criteria) this;
        }

        public Criteria andBizMerNameBetween(String value1, String value2) {
            addCriterion("biz_mer_name between", value1, value2, "bizMerName");
            return (Criteria) this;
        }

        public Criteria andBizMerNameNotBetween(String value1, String value2) {
            addCriterion("biz_mer_name not between", value1, value2, "bizMerName");
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

        public Criteria andMktSeqIsNull() {
            addCriterion("mkt_seq is null");
            return (Criteria) this;
        }

        public Criteria andMktSeqIsNotNull() {
            addCriterion("mkt_seq is not null");
            return (Criteria) this;
        }

        public Criteria andMktSeqEqualTo(Integer value) {
            addCriterion("mkt_seq =", value, "mktSeq");
            return (Criteria) this;
        }

        public Criteria andMktSeqNotEqualTo(Integer value) {
            addCriterion("mkt_seq <>", value, "mktSeq");
            return (Criteria) this;
        }

        public Criteria andMktSeqGreaterThan(Integer value) {
            addCriterion("mkt_seq >", value, "mktSeq");
            return (Criteria) this;
        }

        public Criteria andMktSeqGreaterThanOrEqualTo(Integer value) {
            addCriterion("mkt_seq >=", value, "mktSeq");
            return (Criteria) this;
        }

        public Criteria andMktSeqLessThan(Integer value) {
            addCriterion("mkt_seq <", value, "mktSeq");
            return (Criteria) this;
        }

        public Criteria andMktSeqLessThanOrEqualTo(Integer value) {
            addCriterion("mkt_seq <=", value, "mktSeq");
            return (Criteria) this;
        }

        public Criteria andMktSeqIn(List<Integer> values) {
            addCriterion("mkt_seq in", values, "mktSeq");
            return (Criteria) this;
        }

        public Criteria andMktSeqNotIn(List<Integer> values) {
            addCriterion("mkt_seq not in", values, "mktSeq");
            return (Criteria) this;
        }

        public Criteria andMktSeqBetween(Integer value1, Integer value2) {
            addCriterion("mkt_seq between", value1, value2, "mktSeq");
            return (Criteria) this;
        }

        public Criteria andMktSeqNotBetween(Integer value1, Integer value2) {
            addCriterion("mkt_seq not between", value1, value2, "mktSeq");
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

        public Criteria andKqIdLikeInsensitive(String value) {
            addCriterion("upper(kq_id) like", value.toUpperCase(), "kqId");
            return (Criteria) this;
        }

        public Criteria andNumberLikeInsensitive(String value) {
            addCriterion("upper(number) like", value.toUpperCase(), "number");
            return (Criteria) this;
        }

        public Criteria andUserNoLikeInsensitive(String value) {
            addCriterion("upper(user_no) like", value.toUpperCase(), "userNo");
            return (Criteria) this;
        }

        public Criteria andMerNoLikeInsensitive(String value) {
            addCriterion("upper(mer_no) like", value.toUpperCase(), "merNo");
            return (Criteria) this;
        }

        public Criteria andBizMerNameLikeInsensitive(String value) {
            addCriterion("upper(biz_mer_name) like", value.toUpperCase(), "bizMerName");
            return (Criteria) this;
        }

        public Criteria andExCodeLikeInsensitive(String value) {
            addCriterion("upper(ex_code) like", value.toUpperCase(), "exCode");
            return (Criteria) this;
        }

        public Criteria andFeeTypeLikeInsensitive(String value) {
            addCriterion("upper(fee_type) like", value.toUpperCase(), "feeType");
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