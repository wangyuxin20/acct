package com.wd.apiaccount.model;

import com.alibaba.fastjson.JSON;
import com.wa.apiaccount.util.AESUtil;
import com.wa.apiaccount.util.SHAUtil;

//前置交易：1015, 2011
public class Kq2036 {
	String tsfUserNo = "123456789";
	String oppUserNo = "987654321";
	String exCode = "Kq996";
	String exName = "转让购卡券";
	String exNum = "1000";
	String exPrice = "1.0";
	String currNo = "FFB";
	String unfrzAmt = "1000.00";
	String frzFlowId = "5";
	String note = "测试一个C2C——2036交易";
	
	
	public static void main(String[] args) {
		
		Test test = new Test();
		Kq2036 r = new Kq2036();
		
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
	public String getExPrice() {
		return exPrice;
	}
	public void setExPrice(String exPrice) {
		this.exPrice = exPrice;
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
