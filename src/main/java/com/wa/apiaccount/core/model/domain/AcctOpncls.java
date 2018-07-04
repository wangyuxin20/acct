package com.wa.apiaccount.core.model.domain;

import java.io.Serializable;
import java.util.Date;

public class AcctOpncls implements Serializable {
    private Long id;

    private String requestId;

    private String acctNo;

    private Date openDate;

    private String acctState;

    private Date closeDate;

    private String note;

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

    public String getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(String acctNo) {
        this.acctNo = acctNo == null ? null : acctNo.trim();
    }

    public Date getOpenDate() {
        return openDate;
    }

    public void setOpenDate(Date openDate) {
        this.openDate = openDate;
    }

    public String getAcctState() {
        return acctState;
    }

    public void setAcctState(String acctState) {
        this.acctState = acctState == null ? null : acctState.trim();
    }

    public Date getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(Date closeDate) {
        this.closeDate = closeDate;
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
        AcctOpncls other = (AcctOpncls) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRequestId() == null ? other.getRequestId() == null : this.getRequestId().equals(other.getRequestId()))
            && (this.getAcctNo() == null ? other.getAcctNo() == null : this.getAcctNo().equals(other.getAcctNo()))
            && (this.getOpenDate() == null ? other.getOpenDate() == null : this.getOpenDate().equals(other.getOpenDate()))
            && (this.getAcctState() == null ? other.getAcctState() == null : this.getAcctState().equals(other.getAcctState()))
            && (this.getCloseDate() == null ? other.getCloseDate() == null : this.getCloseDate().equals(other.getCloseDate()))
            && (this.getNote() == null ? other.getNote() == null : this.getNote().equals(other.getNote()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        result = prime * result + ((getAcctNo() == null) ? 0 : getAcctNo().hashCode());
        result = prime * result + ((getOpenDate() == null) ? 0 : getOpenDate().hashCode());
        result = prime * result + ((getAcctState() == null) ? 0 : getAcctState().hashCode());
        result = prime * result + ((getCloseDate() == null) ? 0 : getCloseDate().hashCode());
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
        sb.append(", requestId=").append(requestId);
        sb.append(", acctNo=").append(acctNo);
        sb.append(", openDate=").append(openDate);
        sb.append(", acctState=").append(acctState);
        sb.append(", closeDate=").append(closeDate);
        sb.append(", note=").append(note);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}