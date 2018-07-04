package com.wd.apiaccount.model.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class AcctFlow implements Serializable {
    private Long id;

    private String reqId;

    private String reqNote;

    private String tranCode;

    private String tsfUserNo;

    private String tsfUserType;

    private String tsfAcctDir;

    private String oppUserNo;

    private String oppUserName;

    private String oppUserType;

    private String oppAcctDir;

    private BigDecimal amt;

    private BigDecimal dctAmt;

    private BigDecimal feeAmt;

    private String feeType;

    private BigDecimal feeValue;

    private String currNo;

    private String acctDate;

    private Integer status;

    private String note;

    private String lastTime;

    private Integer clusterId;

    private String errCode;

    private String exCode;

    private String exName;

    private BigDecimal exPrice;

    private BigDecimal exNum;

    private Date insertTime;

    private Long frzFlowId;

    private String number;

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

    public String getReqNote() {
        return reqNote;
    }

    public void setReqNote(String reqNote) {
        this.reqNote = reqNote == null ? null : reqNote.trim();
    }

    public String getTranCode() {
        return tranCode;
    }

    public void setTranCode(String tranCode) {
        this.tranCode = tranCode == null ? null : tranCode.trim();
    }

    public String getTsfUserNo() {
        return tsfUserNo;
    }

    public void setTsfUserNo(String tsfUserNo) {
        this.tsfUserNo = tsfUserNo == null ? null : tsfUserNo.trim();
    }

    public String getTsfUserType() {
        return tsfUserType;
    }

    public void setTsfUserType(String tsfUserType) {
        this.tsfUserType = tsfUserType == null ? null : tsfUserType.trim();
    }

    public String getTsfAcctDir() {
        return tsfAcctDir;
    }

    public void setTsfAcctDir(String tsfAcctDir) {
        this.tsfAcctDir = tsfAcctDir == null ? null : tsfAcctDir.trim();
    }

    public String getOppUserNo() {
        return oppUserNo;
    }

    public void setOppUserNo(String oppUserNo) {
        this.oppUserNo = oppUserNo == null ? null : oppUserNo.trim();
    }

    public String getOppUserName() {
        return oppUserName;
    }

    public void setOppUserName(String oppUserName) {
        this.oppUserName = oppUserName == null ? null : oppUserName.trim();
    }

    public String getOppUserType() {
        return oppUserType;
    }

    public void setOppUserType(String oppUserType) {
        this.oppUserType = oppUserType == null ? null : oppUserType.trim();
    }

    public String getOppAcctDir() {
        return oppAcctDir;
    }

    public void setOppAcctDir(String oppAcctDir) {
        this.oppAcctDir = oppAcctDir == null ? null : oppAcctDir.trim();
    }

    public BigDecimal getAmt() {
        return amt;
    }

    public void setAmt(BigDecimal amt) {
        this.amt = amt;
    }

    public BigDecimal getDctAmt() {
        return dctAmt;
    }

    public void setDctAmt(BigDecimal dctAmt) {
        this.dctAmt = dctAmt;
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

    public String getCurrNo() {
        return currNo;
    }

    public void setCurrNo(String currNo) {
        this.currNo = currNo == null ? null : currNo.trim();
    }

    public String getAcctDate() {
        return acctDate;
    }

    public void setAcctDate(String acctDate) {
        this.acctDate = acctDate == null ? null : acctDate.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public String getLastTime() {
        return lastTime;
    }

    public void setLastTime(String lastTime) {
        this.lastTime = lastTime == null ? null : lastTime.trim();
    }

    public Integer getClusterId() {
        return clusterId;
    }

    public void setClusterId(Integer clusterId) {
        this.clusterId = clusterId;
    }

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode == null ? null : errCode.trim();
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

    public BigDecimal getExPrice() {
        return exPrice;
    }

    public void setExPrice(BigDecimal exPrice) {
        this.exPrice = exPrice;
    }

    public BigDecimal getExNum() {
        return exNum;
    }

    public void setExNum(BigDecimal exNum) {
        this.exNum = exNum;
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    public Long getFrzFlowId() {
        return frzFlowId;
    }

    public void setFrzFlowId(Long frzFlowId) {
        this.frzFlowId = frzFlowId;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
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
        AcctFlow other = (AcctFlow) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getReqId() == null ? other.getReqId() == null : this.getReqId().equals(other.getReqId()))
            && (this.getReqNote() == null ? other.getReqNote() == null : this.getReqNote().equals(other.getReqNote()))
            && (this.getTranCode() == null ? other.getTranCode() == null : this.getTranCode().equals(other.getTranCode()))
            && (this.getTsfUserNo() == null ? other.getTsfUserNo() == null : this.getTsfUserNo().equals(other.getTsfUserNo()))
            && (this.getTsfUserType() == null ? other.getTsfUserType() == null : this.getTsfUserType().equals(other.getTsfUserType()))
            && (this.getTsfAcctDir() == null ? other.getTsfAcctDir() == null : this.getTsfAcctDir().equals(other.getTsfAcctDir()))
            && (this.getOppUserNo() == null ? other.getOppUserNo() == null : this.getOppUserNo().equals(other.getOppUserNo()))
            && (this.getOppUserName() == null ? other.getOppUserName() == null : this.getOppUserName().equals(other.getOppUserName()))
            && (this.getOppUserType() == null ? other.getOppUserType() == null : this.getOppUserType().equals(other.getOppUserType()))
            && (this.getOppAcctDir() == null ? other.getOppAcctDir() == null : this.getOppAcctDir().equals(other.getOppAcctDir()))
            && (this.getAmt() == null ? other.getAmt() == null : this.getAmt().equals(other.getAmt()))
            && (this.getDctAmt() == null ? other.getDctAmt() == null : this.getDctAmt().equals(other.getDctAmt()))
            && (this.getFeeAmt() == null ? other.getFeeAmt() == null : this.getFeeAmt().equals(other.getFeeAmt()))
            && (this.getFeeType() == null ? other.getFeeType() == null : this.getFeeType().equals(other.getFeeType()))
            && (this.getFeeValue() == null ? other.getFeeValue() == null : this.getFeeValue().equals(other.getFeeValue()))
            && (this.getCurrNo() == null ? other.getCurrNo() == null : this.getCurrNo().equals(other.getCurrNo()))
            && (this.getAcctDate() == null ? other.getAcctDate() == null : this.getAcctDate().equals(other.getAcctDate()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getNote() == null ? other.getNote() == null : this.getNote().equals(other.getNote()))
            && (this.getLastTime() == null ? other.getLastTime() == null : this.getLastTime().equals(other.getLastTime()))
            && (this.getClusterId() == null ? other.getClusterId() == null : this.getClusterId().equals(other.getClusterId()))
            && (this.getErrCode() == null ? other.getErrCode() == null : this.getErrCode().equals(other.getErrCode()))
            && (this.getExCode() == null ? other.getExCode() == null : this.getExCode().equals(other.getExCode()))
            && (this.getExName() == null ? other.getExName() == null : this.getExName().equals(other.getExName()))
            && (this.getExPrice() == null ? other.getExPrice() == null : this.getExPrice().equals(other.getExPrice()))
            && (this.getExNum() == null ? other.getExNum() == null : this.getExNum().equals(other.getExNum()))
            && (this.getInsertTime() == null ? other.getInsertTime() == null : this.getInsertTime().equals(other.getInsertTime()))
            && (this.getFrzFlowId() == null ? other.getFrzFlowId() == null : this.getFrzFlowId().equals(other.getFrzFlowId()))
            && (this.getNumber() == null ? other.getNumber() == null : this.getNumber().equals(other.getNumber()))
            && (this.getBillId() == null ? other.getBillId() == null : this.getBillId().equals(other.getBillId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getReqId() == null) ? 0 : getReqId().hashCode());
        result = prime * result + ((getReqNote() == null) ? 0 : getReqNote().hashCode());
        result = prime * result + ((getTranCode() == null) ? 0 : getTranCode().hashCode());
        result = prime * result + ((getTsfUserNo() == null) ? 0 : getTsfUserNo().hashCode());
        result = prime * result + ((getTsfUserType() == null) ? 0 : getTsfUserType().hashCode());
        result = prime * result + ((getTsfAcctDir() == null) ? 0 : getTsfAcctDir().hashCode());
        result = prime * result + ((getOppUserNo() == null) ? 0 : getOppUserNo().hashCode());
        result = prime * result + ((getOppUserName() == null) ? 0 : getOppUserName().hashCode());
        result = prime * result + ((getOppUserType() == null) ? 0 : getOppUserType().hashCode());
        result = prime * result + ((getOppAcctDir() == null) ? 0 : getOppAcctDir().hashCode());
        result = prime * result + ((getAmt() == null) ? 0 : getAmt().hashCode());
        result = prime * result + ((getDctAmt() == null) ? 0 : getDctAmt().hashCode());
        result = prime * result + ((getFeeAmt() == null) ? 0 : getFeeAmt().hashCode());
        result = prime * result + ((getFeeType() == null) ? 0 : getFeeType().hashCode());
        result = prime * result + ((getFeeValue() == null) ? 0 : getFeeValue().hashCode());
        result = prime * result + ((getCurrNo() == null) ? 0 : getCurrNo().hashCode());
        result = prime * result + ((getAcctDate() == null) ? 0 : getAcctDate().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getNote() == null) ? 0 : getNote().hashCode());
        result = prime * result + ((getLastTime() == null) ? 0 : getLastTime().hashCode());
        result = prime * result + ((getClusterId() == null) ? 0 : getClusterId().hashCode());
        result = prime * result + ((getErrCode() == null) ? 0 : getErrCode().hashCode());
        result = prime * result + ((getExCode() == null) ? 0 : getExCode().hashCode());
        result = prime * result + ((getExName() == null) ? 0 : getExName().hashCode());
        result = prime * result + ((getExPrice() == null) ? 0 : getExPrice().hashCode());
        result = prime * result + ((getExNum() == null) ? 0 : getExNum().hashCode());
        result = prime * result + ((getInsertTime() == null) ? 0 : getInsertTime().hashCode());
        result = prime * result + ((getFrzFlowId() == null) ? 0 : getFrzFlowId().hashCode());
        result = prime * result + ((getNumber() == null) ? 0 : getNumber().hashCode());
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
        sb.append(", reqNote=").append(reqNote);
        sb.append(", tranCode=").append(tranCode);
        sb.append(", tsfUserNo=").append(tsfUserNo);
        sb.append(", tsfUserType=").append(tsfUserType);
        sb.append(", tsfAcctDir=").append(tsfAcctDir);
        sb.append(", oppUserNo=").append(oppUserNo);
        sb.append(", oppUserName=").append(oppUserName);
        sb.append(", oppUserType=").append(oppUserType);
        sb.append(", oppAcctDir=").append(oppAcctDir);
        sb.append(", amt=").append(amt);
        sb.append(", dctAmt=").append(dctAmt);
        sb.append(", feeAmt=").append(feeAmt);
        sb.append(", feeType=").append(feeType);
        sb.append(", feeValue=").append(feeValue);
        sb.append(", currNo=").append(currNo);
        sb.append(", acctDate=").append(acctDate);
        sb.append(", status=").append(status);
        sb.append(", note=").append(note);
        sb.append(", lastTime=").append(lastTime);
        sb.append(", clusterId=").append(clusterId);
        sb.append(", errCode=").append(errCode);
        sb.append(", exCode=").append(exCode);
        sb.append(", exName=").append(exName);
        sb.append(", exPrice=").append(exPrice);
        sb.append(", exNum=").append(exNum);
        sb.append(", insertTime=").append(insertTime);
        sb.append(", frzFlowId=").append(frzFlowId);
        sb.append(", number=").append(number);
        sb.append(", billId=").append(billId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}