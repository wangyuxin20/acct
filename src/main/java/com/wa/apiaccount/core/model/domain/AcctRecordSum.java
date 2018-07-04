package com.wa.apiaccount.core.model.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class AcctRecordSum implements Serializable {
    private Long id;

    private String acctNo;

    private String userNo;

    private String currNo;

    private String acctTypeNo;

    private BigDecimal bal;

    private BigDecimal amt;

    private Long inrFlowId;

    private String tsfOppDir;

    private Integer state;

    private String lastTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(String acctNo) {
        this.acctNo = acctNo == null ? null : acctNo.trim();
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo == null ? null : userNo.trim();
    }

    public String getCurrNo() {
        return currNo;
    }

    public void setCurrNo(String currNo) {
        this.currNo = currNo == null ? null : currNo.trim();
    }

    public String getAcctTypeNo() {
        return acctTypeNo;
    }

    public void setAcctTypeNo(String acctTypeNo) {
        this.acctTypeNo = acctTypeNo == null ? null : acctTypeNo.trim();
    }

    public BigDecimal getBal() {
        return bal;
    }

    public void setBal(BigDecimal bal) {
        this.bal = bal;
    }

    public BigDecimal getAmt() {
        return amt;
    }

    public void setAmt(BigDecimal amt) {
        this.amt = amt;
    }

    public Long getInrFlowId() {
        return inrFlowId;
    }

    public void setInrFlowId(Long inrFlowId) {
        this.inrFlowId = inrFlowId;
    }

    public String getTsfOppDir() {
        return tsfOppDir;
    }

    public void setTsfOppDir(String tsfOppDir) {
        this.tsfOppDir = tsfOppDir == null ? null : tsfOppDir.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
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
        AcctRecordSum other = (AcctRecordSum) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAcctNo() == null ? other.getAcctNo() == null : this.getAcctNo().equals(other.getAcctNo()))
            && (this.getUserNo() == null ? other.getUserNo() == null : this.getUserNo().equals(other.getUserNo()))
            && (this.getCurrNo() == null ? other.getCurrNo() == null : this.getCurrNo().equals(other.getCurrNo()))
            && (this.getAcctTypeNo() == null ? other.getAcctTypeNo() == null : this.getAcctTypeNo().equals(other.getAcctTypeNo()))
            && (this.getBal() == null ? other.getBal() == null : this.getBal().equals(other.getBal()))
            && (this.getAmt() == null ? other.getAmt() == null : this.getAmt().equals(other.getAmt()))
            && (this.getInrFlowId() == null ? other.getInrFlowId() == null : this.getInrFlowId().equals(other.getInrFlowId()))
            && (this.getTsfOppDir() == null ? other.getTsfOppDir() == null : this.getTsfOppDir().equals(other.getTsfOppDir()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getLastTime() == null ? other.getLastTime() == null : this.getLastTime().equals(other.getLastTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAcctNo() == null) ? 0 : getAcctNo().hashCode());
        result = prime * result + ((getUserNo() == null) ? 0 : getUserNo().hashCode());
        result = prime * result + ((getCurrNo() == null) ? 0 : getCurrNo().hashCode());
        result = prime * result + ((getAcctTypeNo() == null) ? 0 : getAcctTypeNo().hashCode());
        result = prime * result + ((getBal() == null) ? 0 : getBal().hashCode());
        result = prime * result + ((getAmt() == null) ? 0 : getAmt().hashCode());
        result = prime * result + ((getInrFlowId() == null) ? 0 : getInrFlowId().hashCode());
        result = prime * result + ((getTsfOppDir() == null) ? 0 : getTsfOppDir().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
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
        sb.append(", acctNo=").append(acctNo);
        sb.append(", userNo=").append(userNo);
        sb.append(", currNo=").append(currNo);
        sb.append(", acctTypeNo=").append(acctTypeNo);
        sb.append(", bal=").append(bal);
        sb.append(", amt=").append(amt);
        sb.append(", inrFlowId=").append(inrFlowId);
        sb.append(", tsfOppDir=").append(tsfOppDir);
        sb.append(", state=").append(state);
        sb.append(", lastTime=").append(lastTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}