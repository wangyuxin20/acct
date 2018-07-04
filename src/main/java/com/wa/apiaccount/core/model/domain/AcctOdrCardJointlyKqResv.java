package com.wa.apiaccount.core.model.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class AcctOdrCardJointlyKqResv implements Serializable {
    private Long id;

    private String reqId;

    private Long jointlyId;

    private Integer jointlySeq;

    private String kqId;

    private String number;

    private String userNo;

    private String merNo;

    private String bizMerName;

    private String exCode;

    private BigDecimal amt;

    private BigDecimal feeAmt;

    private BigDecimal feeValue;

    private String feeType;

    private Integer mktSeq;

    private BigDecimal mktAmt;

    private Integer state;

    private Date lastTime;

    private Long billId;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReqId() {
        return reqId;
    }

    public void setReqId(String reqId) {
        this.reqId = reqId == null ? null : reqId.trim();
    }

    public Long getJointlyId() {
        return jointlyId;
    }

    public void setJointlyId(Long jointlyId) {
        this.jointlyId = jointlyId;
    }

    public Integer getJointlySeq() {
        return jointlySeq;
    }

    public void setJointlySeq(Integer jointlySeq) {
        this.jointlySeq = jointlySeq;
    }

    public String getKqId() {
        return kqId;
    }

    public void setKqId(String kqId) {
        this.kqId = kqId == null ? null : kqId.trim();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
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

    public String getBizMerName() {
        return bizMerName;
    }

    public void setBizMerName(String bizMerName) {
        this.bizMerName = bizMerName == null ? null : bizMerName.trim();
    }

    public String getExCode() {
        return exCode;
    }

    public void setExCode(String exCode) {
        this.exCode = exCode == null ? null : exCode.trim();
    }

    public BigDecimal getAmt() {
        return amt;
    }

    public void setAmt(BigDecimal amt) {
        this.amt = amt;
    }

    public BigDecimal getFeeAmt() {
        return feeAmt;
    }

    public void setFeeAmt(BigDecimal feeAmt) {
        this.feeAmt = feeAmt;
    }

    public BigDecimal getFeeValue() {
        return feeValue;
    }

    public void setFeeValue(BigDecimal feeValue) {
        this.feeValue = feeValue;
    }

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType == null ? null : feeType.trim();
    }

    public Integer getMktSeq() {
        return mktSeq;
    }

    public void setMktSeq(Integer mktSeq) {
        this.mktSeq = mktSeq;
    }

    public BigDecimal getMktAmt() {
        return mktAmt;
    }

    public void setMktAmt(BigDecimal mktAmt) {
        this.mktAmt = mktAmt;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getLastTime() {
        return lastTime;
    }

    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
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
        AcctOdrCardJointlyKqResv other = (AcctOdrCardJointlyKqResv) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getReqId() == null ? other.getReqId() == null : this.getReqId().equals(other.getReqId()))
            && (this.getJointlyId() == null ? other.getJointlyId() == null : this.getJointlyId().equals(other.getJointlyId()))
            && (this.getJointlySeq() == null ? other.getJointlySeq() == null : this.getJointlySeq().equals(other.getJointlySeq()))
            && (this.getKqId() == null ? other.getKqId() == null : this.getKqId().equals(other.getKqId()))
            && (this.getNumber() == null ? other.getNumber() == null : this.getNumber().equals(other.getNumber()))
            && (this.getUserNo() == null ? other.getUserNo() == null : this.getUserNo().equals(other.getUserNo()))
            && (this.getMerNo() == null ? other.getMerNo() == null : this.getMerNo().equals(other.getMerNo()))
            && (this.getBizMerName() == null ? other.getBizMerName() == null : this.getBizMerName().equals(other.getBizMerName()))
            && (this.getExCode() == null ? other.getExCode() == null : this.getExCode().equals(other.getExCode()))
            && (this.getAmt() == null ? other.getAmt() == null : this.getAmt().equals(other.getAmt()))
            && (this.getFeeAmt() == null ? other.getFeeAmt() == null : this.getFeeAmt().equals(other.getFeeAmt()))
            && (this.getFeeValue() == null ? other.getFeeValue() == null : this.getFeeValue().equals(other.getFeeValue()))
            && (this.getFeeType() == null ? other.getFeeType() == null : this.getFeeType().equals(other.getFeeType()))
            && (this.getMktSeq() == null ? other.getMktSeq() == null : this.getMktSeq().equals(other.getMktSeq()))
            && (this.getMktAmt() == null ? other.getMktAmt() == null : this.getMktAmt().equals(other.getMktAmt()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getLastTime() == null ? other.getLastTime() == null : this.getLastTime().equals(other.getLastTime()))
            && (this.getBillId() == null ? other.getBillId() == null : this.getBillId().equals(other.getBillId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getReqId() == null) ? 0 : getReqId().hashCode());
        result = prime * result + ((getJointlyId() == null) ? 0 : getJointlyId().hashCode());
        result = prime * result + ((getJointlySeq() == null) ? 0 : getJointlySeq().hashCode());
        result = prime * result + ((getKqId() == null) ? 0 : getKqId().hashCode());
        result = prime * result + ((getNumber() == null) ? 0 : getNumber().hashCode());
        result = prime * result + ((getUserNo() == null) ? 0 : getUserNo().hashCode());
        result = prime * result + ((getMerNo() == null) ? 0 : getMerNo().hashCode());
        result = prime * result + ((getBizMerName() == null) ? 0 : getBizMerName().hashCode());
        result = prime * result + ((getExCode() == null) ? 0 : getExCode().hashCode());
        result = prime * result + ((getAmt() == null) ? 0 : getAmt().hashCode());
        result = prime * result + ((getFeeAmt() == null) ? 0 : getFeeAmt().hashCode());
        result = prime * result + ((getFeeValue() == null) ? 0 : getFeeValue().hashCode());
        result = prime * result + ((getFeeType() == null) ? 0 : getFeeType().hashCode());
        result = prime * result + ((getMktSeq() == null) ? 0 : getMktSeq().hashCode());
        result = prime * result + ((getMktAmt() == null) ? 0 : getMktAmt().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getLastTime() == null) ? 0 : getLastTime().hashCode());
        result = prime * result + ((getBillId() == null) ? 0 : getBillId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", reqId=").append(reqId);
        sb.append(", jointlyId=").append(jointlyId);
        sb.append(", jointlySeq=").append(jointlySeq);
        sb.append(", kqId=").append(kqId);
        sb.append(", number=").append(number);
        sb.append(", userNo=").append(userNo);
        sb.append(", merNo=").append(merNo);
        sb.append(", bizMerName=").append(bizMerName);
        sb.append(", exCode=").append(exCode);
        sb.append(", amt=").append(amt);
        sb.append(", feeAmt=").append(feeAmt);
        sb.append(", feeValue=").append(feeValue);
        sb.append(", feeType=").append(feeType);
        sb.append(", mktSeq=").append(mktSeq);
        sb.append(", mktAmt=").append(mktAmt);
        sb.append(", state=").append(state);
        sb.append(", lastTime=").append(lastTime);
        sb.append(", billId=").append(billId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}