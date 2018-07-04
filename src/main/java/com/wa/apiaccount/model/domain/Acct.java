package com.wd.apiaccount.model.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Acct extends AcctKey implements Serializable {
    private String acctNo;

    private String acctAlias;

    private String userType;

    private BigDecimal bal;

    private BigDecimal incBal;

    private BigDecimal frzBal;

    private BigDecimal recBal;

    private String status;

    private String dac;

    private Integer node;

    private Integer num;

    private Date lastTime;

    private static final long serialVersionUID = 1L;

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

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
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

    public BigDecimal getRecBal() {
        return recBal;
    }

    public void setRecBal(BigDecimal recBal) {
        this.recBal = recBal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getDac() {
        return dac;
    }

    public void setDac(String dac) {
        this.dac = dac == null ? null : dac.trim();
    }

    public Integer getNode() {
        return node;
    }

    public void setNode(Integer node) {
        this.node = node;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Date getLastTime() {
        return lastTime;
    }

    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
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
        Acct other = (Acct) that;
        return (this.getUserNo() == null ? other.getUserNo() == null : this.getUserNo().equals(other.getUserNo()))
            && (this.getCurrNo() == null ? other.getCurrNo() == null : this.getCurrNo().equals(other.getCurrNo()))
            && (this.getAcctTypeNo() == null ? other.getAcctTypeNo() == null : this.getAcctTypeNo().equals(other.getAcctTypeNo()))
            && (this.getExp() == null ? other.getExp() == null : this.getExp().equals(other.getExp()))
            && (this.getAcctNo() == null ? other.getAcctNo() == null : this.getAcctNo().equals(other.getAcctNo()))
            && (this.getAcctAlias() == null ? other.getAcctAlias() == null : this.getAcctAlias().equals(other.getAcctAlias()))
            && (this.getUserType() == null ? other.getUserType() == null : this.getUserType().equals(other.getUserType()))
            && (this.getBal() == null ? other.getBal() == null : this.getBal().equals(other.getBal()))
            && (this.getIncBal() == null ? other.getIncBal() == null : this.getIncBal().equals(other.getIncBal()))
            && (this.getFrzBal() == null ? other.getFrzBal() == null : this.getFrzBal().equals(other.getFrzBal()))
            && (this.getRecBal() == null ? other.getRecBal() == null : this.getRecBal().equals(other.getRecBal()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getDac() == null ? other.getDac() == null : this.getDac().equals(other.getDac()))
            && (this.getNode() == null ? other.getNode() == null : this.getNode().equals(other.getNode()))
            && (this.getNum() == null ? other.getNum() == null : this.getNum().equals(other.getNum()))
            && (this.getLastTime() == null ? other.getLastTime() == null : this.getLastTime().equals(other.getLastTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserNo() == null) ? 0 : getUserNo().hashCode());
        result = prime * result + ((getCurrNo() == null) ? 0 : getCurrNo().hashCode());
        result = prime * result + ((getAcctTypeNo() == null) ? 0 : getAcctTypeNo().hashCode());
        result = prime * result + ((getExp() == null) ? 0 : getExp().hashCode());
        result = prime * result + ((getAcctNo() == null) ? 0 : getAcctNo().hashCode());
        result = prime * result + ((getAcctAlias() == null) ? 0 : getAcctAlias().hashCode());
        result = prime * result + ((getUserType() == null) ? 0 : getUserType().hashCode());
        result = prime * result + ((getBal() == null) ? 0 : getBal().hashCode());
        result = prime * result + ((getIncBal() == null) ? 0 : getIncBal().hashCode());
        result = prime * result + ((getFrzBal() == null) ? 0 : getFrzBal().hashCode());
        result = prime * result + ((getRecBal() == null) ? 0 : getRecBal().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getDac() == null) ? 0 : getDac().hashCode());
        result = prime * result + ((getNode() == null) ? 0 : getNode().hashCode());
        result = prime * result + ((getNum() == null) ? 0 : getNum().hashCode());
        result = prime * result + ((getLastTime() == null) ? 0 : getLastTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", acctNo=").append(acctNo);
        sb.append(", acctAlias=").append(acctAlias);
        sb.append(", userType=").append(userType);
        sb.append(", bal=").append(bal);
        sb.append(", incBal=").append(incBal);
        sb.append(", frzBal=").append(frzBal);
        sb.append(", recBal=").append(recBal);
        sb.append(", status=").append(status);
        sb.append(", dac=").append(dac);
        sb.append(", node=").append(node);
        sb.append(", num=").append(num);
        sb.append(", lastTime=").append(lastTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}