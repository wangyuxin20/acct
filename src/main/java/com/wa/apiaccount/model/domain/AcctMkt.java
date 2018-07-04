package com.wd.apiaccount.model.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class AcctMkt implements Serializable {
    private Integer tranSeq;

    private String mktNo;

    private String mktName;

    private String mktSubAcctName;

    private Date ffbDueTime;

    private BigDecimal mktAmt;

    private BigDecimal outAmt;

    private Integer outNum;

    private Date mktDateStart;

    private Date mktDateEnd;

    private String status;

    private String acctType;

    private String acctNo;

    private Date creTime;

    private Integer minInvlLimit;

    private Integer joinNumLimit;

    private BigDecimal amtLimit;

    private Date lstTime;

    private static final long serialVersionUID = 1L;

    public Integer getTranSeq() {
        return tranSeq;
    }

    public void setTranSeq(Integer tranSeq) {
        this.tranSeq = tranSeq;
    }

    public String getMktNo() {
        return mktNo;
    }

    public void setMktNo(String mktNo) {
        this.mktNo = mktNo == null ? null : mktNo.trim();
    }

    public String getMktName() {
        return mktName;
    }

    public void setMktName(String mktName) {
        this.mktName = mktName == null ? null : mktName.trim();
    }

    public String getMktSubAcctName() {
        return mktSubAcctName;
    }

    public void setMktSubAcctName(String mktSubAcctName) {
        this.mktSubAcctName = mktSubAcctName == null ? null : mktSubAcctName.trim();
    }

    public Date getFfbDueTime() {
        return ffbDueTime;
    }

    public void setFfbDueTime(Date ffbDueTime) {
        this.ffbDueTime = ffbDueTime;
    }

    public BigDecimal getMktAmt() {
        return mktAmt;
    }

    public void setMktAmt(BigDecimal mktAmt) {
        this.mktAmt = mktAmt;
    }

    public BigDecimal getOutAmt() {
        return outAmt;
    }

    public void setOutAmt(BigDecimal outAmt) {
        this.outAmt = outAmt;
    }

    public Integer getOutNum() {
        return outNum;
    }

    public void setOutNum(Integer outNum) {
        this.outNum = outNum;
    }

    public Date getMktDateStart() {
        return mktDateStart;
    }

    public void setMktDateStart(Date mktDateStart) {
        this.mktDateStart = mktDateStart;
    }

    public Date getMktDateEnd() {
        return mktDateEnd;
    }

    public void setMktDateEnd(Date mktDateEnd) {
        this.mktDateEnd = mktDateEnd;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getAcctType() {
        return acctType;
    }

    public void setAcctType(String acctType) {
        this.acctType = acctType == null ? null : acctType.trim();
    }

    public String getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(String acctNo) {
        this.acctNo = acctNo == null ? null : acctNo.trim();
    }

    public Date getCreTime() {
        return creTime;
    }

    public void setCreTime(Date creTime) {
        this.creTime = creTime;
    }

    public Integer getMinInvlLimit() {
        return minInvlLimit;
    }

    public void setMinInvlLimit(Integer minInvlLimit) {
        this.minInvlLimit = minInvlLimit;
    }

    public Integer getJoinNumLimit() {
        return joinNumLimit;
    }

    public void setJoinNumLimit(Integer joinNumLimit) {
        this.joinNumLimit = joinNumLimit;
    }

    public BigDecimal getAmtLimit() {
        return amtLimit;
    }

    public void setAmtLimit(BigDecimal amtLimit) {
        this.amtLimit = amtLimit;
    }

    public Date getLstTime() {
        return lstTime;
    }

    public void setLstTime(Date lstTime) {
        this.lstTime = lstTime;
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
        AcctMkt other = (AcctMkt) that;
        return (this.getTranSeq() == null ? other.getTranSeq() == null : this.getTranSeq().equals(other.getTranSeq()))
            && (this.getMktNo() == null ? other.getMktNo() == null : this.getMktNo().equals(other.getMktNo()))
            && (this.getMktName() == null ? other.getMktName() == null : this.getMktName().equals(other.getMktName()))
            && (this.getMktSubAcctName() == null ? other.getMktSubAcctName() == null : this.getMktSubAcctName().equals(other.getMktSubAcctName()))
            && (this.getFfbDueTime() == null ? other.getFfbDueTime() == null : this.getFfbDueTime().equals(other.getFfbDueTime()))
            && (this.getMktAmt() == null ? other.getMktAmt() == null : this.getMktAmt().equals(other.getMktAmt()))
            && (this.getOutAmt() == null ? other.getOutAmt() == null : this.getOutAmt().equals(other.getOutAmt()))
            && (this.getOutNum() == null ? other.getOutNum() == null : this.getOutNum().equals(other.getOutNum()))
            && (this.getMktDateStart() == null ? other.getMktDateStart() == null : this.getMktDateStart().equals(other.getMktDateStart()))
            && (this.getMktDateEnd() == null ? other.getMktDateEnd() == null : this.getMktDateEnd().equals(other.getMktDateEnd()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getAcctType() == null ? other.getAcctType() == null : this.getAcctType().equals(other.getAcctType()))
            && (this.getAcctNo() == null ? other.getAcctNo() == null : this.getAcctNo().equals(other.getAcctNo()))
            && (this.getCreTime() == null ? other.getCreTime() == null : this.getCreTime().equals(other.getCreTime()))
            && (this.getMinInvlLimit() == null ? other.getMinInvlLimit() == null : this.getMinInvlLimit().equals(other.getMinInvlLimit()))
            && (this.getJoinNumLimit() == null ? other.getJoinNumLimit() == null : this.getJoinNumLimit().equals(other.getJoinNumLimit()))
            && (this.getAmtLimit() == null ? other.getAmtLimit() == null : this.getAmtLimit().equals(other.getAmtLimit()))
            && (this.getLstTime() == null ? other.getLstTime() == null : this.getLstTime().equals(other.getLstTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTranSeq() == null) ? 0 : getTranSeq().hashCode());
        result = prime * result + ((getMktNo() == null) ? 0 : getMktNo().hashCode());
        result = prime * result + ((getMktName() == null) ? 0 : getMktName().hashCode());
        result = prime * result + ((getMktSubAcctName() == null) ? 0 : getMktSubAcctName().hashCode());
        result = prime * result + ((getFfbDueTime() == null) ? 0 : getFfbDueTime().hashCode());
        result = prime * result + ((getMktAmt() == null) ? 0 : getMktAmt().hashCode());
        result = prime * result + ((getOutAmt() == null) ? 0 : getOutAmt().hashCode());
        result = prime * result + ((getOutNum() == null) ? 0 : getOutNum().hashCode());
        result = prime * result + ((getMktDateStart() == null) ? 0 : getMktDateStart().hashCode());
        result = prime * result + ((getMktDateEnd() == null) ? 0 : getMktDateEnd().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getAcctType() == null) ? 0 : getAcctType().hashCode());
        result = prime * result + ((getAcctNo() == null) ? 0 : getAcctNo().hashCode());
        result = prime * result + ((getCreTime() == null) ? 0 : getCreTime().hashCode());
        result = prime * result + ((getMinInvlLimit() == null) ? 0 : getMinInvlLimit().hashCode());
        result = prime * result + ((getJoinNumLimit() == null) ? 0 : getJoinNumLimit().hashCode());
        result = prime * result + ((getAmtLimit() == null) ? 0 : getAmtLimit().hashCode());
        result = prime * result + ((getLstTime() == null) ? 0 : getLstTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tranSeq=").append(tranSeq);
        sb.append(", mktNo=").append(mktNo);
        sb.append(", mktName=").append(mktName);
        sb.append(", mktSubAcctName=").append(mktSubAcctName);
        sb.append(", ffbDueTime=").append(ffbDueTime);
        sb.append(", mktAmt=").append(mktAmt);
        sb.append(", outAmt=").append(outAmt);
        sb.append(", outNum=").append(outNum);
        sb.append(", mktDateStart=").append(mktDateStart);
        sb.append(", mktDateEnd=").append(mktDateEnd);
        sb.append(", status=").append(status);
        sb.append(", acctType=").append(acctType);
        sb.append(", acctNo=").append(acctNo);
        sb.append(", creTime=").append(creTime);
        sb.append(", minInvlLimit=").append(minInvlLimit);
        sb.append(", joinNumLimit=").append(joinNumLimit);
        sb.append(", amtLimit=").append(amtLimit);
        sb.append(", lstTime=").append(lstTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}