package com.wd.apiaccount.model;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.wa.apiaccount.util.AESUtil;
import com.wa.apiaccount.util.SHAUtil;

//2056_2156
public class CardJointly {
	
	private static String FRZ_FLOW_ID = "7";
	private static String STAGE = "0"; //是否预约（0：否，1：是）
	private static String CURR_NO_VALUE = "FFB";
	private static String UNFRZ_AMT = "1000";

	
	String frzFlowId;
	String tsfUserNo;
	String oppUserNo;
	String oppUserName;
	String currNo;
	String unfrzAmt;
	String stage;
	String channel;
	String number;
	String note;
	String enabled;
	String mktSeq;
	String mktAmt;
	String cardListSize;
	List<CardJointlyKq> cardList;
	
	

	public static void main(String[] args) {
		Test test = new Test();
		
		CardJointlyKq kq1 = new CardJointlyKq();
		kq1.setCoAssetId("1");
		kq1.setMerNo("AAA`11111");
		kq1.setMerName("联名卡券商户AAA");
		kq1.setExCode("KQ123123");
		kq1.setExName("123123卡券");
		kq1.setExNum("1");
		kq1.setExPrice("500");
		kq1.setSettleAmt("500");
		kq1.setSettleType("1");
		kq1.setTranCode("2026");
		
		CardJointlyKq kq2 = new CardJointlyKq();
		kq2.setCoAssetId("2");
		kq2.setMerNo("BBB`111111");
		kq2.setMerName("联名卡券商户BBB");
		kq2.setExCode("KQ234234");
		kq2.setExName("234234卡券");
		kq2.setExNum("2");
		kq2.setExPrice("250");
		kq2.setSettleAmt("500");
		kq2.setSettleType("2");
		kq2.setTranCode("2016");
		
		List<CardJointlyKq> cardList = new ArrayList<CardJointlyKq>();
		//非预约
		if("0".equals(STAGE)){
			cardList.add(kq1);
			cardList.add(kq2);			
		}
		
		CardJointly r = new CardJointly();
		r.setFrzFlowId(FRZ_FLOW_ID);
		r.setTsfUserNo("123456789");
		r.setOppUserNo("SH00000888");
		r.setOppUserName("联名卡合约商户");
		r.setCurrNo(CURR_NO_VALUE);
		r.setUnfrzAmt(UNFRZ_AMT);
		r.setStage(STAGE); /////////////////////////////////是否预约，1是，0否
		r.setChannel("1");
		r.setNumber("12345abcdefg");
		r.setNote("买入1张888商户的联名卡");
		r.setEnabled("2");
		r.setMktSeq("10");
		r.setMktAmt("10");
		r.setCardListSize("2");
		r.setCardList(cardList);
		
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
	
	
	public String getMktSeq() {
		return mktSeq;
	}
	public void setMktSeq(String mktSeq) {
		this.mktSeq = mktSeq;
	}
	public String getFrzFlowId() {
		return frzFlowId;
	}
	public void setFrzFlowId(String frzFlowId) {
		this.frzFlowId = frzFlowId;
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
	public String getStage() {
		return stage;
	}
	public void setStage(String stage) {
		this.stage = stage;
	}
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getEnabled() {
		return enabled;
	}
	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}
	public String getMktAmt() {
		return mktAmt;
	}
	public void setMktAmt(String mktAmt) {
		this.mktAmt = mktAmt;
	}
	public String getCardListSize() {
		return cardListSize;
	}
	public void setCardListSize(String cardListSize) {
		this.cardListSize = cardListSize;
	}
	public List<CardJointlyKq> getCardList() {
		return cardList;
	}
	public void setCardList(List<CardJointlyKq> cardList) {
		this.cardList = cardList;
	}
}
