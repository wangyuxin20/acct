package com.wd.apiaccount.model;

import com.alibaba.fastjson.JSON;
import com.wa.apiaccount.util.AESUtil;
import com.wa.apiaccount.util.SHAUtil;

public class QueryFlowByNumber {
	
	String number = "1000";
	String sysId = "1234";
	String requestIp = "127.0.0.1";
	
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getSysId() {
		return sysId;
	}
	public void setSysId(String sysId) {
		this.sysId = sysId;
	}
	public String getRequestIp() {
		return requestIp;
	}
	public void setRequestIp(String requestIp) {
		this.requestIp = requestIp;
	}
	
	
	

	public static void main(String[] args) {
		
		QueryFlowByNumber r = new QueryFlowByNumber();
		
		String body = JSON.toJSONString(r);

		System.out.println("加密前 ---> " + JSON.toJSONString(body));
		System.out.println("加密后 ---> ");
		String json = SHAUtil.signSHA256(body);
		System.out.println("json=" + json);
		
		//解密
		body = AESUtil.decrypt(json, AESUtil.PASSWORD);
		System.out.println("解密 ---> " + body);
	}

}
