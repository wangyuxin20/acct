package com.wd.apiaccount.model.domain;

import java.util.ArrayList;
import java.util.List;

public class AcctTranExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AcctTranExample() {
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

        public Criteria andTranNoIsNull() {
            addCriterion("tran_no is null");
            return (Criteria) this;
        }

        public Criteria andTranNoIsNotNull() {
            addCriterion("tran_no is not null");
            return (Criteria) this;
        }

        public Criteria andTranNoEqualTo(String value) {
            addCriterion("tran_no =", value, "tranNo");
            return (Criteria) this;
        }

        public Criteria andTranNoNotEqualTo(String value) {
            addCriterion("tran_no <>", value, "tranNo");
            return (Criteria) this;
        }

        public Criteria andTranNoGreaterThan(String value) {
            addCriterion("tran_no >", value, "tranNo");
            return (Criteria) this;
        }

        public Criteria andTranNoGreaterThanOrEqualTo(String value) {
            addCriterion("tran_no >=", value, "tranNo");
            return (Criteria) this;
        }

        public Criteria andTranNoLessThan(String value) {
            addCriterion("tran_no <", value, "tranNo");
            return (Criteria) this;
        }

        public Criteria andTranNoLessThanOrEqualTo(String value) {
            addCriterion("tran_no <=", value, "tranNo");
            return (Criteria) this;
        }

        public Criteria andTranNoLike(String value) {
            addCriterion("tran_no like", value, "tranNo");
            return (Criteria) this;
        }

        public Criteria andTranNoNotLike(String value) {
            addCriterion("tran_no not like", value, "tranNo");
            return (Criteria) this;
        }

        public Criteria andTranNoIn(List<String> values) {
            addCriterion("tran_no in", values, "tranNo");
            return (Criteria) this;
        }

        public Criteria andTranNoNotIn(List<String> values) {
            addCriterion("tran_no not in", values, "tranNo");
            return (Criteria) this;
        }

        public Criteria andTranNoBetween(String value1, String value2) {
            addCriterion("tran_no between", value1, value2, "tranNo");
            return (Criteria) this;
        }

        public Criteria andTranNoNotBetween(String value1, String value2) {
            addCriterion("tran_no not between", value1, value2, "tranNo");
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

        public Criteria andTranNameIsNull() {
            addCriterion("tran_name is null");
            return (Criteria) this;
        }

        public Criteria andTranNameIsNotNull() {
            addCriterion("tran_name is not null");
            return (Criteria) this;
        }

        public Criteria andTranNameEqualTo(String value) {
            addCriterion("tran_name =", value, "tranName");
            return (Criteria) this;
        }

        public Criteria andTranNameNotEqualTo(String value) {
            addCriterion("tran_name <>", value, "tranName");
            return (Criteria) this;
        }

        public Criteria andTranNameGreaterThan(String value) {
            addCriterion("tran_name >", value, "tranName");
            return (Criteria) this;
        }

        public Criteria andTranNameGreaterThanOrEqualTo(String value) {
            addCriterion("tran_name >=", value, "tranName");
            return (Criteria) this;
        }

        public Criteria andTranNameLessThan(String value) {
            addCriterion("tran_name <", value, "tranName");
            return (Criteria) this;
        }

        public Criteria andTranNameLessThanOrEqualTo(String value) {
            addCriterion("tran_name <=", value, "tranName");
            return (Criteria) this;
        }

        public Criteria andTranNameLike(String value) {
            addCriterion("tran_name like", value, "tranName");
            return (Criteria) this;
        }

        public Criteria andTranNameNotLike(String value) {
            addCriterion("tran_name not like", value, "tranName");
            return (Criteria) this;
        }

        public Criteria andTranNameIn(List<String> values) {
            addCriterion("tran_name in", values, "tranName");
            return (Criteria) this;
        }

        public Criteria andTranNameNotIn(List<String> values) {
            addCriterion("tran_name not in", values, "tranName");
            return (Criteria) this;
        }

        public Criteria andTranNameBetween(String value1, String value2) {
            addCriterion("tran_name between", value1, value2, "tranName");
            return (Criteria) this;
        }

        public Criteria andTranNameNotBetween(String value1, String value2) {
            addCriterion("tran_name not between", value1, value2, "tranName");
            return (Criteria) this;
        }

        public Criteria andAcctTypeDrIsNull() {
            addCriterion("acct_type_dr is null");
            return (Criteria) this;
        }

        public Criteria andAcctTypeDrIsNotNull() {
            addCriterion("acct_type_dr is not null");
            return (Criteria) this;
        }

        public Criteria andAcctTypeDrEqualTo(String value) {
            addCriterion("acct_type_dr =", value, "acctTypeDr");
            return (Criteria) this;
        }

        public Criteria andAcctTypeDrNotEqualTo(String value) {
            addCriterion("acct_type_dr <>", value, "acctTypeDr");
            return (Criteria) this;
        }

        public Criteria andAcctTypeDrGreaterThan(String value) {
            addCriterion("acct_type_dr >", value, "acctTypeDr");
            return (Criteria) this;
        }

        public Criteria andAcctTypeDrGreaterThanOrEqualTo(String value) {
            addCriterion("acct_type_dr >=", value, "acctTypeDr");
            return (Criteria) this;
        }

        public Criteria andAcctTypeDrLessThan(String value) {
            addCriterion("acct_type_dr <", value, "acctTypeDr");
            return (Criteria) this;
        }

        public Criteria andAcctTypeDrLessThanOrEqualTo(String value) {
            addCriterion("acct_type_dr <=", value, "acctTypeDr");
            return (Criteria) this;
        }

        public Criteria andAcctTypeDrLike(String value) {
            addCriterion("acct_type_dr like", value, "acctTypeDr");
            return (Criteria) this;
        }

        public Criteria andAcctTypeDrNotLike(String value) {
            addCriterion("acct_type_dr not like", value, "acctTypeDr");
            return (Criteria) this;
        }

        public Criteria andAcctTypeDrIn(List<String> values) {
            addCriterion("acct_type_dr in", values, "acctTypeDr");
            return (Criteria) this;
        }

        public Criteria andAcctTypeDrNotIn(List<String> values) {
            addCriterion("acct_type_dr not in", values, "acctTypeDr");
            return (Criteria) this;
        }

        public Criteria andAcctTypeDrBetween(String value1, String value2) {
            addCriterion("acct_type_dr between", value1, value2, "acctTypeDr");
            return (Criteria) this;
        }

        public Criteria andAcctTypeDrNotBetween(String value1, String value2) {
            addCriterion("acct_type_dr not between", value1, value2, "acctTypeDr");
            return (Criteria) this;
        }

        public Criteria andAcctTypeCrIsNull() {
            addCriterion("acct_type_cr is null");
            return (Criteria) this;
        }

        public Criteria andAcctTypeCrIsNotNull() {
            addCriterion("acct_type_cr is not null");
            return (Criteria) this;
        }

        public Criteria andAcctTypeCrEqualTo(String value) {
            addCriterion("acct_type_cr =", value, "acctTypeCr");
            return (Criteria) this;
        }

        public Criteria andAcctTypeCrNotEqualTo(String value) {
            addCriterion("acct_type_cr <>", value, "acctTypeCr");
            return (Criteria) this;
        }

        public Criteria andAcctTypeCrGreaterThan(String value) {
            addCriterion("acct_type_cr >", value, "acctTypeCr");
            return (Criteria) this;
        }

        public Criteria andAcctTypeCrGreaterThanOrEqualTo(String value) {
            addCriterion("acct_type_cr >=", value, "acctTypeCr");
            return (Criteria) this;
        }

        public Criteria andAcctTypeCrLessThan(String value) {
            addCriterion("acct_type_cr <", value, "acctTypeCr");
            return (Criteria) this;
        }

        public Criteria andAcctTypeCrLessThanOrEqualTo(String value) {
            addCriterion("acct_type_cr <=", value, "acctTypeCr");
            return (Criteria) this;
        }

        public Criteria andAcctTypeCrLike(String value) {
            addCriterion("acct_type_cr like", value, "acctTypeCr");
            return (Criteria) this;
        }

        public Criteria andAcctTypeCrNotLike(String value) {
            addCriterion("acct_type_cr not like", value, "acctTypeCr");
            return (Criteria) this;
        }

        public Criteria andAcctTypeCrIn(List<String> values) {
            addCriterion("acct_type_cr in", values, "acctTypeCr");
            return (Criteria) this;
        }

        public Criteria andAcctTypeCrNotIn(List<String> values) {
            addCriterion("acct_type_cr not in", values, "acctTypeCr");
            return (Criteria) this;
        }

        public Criteria andAcctTypeCrBetween(String value1, String value2) {
            addCriterion("acct_type_cr between", value1, value2, "acctTypeCr");
            return (Criteria) this;
        }

        public Criteria andAcctTypeCrNotBetween(String value1, String value2) {
            addCriterion("acct_type_cr not between", value1, value2, "acctTypeCr");
            return (Criteria) this;
        }

        public Criteria andAccsDirIsNull() {
            addCriterion("accs_dir is null");
            return (Criteria) this;
        }

        public Criteria andAccsDirIsNotNull() {
            addCriterion("accs_dir is not null");
            return (Criteria) this;
        }

        public Criteria andAccsDirEqualTo(String value) {
            addCriterion("accs_dir =", value, "accsDir");
            return (Criteria) this;
        }

        public Criteria andAccsDirNotEqualTo(String value) {
            addCriterion("accs_dir <>", value, "accsDir");
            return (Criteria) this;
        }

        public Criteria andAccsDirGreaterThan(String value) {
            addCriterion("accs_dir >", value, "accsDir");
            return (Criteria) this;
        }

        public Criteria andAccsDirGreaterThanOrEqualTo(String value) {
            addCriterion("accs_dir >=", value, "accsDir");
            return (Criteria) this;
        }

        public Criteria andAccsDirLessThan(String value) {
            addCriterion("accs_dir <", value, "accsDir");
            return (Criteria) this;
        }

        public Criteria andAccsDirLessThanOrEqualTo(String value) {
            addCriterion("accs_dir <=", value, "accsDir");
            return (Criteria) this;
        }

        public Criteria andAccsDirLike(String value) {
            addCriterion("accs_dir like", value, "accsDir");
            return (Criteria) this;
        }

        public Criteria andAccsDirNotLike(String value) {
            addCriterion("accs_dir not like", value, "accsDir");
            return (Criteria) this;
        }

        public Criteria andAccsDirIn(List<String> values) {
            addCriterion("accs_dir in", values, "accsDir");
            return (Criteria) this;
        }

        public Criteria andAccsDirNotIn(List<String> values) {
            addCriterion("accs_dir not in", values, "accsDir");
            return (Criteria) this;
        }

        public Criteria andAccsDirBetween(String value1, String value2) {
            addCriterion("accs_dir between", value1, value2, "accsDir");
            return (Criteria) this;
        }

        public Criteria andAccsDirNotBetween(String value1, String value2) {
            addCriterion("accs_dir not between", value1, value2, "accsDir");
            return (Criteria) this;
        }

        public Criteria andTranTypeIsNull() {
            addCriterion("tran_type is null");
            return (Criteria) this;
        }

        public Criteria andTranTypeIsNotNull() {
            addCriterion("tran_type is not null");
            return (Criteria) this;
        }

        public Criteria andTranTypeEqualTo(String value) {
            addCriterion("tran_type =", value, "tranType");
            return (Criteria) this;
        }

        public Criteria andTranTypeNotEqualTo(String value) {
            addCriterion("tran_type <>", value, "tranType");
            return (Criteria) this;
        }

        public Criteria andTranTypeGreaterThan(String value) {
            addCriterion("tran_type >", value, "tranType");
            return (Criteria) this;
        }

        public Criteria andTranTypeGreaterThanOrEqualTo(String value) {
            addCriterion("tran_type >=", value, "tranType");
            return (Criteria) this;
        }

        public Criteria andTranTypeLessThan(String value) {
            addCriterion("tran_type <", value, "tranType");
            return (Criteria) this;
        }

        public Criteria andTranTypeLessThanOrEqualTo(String value) {
            addCriterion("tran_type <=", value, "tranType");
            return (Criteria) this;
        }

        public Criteria andTranTypeLike(String value) {
            addCriterion("tran_type like", value, "tranType");
            return (Criteria) this;
        }

        public Criteria andTranTypeNotLike(String value) {
            addCriterion("tran_type not like", value, "tranType");
            return (Criteria) this;
        }

        public Criteria andTranTypeIn(List<String> values) {
            addCriterion("tran_type in", values, "tranType");
            return (Criteria) this;
        }

        public Criteria andTranTypeNotIn(List<String> values) {
            addCriterion("tran_type not in", values, "tranType");
            return (Criteria) this;
        }

        public Criteria andTranTypeBetween(String value1, String value2) {
            addCriterion("tran_type between", value1, value2, "tranType");
            return (Criteria) this;
        }

        public Criteria andTranTypeNotBetween(String value1, String value2) {
            addCriterion("tran_type not between", value1, value2, "tranType");
            return (Criteria) this;
        }

        public Criteria andAsyTypeIsNull() {
            addCriterion("asy_type is null");
            return (Criteria) this;
        }

        public Criteria andAsyTypeIsNotNull() {
            addCriterion("asy_type is not null");
            return (Criteria) this;
        }

        public Criteria andAsyTypeEqualTo(String value) {
            addCriterion("asy_type =", value, "asyType");
            return (Criteria) this;
        }

        public Criteria andAsyTypeNotEqualTo(String value) {
            addCriterion("asy_type <>", value, "asyType");
            return (Criteria) this;
        }

        public Criteria andAsyTypeGreaterThan(String value) {
            addCriterion("asy_type >", value, "asyType");
            return (Criteria) this;
        }

        public Criteria andAsyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("asy_type >=", value, "asyType");
            return (Criteria) this;
        }

        public Criteria andAsyTypeLessThan(String value) {
            addCriterion("asy_type <", value, "asyType");
            return (Criteria) this;
        }

        public Criteria andAsyTypeLessThanOrEqualTo(String value) {
            addCriterion("asy_type <=", value, "asyType");
            return (Criteria) this;
        }

        public Criteria andAsyTypeLike(String value) {
            addCriterion("asy_type like", value, "asyType");
            return (Criteria) this;
        }

        public Criteria andAsyTypeNotLike(String value) {
            addCriterion("asy_type not like", value, "asyType");
            return (Criteria) this;
        }

        public Criteria andAsyTypeIn(List<String> values) {
            addCriterion("asy_type in", values, "asyType");
            return (Criteria) this;
        }

        public Criteria andAsyTypeNotIn(List<String> values) {
            addCriterion("asy_type not in", values, "asyType");
            return (Criteria) this;
        }

        public Criteria andAsyTypeBetween(String value1, String value2) {
            addCriterion("asy_type between", value1, value2, "asyType");
            return (Criteria) this;
        }

        public Criteria andAsyTypeNotBetween(String value1, String value2) {
            addCriterion("asy_type not between", value1, value2, "asyType");
            return (Criteria) this;
        }

        public Criteria andSumDirIsNull() {
            addCriterion("sum_dir is null");
            return (Criteria) this;
        }

        public Criteria andSumDirIsNotNull() {
            addCriterion("sum_dir is not null");
            return (Criteria) this;
        }

        public Criteria andSumDirEqualTo(String value) {
            addCriterion("sum_dir =", value, "sumDir");
            return (Criteria) this;
        }

        public Criteria andSumDirNotEqualTo(String value) {
            addCriterion("sum_dir <>", value, "sumDir");
            return (Criteria) this;
        }

        public Criteria andSumDirGreaterThan(String value) {
            addCriterion("sum_dir >", value, "sumDir");
            return (Criteria) this;
        }

        public Criteria andSumDirGreaterThanOrEqualTo(String value) {
            addCriterion("sum_dir >=", value, "sumDir");
            return (Criteria) this;
        }

        public Criteria andSumDirLessThan(String value) {
            addCriterion("sum_dir <", value, "sumDir");
            return (Criteria) this;
        }

        public Criteria andSumDirLessThanOrEqualTo(String value) {
            addCriterion("sum_dir <=", value, "sumDir");
            return (Criteria) this;
        }

        public Criteria andSumDirLike(String value) {
            addCriterion("sum_dir like", value, "sumDir");
            return (Criteria) this;
        }

        public Criteria andSumDirNotLike(String value) {
            addCriterion("sum_dir not like", value, "sumDir");
            return (Criteria) this;
        }

        public Criteria andSumDirIn(List<String> values) {
            addCriterion("sum_dir in", values, "sumDir");
            return (Criteria) this;
        }

        public Criteria andSumDirNotIn(List<String> values) {
            addCriterion("sum_dir not in", values, "sumDir");
            return (Criteria) this;
        }

        public Criteria andSumDirBetween(String value1, String value2) {
            addCriterion("sum_dir between", value1, value2, "sumDir");
            return (Criteria) this;
        }

        public Criteria andSumDirNotBetween(String value1, String value2) {
            addCriterion("sum_dir not between", value1, value2, "sumDir");
            return (Criteria) this;
        }

        public Criteria andSumCurrIsNull() {
            addCriterion("sum_curr is null");
            return (Criteria) this;
        }

        public Criteria andSumCurrIsNotNull() {
            addCriterion("sum_curr is not null");
            return (Criteria) this;
        }

        public Criteria andSumCurrEqualTo(String value) {
            addCriterion("sum_curr =", value, "sumCurr");
            return (Criteria) this;
        }

        public Criteria andSumCurrNotEqualTo(String value) {
            addCriterion("sum_curr <>", value, "sumCurr");
            return (Criteria) this;
        }

        public Criteria andSumCurrGreaterThan(String value) {
            addCriterion("sum_curr >", value, "sumCurr");
            return (Criteria) this;
        }

        public Criteria andSumCurrGreaterThanOrEqualTo(String value) {
            addCriterion("sum_curr >=", value, "sumCurr");
            return (Criteria) this;
        }

        public Criteria andSumCurrLessThan(String value) {
            addCriterion("sum_curr <", value, "sumCurr");
            return (Criteria) this;
        }

        public Criteria andSumCurrLessThanOrEqualTo(String value) {
            addCriterion("sum_curr <=", value, "sumCurr");
            return (Criteria) this;
        }

        public Criteria andSumCurrLike(String value) {
            addCriterion("sum_curr like", value, "sumCurr");
            return (Criteria) this;
        }

        public Criteria andSumCurrNotLike(String value) {
            addCriterion("sum_curr not like", value, "sumCurr");
            return (Criteria) this;
        }

        public Criteria andSumCurrIn(List<String> values) {
            addCriterion("sum_curr in", values, "sumCurr");
            return (Criteria) this;
        }

        public Criteria andSumCurrNotIn(List<String> values) {
            addCriterion("sum_curr not in", values, "sumCurr");
            return (Criteria) this;
        }

        public Criteria andSumCurrBetween(String value1, String value2) {
            addCriterion("sum_curr between", value1, value2, "sumCurr");
            return (Criteria) this;
        }

        public Criteria andSumCurrNotBetween(String value1, String value2) {
            addCriterion("sum_curr not between", value1, value2, "sumCurr");
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

        public Criteria andExpIsNull() {
            addCriterion("exp is null");
            return (Criteria) this;
        }

        public Criteria andExpIsNotNull() {
            addCriterion("exp is not null");
            return (Criteria) this;
        }

        public Criteria andExpEqualTo(String value) {
            addCriterion("exp =", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpNotEqualTo(String value) {
            addCriterion("exp <>", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpGreaterThan(String value) {
            addCriterion("exp >", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpGreaterThanOrEqualTo(String value) {
            addCriterion("exp >=", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpLessThan(String value) {
            addCriterion("exp <", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpLessThanOrEqualTo(String value) {
            addCriterion("exp <=", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpLike(String value) {
            addCriterion("exp like", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpNotLike(String value) {
            addCriterion("exp not like", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpIn(List<String> values) {
            addCriterion("exp in", values, "exp");
            return (Criteria) this;
        }

        public Criteria andExpNotIn(List<String> values) {
            addCriterion("exp not in", values, "exp");
            return (Criteria) this;
        }

        public Criteria andExpBetween(String value1, String value2) {
            addCriterion("exp between", value1, value2, "exp");
            return (Criteria) this;
        }

        public Criteria andExpNotBetween(String value1, String value2) {
            addCriterion("exp not between", value1, value2, "exp");
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

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andTranNoLikeInsensitive(String value) {
            addCriterion("upper(tran_no) like", value.toUpperCase(), "tranNo");
            return (Criteria) this;
        }

        public Criteria andTranNameLikeInsensitive(String value) {
            addCriterion("upper(tran_name) like", value.toUpperCase(), "tranName");
            return (Criteria) this;
        }

        public Criteria andAcctTypeDrLikeInsensitive(String value) {
            addCriterion("upper(acct_type_dr) like", value.toUpperCase(), "acctTypeDr");
            return (Criteria) this;
        }

        public Criteria andAcctTypeCrLikeInsensitive(String value) {
            addCriterion("upper(acct_type_cr) like", value.toUpperCase(), "acctTypeCr");
            return (Criteria) this;
        }

        public Criteria andAccsDirLikeInsensitive(String value) {
            addCriterion("upper(accs_dir) like", value.toUpperCase(), "accsDir");
            return (Criteria) this;
        }

        public Criteria andTranTypeLikeInsensitive(String value) {
            addCriterion("upper(tran_type) like", value.toUpperCase(), "tranType");
            return (Criteria) this;
        }

        public Criteria andAsyTypeLikeInsensitive(String value) {
            addCriterion("upper(asy_type) like", value.toUpperCase(), "asyType");
            return (Criteria) this;
        }

        public Criteria andSumDirLikeInsensitive(String value) {
            addCriterion("upper(sum_dir) like", value.toUpperCase(), "sumDir");
            return (Criteria) this;
        }

        public Criteria andSumCurrLikeInsensitive(String value) {
            addCriterion("upper(sum_curr) like", value.toUpperCase(), "sumCurr");
            return (Criteria) this;
        }

        public Criteria andCurrNoLikeInsensitive(String value) {
            addCriterion("upper(curr_no) like", value.toUpperCase(), "currNo");
            return (Criteria) this;
        }

        public Criteria andExpLikeInsensitive(String value) {
            addCriterion("upper(exp) like", value.toUpperCase(), "exp");
            return (Criteria) this;
        }

        public Criteria andStatusLikeInsensitive(String value) {
            addCriterion("upper(status) like", value.toUpperCase(), "status");
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