package com.wa.apiaccount.core.model.domain;

import java.io.Serializable;

public class AcctFrzKey implements Serializable {
    private String frzNo;

    private String flowInrId;

    private static final long serialVersionUID = 1L;

    public String getFrzNo() {
        return frzNo;
    }

    public void setFrzNo(String frzNo) {
        this.frzNo = frzNo == null ? null : frzNo.trim();
    }

    public String getFlowInrId() {
        return flowInrId;
    }

    public void setFlowInrId(String flowInrId) {
        this.flowInrId = flowInrId == null ? null : flowInrId.trim();
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
        AcctFrzKey other = (AcctFrzKey) that;
        return (this.getFrzNo() == null ? other.getFrzNo() == null : this.getFrzNo().equals(other.getFrzNo()))
            && (this.getFlowInrId() == null ? other.getFlowInrId() == null : this.getFlowInrId().equals(other.getFlowInrId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFrzNo() == null) ? 0 : getFrzNo().hashCode());
        result = prime * result + ((getFlowInrId() == null) ? 0 : getFlowInrId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", frzNo=").append(frzNo);
        sb.append(", flowInrId=").append(flowInrId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}