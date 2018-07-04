package com.wd.apiaccount.model.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class AcctSettle implements Serializable {
    private Long settleFlowId;

    private String tranCode;

    private String exType;

    private String currNo;

    private String rpType;

    private String merId;

    private String merOfs;

    private BigDecimal amt;

    private BigDecimal feeAmt;

    private BigDecimal settleAmt;

    private BigDecimal goodsNum;

    private String acctDate;

    private String settleStartDate;

    private String settleEndDate;

    private String auditer;

    private Integer state;

    private String settleBillIds;

    private String drSettleId;

    private String payChnl;

    private Date lastTime;

    private static final long serialVersionUID = 1L;

    public Long getSettleFlowId() {
        return settleFlowId;
    }

    public void setSettleFlowId(Long settleFlowId) {
        this.settleFlowId = settleFlowId;
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

    public String getCurrNo() {
        return currNo;
    }

    public void setCurrNo(String currNo) {
        this.currNo = currNo == null ? null : currNo.trim();
    }

    public String getRpType() {
        return rpType;
    }

    public void setRpType(String rpType) {
        this.rpType = rpType == null ? null : rpType.trim();
    }

    public String getMerId() {
        return merId;
    }

    public void setMerId(String merId) {
        this.merId = merId == null ? null : merId.trim();
    }

    public String getMerOfs() {
        return merOfs;
    }

    public void setMerOfs(String merOfs) {
        this.merOfs = merOfs == null ? null : merOfs.trim();
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

    public BigDecimal getSettleAmt() {
        return settleAmt;
    }

    public void setSettleAmt(BigDecimal settleAmt) {
        this.settleAmt = settleAmt;
    }

    public BigDecimal getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(BigDecimal goodsNum) {
        this.goodsNum = goodsNum;
    }

    public String getAcctDate() {
        return acctDate;
    }

    public void setAcctDate(String acctDate) {
        this.acctDate = acctDate == null ? null : acctDate.trim();
    }

    public String getSettleStartDate() {
        return settleStartDate;
    }

    public void setSettleStartDate(String settleStartDate) {
        this.settleStartDate = settleStartDate == null ? null : settleStartDate.trim();
    }

    public String getSettleEndDate() {
        return settleEndDate;
    }

    public void setSettleEndDate(String settleEndDate) {
        this.settleEndDate = settleEndDate == null ? null : settleEndDate.trim();
    }

    public String getAuditer() {
        return auditer;
    }

    public void setAuditer(String auditer) {
        this.auditer = auditer == null ? null : auditer.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getSettleBillIds() {
        return settleBillIds;
    }

    public void setSettleBillIds(String settleBillIds) {
        this.settleBillIds = settleBillIds == null ? null : settleBillIds.trim();
    }

    public String getDrSettleId() {
        return drSettleId;
    }

    public void setDrSettleId(String drSettleId) {
        this.drSettleId = drSettleId == null ? null : drSettleId.trim();
    }

    public String getPayChnl() {
        return payChnl;
    }

    public void setPayChnl(String payChnl) {
        this.payChnl = payChnl == null ? null : payChnl.trim();
    }

    public Date getLastTime() {
        return lastTime;
    }

    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
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
        AcctSettle other = (AcctSettle) that;
        return (this.getSettleFlowId() == null ? other.getSettleFlowId() == null : this.getSettleFlowId().equals(other.getSettleFlowId()))
            && (this.getTranCode() == null ? other.getTranCode() == null : this.getTranCode().equals(other.getTranCode()))
            && (this.getExType() == null ? other.getExType() == null : this.getExType().equals(other.getExType()))
            && (this.getCurrNo() == null ? other.getCurrNo() == null : this.getCurrNo().equals(other.getCurrNo()))
            && (this.getRpType() == null ? other.getRpType() == null : this.getRpType().equals(other.getRpType()))
            && (this.getMerId() == null ? other.getMerId() == null : this.getMerId().equals(other.getMerId()))
            && (this.getMerOfs() == null ? other.getMerOfs() == null : this.getMerOfs().equals(other.getMerOfs()))
            && (this.getAmt() == null ? other.getAmt() == null : this.getAmt().equals(other.getAmt()))
            && (this.getFeeAmt() == null ? other.getFeeAmt() == null : this.getFeeAmt().equals(other.getFeeAmt()))
            && (this.getSettleAmt() == null ? other.getSettleAmt() == null : this.getSettleAmt().equals(other.getSettleAmt()))
            && (this.getGoodsNum() == null ? other.getGoodsNum() == null : this.getGoodsNum().equals(other.getGoodsNum()))
            && (this.getAcctDate() == null ? other.getAcctDate() == null : this.getAcctDate().equals(other.getAcctDate()))
            && (this.getSettleStartDate() == null ? other.getSettleStartDate() == null : this.getSettleStartDate().equals(other.getSettleStartDate()))
            && (this.getSettleEndDate() == null ? other.getSettleEndDate() == null : this.getSettleEndDate().equals(other.getSettleEndDate()))
            && (this.getAuditer() == null ? other.getAuditer() == null : this.getAuditer().equals(other.getAuditer()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getSettleBillIds() == null ? other.getSettleBillIds() == null : this.getSettleBillIds().equals(other.getSettleBillIds()))
            && (this.getDrSettleId() == null ? other.getDrSettleId() == null : this.getDrSettleId().equals(other.getDrSettleId()))
            && (this.getPayChnl() == null ? other.getPayChnl() == null : this.getPayChnl().equals(other.getPayChnl()))
            && (this.getLastTime() == null ? other.getLastTime() == null : this.getLastTime().equals(other.getLastTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSettleFlowId() == null) ? 0 : getSettleFlowId().hashCode());
        result = prime * result + ((getTranCode() == null) ? 0 : getTranCode().hashCode());
        result = prime * result + ((getExType() == null) ? 0 : getExType().hashCode());
        result = prime * result + ((getCurrNo() == null) ? 0 : getCurrNo().hashCode());
        result = prime * result + ((getRpType() == null) ? 0 : getRpType().hashCode());
        result = prime * result + ((getMerId() == null) ? 0 : getMerId().hashCode());
        result = prime * result + ((getMerOfs() == null) ? 0 : getMerOfs().hashCode());
        result = prime * result + ((getAmt() == null) ? 0 : getAmt().hashCode());
        result = prime * result + ((getFeeAmt() == null) ? 0 : getFeeAmt().hashCode());
        result = prime * result + ((getSettleAmt() == null) ? 0 : getSettleAmt().hashCode());
        result = prime * result + ((getGoodsNum() == null) ? 0 : getGoodsNum().hashCode());
        result = prime * result + ((getAcctDate() == null) ? 0 : getAcctDate().hashCode());
        result = prime * result + ((getSettleStartDate() == null) ? 0 : getSettleStartDate().hashCode());
        result = prime * result + ((getSettleEndDate() == null) ? 0 : getSettleEndDate().hashCode());
        result = prime * result + ((getAuditer() == null) ? 0 : getAuditer().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getSettleBillIds() == null) ? 0 : getSettleBillIds().hashCode());
        result = prime * result + ((getDrSettleId() == null) ? 0 : getDrSettleId().hashCode());
        result = prime * result + ((getPayChnl() == null) ? 0 : getPayChnl().hashCode());
        result = prime * result + ((getLastTime() == null) ? 0 : getLastTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", settleFlowId=").append(settleFlowId);
        sb.append(", tranCode=").append(tranCode);
        sb.append(", exType=").append(exType);
        sb.append(", currNo=").append(currNo);
        sb.append(", rpType=").append(rpType);
        sb.append(", merId=").append(merId);
        sb.append(", merOfs=").append(merOfs);
        sb.append(", amt=").append(amt);
        sb.append(", feeAmt=").append(feeAmt);
        sb.append(", settleAmt=").append(settleAmt);
        sb.append(", goodsNum=").append(goodsNum);
        sb.append(", acctDate=").append(acctDate);
        sb.append(", settleStartDate=").append(settleStartDate);
        sb.append(", settleEndDate=").append(settleEndDate);
        sb.append(", auditer=").append(auditer);
        sb.append(", state=").append(state);
        sb.append(", settleBillIds=").append(settleBillIds);
        sb.append(", drSettleId=").append(drSettleId);
        sb.append(", payChnl=").append(payChnl);
        sb.append(", lastTime=").append(lastTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}