package com.wd.apiaccount.model.domain;

import java.math.BigDecimal;
import java.util.Date;

import com.wd.apiaccount.model.Base;

/**
 * @author 
 */
public class PayLog extends Base {
    /**
     * 支付流水单号
     */
    private String payNo;

    /**
     * 支付宝交易号，微信交易号，iap交易号
     */
    private String tradeNo;

    /**
     * 支付金额
     */
    private BigDecimal payAmount;

    /**
     * 支付状态   0：初始状态（支付中） 1：支付成功   2：交易关闭   3：支付失败    4：支付结束    5：已撤销（微信刷卡支付）  6：退款    0，1，2，4，6为支付宝使用    0，1，3为苹果使用     0，1，2，3，5，6为微信使用
     */
    private Integer payStatus;

    /**
     * 用户id
     */
    private String userId;

    /**
     * 用户ip
     */
    private String userIp;

    /**
     * 支付方式    1：微信支付   2：支付宝   3：iap
     */
    private Integer payMethod;

    /**
     * 商品的标题/交易标题/订单标题/订单关键字等
     */
    private String subject;

    /**
     * 对一笔交易的具体描述信息
     */
    private String body;

    /**
     * 购买商品数量（目前就是充值的福豆数量）
     */
    private Integer productCount;

    /**
     * 商品id，目前iap会使用
     */
    private String productId;

    /**
     * 交易类型  1：ios   2：h5   3: android
     */
    private Integer tradeType;

    /**
     * 商品类型   0：虚拟类商品  1：实物类商品
     */
    private Integer productType;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 买家付款时间
     */
    private Date payTime;

    /**
     * 买家支付宝用户号
     */
    private String buyerId;

    /**
     * 买家支付宝账号
     */
    private String buyerLogonId;

    private String appId;

    private String mchId;

    private String deviceInfo;

    private BigDecimal fee;

    private BigDecimal rate;

    private Date timeEnd;

    private String transactionId;

    private static final long serialVersionUID = 1L;

    public String getPayNo() {
        return payNo;
    }

    public void setPayNo(String payNo) {
        this.payNo = payNo;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public BigDecimal getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    public Integer getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserIp() {
        return userIp;
    }

    public void setUserIp(String userIp) {
        this.userIp = userIp;
    }

    public Integer getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(Integer payMethod) {
        this.payMethod = payMethod;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Integer getProductCount() {
        return productCount;
    }

    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Integer getTradeType() {
        return tradeType;
    }

    public void setTradeType(Integer tradeType) {
        this.tradeType = tradeType;
    }

    public Integer getProductType() {
        return productType;
    }

    public void setProductType(Integer productType) {
        this.productType = productType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public String getBuyerLogonId() {
        return buyerLogonId;
    }

    public void setBuyerLogonId(String buyerLogonId) {
        this.buyerLogonId = buyerLogonId;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getMchId() {
        return mchId;
    }

    public void setMchId(String mchId) {
        this.mchId = mchId;
    }

    public String getDeviceInfo() {
        return deviceInfo;
    }

    public void setDeviceInfo(String deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public Date getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(Date timeEnd) {
        this.timeEnd = timeEnd;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
}