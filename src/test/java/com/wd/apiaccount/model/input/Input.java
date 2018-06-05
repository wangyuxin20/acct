package com.wd.apiaccount.model.input;

import com.alibaba.fastjson.JSON;

public class Input {
	
	private String json;
    private String userId;
    private String userType;
    private String userIp;
    private String sysId;
    private String timestamp;
    
    
    public static void main(String[] args) {
    	Page page = new Page();
    	page.setOffset(0);
    	page.setPagesize(10);
    	
    	Input input = new Input();
    	input.setUserId("13482177883doBkU1FZYQMErbQYD5rZ");
    	input.setJson(JSON.toJSONString(page));
    	
    	System.out.println(JSON.toJSONString(input));
    }


	public String getJson() {
		return json;
	}


	public void setJson(String json) {
		this.json = json;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getUserType() {
		return userType;
	}


	public void setUserType(String userType) {
		this.userType = userType;
	}


	public String getUserIp() {
		return userIp;
	}


	public void setUserIp(String userIp) {
		this.userIp = userIp;
	}


	public String getSysId() {
		return sysId;
	}


	public void setSysId(String sysId) {
		this.sysId = sysId;
	}


	public String getTimestamp() {
		return timestamp;
	}


	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
    
    
    

}
