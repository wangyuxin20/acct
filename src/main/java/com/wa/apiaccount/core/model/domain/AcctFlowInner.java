package com.wa.apiaccount.core.model.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class AcctFlowInner implements Serializable {
    private Long id;

    private String flowId;

    private String reqNote;

    private String tranCode;

    private Integer tranSeq;

    private String tranType;

    private String tsfUserNo;

    private String tsfUserType;

    private String tsfAcctNo;

    private String tsfAcctType;

    private String tsfAcctDir;

    private BigDecimal tsfAcctBalB;

    private BigDecimal tsfAcctBalA;

    private BigDecimal tsfAcctBalSumA;

    private BigDecimal tsfAcctFrzBalB;

    private BigDecimal tsfAcctFrzBalA;

    private BigDecimal tsfAcctFrzBalSumA;

    private String oppUserNo;

    private String oppUserType;

    private String oppAcctNo;

    private String oppAcctType;

    private String oppAcctDir;

    private BigDecimal oppAcctBalB;

    private BigDecimal oppAcctBalA;

    private BigDecimal oppAcctBalSumA;

    private BigDecimal oppAcctFrzBalB;

    private BigDecimal oppAcctFrzBalA;

    private BigDecimal oppAcctFrzBalSumA;

    private String acctDate;

    private BigDecimal amt;

    private String currNo;

    private String note;

    private Integer status;

    private String lastTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFlowId() {
        return flowId;
    }

    public void setFlowId(String flowId) {
        this.flowId = flowId == null ? null : flowId.trim();
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

    public Integer getTranSeq() {
        return tranSeq;
    }

    public void setTranSeq(Integer tranSeq) {
        this.tranSeq = tranSeq;
    }

    public String getTranType() {
        return tranType;
    }

    public void setTranType(String tranType) {
        this.tranType = tranType == null ? null : tranType.trim();
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

    public String getTsfAcctNo() {
        return tsfAcctNo;
    }

    public void setTsfAcctNo(String tsfAcctNo) {
        this.tsfAcctNo = tsfAcctNo == null ? null : tsfAcctNo.trim();
    }

    public String getTsfAcctType() {
        return tsfAcctType;
    }

    public void setTsfAcctType(String tsfAcctType) {
        this.tsfAcctType = tsfAcctType == null ? null : tsfAcctType.trim();
    }

    public String getTsfAcctDir() {
        return tsfAcctDir;
    }

    public void setTsfAcctDir(String tsfAcctDir) {
        this.tsfAcctDir = tsfAcctDir == null ? null : tsfAcctDir.trim();
    }

    public BigDecimal getTsfAcctBalB() {
        return tsfAcctBalB;
    }

    public void setTsfAcctBalB(BigDecimal tsfAcctBalB) {
        this.tsfAcctBalB = tsfAcctBalB;
    }

    public BigDecimal getTsfAcctBalA() {
        return tsfAcctBalA;
    }

    public void setTsfAcctBalA(BigDecimal tsfAcctBalA) {
        this.tsfAcctBalA = tsfAcctBalA;
    }

    public BigDecimal getTsfAcctBalSumA() {
        return tsfAcctBalSumA;
    }

    public void setTsfAcctBalSumA(BigDecimal tsfAcctBalSumA) {
        this.tsfAcctBalSumA = tsfAcctBalSumA;
    }

    public BigDecimal getTsfAcctFrzBalB() {
        return tsfAcctFrzBalB;
    }

    public void setTsfAcctFrzBalB(BigDecimal tsfAcctFrzBalB) {
        this.tsfAcctFrzBalB = tsfAcctFrzBalB;
    }

    public BigDecimal getTsfAcctFrzBalA() {
        return tsfAcctFrzBalA;
    }

    public void setTsfAcctFrzBalA(BigDecimal tsfAcctFrzBalA) {
        this.tsfAcctFrzBalA = tsfAcctFrzBalA;
    }

    public BigDecimal getTsfAcctFrzBalSumA() {
        return tsfAcctFrzBalSumA;
    }

    public void setTsfAcctFrzBalSumA(BigDecimal tsfAcctFrzBalSumA) {
        this.tsfAcctFrzBalSumA = tsfAcctFrzBalSumA;
    }

    public String getOppUserNo() {
        return oppUserNo;
    }

    public void setOppUserNo(String oppUserNo) {
        this.oppUserNo = oppUserNo == null ? null : oppUserNo.trim();
    }

    public String getOppUserType() {
        return oppUserType;
    }

    public void setOppUserType(String oppUserType) {
        this.oppUserType = oppUserType == null ? null : oppUserType.trim();
    }

    public String getOppAcctNo() {
        return oppAcctNo;
    }

    public void setOppAcctNo(String oppAcctNo) {
        this.oppAcctNo = oppAcctNo == null ? null : oppAcctNo.trim();
    }

    public String getOppAcctType() {
        return oppAcctType;
    }

    public void setOppAcctType(String oppAcctType) {
        this.oppAcctType = oppAcctType == null ? null : oppAcctType.trim();
    }

    public String getOppAcctDir() {
        return oppAcctDir;
    }

    public void setOppAcctDir(String oppAcctDir) {
        this.oppAcctDir = oppAcctDir == null ? null : oppAcctDir.trim();
    }

    public BigDecimal getOppAcctBalB() {
        return oppAcctBalB;
    }

    public void setOppAcctBalB(BigDecimal oppAcctBalB) {
        this.oppAcctBalB = oppAcctBalB;
    }

    public BigDecimal getOppAcctBalA() {
        return oppAcctBalA;
    }

    public void setOppAcctBalA(BigDecimal oppAcctBalA) {
        this.oppAcctBalA = oppAcctBalA;
    }

    public BigDecimal getOppAcctBalSumA() {
        return oppAcctBalSumA;
    }

    public void setOppAcctBalSumA(BigDecimal oppAcctBalSumA) {
        this.oppAcctBalSumA = oppAcctBalSumA;
    }

    public BigDecimal getOppAcctFrzBalB() {
        return oppAcctFrzBalB;
    }

    public void setOppAcctFrzBalB(BigDecimal oppAcctFrzBalB) {
        this.oppAcctFrzBalB = oppAcctFrzBalB;
    }

    public BigDecimal getOppAcctFrzBalA() {
        return oppAcctFrzBalA;
    }

    public void setOppAcctFrzBalA(BigDecimal oppAcctFrzBalA) {
        this.oppAcctFrzBalA = oppAcctFrzBalA;
    }

    public BigDecimal getOppAcctFrzBalSumA() {
        return oppAcctFrzBalSumA;
    }

    public void setOppAcctFrzBalSumA(BigDecimal oppAcctFrzBalSumA) {
        this.oppAcctFrzBalSumA = oppAcctFrzBalSumA;
    }

    public String getAcctDate() {
        return acctDate;
    }

    public void setAcctDate(String acctDate) {
        this.acctDate = acctDate == null ? null : acctDate.trim();
    }

    public BigDecimal getAmt() {
        return amt;
    }

    public void setAmt(BigDecimal amt) {
        this.amt = amt;
    }

    public String getCurrNo() {
        return currNo;
    }

    public void setCurrNo(String currNo) {
        this.currNo = currNo == null ? null : currNo.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getLastTime() {
        return lastTime;
    }

    public void setLastTime(String lastTime) {
        this.lastTime = lastTime == null ? null : lastTime.trim();
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
        AcctFlowInner other = (AcctFlowInner) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getFlowId() == null ? other.getFlowId() == null : this.getFlowId().equals(other.getFlowId()))
            && (this.getReqNote() == null ? other.getReqNote() == null : this.getReqNote().equals(other.getReqNote()))
            && (this.getTranCode() == null ? other.getTranCode() == null : this.getTranCode().equals(other.getTranCode()))
            && (this.getTranSeq() == null ? other.getTranSeq() == null : this.getTranSeq().equals(other.getTranSeq()))
            && (this.getTranType() == null ? other.getTranType() == null : this.getTranType().equals(other.getTranType()))
            && (this.getTsfUserNo() == null ? other.getTsfUserNo() == null : this.getTsfUserNo().equals(other.getTsfUserNo()))
            && (this.getTsfUserType() == null ? other.getTsfUserType() == null : this.getTsfUserType().equals(other.getTsfUserType()))
            && (this.getTsfAcctNo() == null ? other.getTsfAcctNo() == null : this.getTsfAcctNo().equals(other.getTsfAcctNo()))
            && (this.getTsfAcctType() == null ? other.getTsfAcctType() == null : this.getTsfAcctType().equals(other.getTsfAcctType()))
            && (this.getTsfAcctDir() == null ? other.getTsfAcctDir() == null : this.getTsfAcctDir().equals(other.getTsfAcctDir()))
            && (this.getTsfAcctBalB() == null ? other.getTsfAcctBalB() == null : this.getTsfAcctBalB().equals(other.getTsfAcctBalB()))
            && (this.getTsfAcctBalA() == null ? other.getTsfAcctBalA() == null : this.getTsfAcctBalA().equals(other.getTsfAcctBalA()))
            && (this.getTsfAcctBalSumA() == null ? other.getTsfAcctBalSumA() == null : this.getTsfAcctBalSumA().equals(other.getTsfAcctBalSumA()))
            && (this.getTsfAcctFrzBalB() == null ? other.getTsfAcctFrzBalB() == null : this.getTsfAcctFrzBalB().equals(other.getTsfAcctFrzBalB()))
            && (this.getTsfAcctFrzBalA() == null ? other.getTsfAcctFrzBalA() == null : this.getTsfAcctFrzBalA().equals(other.getTsfAcctFrzBalA()))
            && (this.getTsfAcctFrzBalSumA() == null ? other.getTsfAcctFrzBalSumA() == null : this.getTsfAcctFrzBalSumA().equals(other.getTsfAcctFrzBalSumA()))
            && (this.getOppUserNo() == null ? other.getOppUserNo() == null : this.getOppUserNo().equals(other.getOppUserNo()))
            && (this.getOppUserType() == null ? other.getOppUserType() == null : this.getOppUserType().equals(other.getOppUserType()))
            && (this.getOppAcctNo() == null ? other.getOppAcctNo() == null : this.getOppAcctNo().equals(other.getOppAcctNo()))
            && (this.getOppAcctType() == null ? other.getOppAcctType() == null : this.getOppAcctType().equals(other.getOppAcctType()))
            && (this.getOppAcctDir() == null ? other.getOppAcctDir() == null : this.getOppAcctDir().equals(other.getOppAcctDir()))
            && (this.getOppAcctBalB() == null ? other.getOppAcctBalB() == null : this.getOppAcctBalB().equals(other.getOppAcctBalB()))
            && (this.getOppAcctBalA() == null ? other.getOppAcctBalA() == null : this.getOppAcctBalA().equals(other.getOppAcctBalA()))
            && (this.getOppAcctBalSumA() == null ? other.getOppAcctBalSumA() == null : this.getOppAcctBalSumA().equals(other.getOppAcctBalSumA()))
            && (this.getOppAcctFrzBalB() == null ? other.getOppAcctFrzBalB() == null : this.getOppAcctFrzBalB().equals(other.getOppAcctFrzBalB()))
            && (this.getOppAcctFrzBalA() == null ? other.getOppAcctFrzBalA() == null : this.getOppAcctFrzBalA().equals(other.getOppAcctFrzBalA()))
            && (this.getOppAcctFrzBalSumA() == null ? other.getOppAcctFrzBalSumA() == null : this.getOppAcctFrzBalSumA().equals(other.getOppAcctFrzBalSumA()))
            && (this.getAcctDate() == null ? other.getAcctDate() == null : this.getAcctDate().equals(other.getAcctDate()))
            && (this.getAmt() == null ? other.getAmt() == null : this.getAmt().equals(other.getAmt()))
            && (this.getCurrNo() == null ? other.getCurrNo() == null : this.getCurrNo().equals(other.getCurrNo()))
            && (this.getNote() == null ? other.getNote() == null : this.getNote().equals(other.getNote()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getLastTime() == null ? other.getLastTime() == null : this.getLastTime().equals(other.getLastTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getFlowId() == null) ? 0 : getFlowId().hashCode());
        result = prime * result + ((getReqNote() == null) ? 0 : getReqNote().hashCode());
        result = prime * result + ((getTranCode() == null) ? 0 : getTranCode().hashCode());
        result = prime * result + ((getTranSeq() == null) ? 0 : getTranSeq().hashCode());
        result = prime * result + ((getTranType() == null) ? 0 : getTranType().hashCode());
        result = prime * result + ((getTsfUserNo() == null) ? 0 : getTsfUserNo().hashCode());
        result = prime * result + ((getTsfUserType() == null) ? 0 : getTsfUserType().hashCode());
        result = prime * result + ((getTsfAcctNo() == null) ? 0 : getTsfAcctNo().hashCode());
        result = prime * result + ((getTsfAcctType() == null) ? 0 : getTsfAcctType().hashCode());
        result = prime * result + ((getTsfAcctDir() == null) ? 0 : getTsfAcctDir().hashCode());
        result = prime * result + ((getTsfAcctBalB() == null) ? 0 : getTsfAcctBalB().hashCode());
        result = prime * result + ((getTsfAcctBalA() == null) ? 0 : getTsfAcctBalA().hashCode());
        result = prime * result + ((getTsfAcctBalSumA() == null) ? 0 : getTsfAcctBalSumA().hashCode());
        result = prime * result + ((getTsfAcctFrzBalB() == null) ? 0 : getTsfAcctFrzBalB().hashCode());
        result = prime * result + ((getTsfAcctFrzBalA() == null) ? 0 : getTsfAcctFrzBalA().hashCode());
        result = prime * result + ((getTsfAcctFrzBalSumA() == null) ? 0 : getTsfAcctFrzBalSumA().hashCode());
        result = prime * result + ((getOppUserNo() == null) ? 0 : getOppUserNo().hashCode());
        result = prime * result + ((getOppUserType() == null) ? 0 : getOppUserType().hashCode());
        result = prime * result + ((getOppAcctNo() == null) ? 0 : getOppAcctNo().hashCode());
        result = prime * result + ((getOppAcctType() == null) ? 0 : getOppAcctType().hashCode());
        result = prime * result + ((getOppAcctDir() == null) ? 0 : getOppAcctDir().hashCode());
        result = prime * result + ((getOppAcctBalB() == null) ? 0 : getOppAcctBalB().hashCode());
        result = prime * result + ((getOppAcctBalA() == null) ? 0 : getOppAcctBalA().hashCode());
        result = prime * result + ((getOppAcctBalSumA() == null) ? 0 : getOppAcctBalSumA().hashCode());
        result = prime * result + ((getOppAcctFrzBalB() == null) ? 0 : getOppAcctFrzBalB().hashCode());
        result = prime * result + ((getOppAcctFrzBalA() == null) ? 0 : getOppAcctFrzBalA().hashCode());
        result = prime * result + ((getOppAcctFrzBalSumA() == null) ? 0 : getOppAcctFrzBalSumA().hashCode());
        result = prime * result + ((getAcctDate() == null) ? 0 : getAcctDate().hashCode());
        result = prime * result + ((getAmt() == null) ? 0 : getAmt().hashCode());
        result = prime * result + ((getCurrNo() == null) ? 0 : getCurrNo().hashCode());
        result = prime * result + ((getNote() == null) ? 0 : getNote().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getLastTime() == null) ? 0 : getLastTime().hashCode());
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
        sb.append(", reqNote=").append(reqNote);
        sb.append(", tranCode=").append(tranCode);
        sb.append(", tranSeq=").append(tranSeq);
        sb.append(", tranType=").append(tranType);
        sb.append(", tsfUserNo=").append(tsfUserNo);
        sb.append(", tsfUserType=").append(tsfUserType);
        sb.append(", tsfAcctNo=").append(tsfAcctNo);
        sb.append(", tsfAcctType=").append(tsfAcctType);
        sb.append(", tsfAcctDir=").append(tsfAcctDir);
        sb.append(", tsfAcctBalB=").append(tsfAcctBalB);
        sb.append(", tsfAcctBalA=").append(tsfAcctBalA);
        sb.append(", tsfAcctBalSumA=").append(tsfAcctBalSumA);
        sb.append(", tsfAcctFrzBalB=").append(tsfAcctFrzBalB);
        sb.append(", tsfAcctFrzBalA=").append(tsfAcctFrzBalA);
        sb.append(", tsfAcctFrzBalSumA=").append(tsfAcctFrzBalSumA);
        sb.append(", oppUserNo=").append(oppUserNo);
        sb.append(", oppUserType=").append(oppUserType);
        sb.append(", oppAcctNo=").append(oppAcctNo);
        sb.append(", oppAcctType=").append(oppAcctType);
        sb.append(", oppAcctDir=").append(oppAcctDir);
        sb.append(", oppAcctBalB=").append(oppAcctBalB);
        sb.append(", oppAcctBalA=").append(oppAcctBalA);
        sb.append(", oppAcctBalSumA=").append(oppAcctBalSumA);
        sb.append(", oppAcctFrzBalB=").append(oppAcctFrzBalB);
        sb.append(", oppAcctFrzBalA=").append(oppAcctFrzBalA);
        sb.append(", oppAcctFrzBalSumA=").append(oppAcctFrzBalSumA);
        sb.append(", acctDate=").append(acctDate);
        sb.append(", amt=").append(amt);
        sb.append(", currNo=").append(currNo);
        sb.append(", note=").append(note);
        sb.append(", status=").append(status);
        sb.append(", lastTime=").append(lastTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}