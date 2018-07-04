package com.wd.apiaccount.model.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class AcctMktSlot extends AcctMktSlotKey implements Serializable {
    private BigDecimal slotBal;

    private BigDecimal slotFrzBal;

    private Integer tranNum;

    private BigDecimal slotAmt;

    private Date lstTime;

    private static final long serialVersionUID = 1L;

    public BigDecimal getSlotBal() {
        return slotBal;
    }

    public void setSlotBal(BigDecimal slotBal) {
        this.slotBal = slotBal;
    }

    public BigDecimal getSlotFrzBal() {
        return slotFrzBal;
    }

    public void setSlotFrzBal(BigDecimal slotFrzBal) {
        this.slotFrzBal = slotFrzBal;
    }

    public Integer getTranNum() {
        return tranNum;
    }

    public void setTranNum(Integer tranNum) {
        this.tranNum = tranNum;
    }

    public BigDecimal getSlotAmt() {
        return slotAmt;
    }

    public void setSlotAmt(BigDecimal slotAmt) {
        this.slotAmt = slotAmt;
    }

    public Date getLstTime() {
        return lstTime;
    }

    public void setLstTime(Date lstTime) {
        this.lstTime = lstTime;
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
        AcctMktSlot other = (AcctMktSlot) that;
        return (this.getTranSeq() == null ? other.getTranSeq() == null : this.getTranSeq().equals(other.getTranSeq()))
            && (this.getSlotSeq() == null ? other.getSlotSeq() == null : this.getSlotSeq().equals(other.getSlotSeq()))
            && (this.getSlotBal() == null ? other.getSlotBal() == null : this.getSlotBal().equals(other.getSlotBal()))
            && (this.getSlotFrzBal() == null ? other.getSlotFrzBal() == null : this.getSlotFrzBal().equals(other.getSlotFrzBal()))
            && (this.getTranNum() == null ? other.getTranNum() == null : this.getTranNum().equals(other.getTranNum()))
            && (this.getSlotAmt() == null ? other.getSlotAmt() == null : this.getSlotAmt().equals(other.getSlotAmt()))
            && (this.getLstTime() == null ? other.getLstTime() == null : this.getLstTime().equals(other.getLstTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTranSeq() == null) ? 0 : getTranSeq().hashCode());
        result = prime * result + ((getSlotSeq() == null) ? 0 : getSlotSeq().hashCode());
        result = prime * result + ((getSlotBal() == null) ? 0 : getSlotBal().hashCode());
        result = prime * result + ((getSlotFrzBal() == null) ? 0 : getSlotFrzBal().hashCode());
        result = prime * result + ((getTranNum() == null) ? 0 : getTranNum().hashCode());
        result = prime * result + ((getSlotAmt() == null) ? 0 : getSlotAmt().hashCode());
        result = prime * result + ((getLstTime() == null) ? 0 : getLstTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", slotBal=").append(slotBal);
        sb.append(", slotFrzBal=").append(slotFrzBal);
        sb.append(", tranNum=").append(tranNum);
        sb.append(", slotAmt=").append(slotAmt);
        sb.append(", lstTime=").append(lstTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}