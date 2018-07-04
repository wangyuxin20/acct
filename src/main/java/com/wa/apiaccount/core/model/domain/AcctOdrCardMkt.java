package com.wa.apiaccount.core.model.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class AcctOdrCardMkt implements Serializable {
    private Long id;

    private Long flowId;

    private String acctDate;

    private String userNo;

    private String merNo;

    private String merName;

    private String tranCode;

    private String exType;

    private String exCode;

    private String exName;

    private BigDecimal exNum;

    private BigDecimal exPrice;

    private String currNo;

    private BigDecimal dctAmt;

    private BigDecimal amt;

    private BigDecimal feeAmt;

    private String feeType;

    private BigDecimal feeValue;

    private Integer state;

    private Date lastTime;

    private Long billId;

    private String frzFlowId;

    private String number;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFlowId() {
        return flowId;
    }

    public void setFlowId(Long flowId) {
        this.flowId = flowId;
    }

    public String getAcctDate() {
        return acctDate;
    }

    public void setAcctDate(String acctDate) {
        this.acctDate = acctDate == null ? null : acctDate.trim();
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

    public String getTranCode() {
        return tranCode;
    }

    public void setTranCode(String tranCode) {
        this.tranCode = tranCode == null ? null : tranCode.trim();
    }

    public String getExType() {
        return exType;
    }

    public void setExType(String exType) {
        this.exType = exType == null ? null : exType.trim();
    }

    public String getExCode() {
        return exCode;
    }

    public void setExCode(String exCode) {
        this.exCode = exCode == null ? null : exCode.trim();
    }

    public String getExName() {
        return exName;
    }

    public void setExName(String exName) {
        this.exName = exName == null ? null : exName.trim();
    }

    public BigDecimal getExNum() {
        return exNum;
    }

    public void setExNum(BigDecimal exNum) {
        this.exNum = exNum;
    }

    public BigDecimal getExPrice() {
        return exPrice;
    }

    public void setExPrice(BigDecimal exPrice) {
        this.exPrice = exPrice;
    }

    public String getCurrNo() {
        return currNo;
    }

    public void setCurrNo(String currNo) {
        this.currNo = currNo == null ? null : currNo.trim();
    }

    public BigDecimal getDctAmt() {
        return dctAmt;
    }

    public void setDctAmt(BigDecimal dctAmt) {
        this.dctAmt = dctAmt;
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

    public String getFrzFlowId() {
        return frzFlowId;
    }

    public void setFrzFlowId(String frzFlowId) {
        this.frzFlowId = frzFlowId == null ? null : frzFlowId.trim();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
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
        AcctOdrCardMkt other = (AcctOdrCardMkt) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getFlowId() == null ? other.getFlowId() == null : this.getFlowId().equals(other.getFlowId()))
            && (this.getAcctDate() == null ? other.getAcctDate() == null : this.getAcctDate().equals(other.getAcctDate()))
            && (this.getUserNo() == null ? other.getUserNo() == null : this.getUserNo().equals(other.getUserNo()))
            && (this.getMerNo() == null ? other.getMerNo() == null : this.getMerNo().equals(other.getMerNo()))
            && (this.getMerName() == null ? other.getMerName() == null : this.getMerName().equals(other.getMerName()))
            && (this.getTranCode() == null ? other.getTranCode() == null : this.getTranCode().equals(other.getTranCode()))
            && (this.getExType() == null ? other.getExType() == null : this.getExType().equals(other.getExType()))
            && (this.getExCode() == null ? other.getExCode() == null : this.getExCode().equals(other.getExCode()))
            && (this.getExName() == null ? other.getExName() == null : this.getExName().equals(other.getExName()))
            && (this.getExNum() == null ? other.getExNum() == null : this.getExNum().equals(other.getExNum()))
            && (this.getExPrice() == null ? other.getExPrice() == null : this.getExPrice().equals(other.getExPrice()))
            && (this.getCurrNo() == null ? other.getCurrNo() == null : this.getCurrNo().equals(other.getCurrNo()))
            && (this.getDctAmt() == null ? other.getDctAmt() == null : this.getDctAmt().equals(other.getDctAmt()))
            && (this.getAmt() == null ? other.getAmt() == null : this.getAmt().equals(other.getAmt()))
            && (this.getFeeAmt() == null ? other.getFeeAmt() == null : this.getFeeAmt().equals(other.getFeeAmt()))
            && (this.getFeeType() == null ? other.getFeeType() == null : this.getFeeType().equals(other.getFeeType()))
            && (this.getFeeValue() == null ? other.getFeeValue() == null : this.getFeeValue().equals(other.getFeeValue()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getLastTime() == null ? other.getLastTime() == null : this.getLastTime().equals(other.getLastTime()))
            && (this.getBillId() == null ? other.getBillId() == null : this.getBillId().equals(other.getBillId()))
            && (this.getFrzFlowId() == null ? other.getFrzFlowId() == null : this.getFrzFlowId().equals(other.getFrzFlowId()))
            && (this.getNumber() == null ? other.getNumber() == null : this.getNumber().equals(other.getNumber()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getFlowId() == null) ? 0 : getFlowId().hashCode());
        result = prime * result + ((getAcctDate() == null) ? 0 : getAcctDate().hashCode());
        result = prime * result + ((getUserNo() == null) ? 0 : getUserNo().hashCode());
        result = prime * result + ((getMerNo() == null) ? 0 : getMerNo().hashCode());
        result = prime * result + ((getMerName() == null) ? 0 : getMerName().hashCode());
        result = prime * result + ((getTranCode() == null) ? 0 : getTranCode().hashCode());
        result = prime * result + ((getExType() == null) ? 0 : getExType().hashCode());
        result = prime * result + ((getExCode() == null) ? 0 : getExCode().hashCode());
        result = prime * result + ((getExName() == null) ? 0 : getExName().hashCode());
        result = prime * result + ((getExNum() == null) ? 0 : getExNum().hashCode());
        result = prime * result + ((getExPrice() == null) ? 0 : getExPrice().hashCode());
        result = prime * result + ((getCurrNo() == null) ? 0 : getCurrNo().hashCode());
        result = prime * result + ((getDctAmt() == null) ? 0 : getDctAmt().hashCode());
        result = prime * result + ((getAmt() == null) ? 0 : getAmt().hashCode());
        result = prime * result + ((getFeeAmt() == null) ? 0 : getFeeAmt().hashCode());
        result = prime * result + ((getFeeType() == null) ? 0 : getFeeType().hashCode());
        result = prime * result + ((getFeeValue() == null) ? 0 : getFeeValue().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getLastTime() == null) ? 0 : getLastTime().hashCode());
        result = prime * result + ((getBillId() == null) ? 0 : getBillId().hashCode());
        result = prime * result + ((getFrzFlowId() == null) ? 0 : getFrzFlowId().hashCode());
        result = prime * result + ((getNumber() == null) ? 0 : getNumber().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", flowId=").append(flowId);
        sb.append(", acctDate=").append(acctDate);
        sb.append(", userNo=").append(userNo);
        sb.append(", merNo=").append(merNo);
        sb.append(", merName=").append(merName);
        sb.append(", tranCode=").append(tranCode);
        sb.append(", exType=").append(exType);
        sb.append(", exCode=").append(exCode);
        sb.append(", exName=").append(exName);
        sb.append(", exNum=").append(exNum);
        sb.append(", exPrice=").append(exPrice);
        sb.append(", currNo=").append(currNo);
        sb.append(", dctAmt=").append(dctAmt);
        sb.append(", amt=").append(amt);
        sb.append(", feeAmt=").append(feeAmt);
        sb.append(", feeType=").append(feeType);
        sb.append(", feeValue=").append(feeValue);
        sb.append(", state=").append(state);
        sb.append(", lastTime=").append(lastTime);
        sb.append(", billId=").append(billId);
        sb.append(", frzFlowId=").append(frzFlowId);
        sb.append(", number=").append(number);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}