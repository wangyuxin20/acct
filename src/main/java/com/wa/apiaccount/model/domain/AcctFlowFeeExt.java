package com.wd.apiaccount.model.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class AcctFlowFeeExt extends AcctFlowFeeExtKey implements Serializable {
    private String excode;

    private String exname;

    private BigDecimal tranAmt;

    private BigDecimal dctAmt;

    private BigDecimal price;

    private BigDecimal num;

    private BigDecimal settleAmt;

    private BigDecimal feeAmt;

    private String feeType;

    private BigDecimal feeValue;

    private String userNo;

    private String merNo;

    private String merName;

    private String lastDate;

    private Long billId;

    private static final long serialVersionUID = 1L;

    public String getExcode() {
        return excode;
    }

    public void setExcode(String excode) {
        this.excode = excode == null ? null : excode.trim();
    }

    public String getExname() {
        return exname;
    }

    public void setExname(String exname) {
        this.exname = exname == null ? null : exname.trim();
    }

    public BigDecimal getTranAmt() {
        return tranAmt;
    }

    public void setTranAmt(BigDecimal tranAmt) {
        this.tranAmt = tranAmt;
    }

    public BigDecimal getDctAmt() {
        return dctAmt;
    }

    public void setDctAmt(BigDecimal dctAmt) {
        this.dctAmt = dctAmt;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getNum() {
        return num;
    }

    public void setNum(BigDecimal num) {
        this.num = num;
    }

    public BigDecimal getSettleAmt() {
        return settleAmt;
    }

    public void setSettleAmt(BigDecimal settleAmt) {
        this.settleAmt = settleAmt;
    }

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

    public String getMerNo() {
        return merNo;
    }

    public void setMerNo(String merNo) {
        this.merNo = merNo == null ? null : merNo.trim();
    }

    public String getMerName() {
        return merName;
    }

    public void setMerName(String merName) {
        this.merName = merName == null ? null : merName.trim();
    }

    public String getLastDate() {
        return lastDate;
    }

    public void setLastDate(String lastDate) {
        this.lastDate = lastDate == null ? null : lastDate.trim();
    }

    public Long getBillId() {
        return billId;
    }

    public void setBillId(Long billId) {
        this.billId = billId;
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
        AcctFlowFeeExt other = (AcctFlowFeeExt) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTranCode() == null ? other.getTranCode() == null : this.getTranCode().equals(other.getTranCode()))
            && (this.getExcode() == null ? other.getExcode() == null : this.getExcode().equals(other.getExcode()))
            && (this.getExname() == null ? other.getExname() == null : this.getExname().equals(other.getExname()))
            && (this.getTranAmt() == null ? other.getTranAmt() == null : this.getTranAmt().equals(other.getTranAmt()))
            && (this.getDctAmt() == null ? other.getDctAmt() == null : this.getDctAmt().equals(other.getDctAmt()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getNum() == null ? other.getNum() == null : this.getNum().equals(other.getNum()))
            && (this.getSettleAmt() == null ? other.getSettleAmt() == null : this.getSettleAmt().equals(other.getSettleAmt()))
            && (this.getFeeAmt() == null ? other.getFeeAmt() == null : this.getFeeAmt().equals(other.getFeeAmt()))
            && (this.getFeeType() == null ? other.getFeeType() == null : this.getFeeType().equals(other.getFeeType()))
            && (this.getFeeValue() == null ? other.getFeeValue() == null : this.getFeeValue().equals(other.getFeeValue()))
            && (this.getUserNo() == null ? other.getUserNo() == null : this.getUserNo().equals(other.getUserNo()))
            && (this.getMerNo() == null ? other.getMerNo() == null : this.getMerNo().equals(other.getMerNo()))
            && (this.getMerName() == null ? other.getMerName() == null : this.getMerName().equals(other.getMerName()))
            && (this.getLastDate() == null ? other.getLastDate() == null : this.getLastDate().equals(other.getLastDate()))
            && (this.getBillId() == null ? other.getBillId() == null : this.getBillId().equals(other.getBillId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTranCode() == null) ? 0 : getTranCode().hashCode());
        result = prime * result + ((getExcode() == null) ? 0 : getExcode().hashCode());
        result = prime * result + ((getExname() == null) ? 0 : getExname().hashCode());
        result = prime * result + ((getTranAmt() == null) ? 0 : getTranAmt().hashCode());
        result = prime * result + ((getDctAmt() == null) ? 0 : getDctAmt().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getNum() == null) ? 0 : getNum().hashCode());
        result = prime * result + ((getSettleAmt() == null) ? 0 : getSettleAmt().hashCode());
        result = prime * result + ((getFeeAmt() == null) ? 0 : getFeeAmt().hashCode());
        result = prime * result + ((getFeeType() == null) ? 0 : getFeeType().hashCode());
        result = prime * result + ((getFeeValue() == null) ? 0 : getFeeValue().hashCode());
        result = prime * result + ((getUserNo() == null) ? 0 : getUserNo().hashCode());
        result = prime * result + ((getMerNo() == null) ? 0 : getMerNo().hashCode());
        result = prime * result + ((getMerName() == null) ? 0 : getMerName().hashCode());
        result = prime * result + ((getLastDate() == null) ? 0 : getLastDate().hashCode());
        result = prime * result + ((getBillId() == null) ? 0 : getBillId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", excode=").append(excode);
        sb.append(", exname=").append(exname);
        sb.append(", tranAmt=").append(tranAmt);
        sb.append(", dctAmt=").append(dctAmt);
        sb.append(", price=").append(price);
        sb.append(", num=").append(num);
        sb.append(", settleAmt=").append(settleAmt);
        sb.append(", feeAmt=").append(feeAmt);
        sb.append(", feeType=").append(feeType);
        sb.append(", feeValue=").append(feeValue);
        sb.append(", userNo=").append(userNo);
        sb.append(", merNo=").append(merNo);
        sb.append(", merName=").append(merName);
        sb.append(", lastDate=").append(lastDate);
        sb.append(", billId=").append(billId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}