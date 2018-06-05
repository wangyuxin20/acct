package com.wd.apiaccount.model;

import com.alibaba.fastjson.JSON;
import com.wa.apiaccount.util.AESUtil;
import com.wa.apiaccount.util.SHAUtil;


public class FZ1015 {
	String tsfUserNo = "13002622460vlY6NFvQtZjaj4MS75xB";
	String currNo = "FFB";
	String frzAmt = "1000";
	String note = "测试1";

	public static void main(String[] args) {
		Test test = new Test();
		FZ1015 r = new FZ1015();
		
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
	public String getTsfUserNo() {
		return tsfUserNo;
	}
	public void setTsfUserNo(String tsfUserNo) {
		this.tsfUserNo = tsfUserNo;
	}
	public String getFrzAmt() {
		return frzAmt;
	}
	public void setFrzAmt(String frzAmt) {
		this.frzAmt = frzAmt;
	}
	
	
}
