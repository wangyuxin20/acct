package com.wd.apiaccount.model.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class AcctFrz extends AcctFrzKey implements Serializable {
    private String frzExp;

    private String acctNo;

    private BigDecimal frzAmt;

    private String frzDate;

    private Integer frzState;

    private String unfrzDate;

    private String note;

    private static final long serialVersionUID = 1L;

    public String getFrzExp() {
        return frzExp;
    }

    public void setFrzExp(String frzExp) {
        this.frzExp = frzExp == null ? null : frzExp.trim();
    }

    public String getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(String acctNo) {
        this.acctNo = acctNo == null ? null : acctNo.trim();
    }

    public BigDecimal getFrzAmt() {
        return frzAmt;
    }

    public void setFrzAmt(BigDecimal frzAmt) {
        this.frzAmt = frzAmt;
    }

    public String getFrzDate() {
        return frzDate;
    }

    public void setFrzDate(String frzDate) {
        this.frzDate = frzDate == null ? null : frzDate.trim();
    }

    public Integer getFrzState() {
        return frzState;
    }

    public void setFrzState(Integer frzState) {
        this.frzState = frzState;
    }

    public String getUnfrzDate() {
        return unfrzDate;
    }

    public void setUnfrzDate(String unfrzDate) {
        this.unfrzDate = unfrzDate == null ? null : unfrzDate.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
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
        AcctFrz other = (AcctFrz) that;
        return (this.getFrzNo() == null ? other.getFrzNo() == null : this.getFrzNo().equals(other.getFrzNo()))
            && (this.getFlowInrId() == null ? other.getFlowInrId() == null : this.getFlowInrId().equals(other.getFlowInrId()))
            && (this.getFrzExp() == null ? other.getFrzExp() == null : this.getFrzExp().equals(other.getFrzExp()))
            && (this.getAcctNo() == null ? other.getAcctNo() == null : this.getAcctNo().equals(other.getAcctNo()))
            && (this.getFrzAmt() == null ? other.getFrzAmt() == null : this.getFrzAmt().equals(other.getFrzAmt()))
            && (this.getFrzDate() == null ? other.getFrzDate() == null : this.getFrzDate().equals(other.getFrzDate()))
            && (this.getFrzState() == null ? other.getFrzState() == null : this.getFrzState().equals(other.getFrzState()))
            && (this.getUnfrzDate() == null ? other.getUnfrzDate() == null : this.getUnfrzDate().equals(other.getUnfrzDate()))
            && (this.getNote() == null ? other.getNote() == null : this.getNote().equals(other.getNote()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFrzNo() == null) ? 0 : getFrzNo().hashCode());
        result = prime * result + ((getFlowInrId() == null) ? 0 : getFlowInrId().hashCode());
        result = prime * result + ((getFrzExp() == null) ? 0 : getFrzExp().hashCode());
        result = prime * result + ((getAcctNo() == null) ? 0 : getAcctNo().hashCode());
        result = prime * result + ((getFrzAmt() == null) ? 0 : getFrzAmt().hashCode());
        result = prime * result + ((getFrzDate() == null) ? 0 : getFrzDate().hashCode());
        result = prime * result + ((getFrzState() == null) ? 0 : getFrzState().hashCode());
        result = prime * result + ((getUnfrzDate() == null) ? 0 : getUnfrzDate().hashCode());
        result = prime * result + ((getNote() == null) ? 0 : getNote().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", frzExp=").append(frzExp);
        sb.append(", acctNo=").append(acctNo);
        sb.append(", frzAmt=").append(frzAmt);
        sb.append(", frzDate=").append(frzDate);
        sb.append(", frzState=").append(frzState);
        sb.append(", unfrzDate=").append(unfrzDate);
        sb.append(", note=").append(note);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}