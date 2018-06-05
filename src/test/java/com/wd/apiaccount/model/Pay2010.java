package com.wd.apiaccount.model;

import com.alibaba.fastjson.JSON;
import com.wa.apiaccount.util.AESUtil;
import com.wa.apiaccount.util.SHAUtil;

public class Pay2010 {
	String payId = "PAY92282332084892232";
	String userNo = "13035693661YGgj8f4CJsqmwGG1JX7v";
	String rmbAmt = "2000";
	String ffbAmt = "200000.00";
	String payNote = "福豆充值";

	public static void main(String[] args) {
		
		Test test = new Test();
		Pay2010 r = new Pay2010();
		
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
	
	
	public String getPayId() {
		return payId;
	}
	public void setPayId(String payId) {
		this.payId = payId;
	}
	public String getUserNo() {
		return userNo;
	}
	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}
	public String getRmbAmt() {
		return rmbAmt;
	}
	public void setRmbAmt(String rmbAmt) {
		this.rmbAmt = rmbAmt;
	}
	public String getFfbAmt() {
		return ffbAmt;
	}
	public void setFfbAmt(String ffbAmt) {
		this.ffbAmt = ffbAmt;
	}
	public String getPayNote() {
		return payNote;
	}
	public void setPayNote(String payNote) {
		this.payNote = payNote;
	}	
	
}
