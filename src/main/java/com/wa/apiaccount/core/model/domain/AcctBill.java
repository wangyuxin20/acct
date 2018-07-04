package com.wa.apiaccount.core.model.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class AcctBill implements Serializable {
    private Long id;

    private Long dayendId;

    private String dayendCode;

    private String tranCode;

    private String rpType;

    private String merId;

    private String merName;

    private String exCode;

    private String exName;

    private String exType;

    private BigDecimal settleGoodsNum;

    private BigDecimal settleAmt;

    private String settleCurr;

    private Integer settleCount;

    private BigDecimal settleFeeAmt;

    private String settleDate;

    private String settleStatus;

    private Long settleId;

    private String drSettleId;

    private BigDecimal feeValue;

    private String feeType;

    private String creTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDayendId() {
        return dayendId;
    }

    public void setDayendId(Long dayendId) {
        this.dayendId = dayendId;
    }

    public String getDayendCode() {
        return dayendCode;
    }

    public void setDayendCode(String dayendCode) {
        this.dayendCode = dayendCode == null ? null : dayendCode.trim();
    }

    public String getTranCode() {
        return tranCode;
    }

    public void setTranCode(String tranCode) {
        this.tranCode = tranCode == null ? null : tranCode.trim();
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

    public String getExType() {
        return exType;
    }

    public void setExType(String exType) {
        this.exType = exType == null ? null : exType.trim();
    }

    public BigDecimal getSettleGoodsNum() {
        return settleGoodsNum;
    }

    public void setSettleGoodsNum(BigDecimal settleGoodsNum) {
        this.settleGoodsNum = settleGoodsNum;
    }

    public BigDecimal getSettleAmt() {
        return settleAmt;
    }

    public void setSettleAmt(BigDecimal settleAmt) {
        this.settleAmt = settleAmt;
    }

    public String getSettleCurr() {
        return settleCurr;
    }

    public void setSettleCurr(String settleCurr) {
        this.settleCurr = settleCurr == null ? null : settleCurr.trim();
    }

    public Integer getSettleCount() {
        return settleCount;
    }

    public void setSettleCount(Integer settleCount) {
        this.settleCount = settleCount;
    }

    public BigDecimal getSettleFeeAmt() {
        return settleFeeAmt;
    }

    public void setSettleFeeAmt(BigDecimal settleFeeAmt) {
        this.settleFeeAmt = settleFeeAmt;
    }

    public String getSettleDate() {
        return settleDate;
    }

    public void setSettleDate(String settleDate) {
        this.settleDate = settleDate == null ? null : settleDate.trim();
    }

    public String getSettleStatus() {
        return settleStatus;
    }

    public void setSettleStatus(String settleStatus) {
        this.settleStatus = settleStatus == null ? null : settleStatus.trim();
    }

    public Long getSettleId() {
        return settleId;
    }

    public void setSettleId(Long settleId) {
        this.settleId = settleId;
    }

    public String getDrSettleId() {
        return drSettleId;
    }

    public void setDrSettleId(String drSettleId) {
        this.drSettleId = drSettleId == null ? null : drSettleId.trim();
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

    public String getCreTime() {
        return creTime;
    }

    public void setCreTime(String creTime) {
        this.creTime = creTime == null ? null : creTime.trim();
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
        AcctBill other = (AcctBill) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDayendId() == null ? other.getDayendId() == null : this.getDayendId().equals(other.getDayendId()))
            && (this.getDayendCode() == null ? other.getDayendCode() == null : this.getDayendCode().equals(other.getDayendCode()))
            && (this.getTranCode() == null ? other.getTranCode() == null : this.getTranCode().equals(other.getTranCode()))
            && (this.getRpType() == null ? other.getRpType() == null : this.getRpType().equals(other.getRpType()))
            && (this.getMerId() == null ? other.getMerId() == null : this.getMerId().equals(other.getMerId()))
            && (this.getMerName() == null ? other.getMerName() == null : this.getMerName().equals(other.getMerName()))
            && (this.getExCode() == null ? other.getExCode() == null : this.getExCode().equals(other.getExCode()))
            && (this.getExName() == null ? other.getExName() == null : this.getExName().equals(other.getExName()))
            && (this.getExType() == null ? other.getExType() == null : this.getExType().equals(other.getExType()))
            && (this.getSettleGoodsNum() == null ? other.getSettleGoodsNum() == null : this.getSettleGoodsNum().equals(other.getSettleGoodsNum()))
            && (this.getSettleAmt() == null ? other.getSettleAmt() == null : this.getSettleAmt().equals(other.getSettleAmt()))
            && (this.getSettleCurr() == null ? other.getSettleCurr() == null : this.getSettleCurr().equals(other.getSettleCurr()))
            && (this.getSettleCount() == null ? other.getSettleCount() == null : this.getSettleCount().equals(other.getSettleCount()))
            && (this.getSettleFeeAmt() == null ? other.getSettleFeeAmt() == null : this.getSettleFeeAmt().equals(other.getSettleFeeAmt()))
            && (this.getSettleDate() == null ? other.getSettleDate() == null : this.getSettleDate().equals(other.getSettleDate()))
            && (this.getSettleStatus() == null ? other.getSettleStatus() == null : this.getSettleStatus().equals(other.getSettleStatus()))
            && (this.getSettleId() == null ? other.getSettleId() == null : this.getSettleId().equals(other.getSettleId()))
            && (this.getDrSettleId() == null ? other.getDrSettleId() == null : this.getDrSettleId().equals(other.getDrSettleId()))
            && (this.getFeeValue() == null ? other.getFeeValue() == null : this.getFeeValue().equals(other.getFeeValue()))
            && (this.getFeeType() == null ? other.getFeeType() == null : this.getFeeType().equals(other.getFeeType()))
            && (this.getCreTime() == null ? other.getCreTime() == null : this.getCreTime().equals(other.getCreTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDayendId() == null) ? 0 : getDayendId().hashCode());
        result = prime * result + ((getDayendCode() == null) ? 0 : getDayendCode().hashCode());
        result = prime * result + ((getTranCode() == null) ? 0 : getTranCode().hashCode());
        result = prime * result + ((getRpType() == null) ? 0 : getRpType().hashCode());
        result = prime * result + ((getMerId() == null) ? 0 : getMerId().hashCode());
        result = prime * result + ((getMerName() == null) ? 0 : getMerName().hashCode());
        result = prime * result + ((getExCode() == null) ? 0 : getExCode().hashCode());
        result = prime * result + ((getExName() == null) ? 0 : getExName().hashCode());
        result = prime * result + ((getExType() == null) ? 0 : getExType().hashCode());
        result = prime * result + ((getSettleGoodsNum() == null) ? 0 : getSettleGoodsNum().hashCode());
        result = prime * result + ((getSettleAmt() == null) ? 0 : getSettleAmt().hashCode());
        result = prime * result + ((getSettleCurr() == null) ? 0 : getSettleCurr().hashCode());
        result = prime * result + ((getSettleCount() == null) ? 0 : getSettleCount().hashCode());
        result = prime * result + ((getSettleFeeAmt() == null) ? 0 : getSettleFeeAmt().hashCode());
        result = prime * result + ((getSettleDate() == null) ? 0 : getSettleDate().hashCode());
        result = prime * result + ((getSettleStatus() == null) ? 0 : getSettleStatus().hashCode());
        result = prime * result + ((getSettleId() == null) ? 0 : getSettleId().hashCode());
        result = prime * result + ((getDrSettleId() == null) ? 0 : getDrSettleId().hashCode());
        result = prime * result + ((getFeeValue() == null) ? 0 : getFeeValue().hashCode());
        result = prime * result + ((getFeeType() == null) ? 0 : getFeeType().hashCode());
        result = prime * result + ((getCreTime() == null) ? 0 : getCreTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", dayendId=").append(dayendId);
        sb.append(", dayendCode=").append(dayendCode);
        sb.append(", tranCode=").append(tranCode);
        sb.append(", rpType=").append(rpType);
        sb.append(", merId=").append(merId);
        sb.append(", merName=").append(merName);
        sb.append(", exCode=").append(exCode);
        sb.append(", exName=").append(exName);
        sb.append(", exType=").append(exType);
        sb.append(", settleGoodsNum=").append(settleGoodsNum);
        sb.append(", settleAmt=").append(settleAmt);
        sb.append(", settleCurr=").append(settleCurr);
        sb.append(", settleCount=").append(settleCount);
        sb.append(", settleFeeAmt=").append(settleFeeAmt);
        sb.append(", settleDate=").append(settleDate);
        sb.append(", settleStatus=").append(settleStatus);
        sb.append(", settleId=").append(settleId);
        sb.append(", drSettleId=").append(drSettleId);
        sb.append(", feeValue=").append(feeValue);
        sb.append(", feeType=").append(feeType);
        sb.append(", creTime=").append(creTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}