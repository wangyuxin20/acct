package com.wd.apiaccount.model;

import com.alibaba.fastjson.JSON;
import com.wa.apiaccount.util.AESUtil;
import com.wa.apiaccount.util.SHAUtil;

public class Settle3016 {

	String tsfUserNo = null;
	String settleStartDate = null;
	String settleEndDate = null;
	String currNo = null;
	String amt = null;
	String feeAmt = null;
	String settleAmt = null;
	String goodsNum = null;
	String operator = null;
	String ofsBalDir = null;
	String rpType = null;
	String exType = null;
	Long[] settleBillIds = null;

	public static void main(String[] args) {

		Test test = new Test();
		Settle3016 r = new Settle3016();
		r.setTsfUserNo("SH00000259");
		r.setSettleStartDate("20180320");
		r.setSettleEndDate("20180328");
		r.setCurrNo("FFB");
		r.setAmt("20.00");
		r.setFeeAmt("0");
		r.setSettleAmt("20.00");
		r.setGoodsNum("2.00");
		r.setOperator("admin");
		r.setOfsBalDir("0"); // 不轧差
		r.setRpType("1");
		r.setExType("KQ");
		r.setSettleBillIds(new Long[] { 206L });

		String body = JSON.toJSONString(r);
		test.setBody(body);
		test.setSign("");
		System.out.println("加密前 ---> " + JSON.toJSONString(test));

		test.setSign(SHAUtil.signSHA256(body));
		test.setBody(AESUtil.encrypt(body, AESUtil.PASSWORD)); // 加密
		System.out.println("加密后 ---> ");
		System.out.println(JSON.toJSONString(test));

		// 解密
		body = new String(AESUtil.decrypt(test.getBody(), AESUtil.PASSWORD));
		test.setBody(body);
		if (SHAUtil.signSHA256(body).equals(test.getSign())) {
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

	public String getSettleStartDate() {
		return settleStartDate;
	}

	public void setSettleStartDate(String settleStartDate) {
		this.settleStartDate = settleStartDate;
	}

	public String getSettleEndDate() {
		return settleEndDate;
	}

	public void setSettleEndDate(String settleEndDate) {
		this.settleEndDate = settleEndDate;
	}

	public String getCurrNo() {
		return currNo;
	}

	public void setCurrNo(String currNo) {
		this.currNo = currNo;
	}

	public String getAmt() {
		return amt;
	}

	public void setAmt(String amt) {
		this.amt = amt;
	}

	public String getFeeAmt() {
		return feeAmt;
	}

	public void setFeeAmt(String feeAmt) {
		this.feeAmt = feeAmt;
	}

	public String getSettleAmt() {
		return settleAmt;
	}

	public void setSettleAmt(String settleAmt) {
		this.settleAmt = settleAmt;
	}

	public String getGoodsNum() {
		return goodsNum;
	}

	public void setGoodsNum(String goodsNum) {
		this.goodsNum = goodsNum;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getOfsBalDir() {
		return ofsBalDir;
	}

	public void setOfsBalDir(String ofsBalDir) {
		this.ofsBalDir = ofsBalDir;
	}

	public String getRpType() {
		return rpType;
	}

	public void setRpType(String rpType) {
		this.rpType = rpType;
	}

	public Long[] getSettleBillIds() {
		return settleBillIds;
	}

	public void setSettleBillIds(Long[] settleBillIds) {
		this.settleBillIds = settleBillIds;
	}

	public String getExType() {
		return exType;
	}

	public void setExType(String exType) {
		this.exType = exType;
	}

}