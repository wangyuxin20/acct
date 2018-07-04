package com.wa.apiaccount.core.model.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AcctCountTranExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AcctCountTranExample() {
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

        public Criteria andDayendIdIsNull() {
            addCriterion("dayend_id is null");
            return (Criteria) this;
        }

        public Criteria andDayendIdIsNotNull() {
            addCriterion("dayend_id is not null");
            return (Criteria) this;
        }

        public Criteria andDayendIdEqualTo(Long value) {
            addCriterion("dayend_id =", value, "dayendId");
            return (Criteria) this;
        }

        public Criteria andDayendIdNotEqualTo(Long value) {
            addCriterion("dayend_id <>", value, "dayendId");
            return (Criteria) this;
        }

        public Criteria andDayendIdGreaterThan(Long value) {
            addCriterion("dayend_id >", value, "dayendId");
            return (Criteria) this;
        }

        public Criteria andDayendIdGreaterThanOrEqualTo(Long value) {
            addCriterion("dayend_id >=", value, "dayendId");
            return (Criteria) this;
        }

        public Criteria andDayendIdLessThan(Long value) {
            addCriterion("dayend_id <", value, "dayendId");
            return (Criteria) this;
        }

        public Criteria andDayendIdLessThanOrEqualTo(Long value) {
            addCriterion("dayend_id <=", value, "dayendId");
            return (Criteria) this;
        }

        public Criteria andDayendIdIn(List<Long> values) {
            addCriterion("dayend_id in", values, "dayendId");
            return (Criteria) this;
        }

        public Criteria andDayendIdNotIn(List<Long> values) {
            addCriterion("dayend_id not in", values, "dayendId");
            return (Criteria) this;
        }

        public Criteria andDayendIdBetween(Long value1, Long value2) {
            addCriterion("dayend_id between", value1, value2, "dayendId");
            return (Criteria) this;
        }

        public Criteria andDayendIdNotBetween(Long value1, Long value2) {
            addCriterion("dayend_id not between", value1, value2, "dayendId");
            return (Criteria) this;
        }

        public Criteria andCountDateIsNull() {
            addCriterion("count_date is null");
            return (Criteria) this;
        }

        public Criteria andCountDateIsNotNull() {
            addCriterion("count_date is not null");
            return (Criteria) this;
        }

        public Criteria andCountDateEqualTo(String value) {
            addCriterion("count_date =", value, "countDate");
            return (Criteria) this;
        }

        public Criteria andCountDateNotEqualTo(String value) {
            addCriterion("count_date <>", value, "countDate");
            return (Criteria) this;
        }

        public Criteria andCountDateGreaterThan(String value) {
            addCriterion("count_date >", value, "countDate");
            return (Criteria) this;
        }

        public Criteria andCountDateGreaterThanOrEqualTo(String value) {
            addCriterion("count_date >=", value, "countDate");
            return (Criteria) this;
        }

        public Criteria andCountDateLessThan(String value) {
            addCriterion("count_date <", value, "countDate");
            return (Criteria) this;
        }

        public Criteria andCountDateLessThanOrEqualTo(String value) {
            addCriterion("count_date <=", value, "countDate");
            return (Criteria) this;
        }

        public Criteria andCountDateLike(String value) {
            addCriterion("count_date like", value, "countDate");
            return (Criteria) this;
        }

        public Criteria andCountDateNotLike(String value) {
            addCriterion("count_date not like", value, "countDate");
            return (Criteria) this;
        }

        public Criteria andCountDateIn(List<String> values) {
            addCriterion("count_date in", values, "countDate");
            return (Criteria) this;
        }

        public Criteria andCountDateNotIn(List<String> values) {
            addCriterion("count_date not in", values, "countDate");
            return (Criteria) this;
        }

        public Criteria andCountDateBetween(String value1, String value2) {
            addCriterion("count_date between", value1, value2, "countDate");
            return (Criteria) this;
        }

        public Criteria andCountDateNotBetween(String value1, String value2) {
            addCriterion("count_date not between", value1, value2, "countDate");
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

        public Criteria andTranStatusIsNull() {
            addCriterion("tran_status is null");
            return (Criteria) this;
        }

        public Criteria andTranStatusIsNotNull() {
            addCriterion("tran_status is not null");
            return (Criteria) this;
        }

        public Criteria andTranStatusEqualTo(Integer value) {
            addCriterion("tran_status =", value, "tranStatus");
            return (Criteria) this;
        }

        public Criteria andTranStatusNotEqualTo(Integer value) {
            addCriterion("tran_status <>", value, "tranStatus");
            return (Criteria) this;
        }

        public Criteria andTranStatusGreaterThan(Integer value) {
            addCriterion("tran_status >", value, "tranStatus");
            return (Criteria) this;
        }

        public Criteria andTranStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("tran_status >=", value, "tranStatus");
            return (Criteria) this;
        }

        public Criteria andTranStatusLessThan(Integer value) {
            addCriterion("tran_status <", value, "tranStatus");
            return (Criteria) this;
        }

        public Criteria andTranStatusLessThanOrEqualTo(Integer value) {
            addCriterion("tran_status <=", value, "tranStatus");
            return (Criteria) this;
        }

        public Criteria andTranStatusIn(List<Integer> values) {
            addCriterion("tran_status in", values, "tranStatus");
            return (Criteria) this;
        }

        public Criteria andTranStatusNotIn(List<Integer> values) {
            addCriterion("tran_status not in", values, "tranStatus");
            return (Criteria) this;
        }

        public Criteria andTranStatusBetween(Integer value1, Integer value2) {
            addCriterion("tran_status between", value1, value2, "tranStatus");
            return (Criteria) this;
        }

        public Criteria andTranStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("tran_status not between", value1, value2, "tranStatus");
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

        public Criteria andCurrNameIsNull() {
            addCriterion("curr_name is null");
            return (Criteria) this;
        }

        public Criteria andCurrNameIsNotNull() {
            addCriterion("curr_name is not null");
            return (Criteria) this;
        }

        public Criteria andCurrNameEqualTo(String value) {
            addCriterion("curr_name =", value, "currName");
            return (Criteria) this;
        }

        public Criteria andCurrNameNotEqualTo(String value) {
            addCriterion("curr_name <>", value, "currName");
            return (Criteria) this;
        }

        public Criteria andCurrNameGreaterThan(String value) {
            addCriterion("curr_name >", value, "currName");
            return (Criteria) this;
        }

        public Criteria andCurrNameGreaterThanOrEqualTo(String value) {
            addCriterion("curr_name >=", value, "currName");
            return (Criteria) this;
        }

        public Criteria andCurrNameLessThan(String value) {
            addCriterion("curr_name <", value, "currName");
            return (Criteria) this;
        }

        public Criteria andCurrNameLessThanOrEqualTo(String value) {
            addCriterion("curr_name <=", value, "currName");
            return (Criteria) this;
        }

        public Criteria andCurrNameLike(String value) {
            addCriterion("curr_name like", value, "currName");
            return (Criteria) this;
        }

        public Criteria andCurrNameNotLike(String value) {
            addCriterion("curr_name not like", value, "currName");
            return (Criteria) this;
        }

        public Criteria andCurrNameIn(List<String> values) {
            addCriterion("curr_name in", values, "currName");
            return (Criteria) this;
        }

        public Criteria andCurrNameNotIn(List<String> values) {
            addCriterion("curr_name not in", values, "currName");
            return (Criteria) this;
        }

        public Criteria andCurrNameBetween(String value1, String value2) {
            addCriterion("curr_name between", value1, value2, "currName");
            return (Criteria) this;
        }

        public Criteria andCurrNameNotBetween(String value1, String value2) {
            addCriterion("curr_name not between", value1, value2, "currName");
            return (Criteria) this;
        }

        public Criteria andSumAmtIsNull() {
            addCriterion("sum_amt is null");
            return (Criteria) this;
        }

        public Criteria andSumAmtIsNotNull() {
            addCriterion("sum_amt is not null");
            return (Criteria) this;
        }

        public Criteria andSumAmtEqualTo(BigDecimal value) {
            addCriterion("sum_amt =", value, "sumAmt");
            return (Criteria) this;
        }

        public Criteria andSumAmtNotEqualTo(BigDecimal value) {
            addCriterion("sum_amt <>", value, "sumAmt");
            return (Criteria) this;
        }

        public Criteria andSumAmtGreaterThan(BigDecimal value) {
            addCriterion("sum_amt >", value, "sumAmt");
            return (Criteria) this;
        }

        public Criteria andSumAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sum_amt >=", value, "sumAmt");
            return (Criteria) this;
        }

        public Criteria andSumAmtLessThan(BigDecimal value) {
            addCriterion("sum_amt <", value, "sumAmt");
            return (Criteria) this;
        }

        public Criteria andSumAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sum_amt <=", value, "sumAmt");
            return (Criteria) this;
        }

        public Criteria andSumAmtIn(List<BigDecimal> values) {
            addCriterion("sum_amt in", values, "sumAmt");
            return (Criteria) this;
        }

        public Criteria andSumAmtNotIn(List<BigDecimal> values) {
            addCriterion("sum_amt not in", values, "sumAmt");
            return (Criteria) this;
        }

        public Criteria andSumAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sum_amt between", value1, value2, "sumAmt");
            return (Criteria) this;
        }

        public Criteria andSumAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sum_amt not between", value1, value2, "sumAmt");
            return (Criteria) this;
        }

        public Criteria andCommentIsNull() {
            addCriterion("comment is null");
            return (Criteria) this;
        }

        public Criteria andCommentIsNotNull() {
            addCriterion("comment is not null");
            return (Criteria) this;
        }

        public Criteria andCommentEqualTo(String value) {
            addCriterion("comment =", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotEqualTo(String value) {
            addCriterion("comment <>", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThan(String value) {
            addCriterion("comment >", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThanOrEqualTo(String value) {
            addCriterion("comment >=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThan(String value) {
            addCriterion("comment <", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThanOrEqualTo(String value) {
            addCriterion("comment <=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLike(String value) {
            addCriterion("comment like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotLike(String value) {
            addCriterion("comment not like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentIn(List<String> values) {
            addCriterion("comment in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotIn(List<String> values) {
            addCriterion("comment not in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentBetween(String value1, String value2) {
            addCriterion("comment between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotBetween(String value1, String value2) {
            addCriterion("comment not between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCountDateLikeInsensitive(String value) {
            addCriterion("upper(count_date) like", value.toUpperCase(), "countDate");
            return (Criteria) this;
        }

        public Criteria andTranCodeLikeInsensitive(String value) {
            addCriterion("upper(tran_code) like", value.toUpperCase(), "tranCode");
            return (Criteria) this;
        }

        public Criteria andCurrNoLikeInsensitive(String value) {
            addCriterion("upper(curr_no) like", value.toUpperCase(), "currNo");
            return (Criteria) this;
        }

        public Criteria andCurrNameLikeInsensitive(String value) {
            addCriterion("upper(curr_name) like", value.toUpperCase(), "currName");
            return (Criteria) this;
        }

        public Criteria andCommentLikeInsensitive(String value) {
            addCriterion("upper(comment) like", value.toUpperCase(), "comment");
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