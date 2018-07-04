package com.wa.apiaccount.core.model.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class AcctDayendUnfrz implements Serializable {
    private Long dayendId;

    private String unfrzExp;

    private Integer unfrzCount;

    private BigDecimal unfrzAmt;

    private Integer unfrzAccountingCount;

    private BigDecimal unfrzAccountingAmt;

    private Integer unfrzAcctCount;

    private BigDecimal recBalSum;

    private Date unfrzTime;

    private static final long serialVersionUID = 1L;

    public Long getDayendId() {
        return dayendId;
    }

    public void setDayendId(Long dayendId) {
        this.dayendId = dayendId;
    }

    public String getUnfrzExp() {
        return unfrzExp;
    }

    public void setUnfrzExp(String unfrzExp) {
        this.unfrzExp = unfrzExp == null ? null : unfrzExp.trim();
    }

    public Integer getUnfrzCount() {
        return unfrzCount;
    }

    public void setUnfrzCount(Integer unfrzCount) {
        this.unfrzCount = unfrzCount;
    }

    public BigDecimal getUnfrzAmt() {
        return unfrzAmt;
    }

    public void setUnfrzAmt(BigDecimal unfrzAmt) {
        this.unfrzAmt = unfrzAmt;
    }

    public Integer getUnfrzAccountingCount() {
        return unfrzAccountingCount;
    }

    public void setUnfrzAccountingCount(Integer unfrzAccountingCount) {
        this.unfrzAccountingCount = unfrzAccountingCount;
    }

    public BigDecimal getUnfrzAccountingAmt() {
        return unfrzAccountingAmt;
    }

    public void setUnfrzAccountingAmt(BigDecimal unfrzAccountingAmt) {
        this.unfrzAccountingAmt = unfrzAccountingAmt;
    }

    public Integer getUnfrzAcctCount() {
        return unfrzAcctCount;
    }

    public void setUnfrzAcctCount(Integer unfrzAcctCount) {
        this.unfrzAcctCount = unfrzAcctCount;
    }

    public BigDecimal getRecBalSum() {
        return recBalSum;
    }

    public void setRecBalSum(BigDecimal recBalSum) {
        this.recBalSum = recBalSum;
    }

    public Date getUnfrzTime() {
        return unfrzTime;
    }

    public void setUnfrzTime(Date unfrzTime) {
        this.unfrzTime = unfrzTime;
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
        AcctDayendUnfrz other = (AcctDayendUnfrz) that;
        return (this.getDayendId() == null ? other.getDayendId() == null : this.getDayendId().equals(other.getDayendId()))
            && (this.getUnfrzExp() == null ? other.getUnfrzExp() == null : this.getUnfrzExp().equals(other.getUnfrzExp()))
            && (this.getUnfrzCount() == null ? other.getUnfrzCount() == null : this.getUnfrzCount().equals(other.getUnfrzCount()))
            && (this.getUnfrzAmt() == null ? other.getUnfrzAmt() == null : this.getUnfrzAmt().equals(other.getUnfrzAmt()))
            && (this.getUnfrzAccountingCount() == null ? other.getUnfrzAccountingCount() == null : this.getUnfrzAccountingCount().equals(other.getUnfrzAccountingCount()))
            && (this.getUnfrzAccountingAmt() == null ? other.getUnfrzAccountingAmt() == null : this.getUnfrzAccountingAmt().equals(other.getUnfrzAccountingAmt()))
            && (this.getUnfrzAcctCount() == null ? other.getUnfrzAcctCount() == null : this.getUnfrzAcctCount().equals(other.getUnfrzAcctCount()))
            && (this.getRecBalSum() == null ? other.getRecBalSum() == null : this.getRecBalSum().equals(other.getRecBalSum()))
            && (this.getUnfrzTime() == null ? other.getUnfrzTime() == null : this.getUnfrzTime().equals(other.getUnfrzTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDayendId() == null) ? 0 : getDayendId().hashCode());
        result = prime * result + ((getUnfrzExp() == null) ? 0 : getUnfrzExp().hashCode());
        result = prime * result + ((getUnfrzCount() == null) ? 0 : getUnfrzCount().hashCode());
        result = prime * result + ((getUnfrzAmt() == null) ? 0 : getUnfrzAmt().hashCode());
        result = prime * result + ((getUnfrzAccountingCount() == null) ? 0 : getUnfrzAccountingCount().hashCode());
        result = prime * result + ((getUnfrzAccountingAmt() == null) ? 0 : getUnfrzAccountingAmt().hashCode());
        result = prime * result + ((getUnfrzAcctCount() == null) ? 0 : getUnfrzAcctCount().hashCode());
        result = prime * result + ((getRecBalSum() == null) ? 0 : getRecBalSum().hashCode());
        result = prime * result + ((getUnfrzTime() == null) ? 0 : getUnfrzTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", dayendId=").append(dayendId);
        sb.append(", unfrzExp=").append(unfrzExp);
        sb.append(", unfrzCount=").append(unfrzCount);
        sb.append(", unfrzAmt=").append(unfrzAmt);
        sb.append(", unfrzAccountingCount=").append(unfrzAccountingCount);
        sb.append(", unfrzAccountingAmt=").append(unfrzAccountingAmt);
        sb.append(", unfrzAcctCount=").append(unfrzAcctCount);
        sb.append(", recBalSum=").append(recBalSum);
        sb.append(", unfrzTime=").append(unfrzTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}