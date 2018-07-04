package com.wa.apiaccount.core.model.domain;

import java.io.Serializable;

public class AcctCurr implements Serializable {
    private String currNo;

    private String currName;

    private String currMem;

    private String currMer;

    private String currInst;

    private String currStatus;

    private Integer currList;

    private static final long serialVersionUID = 1L;

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

    public String getCurrMem() {
        return currMem;
    }

    public void setCurrMem(String currMem) {
        this.currMem = currMem == null ? null : currMem.trim();
    }

    public String getCurrMer() {
        return currMer;
    }

    public void setCurrMer(String currMer) {
        this.currMer = currMer == null ? null : currMer.trim();
    }

    public String getCurrInst() {
        return currInst;
    }

    public void setCurrInst(String currInst) {
        this.currInst = currInst == null ? null : currInst.trim();
    }

    public String getCurrStatus() {
        return currStatus;
    }

    public void setCurrStatus(String currStatus) {
        this.currStatus = currStatus == null ? null : currStatus.trim();
    }

    public Integer getCurrList() {
        return currList;
    }

    public void setCurrList(Integer currList) {
        this.currList = currList;
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
        AcctCurr other = (AcctCurr) that;
        return (this.getCurrNo() == null ? other.getCurrNo() == null : this.getCurrNo().equals(other.getCurrNo()))
            && (this.getCurrName() == null ? other.getCurrName() == null : this.getCurrName().equals(other.getCurrName()))
            && (this.getCurrMem() == null ? other.getCurrMem() == null : this.getCurrMem().equals(other.getCurrMem()))
            && (this.getCurrMer() == null ? other.getCurrMer() == null : this.getCurrMer().equals(other.getCurrMer()))
            && (this.getCurrInst() == null ? other.getCurrInst() == null : this.getCurrInst().equals(other.getCurrInst()))
            && (this.getCurrStatus() == null ? other.getCurrStatus() == null : this.getCurrStatus().equals(other.getCurrStatus()))
            && (this.getCurrList() == null ? other.getCurrList() == null : this.getCurrList().equals(other.getCurrList()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCurrNo() == null) ? 0 : getCurrNo().hashCode());
        result = prime * result + ((getCurrName() == null) ? 0 : getCurrName().hashCode());
        result = prime * result + ((getCurrMem() == null) ? 0 : getCurrMem().hashCode());
        result = prime * result + ((getCurrMer() == null) ? 0 : getCurrMer().hashCode());
        result = prime * result + ((getCurrInst() == null) ? 0 : getCurrInst().hashCode());
        result = prime * result + ((getCurrStatus() == null) ? 0 : getCurrStatus().hashCode());
        result = prime * result + ((getCurrList() == null) ? 0 : getCurrList().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", currNo=").append(currNo);
        sb.append(", currName=").append(currName);
        sb.append(", currMem=").append(currMem);
        sb.append(", currMer=").append(currMer);
        sb.append(", currInst=").append(currInst);
        sb.append(", currStatus=").append(currStatus);
        sb.append(", currList=").append(currList);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}