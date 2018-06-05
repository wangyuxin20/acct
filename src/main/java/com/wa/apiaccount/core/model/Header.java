package com.wa.apiaccount.core.model;

public class Header {
	 //如果报文头传入则是强制
	private String tranType;
	private String tranCode;
	private Integer clusterId;

	private String requestId;
	private String requestIp;
	private String requestSysId;
	private String requestTime;
	private String requestTimespan;
	private String requestNote;
	private String requestCode;
	
	public String getRequestId() {
		return requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestIp() {
		return requestIp;
	}
	public void setRequestIp(String requestIp) {
		this.requestIp = requestIp;
	}
	public String getRequestSysId() {
		return requestSysId;
	}
	public void setRequestSysId(String requestSysId) {
		this.requestSysId = requestSysId;
	}
	public String getRequestTime() {
		return requestTime;
	}
	public void setRequestTime(String requestTime) {
		this.requestTime = requestTime;
	}
	public String getRequestTimespan() {
		return requestTimespan;
	}
	public void setRequestTimespan(String requestTimespan) {
		this.requestTimespan = requestTimespan;
	}
	public String getRequestNote() {
		return requestNote;
	}
	public void setRequestNote(String requestNote) {
		this.requestNote = requestNote;
	}
	public String getTranCode() {
		return tranCode;
	}
	public void setTranCode(String tranCode) {
		this.tranCode = tranCode;
	}
	public String getTranType() {
		return tranType;
	}
	public void setTranType(String tranType) {
		this.tranType = tranType;
	}
	public Integer getClusterId() {
		return clusterId;
	}
	public void setClusterId(Integer clusterId) {
		this.clusterId = clusterId;
	}
	public String getRequestCode() {
		return requestCode;
	}
	public void setRequestCode(String requestCode) {
		this.requestCode = requestCode;
	}
	
}
