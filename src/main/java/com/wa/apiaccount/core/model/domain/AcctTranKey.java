package com.wa.apiaccount.core.model.domain;

import java.io.Serializable;

public class AcctTranKey implements Serializable {
    private String tranNo;

    private Integer tranSeq;

    private static final long serialVersionUID = 1L;

    public String getTranNo() {
        return tranNo;
    }

    public void setTranNo(String tranNo) {
        this.tranNo = tranNo == null ? null : tranNo.trim();
    }

    public Integer getTranSeq() {
        return tranSeq;
    }

    public void setTranSeq(Integer tranSeq) {
        this.tranSeq = tranSeq;
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
        AcctTranKey other = (AcctTranKey) that;
        return (this.getTranNo() == null ? other.getTranNo() == null : this.getTranNo().equals(other.getTranNo()))
            && (this.getTranSeq() == null ? other.getTranSeq() == null : this.getTranSeq().equals(other.getTranSeq()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTranNo() == null) ? 0 : getTranNo().hashCode());
        result = prime * result + ((getTranSeq() == null) ? 0 : getTranSeq().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tranNo=").append(tranNo);
        sb.append(", tranSeq=").append(tranSeq);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}