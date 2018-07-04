package com.wd.apiaccount.model.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class FeifanMoneyLog implements Serializable {
    private Long id;

    private BigDecimal amount;

    private Integer operaType;

    private Integer proMethod;

    private Integer getMethod;

    private Integer conProduct;

    private Integer conMethod;

    private String activityId;

    private String userId;

    private String toUserId;

    private String toBrandId;

    private String couponId;

    private Integer feifanMoneyNum;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getOperaType() {
        return operaType;
    }

    public void setOperaType(Integer operaType) {
        this.operaType = operaType;
    }

    public Integer getProMethod() {
        return proMethod;
    }

    public void setProMethod(Integer proMethod) {
        this.proMethod = proMethod;
    }

    public Integer getGetMethod() {
        return getMethod;
    }

    public void setGetMethod(Integer getMethod) {
        this.getMethod = getMethod;
    }

    public Integer getConProduct() {
        return conProduct;
    }

    public void setConProduct(Integer conProduct) {
        this.conProduct = conProduct;
    }

    public Integer getConMethod() {
        return conMethod;
    }

    public void setConMethod(Integer conMethod) {
        this.conMethod = conMethod;
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId == null ? null : activityId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getToUserId() {
        return toUserId;
    }

    public void setToUserId(String toUserId) {
        this.toUserId = toUserId == null ? null : toUserId.trim();
    }

    public String getToBrandId() {
        return toBrandId;
    }

    public void setToBrandId(String toBrandId) {
        this.toBrandId = toBrandId == null ? null : toBrandId.trim();
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId == null ? null : couponId.trim();
    }

    public Integer getFeifanMoneyNum() {
        return feifanMoneyNum;
    }

    public void setFeifanMoneyNum(Integer feifanMoneyNum) {
        this.feifanMoneyNum = feifanMoneyNum;
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
        FeifanMoneyLog other = (FeifanMoneyLog) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getOperaType() == null ? other.getOperaType() == null : this.getOperaType().equals(other.getOperaType()))
            && (this.getProMethod() == null ? other.getProMethod() == null : this.getProMethod().equals(other.getProMethod()))
            && (this.getGetMethod() == null ? other.getGetMethod() == null : this.getGetMethod().equals(other.getGetMethod()))
            && (this.getConProduct() == null ? other.getConProduct() == null : this.getConProduct().equals(other.getConProduct()))
            && (this.getConMethod() == null ? other.getConMethod() == null : this.getConMethod().equals(other.getConMethod()))
            && (this.getActivityId() == null ? other.getActivityId() == null : this.getActivityId().equals(other.getActivityId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getToUserId() == null ? other.getToUserId() == null : this.getToUserId().equals(other.getToUserId()))
            && (this.getToBrandId() == null ? other.getToBrandId() == null : this.getToBrandId().equals(other.getToBrandId()))
            && (this.getCouponId() == null ? other.getCouponId() == null : this.getCouponId().equals(other.getCouponId()))
            && (this.getFeifanMoneyNum() == null ? other.getFeifanMoneyNum() == null : this.getFeifanMoneyNum().equals(other.getFeifanMoneyNum()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getOperaType() == null) ? 0 : getOperaType().hashCode());
        result = prime * result + ((getProMethod() == null) ? 0 : getProMethod().hashCode());
        result = prime * result + ((getGetMethod() == null) ? 0 : getGetMethod().hashCode());
        result = prime * result + ((getConProduct() == null) ? 0 : getConProduct().hashCode());
        result = prime * result + ((getConMethod() == null) ? 0 : getConMethod().hashCode());
        result = prime * result + ((getActivityId() == null) ? 0 : getActivityId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getToUserId() == null) ? 0 : getToUserId().hashCode());
        result = prime * result + ((getToBrandId() == null) ? 0 : getToBrandId().hashCode());
        result = prime * result + ((getCouponId() == null) ? 0 : getCouponId().hashCode());
        result = prime * result + ((getFeifanMoneyNum() == null) ? 0 : getFeifanMoneyNum().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", amount=").append(amount);
        sb.append(", operaType=").append(operaType);
        sb.append(", proMethod=").append(proMethod);
        sb.append(", getMethod=").append(getMethod);
        sb.append(", conProduct=").append(conProduct);
        sb.append(", conMethod=").append(conMethod);
        sb.append(", activityId=").append(activityId);
        sb.append(", userId=").append(userId);
        sb.append(", toUserId=").append(toUserId);
        sb.append(", toBrandId=").append(toBrandId);
        sb.append(", couponId=").append(couponId);
        sb.append(", feifanMoneyNum=").append(feifanMoneyNum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}