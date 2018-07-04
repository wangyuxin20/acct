package com.wd.apiaccount.model.domain;

import java.io.Serializable;

public class AcctLazyCfg implements Serializable {
    private String acctNo;

    private String userNo;

    private String currNo;

    private String acctTypeNo;

    private String exp;

    private Integer lazyNum;

    private Integer lazyTimeSec;

    private String acctAlias;

    private static final long serialVersionUID = 1L;

    public String getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(String acctNo) {
        this.acctNo = acctNo == null ? null : acctNo.trim();
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo == null ? null : userNo.trim();
    }

    public String getCurrNo() {
        return currNo;
    }

    public void setCurrNo(String currNo) {
        this.currNo = currNo == null ? null : currNo.trim();
    }

    public String getAcctTypeNo() {
        return acctTypeNo;
    }

    public void setAcctTypeNo(String acctTypeNo) {
        this.acctTypeNo = acctTypeNo == null ? null : acctTypeNo.trim();
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp == null ? null : exp.trim();
    }

    public Integer getLazyNum() {
        return lazyNum;
    }

    public void setLazyNum(Integer lazyNum) {
        this.lazyNum = lazyNum;
    }

    public Integer getLazyTimeSec() {
        return lazyTimeSec;
    }

    public void setLazyTimeSec(Integer lazyTimeSec) {
        this.lazyTimeSec = lazyTimeSec;
    }

    public String getAcctAlias() {
        return acctAlias;
    }

    public void setAcctAlias(String acctAlias) {
        this.acctAlias = acctAlias == null ? null : acctAlias.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        AcctLazyCfg other = (AcctLazyCfg) that;
        return (this.getAcctNo() == null ? other.getAcctNo() == null : this.getAcctNo().equals(other.getAcctNo()))
            && (this.getUserNo() == null ? other.getUserNo() == null : this.getUserNo().equals(other.getUserNo()))
            && (this.getCurrNo() == null ? other.getCurrNo() == null : this.getCurrNo().equals(other.getCurrNo()))
            && (this.getAcctTypeNo() == null ? other.getAcctTypeNo() == null : this.getAcctTypeNo().equals(other.getAcctTypeNo()))
            && (this.getExp() == null ? other.getExp() == null : this.getExp().equals(other.getExp()))
            && (this.getLazyNum() == null ? other.getLazyNum() == null : this.getLazyNum().equals(other.getLazyNum()))
            && (this.getLazyTimeSec() == null ? other.getLazyTimeSec() == null : this.getLazyTimeSec().equals(other.getLazyTimeSec()))
            && (this.getAcctAlias() == null ? other.getAcctAlias() == null : this.getAcctAlias().equals(other.getAcctAlias()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAcctNo() == null) ? 0 : getAcctNo().hashCode());
        result = prime * result + ((getUserNo() == null) ? 0 : getUserNo().hashCode());
        result = prime * result + ((getCurrNo() == null) ? 0 : getCurrNo().hashCode());
        result = prime * result + ((getAcctTypeNo() == null) ? 0 : getAcctTypeNo().hashCode());
        result = prime * result + ((getExp() == null) ? 0 : getExp().hashCode());
        result = prime * result + ((getLazyNum() == null) ? 0 : getLazyNum().hashCode());
        result = prime * result + ((getLazyTimeSec() == null) ? 0 : getLazyTimeSec().hashCode());
        result = prime * result + ((getAcctAlias() == null) ? 0 : getAcctAlias().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", acctNo=").append(acctNo);
        sb.append(", userNo=").append(userNo);
        sb.append(", currNo=").append(currNo);
        sb.append(", acctTypeNo=").append(acctTypeNo);
        sb.append(", exp=").append(exp);
        sb.append(", lazyNum=").append(lazyNum);
        sb.append(", lazyTimeSec=").append(lazyTimeSec);
        sb.append(", acctAlias=").append(acctAlias);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}