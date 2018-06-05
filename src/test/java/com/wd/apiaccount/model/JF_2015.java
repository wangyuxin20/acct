package com.wd.apiaccount.model;

import com.alibaba.fastjson.JSON;
import com.wa.apiaccount.util.AESUtil;
import com.wa.apiaccount.util.SHAUtil;

public class JF_2015 {
	
	String tsfUserNo = "SH00000181";
	String tsfUserName = "一个良心商户181";
	String oppUserNo = "13035693661YGgj8f4CJsqmwGG1JX7v";
	String exNum = "100";
	String exFeeNum = "1";
	String exCode = "KQ00000214";
	String exName = "积分214";
	String number = "484847275939843";
	String ratio = "0.11";
	String currNo = "FFB";
	String note = "成交一笔积分";
	String unfrzAmt = "1000.00";

	public static void main(String[] args) {
		
		Test test = new Test();
		JF_2015 r = new JF_2015();
		
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
	public String getTsfUserName() {
		return tsfUserName;
	}
	public void setTsfUserName(String tsfUserName) {
		this.tsfUserName = tsfUserName;
	}
	public String getOppUserNo() {
		return oppUserNo;
	}
	public void setOppUserNo(String oppUserNo) {
		this.oppUserNo = oppUserNo;
	}
	public String getExNum() {
		return exNum;
	}
	public void setExNum(String exNum) {
		this.exNum = exNum;
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
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getRatio() {
		return ratio;
	}
	public void setRatio(String ratio) {
		this.ratio = ratio;
	}
	public String getCurrNo() {
		return currNo;
	}
	public void setCurrNo(String currNo) {
		this.currNo = currNo;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getUnfrzAmt() {
		return unfrzAmt;
	}
	public void setUnfrzAmt(String unfrzAmt) {
		this.unfrzAmt = unfrzAmt;
	}
	public String getExFeeNum() {
		return exFeeNum;
	}
	public void setExFeeNum(String exFeeNum) {
		this.exFeeNum = exFeeNum;
	}

}
