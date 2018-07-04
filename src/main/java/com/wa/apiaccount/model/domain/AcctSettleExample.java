package com.wd.apiaccount.model.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AcctSettleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AcctSettleExample() {
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

        public Criteria andSettleFlowIdIsNull() {
            addCriterion("settle_flow_id is null");
            return (Criteria) this;
        }

        public Criteria andSettleFlowIdIsNotNull() {
            addCriterion("settle_flow_id is not null");
            return (Criteria) this;
        }

        public Criteria andSettleFlowIdEqualTo(Long value) {
            addCriterion("settle_flow_id =", value, "settleFlowId");
            return (Criteria) this;
        }

        public Criteria andSettleFlowIdNotEqualTo(Long value) {
            addCriterion("settle_flow_id <>", value, "settleFlowId");
            return (Criteria) this;
        }

        public Criteria andSettleFlowIdGreaterThan(Long value) {
            addCriterion("settle_flow_id >", value, "settleFlowId");
            return (Criteria) this;
        }

        public Criteria andSettleFlowIdGreaterThanOrEqualTo(Long value) {
            addCriterion("settle_flow_id >=", value, "settleFlowId");
            return (Criteria) this;
        }

        public Criteria andSettleFlowIdLessThan(Long value) {
            addCriterion("settle_flow_id <", value, "settleFlowId");
            return (Criteria) this;
        }

        public Criteria andSettleFlowIdLessThanOrEqualTo(Long value) {
            addCriterion("settle_flow_id <=", value, "settleFlowId");
            return (Criteria) this;
        }

        public Criteria andSettleFlowIdIn(List<Long> values) {
            addCriterion("settle_flow_id in", values, "settleFlowId");
            return (Criteria) this;
        }

        public Criteria andSettleFlowIdNotIn(List<Long> values) {
            addCriterion("settle_flow_id not in", values, "settleFlowId");
            return (Criteria) this;
        }

        public Criteria andSettleFlowIdBetween(Long value1, Long value2) {
            addCriterion("settle_flow_id between", value1, value2, "settleFlowId");
            return (Criteria) this;
        }

        public Criteria andSettleFlowIdNotBetween(Long value1, Long value2) {
            addCriterion("settle_flow_id not between", value1, value2, "settleFlowId");
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

        public Criteria andExTypeIsNull() {
            addCriterion("ex_type is null");
            return (Criteria) this;
        }

        public Criteria andExTypeIsNotNull() {
            addCriterion("ex_type is not null");
            return (Criteria) this;
        }

        public Criteria andExTypeEqualTo(String value) {
            addCriterion("ex_type =", value, "exType");
            return (Criteria) this;
        }

        public Criteria andExTypeNotEqualTo(String value) {
            addCriterion("ex_type <>", value, "exType");
            return (Criteria) this;
        }

        public Criteria andExTypeGreaterThan(String value) {
            addCriterion("ex_type >", value, "exType");
            return (Criteria) this;
        }

        public Criteria andExTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ex_type >=", value, "exType");
            return (Criteria) this;
        }

        public Criteria andExTypeLessThan(String value) {
            addCriterion("ex_type <", value, "exType");
            return (Criteria) this;
        }

        public Criteria andExTypeLessThanOrEqualTo(String value) {
            addCriterion("ex_type <=", value, "exType");
            return (Criteria) this;
        }

        public Criteria andExTypeLike(String value) {
            addCriterion("ex_type like", value, "exType");
            return (Criteria) this;
        }

        public Criteria andExTypeNotLike(String value) {
            addCriterion("ex_type not like", value, "exType");
            return (Criteria) this;
        }

        public Criteria andExTypeIn(List<String> values) {
            addCriterion("ex_type in", values, "exType");
            return (Criteria) this;
        }

        public Criteria andExTypeNotIn(List<String> values) {
            addCriterion("ex_type not in", values, "exType");
            return (Criteria) this;
        }

        public Criteria andExTypeBetween(String value1, String value2) {
            addCriterion("ex_type between", value1, value2, "exType");
            return (Criteria) this;
        }

        public Criteria andExTypeNotBetween(String value1, String value2) {
            addCriterion("ex_type not between", value1, value2, "exType");
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

        public Criteria andRpTypeIsNull() {
            addCriterion("rp_type is null");
            return (Criteria) this;
        }

        public Criteria andRpTypeIsNotNull() {
            addCriterion("rp_type is not null");
            return (Criteria) this;
        }

        public Criteria andRpTypeEqualTo(String value) {
            addCriterion("rp_type =", value, "rpType");
            return (Criteria) this;
        }

        public Criteria andRpTypeNotEqualTo(String value) {
            addCriterion("rp_type <>", value, "rpType");
            return (Criteria) this;
        }

        public Criteria andRpTypeGreaterThan(String value) {
            addCriterion("rp_type >", value, "rpType");
            return (Criteria) this;
        }

        public Criteria andRpTypeGreaterThanOrEqualTo(String value) {
            addCriterion("rp_type >=", value, "rpType");
            return (Criteria) this;
        }

        public Criteria andRpTypeLessThan(String value) {
            addCriterion("rp_type <", value, "rpType");
            return (Criteria) this;
        }

        public Criteria andRpTypeLessThanOrEqualTo(String value) {
            addCriterion("rp_type <=", value, "rpType");
            return (Criteria) this;
        }

        public Criteria andRpTypeLike(String value) {
            addCriterion("rp_type like", value, "rpType");
            return (Criteria) this;
        }

        public Criteria andRpTypeNotLike(String value) {
            addCriterion("rp_type not like", value, "rpType");
            return (Criteria) this;
        }

        public Criteria andRpTypeIn(List<String> values) {
            addCriterion("rp_type in", values, "rpType");
            return (Criteria) this;
        }

        public Criteria andRpTypeNotIn(List<String> values) {
            addCriterion("rp_type not in", values, "rpType");
            return (Criteria) this;
        }

        public Criteria andRpTypeBetween(String value1, String value2) {
            addCriterion("rp_type between", value1, value2, "rpType");
            return (Criteria) this;
        }

        public Criteria andRpTypeNotBetween(String value1, String value2) {
            addCriterion("rp_type not between", value1, value2, "rpType");
            return (Criteria) this;
        }

        public Criteria andMerIdIsNull() {
            addCriterion("mer_id is null");
            return (Criteria) this;
        }

        public Criteria andMerIdIsNotNull() {
            addCriterion("mer_id is not null");
            return (Criteria) this;
        }

        public Criteria andMerIdEqualTo(String value) {
            addCriterion("mer_id =", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdNotEqualTo(String value) {
            addCriterion("mer_id <>", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdGreaterThan(String value) {
            addCriterion("mer_id >", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdGreaterThanOrEqualTo(String value) {
            addCriterion("mer_id >=", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdLessThan(String value) {
            addCriterion("mer_id <", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdLessThanOrEqualTo(String value) {
            addCriterion("mer_id <=", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdLike(String value) {
            addCriterion("mer_id like", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdNotLike(String value) {
            addCriterion("mer_id not like", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdIn(List<String> values) {
            addCriterion("mer_id in", values, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdNotIn(List<String> values) {
            addCriterion("mer_id not in", values, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdBetween(String value1, String value2) {
            addCriterion("mer_id between", value1, value2, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdNotBetween(String value1, String value2) {
            addCriterion("mer_id not between", value1, value2, "merId");
            return (Criteria) this;
        }

        public Criteria andMerOfsIsNull() {
            addCriterion("mer_ofs is null");
            return (Criteria) this;
        }

        public Criteria andMerOfsIsNotNull() {
            addCriterion("mer_ofs is not null");
            return (Criteria) this;
        }

        public Criteria andMerOfsEqualTo(String value) {
            addCriterion("mer_ofs =", value, "merOfs");
            return (Criteria) this;
        }

        public Criteria andMerOfsNotEqualTo(String value) {
            addCriterion("mer_ofs <>", value, "merOfs");
            return (Criteria) this;
        }

        public Criteria andMerOfsGreaterThan(String value) {
            addCriterion("mer_ofs >", value, "merOfs");
            return (Criteria) this;
        }

        public Criteria andMerOfsGreaterThanOrEqualTo(String value) {
            addCriterion("mer_ofs >=", value, "merOfs");
            return (Criteria) this;
        }

        public Criteria andMerOfsLessThan(String value) {
            addCriterion("mer_ofs <", value, "merOfs");
            return (Criteria) this;
        }

        public Criteria andMerOfsLessThanOrEqualTo(String value) {
            addCriterion("mer_ofs <=", value, "merOfs");
            return (Criteria) this;
        }

        public Criteria andMerOfsLike(String value) {
            addCriterion("mer_ofs like", value, "merOfs");
            return (Criteria) this;
        }

        public Criteria andMerOfsNotLike(String value) {
            addCriterion("mer_ofs not like", value, "merOfs");
            return (Criteria) this;
        }

        public Criteria andMerOfsIn(List<String> values) {
            addCriterion("mer_ofs in", values, "merOfs");
            return (Criteria) this;
        }

        public Criteria andMerOfsNotIn(List<String> values) {
            addCriterion("mer_ofs not in", values, "merOfs");
            return (Criteria) this;
        }

        public Criteria andMerOfsBetween(String value1, String value2) {
            addCriterion("mer_ofs between", value1, value2, "merOfs");
            return (Criteria) this;
        }

        public Criteria andMerOfsNotBetween(String value1, String value2) {
            addCriterion("mer_ofs not between", value1, value2, "merOfs");
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

        public Criteria andGoodsNumIsNull() {
            addCriterion("goods_num is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNumIsNotNull() {
            addCriterion("goods_num is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNumEqualTo(BigDecimal value) {
            addCriterion("goods_num =", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumNotEqualTo(BigDecimal value) {
            addCriterion("goods_num <>", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumGreaterThan(BigDecimal value) {
            addCriterion("goods_num >", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_num >=", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumLessThan(BigDecimal value) {
            addCriterion("goods_num <", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_num <=", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumIn(List<BigDecimal> values) {
            addCriterion("goods_num in", values, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumNotIn(List<BigDecimal> values) {
            addCriterion("goods_num not in", values, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_num between", value1, value2, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_num not between", value1, value2, "goodsNum");
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

        public Criteria andSettleStartDateIsNull() {
            addCriterion("settle_start_date is null");
            return (Criteria) this;
        }

        public Criteria andSettleStartDateIsNotNull() {
            addCriterion("settle_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andSettleStartDateEqualTo(String value) {
            addCriterion("settle_start_date =", value, "settleStartDate");
            return (Criteria) this;
        }

        public Criteria andSettleStartDateNotEqualTo(String value) {
            addCriterion("settle_start_date <>", value, "settleStartDate");
            return (Criteria) this;
        }

        public Criteria andSettleStartDateGreaterThan(String value) {
            addCriterion("settle_start_date >", value, "settleStartDate");
            return (Criteria) this;
        }

        public Criteria andSettleStartDateGreaterThanOrEqualTo(String value) {
            addCriterion("settle_start_date >=", value, "settleStartDate");
            return (Criteria) this;
        }

        public Criteria andSettleStartDateLessThan(String value) {
            addCriterion("settle_start_date <", value, "settleStartDate");
            return (Criteria) this;
        }

        public Criteria andSettleStartDateLessThanOrEqualTo(String value) {
            addCriterion("settle_start_date <=", value, "settleStartDate");
            return (Criteria) this;
        }

        public Criteria andSettleStartDateLike(String value) {
            addCriterion("settle_start_date like", value, "settleStartDate");
            return (Criteria) this;
        }

        public Criteria andSettleStartDateNotLike(String value) {
            addCriterion("settle_start_date not like", value, "settleStartDate");
            return (Criteria) this;
        }

        public Criteria andSettleStartDateIn(List<String> values) {
            addCriterion("settle_start_date in", values, "settleStartDate");
            return (Criteria) this;
        }

        public Criteria andSettleStartDateNotIn(List<String> values) {
            addCriterion("settle_start_date not in", values, "settleStartDate");
            return (Criteria) this;
        }

        public Criteria andSettleStartDateBetween(String value1, String value2) {
            addCriterion("settle_start_date between", value1, value2, "settleStartDate");
            return (Criteria) this;
        }

        public Criteria andSettleStartDateNotBetween(String value1, String value2) {
            addCriterion("settle_start_date not between", value1, value2, "settleStartDate");
            return (Criteria) this;
        }

        public Criteria andSettleEndDateIsNull() {
            addCriterion("settle_end_date is null");
            return (Criteria) this;
        }

        public Criteria andSettleEndDateIsNotNull() {
            addCriterion("settle_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andSettleEndDateEqualTo(String value) {
            addCriterion("settle_end_date =", value, "settleEndDate");
            return (Criteria) this;
        }

        public Criteria andSettleEndDateNotEqualTo(String value) {
            addCriterion("settle_end_date <>", value, "settleEndDate");
            return (Criteria) this;
        }

        public Criteria andSettleEndDateGreaterThan(String value) {
            addCriterion("settle_end_date >", value, "settleEndDate");
            return (Criteria) this;
        }

        public Criteria andSettleEndDateGreaterThanOrEqualTo(String value) {
            addCriterion("settle_end_date >=", value, "settleEndDate");
            return (Criteria) this;
        }

        public Criteria andSettleEndDateLessThan(String value) {
            addCriterion("settle_end_date <", value, "settleEndDate");
            return (Criteria) this;
        }

        public Criteria andSettleEndDateLessThanOrEqualTo(String value) {
            addCriterion("settle_end_date <=", value, "settleEndDate");
            return (Criteria) this;
        }

        public Criteria andSettleEndDateLike(String value) {
            addCriterion("settle_end_date like", value, "settleEndDate");
            return (Criteria) this;
        }

        public Criteria andSettleEndDateNotLike(String value) {
            addCriterion("settle_end_date not like", value, "settleEndDate");
            return (Criteria) this;
        }

        public Criteria andSettleEndDateIn(List<String> values) {
            addCriterion("settle_end_date in", values, "settleEndDate");
            return (Criteria) this;
        }

        public Criteria andSettleEndDateNotIn(List<String> values) {
            addCriterion("settle_end_date not in", values, "settleEndDate");
            return (Criteria) this;
        }

        public Criteria andSettleEndDateBetween(String value1, String value2) {
            addCriterion("settle_end_date between", value1, value2, "settleEndDate");
            return (Criteria) this;
        }

        public Criteria andSettleEndDateNotBetween(String value1, String value2) {
            addCriterion("settle_end_date not between", value1, value2, "settleEndDate");
            return (Criteria) this;
        }

        public Criteria andAuditerIsNull() {
            addCriterion("auditer is null");
            return (Criteria) this;
        }

        public Criteria andAuditerIsNotNull() {
            addCriterion("auditer is not null");
            return (Criteria) this;
        }

        public Criteria andAuditerEqualTo(String value) {
            addCriterion("auditer =", value, "auditer");
            return (Criteria) this;
        }

        public Criteria andAuditerNotEqualTo(String value) {
            addCriterion("auditer <>", value, "auditer");
            return (Criteria) this;
        }

        public Criteria andAuditerGreaterThan(String value) {
            addCriterion("auditer >", value, "auditer");
            return (Criteria) this;
        }

        public Criteria andAuditerGreaterThanOrEqualTo(String value) {
            addCriterion("auditer >=", value, "auditer");
            return (Criteria) this;
        }

        public Criteria andAuditerLessThan(String value) {
            addCriterion("auditer <", value, "auditer");
            return (Criteria) this;
        }

        public Criteria andAuditerLessThanOrEqualTo(String value) {
            addCriterion("auditer <=", value, "auditer");
            return (Criteria) this;
        }

        public Criteria andAuditerLike(String value) {
            addCriterion("auditer like", value, "auditer");
            return (Criteria) this;
        }

        public Criteria andAuditerNotLike(String value) {
            addCriterion("auditer not like", value, "auditer");
            return (Criteria) this;
        }

        public Criteria andAuditerIn(List<String> values) {
            addCriterion("auditer in", values, "auditer");
            return (Criteria) this;
        }

        public Criteria andAuditerNotIn(List<String> values) {
            addCriterion("auditer not in", values, "auditer");
            return (Criteria) this;
        }

        public Criteria andAuditerBetween(String value1, String value2) {
            addCriterion("auditer between", value1, value2, "auditer");
            return (Criteria) this;
        }

        public Criteria andAuditerNotBetween(String value1, String value2) {
            addCriterion("auditer not between", value1, value2, "auditer");
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

        public Criteria andSettleBillIdsIsNull() {
            addCriterion("settle_bill_ids is null");
            return (Criteria) this;
        }

        public Criteria andSettleBillIdsIsNotNull() {
            addCriterion("settle_bill_ids is not null");
            return (Criteria) this;
        }

        public Criteria andSettleBillIdsEqualTo(String value) {
            addCriterion("settle_bill_ids =", value, "settleBillIds");
            return (Criteria) this;
        }

        public Criteria andSettleBillIdsNotEqualTo(String value) {
            addCriterion("settle_bill_ids <>", value, "settleBillIds");
            return (Criteria) this;
        }

        public Criteria andSettleBillIdsGreaterThan(String value) {
            addCriterion("settle_bill_ids >", value, "settleBillIds");
            return (Criteria) this;
        }

        public Criteria andSettleBillIdsGreaterThanOrEqualTo(String value) {
            addCriterion("settle_bill_ids >=", value, "settleBillIds");
            return (Criteria) this;
        }

        public Criteria andSettleBillIdsLessThan(String value) {
            addCriterion("settle_bill_ids <", value, "settleBillIds");
            return (Criteria) this;
        }

        public Criteria andSettleBillIdsLessThanOrEqualTo(String value) {
            addCriterion("settle_bill_ids <=", value, "settleBillIds");
            return (Criteria) this;
        }

        public Criteria andSettleBillIdsLike(String value) {
            addCriterion("settle_bill_ids like", value, "settleBillIds");
            return (Criteria) this;
        }

        public Criteria andSettleBillIdsNotLike(String value) {
            addCriterion("settle_bill_ids not like", value, "settleBillIds");
            return (Criteria) this;
        }

        public Criteria andSettleBillIdsIn(List<String> values) {
            addCriterion("settle_bill_ids in", values, "settleBillIds");
            return (Criteria) this;
        }

        public Criteria andSettleBillIdsNotIn(List<String> values) {
            addCriterion("settle_bill_ids not in", values, "settleBillIds");
            return (Criteria) this;
        }

        public Criteria andSettleBillIdsBetween(String value1, String value2) {
            addCriterion("settle_bill_ids between", value1, value2, "settleBillIds");
            return (Criteria) this;
        }

        public Criteria andSettleBillIdsNotBetween(String value1, String value2) {
            addCriterion("settle_bill_ids not between", value1, value2, "settleBillIds");
            return (Criteria) this;
        }

        public Criteria andDrSettleIdIsNull() {
            addCriterion("dr_settle_id is null");
            return (Criteria) this;
        }

        public Criteria andDrSettleIdIsNotNull() {
            addCriterion("dr_settle_id is not null");
            return (Criteria) this;
        }

        public Criteria andDrSettleIdEqualTo(String value) {
            addCriterion("dr_settle_id =", value, "drSettleId");
            return (Criteria) this;
        }

        public Criteria andDrSettleIdNotEqualTo(String value) {
            addCriterion("dr_settle_id <>", value, "drSettleId");
            return (Criteria) this;
        }

        public Criteria andDrSettleIdGreaterThan(String value) {
            addCriterion("dr_settle_id >", value, "drSettleId");
            return (Criteria) this;
        }

        public Criteria andDrSettleIdGreaterThanOrEqualTo(String value) {
            addCriterion("dr_settle_id >=", value, "drSettleId");
            return (Criteria) this;
        }

        public Criteria andDrSettleIdLessThan(String value) {
            addCriterion("dr_settle_id <", value, "drSettleId");
            return (Criteria) this;
        }

        public Criteria andDrSettleIdLessThanOrEqualTo(String value) {
            addCriterion("dr_settle_id <=", value, "drSettleId");
            return (Criteria) this;
        }

        public Criteria andDrSettleIdLike(String value) {
            addCriterion("dr_settle_id like", value, "drSettleId");
            return (Criteria) this;
        }

        public Criteria andDrSettleIdNotLike(String value) {
            addCriterion("dr_settle_id not like", value, "drSettleId");
            return (Criteria) this;
        }

        public Criteria andDrSettleIdIn(List<String> values) {
            addCriterion("dr_settle_id in", values, "drSettleId");
            return (Criteria) this;
        }

        public Criteria andDrSettleIdNotIn(List<String> values) {
            addCriterion("dr_settle_id not in", values, "drSettleId");
            return (Criteria) this;
        }

        public Criteria andDrSettleIdBetween(String value1, String value2) {
            addCriterion("dr_settle_id between", value1, value2, "drSettleId");
            return (Criteria) this;
        }

        public Criteria andDrSettleIdNotBetween(String value1, String value2) {
            addCriterion("dr_settle_id not between", value1, value2, "drSettleId");
            return (Criteria) this;
        }

        public Criteria andPayChnlIsNull() {
            addCriterion("pay_chnl is null");
            return (Criteria) this;
        }

        public Criteria andPayChnlIsNotNull() {
            addCriterion("pay_chnl is not null");
            return (Criteria) this;
        }

        public Criteria andPayChnlEqualTo(String value) {
            addCriterion("pay_chnl =", value, "payChnl");
            return (Criteria) this;
        }

        public Criteria andPayChnlNotEqualTo(String value) {
            addCriterion("pay_chnl <>", value, "payChnl");
            return (Criteria) this;
        }

        public Criteria andPayChnlGreaterThan(String value) {
            addCriterion("pay_chnl >", value, "payChnl");
            return (Criteria) this;
        }

        public Criteria andPayChnlGreaterThanOrEqualTo(String value) {
            addCriterion("pay_chnl >=", value, "payChnl");
            return (Criteria) this;
        }

        public Criteria andPayChnlLessThan(String value) {
            addCriterion("pay_chnl <", value, "payChnl");
            return (Criteria) this;
        }

        public Criteria andPayChnlLessThanOrEqualTo(String value) {
            addCriterion("pay_chnl <=", value, "payChnl");
            return (Criteria) this;
        }

        public Criteria andPayChnlLike(String value) {
            addCriterion("pay_chnl like", value, "payChnl");
            return (Criteria) this;
        }

        public Criteria andPayChnlNotLike(String value) {
            addCriterion("pay_chnl not like", value, "payChnl");
            return (Criteria) this;
        }

        public Criteria andPayChnlIn(List<String> values) {
            addCriterion("pay_chnl in", values, "payChnl");
            return (Criteria) this;
        }

        public Criteria andPayChnlNotIn(List<String> values) {
            addCriterion("pay_chnl not in", values, "payChnl");
            return (Criteria) this;
        }

        public Criteria andPayChnlBetween(String value1, String value2) {
            addCriterion("pay_chnl between", value1, value2, "payChnl");
            return (Criteria) this;
        }

        public Criteria andPayChnlNotBetween(String value1, String value2) {
            addCriterion("pay_chnl not between", value1, value2, "payChnl");
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

        public Criteria andTranCodeLikeInsensitive(String value) {
            addCriterion("upper(tran_code) like", value.toUpperCase(), "tranCode");
            return (Criteria) this;
        }

        public Criteria andExTypeLikeInsensitive(String value) {
            addCriterion("upper(ex_type) like", value.toUpperCase(), "exType");
            return (Criteria) this;
        }

        public Criteria andCurrNoLikeInsensitive(String value) {
            addCriterion("upper(curr_no) like", value.toUpperCase(), "currNo");
            return (Criteria) this;
        }

        public Criteria andRpTypeLikeInsensitive(String value) {
            addCriterion("upper(rp_type) like", value.toUpperCase(), "rpType");
            return (Criteria) this;
        }

        public Criteria andMerIdLikeInsensitive(String value) {
            addCriterion("upper(mer_id) like", value.toUpperCase(), "merId");
            return (Criteria) this;
        }

        public Criteria andMerOfsLikeInsensitive(String value) {
            addCriterion("upper(mer_ofs) like", value.toUpperCase(), "merOfs");
            return (Criteria) this;
        }

        public Criteria andAcctDateLikeInsensitive(String value) {
            addCriterion("upper(acct_date) like", value.toUpperCase(), "acctDate");
            return (Criteria) this;
        }

        public Criteria andSettleStartDateLikeInsensitive(String value) {
            addCriterion("upper(settle_start_date) like", value.toUpperCase(), "settleStartDate");
            return (Criteria) this;
        }

        public Criteria andSettleEndDateLikeInsensitive(String value) {
            addCriterion("upper(settle_end_date) like", value.toUpperCase(), "settleEndDate");
            return (Criteria) this;
        }

        public Criteria andAuditerLikeInsensitive(String value) {
            addCriterion("upper(auditer) like", value.toUpperCase(), "auditer");
            return (Criteria) this;
        }

        public Criteria andSettleBillIdsLikeInsensitive(String value) {
            addCriterion("upper(settle_bill_ids) like", value.toUpperCase(), "settleBillIds");
            return (Criteria) this;
        }

        public Criteria andDrSettleIdLikeInsensitive(String value) {
            addCriterion("upper(dr_settle_id) like", value.toUpperCase(), "drSettleId");
            return (Criteria) this;
        }

        public Criteria andPayChnlLikeInsensitive(String value) {
            addCriterion("upper(pay_chnl) like", value.toUpperCase(), "payChnl");
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