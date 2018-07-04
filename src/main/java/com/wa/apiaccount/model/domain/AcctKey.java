package com.wd.apiaccount.model.domain;

import java.io.Serializable;

public class AcctKey implements Serializable {
    private String userNo;

    private String currNo;

    private String acctTypeNo;

    private String exp;

    private static final long serialVersionUID = 1L;

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
        AcctKey other = (AcctKey) that;
        return (this.getUserNo() == null ? other.getUserNo() == null : this.getUserNo().equals(other.getUserNo()))
            && (this.getCurrNo() == null ? other.getCurrNo() == null : this.getCurrNo().equals(other.getCurrNo()))
            && (this.getAcctTypeNo() == null ? other.getAcctTypeNo() == null : this.getAcctTypeNo().equals(other.getAcctTypeNo()))
            && (this.getExp() == null ? other.getExp() == null : this.getExp().equals(other.getExp()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserNo() == null) ? 0 : getUserNo().hashCode());
        result = prime * result + ((getCurrNo() == null) ? 0 : getCurrNo().hashCode());
        result = prime * result + ((getAcctTypeNo() == null) ? 0 : getAcctTypeNo().hashCode());
        result = prime * result + ((getExp() == null) ? 0 : getExp().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userNo=").append(userNo);
        sb.append(", currNo=").append(currNo);
        sb.append(", acctTypeNo=").append(acctTypeNo);
        sb.append(", exp=").append(exp);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}