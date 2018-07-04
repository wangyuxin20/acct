package com.wa.apiaccount.core.model.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class AcctFlowFeeInr extends AcctFlowFeeInrKey implements Serializable {
    private BigDecimal feeAmt;

    private String feeType;

    private BigDecimal feeValue;

    private String userNo;

    private String lastDate;

    private static final long serialVersionUID = 1L;

    public BigDecimal getFeeAmt() {
        return feeAmt;
    }

    public void setFeeAmt(BigDecimal feeAmt) {
        this.feeAmt = feeAmt;
    }

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType == null ? null : feeType.trim();
    }

    public BigDecimal getFeeValue() {
        return feeValue;
    }

    public void setFeeValue(BigDecimal feeValue) {
        this.feeValue = feeValue;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo == null ? null : userNo.trim();
    }

    public String getLastDate() {
        return lastDate;
    }

    public void setLastDate(String lastDate) {
        this.lastDate = lastDate == null ? null : lastDate.trim();
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
        AcctFlowFeeInr other = (AcctFlowFeeInr) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTranCode() == null ? other.getTranCode() == null : this.getTranCode().equals(other.getTranCode()))
            && (this.getFeeAmt() == null ? other.getFeeAmt() == null : this.getFeeAmt().equals(other.getFeeAmt()))
            && (this.getFeeType() == null ? other.getFeeType() == null : this.getFeeType().equals(other.getFeeType()))
            && (this.getFeeValue() == null ? other.getFeeValue() == null : this.getFeeValue().equals(other.getFeeValue()))
            && (this.getUserNo() == null ? other.getUserNo() == null : this.getUserNo().equals(other.getUserNo()))
            && (this.getLastDate() == null ? other.getLastDate() == null : this.getLastDate().equals(other.getLastDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTranCode() == null) ? 0 : getTranCode().hashCode());
        result = prime * result + ((getFeeAmt() == null) ? 0 : getFeeAmt().hashCode());
        result = prime * result + ((getFeeType() == null) ? 0 : getFeeType().hashCode());
        result = prime * result + ((getFeeValue() == null) ? 0 : getFeeValue().hashCode());
        result = prime * result + ((getUserNo() == null) ? 0 : getUserNo().hashCode());
        result = prime * result + ((getLastDate() == null) ? 0 : getLastDate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", feeAmt=").append(feeAmt);
        sb.append(", feeType=").append(feeType);
        sb.append(", feeValue=").append(feeValue);
        sb.append(", userNo=").append(userNo);
        sb.append(", lastDate=").append(lastDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}