package com.wd.apiaccount.model;

import com.alibaba.fastjson.JSON;
import com.wa.apiaccount.util.AESUtil;
import com.wa.apiaccount.util.SHAUtil;

public class Kq2046 {
	String tsfUserNo = "13482177883aaaabbbbcccc";
	String oppUserNo = "SH00000234";
	String oppUserName = "一个有良心的商户";
	String exCode = "KQ000T2046";
	String exName = "卡卷111";
	String exNum = "1000";  //售卖数量
	String settleUnitPrice = "1.00";  //结算单价
	String allowancePer = "0";  //补贴比率
	String currNo = "FFB";
	String unfrzAmt = "1000";
	String dctAmt = "100";
	String frzFlowId = "82";
	String note = "成交一张卡卷";
	
	public static void main(String[] args) {
		
		Test test = new Test();
		Kq2046 r = new Kq2046();
		
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
	
	
	public String getDctAmt() {
		return dctAmt;
	}
	public void setDctAmt(String dctAmt) {
		this.dctAmt = dctAmt;
	}
	public String getTsfUserNo() {
		return tsfUserNo;
	}
	public void setTsfUserNo(String tsfUserNo) {
		this.tsfUserNo = tsfUserNo;
	}
	public String getOppUserNo() {
		return oppUserNo;
	}
	public void setOppUserNo(String oppUserNo) {
		this.oppUserNo = oppUserNo;
	}
	public String getOppUserName() {
		return oppUserName;
	}
	public void setOppUserName(String oppUserName) {
		this.oppUserName = oppUserName;
	}
	public String getExCode() {
		return exCode;
	}
	public void setExCode(String exCode) {
		this.exCode = exCode;
	}
	public String getExName() {
		return exName;
	}
	public void setExName(String exName) {
		this.exName = exName;
	}
	public String getExNum() {
		return exNum;
	}
	public void setExNum(String exNum) {
		this.exNum = exNum;
	}
	public String getSettleUnitPrice() {
		return settleUnitPrice;
	}
	public void setSettleUnitPrice(String settleUnitPrice) {
		this.settleUnitPrice = settleUnitPrice;
	}
	public String getAllowancePer() {
		return allowancePer;
	}
	public void setAllowancePer(String allowancePer) {
		this.allowancePer = allowancePer;
	}
	public String getCurrNo() {
		return currNo;
	}
	public void setCurrNo(String currNo) {
		this.currNo = currNo;
	}
	public String getUnfrzAmt() {
		return unfrzAmt;
	}
	public void setUnfrzAmt(String unfrzAmt) {
		this.unfrzAmt = unfrzAmt;
	}
	public String getFrzFlowId() {
		return frzFlowId;
	}
	public void setFrzFlowId(String frzFlowId) {
		this.frzFlowId = frzFlowId;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	

}
