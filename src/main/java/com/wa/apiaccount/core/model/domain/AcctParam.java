package com.wa.apiaccount.core.model.domain;

import java.io.Serializable;
import java.util.Date;

public class AcctParam implements Serializable {
    private Integer id;

    private String prmType;

    private String prmCode;

    private Integer prmEnumId;

    private String prmCnName;

    private String prmValue;

    private String prmRemark;

    private String prmStatus;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPrmType() {
        return prmType;
    }

    public void setPrmType(String prmType) {
        this.prmType = prmType == null ? null : prmType.trim();
    }

    public String getPrmCode() {
        return prmCode;
    }

    public void setPrmCode(String prmCode) {
        this.prmCode = prmCode == null ? null : prmCode.trim();
    }

    public Integer getPrmEnumId() {
        return prmEnumId;
    }

    public void setPrmEnumId(Integer prmEnumId) {
        this.prmEnumId = prmEnumId;
    }

    public String getPrmCnName() {
        return prmCnName;
    }

    public void setPrmCnName(String prmCnName) {
        this.prmCnName = prmCnName == null ? null : prmCnName.trim();
    }

    public String getPrmValue() {
        return prmValue;
    }

    public void setPrmValue(String prmValue) {
        this.prmValue = prmValue == null ? null : prmValue.trim();
    }

    public String getPrmRemark() {
        return prmRemark;
    }

    public void setPrmRemark(String prmRemark) {
        this.prmRemark = prmRemark == null ? null : prmRemark.trim();
    }

    public String getPrmStatus() {
        return prmStatus;
    }

    public void setPrmStatus(String prmStatus) {
        this.prmStatus = prmStatus == null ? null : prmStatus.trim();
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
        AcctParam other = (AcctParam) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPrmType() == null ? other.getPrmType() == null : this.getPrmType().equals(other.getPrmType()))
            && (this.getPrmCode() == null ? other.getPrmCode() == null : this.getPrmCode().equals(other.getPrmCode()))
            && (this.getPrmEnumId() == null ? other.getPrmEnumId() == null : this.getPrmEnumId().equals(other.getPrmEnumId()))
            && (this.getPrmCnName() == null ? other.getPrmCnName() == null : this.getPrmCnName().equals(other.getPrmCnName()))
            && (this.getPrmValue() == null ? other.getPrmValue() == null : this.getPrmValue().equals(other.getPrmValue()))
            && (this.getPrmRemark() == null ? other.getPrmRemark() == null : this.getPrmRemark().equals(other.getPrmRemark()))
            && (this.getPrmStatus() == null ? other.getPrmStatus() == null : this.getPrmStatus().equals(other.getPrmStatus()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPrmType() == null) ? 0 : getPrmType().hashCode());
        result = prime * result + ((getPrmCode() == null) ? 0 : getPrmCode().hashCode());
        result = prime * result + ((getPrmEnumId() == null) ? 0 : getPrmEnumId().hashCode());
        result = prime * result + ((getPrmCnName() == null) ? 0 : getPrmCnName().hashCode());
        result = prime * result + ((getPrmValue() == null) ? 0 : getPrmValue().hashCode());
        result = prime * result + ((getPrmRemark() == null) ? 0 : getPrmRemark().hashCode());
        result = prime * result + ((getPrmStatus() == null) ? 0 : getPrmStatus().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", prmType=").append(prmType);
        sb.append(", prmCode=").append(prmCode);
        sb.append(", prmEnumId=").append(prmEnumId);
        sb.append(", prmCnName=").append(prmCnName);
        sb.append(", prmValue=").append(prmValue);
        sb.append(", prmRemark=").append(prmRemark);
        sb.append(", prmStatus=").append(prmStatus);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}