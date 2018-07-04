package com.wa.apiaccount.core.model.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class AcctMktRec implements Serializable {
    private Long id;

    private String requestId;

    private String flowId;

    private String userNo;

    private Integer slotSeq;

    private Integer tranSeq;

    private BigDecimal amt;

    private Date insertTime;

    private Integer state;

    private Date lastTime;

    private String comment;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId == null ? null : requestId.trim();
    }

    public String getFlowId() {
        return flowId;
    }

    public void setFlowId(String flowId) {
        this.flowId = flowId == null ? null : flowId.trim();
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo == null ? null : userNo.trim();
    }

    public Integer getSlotSeq() {
        return slotSeq;
    }

    public void setSlotSeq(Integer slotSeq) {
        this.slotSeq = slotSeq;
    }

    public Integer getTranSeq() {
        return tranSeq;
    }

    public void setTranSeq(Integer tranSeq) {
        this.tranSeq = tranSeq;
    }

    public BigDecimal getAmt() {
        return amt;
    }

    public void setAmt(BigDecimal amt) {
        this.amt = amt;
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

    public Date getLastTime() {
        return lastTime;
    }

    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
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
        AcctMktRec other = (AcctMktRec) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRequestId() == null ? other.getRequestId() == null : this.getRequestId().equals(other.getRequestId()))
            && (this.getFlowId() == null ? other.getFlowId() == null : this.getFlowId().equals(other.getFlowId()))
            && (this.getUserNo() == null ? other.getUserNo() == null : this.getUserNo().equals(other.getUserNo()))
            && (this.getSlotSeq() == null ? other.getSlotSeq() == null : this.getSlotSeq().equals(other.getSlotSeq()))
            && (this.getTranSeq() == null ? other.getTranSeq() == null : this.getTranSeq().equals(other.getTranSeq()))
            && (this.getAmt() == null ? other.getAmt() == null : this.getAmt().equals(other.getAmt()))
            && (this.getInsertTime() == null ? other.getInsertTime() == null : this.getInsertTime().equals(other.getInsertTime()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getLastTime() == null ? other.getLastTime() == null : this.getLastTime().equals(other.getLastTime()))
            && (this.getComment() == null ? other.getComment() == null : this.getComment().equals(other.getComment()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        result = prime * result + ((getFlowId() == null) ? 0 : getFlowId().hashCode());
        result = prime * result + ((getUserNo() == null) ? 0 : getUserNo().hashCode());
        result = prime * result + ((getSlotSeq() == null) ? 0 : getSlotSeq().hashCode());
        result = prime * result + ((getTranSeq() == null) ? 0 : getTranSeq().hashCode());
        result = prime * result + ((getAmt() == null) ? 0 : getAmt().hashCode());
        result = prime * result + ((getInsertTime() == null) ? 0 : getInsertTime().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getLastTime() == null) ? 0 : getLastTime().hashCode());
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
        sb.append(", requestId=").append(requestId);
        sb.append(", flowId=").append(flowId);
        sb.append(", userNo=").append(userNo);
        sb.append(", slotSeq=").append(slotSeq);
        sb.append(", tranSeq=").append(tranSeq);
        sb.append(", amt=").append(amt);
        sb.append(", insertTime=").append(insertTime);
        sb.append(", state=").append(state);
        sb.append(", lastTime=").append(lastTime);
        sb.append(", comment=").append(comment);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}