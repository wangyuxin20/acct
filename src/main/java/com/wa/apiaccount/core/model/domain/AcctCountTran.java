package com.wa.apiaccount.core.model.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class AcctCountTran implements Serializable {
    private Long id;

    private Long dayendId;

    private String countDate;

    private String tranCode;

    private Integer tranSeq;

    private Integer tranStatus;

    private String currNo;

    private String currName;

    private BigDecimal sumAmt;

    private String comment;

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

    public String getCountDate() {
        return countDate;
    }

    public void setCountDate(String countDate) {
        this.countDate = countDate == null ? null : countDate.trim();
    }

    public String getTranCode() {
        return tranCode;
    }

    public void setTranCode(String tranCode) {
        this.tranCode = tranCode == null ? null : tranCode.trim();
    }

    public Integer getTranSeq() {
        return tranSeq;
    }

    public void setTranSeq(Integer tranSeq) {
        this.tranSeq = tranSeq;
    }

    public Integer getTranStatus() {
        return tranStatus;
    }

    public void setTranStatus(Integer tranStatus) {
        this.tranStatus = tranStatus;
    }

    public String getCurrNo() {
        return currNo;
    }

    public void setCurrNo(String currNo) {
        this.currNo = currNo == null ? null : currNo.trim();
    }

    public String getCurrName() {
        return currName;
    }

    public void setCurrName(String currName) {
        this.currName = currName == null ? null : currName.trim();
    }

    public BigDecimal getSumAmt() {
        return sumAmt;
    }

    public void setSumAmt(BigDecimal sumAmt) {
        this.sumAmt = sumAmt;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
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
        AcctCountTran other = (AcctCountTran) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDayendId() == null ? other.getDayendId() == null : this.getDayendId().equals(other.getDayendId()))
            && (this.getCountDate() == null ? other.getCountDate() == null : this.getCountDate().equals(other.getCountDate()))
            && (this.getTranCode() == null ? other.getTranCode() == null : this.getTranCode().equals(other.getTranCode()))
            && (this.getTranSeq() == null ? other.getTranSeq() == null : this.getTranSeq().equals(other.getTranSeq()))
            && (this.getTranStatus() == null ? other.getTranStatus() == null : this.getTranStatus().equals(other.getTranStatus()))
            && (this.getCurrNo() == null ? other.getCurrNo() == null : this.getCurrNo().equals(other.getCurrNo()))
            && (this.getCurrName() == null ? other.getCurrName() == null : this.getCurrName().equals(other.getCurrName()))
            && (this.getSumAmt() == null ? other.getSumAmt() == null : this.getSumAmt().equals(other.getSumAmt()))
            && (this.getComment() == null ? other.getComment() == null : this.getComment().equals(other.getComment()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDayendId() == null) ? 0 : getDayendId().hashCode());
        result = prime * result + ((getCountDate() == null) ? 0 : getCountDate().hashCode());
        result = prime * result + ((getTranCode() == null) ? 0 : getTranCode().hashCode());
        result = prime * result + ((getTranSeq() == null) ? 0 : getTranSeq().hashCode());
        result = prime * result + ((getTranStatus() == null) ? 0 : getTranStatus().hashCode());
        result = prime * result + ((getCurrNo() == null) ? 0 : getCurrNo().hashCode());
        result = prime * result + ((getCurrName() == null) ? 0 : getCurrName().hashCode());
        result = prime * result + ((getSumAmt() == null) ? 0 : getSumAmt().hashCode());
        result = prime * result + ((getComment() == null) ? 0 : getComment().hashCode());
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
        sb.append(", countDate=").append(countDate);
        sb.append(", tranCode=").append(tranCode);
        sb.append(", tranSeq=").append(tranSeq);
        sb.append(", tranStatus=").append(tranStatus);
        sb.append(", currNo=").append(currNo);
        sb.append(", currName=").append(currName);
        sb.append(", sumAmt=").append(sumAmt);
        sb.append(", comment=").append(comment);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}