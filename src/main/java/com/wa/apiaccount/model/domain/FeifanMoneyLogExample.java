package com.wd.apiaccount.model.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class FeifanMoneyLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FeifanMoneyLogExample() {
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

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andOperaTypeIsNull() {
            addCriterion("opera_type is null");
            return (Criteria) this;
        }

        public Criteria andOperaTypeIsNotNull() {
            addCriterion("opera_type is not null");
            return (Criteria) this;
        }

        public Criteria andOperaTypeEqualTo(Integer value) {
            addCriterion("opera_type =", value, "operaType");
            return (Criteria) this;
        }

        public Criteria andOperaTypeNotEqualTo(Integer value) {
            addCriterion("opera_type <>", value, "operaType");
            return (Criteria) this;
        }

        public Criteria andOperaTypeGreaterThan(Integer value) {
            addCriterion("opera_type >", value, "operaType");
            return (Criteria) this;
        }

        public Criteria andOperaTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("opera_type >=", value, "operaType");
            return (Criteria) this;
        }

        public Criteria andOperaTypeLessThan(Integer value) {
            addCriterion("opera_type <", value, "operaType");
            return (Criteria) this;
        }

        public Criteria andOperaTypeLessThanOrEqualTo(Integer value) {
            addCriterion("opera_type <=", value, "operaType");
            return (Criteria) this;
        }

        public Criteria andOperaTypeIn(List<Integer> values) {
            addCriterion("opera_type in", values, "operaType");
            return (Criteria) this;
        }

        public Criteria andOperaTypeNotIn(List<Integer> values) {
            addCriterion("opera_type not in", values, "operaType");
            return (Criteria) this;
        }

        public Criteria andOperaTypeBetween(Integer value1, Integer value2) {
            addCriterion("opera_type between", value1, value2, "operaType");
            return (Criteria) this;
        }

        public Criteria andOperaTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("opera_type not between", value1, value2, "operaType");
            return (Criteria) this;
        }

        public Criteria andProMethodIsNull() {
            addCriterion("pro_method is null");
            return (Criteria) this;
        }

        public Criteria andProMethodIsNotNull() {
            addCriterion("pro_method is not null");
            return (Criteria) this;
        }

        public Criteria andProMethodEqualTo(Integer value) {
            addCriterion("pro_method =", value, "proMethod");
            return (Criteria) this;
        }

        public Criteria andProMethodNotEqualTo(Integer value) {
            addCriterion("pro_method <>", value, "proMethod");
            return (Criteria) this;
        }

        public Criteria andProMethodGreaterThan(Integer value) {
            addCriterion("pro_method >", value, "proMethod");
            return (Criteria) this;
        }

        public Criteria andProMethodGreaterThanOrEqualTo(Integer value) {
            addCriterion("pro_method >=", value, "proMethod");
            return (Criteria) this;
        }

        public Criteria andProMethodLessThan(Integer value) {
            addCriterion("pro_method <", value, "proMethod");
            return (Criteria) this;
        }

        public Criteria andProMethodLessThanOrEqualTo(Integer value) {
            addCriterion("pro_method <=", value, "proMethod");
            return (Criteria) this;
        }

        public Criteria andProMethodIn(List<Integer> values) {
            addCriterion("pro_method in", values, "proMethod");
            return (Criteria) this;
        }

        public Criteria andProMethodNotIn(List<Integer> values) {
            addCriterion("pro_method not in", values, "proMethod");
            return (Criteria) this;
        }

        public Criteria andProMethodBetween(Integer value1, Integer value2) {
            addCriterion("pro_method between", value1, value2, "proMethod");
            return (Criteria) this;
        }

        public Criteria andProMethodNotBetween(Integer value1, Integer value2) {
            addCriterion("pro_method not between", value1, value2, "proMethod");
            return (Criteria) this;
        }

        public Criteria andGetMethodIsNull() {
            addCriterion("get_method is null");
            return (Criteria) this;
        }

        public Criteria andGetMethodIsNotNull() {
            addCriterion("get_method is not null");
            return (Criteria) this;
        }

        public Criteria andGetMethodEqualTo(Integer value) {
            addCriterion("get_method =", value, "getMethod");
            return (Criteria) this;
        }

        public Criteria andGetMethodNotEqualTo(Integer value) {
            addCriterion("get_method <>", value, "getMethod");
            return (Criteria) this;
        }

        public Criteria andGetMethodGreaterThan(Integer value) {
            addCriterion("get_method >", value, "getMethod");
            return (Criteria) this;
        }

        public Criteria andGetMethodGreaterThanOrEqualTo(Integer value) {
            addCriterion("get_method >=", value, "getMethod");
            return (Criteria) this;
        }

        public Criteria andGetMethodLessThan(Integer value) {
            addCriterion("get_method <", value, "getMethod");
            return (Criteria) this;
        }

        public Criteria andGetMethodLessThanOrEqualTo(Integer value) {
            addCriterion("get_method <=", value, "getMethod");
            return (Criteria) this;
        }

        public Criteria andGetMethodIn(List<Integer> values) {
            addCriterion("get_method in", values, "getMethod");
            return (Criteria) this;
        }

        public Criteria andGetMethodNotIn(List<Integer> values) {
            addCriterion("get_method not in", values, "getMethod");
            return (Criteria) this;
        }

        public Criteria andGetMethodBetween(Integer value1, Integer value2) {
            addCriterion("get_method between", value1, value2, "getMethod");
            return (Criteria) this;
        }

        public Criteria andGetMethodNotBetween(Integer value1, Integer value2) {
            addCriterion("get_method not between", value1, value2, "getMethod");
            return (Criteria) this;
        }

        public Criteria andConProductIsNull() {
            addCriterion("con_product is null");
            return (Criteria) this;
        }

        public Criteria andConProductIsNotNull() {
            addCriterion("con_product is not null");
            return (Criteria) this;
        }

        public Criteria andConProductEqualTo(Integer value) {
            addCriterion("con_product =", value, "conProduct");
            return (Criteria) this;
        }

        public Criteria andConProductNotEqualTo(Integer value) {
            addCriterion("con_product <>", value, "conProduct");
            return (Criteria) this;
        }

        public Criteria andConProductGreaterThan(Integer value) {
            addCriterion("con_product >", value, "conProduct");
            return (Criteria) this;
        }

        public Criteria andConProductGreaterThanOrEqualTo(Integer value) {
            addCriterion("con_product >=", value, "conProduct");
            return (Criteria) this;
        }

        public Criteria andConProductLessThan(Integer value) {
            addCriterion("con_product <", value, "conProduct");
            return (Criteria) this;
        }

        public Criteria andConProductLessThanOrEqualTo(Integer value) {
            addCriterion("con_product <=", value, "conProduct");
            return (Criteria) this;
        }

        public Criteria andConProductIn(List<Integer> values) {
            addCriterion("con_product in", values, "conProduct");
            return (Criteria) this;
        }

        public Criteria andConProductNotIn(List<Integer> values) {
            addCriterion("con_product not in", values, "conProduct");
            return (Criteria) this;
        }

        public Criteria andConProductBetween(Integer value1, Integer value2) {
            addCriterion("con_product between", value1, value2, "conProduct");
            return (Criteria) this;
        }

        public Criteria andConProductNotBetween(Integer value1, Integer value2) {
            addCriterion("con_product not between", value1, value2, "conProduct");
            return (Criteria) this;
        }

        public Criteria andConMethodIsNull() {
            addCriterion("con_method is null");
            return (Criteria) this;
        }

        public Criteria andConMethodIsNotNull() {
            addCriterion("con_method is not null");
            return (Criteria) this;
        }

        public Criteria andConMethodEqualTo(Integer value) {
            addCriterion("con_method =", value, "conMethod");
            return (Criteria) this;
        }

        public Criteria andConMethodNotEqualTo(Integer value) {
            addCriterion("con_method <>", value, "conMethod");
            return (Criteria) this;
        }

        public Criteria andConMethodGreaterThan(Integer value) {
            addCriterion("con_method >", value, "conMethod");
            return (Criteria) this;
        }

        public Criteria andConMethodGreaterThanOrEqualTo(Integer value) {
            addCriterion("con_method >=", value, "conMethod");
            return (Criteria) this;
        }

        public Criteria andConMethodLessThan(Integer value) {
            addCriterion("con_method <", value, "conMethod");
            return (Criteria) this;
        }

        public Criteria andConMethodLessThanOrEqualTo(Integer value) {
            addCriterion("con_method <=", value, "conMethod");
            return (Criteria) this;
        }

        public Criteria andConMethodIn(List<Integer> values) {
            addCriterion("con_method in", values, "conMethod");
            return (Criteria) this;
        }

        public Criteria andConMethodNotIn(List<Integer> values) {
            addCriterion("con_method not in", values, "conMethod");
            return (Criteria) this;
        }

        public Criteria andConMethodBetween(Integer value1, Integer value2) {
            addCriterion("con_method between", value1, value2, "conMethod");
            return (Criteria) this;
        }

        public Criteria andConMethodNotBetween(Integer value1, Integer value2) {
            addCriterion("con_method not between", value1, value2, "conMethod");
            return (Criteria) this;
        }

        public Criteria andActivityIdIsNull() {
            addCriterion("activity_id is null");
            return (Criteria) this;
        }

        public Criteria andActivityIdIsNotNull() {
            addCriterion("activity_id is not null");
            return (Criteria) this;
        }

        public Criteria andActivityIdEqualTo(String value) {
            addCriterion("activity_id =", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotEqualTo(String value) {
            addCriterion("activity_id <>", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThan(String value) {
            addCriterion("activity_id >", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThanOrEqualTo(String value) {
            addCriterion("activity_id >=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThan(String value) {
            addCriterion("activity_id <", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThanOrEqualTo(String value) {
            addCriterion("activity_id <=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLike(String value) {
            addCriterion("activity_id like", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotLike(String value) {
            addCriterion("activity_id not like", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdIn(List<String> values) {
            addCriterion("activity_id in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotIn(List<String> values) {
            addCriterion("activity_id not in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdBetween(String value1, String value2) {
            addCriterion("activity_id between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotBetween(String value1, String value2) {
            addCriterion("activity_id not between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andToUserIdIsNull() {
            addCriterion("to_user_id is null");
            return (Criteria) this;
        }

        public Criteria andToUserIdIsNotNull() {
            addCriterion("to_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andToUserIdEqualTo(String value) {
            addCriterion("to_user_id =", value, "toUserId");
            return (Criteria) this;
        }

        public Criteria andToUserIdNotEqualTo(String value) {
            addCriterion("to_user_id <>", value, "toUserId");
            return (Criteria) this;
        }

        public Criteria andToUserIdGreaterThan(String value) {
            addCriterion("to_user_id >", value, "toUserId");
            return (Criteria) this;
        }

        public Criteria andToUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("to_user_id >=", value, "toUserId");
            return (Criteria) this;
        }

        public Criteria andToUserIdLessThan(String value) {
            addCriterion("to_user_id <", value, "toUserId");
            return (Criteria) this;
        }

        public Criteria andToUserIdLessThanOrEqualTo(String value) {
            addCriterion("to_user_id <=", value, "toUserId");
            return (Criteria) this;
        }

        public Criteria andToUserIdLike(String value) {
            addCriterion("to_user_id like", value, "toUserId");
            return (Criteria) this;
        }

        public Criteria andToUserIdNotLike(String value) {
            addCriterion("to_user_id not like", value, "toUserId");
            return (Criteria) this;
        }

        public Criteria andToUserIdIn(List<String> values) {
            addCriterion("to_user_id in", values, "toUserId");
            return (Criteria) this;
        }

        public Criteria andToUserIdNotIn(List<String> values) {
            addCriterion("to_user_id not in", values, "toUserId");
            return (Criteria) this;
        }

        public Criteria andToUserIdBetween(String value1, String value2) {
            addCriterion("to_user_id between", value1, value2, "toUserId");
            return (Criteria) this;
        }

        public Criteria andToUserIdNotBetween(String value1, String value2) {
            addCriterion("to_user_id not between", value1, value2, "toUserId");
            return (Criteria) this;
        }

        public Criteria andToBrandIdIsNull() {
            addCriterion("to_brand_id is null");
            return (Criteria) this;
        }

        public Criteria andToBrandIdIsNotNull() {
            addCriterion("to_brand_id is not null");
            return (Criteria) this;
        }

        public Criteria andToBrandIdEqualTo(String value) {
            addCriterion("to_brand_id =", value, "toBrandId");
            return (Criteria) this;
        }

        public Criteria andToBrandIdNotEqualTo(String value) {
            addCriterion("to_brand_id <>", value, "toBrandId");
            return (Criteria) this;
        }

        public Criteria andToBrandIdGreaterThan(String value) {
            addCriterion("to_brand_id >", value, "toBrandId");
            return (Criteria) this;
        }

        public Criteria andToBrandIdGreaterThanOrEqualTo(String value) {
            addCriterion("to_brand_id >=", value, "toBrandId");
            return (Criteria) this;
        }

        public Criteria andToBrandIdLessThan(String value) {
            addCriterion("to_brand_id <", value, "toBrandId");
            return (Criteria) this;
        }

        public Criteria andToBrandIdLessThanOrEqualTo(String value) {
            addCriterion("to_brand_id <=", value, "toBrandId");
            return (Criteria) this;
        }

        public Criteria andToBrandIdLike(String value) {
            addCriterion("to_brand_id like", value, "toBrandId");
            return (Criteria) this;
        }

        public Criteria andToBrandIdNotLike(String value) {
            addCriterion("to_brand_id not like", value, "toBrandId");
            return (Criteria) this;
        }

        public Criteria andToBrandIdIn(List<String> values) {
            addCriterion("to_brand_id in", values, "toBrandId");
            return (Criteria) this;
        }

        public Criteria andToBrandIdNotIn(List<String> values) {
            addCriterion("to_brand_id not in", values, "toBrandId");
            return (Criteria) this;
        }

        public Criteria andToBrandIdBetween(String value1, String value2) {
            addCriterion("to_brand_id between", value1, value2, "toBrandId");
            return (Criteria) this;
        }

        public Criteria andToBrandIdNotBetween(String value1, String value2) {
            addCriterion("to_brand_id not between", value1, value2, "toBrandId");
            return (Criteria) this;
        }

        public Criteria andCouponIdIsNull() {
            addCriterion("coupon_id is null");
            return (Criteria) this;
        }

        public Criteria andCouponIdIsNotNull() {
            addCriterion("coupon_id is not null");
            return (Criteria) this;
        }

        public Criteria andCouponIdEqualTo(String value) {
            addCriterion("coupon_id =", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotEqualTo(String value) {
            addCriterion("coupon_id <>", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdGreaterThan(String value) {
            addCriterion("coupon_id >", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_id >=", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLessThan(String value) {
            addCriterion("coupon_id <", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLessThanOrEqualTo(String value) {
            addCriterion("coupon_id <=", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLike(String value) {
            addCriterion("coupon_id like", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotLike(String value) {
            addCriterion("coupon_id not like", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdIn(List<String> values) {
            addCriterion("coupon_id in", values, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotIn(List<String> values) {
            addCriterion("coupon_id not in", values, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdBetween(String value1, String value2) {
            addCriterion("coupon_id between", value1, value2, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotBetween(String value1, String value2) {
            addCriterion("coupon_id not between", value1, value2, "couponId");
            return (Criteria) this;
        }

        public Criteria andFeifanMoneyNumIsNull() {
            addCriterion("feifan_money_num is null");
            return (Criteria) this;
        }

        public Criteria andFeifanMoneyNumIsNotNull() {
            addCriterion("feifan_money_num is not null");
            return (Criteria) this;
        }

        public Criteria andFeifanMoneyNumEqualTo(Integer value) {
            addCriterion("feifan_money_num =", value, "feifanMoneyNum");
            return (Criteria) this;
        }

        public Criteria andFeifanMoneyNumNotEqualTo(Integer value) {
            addCriterion("feifan_money_num <>", value, "feifanMoneyNum");
            return (Criteria) this;
        }

        public Criteria andFeifanMoneyNumGreaterThan(Integer value) {
            addCriterion("feifan_money_num >", value, "feifanMoneyNum");
            return (Criteria) this;
        }

        public Criteria andFeifanMoneyNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("feifan_money_num >=", value, "feifanMoneyNum");
            return (Criteria) this;
        }

        public Criteria andFeifanMoneyNumLessThan(Integer value) {
            addCriterion("feifan_money_num <", value, "feifanMoneyNum");
            return (Criteria) this;
        }

        public Criteria andFeifanMoneyNumLessThanOrEqualTo(Integer value) {
            addCriterion("feifan_money_num <=", value, "feifanMoneyNum");
            return (Criteria) this;
        }

        public Criteria andFeifanMoneyNumIn(List<Integer> values) {
            addCriterion("feifan_money_num in", values, "feifanMoneyNum");
            return (Criteria) this;
        }

        public Criteria andFeifanMoneyNumNotIn(List<Integer> values) {
            addCriterion("feifan_money_num not in", values, "feifanMoneyNum");
            return (Criteria) this;
        }

        public Criteria andFeifanMoneyNumBetween(Integer value1, Integer value2) {
            addCriterion("feifan_money_num between", value1, value2, "feifanMoneyNum");
            return (Criteria) this;
        }

        public Criteria andFeifanMoneyNumNotBetween(Integer value1, Integer value2) {
            addCriterion("feifan_money_num not between", value1, value2, "feifanMoneyNum");
            return (Criteria) this;
        }

        public Criteria andActivityIdLikeInsensitive(String value) {
            addCriterion("upper(activity_id) like", value.toUpperCase(), "activityId");
            return (Criteria) this;
        }

        public Criteria andUserIdLikeInsensitive(String value) {
            addCriterion("upper(user_id) like", value.toUpperCase(), "userId");
            return (Criteria) this;
        }

        public Criteria andToUserIdLikeInsensitive(String value) {
            addCriterion("upper(to_user_id) like", value.toUpperCase(), "toUserId");
            return (Criteria) this;
        }

        public Criteria andToBrandIdLikeInsensitive(String value) {
            addCriterion("upper(to_brand_id) like", value.toUpperCase(), "toBrandId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLikeInsensitive(String value) {
            addCriterion("upper(coupon_id) like", value.toUpperCase(), "couponId");
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