package com.wa.apiaccount.core.model.domain;

import java.io.Serializable;
import java.util.Date;

public class AcctSql implements Serializable {
    private Integer sqlId;

    private String sqlName;

    private String crudType;

    private String sqlBody;

    private Integer catheFlag;

    private Byte sqlStatus;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Integer getSqlId() {
        return sqlId;
    }

    public void setSqlId(Integer sqlId) {
        this.sqlId = sqlId;
    }

    public String getSqlName() {
        return sqlName;
    }

    public void setSqlName(String sqlName) {
        this.sqlName = sqlName == null ? null : sqlName.trim();
    }

    public String getCrudType() {
        return crudType;
    }

    public void setCrudType(String crudType) {
        this.crudType = crudType == null ? null : crudType.trim();
    }

    public String getSqlBody() {
        return sqlBody;
    }

    public void setSqlBody(String sqlBody) {
        this.sqlBody = sqlBody == null ? null : sqlBody.trim();
    }

    public Integer getCatheFlag() {
        return catheFlag;
    }

    public void setCatheFlag(Integer catheFlag) {
        this.catheFlag = catheFlag;
    }

    public Byte getSqlStatus() {
        return sqlStatus;
    }

    public void setSqlStatus(Byte sqlStatus) {
        this.sqlStatus = sqlStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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
        AcctSql other = (AcctSql) that;
        return (this.getSqlId() == null ? other.getSqlId() == null : this.getSqlId().equals(other.getSqlId()))
            && (this.getSqlName() == null ? other.getSqlName() == null : this.getSqlName().equals(other.getSqlName()))
            && (this.getCrudType() == null ? other.getCrudType() == null : this.getCrudType().equals(other.getCrudType()))
            && (this.getSqlBody() == null ? other.getSqlBody() == null : this.getSqlBody().equals(other.getSqlBody()))
            && (this.getCatheFlag() == null ? other.getCatheFlag() == null : this.getCatheFlag().equals(other.getCatheFlag()))
            && (this.getSqlStatus() == null ? other.getSqlStatus() == null : this.getSqlStatus().equals(other.getSqlStatus()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSqlId() == null) ? 0 : getSqlId().hashCode());
        result = prime * result + ((getSqlName() == null) ? 0 : getSqlName().hashCode());
        result = prime * result + ((getCrudType() == null) ? 0 : getCrudType().hashCode());
        result = prime * result + ((getSqlBody() == null) ? 0 : getSqlBody().hashCode());
        result = prime * result + ((getCatheFlag() == null) ? 0 : getCatheFlag().hashCode());
        result = prime * result + ((getSqlStatus() == null) ? 0 : getSqlStatus().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sqlId=").append(sqlId);
        sb.append(", sqlName=").append(sqlName);
        sb.append(", crudType=").append(crudType);
        sb.append(", sqlBody=").append(sqlBody);
        sb.append(", catheFlag=").append(catheFlag);
        sb.append(", sqlStatus=").append(sqlStatus);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}