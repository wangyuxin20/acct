package com.wd.apiaccount.model.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class AcctOdrCardJointlyKq extends AcctOdrCardJointlyKqKey implements Serializable {
    private String flowId;

    private Integer tranSeq;

    private String kqId;

    private String kqExp;

    private String number;

    private String userNo;

    private String merNo;

    private String merName;

    private String exCode;

    private String exName;

    private BigDecimal exNum;

    private BigDecimal exPrice;

    private BigDecimal settleAmt;

    private String tranCode;

    private Integer settleType;

    private Integer resvNum;

    private Date lastTime;

    private Integer state;

    private String acctDate;

    private String feeType;

    private BigDecimal feeValue;

    private BigDecimal feeAmt;

    private Long billId;

    private static final long serialVersionUID = 1L;

    public String getFlowId() {
        return flowId;
    }

    public void setFlowId(String flowId) {
        this.flowId = flowId == null ? null : flowId.trim();
    }

    public Integer getTranSeq() {
        return tranSeq;
    }

    public void setTranSeq(Integer tranSeq) {
        this.tranSeq = tranSeq;
    }

    public String getKqId() {
        return kqId;
    }

    public void setKqId(String kqId) {
        this.kqId = kqId == null ? null : kqId.trim();
    }

    public String getKqExp() {
        return kqExp;
    }

    public void setKqExp(String kqExp) {
        this.kqExp = kqExp == null ? null : kqExp.trim();
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

    public String getMerName() {
        return merName;
    }

    public void setMerName(String merName) {
        this.merName = merName == null ? null : merName.trim();
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

    public BigDecimal getSettleAmt() {
        return settleAmt;
    }

    public void setSettleAmt(BigDecimal settleAmt) {
        this.settleAmt = settleAmt;
    }

    public String getTranCode() {
        return tranCode;
    }

    public void setTranCode(String tranCode) {
        this.tranCode = tranCode == null ? null : tranCode.trim();
    }

    public Integer getSettleType() {
        return settleType;
    }

    public void setSettleType(Integer settleType) {
        this.settleType = settleType;
    }

    public Integer getResvNum() {
        return resvNum;
    }

    public void setResvNum(Integer resvNum) {
        this.resvNum = resvNum;
    }

    public Date getLastTime() {
        return lastTime;
    }

    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getAcctDate() {
        return acctDate;
    }

    public void setAcctDate(String acctDate) {
        this.acctDate = acctDate == null ? null : acctDate.trim();
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

    public BigDecimal getFeeAmt() {
        return feeAmt;
    }

    public void setFeeAmt(BigDecimal feeAmt) {
        this.feeAmt = feeAmt;
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
        AcctOdrCardJointlyKq other = (AcctOdrCardJointlyKq) that;
        return (this.getJointlyId() == null ? other.getJointlyId() == null : this.getJointlyId().equals(other.getJointlyId()))
            && (this.getJointlySeq() == null ? other.getJointlySeq() == null : this.getJointlySeq().equals(other.getJointlySeq()))
            && (this.getFlowId() == null ? other.getFlowId() == null : this.getFlowId().equals(other.getFlowId()))
            && (this.getTranSeq() == null ? other.getTranSeq() == null : this.getTranSeq().equals(other.getTranSeq()))
            && (this.getKqId() == null ? other.getKqId() == null : this.getKqId().equals(other.getKqId()))
            && (this.getKqExp() == null ? other.getKqExp() == null : this.getKqExp().equals(other.getKqExp()))
            && (this.getNumber() == null ? other.getNumber() == null : this.getNumber().equals(other.getNumber()))
            && (this.getUserNo() == null ? other.getUserNo() == null : this.getUserNo().equals(other.getUserNo()))
            && (this.getMerNo() == null ? other.getMerNo() == null : this.getMerNo().equals(other.getMerNo()))
            && (this.getMerName() == null ? other.getMerName() == null : this.getMerName().equals(other.getMerName()))
            && (this.getExCode() == null ? other.getExCode() == null : this.getExCode().equals(other.getExCode()))
            && (this.getExName() == null ? other.getExName() == null : this.getExName().equals(other.getExName()))
            && (this.getExNum() == null ? other.getExNum() == null : this.getExNum().equals(other.getExNum()))
            && (this.getExPrice() == null ? other.getExPrice() == null : this.getExPrice().equals(other.getExPrice()))
            && (this.getSettleAmt() == null ? other.getSettleAmt() == null : this.getSettleAmt().equals(other.getSettleAmt()))
            && (this.getTranCode() == null ? other.getTranCode() == null : this.getTranCode().equals(other.getTranCode()))
            && (this.getSettleType() == null ? other.getSettleType() == null : this.getSettleType().equals(other.getSettleType()))
            && (this.getResvNum() == null ? other.getResvNum() == null : this.getResvNum().equals(other.getResvNum()))
            && (this.getLastTime() == null ? other.getLastTime() == null : this.getLastTime().equals(other.getLastTime()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getAcctDate() == null ? other.getAcctDate() == null : this.getAcctDate().equals(other.getAcctDate()))
            && (this.getFeeType() == null ? other.getFeeType() == null : this.getFeeType().equals(other.getFeeType()))
            && (this.getFeeValue() == null ? other.getFeeValue() == null : this.getFeeValue().equals(other.getFeeValue()))
            && (this.getFeeAmt() == null ? other.getFeeAmt() == null : this.getFeeAmt().equals(other.getFeeAmt()))
            && (this.getBillId() == null ? other.getBillId() == null : this.getBillId().equals(other.getBillId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getJointlyId() == null) ? 0 : getJointlyId().hashCode());
        result = prime * result + ((getJointlySeq() == null) ? 0 : getJointlySeq().hashCode());
        result = prime * result + ((getFlowId() == null) ? 0 : getFlowId().hashCode());
        result = prime * result + ((getTranSeq() == null) ? 0 : getTranSeq().hashCode());
        result = prime * result + ((getKqId() == null) ? 0 : getKqId().hashCode());
        result = prime * result + ((getKqExp() == null) ? 0 : getKqExp().hashCode());
        result = prime * result + ((getNumber() == null) ? 0 : getNumber().hashCode());
        result = prime * result + ((getUserNo() == null) ? 0 : getUserNo().hashCode());
        result = prime * result + ((getMerNo() == null) ? 0 : getMerNo().hashCode());
        result = prime * result + ((getMerName() == null) ? 0 : getMerName().hashCode());
        result = prime * result + ((getExCode() == null) ? 0 : getExCode().hashCode());
        result = prime * result + ((getExName() == null) ? 0 : getExName().hashCode());
        result = prime * result + ((getExNum() == null) ? 0 : getExNum().hashCode());
        result = prime * result + ((getExPrice() == null) ? 0 : getExPrice().hashCode());
        result = prime * result + ((getSettleAmt() == null) ? 0 : getSettleAmt().hashCode());
        result = prime * result + ((getTranCode() == null) ? 0 : getTranCode().hashCode());
        result = prime * result + ((getSettleType() == null) ? 0 : getSettleType().hashCode());
        result = prime * result + ((getResvNum() == null) ? 0 : getResvNum().hashCode());
        result = prime * result + ((getLastTime() == null) ? 0 : getLastTime().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getAcctDate() == null) ? 0 : getAcctDate().hashCode());
        result = prime * result + ((getFeeType() == null) ? 0 : getFeeType().hashCode());
        result = prime * result + ((getFeeValue() == null) ? 0 : getFeeValue().hashCode());
        result = prime * result + ((getFeeAmt() == null) ? 0 : getFeeAmt().hashCode());
        result = prime * result + ((getBillId() == null) ? 0 : getBillId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", flowId=").append(flowId);
        sb.append(", tranSeq=").append(tranSeq);
        sb.append(", kqId=").append(kqId);
        sb.append(", kqExp=").append(kqExp);
        sb.append(", number=").append(number);
        sb.append(", userNo=").append(userNo);
        sb.append(", merNo=").append(merNo);
        sb.append(", merName=").append(merName);
        sb.append(", exCode=").append(exCode);
        sb.append(", exName=").append(exName);
        sb.append(", exNum=").append(exNum);
        sb.append(", exPrice=").append(exPrice);
        sb.append(", settleAmt=").append(settleAmt);
        sb.append(", tranCode=").append(tranCode);
        sb.append(", settleType=").append(settleType);
        sb.append(", resvNum=").append(resvNum);
        sb.append(", lastTime=").append(lastTime);
        sb.append(", state=").append(state);
        sb.append(", acctDate=").append(acctDate);
        sb.append(", feeType=").append(feeType);
        sb.append(", feeValue=").append(feeValue);
        sb.append(", feeAmt=").append(feeAmt);
        sb.append(", billId=").append(billId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}