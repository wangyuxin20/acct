package com.wd.apiaccount.model;

import com.alibaba.fastjson.JSON;
import com.wa.apiaccount.util.AESUtil;
import com.wa.apiaccount.util.SHAUtil;

public class Kq2158 {
	
	
	String amt = "1000";
	String userNo = "13482177883aaaabbbbcccc";
	String merNo = "SH010203";
	String merName = "AA有限公司";
	String exCode = "KQ0202921";
	String exName = "你好券券";
	String exPrice = "100";
	String exNum = "1";
	String kqId = "sd23dsvcx";
	String tranType = "2046";
	String note = "免费发放一张Ccc卡";



	public static void main(String[] args) {
		
		Test test = new Test();
		Kq2158 r = new Kq2158();
		
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



	public String getAmt() {
		return amt;
	}



	public void setAmt(String amt) {
		this.amt = amt;
	}



	public String getUserNo() {
		return userNo;
	}



	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}



	public String getMerNo() {
		return merNo;
	}



	public void setMerNo(String merNo) {
		this.merNo = merNo;
	}



	public String getMerName() {
		return merName;
	}



	public void setMerName(String merName) {
		this.merName = merName;
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



	public String getExPrice() {
		return exPrice;
	}



	public void setExPrice(String exPrice) {
		this.exPrice = exPrice;
	}



	public String getExNum() {
		return exNum;
	}



	public void setExNum(String exNum) {
		this.exNum = exNum;
	}



	public String getKqId() {
		return kqId;
	}



	public void setKqId(String kqId) {
		this.kqId = kqId;
	}



	public String getTranType() {
		return tranType;
	}



	public void setTranType(String tranType) {
		this.tranType = tranType;
	}



	public String getNote() {
		return note;
	}



	public void setNote(String note) {
		this.note = note;
	}

	
	
	
	
}
