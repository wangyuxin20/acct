package com.wd.apiaccount.model.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class AcctDayendRec implements Serializable {
    private Long id;

    private Long dayendId;

    private String acctExp;

    private String acctNo;

    private BigDecimal recAmt;

    private Date insertTime;

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

    public String getAcctExp() {
        return acctExp;
    }

    public void setAcctExp(String acctExp) {
        this.acctExp = acctExp == null ? null : acctExp.trim();
    }

    public String getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(String acctNo) {
        this.acctNo = acctNo == null ? null : acctNo.trim();
    }

    public BigDecimal getRecAmt() {
        return recAmt;
    }

    public void setRecAmt(BigDecimal recAmt) {
        this.recAmt = recAmt;
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
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
        AcctDayendRec other = (AcctDayendRec) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDayendId() == null ? other.getDayendId() == null : this.getDayendId().equals(other.getDayendId()))
            && (this.getAcctExp() == null ? other.getAcctExp() == null : this.getAcctExp().equals(other.getAcctExp()))
            && (this.getAcctNo() == null ? other.getAcctNo() == null : this.getAcctNo().equals(other.getAcctNo()))
            && (this.getRecAmt() == null ? other.getRecAmt() == null : this.getRecAmt().equals(other.getRecAmt()))
            && (this.getInsertTime() == null ? other.getInsertTime() == null : this.getInsertTime().equals(other.getInsertTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDayendId() == null) ? 0 : getDayendId().hashCode());
        result = prime * result + ((getAcctExp() == null) ? 0 : getAcctExp().hashCode());
        result = prime * result + ((getAcctNo() == null) ? 0 : getAcctNo().hashCode());
        result = prime * result + ((getRecAmt() == null) ? 0 : getRecAmt().hashCode());
        result = prime * result + ((getInsertTime() == null) ? 0 : getInsertTime().hashCode());
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
        sb.append(", acctExp=").append(acctExp);
        sb.append(", acctNo=").append(acctNo);
        sb.append(", recAmt=").append(recAmt);
        sb.append(", insertTime=").append(insertTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}