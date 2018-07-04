package com.wd.apiaccount.model.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class AcctRecord implements Serializable {
    private Long id;

    private String acctNo;

    private String acctAlias;

    private String tranCode;

    private BigDecimal opnBal;

    private BigDecimal clsBal;

    private BigDecimal tranAmt;

    private Integer tranNum;

    private Integer state;

    private Date insertTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getTranCode() {
        return tranCode;
    }

    public void setTranCode(String tranCode) {
        this.tranCode = tranCode == null ? null : tranCode.trim();
    }

    public BigDecimal getOpnBal() {
        return opnBal;
    }

    public void setOpnBal(BigDecimal opnBal) {
        this.opnBal = opnBal;
    }

    public BigDecimal getClsBal() {
        return clsBal;
    }

    public void setClsBal(BigDecimal clsBal) {
        this.clsBal = clsBal;
    }

    public BigDecimal getTranAmt() {
        return tranAmt;
    }

    public void setTranAmt(BigDecimal tranAmt) {
        this.tranAmt = tranAmt;
    }

    public Integer getTranNum() {
        return tranNum;
    }

    public void setTranNum(Integer tranNum) {
        this.tranNum = tranNum;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
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
        AcctRecord other = (AcctRecord) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAcctNo() == null ? other.getAcctNo() == null : this.getAcctNo().equals(other.getAcctNo()))
            && (this.getAcctAlias() == null ? other.getAcctAlias() == null : this.getAcctAlias().equals(other.getAcctAlias()))
            && (this.getTranCode() == null ? other.getTranCode() == null : this.getTranCode().equals(other.getTranCode()))
            && (this.getOpnBal() == null ? other.getOpnBal() == null : this.getOpnBal().equals(other.getOpnBal()))
            && (this.getClsBal() == null ? other.getClsBal() == null : this.getClsBal().equals(other.getClsBal()))
            && (this.getTranAmt() == null ? other.getTranAmt() == null : this.getTranAmt().equals(other.getTranAmt()))
            && (this.getTranNum() == null ? other.getTranNum() == null : this.getTranNum().equals(other.getTranNum()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getInsertTime() == null ? other.getInsertTime() == null : this.getInsertTime().equals(other.getInsertTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAcctNo() == null) ? 0 : getAcctNo().hashCode());
        result = prime * result + ((getAcctAlias() == null) ? 0 : getAcctAlias().hashCode());
        result = prime * result + ((getTranCode() == null) ? 0 : getTranCode().hashCode());
        result = prime * result + ((getOpnBal() == null) ? 0 : getOpnBal().hashCode());
        result = prime * result + ((getClsBal() == null) ? 0 : getClsBal().hashCode());
        result = prime * result + ((getTranAmt() == null) ? 0 : getTranAmt().hashCode());
        result = prime * result + ((getTranNum() == null) ? 0 : getTranNum().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
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
        sb.append(", acctNo=").append(acctNo);
        sb.append(", acctAlias=").append(acctAlias);
        sb.append(", tranCode=").append(tranCode);
        sb.append(", opnBal=").append(opnBal);
        sb.append(", clsBal=").append(clsBal);
        sb.append(", tranAmt=").append(tranAmt);
        sb.append(", tranNum=").append(tranNum);
        sb.append(", state=").append(state);
        sb.append(", insertTime=").append(insertTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}