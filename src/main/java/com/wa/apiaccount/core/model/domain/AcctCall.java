package com.wa.apiaccount.core.model.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class AcctCall implements Serializable {
    private Integer id;

    private String sysId;

    private String callType;

    private BigDecimal callAmt;

    private String callAgain;

    private String userNo;

    private String mobileNo;

    private String name;

    private String workNo;

    private String acctNo;

    private Integer callStatus;

    private String batchNo;

    private String mktNo;

    private Integer tranSeq;

    private String exp;

    private String note;

    private String lstTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSysId() {
        return sysId;
    }

    public void setSysId(String sysId) {
        this.sysId = sysId == null ? null : sysId.trim();
    }

    public String getCallType() {
        return callType;
    }

    public void setCallType(String callType) {
        this.callType = callType == null ? null : callType.trim();
    }

    public BigDecimal getCallAmt() {
        return callAmt;
    }

    public void setCallAmt(BigDecimal callAmt) {
        this.callAmt = callAmt;
    }

    public String getCallAgain() {
        return callAgain;
    }

    public void setCallAgain(String callAgain) {
        this.callAgain = callAgain == null ? null : callAgain.trim();
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo == null ? null : userNo.trim();
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo == null ? null : mobileNo.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getWorkNo() {
        return workNo;
    }

    public void setWorkNo(String workNo) {
        this.workNo = workNo == null ? null : workNo.trim();
    }

    public String getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(String acctNo) {
        this.acctNo = acctNo == null ? null : acctNo.trim();
    }

    public Integer getCallStatus() {
        return callStatus;
    }

    public void setCallStatus(Integer callStatus) {
        this.callStatus = callStatus;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo == null ? null : batchNo.trim();
    }

    public String getMktNo() {
        return mktNo;
    }

    public void setMktNo(String mktNo) {
        this.mktNo = mktNo == null ? null : mktNo.trim();
    }

    public Integer getTranSeq() {
        return tranSeq;
    }

    public void setTranSeq(Integer tranSeq) {
        this.tranSeq = tranSeq;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp == null ? null : exp.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public String getLstTime() {
        return lstTime;
    }

    public void setLstTime(String lstTime) {
        this.lstTime = lstTime == null ? null : lstTime.trim();
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
        AcctCall other = (AcctCall) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSysId() == null ? other.getSysId() == null : this.getSysId().equals(other.getSysId()))
            && (this.getCallType() == null ? other.getCallType() == null : this.getCallType().equals(other.getCallType()))
            && (this.getCallAmt() == null ? other.getCallAmt() == null : this.getCallAmt().equals(other.getCallAmt()))
            && (this.getCallAgain() == null ? other.getCallAgain() == null : this.getCallAgain().equals(other.getCallAgain()))
            && (this.getUserNo() == null ? other.getUserNo() == null : this.getUserNo().equals(other.getUserNo()))
            && (this.getMobileNo() == null ? other.getMobileNo() == null : this.getMobileNo().equals(other.getMobileNo()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getWorkNo() == null ? other.getWorkNo() == null : this.getWorkNo().equals(other.getWorkNo()))
            && (this.getAcctNo() == null ? other.getAcctNo() == null : this.getAcctNo().equals(other.getAcctNo()))
            && (this.getCallStatus() == null ? other.getCallStatus() == null : this.getCallStatus().equals(other.getCallStatus()))
            && (this.getBatchNo() == null ? other.getBatchNo() == null : this.getBatchNo().equals(other.getBatchNo()))
            && (this.getMktNo() == null ? other.getMktNo() == null : this.getMktNo().equals(other.getMktNo()))
            && (this.getTranSeq() == null ? other.getTranSeq() == null : this.getTranSeq().equals(other.getTranSeq()))
            && (this.getExp() == null ? other.getExp() == null : this.getExp().equals(other.getExp()))
            && (this.getNote() == null ? other.getNote() == null : this.getNote().equals(other.getNote()))
            && (this.getLstTime() == null ? other.getLstTime() == null : this.getLstTime().equals(other.getLstTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSysId() == null) ? 0 : getSysId().hashCode());
        result = prime * result + ((getCallType() == null) ? 0 : getCallType().hashCode());
        result = prime * result + ((getCallAmt() == null) ? 0 : getCallAmt().hashCode());
        result = prime * result + ((getCallAgain() == null) ? 0 : getCallAgain().hashCode());
        result = prime * result + ((getUserNo() == null) ? 0 : getUserNo().hashCode());
        result = prime * result + ((getMobileNo() == null) ? 0 : getMobileNo().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getWorkNo() == null) ? 0 : getWorkNo().hashCode());
        result = prime * result + ((getAcctNo() == null) ? 0 : getAcctNo().hashCode());
        result = prime * result + ((getCallStatus() == null) ? 0 : getCallStatus().hashCode());
        result = prime * result + ((getBatchNo() == null) ? 0 : getBatchNo().hashCode());
        result = prime * result + ((getMktNo() == null) ? 0 : getMktNo().hashCode());
        result = prime * result + ((getTranSeq() == null) ? 0 : getTranSeq().hashCode());
        result = prime * result + ((getExp() == null) ? 0 : getExp().hashCode());
        result = prime * result + ((getNote() == null) ? 0 : getNote().hashCode());
        result = prime * result + ((getLstTime() == null) ? 0 : getLstTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", sysId=").append(sysId);
        sb.append(", callType=").append(callType);
        sb.append(", callAmt=").append(callAmt);
        sb.append(", callAgain=").append(callAgain);
        sb.append(", userNo=").append(userNo);
        sb.append(", mobileNo=").append(mobileNo);
        sb.append(", name=").append(name);
        sb.append(", workNo=").append(workNo);
        sb.append(", acctNo=").append(acctNo);
        sb.append(", callStatus=").append(callStatus);
        sb.append(", batchNo=").append(batchNo);
        sb.append(", mktNo=").append(mktNo);
        sb.append(", tranSeq=").append(tranSeq);
        sb.append(", exp=").append(exp);
        sb.append(", note=").append(note);
        sb.append(", lstTime=").append(lstTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}