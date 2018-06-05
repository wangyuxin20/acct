package com.wd.apiaccount.model.pact;

import com.alibaba.fastjson.JSON;
import com.wa.apiaccount.core.util.AesEncodeUtil;
import com.wa.apiaccount.util.SHAUtil;
import com.wd.apiaccount.model.Test;

public class SettlePactReq {

	private String agreementNo;               //合同流水号
	private String agreementCode;             //合同编号
	private String merchantNo;                //商户号
	private String merchantName;              //商户名称
	private String agreementTime;             //签订时间
	private String validateStart;             //有效开始时间(YYYYMMDD)
	private String validateEnd;               //有效结束时间
	private String agreementType;             //合同类型[0:卡券代销模式,1:卡券平台模式][2:积分兑入兑出模式，3:积分兑入模式，4:积分兑出模式]
	private String interfaceType;             //是否调用商户接口[0:是,1:否,]
	private String accountType;               //账户类型[0:银行账户,1:快钱账户,]
	private String commissionRate;            //佣金费率
	private String bankNo;                    //×
	private String bankName;                  //×
	private String bankCity;                  //×
	private String bankAccountName;           //×
	private String subBankName;               //×
	private String easymoneyAccountNo;        //快钱账户账号
	private String easymoneyAccountName;      //×
	private String settleType;                //结算周期[0:T+1,1:按月结算]
	private String settleDay;                 //如果结算周期T+1则是0，如果是按月结算则是指定日，不能大于31
	private String operator;                  //操作人
    private String settleNetting;             //是否轧差（缺省是不轧差：0，轧差：1）
    
    
    
    


	public static void main(String[] args) {
		Test test = new Test();
		SettlePactReq p = new SettlePactReq();
		p.setAgreementNo("A001001001");
		p.setAgreementCode("C10101010");
		p.setMerchantNo("SH00000234");
		p.setMerchantName("微信现金支付商户");
		p.setAgreementTime("2017-10-19 00:00:00");
		p.setValidateStart("20180101");
		p.setValidateEnd("20180305");
		p.setAgreementType("1");
		p.setInterfaceType("0");
		p.setAccountType("1");
		p.setCommissionRate("5");
//		p.setBankNo("");
//		p.setBankName(bankName);
//		p.setBankCity(bankCity);
//		p.setBankAccountName(bankAccountName);
//		p.setSubBankName(subBankName);
		p.setEasymoneyAccountNo("000000001");
//		p.setEasymoneyAccountName(easymoneyAccountName);
		p.setSettleType("1");
//		p.setSettleDay("18");
		p.setOperator("admin");
//		p.setSettleNetting("1");
		
		String body = JSON.toJSONString(p);
		test.setBody(body);
		test.setSign("");
		System.out.println("加密前 ---> " + JSON.toJSONString(test));
		
		//AesEncodeUtil.decrypt(push.getBody());
		
		
		
		test.setSign(SHAUtil.signSHA256(body));
//		test.setBody(AESUtil.encrypt(body, AESUtil.PASSWORD));		// 加密
		test.setBody(AesEncodeUtil.encrypt(body));
		System.out.println("加密后 ---> ");
		System.out.println(JSON.toJSONString(test));
		
		//解密
//		body = new String(AESUtil.decrypt(test.getBody(), AESUtil.PASSWORD));
		body = new String(AesEncodeUtil.decrypt(test.getBody()));
		test.setBody(body);
		if(SHAUtil.signSHA256(body).equals(test.getSign())){
			test.setSign("");
			System.out.println("效验通过解密 ---> " + JSON.toJSONString(test));
		} else {
			System.out.println("签名效验失败");
		}
	}
    
    
    
    
	public String getAgreementNo() {
		return agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}
	public String getAgreementCode() {
		return agreementCode;
	}
	public void setAgreementCode(String agreementCode) {
		this.agreementCode = agreementCode;
	}
	public String getMerchantNo() {
		return merchantNo;
	}
	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}
	public String getMerchantName() {
		return merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public String getAgreementTime() {
		return agreementTime;
	}
	public void setAgreementTime(String agreementTime) {
		this.agreementTime = agreementTime;
	}
	public String getValidateStart() {
		return validateStart;
	}
	public void setValidateStart(String validateStart) {
		this.validateStart = validateStart;
	}
	public String getValidateEnd() {
		return validateEnd;
	}
	public void setValidateEnd(String validateEnd) {
		this.validateEnd = validateEnd;
	}
	public String getAgreementType() {
		return agreementType;
	}
	public void setAgreementType(String agreementType) {
		this.agreementType = agreementType;
	}
	public String getInterfaceType() {
		return interfaceType;
	}
	public void setInterfaceType(String interfaceType) {
		this.interfaceType = interfaceType;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getCommissionRate() {
		return commissionRate;
	}
	public void setCommissionRate(String commissionRate) {
		this.commissionRate = commissionRate;
	}
	public String getBankNo() {
		return bankNo;
	}
	public void setBankNo(String bankNo) {
		this.bankNo = bankNo;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankCity() {
		return bankCity;
	}
	public void setBankCity(String bankCity) {
		this.bankCity = bankCity;
	}
	public String getBankAccountName() {
		return bankAccountName;
	}
	public void setBankAccountName(String bankAccountName) {
		this.bankAccountName = bankAccountName;
	}
	public String getSubBankName() {
		return subBankName;
	}
	public void setSubBankName(String subBankName) {
		this.subBankName = subBankName;
	}
	public String getEasymoneyAccountNo() {
		return easymoneyAccountNo;
	}
	public void setEasymoneyAccountNo(String easymoneyAccountNo) {
		this.easymoneyAccountNo = easymoneyAccountNo;
	}
	public String getEasymoneyAccountName() {
		return easymoneyAccountName;
	}
	public void setEasymoneyAccountName(String easymoneyAccountName) {
		this.easymoneyAccountName = easymoneyAccountName;
	}
	public String getSettleType() {
		return settleType;
	}
	public void setSettleType(String settleType) {
		this.settleType = settleType;
	}
	public String getSettleDay() {
		return settleDay;
	}
	public void setSettleDay(String settleDay) {
		this.settleDay = settleDay;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public String getSettleNetting() {
		return settleNetting;
	}
	public void setSettleNetting(String settleNetting) {
		this.settleNetting = settleNetting;
	}
    

}
