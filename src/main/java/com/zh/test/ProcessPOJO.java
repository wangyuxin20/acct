package com.zh.test;

import org.springframework.stereotype.Component;

@Component
public class ProcessPOJO {
	
	private String processNo;
	private String processName;
	private String result;


	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getProcessNo() {
		return processNo;
	}
	public void setProcessNo(String processNo) {
		this.processNo = processNo;
	}
	public String getProcessName() {
		return processName;
	}
	public void setProcessName(String processName) {
		this.processName = processName;
	}
	@Override
	public String toString() {
		return "ProcessPOJO [processNo=" + processNo + ", processName="
				+ processName + ", result=" + result + "]";
	}

}
