package com.wd.apiaccount.model;

import com.alibaba.fastjson.JSON;
import com.wa.apiaccount.util.AESUtil;

public class QueryBalance {
	
	String userNo = "SH00000193";
	String userType = "2";
	String currNo = "FFB";
	String acctTypeNo = null;
	String exp = null;


	public static void main(String[] args) {
		Test2 test = new Test2();

		QueryBalance r = new QueryBalance();
		String json = JSON.toJSONString(r);
		test.setJson(json);
		System.out.println("加密前 ---> " + JSON.toJSONString(test));
		
		test.setJson(AESUtil.encrypt(json, AESUtil.PASSWORD));		// 加密
		System.out.println("加密后 ---> ");
		System.out.println(JSON.toJSONString(test));
		
		//解密
		json = new String(AESUtil.decrypt(test.getJson(), AESUtil.PASSWORD));
		System.out.println("通过解密 ---> " + json);
	}


	public String getUserNo() {
		return userNo;
	}


	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}


	public String getUserType() {
		return userType;
	}


	public void setUserType(String userType) {
		this.userType = userType;
	}


	public String getCurrNo() {
		return currNo;
	}


	public void setCurrNo(String currNo) {
		this.currNo = currNo;
	}


	public String getAcctTypeNo() {
		return acctTypeNo;
	}


	public void setAcctTypeNo(String acctTypeNo) {
		this.acctTypeNo = acctTypeNo;
	}


	public String getExp() {
		return exp;
	}


	public void setExp(String exp) {
		this.exp = exp;
	}
	

}



class Test2 {
	
	private String json;

	public String getJson() {
		return json;
	}

	public void setJson(String json) {
		this.json = json;
	}
	
	

}

