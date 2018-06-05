package com.wd.apiaccount.model;

import com.alibaba.fastjson.JSON;
import com.wa.apiaccount.util.AESUtil;
import com.wa.apiaccount.util.SHAUtil;

public class Mk7101 {

	
	String mktName = "测试ABC1141-1211";
	String mktAmt = "99800000.00";
	String mktSubAcctName = "ABC1141-1211";
	String ffbDueTime = "20181221235959";
	String mktDateStart = "20170730111111";
	String mktDateEnd = "20181220111111";
	
	String amtLimit;
	String minInvlLimit;
	String joinNumLimit;
	String acctType;
	
	
	
	
	public static void main(String[] args) {
		
		Test test = new Test();
		Mk7101 r = new Mk7101();
		
		String body = JSON.toJSONString(r);
		
		test.setBody(body);
		test.setSign("");
		System.out.println("加密前 ---> " + JSON.toJSONString(test));
		
		test.setSign(SHAUtil.signSHA256(body));
		test.setBody(AESUtil.encrypt(body, AESUtil.PASSWORD));		// 加密
		System.out.println("加密后 ---> ");
		System.out.println(JSON.toJSONString(test));
		
		//解密
		body = new String(AESUtil.decrypt(test.getBody(), AESUtil.PASSWORD));
		test.setBody(body);
		if(SHAUtil.signSHA256(body).equals(test.getSign())){
			test.setSign("");
			System.out.println("效验通过解密 ---> " + JSON.toJSONString(test));
		} else {
			System.out.println("签名效验失败");
		}
	}
	
	
	public String getMktName() {
		return mktName;
	}
	public void setMktName(String mktName) {
		this.mktName = mktName;
	}
	public String getMktAmt() {
		return mktAmt;
	}
	public void setMktAmt(String mktAmt) {
		this.mktAmt = mktAmt;
	}
	public String getMktSubAcctName() {
		return mktSubAcctName;
	}
	public void setMktSubAcctName(String mktSubAcctName) {
		this.mktSubAcctName = mktSubAcctName;
	}
	public String getFfbDueTime() {
		return ffbDueTime;
	}
	public void setFfbDueTime(String ffbDueTime) {
		this.ffbDueTime = ffbDueTime;
	}
	public String getMktDateStart() {
		return mktDateStart;
	}
	public void setMktDateStart(String mktDateStart) {
		this.mktDateStart = mktDateStart;
	}
	public String getMktDateEnd() {
		return mktDateEnd;
	}
	public void setMktDateEnd(String mktDateEnd) {
		this.mktDateEnd = mktDateEnd;
	}
	public String getAmtLimit() {
		return amtLimit;
	}
	public void setAmtLimit(String amtLimit) {
		this.amtLimit = amtLimit;
	}
	public String getMinInvlLimit() {
		return minInvlLimit;
	}
	public void setMinInvlLimit(String minInvlLimit) {
		this.minInvlLimit = minInvlLimit;
	}
	public String getJoinNumLimit() {
		return joinNumLimit;
	}
	public void setJoinNumLimit(String joinNumLimit) {
		this.joinNumLimit = joinNumLimit;
	}
	public String getAcctType() {
		return acctType;
	}
	public void setAcctType(String acctType) {
		this.acctType = acctType;
	}

	

}
