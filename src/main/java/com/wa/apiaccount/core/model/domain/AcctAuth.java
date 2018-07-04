package com.wa.apiaccount.core.model.domain;

import java.io.Serializable;
import java.util.Date;

public class AcctAuth implements Serializable {
    private Long id;

    private String requestLic;

    private String requestSysName;

    private String requestIp;

    private String tranCode;

    private Long count;

    private Date countTime;

    private Integer authState;

    private Date authTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRequestLic() {
        return requestLic;
    }

    public void setRequestLic(String requestLic) {
        this.requestLic = requestLic == null ? null : requestLic.trim();
    }

    public String getRequestSysName() {
        return requestSysName;
    }

    public void setRequestSysName(String requestSysName) {
        this.requestSysName = requestSysName == null ? null : requestSysName.trim();
    }

    public String getRequestIp() {
        return requestIp;
    }

    public void setRequestIp(String requestIp) {
        this.requestIp = requestIp == null ? null : requestIp.trim();
    }

    public String getTranCode() {
        return tranCode;
    }

    public void setTranCode(String tranCode) {
        this.tranCode = tranCode == null ? null : tranCode.trim();
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Date getCountTime() {
        return countTime;
    }

    public void setCountTime(Date countTime) {
        this.countTime = countTime;
    }

    public Integer getAuthState() {
        return authState;
    }

    public void setAuthState(Integer authState) {
        this.authState = authState;
    }

    public Date getAuthTime() {
        return authTime;
    }

    public void setAuthTime(Date authTime) {
        this.authTime = authTime;
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
        AcctAuth other = (AcctAuth) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRequestLic() == null ? other.getRequestLic() == null : this.getRequestLic().equals(other.getRequestLic()))
            && (this.getRequestSysName() == null ? other.getRequestSysName() == null : this.getRequestSysName().equals(other.getRequestSysName()))
            && (this.getRequestIp() == null ? other.getRequestIp() == null : this.getRequestIp().equals(other.getRequestIp()))
            && (this.getTranCode() == null ? other.getTranCode() == null : this.getTranCode().equals(other.getTranCode()))
            && (this.getCount() == null ? other.getCount() == null : this.getCount().equals(other.getCount()))
            && (this.getCountTime() == null ? other.getCountTime() == null : this.getCountTime().equals(other.getCountTime()))
            && (this.getAuthState() == null ? other.getAuthState() == null : this.getAuthState().equals(other.getAuthState()))
            && (this.getAuthTime() == null ? other.getAuthTime() == null : this.getAuthTime().equals(other.getAuthTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRequestLic() == null) ? 0 : getRequestLic().hashCode());
        result = prime * result + ((getRequestSysName() == null) ? 0 : getRequestSysName().hashCode());
        result = prime * result + ((getRequestIp() == null) ? 0 : getRequestIp().hashCode());
        result = prime * result + ((getTranCode() == null) ? 0 : getTranCode().hashCode());
        result = prime * result + ((getCount() == null) ? 0 : getCount().hashCode());
        result = prime * result + ((getCountTime() == null) ? 0 : getCountTime().hashCode());
        result = prime * result + ((getAuthState() == null) ? 0 : getAuthState().hashCode());
        result = prime * result + ((getAuthTime() == null) ? 0 : getAuthTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", requestLic=").append(requestLic);
        sb.append(", requestSysName=").append(requestSysName);
        sb.append(", requestIp=").append(requestIp);
        sb.append(", tranCode=").append(tranCode);
        sb.append(", count=").append(count);
        sb.append(", countTime=").append(countTime);
        sb.append(", authState=").append(authState);
        sb.append(", authTime=").append(authTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}