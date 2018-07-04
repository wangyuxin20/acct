package com.wa.apiaccount.core.model.domain;

import java.util.ArrayList;
import java.util.List;

public class AcctValidExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AcctValidExample() {
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

        public Criteria andTranClassIsNull() {
            addCriterion("tran_class is null");
            return (Criteria) this;
        }

        public Criteria andTranClassIsNotNull() {
            addCriterion("tran_class is not null");
            return (Criteria) this;
        }

        public Criteria andTranClassEqualTo(String value) {
            addCriterion("tran_class =", value, "tranClass");
            return (Criteria) this;
        }

        public Criteria andTranClassNotEqualTo(String value) {
            addCriterion("tran_class <>", value, "tranClass");
            return (Criteria) this;
        }

        public Criteria andTranClassGreaterThan(String value) {
            addCriterion("tran_class >", value, "tranClass");
            return (Criteria) this;
        }

        public Criteria andTranClassGreaterThanOrEqualTo(String value) {
            addCriterion("tran_class >=", value, "tranClass");
            return (Criteria) this;
        }

        public Criteria andTranClassLessThan(String value) {
            addCriterion("tran_class <", value, "tranClass");
            return (Criteria) this;
        }

        public Criteria andTranClassLessThanOrEqualTo(String value) {
            addCriterion("tran_class <=", value, "tranClass");
            return (Criteria) this;
        }

        public Criteria andTranClassLike(String value) {
            addCriterion("tran_class like", value, "tranClass");
            return (Criteria) this;
        }

        public Criteria andTranClassNotLike(String value) {
            addCriterion("tran_class not like", value, "tranClass");
            return (Criteria) this;
        }

        public Criteria andTranClassIn(List<String> values) {
            addCriterion("tran_class in", values, "tranClass");
            return (Criteria) this;
        }

        public Criteria andTranClassNotIn(List<String> values) {
            addCriterion("tran_class not in", values, "tranClass");
            return (Criteria) this;
        }

        public Criteria andTranClassBetween(String value1, String value2) {
            addCriterion("tran_class between", value1, value2, "tranClass");
            return (Criteria) this;
        }

        public Criteria andTranClassNotBetween(String value1, String value2) {
            addCriterion("tran_class not between", value1, value2, "tranClass");
            return (Criteria) this;
        }

        public Criteria andMsgTypeIsNull() {
            addCriterion("msg_type is null");
            return (Criteria) this;
        }

        public Criteria andMsgTypeIsNotNull() {
            addCriterion("msg_type is not null");
            return (Criteria) this;
        }

        public Criteria andMsgTypeEqualTo(String value) {
            addCriterion("msg_type =", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeNotEqualTo(String value) {
            addCriterion("msg_type <>", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeGreaterThan(String value) {
            addCriterion("msg_type >", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeGreaterThanOrEqualTo(String value) {
            addCriterion("msg_type >=", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeLessThan(String value) {
            addCriterion("msg_type <", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeLessThanOrEqualTo(String value) {
            addCriterion("msg_type <=", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeLike(String value) {
            addCriterion("msg_type like", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeNotLike(String value) {
            addCriterion("msg_type not like", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeIn(List<String> values) {
            addCriterion("msg_type in", values, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeNotIn(List<String> values) {
            addCriterion("msg_type not in", values, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeBetween(String value1, String value2) {
            addCriterion("msg_type between", value1, value2, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeNotBetween(String value1, String value2) {
            addCriterion("msg_type not between", value1, value2, "msgType");
            return (Criteria) this;
        }

        public Criteria andFieldNameIsNull() {
            addCriterion("field_name is null");
            return (Criteria) this;
        }

        public Criteria andFieldNameIsNotNull() {
            addCriterion("field_name is not null");
            return (Criteria) this;
        }

        public Criteria andFieldNameEqualTo(String value) {
            addCriterion("field_name =", value, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameNotEqualTo(String value) {
            addCriterion("field_name <>", value, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameGreaterThan(String value) {
            addCriterion("field_name >", value, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameGreaterThanOrEqualTo(String value) {
            addCriterion("field_name >=", value, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameLessThan(String value) {
            addCriterion("field_name <", value, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameLessThanOrEqualTo(String value) {
            addCriterion("field_name <=", value, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameLike(String value) {
            addCriterion("field_name like", value, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameNotLike(String value) {
            addCriterion("field_name not like", value, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameIn(List<String> values) {
            addCriterion("field_name in", values, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameNotIn(List<String> values) {
            addCriterion("field_name not in", values, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameBetween(String value1, String value2) {
            addCriterion("field_name between", value1, value2, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameNotBetween(String value1, String value2) {
            addCriterion("field_name not between", value1, value2, "fieldName");
            return (Criteria) this;
        }

        public Criteria andValidSeqIsNull() {
            addCriterion("valid_seq is null");
            return (Criteria) this;
        }

        public Criteria andValidSeqIsNotNull() {
            addCriterion("valid_seq is not null");
            return (Criteria) this;
        }

        public Criteria andValidSeqEqualTo(Integer value) {
            addCriterion("valid_seq =", value, "validSeq");
            return (Criteria) this;
        }

        public Criteria andValidSeqNotEqualTo(Integer value) {
            addCriterion("valid_seq <>", value, "validSeq");
            return (Criteria) this;
        }

        public Criteria andValidSeqGreaterThan(Integer value) {
            addCriterion("valid_seq >", value, "validSeq");
            return (Criteria) this;
        }

        public Criteria andValidSeqGreaterThanOrEqualTo(Integer value) {
            addCriterion("valid_seq >=", value, "validSeq");
            return (Criteria) this;
        }

        public Criteria andValidSeqLessThan(Integer value) {
            addCriterion("valid_seq <", value, "validSeq");
            return (Criteria) this;
        }

        public Criteria andValidSeqLessThanOrEqualTo(Integer value) {
            addCriterion("valid_seq <=", value, "validSeq");
            return (Criteria) this;
        }

        public Criteria andValidSeqIn(List<Integer> values) {
            addCriterion("valid_seq in", values, "validSeq");
            return (Criteria) this;
        }

        public Criteria andValidSeqNotIn(List<Integer> values) {
            addCriterion("valid_seq not in", values, "validSeq");
            return (Criteria) this;
        }

        public Criteria andValidSeqBetween(Integer value1, Integer value2) {
            addCriterion("valid_seq between", value1, value2, "validSeq");
            return (Criteria) this;
        }

        public Criteria andValidSeqNotBetween(Integer value1, Integer value2) {
            addCriterion("valid_seq not between", value1, value2, "validSeq");
            return (Criteria) this;
        }

        public Criteria andFiledDescIsNull() {
            addCriterion("filed_desc is null");
            return (Criteria) this;
        }

        public Criteria andFiledDescIsNotNull() {
            addCriterion("filed_desc is not null");
            return (Criteria) this;
        }

        public Criteria andFiledDescEqualTo(String value) {
            addCriterion("filed_desc =", value, "filedDesc");
            return (Criteria) this;
        }

        public Criteria andFiledDescNotEqualTo(String value) {
            addCriterion("filed_desc <>", value, "filedDesc");
            return (Criteria) this;
        }

        public Criteria andFiledDescGreaterThan(String value) {
            addCriterion("filed_desc >", value, "filedDesc");
            return (Criteria) this;
        }

        public Criteria andFiledDescGreaterThanOrEqualTo(String value) {
            addCriterion("filed_desc >=", value, "filedDesc");
            return (Criteria) this;
        }

        public Criteria andFiledDescLessThan(String value) {
            addCriterion("filed_desc <", value, "filedDesc");
            return (Criteria) this;
        }

        public Criteria andFiledDescLessThanOrEqualTo(String value) {
            addCriterion("filed_desc <=", value, "filedDesc");
            return (Criteria) this;
        }

        public Criteria andFiledDescLike(String value) {
            addCriterion("filed_desc like", value, "filedDesc");
            return (Criteria) this;
        }

        public Criteria andFiledDescNotLike(String value) {
            addCriterion("filed_desc not like", value, "filedDesc");
            return (Criteria) this;
        }

        public Criteria andFiledDescIn(List<String> values) {
            addCriterion("filed_desc in", values, "filedDesc");
            return (Criteria) this;
        }

        public Criteria andFiledDescNotIn(List<String> values) {
            addCriterion("filed_desc not in", values, "filedDesc");
            return (Criteria) this;
        }

        public Criteria andFiledDescBetween(String value1, String value2) {
            addCriterion("filed_desc between", value1, value2, "filedDesc");
            return (Criteria) this;
        }

        public Criteria andFiledDescNotBetween(String value1, String value2) {
            addCriterion("filed_desc not between", value1, value2, "filedDesc");
            return (Criteria) this;
        }

        public Criteria andFiledTypeIsNull() {
            addCriterion("filed_type is null");
            return (Criteria) this;
        }

        public Criteria andFiledTypeIsNotNull() {
            addCriterion("filed_type is not null");
            return (Criteria) this;
        }

        public Criteria andFiledTypeEqualTo(String value) {
            addCriterion("filed_type =", value, "filedType");
            return (Criteria) this;
        }

        public Criteria andFiledTypeNotEqualTo(String value) {
            addCriterion("filed_type <>", value, "filedType");
            return (Criteria) this;
        }

        public Criteria andFiledTypeGreaterThan(String value) {
            addCriterion("filed_type >", value, "filedType");
            return (Criteria) this;
        }

        public Criteria andFiledTypeGreaterThanOrEqualTo(String value) {
            addCriterion("filed_type >=", value, "filedType");
            return (Criteria) this;
        }

        public Criteria andFiledTypeLessThan(String value) {
            addCriterion("filed_type <", value, "filedType");
            return (Criteria) this;
        }

        public Criteria andFiledTypeLessThanOrEqualTo(String value) {
            addCriterion("filed_type <=", value, "filedType");
            return (Criteria) this;
        }

        public Criteria andFiledTypeLike(String value) {
            addCriterion("filed_type like", value, "filedType");
            return (Criteria) this;
        }

        public Criteria andFiledTypeNotLike(String value) {
            addCriterion("filed_type not like", value, "filedType");
            return (Criteria) this;
        }

        public Criteria andFiledTypeIn(List<String> values) {
            addCriterion("filed_type in", values, "filedType");
            return (Criteria) this;
        }

        public Criteria andFiledTypeNotIn(List<String> values) {
            addCriterion("filed_type not in", values, "filedType");
            return (Criteria) this;
        }

        public Criteria andFiledTypeBetween(String value1, String value2) {
            addCriterion("filed_type between", value1, value2, "filedType");
            return (Criteria) this;
        }

        public Criteria andFiledTypeNotBetween(String value1, String value2) {
            addCriterion("filed_type not between", value1, value2, "filedType");
            return (Criteria) this;
        }

        public Criteria andFiledFixedIsNull() {
            addCriterion("filed_fixed is null");
            return (Criteria) this;
        }

        public Criteria andFiledFixedIsNotNull() {
            addCriterion("filed_fixed is not null");
            return (Criteria) this;
        }

        public Criteria andFiledFixedEqualTo(String value) {
            addCriterion("filed_fixed =", value, "filedFixed");
            return (Criteria) this;
        }

        public Criteria andFiledFixedNotEqualTo(String value) {
            addCriterion("filed_fixed <>", value, "filedFixed");
            return (Criteria) this;
        }

        public Criteria andFiledFixedGreaterThan(String value) {
            addCriterion("filed_fixed >", value, "filedFixed");
            return (Criteria) this;
        }

        public Criteria andFiledFixedGreaterThanOrEqualTo(String value) {
            addCriterion("filed_fixed >=", value, "filedFixed");
            return (Criteria) this;
        }

        public Criteria andFiledFixedLessThan(String value) {
            addCriterion("filed_fixed <", value, "filedFixed");
            return (Criteria) this;
        }

        public Criteria andFiledFixedLessThanOrEqualTo(String value) {
            addCriterion("filed_fixed <=", value, "filedFixed");
            return (Criteria) this;
        }

        public Criteria andFiledFixedLike(String value) {
            addCriterion("filed_fixed like", value, "filedFixed");
            return (Criteria) this;
        }

        public Criteria andFiledFixedNotLike(String value) {
            addCriterion("filed_fixed not like", value, "filedFixed");
            return (Criteria) this;
        }

        public Criteria andFiledFixedIn(List<String> values) {
            addCriterion("filed_fixed in", values, "filedFixed");
            return (Criteria) this;
        }

        public Criteria andFiledFixedNotIn(List<String> values) {
            addCriterion("filed_fixed not in", values, "filedFixed");
            return (Criteria) this;
        }

        public Criteria andFiledFixedBetween(String value1, String value2) {
            addCriterion("filed_fixed between", value1, value2, "filedFixed");
            return (Criteria) this;
        }

        public Criteria andFiledFixedNotBetween(String value1, String value2) {
            addCriterion("filed_fixed not between", value1, value2, "filedFixed");
            return (Criteria) this;
        }

        public Criteria andFiledLengthIsNull() {
            addCriterion("filed_length is null");
            return (Criteria) this;
        }

        public Criteria andFiledLengthIsNotNull() {
            addCriterion("filed_length is not null");
            return (Criteria) this;
        }

        public Criteria andFiledLengthEqualTo(Integer value) {
            addCriterion("filed_length =", value, "filedLength");
            return (Criteria) this;
        }

        public Criteria andFiledLengthNotEqualTo(Integer value) {
            addCriterion("filed_length <>", value, "filedLength");
            return (Criteria) this;
        }

        public Criteria andFiledLengthGreaterThan(Integer value) {
            addCriterion("filed_length >", value, "filedLength");
            return (Criteria) this;
        }

        public Criteria andFiledLengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("filed_length >=", value, "filedLength");
            return (Criteria) this;
        }

        public Criteria andFiledLengthLessThan(Integer value) {
            addCriterion("filed_length <", value, "filedLength");
            return (Criteria) this;
        }

        public Criteria andFiledLengthLessThanOrEqualTo(Integer value) {
            addCriterion("filed_length <=", value, "filedLength");
            return (Criteria) this;
        }

        public Criteria andFiledLengthIn(List<Integer> values) {
            addCriterion("filed_length in", values, "filedLength");
            return (Criteria) this;
        }

        public Criteria andFiledLengthNotIn(List<Integer> values) {
            addCriterion("filed_length not in", values, "filedLength");
            return (Criteria) this;
        }

        public Criteria andFiledLengthBetween(Integer value1, Integer value2) {
            addCriterion("filed_length between", value1, value2, "filedLength");
            return (Criteria) this;
        }

        public Criteria andFiledLengthNotBetween(Integer value1, Integer value2) {
            addCriterion("filed_length not between", value1, value2, "filedLength");
            return (Criteria) this;
        }

        public Criteria andFieldBytesIsNull() {
            addCriterion("field_bytes is null");
            return (Criteria) this;
        }

        public Criteria andFieldBytesIsNotNull() {
            addCriterion("field_bytes is not null");
            return (Criteria) this;
        }

        public Criteria andFieldBytesEqualTo(Integer value) {
            addCriterion("field_bytes =", value, "fieldBytes");
            return (Criteria) this;
        }

        public Criteria andFieldBytesNotEqualTo(Integer value) {
            addCriterion("field_bytes <>", value, "fieldBytes");
            return (Criteria) this;
        }

        public Criteria andFieldBytesGreaterThan(Integer value) {
            addCriterion("field_bytes >", value, "fieldBytes");
            return (Criteria) this;
        }

        public Criteria andFieldBytesGreaterThanOrEqualTo(Integer value) {
            addCriterion("field_bytes >=", value, "fieldBytes");
            return (Criteria) this;
        }

        public Criteria andFieldBytesLessThan(Integer value) {
            addCriterion("field_bytes <", value, "fieldBytes");
            return (Criteria) this;
        }

        public Criteria andFieldBytesLessThanOrEqualTo(Integer value) {
            addCriterion("field_bytes <=", value, "fieldBytes");
            return (Criteria) this;
        }

        public Criteria andFieldBytesIn(List<Integer> values) {
            addCriterion("field_bytes in", values, "fieldBytes");
            return (Criteria) this;
        }

        public Criteria andFieldBytesNotIn(List<Integer> values) {
            addCriterion("field_bytes not in", values, "fieldBytes");
            return (Criteria) this;
        }

        public Criteria andFieldBytesBetween(Integer value1, Integer value2) {
            addCriterion("field_bytes between", value1, value2, "fieldBytes");
            return (Criteria) this;
        }

        public Criteria andFieldBytesNotBetween(Integer value1, Integer value2) {
            addCriterion("field_bytes not between", value1, value2, "fieldBytes");
            return (Criteria) this;
        }

        public Criteria andSignIsNull() {
            addCriterion("sign is null");
            return (Criteria) this;
        }

        public Criteria andSignIsNotNull() {
            addCriterion("sign is not null");
            return (Criteria) this;
        }

        public Criteria andSignEqualTo(String value) {
            addCriterion("sign =", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotEqualTo(String value) {
            addCriterion("sign <>", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignGreaterThan(String value) {
            addCriterion("sign >", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignGreaterThanOrEqualTo(String value) {
            addCriterion("sign >=", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignLessThan(String value) {
            addCriterion("sign <", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignLessThanOrEqualTo(String value) {
            addCriterion("sign <=", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignLike(String value) {
            addCriterion("sign like", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotLike(String value) {
            addCriterion("sign not like", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignIn(List<String> values) {
            addCriterion("sign in", values, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotIn(List<String> values) {
            addCriterion("sign not in", values, "sign");
            return (Criteria) this;
        }

        public Criteria andSignBetween(String value1, String value2) {
            addCriterion("sign between", value1, value2, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotBetween(String value1, String value2) {
            addCriterion("sign not between", value1, value2, "sign");
            return (Criteria) this;
        }

        public Criteria andValidExpressionIsNull() {
            addCriterion("valid_expression is null");
            return (Criteria) this;
        }

        public Criteria andValidExpressionIsNotNull() {
            addCriterion("valid_expression is not null");
            return (Criteria) this;
        }

        public Criteria andValidExpressionEqualTo(String value) {
            addCriterion("valid_expression =", value, "validExpression");
            return (Criteria) this;
        }

        public Criteria andValidExpressionNotEqualTo(String value) {
            addCriterion("valid_expression <>", value, "validExpression");
            return (Criteria) this;
        }

        public Criteria andValidExpressionGreaterThan(String value) {
            addCriterion("valid_expression >", value, "validExpression");
            return (Criteria) this;
        }

        public Criteria andValidExpressionGreaterThanOrEqualTo(String value) {
            addCriterion("valid_expression >=", value, "validExpression");
            return (Criteria) this;
        }

        public Criteria andValidExpressionLessThan(String value) {
            addCriterion("valid_expression <", value, "validExpression");
            return (Criteria) this;
        }

        public Criteria andValidExpressionLessThanOrEqualTo(String value) {
            addCriterion("valid_expression <=", value, "validExpression");
            return (Criteria) this;
        }

        public Criteria andValidExpressionLike(String value) {
            addCriterion("valid_expression like", value, "validExpression");
            return (Criteria) this;
        }

        public Criteria andValidExpressionNotLike(String value) {
            addCriterion("valid_expression not like", value, "validExpression");
            return (Criteria) this;
        }

        public Criteria andValidExpressionIn(List<String> values) {
            addCriterion("valid_expression in", values, "validExpression");
            return (Criteria) this;
        }

        public Criteria andValidExpressionNotIn(List<String> values) {
            addCriterion("valid_expression not in", values, "validExpression");
            return (Criteria) this;
        }

        public Criteria andValidExpressionBetween(String value1, String value2) {
            addCriterion("valid_expression between", value1, value2, "validExpression");
            return (Criteria) this;
        }

        public Criteria andValidExpressionNotBetween(String value1, String value2) {
            addCriterion("valid_expression not between", value1, value2, "validExpression");
            return (Criteria) this;
        }

        public Criteria andValidDescIsNull() {
            addCriterion("valid_desc is null");
            return (Criteria) this;
        }

        public Criteria andValidDescIsNotNull() {
            addCriterion("valid_desc is not null");
            return (Criteria) this;
        }

        public Criteria andValidDescEqualTo(String value) {
            addCriterion("valid_desc =", value, "validDesc");
            return (Criteria) this;
        }

        public Criteria andValidDescNotEqualTo(String value) {
            addCriterion("valid_desc <>", value, "validDesc");
            return (Criteria) this;
        }

        public Criteria andValidDescGreaterThan(String value) {
            addCriterion("valid_desc >", value, "validDesc");
            return (Criteria) this;
        }

        public Criteria andValidDescGreaterThanOrEqualTo(String value) {
            addCriterion("valid_desc >=", value, "validDesc");
            return (Criteria) this;
        }

        public Criteria andValidDescLessThan(String value) {
            addCriterion("valid_desc <", value, "validDesc");
            return (Criteria) this;
        }

        public Criteria andValidDescLessThanOrEqualTo(String value) {
            addCriterion("valid_desc <=", value, "validDesc");
            return (Criteria) this;
        }

        public Criteria andValidDescLike(String value) {
            addCriterion("valid_desc like", value, "validDesc");
            return (Criteria) this;
        }

        public Criteria andValidDescNotLike(String value) {
            addCriterion("valid_desc not like", value, "validDesc");
            return (Criteria) this;
        }

        public Criteria andValidDescIn(List<String> values) {
            addCriterion("valid_desc in", values, "validDesc");
            return (Criteria) this;
        }

        public Criteria andValidDescNotIn(List<String> values) {
            addCriterion("valid_desc not in", values, "validDesc");
            return (Criteria) this;
        }

        public Criteria andValidDescBetween(String value1, String value2) {
            addCriterion("valid_desc between", value1, value2, "validDesc");
            return (Criteria) this;
        }

        public Criteria andValidDescNotBetween(String value1, String value2) {
            addCriterion("valid_desc not between", value1, value2, "validDesc");
            return (Criteria) this;
        }

        public Criteria andValidNesyIsNull() {
            addCriterion("valid_nesy is null");
            return (Criteria) this;
        }

        public Criteria andValidNesyIsNotNull() {
            addCriterion("valid_nesy is not null");
            return (Criteria) this;
        }

        public Criteria andValidNesyEqualTo(String value) {
            addCriterion("valid_nesy =", value, "validNesy");
            return (Criteria) this;
        }

        public Criteria andValidNesyNotEqualTo(String value) {
            addCriterion("valid_nesy <>", value, "validNesy");
            return (Criteria) this;
        }

        public Criteria andValidNesyGreaterThan(String value) {
            addCriterion("valid_nesy >", value, "validNesy");
            return (Criteria) this;
        }

        public Criteria andValidNesyGreaterThanOrEqualTo(String value) {
            addCriterion("valid_nesy >=", value, "validNesy");
            return (Criteria) this;
        }

        public Criteria andValidNesyLessThan(String value) {
            addCriterion("valid_nesy <", value, "validNesy");
            return (Criteria) this;
        }

        public Criteria andValidNesyLessThanOrEqualTo(String value) {
            addCriterion("valid_nesy <=", value, "validNesy");
            return (Criteria) this;
        }

        public Criteria andValidNesyLike(String value) {
            addCriterion("valid_nesy like", value, "validNesy");
            return (Criteria) this;
        }

        public Criteria andValidNesyNotLike(String value) {
            addCriterion("valid_nesy not like", value, "validNesy");
            return (Criteria) this;
        }

        public Criteria andValidNesyIn(List<String> values) {
            addCriterion("valid_nesy in", values, "validNesy");
            return (Criteria) this;
        }

        public Criteria andValidNesyNotIn(List<String> values) {
            addCriterion("valid_nesy not in", values, "validNesy");
            return (Criteria) this;
        }

        public Criteria andValidNesyBetween(String value1, String value2) {
            addCriterion("valid_nesy between", value1, value2, "validNesy");
            return (Criteria) this;
        }

        public Criteria andValidNesyNotBetween(String value1, String value2) {
            addCriterion("valid_nesy not between", value1, value2, "validNesy");
            return (Criteria) this;
        }

        public Criteria andValidDemoIsNull() {
            addCriterion("valid_demo is null");
            return (Criteria) this;
        }

        public Criteria andValidDemoIsNotNull() {
            addCriterion("valid_demo is not null");
            return (Criteria) this;
        }

        public Criteria andValidDemoEqualTo(String value) {
            addCriterion("valid_demo =", value, "validDemo");
            return (Criteria) this;
        }

        public Criteria andValidDemoNotEqualTo(String value) {
            addCriterion("valid_demo <>", value, "validDemo");
            return (Criteria) this;
        }

        public Criteria andValidDemoGreaterThan(String value) {
            addCriterion("valid_demo >", value, "validDemo");
            return (Criteria) this;
        }

        public Criteria andValidDemoGreaterThanOrEqualTo(String value) {
            addCriterion("valid_demo >=", value, "validDemo");
            return (Criteria) this;
        }

        public Criteria andValidDemoLessThan(String value) {
            addCriterion("valid_demo <", value, "validDemo");
            return (Criteria) this;
        }

        public Criteria andValidDemoLessThanOrEqualTo(String value) {
            addCriterion("valid_demo <=", value, "validDemo");
            return (Criteria) this;
        }

        public Criteria andValidDemoLike(String value) {
            addCriterion("valid_demo like", value, "validDemo");
            return (Criteria) this;
        }

        public Criteria andValidDemoNotLike(String value) {
            addCriterion("valid_demo not like", value, "validDemo");
            return (Criteria) this;
        }

        public Criteria andValidDemoIn(List<String> values) {
            addCriterion("valid_demo in", values, "validDemo");
            return (Criteria) this;
        }

        public Criteria andValidDemoNotIn(List<String> values) {
            addCriterion("valid_demo not in", values, "validDemo");
            return (Criteria) this;
        }

        public Criteria andValidDemoBetween(String value1, String value2) {
            addCriterion("valid_demo between", value1, value2, "validDemo");
            return (Criteria) this;
        }

        public Criteria andValidDemoNotBetween(String value1, String value2) {
            addCriterion("valid_demo not between", value1, value2, "validDemo");
            return (Criteria) this;
        }

        public Criteria andTranCodeLikeInsensitive(String value) {
            addCriterion("upper(tran_code) like", value.toUpperCase(), "tranCode");
            return (Criteria) this;
        }

        public Criteria andTranClassLikeInsensitive(String value) {
            addCriterion("upper(tran_class) like", value.toUpperCase(), "tranClass");
            return (Criteria) this;
        }

        public Criteria andMsgTypeLikeInsensitive(String value) {
            addCriterion("upper(msg_type) like", value.toUpperCase(), "msgType");
            return (Criteria) this;
        }

        public Criteria andFieldNameLikeInsensitive(String value) {
            addCriterion("upper(field_name) like", value.toUpperCase(), "fieldName");
            return (Criteria) this;
        }

        public Criteria andFiledDescLikeInsensitive(String value) {
            addCriterion("upper(filed_desc) like", value.toUpperCase(), "filedDesc");
            return (Criteria) this;
        }

        public Criteria andFiledTypeLikeInsensitive(String value) {
            addCriterion("upper(filed_type) like", value.toUpperCase(), "filedType");
            return (Criteria) this;
        }

        public Criteria andFiledFixedLikeInsensitive(String value) {
            addCriterion("upper(filed_fixed) like", value.toUpperCase(), "filedFixed");
            return (Criteria) this;
        }

        public Criteria andSignLikeInsensitive(String value) {
            addCriterion("upper(sign) like", value.toUpperCase(), "sign");
            return (Criteria) this;
        }

        public Criteria andValidExpressionLikeInsensitive(String value) {
            addCriterion("upper(valid_expression) like", value.toUpperCase(), "validExpression");
            return (Criteria) this;
        }

        public Criteria andValidDescLikeInsensitive(String value) {
            addCriterion("upper(valid_desc) like", value.toUpperCase(), "validDesc");
            return (Criteria) this;
        }

        public Criteria andValidNesyLikeInsensitive(String value) {
            addCriterion("upper(valid_nesy) like", value.toUpperCase(), "validNesy");
            return (Criteria) this;
        }

        public Criteria andValidDemoLikeInsensitive(String value) {
            addCriterion("upper(valid_demo) like", value.toUpperCase(), "validDemo");
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