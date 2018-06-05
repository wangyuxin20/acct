package com.wd.apiaccount.model;

import com.alibaba.fastjson.JSON;
import com.wa.apiaccount.util.AESUtil;
import com.wa.apiaccount.util.SHAUtil;

public class JF_2013 {
	String tsfUserNo = "13035693661YGgj8f4CJsqmwGG1JX7v";
	String oppUserNo = "37";
	String oppUserName = "积分B2C商户编号191";
	String exNum = "100";
	String exCode = "KQ00000214";
	String exName = "积分214";
	String note = "成交一笔B2C积分";
	String number = "1982763473283746";
	String ratio = "0";
	String amt = "1000.00";

	public static void main(String[] args) {
		Test test = new Test();
		JF_2013 r = new JF_2013();
		
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

	public String getOppUserName() {
		return oppUserName;
	}

	public void setOppUserName(String oppUserName) {
		this.oppUserName = oppUserName;
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

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
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

	public String getAmt() {
		return amt;
	}

	public void setAmt(String amt) {
		this.amt = amt;
	}
	

}
