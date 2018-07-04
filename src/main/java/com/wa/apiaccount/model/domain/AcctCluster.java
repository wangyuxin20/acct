package com.wd.apiaccount.model.domain;

import java.io.Serializable;
import java.util.Date;

public class AcctCluster implements Serializable {
    private Integer id;

    private String hostName;

    private String hostAddress;

    private String hostStatus;

    private Date insertTime;

    private String canonicalHostName;

    private String hostEditCache;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName == null ? null : hostName.trim();
    }

    public String getHostAddress() {
        return hostAddress;
    }

    public void setHostAddress(String hostAddress) {
        this.hostAddress = hostAddress == null ? null : hostAddress.trim();
    }

    public String getHostStatus() {
        return hostStatus;
    }

    public void setHostStatus(String hostStatus) {
        this.hostStatus = hostStatus == null ? null : hostStatus.trim();
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    public String getCanonicalHostName() {
        return canonicalHostName;
    }

    public void setCanonicalHostName(String canonicalHostName) {
        this.canonicalHostName = canonicalHostName == null ? null : canonicalHostName.trim();
    }

    public String getHostEditCache() {
        return hostEditCache;
    }

    public void setHostEditCache(String hostEditCache) {
        this.hostEditCache = hostEditCache == null ? null : hostEditCache.trim();
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
        AcctCluster other = (AcctCluster) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getHostName() == null ? other.getHostName() == null : this.getHostName().equals(other.getHostName()))
            && (this.getHostAddress() == null ? other.getHostAddress() == null : this.getHostAddress().equals(other.getHostAddress()))
            && (this.getHostStatus() == null ? other.getHostStatus() == null : this.getHostStatus().equals(other.getHostStatus()))
            && (this.getInsertTime() == null ? other.getInsertTime() == null : this.getInsertTime().equals(other.getInsertTime()))
            && (this.getCanonicalHostName() == null ? other.getCanonicalHostName() == null : this.getCanonicalHostName().equals(other.getCanonicalHostName()))
            && (this.getHostEditCache() == null ? other.getHostEditCache() == null : this.getHostEditCache().equals(other.getHostEditCache()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getHostName() == null) ? 0 : getHostName().hashCode());
        result = prime * result + ((getHostAddress() == null) ? 0 : getHostAddress().hashCode());
        result = prime * result + ((getHostStatus() == null) ? 0 : getHostStatus().hashCode());
        result = prime * result + ((getInsertTime() == null) ? 0 : getInsertTime().hashCode());
        result = prime * result + ((getCanonicalHostName() == null) ? 0 : getCanonicalHostName().hashCode());
        result = prime * result + ((getHostEditCache() == null) ? 0 : getHostEditCache().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", hostName=").append(hostName);
        sb.append(", hostAddress=").append(hostAddress);
        sb.append(", hostStatus=").append(hostStatus);
        sb.append(", insertTime=").append(insertTime);
        sb.append(", canonicalHostName=").append(canonicalHostName);
        sb.append(", hostEditCache=").append(hostEditCache);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}