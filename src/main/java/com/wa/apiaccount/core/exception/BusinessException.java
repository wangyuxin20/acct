package com.wa.apiaccount.core.exception;

public class BusinessException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    //业务类型
    private String requestId;
    //业务代码
    private int code;
    //错误信息
    private String message;
      
	public BusinessException(String requestId, int code, String message) {
		super();
		this.requestId = requestId;
		this.code = code;
		this.message = message;
	}

	public BusinessException(String message){
        super(message);
        this.requestId = "";
        this.code = -1;
        this.message = message;
    }
  
    public BusinessException(String requestId, String message){
        super(message);
        this.requestId = requestId;
        this.code = -1;
        this.message = message;
    }

    public BusinessException(int code, String message){
        super(message);
        this.requestId = "";
        this.code = code;
        this.message = message;
    }

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
