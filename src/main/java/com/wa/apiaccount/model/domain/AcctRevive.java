package com.wd.apiaccount.model.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class AcctRevive implements Serializable {
    private Integer id;

    private String acctNo;

    private String acctAlias;

    private String userNo;

    private String userType;

    private String currNo;

    private String acctTypeNo;

    private BigDecimal bal;

    private BigDecimal incBal;

    private BigDecimal frzBal;

    private BigDecimal extBal;

    private String status;

    private String exp;

    private String dac;

    private Date createTime;

    private Date rvTime;

    private String rvStatus;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(String acctNo) {
        this.acctNo = acctNo == null ? null : acctNo.trim();
    }

    public String getAcctAlias() {
        return acctAlias;
    }

    public void setAcctAlias(String acctAlias) {
        this.acctAlias = acctAlias == null ? null : acctAlias.trim();
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo == null ? null : userNo.trim();
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    public String getCurrNo() {
        return currNo;
    }

    public void setCurrNo(String currNo) {
        this.currNo = currNo == null ? null : currNo.trim();
    }

    public String getAcctTypeNo() {
        return acctTypeNo;
    }

    public void setAcctTypeNo(String acctTypeNo) {
        this.acctTypeNo = acctTypeNo == null ? null : acctTypeNo.trim();
    }

    public BigDecimal getBal() {
        return bal;
    }

    public void setBal(BigDecimal bal) {
        this.bal = bal;
    }

    public BigDecimal getIncBal() {
        return incBal;
    }

    public void setIncBal(BigDecimal incBal) {
        this.incBal = incBal;
    }

    public BigDecimal getFrzBal() {
        return frzBal;
    }

    public void setFrzBal(BigDecimal frzBal) {
        this.frzBal = frzBal;
    }

    public BigDecimal getExtBal() {
        return extBal;
    }

    public void setExtBal(BigDecimal extBal) {
        this.extBal = extBal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp == null ? null : exp.trim();
    }

    public String getDac() {
        return dac;
    }

    public void setDac(String dac) {
        this.dac = dac == null ? null : dac.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getRvTime() {
        return rvTime;
    }

    public void setRvTime(Date rvTime) {
        this.rvTime = rvTime;
    }

    public String getRvStatus() {
        return rvStatus;
    }

    public void setRvStatus(String rvStatus) {
        this.rvStatus = rvStatus == null ? null : rvStatus.trim();
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
        AcctRevive other = (AcctRevive) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAcctNo() == null ? other.getAcctNo() == null : this.getAcctNo().equals(other.getAcctNo()))
            && (this.getAcctAlias() == null ? other.getAcctAlias() == null : this.getAcctAlias().equals(other.getAcctAlias()))
            && (this.getUserNo() == null ? other.getUserNo() == null : this.getUserNo().equals(other.getUserNo()))
            && (this.getUserType() == null ? other.getUserType() == null : this.getUserType().equals(other.getUserType()))
            && (this.getCurrNo() == null ? other.getCurrNo() == null : this.getCurrNo().equals(other.getCurrNo()))
            && (this.getAcctTypeNo() == null ? other.getAcctTypeNo() == null : this.getAcctTypeNo().equals(other.getAcctTypeNo()))
            && (this.getBal() == null ? other.getBal() == null : this.getBal().equals(other.getBal()))
            && (this.getIncBal() == null ? other.getIncBal() == null : this.getIncBal().equals(other.getIncBal()))
            && (this.getFrzBal() == null ? other.getFrzBal() == null : this.getFrzBal().equals(other.getFrzBal()))
            && (this.getExtBal() == null ? other.getExtBal() == null : this.getExtBal().equals(other.getExtBal()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getExp() == null ? other.getExp() == null : this.getExp().equals(other.getExp()))
            && (this.getDac() == null ? other.getDac() == null : this.getDac().equals(other.getDac()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getRvTime() == null ? other.getRvTime() == null : this.getRvTime().equals(other.getRvTime()))
            && (this.getRvStatus() == null ? other.getRvStatus() == null : this.getRvStatus().equals(other.getRvStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAcctNo() == null) ? 0 : getAcctNo().hashCode());
        result = prime * result + ((getAcctAlias() == null) ? 0 : getAcctAlias().hashCode());
        result = prime * result + ((getUserNo() == null) ? 0 : getUserNo().hashCode());
        result = prime * result + ((getUserType() == null) ? 0 : getUserType().hashCode());
        result = prime * result + ((getCurrNo() == null) ? 0 : getCurrNo().hashCode());
        result = prime * result + ((getAcctTypeNo() == null) ? 0 : getAcctTypeNo().hashCode());
        result = prime * result + ((getBal() == null) ? 0 : getBal().hashCode());
        result = prime * result + ((getIncBal() == null) ? 0 : getIncBal().hashCode());
        result = prime * result + ((getFrzBal() == null) ? 0 : getFrzBal().hashCode());
        result = prime * result + ((getExtBal() == null) ? 0 : getExtBal().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getExp() == null) ? 0 : getExp().hashCode());
        result = prime * result + ((getDac() == null) ? 0 : getDac().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getRvTime() == null) ? 0 : getRvTime().hashCode());
        result = prime * result + ((getRvStatus() == null) ? 0 : getRvStatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", acctNo=").append(acctNo);
        sb.append(", acctAlias=").append(acctAlias);
        sb.append(", userNo=").append(userNo);
        sb.append(", userType=").append(userType);
        sb.append(", currNo=").append(currNo);
        sb.append(", acctTypeNo=").append(acctTypeNo);
        sb.append(", bal=").append(bal);
        sb.append(", incBal=").append(incBal);
        sb.append(", frzBal=").append(frzBal);
        sb.append(", extBal=").append(extBal);
        sb.append(", status=").append(status);
        sb.append(", exp=").append(exp);
        sb.append(", dac=").append(dac);
        sb.append(", createTime=").append(createTime);
        sb.append(", rvTime=").append(rvTime);
        sb.append(", rvStatus=").append(rvStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}