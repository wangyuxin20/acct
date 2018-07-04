package com.wd.apiaccount.model.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SettlePactProfitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SettlePactProfitExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andBusinessTypeIsNull() {
            addCriterion("business_type is null");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIsNotNull() {
            addCriterion("business_type is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeEqualTo(String value) {
            addCriterion("business_type =", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotEqualTo(String value) {
            addCriterion("business_type <>", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeGreaterThan(String value) {
            addCriterion("business_type >", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeGreaterThanOrEqualTo(String value) {
            addCriterion("business_type >=", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLessThan(String value) {
            addCriterion("business_type <", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLessThanOrEqualTo(String value) {
            addCriterion("business_type <=", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLike(String value) {
            addCriterion("business_type like", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotLike(String value) {
            addCriterion("business_type not like", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIn(List<String> values) {
            addCriterion("business_type in", values, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotIn(List<String> values) {
            addCriterion("business_type not in", values, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeBetween(String value1, String value2) {
            addCriterion("business_type between", value1, value2, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotBetween(String value1, String value2) {
            addCriterion("business_type not between", value1, value2, "businessType");
            return (Criteria) this;
        }

        public Criteria andAgreementCodeIsNull() {
            addCriterion("agreement_code is null");
            return (Criteria) this;
        }

        public Criteria andAgreementCodeIsNotNull() {
            addCriterion("agreement_code is not null");
            return (Criteria) this;
        }

        public Criteria andAgreementCodeEqualTo(String value) {
            addCriterion("agreement_code =", value, "agreementCode");
            return (Criteria) this;
        }

        public Criteria andAgreementCodeNotEqualTo(String value) {
            addCriterion("agreement_code <>", value, "agreementCode");
            return (Criteria) this;
        }

        public Criteria andAgreementCodeGreaterThan(String value) {
            addCriterion("agreement_code >", value, "agreementCode");
            return (Criteria) this;
        }

        public Criteria andAgreementCodeGreaterThanOrEqualTo(String value) {
            addCriterion("agreement_code >=", value, "agreementCode");
            return (Criteria) this;
        }

        public Criteria andAgreementCodeLessThan(String value) {
            addCriterion("agreement_code <", value, "agreementCode");
            return (Criteria) this;
        }

        public Criteria andAgreementCodeLessThanOrEqualTo(String value) {
            addCriterion("agreement_code <=", value, "agreementCode");
            return (Criteria) this;
        }

        public Criteria andAgreementCodeLike(String value) {
            addCriterion("agreement_code like", value, "agreementCode");
            return (Criteria) this;
        }

        public Criteria andAgreementCodeNotLike(String value) {
            addCriterion("agreement_code not like", value, "agreementCode");
            return (Criteria) this;
        }

        public Criteria andAgreementCodeIn(List<String> values) {
            addCriterion("agreement_code in", values, "agreementCode");
            return (Criteria) this;
        }

        public Criteria andAgreementCodeNotIn(List<String> values) {
            addCriterion("agreement_code not in", values, "agreementCode");
            return (Criteria) this;
        }

        public Criteria andAgreementCodeBetween(String value1, String value2) {
            addCriterion("agreement_code between", value1, value2, "agreementCode");
            return (Criteria) this;
        }

        public Criteria andAgreementCodeNotBetween(String value1, String value2) {
            addCriterion("agreement_code not between", value1, value2, "agreementCode");
            return (Criteria) this;
        }

        public Criteria andAgreementNoIsNull() {
            addCriterion("agreement_no is null");
            return (Criteria) this;
        }

        public Criteria andAgreementNoIsNotNull() {
            addCriterion("agreement_no is not null");
            return (Criteria) this;
        }

        public Criteria andAgreementNoEqualTo(String value) {
            addCriterion("agreement_no =", value, "agreementNo");
            return (Criteria) this;
        }

        public Criteria andAgreementNoNotEqualTo(String value) {
            addCriterion("agreement_no <>", value, "agreementNo");
            return (Criteria) this;
        }

        public Criteria andAgreementNoGreaterThan(String value) {
            addCriterion("agreement_no >", value, "agreementNo");
            return (Criteria) this;
        }

        public Criteria andAgreementNoGreaterThanOrEqualTo(String value) {
            addCriterion("agreement_no >=", value, "agreementNo");
            return (Criteria) this;
        }

        public Criteria andAgreementNoLessThan(String value) {
            addCriterion("agreement_no <", value, "agreementNo");
            return (Criteria) this;
        }

        public Criteria andAgreementNoLessThanOrEqualTo(String value) {
            addCriterion("agreement_no <=", value, "agreementNo");
            return (Criteria) this;
        }

        public Criteria andAgreementNoLike(String value) {
            addCriterion("agreement_no like", value, "agreementNo");
            return (Criteria) this;
        }

        public Criteria andAgreementNoNotLike(String value) {
            addCriterion("agreement_no not like", value, "agreementNo");
            return (Criteria) this;
        }

        public Criteria andAgreementNoIn(List<String> values) {
            addCriterion("agreement_no in", values, "agreementNo");
            return (Criteria) this;
        }

        public Criteria andAgreementNoNotIn(List<String> values) {
            addCriterion("agreement_no not in", values, "agreementNo");
            return (Criteria) this;
        }

        public Criteria andAgreementNoBetween(String value1, String value2) {
            addCriterion("agreement_no between", value1, value2, "agreementNo");
            return (Criteria) this;
        }

        public Criteria andAgreementNoNotBetween(String value1, String value2) {
            addCriterion("agreement_no not between", value1, value2, "agreementNo");
            return (Criteria) this;
        }

        public Criteria andValidateStartIsNull() {
            addCriterion("validate_start is null");
            return (Criteria) this;
        }

        public Criteria andValidateStartIsNotNull() {
            addCriterion("validate_start is not null");
            return (Criteria) this;
        }

        public Criteria andValidateStartEqualTo(Date value) {
            addCriterionForJDBCDate("validate_start =", value, "validateStart");
            return (Criteria) this;
        }

        public Criteria andValidateStartNotEqualTo(Date value) {
            addCriterionForJDBCDate("validate_start <>", value, "validateStart");
            return (Criteria) this;
        }

        public Criteria andValidateStartGreaterThan(Date value) {
            addCriterionForJDBCDate("validate_start >", value, "validateStart");
            return (Criteria) this;
        }

        public Criteria andValidateStartGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("validate_start >=", value, "validateStart");
            return (Criteria) this;
        }

        public Criteria andValidateStartLessThan(Date value) {
            addCriterionForJDBCDate("validate_start <", value, "validateStart");
            return (Criteria) this;
        }

        public Criteria andValidateStartLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("validate_start <=", value, "validateStart");
            return (Criteria) this;
        }

        public Criteria andValidateStartIn(List<Date> values) {
            addCriterionForJDBCDate("validate_start in", values, "validateStart");
            return (Criteria) this;
        }

        public Criteria andValidateStartNotIn(List<Date> values) {
            addCriterionForJDBCDate("validate_start not in", values, "validateStart");
            return (Criteria) this;
        }

        public Criteria andValidateStartBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("validate_start between", value1, value2, "validateStart");
            return (Criteria) this;
        }

        public Criteria andValidateStartNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("validate_start not between", value1, value2, "validateStart");
            return (Criteria) this;
        }

        public Criteria andValidateEndIsNull() {
            addCriterion("validate_end is null");
            return (Criteria) this;
        }

        public Criteria andValidateEndIsNotNull() {
            addCriterion("validate_end is not null");
            return (Criteria) this;
        }

        public Criteria andValidateEndEqualTo(Date value) {
            addCriterionForJDBCDate("validate_end =", value, "validateEnd");
            return (Criteria) this;
        }

        public Criteria andValidateEndNotEqualTo(Date value) {
            addCriterionForJDBCDate("validate_end <>", value, "validateEnd");
            return (Criteria) this;
        }

        public Criteria andValidateEndGreaterThan(Date value) {
            addCriterionForJDBCDate("validate_end >", value, "validateEnd");
            return (Criteria) this;
        }

        public Criteria andValidateEndGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("validate_end >=", value, "validateEnd");
            return (Criteria) this;
        }

        public Criteria andValidateEndLessThan(Date value) {
            addCriterionForJDBCDate("validate_end <", value, "validateEnd");
            return (Criteria) this;
        }

        public Criteria andValidateEndLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("validate_end <=", value, "validateEnd");
            return (Criteria) this;
        }

        public Criteria andValidateEndIn(List<Date> values) {
            addCriterionForJDBCDate("validate_end in", values, "validateEnd");
            return (Criteria) this;
        }

        public Criteria andValidateEndNotIn(List<Date> values) {
            addCriterionForJDBCDate("validate_end not in", values, "validateEnd");
            return (Criteria) this;
        }

        public Criteria andValidateEndBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("validate_end between", value1, value2, "validateEnd");
            return (Criteria) this;
        }

        public Criteria andValidateEndNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("validate_end not between", value1, value2, "validateEnd");
            return (Criteria) this;
        }

        public Criteria andChannelIsNull() {
            addCriterion("channel is null");
            return (Criteria) this;
        }

        public Criteria andChannelIsNotNull() {
            addCriterion("channel is not null");
            return (Criteria) this;
        }

        public Criteria andChannelEqualTo(Integer value) {
            addCriterion("channel =", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotEqualTo(Integer value) {
            addCriterion("channel <>", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThan(Integer value) {
            addCriterion("channel >", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThanOrEqualTo(Integer value) {
            addCriterion("channel >=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThan(Integer value) {
            addCriterion("channel <", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThanOrEqualTo(Integer value) {
            addCriterion("channel <=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelIn(List<Integer> values) {
            addCriterion("channel in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotIn(List<Integer> values) {
            addCriterion("channel not in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelBetween(Integer value1, Integer value2) {
            addCriterion("channel between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotBetween(Integer value1, Integer value2) {
            addCriterion("channel not between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andWytProfitTypeIsNull() {
            addCriterion("wyt_profit_type is null");
            return (Criteria) this;
        }

        public Criteria andWytProfitTypeIsNotNull() {
            addCriterion("wyt_profit_type is not null");
            return (Criteria) this;
        }

        public Criteria andWytProfitTypeEqualTo(String value) {
            addCriterion("wyt_profit_type =", value, "wytProfitType");
            return (Criteria) this;
        }

        public Criteria andWytProfitTypeNotEqualTo(String value) {
            addCriterion("wyt_profit_type <>", value, "wytProfitType");
            return (Criteria) this;
        }

        public Criteria andWytProfitTypeGreaterThan(String value) {
            addCriterion("wyt_profit_type >", value, "wytProfitType");
            return (Criteria) this;
        }

        public Criteria andWytProfitTypeGreaterThanOrEqualTo(String value) {
            addCriterion("wyt_profit_type >=", value, "wytProfitType");
            return (Criteria) this;
        }

        public Criteria andWytProfitTypeLessThan(String value) {
            addCriterion("wyt_profit_type <", value, "wytProfitType");
            return (Criteria) this;
        }

        public Criteria andWytProfitTypeLessThanOrEqualTo(String value) {
            addCriterion("wyt_profit_type <=", value, "wytProfitType");
            return (Criteria) this;
        }

        public Criteria andWytProfitTypeLike(String value) {
            addCriterion("wyt_profit_type like", value, "wytProfitType");
            return (Criteria) this;
        }

        public Criteria andWytProfitTypeNotLike(String value) {
            addCriterion("wyt_profit_type not like", value, "wytProfitType");
            return (Criteria) this;
        }

        public Criteria andWytProfitTypeIn(List<String> values) {
            addCriterion("wyt_profit_type in", values, "wytProfitType");
            return (Criteria) this;
        }

        public Criteria andWytProfitTypeNotIn(List<String> values) {
            addCriterion("wyt_profit_type not in", values, "wytProfitType");
            return (Criteria) this;
        }

        public Criteria andWytProfitTypeBetween(String value1, String value2) {
            addCriterion("wyt_profit_type between", value1, value2, "wytProfitType");
            return (Criteria) this;
        }

        public Criteria andWytProfitTypeNotBetween(String value1, String value2) {
            addCriterion("wyt_profit_type not between", value1, value2, "wytProfitType");
            return (Criteria) this;
        }

        public Criteria andWytProfitValueIsNull() {
            addCriterion("wyt_profit_value is null");
            return (Criteria) this;
        }

        public Criteria andWytProfitValueIsNotNull() {
            addCriterion("wyt_profit_value is not null");
            return (Criteria) this;
        }

        public Criteria andWytProfitValueEqualTo(BigDecimal value) {
            addCriterion("wyt_profit_value =", value, "wytProfitValue");
            return (Criteria) this;
        }

        public Criteria andWytProfitValueNotEqualTo(BigDecimal value) {
            addCriterion("wyt_profit_value <>", value, "wytProfitValue");
            return (Criteria) this;
        }

        public Criteria andWytProfitValueGreaterThan(BigDecimal value) {
            addCriterion("wyt_profit_value >", value, "wytProfitValue");
            return (Criteria) this;
        }

        public Criteria andWytProfitValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("wyt_profit_value >=", value, "wytProfitValue");
            return (Criteria) this;
        }

        public Criteria andWytProfitValueLessThan(BigDecimal value) {
            addCriterion("wyt_profit_value <", value, "wytProfitValue");
            return (Criteria) this;
        }

        public Criteria andWytProfitValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("wyt_profit_value <=", value, "wytProfitValue");
            return (Criteria) this;
        }

        public Criteria andWytProfitValueIn(List<BigDecimal> values) {
            addCriterion("wyt_profit_value in", values, "wytProfitValue");
            return (Criteria) this;
        }

        public Criteria andWytProfitValueNotIn(List<BigDecimal> values) {
            addCriterion("wyt_profit_value not in", values, "wytProfitValue");
            return (Criteria) this;
        }

        public Criteria andWytProfitValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wyt_profit_value between", value1, value2, "wytProfitValue");
            return (Criteria) this;
        }

        public Criteria andWytProfitValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wyt_profit_value not between", value1, value2, "wytProfitValue");
            return (Criteria) this;
        }

        public Criteria andJointProfitTypeIsNull() {
            addCriterion("joint_profit_type is null");
            return (Criteria) this;
        }

        public Criteria andJointProfitTypeIsNotNull() {
            addCriterion("joint_profit_type is not null");
            return (Criteria) this;
        }

        public Criteria andJointProfitTypeEqualTo(String value) {
            addCriterion("joint_profit_type =", value, "jointProfitType");
            return (Criteria) this;
        }

        public Criteria andJointProfitTypeNotEqualTo(String value) {
            addCriterion("joint_profit_type <>", value, "jointProfitType");
            return (Criteria) this;
        }

        public Criteria andJointProfitTypeGreaterThan(String value) {
            addCriterion("joint_profit_type >", value, "jointProfitType");
            return (Criteria) this;
        }

        public Criteria andJointProfitTypeGreaterThanOrEqualTo(String value) {
            addCriterion("joint_profit_type >=", value, "jointProfitType");
            return (Criteria) this;
        }

        public Criteria andJointProfitTypeLessThan(String value) {
            addCriterion("joint_profit_type <", value, "jointProfitType");
            return (Criteria) this;
        }

        public Criteria andJointProfitTypeLessThanOrEqualTo(String value) {
            addCriterion("joint_profit_type <=", value, "jointProfitType");
            return (Criteria) this;
        }

        public Criteria andJointProfitTypeLike(String value) {
            addCriterion("joint_profit_type like", value, "jointProfitType");
            return (Criteria) this;
        }

        public Criteria andJointProfitTypeNotLike(String value) {
            addCriterion("joint_profit_type not like", value, "jointProfitType");
            return (Criteria) this;
        }

        public Criteria andJointProfitTypeIn(List<String> values) {
            addCriterion("joint_profit_type in", values, "jointProfitType");
            return (Criteria) this;
        }

        public Criteria andJointProfitTypeNotIn(List<String> values) {
            addCriterion("joint_profit_type not in", values, "jointProfitType");
            return (Criteria) this;
        }

        public Criteria andJointProfitTypeBetween(String value1, String value2) {
            addCriterion("joint_profit_type between", value1, value2, "jointProfitType");
            return (Criteria) this;
        }

        public Criteria andJointProfitTypeNotBetween(String value1, String value2) {
            addCriterion("joint_profit_type not between", value1, value2, "jointProfitType");
            return (Criteria) this;
        }

        public Criteria andJointProfitValueIsNull() {
            addCriterion("joint_profit_value is null");
            return (Criteria) this;
        }

        public Criteria andJointProfitValueIsNotNull() {
            addCriterion("joint_profit_value is not null");
            return (Criteria) this;
        }

        public Criteria andJointProfitValueEqualTo(BigDecimal value) {
            addCriterion("joint_profit_value =", value, "jointProfitValue");
            return (Criteria) this;
        }

        public Criteria andJointProfitValueNotEqualTo(BigDecimal value) {
            addCriterion("joint_profit_value <>", value, "jointProfitValue");
            return (Criteria) this;
        }

        public Criteria andJointProfitValueGreaterThan(BigDecimal value) {
            addCriterion("joint_profit_value >", value, "jointProfitValue");
            return (Criteria) this;
        }

        public Criteria andJointProfitValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("joint_profit_value >=", value, "jointProfitValue");
            return (Criteria) this;
        }

        public Criteria andJointProfitValueLessThan(BigDecimal value) {
            addCriterion("joint_profit_value <", value, "jointProfitValue");
            return (Criteria) this;
        }

        public Criteria andJointProfitValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("joint_profit_value <=", value, "jointProfitValue");
            return (Criteria) this;
        }

        public Criteria andJointProfitValueIn(List<BigDecimal> values) {
            addCriterion("joint_profit_value in", values, "jointProfitValue");
            return (Criteria) this;
        }

        public Criteria andJointProfitValueNotIn(List<BigDecimal> values) {
            addCriterion("joint_profit_value not in", values, "jointProfitValue");
            return (Criteria) this;
        }

        public Criteria andJointProfitValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("joint_profit_value between", value1, value2, "jointProfitValue");
            return (Criteria) this;
        }

        public Criteria andJointProfitValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("joint_profit_value not between", value1, value2, "jointProfitValue");
            return (Criteria) this;
        }

        public Criteria andValidStatusIsNull() {
            addCriterion("valid_status is null");
            return (Criteria) this;
        }

        public Criteria andValidStatusIsNotNull() {
            addCriterion("valid_status is not null");
            return (Criteria) this;
        }

        public Criteria andValidStatusEqualTo(String value) {
            addCriterion("valid_status =", value, "validStatus");
            return (Criteria) this;
        }

        public Criteria andValidStatusNotEqualTo(String value) {
            addCriterion("valid_status <>", value, "validStatus");
            return (Criteria) this;
        }

        public Criteria andValidStatusGreaterThan(String value) {
            addCriterion("valid_status >", value, "validStatus");
            return (Criteria) this;
        }

        public Criteria andValidStatusGreaterThanOrEqualTo(String value) {
            addCriterion("valid_status >=", value, "validStatus");
            return (Criteria) this;
        }

        public Criteria andValidStatusLessThan(String value) {
            addCriterion("valid_status <", value, "validStatus");
            return (Criteria) this;
        }

        public Criteria andValidStatusLessThanOrEqualTo(String value) {
            addCriterion("valid_status <=", value, "validStatus");
            return (Criteria) this;
        }

        public Criteria andValidStatusLike(String value) {
            addCriterion("valid_status like", value, "validStatus");
            return (Criteria) this;
        }

        public Criteria andValidStatusNotLike(String value) {
            addCriterion("valid_status not like", value, "validStatus");
            return (Criteria) this;
        }

        public Criteria andValidStatusIn(List<String> values) {
            addCriterion("valid_status in", values, "validStatus");
            return (Criteria) this;
        }

        public Criteria andValidStatusNotIn(List<String> values) {
            addCriterion("valid_status not in", values, "validStatus");
            return (Criteria) this;
        }

        public Criteria andValidStatusBetween(String value1, String value2) {
            addCriterion("valid_status between", value1, value2, "validStatus");
            return (Criteria) this;
        }

        public Criteria andValidStatusNotBetween(String value1, String value2) {
            addCriterion("valid_status not between", value1, value2, "validStatus");
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

        public Criteria andOperatorIsNull() {
            addCriterion("operator is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("operator is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(String value) {
            addCriterion("operator =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            addCriterion("operator <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            addCriterion("operator >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("operator >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(String value) {
            addCriterion("operator <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            addCriterion("operator <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLike(String value) {
            addCriterion("operator like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLike(String value) {
            addCriterion("operator not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<String> values) {
            addCriterion("operator in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<String> values) {
            addCriterion("operator not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("operator between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("operator not between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andMerNoLikeInsensitive(String value) {
            addCriterion("upper(mer_no) like", value.toUpperCase(), "merNo");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLikeInsensitive(String value) {
            addCriterion("upper(business_type) like", value.toUpperCase(), "businessType");
            return (Criteria) this;
        }

        public Criteria andAgreementCodeLikeInsensitive(String value) {
            addCriterion("upper(agreement_code) like", value.toUpperCase(), "agreementCode");
            return (Criteria) this;
        }

        public Criteria andAgreementNoLikeInsensitive(String value) {
            addCriterion("upper(agreement_no) like", value.toUpperCase(), "agreementNo");
            return (Criteria) this;
        }

        public Criteria andWytProfitTypeLikeInsensitive(String value) {
            addCriterion("upper(wyt_profit_type) like", value.toUpperCase(), "wytProfitType");
            return (Criteria) this;
        }

        public Criteria andJointProfitTypeLikeInsensitive(String value) {
            addCriterion("upper(joint_profit_type) like", value.toUpperCase(), "jointProfitType");
            return (Criteria) this;
        }

        public Criteria andValidStatusLikeInsensitive(String value) {
            addCriterion("upper(valid_status) like", value.toUpperCase(), "validStatus");
            return (Criteria) this;
        }

        public Criteria andOperatorLikeInsensitive(String value) {
            addCriterion("upper(operator) like", value.toUpperCase(), "operator");
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