package com.wd.apiaccount.model.domain;

import java.io.Serializable;
import java.util.Date;

public class AcctLog implements Serializable {
    private Long id;

    private String tranCode;

    private String requestId;

    private String requestLic;

    private String requestIp;

    private String requestTime;

    private Integer clusterId;

    private Date logTime;

    private String body;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTranCode() {
        return tranCode;
    }

    public void setTranCode(String tranCode) {
        this.tranCode = tranCode == null ? null : tranCode.trim();
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId == null ? null : requestId.trim();
    }

    public String getRequestLic() {
        return requestLic;
    }

    public void setRequestLic(String requestLic) {
        this.requestLic = requestLic == null ? null : requestLic.trim();
    }

    public String getRequestIp() {
        return requestIp;
    }

    public void setRequestIp(String requestIp) {
        this.requestIp = requestIp == null ? null : requestIp.trim();
    }

    public String getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(String requestTime) {
        this.requestTime = requestTime == null ? null : requestTime.trim();
    }

    public Integer getClusterId() {
        return clusterId;
    }

    public void setClusterId(Integer clusterId) {
        this.clusterId = clusterId;
    }

    public Date getLogTime() {
        return logTime;
    }

    public void setLogTime(Date logTime) {
        this.logTime = logTime;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body == null ? null : body.trim();
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
        AcctLog other = (AcctLog) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTranCode() == null ? other.getTranCode() == null : this.getTranCode().equals(other.getTranCode()))
            && (this.getRequestId() == null ? other.getRequestId() == null : this.getRequestId().equals(other.getRequestId()))
            && (this.getRequestLic() == null ? other.getRequestLic() == null : this.getRequestLic().equals(other.getRequestLic()))
            && (this.getRequestIp() == null ? other.getRequestIp() == null : this.getRequestIp().equals(other.getRequestIp()))
            && (this.getRequestTime() == null ? other.getRequestTime() == null : this.getRequestTime().equals(other.getRequestTime()))
            && (this.getClusterId() == null ? other.getClusterId() == null : this.getClusterId().equals(other.getClusterId()))
            && (this.getLogTime() == null ? other.getLogTime() == null : this.getLogTime().equals(other.getLogTime()))
            && (this.getBody() == null ? other.getBody() == null : this.getBody().equals(other.getBody()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTranCode() == null) ? 0 : getTranCode().hashCode());
        result = prime * result + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        result = prime * result + ((getRequestLic() == null) ? 0 : getRequestLic().hashCode());
        result = prime * result + ((getRequestIp() == null) ? 0 : getRequestIp().hashCode());
        result = prime * result + ((getRequestTime() == null) ? 0 : getRequestTime().hashCode());
        result = prime * result + ((getClusterId() == null) ? 0 : getClusterId().hashCode());
        result = prime * result + ((getLogTime() == null) ? 0 : getLogTime().hashCode());
        result = prime * result + ((getBody() == null) ? 0 : getBody().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", tranCode=").append(tranCode);
        sb.append(", requestId=").append(requestId);
        sb.append(", requestLic=").append(requestLic);
        sb.append(", requestIp=").append(requestIp);
        sb.append(", requestTime=").append(requestTime);
        sb.append(", clusterId=").append(clusterId);
        sb.append(", logTime=").append(logTime);
        sb.append(", body=").append(body);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}