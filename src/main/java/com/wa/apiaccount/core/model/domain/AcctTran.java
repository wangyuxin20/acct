package com.wa.apiaccount.core.model.domain;

import java.io.Serializable;

public class AcctTran extends AcctTranKey implements Serializable {
    private String tranName;

    private String acctTypeDr;

    private String acctTypeCr;

    private String accsDir;

    private String tranType;

    private String asyType;

    private String sumDir;

    private String sumCurr;

    private String currNo;

    private String exp;

    private String status;

    private static final long serialVersionUID = 1L;

    public String getTranName() {
        return tranName;
    }

    public void setTranName(String tranName) {
        this.tranName = tranName == null ? null : tranName.trim();
    }

    public String getAcctTypeDr() {
        return acctTypeDr;
    }

    public void setAcctTypeDr(String acctTypeDr) {
        this.acctTypeDr = acctTypeDr == null ? null : acctTypeDr.trim();
    }

    public String getAcctTypeCr() {
        return acctTypeCr;
    }

    public void setAcctTypeCr(String acctTypeCr) {
        this.acctTypeCr = acctTypeCr == null ? null : acctTypeCr.trim();
    }

    public String getAccsDir() {
        return accsDir;
    }

    public void setAccsDir(String accsDir) {
        this.accsDir = accsDir == null ? null : accsDir.trim();
    }

    public String getTranType() {
        return tranType;
    }

    public void setTranType(String tranType) {
        this.tranType = tranType == null ? null : tranType.trim();
    }

    public String getAsyType() {
        return asyType;
    }

    public void setAsyType(String asyType) {
        this.asyType = asyType == null ? null : asyType.trim();
    }

    public String getSumDir() {
        return sumDir;
    }

    public void setSumDir(String sumDir) {
        this.sumDir = sumDir == null ? null : sumDir.trim();
    }

    public String getSumCurr() {
        return sumCurr;
    }

    public void setSumCurr(String sumCurr) {
        this.sumCurr = sumCurr == null ? null : sumCurr.trim();
    }

    public String getCurrNo() {
        return currNo;
    }

    public void setCurrNo(String currNo) {
        this.currNo = currNo == null ? null : currNo.trim();
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp == null ? null : exp.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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
        AcctTran other = (AcctTran) that;
        return (this.getTranNo() == null ? other.getTranNo() == null : this.getTranNo().equals(other.getTranNo()))
            && (this.getTranSeq() == null ? other.getTranSeq() == null : this.getTranSeq().equals(other.getTranSeq()))
            && (this.getTranName() == null ? other.getTranName() == null : this.getTranName().equals(other.getTranName()))
            && (this.getAcctTypeDr() == null ? other.getAcctTypeDr() == null : this.getAcctTypeDr().equals(other.getAcctTypeDr()))
            && (this.getAcctTypeCr() == null ? other.getAcctTypeCr() == null : this.getAcctTypeCr().equals(other.getAcctTypeCr()))
            && (this.getAccsDir() == null ? other.getAccsDir() == null : this.getAccsDir().equals(other.getAccsDir()))
            && (this.getTranType() == null ? other.getTranType() == null : this.getTranType().equals(other.getTranType()))
            && (this.getAsyType() == null ? other.getAsyType() == null : this.getAsyType().equals(other.getAsyType()))
            && (this.getSumDir() == null ? other.getSumDir() == null : this.getSumDir().equals(other.getSumDir()))
            && (this.getSumCurr() == null ? other.getSumCurr() == null : this.getSumCurr().equals(other.getSumCurr()))
            && (this.getCurrNo() == null ? other.getCurrNo() == null : this.getCurrNo().equals(other.getCurrNo()))
            && (this.getExp() == null ? other.getExp() == null : this.getExp().equals(other.getExp()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTranNo() == null) ? 0 : getTranNo().hashCode());
        result = prime * result + ((getTranSeq() == null) ? 0 : getTranSeq().hashCode());
        result = prime * result + ((getTranName() == null) ? 0 : getTranName().hashCode());
        result = prime * result + ((getAcctTypeDr() == null) ? 0 : getAcctTypeDr().hashCode());
        result = prime * result + ((getAcctTypeCr() == null) ? 0 : getAcctTypeCr().hashCode());
        result = prime * result + ((getAccsDir() == null) ? 0 : getAccsDir().hashCode());
        result = prime * result + ((getTranType() == null) ? 0 : getTranType().hashCode());
        result = prime * result + ((getAsyType() == null) ? 0 : getAsyType().hashCode());
        result = prime * result + ((getSumDir() == null) ? 0 : getSumDir().hashCode());
        result = prime * result + ((getSumCurr() == null) ? 0 : getSumCurr().hashCode());
        result = prime * result + ((getCurrNo() == null) ? 0 : getCurrNo().hashCode());
        result = prime * result + ((getExp() == null) ? 0 : getExp().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tranName=").append(tranName);
        sb.append(", acctTypeDr=").append(acctTypeDr);
        sb.append(", acctTypeCr=").append(acctTypeCr);
        sb.append(", accsDir=").append(accsDir);
        sb.append(", tranType=").append(tranType);
        sb.append(", asyType=").append(asyType);
        sb.append(", sumDir=").append(sumDir);
        sb.append(", sumCurr=").append(sumCurr);
        sb.append(", currNo=").append(currNo);
        sb.append(", exp=").append(exp);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}