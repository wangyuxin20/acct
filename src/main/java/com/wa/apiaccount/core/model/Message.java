package com.wa.apiaccount.core.model;

import java.util.Map;
import java.util.Set;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Message {

	private Header header;
	
	private Data data;
	
	private Long flowId;
	
	public Header getHeader() {
		return header;
	}

	public void setHeader(Header header) {
		this.header = header;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	private Map<String, Object> idx = null;
	
	private Set acctFlowSet = null;
	
	private Set acctFlowInnerSet = null;
	
	public Map<String, Object> getIdx() {
		return idx;
	}

	public void setIdx(Map<String, Object> idx) {
		this.idx = idx;
	}

	public Set getAcctFlowSet() {
		return acctFlowSet;
	}

	public void setAcctFlowSet(Set acctFlowSet) {
		this.acctFlowSet = acctFlowSet;
	}

	public Set getAcctFlowInnerSet() {
		return acctFlowInnerSet;
	}

	public void setAcctFlowInnerSet(Set acctFlowInnerSet) {
		this.acctFlowInnerSet = acctFlowInnerSet;
	}

	public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

}