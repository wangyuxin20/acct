package com.wa.apiaccount.core.model.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class AcctDayendAcc implements Serializable {
    private Integer id;

    private Long dayendId;

    private String userType;

    private String acctTypeNo;

    private String acctTypeName;

    private String currNo;

    private String currName;

    private String accStatus;

    private String exp;

    private Integer totalCount;

    private BigDecimal sumBal;

    private BigDecimal sumFrzBal;

    private BigDecimal sumRecBal;

    private Integer sumNum;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getDayendId() {
        return dayendId;
    }

    public void setDayendId(Long dayendId) {
        this.dayendId = dayendId;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    public String getAcctTypeNo() {
        return acctTypeNo;
    }

    public void setAcctTypeNo(String acctTypeNo) {
        this.acctTypeNo = acctTypeNo == null ? null : acctTypeNo.trim();
    }

    public String getAcctTypeName() {
        return acctTypeName;
    }

    public void setAcctTypeName(String acctTypeName) {
        this.acctTypeName = acctTypeName == null ? null : acctTypeName.trim();
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

    public String getAccStatus() {
        return accStatus;
    }

    public void setAccStatus(String accStatus) {
        this.accStatus = accStatus == null ? null : accStatus.trim();
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp == null ? null : exp.trim();
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public BigDecimal getSumBal() {
        return sumBal;
    }

    public void setSumBal(BigDecimal sumBal) {
        this.sumBal = sumBal;
    }

    public BigDecimal getSumFrzBal() {
        return sumFrzBal;
    }

    public void setSumFrzBal(BigDecimal sumFrzBal) {
        this.sumFrzBal = sumFrzBal;
    }

    public BigDecimal getSumRecBal() {
        return sumRecBal;
    }

    public void setSumRecBal(BigDecimal sumRecBal) {
        this.sumRecBal = sumRecBal;
    }

    public Integer getSumNum() {
        return sumNum;
    }

    public void setSumNum(Integer sumNum) {
        this.sumNum = sumNum;
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
        AcctDayendAcc other = (AcctDayendAcc) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDayendId() == null ? other.getDayendId() == null : this.getDayendId().equals(other.getDayendId()))
            && (this.getUserType() == null ? other.getUserType() == null : this.getUserType().equals(other.getUserType()))
            && (this.getAcctTypeNo() == null ? other.getAcctTypeNo() == null : this.getAcctTypeNo().equals(other.getAcctTypeNo()))
            && (this.getAcctTypeName() == null ? other.getAcctTypeName() == null : this.getAcctTypeName().equals(other.getAcctTypeName()))
            && (this.getCurrNo() == null ? other.getCurrNo() == null : this.getCurrNo().equals(other.getCurrNo()))
            && (this.getCurrName() == null ? other.getCurrName() == null : this.getCurrName().equals(other.getCurrName()))
            && (this.getAccStatus() == null ? other.getAccStatus() == null : this.getAccStatus().equals(other.getAccStatus()))
            && (this.getExp() == null ? other.getExp() == null : this.getExp().equals(other.getExp()))
            && (this.getTotalCount() == null ? other.getTotalCount() == null : this.getTotalCount().equals(other.getTotalCount()))
            && (this.getSumBal() == null ? other.getSumBal() == null : this.getSumBal().equals(other.getSumBal()))
            && (this.getSumFrzBal() == null ? other.getSumFrzBal() == null : this.getSumFrzBal().equals(other.getSumFrzBal()))
            && (this.getSumRecBal() == null ? other.getSumRecBal() == null : this.getSumRecBal().equals(other.getSumRecBal()))
            && (this.getSumNum() == null ? other.getSumNum() == null : this.getSumNum().equals(other.getSumNum()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDayendId() == null) ? 0 : getDayendId().hashCode());
        result = prime * result + ((getUserType() == null) ? 0 : getUserType().hashCode());
        result = prime * result + ((getAcctTypeNo() == null) ? 0 : getAcctTypeNo().hashCode());
        result = prime * result + ((getAcctTypeName() == null) ? 0 : getAcctTypeName().hashCode());
        result = prime * result + ((getCurrNo() == null) ? 0 : getCurrNo().hashCode());
        result = prime * result + ((getCurrName() == null) ? 0 : getCurrName().hashCode());
        result = prime * result + ((getAccStatus() == null) ? 0 : getAccStatus().hashCode());
        result = prime * result + ((getExp() == null) ? 0 : getExp().hashCode());
        result = prime * result + ((getTotalCount() == null) ? 0 : getTotalCount().hashCode());
        result = prime * result + ((getSumBal() == null) ? 0 : getSumBal().hashCode());
        result = prime * result + ((getSumFrzBal() == null) ? 0 : getSumFrzBal().hashCode());
        result = prime * result + ((getSumRecBal() == null) ? 0 : getSumRecBal().hashCode());
        result = prime * result + ((getSumNum() == null) ? 0 : getSumNum().hashCode());
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
        sb.append(", userType=").append(userType);
        sb.append(", acctTypeNo=").append(acctTypeNo);
        sb.append(", acctTypeName=").append(acctTypeName);
        sb.append(", currNo=").append(currNo);
        sb.append(", currName=").append(currName);
        sb.append(", accStatus=").append(accStatus);
        sb.append(", exp=").append(exp);
        sb.append(", totalCount=").append(totalCount);
        sb.append(", sumBal=").append(sumBal);
        sb.append(", sumFrzBal=").append(sumFrzBal);
        sb.append(", sumRecBal=").append(sumRecBal);
        sb.append(", sumNum=").append(sumNum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}