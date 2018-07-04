package com.wa.apiaccount.core.model.domain;

import java.io.Serializable;
import java.util.Date;

public class SettlePact implements Serializable {
    private Integer id;

    private String agreementNo;

    private String agreementCode;

    private String agreementCategory;

    private String merchantNo;

    private String merchantName;

    private Date agreementTime;

    private Date validateStart;

    private Date validateEnd;

    private String agreementType;

    private String interfaceType;

    private String accountType;

    private String commissionRate;

    private String bankNo;

    private String bankName;

    private String bankAccountName;

    private String subBankName;

    private String easymoneyAccountNo;

    private String easymoneyAccountName;

    private String settleType;

    private Integer settleDay;

    private Date updateTime;

    private String bankCity;

    private String businessType;

    private String nettingType;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAgreementNo() {
        return agreementNo;
    }

    public void setAgreementNo(String agreementNo) {
        this.agreementNo = agreementNo == null ? null : agreementNo.trim();
    }

    public String getAgreementCode() {
        return agreementCode;
    }

    public void setAgreementCode(String agreementCode) {
        this.agreementCode = agreementCode == null ? null : agreementCode.trim();
    }

    public String getAgreementCategory() {
        return agreementCategory;
    }

    public void setAgreementCategory(String agreementCategory) {
        this.agreementCategory = agreementCategory == null ? null : agreementCategory.trim();
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo == null ? null : merchantNo.trim();
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName == null ? null : merchantName.trim();
    }

    public Date getAgreementTime() {
        return agreementTime;
    }

    public void setAgreementTime(Date agreementTime) {
        this.agreementTime = agreementTime;
    }

    public Date getValidateStart() {
        return validateStart;
    }

    public void setValidateStart(Date validateStart) {
        this.validateStart = validateStart;
    }

    public Date getValidateEnd() {
        return validateEnd;
    }

    public void setValidateEnd(Date validateEnd) {
        this.validateEnd = validateEnd;
    }

    public String getAgreementType() {
        return agreementType;
    }

    public void setAgreementType(String agreementType) {
        this.agreementType = agreementType == null ? null : agreementType.trim();
    }

    public String getInterfaceType() {
        return interfaceType;
    }

    public void setInterfaceType(String interfaceType) {
        this.interfaceType = interfaceType == null ? null : interfaceType.trim();
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType == null ? null : accountType.trim();
    }

    public String getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(String commissionRate) {
        this.commissionRate = commissionRate == null ? null : commissionRate.trim();
    }

    public String getBankNo() {
        return bankNo;
    }

    public void setBankNo(String bankNo) {
        this.bankNo = bankNo == null ? null : bankNo.trim();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public String getBankAccountName() {
        return bankAccountName;
    }

    public void setBankAccountName(String bankAccountName) {
        this.bankAccountName = bankAccountName == null ? null : bankAccountName.trim();
    }

    public String getSubBankName() {
        return subBankName;
    }

    public void setSubBankName(String subBankName) {
        this.subBankName = subBankName == null ? null : subBankName.trim();
    }

    public String getEasymoneyAccountNo() {
        return easymoneyAccountNo;
    }

    public void setEasymoneyAccountNo(String easymoneyAccountNo) {
        this.easymoneyAccountNo = easymoneyAccountNo == null ? null : easymoneyAccountNo.trim();
    }

    public String getEasymoneyAccountName() {
        return easymoneyAccountName;
    }

    public void setEasymoneyAccountName(String easymoneyAccountName) {
        this.easymoneyAccountName = easymoneyAccountName == null ? null : easymoneyAccountName.trim();
    }

    public String getSettleType() {
        return settleType;
    }

    public void setSettleType(String settleType) {
        this.settleType = settleType == null ? null : settleType.trim();
    }

    public Integer getSettleDay() {
        return settleDay;
    }

    public void setSettleDay(Integer settleDay) {
        this.settleDay = settleDay;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getBankCity() {
        return bankCity;
    }

    public void setBankCity(String bankCity) {
        this.bankCity = bankCity == null ? null : bankCity.trim();
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType == null ? null : businessType.trim();
    }

    public String getNettingType() {
        return nettingType;
    }

    public void setNettingType(String nettingType) {
        this.nettingType = nettingType == null ? null : nettingType.trim();
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
        SettlePact other = (SettlePact) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAgreementNo() == null ? other.getAgreementNo() == null : this.getAgreementNo().equals(other.getAgreementNo()))
            && (this.getAgreementCode() == null ? other.getAgreementCode() == null : this.getAgreementCode().equals(other.getAgreementCode()))
            && (this.getAgreementCategory() == null ? other.getAgreementCategory() == null : this.getAgreementCategory().equals(other.getAgreementCategory()))
            && (this.getMerchantNo() == null ? other.getMerchantNo() == null : this.getMerchantNo().equals(other.getMerchantNo()))
            && (this.getMerchantName() == null ? other.getMerchantName() == null : this.getMerchantName().equals(other.getMerchantName()))
            && (this.getAgreementTime() == null ? other.getAgreementTime() == null : this.getAgreementTime().equals(other.getAgreementTime()))
            && (this.getValidateStart() == null ? other.getValidateStart() == null : this.getValidateStart().equals(other.getValidateStart()))
            && (this.getValidateEnd() == null ? other.getValidateEnd() == null : this.getValidateEnd().equals(other.getValidateEnd()))
            && (this.getAgreementType() == null ? other.getAgreementType() == null : this.getAgreementType().equals(other.getAgreementType()))
            && (this.getInterfaceType() == null ? other.getInterfaceType() == null : this.getInterfaceType().equals(other.getInterfaceType()))
            && (this.getAccountType() == null ? other.getAccountType() == null : this.getAccountType().equals(other.getAccountType()))
            && (this.getCommissionRate() == null ? other.getCommissionRate() == null : this.getCommissionRate().equals(other.getCommissionRate()))
            && (this.getBankNo() == null ? other.getBankNo() == null : this.getBankNo().equals(other.getBankNo()))
            && (this.getBankName() == null ? other.getBankName() == null : this.getBankName().equals(other.getBankName()))
            && (this.getBankAccountName() == null ? other.getBankAccountName() == null : this.getBankAccountName().equals(other.getBankAccountName()))
            && (this.getSubBankName() == null ? other.getSubBankName() == null : this.getSubBankName().equals(other.getSubBankName()))
            && (this.getEasymoneyAccountNo() == null ? other.getEasymoneyAccountNo() == null : this.getEasymoneyAccountNo().equals(other.getEasymoneyAccountNo()))
            && (this.getEasymoneyAccountName() == null ? other.getEasymoneyAccountName() == null : this.getEasymoneyAccountName().equals(other.getEasymoneyAccountName()))
            && (this.getSettleType() == null ? other.getSettleType() == null : this.getSettleType().equals(other.getSettleType()))
            && (this.getSettleDay() == null ? other.getSettleDay() == null : this.getSettleDay().equals(other.getSettleDay()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getBankCity() == null ? other.getBankCity() == null : this.getBankCity().equals(other.getBankCity()))
            && (this.getBusinessType() == null ? other.getBusinessType() == null : this.getBusinessType().equals(other.getBusinessType()))
            && (this.getNettingType() == null ? other.getNettingType() == null : this.getNettingType().equals(other.getNettingType()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAgreementNo() == null) ? 0 : getAgreementNo().hashCode());
        result = prime * result + ((getAgreementCode() == null) ? 0 : getAgreementCode().hashCode());
        result = prime * result + ((getAgreementCategory() == null) ? 0 : getAgreementCategory().hashCode());
        result = prime * result + ((getMerchantNo() == null) ? 0 : getMerchantNo().hashCode());
        result = prime * result + ((getMerchantName() == null) ? 0 : getMerchantName().hashCode());
        result = prime * result + ((getAgreementTime() == null) ? 0 : getAgreementTime().hashCode());
        result = prime * result + ((getValidateStart() == null) ? 0 : getValidateStart().hashCode());
        result = prime * result + ((getValidateEnd() == null) ? 0 : getValidateEnd().hashCode());
        result = prime * result + ((getAgreementType() == null) ? 0 : getAgreementType().hashCode());
        result = prime * result + ((getInterfaceType() == null) ? 0 : getInterfaceType().hashCode());
        result = prime * result + ((getAccountType() == null) ? 0 : getAccountType().hashCode());
        result = prime * result + ((getCommissionRate() == null) ? 0 : getCommissionRate().hashCode());
        result = prime * result + ((getBankNo() == null) ? 0 : getBankNo().hashCode());
        result = prime * result + ((getBankName() == null) ? 0 : getBankName().hashCode());
        result = prime * result + ((getBankAccountName() == null) ? 0 : getBankAccountName().hashCode());
        result = prime * result + ((getSubBankName() == null) ? 0 : getSubBankName().hashCode());
        result = prime * result + ((getEasymoneyAccountNo() == null) ? 0 : getEasymoneyAccountNo().hashCode());
        result = prime * result + ((getEasymoneyAccountName() == null) ? 0 : getEasymoneyAccountName().hashCode());
        result = prime * result + ((getSettleType() == null) ? 0 : getSettleType().hashCode());
        result = prime * result + ((getSettleDay() == null) ? 0 : getSettleDay().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getBankCity() == null) ? 0 : getBankCity().hashCode());
        result = prime * result + ((getBusinessType() == null) ? 0 : getBusinessType().hashCode());
        result = prime * result + ((getNettingType() == null) ? 0 : getNettingType().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", agreementNo=").append(agreementNo);
        sb.append(", agreementCode=").append(agreementCode);
        sb.append(", agreementCategory=").append(agreementCategory);
        sb.append(", merchantNo=").append(merchantNo);
        sb.append(", merchantName=").append(merchantName);
        sb.append(", agreementTime=").append(agreementTime);
        sb.append(", validateStart=").append(validateStart);
        sb.append(", validateEnd=").append(validateEnd);
        sb.append(", agreementType=").append(agreementType);
        sb.append(", interfaceType=").append(interfaceType);
        sb.append(", accountType=").append(accountType);
        sb.append(", commissionRate=").append(commissionRate);
        sb.append(", bankNo=").append(bankNo);
        sb.append(", bankName=").append(bankName);
        sb.append(", bankAccountName=").append(bankAccountName);
        sb.append(", subBankName=").append(subBankName);
        sb.append(", easymoneyAccountNo=").append(easymoneyAccountNo);
        sb.append(", easymoneyAccountName=").append(easymoneyAccountName);
        sb.append(", settleType=").append(settleType);
        sb.append(", settleDay=").append(settleDay);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", bankCity=").append(bankCity);
        sb.append(", businessType=").append(businessType);
        sb.append(", nettingType=").append(nettingType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}