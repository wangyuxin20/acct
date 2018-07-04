package com.wd.apiaccount.model.domain;

import java.io.Serializable;
import java.util.Date;

public class PayStatusUpdateLog implements Serializable {
    private Long id;

    private String payNo;

    private Integer oldPayStatus;

    private Integer newPayStatus;

    private Integer status;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPayNo() {
        return payNo;
    }

    public void setPayNo(String payNo) {
        this.payNo = payNo == null ? null : payNo.trim();
    }

    public Integer getOldPayStatus() {
        return oldPayStatus;
    }

    public void setOldPayStatus(Integer oldPayStatus) {
        this.oldPayStatus = oldPayStatus;
    }

    public Integer getNewPayStatus() {
        return newPayStatus;
    }

    public void setNewPayStatus(Integer newPayStatus) {
        this.newPayStatus = newPayStatus;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
        PayStatusUpdateLog other = (PayStatusUpdateLog) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPayNo() == null ? other.getPayNo() == null : this.getPayNo().equals(other.getPayNo()))
            && (this.getOldPayStatus() == null ? other.getOldPayStatus() == null : this.getOldPayStatus().equals(other.getOldPayStatus()))
            && (this.getNewPayStatus() == null ? other.getNewPayStatus() == null : this.getNewPayStatus().equals(other.getNewPayStatus()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPayNo() == null) ? 0 : getPayNo().hashCode());
        result = prime * result + ((getOldPayStatus() == null) ? 0 : getOldPayStatus().hashCode());
        result = prime * result + ((getNewPayStatus() == null) ? 0 : getNewPayStatus().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
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
        sb.append(", payNo=").append(payNo);
        sb.append(", oldPayStatus=").append(oldPayStatus);
        sb.append(", newPayStatus=").append(newPayStatus);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}