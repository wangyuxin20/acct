package com.wa.apiaccount.core.model.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class AcctDayendDtl implements Serializable {
    private Long id;

    private Long dayendId;

    private Long billId;

    private String merNo;

    private String exCode;

    private BigDecimal feeValue;

    private String feeType;

    private Date insertTime;

    private Integer state;

    private String note;

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

    public Long getBillId() {
        return billId;
    }

    public void setBillId(Long billId) {
        this.billId = billId;
    }

    public String getMerNo() {
        return merNo;
    }

    public void setMerNo(String merNo) {
        this.merNo = merNo == null ? null : merNo.trim();
    }

    public String getExCode() {
        return exCode;
    }

    public void setExCode(String exCode) {
        this.exCode = exCode == null ? null : exCode.trim();
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

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
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
        AcctDayendDtl other = (AcctDayendDtl) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDayendId() == null ? other.getDayendId() == null : this.getDayendId().equals(other.getDayendId()))
            && (this.getBillId() == null ? other.getBillId() == null : this.getBillId().equals(other.getBillId()))
            && (this.getMerNo() == null ? other.getMerNo() == null : this.getMerNo().equals(other.getMerNo()))
            && (this.getExCode() == null ? other.getExCode() == null : this.getExCode().equals(other.getExCode()))
            && (this.getFeeValue() == null ? other.getFeeValue() == null : this.getFeeValue().equals(other.getFeeValue()))
            && (this.getFeeType() == null ? other.getFeeType() == null : this.getFeeType().equals(other.getFeeType()))
            && (this.getInsertTime() == null ? other.getInsertTime() == null : this.getInsertTime().equals(other.getInsertTime()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getNote() == null ? other.getNote() == null : this.getNote().equals(other.getNote()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDayendId() == null) ? 0 : getDayendId().hashCode());
        result = prime * result + ((getBillId() == null) ? 0 : getBillId().hashCode());
        result = prime * result + ((getMerNo() == null) ? 0 : getMerNo().hashCode());
        result = prime * result + ((getExCode() == null) ? 0 : getExCode().hashCode());
        result = prime * result + ((getFeeValue() == null) ? 0 : getFeeValue().hashCode());
        result = prime * result + ((getFeeType() == null) ? 0 : getFeeType().hashCode());
        result = prime * result + ((getInsertTime() == null) ? 0 : getInsertTime().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getNote() == null) ? 0 : getNote().hashCode());
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
        sb.append(", billId=").append(billId);
        sb.append(", merNo=").append(merNo);
        sb.append(", exCode=").append(exCode);
        sb.append(", feeValue=").append(feeValue);
        sb.append(", feeType=").append(feeType);
        sb.append(", insertTime=").append(insertTime);
        sb.append(", state=").append(state);
        sb.append(", note=").append(note);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}