package com.wd.apiaccount.model;

import com.alibaba.fastjson.JSON;
import com.wa.apiaccount.util.AESUtil;
import com.wa.apiaccount.util.SHAUtil;

public class Settle3026 {
	
	String tsfUserNo = null;
	String settleId = null;
	String payChnl = null;
	String operator = null;
	String rpType = null;
	String drSettleId = null;
	
	
	public static void main(String[] args) {
		
		Test test = new Test();
		Settle3026 r = new Settle3026();
		
		r.setTsfUserNo("SH00000259");
		r.setSettleId("2");
		r.setPayChnl("1");
		r.setOperator("admin");
		r.setRpType("1"); //应付
		r.setDrSettleId("T1234567890876543");
		
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
	public String getSettleId() {
		return settleId;
	}
	public void setSettleId(String settleId) {
		this.settleId = settleId;
	}
	public String getPayChnl() {
		return payChnl;
	}
	public void setPayChnl(String payChnl) {
		this.payChnl = payChnl;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public String getRpType() {
		return rpType;
	}
	public void setRpType(String rpType) {
		this.rpType = rpType;
	}
	public String getDrSettleId() {
		return drSettleId;
	}
	public void setDrSettleId(String drSettleId) {
		this.drSettleId = drSettleId;
	}
	
}
