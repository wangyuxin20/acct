package com.wa.apiaccount.core.model.domain;

import java.io.Serializable;
import java.util.Date;

public class AcctExcode implements Serializable {
    private String exCode;

    private String exName;

    private String exSimple;

    private String exType;

    private String exStatus;

    private String currNo;

    private Integer currCode;

    private String merId;

    private String merName;

    private Date createTime;

    private static final long serialVersionUID = 1L;

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

    public String getExSimple() {
        return exSimple;
    }

    public void setExSimple(String exSimple) {
        this.exSimple = exSimple == null ? null : exSimple.trim();
    }

    public String getExType() {
        return exType;
    }

    public void setExType(String exType) {
        this.exType = exType == null ? null : exType.trim();
    }

    public String getExStatus() {
        return exStatus;
    }

    public void setExStatus(String exStatus) {
        this.exStatus = exStatus == null ? null : exStatus.trim();
    }

    public String getCurrNo() {
        return currNo;
    }

    public void setCurrNo(String currNo) {
        this.currNo = currNo == null ? null : currNo.trim();
    }

    public Integer getCurrCode() {
        return currCode;
    }

    public void setCurrCode(Integer currCode) {
        this.currCode = currCode;
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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
        AcctExcode other = (AcctExcode) that;
        return (this.getExCode() == null ? other.getExCode() == null : this.getExCode().equals(other.getExCode()))
            && (this.getExName() == null ? other.getExName() == null : this.getExName().equals(other.getExName()))
            && (this.getExSimple() == null ? other.getExSimple() == null : this.getExSimple().equals(other.getExSimple()))
            && (this.getExType() == null ? other.getExType() == null : this.getExType().equals(other.getExType()))
            && (this.getExStatus() == null ? other.getExStatus() == null : this.getExStatus().equals(other.getExStatus()))
            && (this.getCurrNo() == null ? other.getCurrNo() == null : this.getCurrNo().equals(other.getCurrNo()))
            && (this.getCurrCode() == null ? other.getCurrCode() == null : this.getCurrCode().equals(other.getCurrCode()))
            && (this.getMerId() == null ? other.getMerId() == null : this.getMerId().equals(other.getMerId()))
            && (this.getMerName() == null ? other.getMerName() == null : this.getMerName().equals(other.getMerName()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getExCode() == null) ? 0 : getExCode().hashCode());
        result = prime * result + ((getExName() == null) ? 0 : getExName().hashCode());
        result = prime * result + ((getExSimple() == null) ? 0 : getExSimple().hashCode());
        result = prime * result + ((getExType() == null) ? 0 : getExType().hashCode());
        result = prime * result + ((getExStatus() == null) ? 0 : getExStatus().hashCode());
        result = prime * result + ((getCurrNo() == null) ? 0 : getCurrNo().hashCode());
        result = prime * result + ((getCurrCode() == null) ? 0 : getCurrCode().hashCode());
        result = prime * result + ((getMerId() == null) ? 0 : getMerId().hashCode());
        result = prime * result + ((getMerName() == null) ? 0 : getMerName().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", exCode=").append(exCode);
        sb.append(", exName=").append(exName);
        sb.append(", exSimple=").append(exSimple);
        sb.append(", exType=").append(exType);
        sb.append(", exStatus=").append(exStatus);
        sb.append(", currNo=").append(currNo);
        sb.append(", currCode=").append(currCode);
        sb.append(", merId=").append(merId);
        sb.append(", merName=").append(merName);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}