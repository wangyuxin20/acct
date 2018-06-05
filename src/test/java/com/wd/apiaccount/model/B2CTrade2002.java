package com.wd.apiaccount.model;

public class B2CTrade2002 {
	String tsfUserNo = "123456789";  //用户号
	String oppUserNo = "S0000000000000001"; //商户号
	String oppUserName = "商户测试用001";
	String exCode = "KQ001";
	String exName = "XX卡卷1";
	String currNo = "FFB";
	String amt = "100.00";
	String note = "买一张XXX劵";
	
	
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
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}

	
}
