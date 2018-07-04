package com.wa.apiaccount.core.model.domain;

import java.io.Serializable;

public class AcctProc implements Serializable {
    private String tranCode;

    private String name;

    private String rpType;

    private Integer bkChk;

    private Integer limChk;

    private String path;

    private String state;

    private static final long serialVersionUID = 1L;

    public String getTranCode() {
        return tranCode;
    }

    public void setTranCode(String tranCode) {
        this.tranCode = tranCode == null ? null : tranCode.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getRpType() {
        return rpType;
    }

    public void setRpType(String rpType) {
        this.rpType = rpType == null ? null : rpType.trim();
    }

    public Integer getBkChk() {
        return bkChk;
    }

    public void setBkChk(Integer bkChk) {
        this.bkChk = bkChk;
    }

    public Integer getLimChk() {
        return limChk;
    }

    public void setLimChk(Integer limChk) {
        this.limChk = limChk;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
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
        AcctProc other = (AcctProc) that;
        return (this.getTranCode() == null ? other.getTranCode() == null : this.getTranCode().equals(other.getTranCode()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getRpType() == null ? other.getRpType() == null : this.getRpType().equals(other.getRpType()))
            && (this.getBkChk() == null ? other.getBkChk() == null : this.getBkChk().equals(other.getBkChk()))
            && (this.getLimChk() == null ? other.getLimChk() == null : this.getLimChk().equals(other.getLimChk()))
            && (this.getPath() == null ? other.getPath() == null : this.getPath().equals(other.getPath()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTranCode() == null) ? 0 : getTranCode().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getRpType() == null) ? 0 : getRpType().hashCode());
        result = prime * result + ((getBkChk() == null) ? 0 : getBkChk().hashCode());
        result = prime * result + ((getLimChk() == null) ? 0 : getLimChk().hashCode());
        result = prime * result + ((getPath() == null) ? 0 : getPath().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tranCode=").append(tranCode);
        sb.append(", name=").append(name);
        sb.append(", rpType=").append(rpType);
        sb.append(", bkChk=").append(bkChk);
        sb.append(", limChk=").append(limChk);
        sb.append(", path=").append(path);
        sb.append(", state=").append(state);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}