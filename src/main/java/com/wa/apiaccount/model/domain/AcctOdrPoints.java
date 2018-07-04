package com.wd.apiaccount.model.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class AcctOdrPoints implements Serializable {
    private Long id;

    private Long flowId;

    private String odrNo;

    private String odrCh;

    private String userNo;

    private String merNo;

    private String merName;

    private String exCode;

    private String exName;

    private String exType;

    private BigDecimal exNum;

    private BigDecimal exPrice;

    private BigDecimal amt;

    private Integer state;

    private String tranCode;

    private String acctDate;

    private Long billId;

    private String errMessage;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFlowId() {
        return flowId;
    }

    public void setFlowId(Long flowId) {
        this.flowId = flowId;
    }

    public String getOdrNo() {
        return odrNo;
    }

    public void setOdrNo(String odrNo) {
        this.odrNo = odrNo == null ? null : odrNo.trim();
    }

    public String getOdrCh() {
        return odrCh;
    }

    public void setOdrCh(String odrCh) {
        this.odrCh = odrCh == null ? null : odrCh.trim();
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo == null ? null : userNo.trim();
    }

    public String getMerNo() {
        return merNo;
    }

    public void setMerNo(String merNo) {
        this.merNo = merNo == null ? null : merNo.trim();
    }

    public String getMerName() {
        return merName;
    }

    public void setMerName(String merName) {
        this.merName = merName == null ? null : merName.trim();
    }

    public String getExCode() {
        return exCode;
    }

    public void setExCode(String exCode) {
        this.exCode = exCode == null ? null : exCode.trim();
    }

    public String getExName() {
        return exName;
    }

    public void setExName(String exName) {
        this.exName = exName == null ? null : exName.trim();
    }

    public String getExType() {
        return exType;
    }

    public void setExType(String exType) {
        this.exType = exType == null ? null : exType.trim();
    }

    public BigDecimal getExNum() {
        return exNum;
    }

    public void setExNum(BigDecimal exNum) {
        this.exNum = exNum;
    }

    public BigDecimal getExPrice() {
        return exPrice;
    }

    public void setExPrice(BigDecimal exPrice) {
        this.exPrice = exPrice;
    }

    public BigDecimal getAmt() {
        return amt;
    }

    public void setAmt(BigDecimal amt) {
        this.amt = amt;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getTranCode() {
        return tranCode;
    }

    public void setTranCode(String tranCode) {
        this.tranCode = tranCode == null ? null : tranCode.trim();
    }

    public String getAcctDate() {
        return acctDate;
    }

    public void setAcctDate(String acctDate) {
        this.acctDate = acctDate == null ? null : acctDate.trim();
    }

    public Long getBillId() {
        return billId;
    }

    public void setBillId(Long billId) {
        this.billId = billId;
    }

    public String getErrMessage() {
        return errMessage;
    }

    public void setErrMessage(String errMessage) {
        this.errMessage = errMessage == null ? null : errMessage.trim();
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
        AcctOdrPoints other = (AcctOdrPoints) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getFlowId() == null ? other.getFlowId() == null : this.getFlowId().equals(other.getFlowId()))
            && (this.getOdrNo() == null ? other.getOdrNo() == null : this.getOdrNo().equals(other.getOdrNo()))
            && (this.getOdrCh() == null ? other.getOdrCh() == null : this.getOdrCh().equals(other.getOdrCh()))
            && (this.getUserNo() == null ? other.getUserNo() == null : this.getUserNo().equals(other.getUserNo()))
            && (this.getMerNo() == null ? other.getMerNo() == null : this.getMerNo().equals(other.getMerNo()))
            && (this.getMerName() == null ? other.getMerName() == null : this.getMerName().equals(other.getMerName()))
            && (this.getExCode() == null ? other.getExCode() == null : this.getExCode().equals(other.getExCode()))
            && (this.getExName() == null ? other.getExName() == null : this.getExName().equals(other.getExName()))
            && (this.getExType() == null ? other.getExType() == null : this.getExType().equals(other.getExType()))
            && (this.getExNum() == null ? other.getExNum() == null : this.getExNum().equals(other.getExNum()))
            && (this.getExPrice() == null ? other.getExPrice() == null : this.getExPrice().equals(other.getExPrice()))
            && (this.getAmt() == null ? other.getAmt() == null : this.getAmt().equals(other.getAmt()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getTranCode() == null ? other.getTranCode() == null : this.getTranCode().equals(other.getTranCode()))
            && (this.getAcctDate() == null ? other.getAcctDate() == null : this.getAcctDate().equals(other.getAcctDate()))
            && (this.getBillId() == null ? other.getBillId() == null : this.getBillId().equals(other.getBillId()))
            && (this.getErrMessage() == null ? other.getErrMessage() == null : this.getErrMessage().equals(other.getErrMessage()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getFlowId() == null) ? 0 : getFlowId().hashCode());
        result = prime * result + ((getOdrNo() == null) ? 0 : getOdrNo().hashCode());
        result = prime * result + ((getOdrCh() == null) ? 0 : getOdrCh().hashCode());
        result = prime * result + ((getUserNo() == null) ? 0 : getUserNo().hashCode());
        result = prime * result + ((getMerNo() == null) ? 0 : getMerNo().hashCode());
        result = prime * result + ((getMerName() == null) ? 0 : getMerName().hashCode());
        result = prime * result + ((getExCode() == null) ? 0 : getExCode().hashCode());
        result = prime * result + ((getExName() == null) ? 0 : getExName().hashCode());
        result = prime * result + ((getExType() == null) ? 0 : getExType().hashCode());
        result = prime * result + ((getExNum() == null) ? 0 : getExNum().hashCode());
        result = prime * result + ((getExPrice() == null) ? 0 : getExPrice().hashCode());
        result = prime * result + ((getAmt() == null) ? 0 : getAmt().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getTranCode() == null) ? 0 : getTranCode().hashCode());
        result = prime * result + ((getAcctDate() == null) ? 0 : getAcctDate().hashCode());
        result = prime * result + ((getBillId() == null) ? 0 : getBillId().hashCode());
        result = prime * result + ((getErrMessage() == null) ? 0 : getErrMessage().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", flowId=").append(flowId);
        sb.append(", odrNo=").append(odrNo);
        sb.append(", odrCh=").append(odrCh);
        sb.append(", userNo=").append(userNo);
        sb.append(", merNo=").append(merNo);
        sb.append(", merName=").append(merName);
        sb.append(", exCode=").append(exCode);
        sb.append(", exName=").append(exName);
        sb.append(", exType=").append(exType);
        sb.append(", exNum=").append(exNum);
        sb.append(", exPrice=").append(exPrice);
        sb.append(", amt=").append(amt);
        sb.append(", state=").append(state);
        sb.append(", tranCode=").append(tranCode);
        sb.append(", acctDate=").append(acctDate);
        sb.append(", billId=").append(billId);
        sb.append(", errMessage=").append(errMessage);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}