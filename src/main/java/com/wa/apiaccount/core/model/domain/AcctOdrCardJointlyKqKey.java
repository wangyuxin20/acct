package com.wa.apiaccount.core.model.domain;

import java.io.Serializable;

public class AcctOdrCardJointlyKqKey implements Serializable {
    private Long jointlyId;

    private Integer jointlySeq;

    private static final long serialVersionUID = 1L;

    public Long getJointlyId() {
        return jointlyId;
    }

    public void setJointlyId(Long jointlyId) {
        this.jointlyId = jointlyId;
    }

    public Integer getJointlySeq() {
        return jointlySeq;
    }

    public void setJointlySeq(Integer jointlySeq) {
        this.jointlySeq = jointlySeq;
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
        AcctOdrCardJointlyKqKey other = (AcctOdrCardJointlyKqKey) that;
        return (this.getJointlyId() == null ? other.getJointlyId() == null : this.getJointlyId().equals(other.getJointlyId()))
            && (this.getJointlySeq() == null ? other.getJointlySeq() == null : this.getJointlySeq().equals(other.getJointlySeq()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getJointlyId() == null) ? 0 : getJointlyId().hashCode());
        result = prime * result + ((getJointlySeq() == null) ? 0 : getJointlySeq().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", jointlyId=").append(jointlyId);
        sb.append(", jointlySeq=").append(jointlySeq);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}