package com.wd.apiaccount.model.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SettlePactProfit implements Serializable {
    private Integer id;

    private String merNo;

    private String businessType;

    private String agreementCode;

    private String agreementNo;

    private Date validateStart;

    private Date validateEnd;

    private Integer channel;

    private String wytProfitType;

    private BigDecimal wytProfitValue;

    private String jointProfitType;

    private BigDecimal jointProfitValue;

    private String validStatus;

    private Date insertTime;

    private String operator;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMerNo() {
        return merNo;
    }

    public void setMerNo(String merNo) {
        this.merNo = merNo == null ? null : merNo.trim();
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType == null ? null : businessType.trim();
    }

    public String getAgreementCode() {
        return agreementCode;
    }

    public void setAgreementCode(String agreementCode) {
        this.agreementCode = agreementCode == null ? null : agreementCode.trim();
    }

    public String getAgreementNo() {
        return agreementNo;
    }

    public void setAgreementNo(String agreementNo) {
        this.agreementNo = agreementNo == null ? null : agreementNo.trim();
    }

    public Date getValidateStart() {
        return validateStart;
    }

    public void setValidateStart(Date validateStart) {
        this.validateStart = validateStart;
    }

    public Date getValidateEnd() {
        return validateEnd;
    }

    public void setValidateEnd(Date validateEnd) {
        this.validateEnd = validateEnd;
    }

    public Integer getChannel() {
        return channel;
    }

    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    public String getWytProfitType() {
        return wytProfitType;
    }

    public void setWytProfitType(String wytProfitType) {
        this.wytProfitType = wytProfitType == null ? null : wytProfitType.trim();
    }

    public BigDecimal getWytProfitValue() {
        return wytProfitValue;
    }

    public void setWytProfitValue(BigDecimal wytProfitValue) {
        this.wytProfitValue = wytProfitValue;
    }

    public String getJointProfitType() {
        return jointProfitType;
    }

    public void setJointProfitType(String jointProfitType) {
        this.jointProfitType = jointProfitType == null ? null : jointProfitType.trim();
    }

    public BigDecimal getJointProfitValue() {
        return jointProfitValue;
    }

    public void setJointProfitValue(BigDecimal jointProfitValue) {
        this.jointProfitValue = jointProfitValue;
    }

    public String getValidStatus() {
        return validStatus;
    }

    public void setValidStatus(String validStatus) {
        this.validStatus = validStatus == null ? null : validStatus.trim();
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
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
        SettlePactProfit other = (SettlePactProfit) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMerNo() == null ? other.getMerNo() == null : this.getMerNo().equals(other.getMerNo()))
            && (this.getBusinessType() == null ? other.getBusinessType() == null : this.getBusinessType().equals(other.getBusinessType()))
            && (this.getAgreementCode() == null ? other.getAgreementCode() == null : this.getAgreementCode().equals(other.getAgreementCode()))
            && (this.getAgreementNo() == null ? other.getAgreementNo() == null : this.getAgreementNo().equals(other.getAgreementNo()))
            && (this.getValidateStart() == null ? other.getValidateStart() == null : this.getValidateStart().equals(other.getValidateStart()))
            && (this.getValidateEnd() == null ? other.getValidateEnd() == null : this.getValidateEnd().equals(other.getValidateEnd()))
            && (this.getChannel() == null ? other.getChannel() == null : this.getChannel().equals(other.getChannel()))
            && (this.getWytProfitType() == null ? other.getWytProfitType() == null : this.getWytProfitType().equals(other.getWytProfitType()))
            && (this.getWytProfitValue() == null ? other.getWytProfitValue() == null : this.getWytProfitValue().equals(other.getWytProfitValue()))
            && (this.getJointProfitType() == null ? other.getJointProfitType() == null : this.getJointProfitType().equals(other.getJointProfitType()))
            && (this.getJointProfitValue() == null ? other.getJointProfitValue() == null : this.getJointProfitValue().equals(other.getJointProfitValue()))
            && (this.getValidStatus() == null ? other.getValidStatus() == null : this.getValidStatus().equals(other.getValidStatus()))
            && (this.getInsertTime() == null ? other.getInsertTime() == null : this.getInsertTime().equals(other.getInsertTime()))
            && (this.getOperator() == null ? other.getOperator() == null : this.getOperator().equals(other.getOperator()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMerNo() == null) ? 0 : getMerNo().hashCode());
        result = prime * result + ((getBusinessType() == null) ? 0 : getBusinessType().hashCode());
        result = prime * result + ((getAgreementCode() == null) ? 0 : getAgreementCode().hashCode());
        result = prime * result + ((getAgreementNo() == null) ? 0 : getAgreementNo().hashCode());
        result = prime * result + ((getValidateStart() == null) ? 0 : getValidateStart().hashCode());
        result = prime * result + ((getValidateEnd() == null) ? 0 : getValidateEnd().hashCode());
        result = prime * result + ((getChannel() == null) ? 0 : getChannel().hashCode());
        result = prime * result + ((getWytProfitType() == null) ? 0 : getWytProfitType().hashCode());
        result = prime * result + ((getWytProfitValue() == null) ? 0 : getWytProfitValue().hashCode());
        result = prime * result + ((getJointProfitType() == null) ? 0 : getJointProfitType().hashCode());
        result = prime * result + ((getJointProfitValue() == null) ? 0 : getJointProfitValue().hashCode());
        result = prime * result + ((getValidStatus() == null) ? 0 : getValidStatus().hashCode());
        result = prime * result + ((getInsertTime() == null) ? 0 : getInsertTime().hashCode());
        result = prime * result + ((getOperator() == null) ? 0 : getOperator().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", merNo=").append(merNo);
        sb.append(", businessType=").append(businessType);
        sb.append(", agreementCode=").append(agreementCode);
        sb.append(", agreementNo=").append(agreementNo);
        sb.append(", validateStart=").append(validateStart);
        sb.append(", validateEnd=").append(validateEnd);
        sb.append(", channel=").append(channel);
        sb.append(", wytProfitType=").append(wytProfitType);
        sb.append(", wytProfitValue=").append(wytProfitValue);
        sb.append(", jointProfitType=").append(jointProfitType);
        sb.append(", jointProfitValue=").append(jointProfitValue);
        sb.append(", validStatus=").append(validStatus);
        sb.append(", insertTime=").append(insertTime);
        sb.append(", operator=").append(operator);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}