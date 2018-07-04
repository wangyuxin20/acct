package com.wd.apiaccount.model.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SettlePactExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SettlePactExample() {
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

        public Criteria andAgreementCategoryIsNull() {
            addCriterion("agreement_category is null");
            return (Criteria) this;
        }

        public Criteria andAgreementCategoryIsNotNull() {
            addCriterion("agreement_category is not null");
            return (Criteria) this;
        }

        public Criteria andAgreementCategoryEqualTo(String value) {
            addCriterion("agreement_category =", value, "agreementCategory");
            return (Criteria) this;
        }

        public Criteria andAgreementCategoryNotEqualTo(String value) {
            addCriterion("agreement_category <>", value, "agreementCategory");
            return (Criteria) this;
        }

        public Criteria andAgreementCategoryGreaterThan(String value) {
            addCriterion("agreement_category >", value, "agreementCategory");
            return (Criteria) this;
        }

        public Criteria andAgreementCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("agreement_category >=", value, "agreementCategory");
            return (Criteria) this;
        }

        public Criteria andAgreementCategoryLessThan(String value) {
            addCriterion("agreement_category <", value, "agreementCategory");
            return (Criteria) this;
        }

        public Criteria andAgreementCategoryLessThanOrEqualTo(String value) {
            addCriterion("agreement_category <=", value, "agreementCategory");
            return (Criteria) this;
        }

        public Criteria andAgreementCategoryLike(String value) {
            addCriterion("agreement_category like", value, "agreementCategory");
            return (Criteria) this;
        }

        public Criteria andAgreementCategoryNotLike(String value) {
            addCriterion("agreement_category not like", value, "agreementCategory");
            return (Criteria) this;
        }

        public Criteria andAgreementCategoryIn(List<String> values) {
            addCriterion("agreement_category in", values, "agreementCategory");
            return (Criteria) this;
        }

        public Criteria andAgreementCategoryNotIn(List<String> values) {
            addCriterion("agreement_category not in", values, "agreementCategory");
            return (Criteria) this;
        }

        public Criteria andAgreementCategoryBetween(String value1, String value2) {
            addCriterion("agreement_category between", value1, value2, "agreementCategory");
            return (Criteria) this;
        }

        public Criteria andAgreementCategoryNotBetween(String value1, String value2) {
            addCriterion("agreement_category not between", value1, value2, "agreementCategory");
            return (Criteria) this;
        }

        public Criteria andMerchantNoIsNull() {
            addCriterion("merchant_no is null");
            return (Criteria) this;
        }

        public Criteria andMerchantNoIsNotNull() {
            addCriterion("merchant_no is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantNoEqualTo(String value) {
            addCriterion("merchant_no =", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoNotEqualTo(String value) {
            addCriterion("merchant_no <>", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoGreaterThan(String value) {
            addCriterion("merchant_no >", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_no >=", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoLessThan(String value) {
            addCriterion("merchant_no <", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoLessThanOrEqualTo(String value) {
            addCriterion("merchant_no <=", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoLike(String value) {
            addCriterion("merchant_no like", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoNotLike(String value) {
            addCriterion("merchant_no not like", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoIn(List<String> values) {
            addCriterion("merchant_no in", values, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoNotIn(List<String> values) {
            addCriterion("merchant_no not in", values, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoBetween(String value1, String value2) {
            addCriterion("merchant_no between", value1, value2, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoNotBetween(String value1, String value2) {
            addCriterion("merchant_no not between", value1, value2, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNameIsNull() {
            addCriterion("merchant_name is null");
            return (Criteria) this;
        }

        public Criteria andMerchantNameIsNotNull() {
            addCriterion("merchant_name is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantNameEqualTo(String value) {
            addCriterion("merchant_name =", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameNotEqualTo(String value) {
            addCriterion("merchant_name <>", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameGreaterThan(String value) {
            addCriterion("merchant_name >", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_name >=", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameLessThan(String value) {
            addCriterion("merchant_name <", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameLessThanOrEqualTo(String value) {
            addCriterion("merchant_name <=", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameLike(String value) {
            addCriterion("merchant_name like", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameNotLike(String value) {
            addCriterion("merchant_name not like", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameIn(List<String> values) {
            addCriterion("merchant_name in", values, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameNotIn(List<String> values) {
            addCriterion("merchant_name not in", values, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameBetween(String value1, String value2) {
            addCriterion("merchant_name between", value1, value2, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameNotBetween(String value1, String value2) {
            addCriterion("merchant_name not between", value1, value2, "merchantName");
            return (Criteria) this;
        }

        public Criteria andAgreementTimeIsNull() {
            addCriterion("agreement_time is null");
            return (Criteria) this;
        }

        public Criteria andAgreementTimeIsNotNull() {
            addCriterion("agreement_time is not null");
            return (Criteria) this;
        }

        public Criteria andAgreementTimeEqualTo(Date value) {
            addCriterion("agreement_time =", value, "agreementTime");
            return (Criteria) this;
        }

        public Criteria andAgreementTimeNotEqualTo(Date value) {
            addCriterion("agreement_time <>", value, "agreementTime");
            return (Criteria) this;
        }

        public Criteria andAgreementTimeGreaterThan(Date value) {
            addCriterion("agreement_time >", value, "agreementTime");
            return (Criteria) this;
        }

        public Criteria andAgreementTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("agreement_time >=", value, "agreementTime");
            return (Criteria) this;
        }

        public Criteria andAgreementTimeLessThan(Date value) {
            addCriterion("agreement_time <", value, "agreementTime");
            return (Criteria) this;
        }

        public Criteria andAgreementTimeLessThanOrEqualTo(Date value) {
            addCriterion("agreement_time <=", value, "agreementTime");
            return (Criteria) this;
        }

        public Criteria andAgreementTimeIn(List<Date> values) {
            addCriterion("agreement_time in", values, "agreementTime");
            return (Criteria) this;
        }

        public Criteria andAgreementTimeNotIn(List<Date> values) {
            addCriterion("agreement_time not in", values, "agreementTime");
            return (Criteria) this;
        }

        public Criteria andAgreementTimeBetween(Date value1, Date value2) {
            addCriterion("agreement_time between", value1, value2, "agreementTime");
            return (Criteria) this;
        }

        public Criteria andAgreementTimeNotBetween(Date value1, Date value2) {
            addCriterion("agreement_time not between", value1, value2, "agreementTime");
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

        public Criteria andAgreementTypeIsNull() {
            addCriterion("agreement_type is null");
            return (Criteria) this;
        }

        public Criteria andAgreementTypeIsNotNull() {
            addCriterion("agreement_type is not null");
            return (Criteria) this;
        }

        public Criteria andAgreementTypeEqualTo(String value) {
            addCriterion("agreement_type =", value, "agreementType");
            return (Criteria) this;
        }

        public Criteria andAgreementTypeNotEqualTo(String value) {
            addCriterion("agreement_type <>", value, "agreementType");
            return (Criteria) this;
        }

        public Criteria andAgreementTypeGreaterThan(String value) {
            addCriterion("agreement_type >", value, "agreementType");
            return (Criteria) this;
        }

        public Criteria andAgreementTypeGreaterThanOrEqualTo(String value) {
            addCriterion("agreement_type >=", value, "agreementType");
            return (Criteria) this;
        }

        public Criteria andAgreementTypeLessThan(String value) {
            addCriterion("agreement_type <", value, "agreementType");
            return (Criteria) this;
        }

        public Criteria andAgreementTypeLessThanOrEqualTo(String value) {
            addCriterion("agreement_type <=", value, "agreementType");
            return (Criteria) this;
        }

        public Criteria andAgreementTypeLike(String value) {
            addCriterion("agreement_type like", value, "agreementType");
            return (Criteria) this;
        }

        public Criteria andAgreementTypeNotLike(String value) {
            addCriterion("agreement_type not like", value, "agreementType");
            return (Criteria) this;
        }

        public Criteria andAgreementTypeIn(List<String> values) {
            addCriterion("agreement_type in", values, "agreementType");
            return (Criteria) this;
        }

        public Criteria andAgreementTypeNotIn(List<String> values) {
            addCriterion("agreement_type not in", values, "agreementType");
            return (Criteria) this;
        }

        public Criteria andAgreementTypeBetween(String value1, String value2) {
            addCriterion("agreement_type between", value1, value2, "agreementType");
            return (Criteria) this;
        }

        public Criteria andAgreementTypeNotBetween(String value1, String value2) {
            addCriterion("agreement_type not between", value1, value2, "agreementType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeIsNull() {
            addCriterion("interface_type is null");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeIsNotNull() {
            addCriterion("interface_type is not null");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeEqualTo(String value) {
            addCriterion("interface_type =", value, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeNotEqualTo(String value) {
            addCriterion("interface_type <>", value, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeGreaterThan(String value) {
            addCriterion("interface_type >", value, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("interface_type >=", value, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeLessThan(String value) {
            addCriterion("interface_type <", value, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeLessThanOrEqualTo(String value) {
            addCriterion("interface_type <=", value, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeLike(String value) {
            addCriterion("interface_type like", value, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeNotLike(String value) {
            addCriterion("interface_type not like", value, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeIn(List<String> values) {
            addCriterion("interface_type in", values, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeNotIn(List<String> values) {
            addCriterion("interface_type not in", values, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeBetween(String value1, String value2) {
            addCriterion("interface_type between", value1, value2, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeNotBetween(String value1, String value2) {
            addCriterion("interface_type not between", value1, value2, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeIsNull() {
            addCriterion("account_type is null");
            return (Criteria) this;
        }

        public Criteria andAccountTypeIsNotNull() {
            addCriterion("account_type is not null");
            return (Criteria) this;
        }

        public Criteria andAccountTypeEqualTo(String value) {
            addCriterion("account_type =", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotEqualTo(String value) {
            addCriterion("account_type <>", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeGreaterThan(String value) {
            addCriterion("account_type >", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeGreaterThanOrEqualTo(String value) {
            addCriterion("account_type >=", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeLessThan(String value) {
            addCriterion("account_type <", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeLessThanOrEqualTo(String value) {
            addCriterion("account_type <=", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeLike(String value) {
            addCriterion("account_type like", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotLike(String value) {
            addCriterion("account_type not like", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeIn(List<String> values) {
            addCriterion("account_type in", values, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotIn(List<String> values) {
            addCriterion("account_type not in", values, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeBetween(String value1, String value2) {
            addCriterion("account_type between", value1, value2, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotBetween(String value1, String value2) {
            addCriterion("account_type not between", value1, value2, "accountType");
            return (Criteria) this;
        }

        public Criteria andCommissionRateIsNull() {
            addCriterion("commission_rate is null");
            return (Criteria) this;
        }

        public Criteria andCommissionRateIsNotNull() {
            addCriterion("commission_rate is not null");
            return (Criteria) this;
        }

        public Criteria andCommissionRateEqualTo(String value) {
            addCriterion("commission_rate =", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateNotEqualTo(String value) {
            addCriterion("commission_rate <>", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateGreaterThan(String value) {
            addCriterion("commission_rate >", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateGreaterThanOrEqualTo(String value) {
            addCriterion("commission_rate >=", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateLessThan(String value) {
            addCriterion("commission_rate <", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateLessThanOrEqualTo(String value) {
            addCriterion("commission_rate <=", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateLike(String value) {
            addCriterion("commission_rate like", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateNotLike(String value) {
            addCriterion("commission_rate not like", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateIn(List<String> values) {
            addCriterion("commission_rate in", values, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateNotIn(List<String> values) {
            addCriterion("commission_rate not in", values, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateBetween(String value1, String value2) {
            addCriterion("commission_rate between", value1, value2, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateNotBetween(String value1, String value2) {
            addCriterion("commission_rate not between", value1, value2, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andBankNoIsNull() {
            addCriterion("bank_no is null");
            return (Criteria) this;
        }

        public Criteria andBankNoIsNotNull() {
            addCriterion("bank_no is not null");
            return (Criteria) this;
        }

        public Criteria andBankNoEqualTo(String value) {
            addCriterion("bank_no =", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoNotEqualTo(String value) {
            addCriterion("bank_no <>", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoGreaterThan(String value) {
            addCriterion("bank_no >", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoGreaterThanOrEqualTo(String value) {
            addCriterion("bank_no >=", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoLessThan(String value) {
            addCriterion("bank_no <", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoLessThanOrEqualTo(String value) {
            addCriterion("bank_no <=", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoLike(String value) {
            addCriterion("bank_no like", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoNotLike(String value) {
            addCriterion("bank_no not like", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoIn(List<String> values) {
            addCriterion("bank_no in", values, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoNotIn(List<String> values) {
            addCriterion("bank_no not in", values, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoBetween(String value1, String value2) {
            addCriterion("bank_no between", value1, value2, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoNotBetween(String value1, String value2) {
            addCriterion("bank_no not between", value1, value2, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNull() {
            addCriterion("bank_name is null");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNotNull() {
            addCriterion("bank_name is not null");
            return (Criteria) this;
        }

        public Criteria andBankNameEqualTo(String value) {
            addCriterion("bank_name =", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotEqualTo(String value) {
            addCriterion("bank_name <>", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThan(String value) {
            addCriterion("bank_name >", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("bank_name >=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThan(String value) {
            addCriterion("bank_name <", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThanOrEqualTo(String value) {
            addCriterion("bank_name <=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLike(String value) {
            addCriterion("bank_name like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotLike(String value) {
            addCriterion("bank_name not like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameIn(List<String> values) {
            addCriterion("bank_name in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotIn(List<String> values) {
            addCriterion("bank_name not in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameBetween(String value1, String value2) {
            addCriterion("bank_name between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotBetween(String value1, String value2) {
            addCriterion("bank_name not between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameIsNull() {
            addCriterion("bank_account_name is null");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameIsNotNull() {
            addCriterion("bank_account_name is not null");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameEqualTo(String value) {
            addCriterion("bank_account_name =", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameNotEqualTo(String value) {
            addCriterion("bank_account_name <>", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameGreaterThan(String value) {
            addCriterion("bank_account_name >", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameGreaterThanOrEqualTo(String value) {
            addCriterion("bank_account_name >=", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameLessThan(String value) {
            addCriterion("bank_account_name <", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameLessThanOrEqualTo(String value) {
            addCriterion("bank_account_name <=", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameLike(String value) {
            addCriterion("bank_account_name like", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameNotLike(String value) {
            addCriterion("bank_account_name not like", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameIn(List<String> values) {
            addCriterion("bank_account_name in", values, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameNotIn(List<String> values) {
            addCriterion("bank_account_name not in", values, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameBetween(String value1, String value2) {
            addCriterion("bank_account_name between", value1, value2, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameNotBetween(String value1, String value2) {
            addCriterion("bank_account_name not between", value1, value2, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andSubBankNameIsNull() {
            addCriterion("sub_bank_name is null");
            return (Criteria) this;
        }

        public Criteria andSubBankNameIsNotNull() {
            addCriterion("sub_bank_name is not null");
            return (Criteria) this;
        }

        public Criteria andSubBankNameEqualTo(String value) {
            addCriterion("sub_bank_name =", value, "subBankName");
            return (Criteria) this;
        }

        public Criteria andSubBankNameNotEqualTo(String value) {
            addCriterion("sub_bank_name <>", value, "subBankName");
            return (Criteria) this;
        }

        public Criteria andSubBankNameGreaterThan(String value) {
            addCriterion("sub_bank_name >", value, "subBankName");
            return (Criteria) this;
        }

        public Criteria andSubBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("sub_bank_name >=", value, "subBankName");
            return (Criteria) this;
        }

        public Criteria andSubBankNameLessThan(String value) {
            addCriterion("sub_bank_name <", value, "subBankName");
            return (Criteria) this;
        }

        public Criteria andSubBankNameLessThanOrEqualTo(String value) {
            addCriterion("sub_bank_name <=", value, "subBankName");
            return (Criteria) this;
        }

        public Criteria andSubBankNameLike(String value) {
            addCriterion("sub_bank_name like", value, "subBankName");
            return (Criteria) this;
        }

        public Criteria andSubBankNameNotLike(String value) {
            addCriterion("sub_bank_name not like", value, "subBankName");
            return (Criteria) this;
        }

        public Criteria andSubBankNameIn(List<String> values) {
            addCriterion("sub_bank_name in", values, "subBankName");
            return (Criteria) this;
        }

        public Criteria andSubBankNameNotIn(List<String> values) {
            addCriterion("sub_bank_name not in", values, "subBankName");
            return (Criteria) this;
        }

        public Criteria andSubBankNameBetween(String value1, String value2) {
            addCriterion("sub_bank_name between", value1, value2, "subBankName");
            return (Criteria) this;
        }

        public Criteria andSubBankNameNotBetween(String value1, String value2) {
            addCriterion("sub_bank_name not between", value1, value2, "subBankName");
            return (Criteria) this;
        }

        public Criteria andEasymoneyAccountNoIsNull() {
            addCriterion("easymoney_account_no is null");
            return (Criteria) this;
        }

        public Criteria andEasymoneyAccountNoIsNotNull() {
            addCriterion("easymoney_account_no is not null");
            return (Criteria) this;
        }

        public Criteria andEasymoneyAccountNoEqualTo(String value) {
            addCriterion("easymoney_account_no =", value, "easymoneyAccountNo");
            return (Criteria) this;
        }

        public Criteria andEasymoneyAccountNoNotEqualTo(String value) {
            addCriterion("easymoney_account_no <>", value, "easymoneyAccountNo");
            return (Criteria) this;
        }

        public Criteria andEasymoneyAccountNoGreaterThan(String value) {
            addCriterion("easymoney_account_no >", value, "easymoneyAccountNo");
            return (Criteria) this;
        }

        public Criteria andEasymoneyAccountNoGreaterThanOrEqualTo(String value) {
            addCriterion("easymoney_account_no >=", value, "easymoneyAccountNo");
            return (Criteria) this;
        }

        public Criteria andEasymoneyAccountNoLessThan(String value) {
            addCriterion("easymoney_account_no <", value, "easymoneyAccountNo");
            return (Criteria) this;
        }

        public Criteria andEasymoneyAccountNoLessThanOrEqualTo(String value) {
            addCriterion("easymoney_account_no <=", value, "easymoneyAccountNo");
            return (Criteria) this;
        }

        public Criteria andEasymoneyAccountNoLike(String value) {
            addCriterion("easymoney_account_no like", value, "easymoneyAccountNo");
            return (Criteria) this;
        }

        public Criteria andEasymoneyAccountNoNotLike(String value) {
            addCriterion("easymoney_account_no not like", value, "easymoneyAccountNo");
            return (Criteria) this;
        }

        public Criteria andEasymoneyAccountNoIn(List<String> values) {
            addCriterion("easymoney_account_no in", values, "easymoneyAccountNo");
            return (Criteria) this;
        }

        public Criteria andEasymoneyAccountNoNotIn(List<String> values) {
            addCriterion("easymoney_account_no not in", values, "easymoneyAccountNo");
            return (Criteria) this;
        }

        public Criteria andEasymoneyAccountNoBetween(String value1, String value2) {
            addCriterion("easymoney_account_no between", value1, value2, "easymoneyAccountNo");
            return (Criteria) this;
        }

        public Criteria andEasymoneyAccountNoNotBetween(String value1, String value2) {
            addCriterion("easymoney_account_no not between", value1, value2, "easymoneyAccountNo");
            return (Criteria) this;
        }

        public Criteria andEasymoneyAccountNameIsNull() {
            addCriterion("easymoney_account_name is null");
            return (Criteria) this;
        }

        public Criteria andEasymoneyAccountNameIsNotNull() {
            addCriterion("easymoney_account_name is not null");
            return (Criteria) this;
        }

        public Criteria andEasymoneyAccountNameEqualTo(String value) {
            addCriterion("easymoney_account_name =", value, "easymoneyAccountName");
            return (Criteria) this;
        }

        public Criteria andEasymoneyAccountNameNotEqualTo(String value) {
            addCriterion("easymoney_account_name <>", value, "easymoneyAccountName");
            return (Criteria) this;
        }

        public Criteria andEasymoneyAccountNameGreaterThan(String value) {
            addCriterion("easymoney_account_name >", value, "easymoneyAccountName");
            return (Criteria) this;
        }

        public Criteria andEasymoneyAccountNameGreaterThanOrEqualTo(String value) {
            addCriterion("easymoney_account_name >=", value, "easymoneyAccountName");
            return (Criteria) this;
        }

        public Criteria andEasymoneyAccountNameLessThan(String value) {
            addCriterion("easymoney_account_name <", value, "easymoneyAccountName");
            return (Criteria) this;
        }

        public Criteria andEasymoneyAccountNameLessThanOrEqualTo(String value) {
            addCriterion("easymoney_account_name <=", value, "easymoneyAccountName");
            return (Criteria) this;
        }

        public Criteria andEasymoneyAccountNameLike(String value) {
            addCriterion("easymoney_account_name like", value, "easymoneyAccountName");
            return (Criteria) this;
        }

        public Criteria andEasymoneyAccountNameNotLike(String value) {
            addCriterion("easymoney_account_name not like", value, "easymoneyAccountName");
            return (Criteria) this;
        }

        public Criteria andEasymoneyAccountNameIn(List<String> values) {
            addCriterion("easymoney_account_name in", values, "easymoneyAccountName");
            return (Criteria) this;
        }

        public Criteria andEasymoneyAccountNameNotIn(List<String> values) {
            addCriterion("easymoney_account_name not in", values, "easymoneyAccountName");
            return (Criteria) this;
        }

        public Criteria andEasymoneyAccountNameBetween(String value1, String value2) {
            addCriterion("easymoney_account_name between", value1, value2, "easymoneyAccountName");
            return (Criteria) this;
        }

        public Criteria andEasymoneyAccountNameNotBetween(String value1, String value2) {
            addCriterion("easymoney_account_name not between", value1, value2, "easymoneyAccountName");
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

        public Criteria andSettleTypeEqualTo(String value) {
            addCriterion("settle_type =", value, "settleType");
            return (Criteria) this;
        }

        public Criteria andSettleTypeNotEqualTo(String value) {
            addCriterion("settle_type <>", value, "settleType");
            return (Criteria) this;
        }

        public Criteria andSettleTypeGreaterThan(String value) {
            addCriterion("settle_type >", value, "settleType");
            return (Criteria) this;
        }

        public Criteria andSettleTypeGreaterThanOrEqualTo(String value) {
            addCriterion("settle_type >=", value, "settleType");
            return (Criteria) this;
        }

        public Criteria andSettleTypeLessThan(String value) {
            addCriterion("settle_type <", value, "settleType");
            return (Criteria) this;
        }

        public Criteria andSettleTypeLessThanOrEqualTo(String value) {
            addCriterion("settle_type <=", value, "settleType");
            return (Criteria) this;
        }

        public Criteria andSettleTypeLike(String value) {
            addCriterion("settle_type like", value, "settleType");
            return (Criteria) this;
        }

        public Criteria andSettleTypeNotLike(String value) {
            addCriterion("settle_type not like", value, "settleType");
            return (Criteria) this;
        }

        public Criteria andSettleTypeIn(List<String> values) {
            addCriterion("settle_type in", values, "settleType");
            return (Criteria) this;
        }

        public Criteria andSettleTypeNotIn(List<String> values) {
            addCriterion("settle_type not in", values, "settleType");
            return (Criteria) this;
        }

        public Criteria andSettleTypeBetween(String value1, String value2) {
            addCriterion("settle_type between", value1, value2, "settleType");
            return (Criteria) this;
        }

        public Criteria andSettleTypeNotBetween(String value1, String value2) {
            addCriterion("settle_type not between", value1, value2, "settleType");
            return (Criteria) this;
        }

        public Criteria andSettleDayIsNull() {
            addCriterion("settle_day is null");
            return (Criteria) this;
        }

        public Criteria andSettleDayIsNotNull() {
            addCriterion("settle_day is not null");
            return (Criteria) this;
        }

        public Criteria andSettleDayEqualTo(Integer value) {
            addCriterion("settle_day =", value, "settleDay");
            return (Criteria) this;
        }

        public Criteria andSettleDayNotEqualTo(Integer value) {
            addCriterion("settle_day <>", value, "settleDay");
            return (Criteria) this;
        }

        public Criteria andSettleDayGreaterThan(Integer value) {
            addCriterion("settle_day >", value, "settleDay");
            return (Criteria) this;
        }

        public Criteria andSettleDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("settle_day >=", value, "settleDay");
            return (Criteria) this;
        }

        public Criteria andSettleDayLessThan(Integer value) {
            addCriterion("settle_day <", value, "settleDay");
            return (Criteria) this;
        }

        public Criteria andSettleDayLessThanOrEqualTo(Integer value) {
            addCriterion("settle_day <=", value, "settleDay");
            return (Criteria) this;
        }

        public Criteria andSettleDayIn(List<Integer> values) {
            addCriterion("settle_day in", values, "settleDay");
            return (Criteria) this;
        }

        public Criteria andSettleDayNotIn(List<Integer> values) {
            addCriterion("settle_day not in", values, "settleDay");
            return (Criteria) this;
        }

        public Criteria andSettleDayBetween(Integer value1, Integer value2) {
            addCriterion("settle_day between", value1, value2, "settleDay");
            return (Criteria) this;
        }

        public Criteria andSettleDayNotBetween(Integer value1, Integer value2) {
            addCriterion("settle_day not between", value1, value2, "settleDay");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andBankCityIsNull() {
            addCriterion("bank_city is null");
            return (Criteria) this;
        }

        public Criteria andBankCityIsNotNull() {
            addCriterion("bank_city is not null");
            return (Criteria) this;
        }

        public Criteria andBankCityEqualTo(String value) {
            addCriterion("bank_city =", value, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityNotEqualTo(String value) {
            addCriterion("bank_city <>", value, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityGreaterThan(String value) {
            addCriterion("bank_city >", value, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityGreaterThanOrEqualTo(String value) {
            addCriterion("bank_city >=", value, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityLessThan(String value) {
            addCriterion("bank_city <", value, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityLessThanOrEqualTo(String value) {
            addCriterion("bank_city <=", value, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityLike(String value) {
            addCriterion("bank_city like", value, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityNotLike(String value) {
            addCriterion("bank_city not like", value, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityIn(List<String> values) {
            addCriterion("bank_city in", values, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityNotIn(List<String> values) {
            addCriterion("bank_city not in", values, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityBetween(String value1, String value2) {
            addCriterion("bank_city between", value1, value2, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityNotBetween(String value1, String value2) {
            addCriterion("bank_city not between", value1, value2, "bankCity");
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

        public Criteria andNettingTypeIsNull() {
            addCriterion("netting_type is null");
            return (Criteria) this;
        }

        public Criteria andNettingTypeIsNotNull() {
            addCriterion("netting_type is not null");
            return (Criteria) this;
        }

        public Criteria andNettingTypeEqualTo(String value) {
            addCriterion("netting_type =", value, "nettingType");
            return (Criteria) this;
        }

        public Criteria andNettingTypeNotEqualTo(String value) {
            addCriterion("netting_type <>", value, "nettingType");
            return (Criteria) this;
        }

        public Criteria andNettingTypeGreaterThan(String value) {
            addCriterion("netting_type >", value, "nettingType");
            return (Criteria) this;
        }

        public Criteria andNettingTypeGreaterThanOrEqualTo(String value) {
            addCriterion("netting_type >=", value, "nettingType");
            return (Criteria) this;
        }

        public Criteria andNettingTypeLessThan(String value) {
            addCriterion("netting_type <", value, "nettingType");
            return (Criteria) this;
        }

        public Criteria andNettingTypeLessThanOrEqualTo(String value) {
            addCriterion("netting_type <=", value, "nettingType");
            return (Criteria) this;
        }

        public Criteria andNettingTypeLike(String value) {
            addCriterion("netting_type like", value, "nettingType");
            return (Criteria) this;
        }

        public Criteria andNettingTypeNotLike(String value) {
            addCriterion("netting_type not like", value, "nettingType");
            return (Criteria) this;
        }

        public Criteria andNettingTypeIn(List<String> values) {
            addCriterion("netting_type in", values, "nettingType");
            return (Criteria) this;
        }

        public Criteria andNettingTypeNotIn(List<String> values) {
            addCriterion("netting_type not in", values, "nettingType");
            return (Criteria) this;
        }

        public Criteria andNettingTypeBetween(String value1, String value2) {
            addCriterion("netting_type between", value1, value2, "nettingType");
            return (Criteria) this;
        }

        public Criteria andNettingTypeNotBetween(String value1, String value2) {
            addCriterion("netting_type not between", value1, value2, "nettingType");
            return (Criteria) this;
        }

        public Criteria andAgreementNoLikeInsensitive(String value) {
            addCriterion("upper(agreement_no) like", value.toUpperCase(), "agreementNo");
            return (Criteria) this;
        }

        public Criteria andAgreementCodeLikeInsensitive(String value) {
            addCriterion("upper(agreement_code) like", value.toUpperCase(), "agreementCode");
            return (Criteria) this;
        }

        public Criteria andAgreementCategoryLikeInsensitive(String value) {
            addCriterion("upper(agreement_category) like", value.toUpperCase(), "agreementCategory");
            return (Criteria) this;
        }

        public Criteria andMerchantNoLikeInsensitive(String value) {
            addCriterion("upper(merchant_no) like", value.toUpperCase(), "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNameLikeInsensitive(String value) {
            addCriterion("upper(merchant_name) like", value.toUpperCase(), "merchantName");
            return (Criteria) this;
        }

        public Criteria andAgreementTypeLikeInsensitive(String value) {
            addCriterion("upper(agreement_type) like", value.toUpperCase(), "agreementType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeLikeInsensitive(String value) {
            addCriterion("upper(interface_type) like", value.toUpperCase(), "interfaceType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeLikeInsensitive(String value) {
            addCriterion("upper(account_type) like", value.toUpperCase(), "accountType");
            return (Criteria) this;
        }

        public Criteria andCommissionRateLikeInsensitive(String value) {
            addCriterion("upper(commission_rate) like", value.toUpperCase(), "commissionRate");
            return (Criteria) this;
        }

        public Criteria andBankNoLikeInsensitive(String value) {
            addCriterion("upper(bank_no) like", value.toUpperCase(), "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNameLikeInsensitive(String value) {
            addCriterion("upper(bank_name) like", value.toUpperCase(), "bankName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameLikeInsensitive(String value) {
            addCriterion("upper(bank_account_name) like", value.toUpperCase(), "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andSubBankNameLikeInsensitive(String value) {
            addCriterion("upper(sub_bank_name) like", value.toUpperCase(), "subBankName");
            return (Criteria) this;
        }

        public Criteria andEasymoneyAccountNoLikeInsensitive(String value) {
            addCriterion("upper(easymoney_account_no) like", value.toUpperCase(), "easymoneyAccountNo");
            return (Criteria) this;
        }

        public Criteria andEasymoneyAccountNameLikeInsensitive(String value) {
            addCriterion("upper(easymoney_account_name) like", value.toUpperCase(), "easymoneyAccountName");
            return (Criteria) this;
        }

        public Criteria andSettleTypeLikeInsensitive(String value) {
            addCriterion("upper(settle_type) like", value.toUpperCase(), "settleType");
            return (Criteria) this;
        }

        public Criteria andBankCityLikeInsensitive(String value) {
            addCriterion("upper(bank_city) like", value.toUpperCase(), "bankCity");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLikeInsensitive(String value) {
            addCriterion("upper(business_type) like", value.toUpperCase(), "businessType");
            return (Criteria) this;
        }

        public Criteria andNettingTypeLikeInsensitive(String value) {
            addCriterion("upper(netting_type) like", value.toUpperCase(), "nettingType");
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