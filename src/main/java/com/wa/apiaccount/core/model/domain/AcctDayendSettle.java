package com.wa.apiaccount.core.model.domain;

import java.io.Serializable;

public class AcctDayendSettle implements Serializable {
    private Long id;

    private Long dayendId;

    private String acctDate;

    private Integer clusterId;

    private String exType;

    private String tranCode;

    private Integer tranNum;

    private Integer failNum;

    private Integer succNum;

    private Integer chargeNum;

    private Integer extChargeNum;

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

    public String getAcctDate() {
        return acctDate;
    }

    public void setAcctDate(String acctDate) {
        this.acctDate = acctDate == null ? null : acctDate.trim();
    }

    public Integer getClusterId() {
        return clusterId;
    }

    public void setClusterId(Integer clusterId) {
        this.clusterId = clusterId;
    }

    public String getExType() {
        return exType;
    }

    public void setExType(String exType) {
        this.exType = exType == null ? null : exType.trim();
    }

    public String getTranCode() {
        return tranCode;
    }

    public void setTranCode(String tranCode) {
        this.tranCode = tranCode == null ? null : tranCode.trim();
    }

    public Integer getTranNum() {
        return tranNum;
    }

    public void setTranNum(Integer tranNum) {
        this.tranNum = tranNum;
    }

    public Integer getFailNum() {
        return failNum;
    }

    public void setFailNum(Integer failNum) {
        this.failNum = failNum;
    }

    public Integer getSuccNum() {
        return succNum;
    }

    public void setSuccNum(Integer succNum) {
        this.succNum = succNum;
    }

    public Integer getChargeNum() {
        return chargeNum;
    }

    public void setChargeNum(Integer chargeNum) {
        this.chargeNum = chargeNum;
    }

    public Integer getExtChargeNum() {
        return extChargeNum;
    }

    public void setExtChargeNum(Integer extChargeNum) {
        this.extChargeNum = extChargeNum;
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
        AcctDayendSettle other = (AcctDayendSettle) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDayendId() == null ? other.getDayendId() == null : this.getDayendId().equals(other.getDayendId()))
            && (this.getAcctDate() == null ? other.getAcctDate() == null : this.getAcctDate().equals(other.getAcctDate()))
            && (this.getClusterId() == null ? other.getClusterId() == null : this.getClusterId().equals(other.getClusterId()))
            && (this.getExType() == null ? other.getExType() == null : this.getExType().equals(other.getExType()))
            && (this.getTranCode() == null ? other.getTranCode() == null : this.getTranCode().equals(other.getTranCode()))
            && (this.getTranNum() == null ? other.getTranNum() == null : this.getTranNum().equals(other.getTranNum()))
            && (this.getFailNum() == null ? other.getFailNum() == null : this.getFailNum().equals(other.getFailNum()))
            && (this.getSuccNum() == null ? other.getSuccNum() == null : this.getSuccNum().equals(other.getSuccNum()))
            && (this.getChargeNum() == null ? other.getChargeNum() == null : this.getChargeNum().equals(other.getChargeNum()))
            && (this.getExtChargeNum() == null ? other.getExtChargeNum() == null : this.getExtChargeNum().equals(other.getExtChargeNum()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDayendId() == null) ? 0 : getDayendId().hashCode());
        result = prime * result + ((getAcctDate() == null) ? 0 : getAcctDate().hashCode());
        result = prime * result + ((getClusterId() == null) ? 0 : getClusterId().hashCode());
        result = prime * result + ((getExType() == null) ? 0 : getExType().hashCode());
        result = prime * result + ((getTranCode() == null) ? 0 : getTranCode().hashCode());
        result = prime * result + ((getTranNum() == null) ? 0 : getTranNum().hashCode());
        result = prime * result + ((getFailNum() == null) ? 0 : getFailNum().hashCode());
        result = prime * result + ((getSuccNum() == null) ? 0 : getSuccNum().hashCode());
        result = prime * result + ((getChargeNum() == null) ? 0 : getChargeNum().hashCode());
        result = prime * result + ((getExtChargeNum() == null) ? 0 : getExtChargeNum().hashCode());
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
        sb.append(", acctDate=").append(acctDate);
        sb.append(", clusterId=").append(clusterId);
        sb.append(", exType=").append(exType);
        sb.append(", tranCode=").append(tranCode);
        sb.append(", tranNum=").append(tranNum);
        sb.append(", failNum=").append(failNum);
        sb.append(", succNum=").append(succNum);
        sb.append(", chargeNum=").append(chargeNum);
        sb.append(", extChargeNum=").append(extChargeNum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}