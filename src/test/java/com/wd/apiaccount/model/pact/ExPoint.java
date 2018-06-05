package com.wd.apiaccount.model.pact;

public class ExPoint {
	
	String merNo = null;
	String exCode = null;
	String amt = null;
	
	public ExPoint(String merNo, String exCode, String amt) {
		this.merNo = merNo;
		this.exCode = exCode;
		this.amt = amt;
	}

	public String getMerNo() {
		return merNo;
	}

	public void setMerNo(String merNo) {
		this.merNo = merNo;
	}

	public String getExCode() {
		return exCode;
	}

	public void setExCode(String exCode) {
		this.exCode = exCode;
	}

	public String getAmt() {
		return amt;
	}

	public void setAmt(String amt) {
		this.amt = amt;
	}
	
}