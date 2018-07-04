package com.wa.apiaccount.core.model.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AcctOdrPointsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AcctOdrPointsExample() {
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

        public Criteria andFlowIdEqualTo(Long value) {
            addCriterion("flow_id =", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdNotEqualTo(Long value) {
            addCriterion("flow_id <>", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdGreaterThan(Long value) {
            addCriterion("flow_id >", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdGreaterThanOrEqualTo(Long value) {
            addCriterion("flow_id >=", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdLessThan(Long value) {
            addCriterion("flow_id <", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdLessThanOrEqualTo(Long value) {
            addCriterion("flow_id <=", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdIn(List<Long> values) {
            addCriterion("flow_id in", values, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdNotIn(List<Long> values) {
            addCriterion("flow_id not in", values, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdBetween(Long value1, Long value2) {
            addCriterion("flow_id between", value1, value2, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdNotBetween(Long value1, Long value2) {
            addCriterion("flow_id not between", value1, value2, "flowId");
            return (Criteria) this;
        }

        public Criteria andOdrNoIsNull() {
            addCriterion("odr_no is null");
            return (Criteria) this;
        }

        public Criteria andOdrNoIsNotNull() {
            addCriterion("odr_no is not null");
            return (Criteria) this;
        }

        public Criteria andOdrNoEqualTo(String value) {
            addCriterion("odr_no =", value, "odrNo");
            return (Criteria) this;
        }

        public Criteria andOdrNoNotEqualTo(String value) {
            addCriterion("odr_no <>", value, "odrNo");
            return (Criteria) this;
        }

        public Criteria andOdrNoGreaterThan(String value) {
            addCriterion("odr_no >", value, "odrNo");
            return (Criteria) this;
        }

        public Criteria andOdrNoGreaterThanOrEqualTo(String value) {
            addCriterion("odr_no >=", value, "odrNo");
            return (Criteria) this;
        }

        public Criteria andOdrNoLessThan(String value) {
            addCriterion("odr_no <", value, "odrNo");
            return (Criteria) this;
        }

        public Criteria andOdrNoLessThanOrEqualTo(String value) {
            addCriterion("odr_no <=", value, "odrNo");
            return (Criteria) this;
        }

        public Criteria andOdrNoLike(String value) {
            addCriterion("odr_no like", value, "odrNo");
            return (Criteria) this;
        }

        public Criteria andOdrNoNotLike(String value) {
            addCriterion("odr_no not like", value, "odrNo");
            return (Criteria) this;
        }

        public Criteria andOdrNoIn(List<String> values) {
            addCriterion("odr_no in", values, "odrNo");
            return (Criteria) this;
        }

        public Criteria andOdrNoNotIn(List<String> values) {
            addCriterion("odr_no not in", values, "odrNo");
            return (Criteria) this;
        }

        public Criteria andOdrNoBetween(String value1, String value2) {
            addCriterion("odr_no between", value1, value2, "odrNo");
            return (Criteria) this;
        }

        public Criteria andOdrNoNotBetween(String value1, String value2) {
            addCriterion("odr_no not between", value1, value2, "odrNo");
            return (Criteria) this;
        }

        public Criteria andOdrChIsNull() {
            addCriterion("odr_ch is null");
            return (Criteria) this;
        }

        public Criteria andOdrChIsNotNull() {
            addCriterion("odr_ch is not null");
            return (Criteria) this;
        }

        public Criteria andOdrChEqualTo(String value) {
            addCriterion("odr_ch =", value, "odrCh");
            return (Criteria) this;
        }

        public Criteria andOdrChNotEqualTo(String value) {
            addCriterion("odr_ch <>", value, "odrCh");
            return (Criteria) this;
        }

        public Criteria andOdrChGreaterThan(String value) {
            addCriterion("odr_ch >", value, "odrCh");
            return (Criteria) this;
        }

        public Criteria andOdrChGreaterThanOrEqualTo(String value) {
            addCriterion("odr_ch >=", value, "odrCh");
            return (Criteria) this;
        }

        public Criteria andOdrChLessThan(String value) {
            addCriterion("odr_ch <", value, "odrCh");
            return (Criteria) this;
        }

        public Criteria andOdrChLessThanOrEqualTo(String value) {
            addCriterion("odr_ch <=", value, "odrCh");
            return (Criteria) this;
        }

        public Criteria andOdrChLike(String value) {
            addCriterion("odr_ch like", value, "odrCh");
            return (Criteria) this;
        }

        public Criteria andOdrChNotLike(String value) {
            addCriterion("odr_ch not like", value, "odrCh");
            return (Criteria) this;
        }

        public Criteria andOdrChIn(List<String> values) {
            addCriterion("odr_ch in", values, "odrCh");
            return (Criteria) this;
        }

        public Criteria andOdrChNotIn(List<String> values) {
            addCriterion("odr_ch not in", values, "odrCh");
            return (Criteria) this;
        }

        public Criteria andOdrChBetween(String value1, String value2) {
            addCriterion("odr_ch between", value1, value2, "odrCh");
            return (Criteria) this;
        }

        public Criteria andOdrChNotBetween(String value1, String value2) {
            addCriterion("odr_ch not between", value1, value2, "odrCh");
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

        public Criteria andErrMessageIsNull() {
            addCriterion("err_message is null");
            return (Criteria) this;
        }

        public Criteria andErrMessageIsNotNull() {
            addCriterion("err_message is not null");
            return (Criteria) this;
        }

        public Criteria andErrMessageEqualTo(String value) {
            addCriterion("err_message =", value, "errMessage");
            return (Criteria) this;
        }

        public Criteria andErrMessageNotEqualTo(String value) {
            addCriterion("err_message <>", value, "errMessage");
            return (Criteria) this;
        }

        public Criteria andErrMessageGreaterThan(String value) {
            addCriterion("err_message >", value, "errMessage");
            return (Criteria) this;
        }

        public Criteria andErrMessageGreaterThanOrEqualTo(String value) {
            addCriterion("err_message >=", value, "errMessage");
            return (Criteria) this;
        }

        public Criteria andErrMessageLessThan(String value) {
            addCriterion("err_message <", value, "errMessage");
            return (Criteria) this;
        }

        public Criteria andErrMessageLessThanOrEqualTo(String value) {
            addCriterion("err_message <=", value, "errMessage");
            return (Criteria) this;
        }

        public Criteria andErrMessageLike(String value) {
            addCriterion("err_message like", value, "errMessage");
            return (Criteria) this;
        }

        public Criteria andErrMessageNotLike(String value) {
            addCriterion("err_message not like", value, "errMessage");
            return (Criteria) this;
        }

        public Criteria andErrMessageIn(List<String> values) {
            addCriterion("err_message in", values, "errMessage");
            return (Criteria) this;
        }

        public Criteria andErrMessageNotIn(List<String> values) {
            addCriterion("err_message not in", values, "errMessage");
            return (Criteria) this;
        }

        public Criteria andErrMessageBetween(String value1, String value2) {
            addCriterion("err_message between", value1, value2, "errMessage");
            return (Criteria) this;
        }

        public Criteria andErrMessageNotBetween(String value1, String value2) {
            addCriterion("err_message not between", value1, value2, "errMessage");
            return (Criteria) this;
        }

        public Criteria andOdrNoLikeInsensitive(String value) {
            addCriterion("upper(odr_no) like", value.toUpperCase(), "odrNo");
            return (Criteria) this;
        }

        public Criteria andOdrChLikeInsensitive(String value) {
            addCriterion("upper(odr_ch) like", value.toUpperCase(), "odrCh");
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

        public Criteria andExTypeLikeInsensitive(String value) {
            addCriterion("upper(ex_type) like", value.toUpperCase(), "exType");
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

        public Criteria andErrMessageLikeInsensitive(String value) {
            addCriterion("upper(err_message) like", value.toUpperCase(), "errMessage");
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