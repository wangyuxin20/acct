package com.wd.apiaccount.model.domain;

import java.io.Serializable;

public class AcctMktSlotKey implements Serializable {
    private Integer tranSeq;

    private Integer slotSeq;

    private static final long serialVersionUID = 1L;

    public Integer getTranSeq() {
        return tranSeq;
    }

    public void setTranSeq(Integer tranSeq) {
        this.tranSeq = tranSeq;
    }

    public Integer getSlotSeq() {
        return slotSeq;
    }

    public void setSlotSeq(Integer slotSeq) {
        this.slotSeq = slotSeq;
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
        AcctMktSlotKey other = (AcctMktSlotKey) that;
        return (this.getTranSeq() == null ? other.getTranSeq() == null : this.getTranSeq().equals(other.getTranSeq()))
            && (this.getSlotSeq() == null ? other.getSlotSeq() == null : this.getSlotSeq().equals(other.getSlotSeq()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTranSeq() == null) ? 0 : getTranSeq().hashCode());
        result = prime * result + ((getSlotSeq() == null) ? 0 : getSlotSeq().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tranSeq=").append(tranSeq);
        sb.append(", slotSeq=").append(slotSeq);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}