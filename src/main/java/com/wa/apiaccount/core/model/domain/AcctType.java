package com.wa.apiaccount.core.model.domain;

import java.io.Serializable;

public class AcctType implements Serializable {
    private String acctTypeNo;

    private String acctTypeName;

    private String currNo;

    private String userType;

    private String acctDir;

    private String acctInc;

    private String acctRed;

    private String acctAuto;

    private static final long serialVersionUID = 1L;

    public String getAcctTypeNo() {
        return acctTypeNo;
    }

    public void setAcctTypeNo(String acctTypeNo) {
        this.acctTypeNo = acctTypeNo == null ? null : acctTypeNo.trim();
    }

    public String getAcctTypeName() {
        return acctTypeName;
    }

    public void setAcctTypeName(String acctTypeName) {
        this.acctTypeName = acctTypeName == null ? null : acctTypeName.trim();
    }

    public String getCurrNo() {
        return currNo;
    }

    public void setCurrNo(String currNo) {
        this.currNo = currNo == null ? null : currNo.trim();
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    public String getAcctDir() {
        return acctDir;
    }

    public void setAcctDir(String acctDir) {
        this.acctDir = acctDir == null ? null : acctDir.trim();
    }

    public String getAcctInc() {
        return acctInc;
    }

    public void setAcctInc(String acctInc) {
        this.acctInc = acctInc == null ? null : acctInc.trim();
    }

    public String getAcctRed() {
        return acctRed;
    }

    public void setAcctRed(String acctRed) {
        this.acctRed = acctRed == null ? null : acctRed.trim();
    }

    public String getAcctAuto() {
        return acctAuto;
    }

    public void setAcctAuto(String acctAuto) {
        this.acctAuto = acctAuto == null ? null : acctAuto.trim();
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
        AcctType other = (AcctType) that;
        return (this.getAcctTypeNo() == null ? other.getAcctTypeNo() == null : this.getAcctTypeNo().equals(other.getAcctTypeNo()))
            && (this.getAcctTypeName() == null ? other.getAcctTypeName() == null : this.getAcctTypeName().equals(other.getAcctTypeName()))
            && (this.getCurrNo() == null ? other.getCurrNo() == null : this.getCurrNo().equals(other.getCurrNo()))
            && (this.getUserType() == null ? other.getUserType() == null : this.getUserType().equals(other.getUserType()))
            && (this.getAcctDir() == null ? other.getAcctDir() == null : this.getAcctDir().equals(other.getAcctDir()))
            && (this.getAcctInc() == null ? other.getAcctInc() == null : this.getAcctInc().equals(other.getAcctInc()))
            && (this.getAcctRed() == null ? other.getAcctRed() == null : this.getAcctRed().equals(other.getAcctRed()))
            && (this.getAcctAuto() == null ? other.getAcctAuto() == null : this.getAcctAuto().equals(other.getAcctAuto()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAcctTypeNo() == null) ? 0 : getAcctTypeNo().hashCode());
        result = prime * result + ((getAcctTypeName() == null) ? 0 : getAcctTypeName().hashCode());
        result = prime * result + ((getCurrNo() == null) ? 0 : getCurrNo().hashCode());
        result = prime * result + ((getUserType() == null) ? 0 : getUserType().hashCode());
        result = prime * result + ((getAcctDir() == null) ? 0 : getAcctDir().hashCode());
        result = prime * result + ((getAcctInc() == null) ? 0 : getAcctInc().hashCode());
        result = prime * result + ((getAcctRed() == null) ? 0 : getAcctRed().hashCode());
        result = prime * result + ((getAcctAuto() == null) ? 0 : getAcctAuto().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", acctTypeNo=").append(acctTypeNo);
        sb.append(", acctTypeName=").append(acctTypeName);
        sb.append(", currNo=").append(currNo);
        sb.append(", userType=").append(userType);
        sb.append(", acctDir=").append(acctDir);
        sb.append(", acctInc=").append(acctInc);
        sb.append(", acctRed=").append(acctRed);
        sb.append(", acctAuto=").append(acctAuto);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}