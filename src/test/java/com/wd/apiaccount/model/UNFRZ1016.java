package com.wd.apiaccount.model;

import com.alibaba.fastjson.JSON;
import com.wa.apiaccount.util.AESUtil;
import com.wa.apiaccount.util.SHAUtil;

public class UNFRZ1016 {

	String tsfUserNo = "13035693661YGgj8f4CJsqmwGG1JX7v";
	String currNo = "FFB";
	String unfrzAmt = "1000.00";
	String frzFlowId = "4";
	String note = "解冻一笔交易撤销交易";
	
	public static void main(String[] args) {
		Test test = new Test();
		UNFRZ1016 r = new UNFRZ1016();
		

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
