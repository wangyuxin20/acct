package com.wa.apiaccount.core.model.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AcctOdrCardJointlyKqExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AcctOdrCardJointlyKqExample() {
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

        public Criteria andKqExpIsNull() {
            addCriterion("kq_exp is null");
            return (Criteria) this;
        }

        public Criteria andKqExpIsNotNull() {
            addCriterion("kq_exp is not null");
            return (Criteria) this;
        }

        public Criteria andKqExpEqualTo(String value) {
            addCriterion("kq_exp =", value, "kqExp");
            return (Criteria) this;
        }

        public Criteria andKqExpNotEqualTo(String value) {
            addCriterion("kq_exp <>", value, "kqExp");
            return (Criteria) this;
        }

        public Criteria andKqExpGreaterThan(String value) {
            addCriterion("kq_exp >", value, "kqExp");
            return (Criteria) this;
        }

        public Criteria andKqExpGreaterThanOrEqualTo(String value) {
            addCriterion("kq_exp >=", value, "kqExp");
            return (Criteria) this;
        }

        public Criteria andKqExpLessThan(String value) {
            addCriterion("kq_exp <", value, "kqExp");
            return (Criteria) this;
        }

        public Criteria andKqExpLessThanOrEqualTo(String value) {
            addCriterion("kq_exp <=", value, "kqExp");
            return (Criteria) this;
        }

        public Criteria andKqExpLike(String value) {
            addCriterion("kq_exp like", value, "kqExp");
            return (Criteria) this;
        }

        public Criteria andKqExpNotLike(String value) {
            addCriterion("kq_exp not like", value, "kqExp");
            return (Criteria) this;
        }

        public Criteria andKqExpIn(List<String> values) {
            addCriterion("kq_exp in", values, "kqExp");
            return (Criteria) this;
        }

        public Criteria andKqExpNotIn(List<String> values) {
            addCriterion("kq_exp not in", values, "kqExp");
            return (Criteria) this;
        }

        public Criteria andKqExpBetween(String value1, String value2) {
            addCriterion("kq_exp between", value1, value2, "kqExp");
            return (Criteria) this;
        }

        public Criteria andKqExpNotBetween(String value1, String value2) {
            addCriterion("kq_exp not between", value1, value2, "kqExp");
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

        public Criteria andMerNameIsNull() {
            addCriterion("mer_name is null");
            return (Criteria) this;
        }

        public Criteria andMerNameIsNotNull() {
            addCriterion("mer_name is not null");
            return (Criteria) this;
        }

        public Criteria andMerNameEqualTo(String value) {
            addCriterion("mer_name =", value, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameNotEqualTo(String value) {
            addCriterion("mer_name <>", value, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameGreaterThan(String value) {
            addCriterion("mer_name >", value, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameGreaterThanOrEqualTo(String value) {
            addCriterion("mer_name >=", value, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameLessThan(String value) {
            addCriterion("mer_name <", value, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameLessThanOrEqualTo(String value) {
            addCriterion("mer_name <=", value, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameLike(String value) {
            addCriterion("mer_name like", value, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameNotLike(String value) {
            addCriterion("mer_name not like", value, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameIn(List<String> values) {
            addCriterion("mer_name in", values, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameNotIn(List<String> values) {
            addCriterion("mer_name not in", values, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameBetween(String value1, String value2) {
            addCriterion("mer_name between", value1, value2, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameNotBetween(String value1, String value2) {
            addCriterion("mer_name not between", value1, value2, "merName");
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

        public Criteria andSettleAmtIsNull() {
            addCriterion("settle_amt is null");
            return (Criteria) this;
        }

        public Criteria andSettleAmtIsNotNull() {
            addCriterion("settle_amt is not null");
            return (Criteria) this;
        }

        public Criteria andSettleAmtEqualTo(BigDecimal value) {
            addCriterion("settle_amt =", value, "settleAmt");
            return (Criteria) this;
        }

        public Criteria andSettleAmtNotEqualTo(BigDecimal value) {
            addCriterion("settle_amt <>", value, "settleAmt");
            return (Criteria) this;
        }

        public Criteria andSettleAmtGreaterThan(BigDecimal value) {
            addCriterion("settle_amt >", value, "settleAmt");
            return (Criteria) this;
        }

        public Criteria andSettleAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("settle_amt >=", value, "settleAmt");
            return (Criteria) this;
        }

        public Criteria andSettleAmtLessThan(BigDecimal value) {
            addCriterion("settle_amt <", value, "settleAmt");
            return (Criteria) this;
        }

        public Criteria andSettleAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("settle_amt <=", value, "settleAmt");
            return (Criteria) this;
        }

        public Criteria andSettleAmtIn(List<BigDecimal> values) {
            addCriterion("settle_amt in", values, "settleAmt");
            return (Criteria) this;
        }

        public Criteria andSettleAmtNotIn(List<BigDecimal> values) {
            addCriterion("settle_amt not in", values, "settleAmt");
            return (Criteria) this;
        }

        public Criteria andSettleAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("settle_amt between", value1, value2, "settleAmt");
            return (Criteria) this;
        }

        public Criteria andSettleAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("settle_amt not between", value1, value2, "settleAmt");
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

        public Criteria andSettleTypeIsNull() {
            addCriterion("settle_type is null");
            return (Criteria) this;
        }

        public Criteria andSettleTypeIsNotNull() {
            addCriterion("settle_type is not null");
            return (Criteria) this;
        }

        public Criteria andSettleTypeEqualTo(Integer value) {
            addCriterion("settle_type =", value, "settleType");
            return (Criteria) this;
        }

        public Criteria andSettleTypeNotEqualTo(Integer value) {
            addCriterion("settle_type <>", value, "settleType");
            return (Criteria) this;
        }

        public Criteria andSettleTypeGreaterThan(Integer value) {
            addCriterion("settle_type >", value, "settleType");
            return (Criteria) this;
        }

        public Criteria andSettleTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("settle_type >=", value, "settleType");
            return (Criteria) this;
        }

        public Criteria andSettleTypeLessThan(Integer value) {
            addCriterion("settle_type <", value, "settleType");
            return (Criteria) this;
        }

        public Criteria andSettleTypeLessThanOrEqualTo(Integer value) {
            addCriterion("settle_type <=", value, "settleType");
            return (Criteria) this;
        }

        public Criteria andSettleTypeIn(List<Integer> values) {
            addCriterion("settle_type in", values, "settleType");
            return (Criteria) this;
        }

        public Criteria andSettleTypeNotIn(List<Integer> values) {
            addCriterion("settle_type not in", values, "settleType");
            return (Criteria) this;
        }

        public Criteria andSettleTypeBetween(Integer value1, Integer value2) {
            addCriterion("settle_type between", value1, value2, "settleType");
            return (Criteria) this;
        }

        public Criteria andSettleTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("settle_type not between", value1, value2, "settleType");
            return (Criteria) this;
        }

        public Criteria andResvNumIsNull() {
            addCriterion("resv_num is null");
            return (Criteria) this;
        }

        public Criteria andResvNumIsNotNull() {
            addCriterion("resv_num is not null");
            return (Criteria) this;
        }

        public Criteria andResvNumEqualTo(Integer value) {
            addCriterion("resv_num =", value, "resvNum");
            return (Criteria) this;
        }

        public Criteria andResvNumNotEqualTo(Integer value) {
            addCriterion("resv_num <>", value, "resvNum");
            return (Criteria) this;
        }

        public Criteria andResvNumGreaterThan(Integer value) {
            addCriterion("resv_num >", value, "resvNum");
            return (Criteria) this;
        }

        public Criteria andResvNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("resv_num >=", value, "resvNum");
            return (Criteria) this;
        }

        public Criteria andResvNumLessThan(Integer value) {
            addCriterion("resv_num <", value, "resvNum");
            return (Criteria) this;
        }

        public Criteria andResvNumLessThanOrEqualTo(Integer value) {
            addCriterion("resv_num <=", value, "resvNum");
            return (Criteria) this;
        }

        public Criteria andResvNumIn(List<Integer> values) {
            addCriterion("resv_num in", values, "resvNum");
            return (Criteria) this;
        }

        public Criteria andResvNumNotIn(List<Integer> values) {
            addCriterion("resv_num not in", values, "resvNum");
            return (Criteria) this;
        }

        public Criteria andResvNumBetween(Integer value1, Integer value2) {
            addCriterion("resv_num between", value1, value2, "resvNum");
            return (Criteria) this;
        }

        public Criteria andResvNumNotBetween(Integer value1, Integer value2) {
            addCriterion("resv_num not between", value1, value2, "resvNum");
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

        public Criteria andFlowIdLikeInsensitive(String value) {
            addCriterion("upper(flow_id) like", value.toUpperCase(), "flowId");
            return (Criteria) this;
        }

        public Criteria andKqIdLikeInsensitive(String value) {
            addCriterion("upper(kq_id) like", value.toUpperCase(), "kqId");
            return (Criteria) this;
        }

        public Criteria andKqExpLikeInsensitive(String value) {
            addCriterion("upper(kq_exp) like", value.toUpperCase(), "kqExp");
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

        public Criteria andMerNameLikeInsensitive(String value) {
            addCriterion("upper(mer_name) like", value.toUpperCase(), "merName");
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

        public Criteria andTranCodeLikeInsensitive(String value) {
            addCriterion("upper(tran_code) like", value.toUpperCase(), "tranCode");
            return (Criteria) this;
        }

        public Criteria andAcctDateLikeInsensitive(String value) {
            addCriterion("upper(acct_date) like", value.toUpperCase(), "acctDate");
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