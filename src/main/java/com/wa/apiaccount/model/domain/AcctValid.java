package com.wd.apiaccount.model.domain;

import java.io.Serializable;

public class AcctValid extends AcctValidKey implements Serializable {
    private Integer validSeq;

    private String filedDesc;

    private String filedType;

    private String filedFixed;

    private Integer filedLength;

    private Integer fieldBytes;

    private String sign;

    private String validExpression;

    private String validDesc;

    private String validNesy;

    private String validDemo;

    private static final long serialVersionUID = 1L;

    public Integer getValidSeq() {
        return validSeq;
    }

    public void setValidSeq(Integer validSeq) {
        this.validSeq = validSeq;
    }

    public String getFiledDesc() {
        return filedDesc;
    }

    public void setFiledDesc(String filedDesc) {
        this.filedDesc = filedDesc == null ? null : filedDesc.trim();
    }

    public String getFiledType() {
        return filedType;
    }

    public void setFiledType(String filedType) {
        this.filedType = filedType == null ? null : filedType.trim();
    }

    public String getFiledFixed() {
        return filedFixed;
    }

    public void setFiledFixed(String filedFixed) {
        this.filedFixed = filedFixed == null ? null : filedFixed.trim();
    }

    public Integer getFiledLength() {
        return filedLength;
    }

    public void setFiledLength(Integer filedLength) {
        this.filedLength = filedLength;
    }

    public Integer getFieldBytes() {
        return fieldBytes;
    }

    public void setFieldBytes(Integer fieldBytes) {
        this.fieldBytes = fieldBytes;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign == null ? null : sign.trim();
    }

    public String getValidExpression() {
        return validExpression;
    }

    public void setValidExpression(String validExpression) {
        this.validExpression = validExpression == null ? null : validExpression.trim();
    }

    public String getValidDesc() {
        return validDesc;
    }

    public void setValidDesc(String validDesc) {
        this.validDesc = validDesc == null ? null : validDesc.trim();
    }

    public String getValidNesy() {
        return validNesy;
    }

    public void setValidNesy(String validNesy) {
        this.validNesy = validNesy == null ? null : validNesy.trim();
    }

    public String getValidDemo() {
        return validDemo;
    }

    public void setValidDemo(String validDemo) {
        this.validDemo = validDemo == null ? null : validDemo.trim();
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
        AcctValid other = (AcctValid) that;
        return (this.getTranCode() == null ? other.getTranCode() == null : this.getTranCode().equals(other.getTranCode()))
            && (this.getTranClass() == null ? other.getTranClass() == null : this.getTranClass().equals(other.getTranClass()))
            && (this.getMsgType() == null ? other.getMsgType() == null : this.getMsgType().equals(other.getMsgType()))
            && (this.getFieldName() == null ? other.getFieldName() == null : this.getFieldName().equals(other.getFieldName()))
            && (this.getValidSeq() == null ? other.getValidSeq() == null : this.getValidSeq().equals(other.getValidSeq()))
            && (this.getFiledDesc() == null ? other.getFiledDesc() == null : this.getFiledDesc().equals(other.getFiledDesc()))
            && (this.getFiledType() == null ? other.getFiledType() == null : this.getFiledType().equals(other.getFiledType()))
            && (this.getFiledFixed() == null ? other.getFiledFixed() == null : this.getFiledFixed().equals(other.getFiledFixed()))
            && (this.getFiledLength() == null ? other.getFiledLength() == null : this.getFiledLength().equals(other.getFiledLength()))
            && (this.getFieldBytes() == null ? other.getFieldBytes() == null : this.getFieldBytes().equals(other.getFieldBytes()))
            && (this.getSign() == null ? other.getSign() == null : this.getSign().equals(other.getSign()))
            && (this.getValidExpression() == null ? other.getValidExpression() == null : this.getValidExpression().equals(other.getValidExpression()))
            && (this.getValidDesc() == null ? other.getValidDesc() == null : this.getValidDesc().equals(other.getValidDesc()))
            && (this.getValidNesy() == null ? other.getValidNesy() == null : this.getValidNesy().equals(other.getValidNesy()))
            && (this.getValidDemo() == null ? other.getValidDemo() == null : this.getValidDemo().equals(other.getValidDemo()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTranCode() == null) ? 0 : getTranCode().hashCode());
        result = prime * result + ((getTranClass() == null) ? 0 : getTranClass().hashCode());
        result = prime * result + ((getMsgType() == null) ? 0 : getMsgType().hashCode());
        result = prime * result + ((getFieldName() == null) ? 0 : getFieldName().hashCode());
        result = prime * result + ((getValidSeq() == null) ? 0 : getValidSeq().hashCode());
        result = prime * result + ((getFiledDesc() == null) ? 0 : getFiledDesc().hashCode());
        result = prime * result + ((getFiledType() == null) ? 0 : getFiledType().hashCode());
        result = prime * result + ((getFiledFixed() == null) ? 0 : getFiledFixed().hashCode());
        result = prime * result + ((getFiledLength() == null) ? 0 : getFiledLength().hashCode());
        result = prime * result + ((getFieldBytes() == null) ? 0 : getFieldBytes().hashCode());
        result = prime * result + ((getSign() == null) ? 0 : getSign().hashCode());
        result = prime * result + ((getValidExpression() == null) ? 0 : getValidExpression().hashCode());
        result = prime * result + ((getValidDesc() == null) ? 0 : getValidDesc().hashCode());
        result = prime * result + ((getValidNesy() == null) ? 0 : getValidNesy().hashCode());
        result = prime * result + ((getValidDemo() == null) ? 0 : getValidDemo().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", validSeq=").append(validSeq);
        sb.append(", filedDesc=").append(filedDesc);
        sb.append(", filedType=").append(filedType);
        sb.append(", filedFixed=").append(filedFixed);
        sb.append(", filedLength=").append(filedLength);
        sb.append(", fieldBytes=").append(fieldBytes);
        sb.append(", sign=").append(sign);
        sb.append(", validExpression=").append(validExpression);
        sb.append(", validDesc=").append(validDesc);
        sb.append(", validNesy=").append(validNesy);
        sb.append(", validDemo=").append(validDemo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}