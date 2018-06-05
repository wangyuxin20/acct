package com.wa.apiaccount.core.model;

import java.io.Serializable;

public class Body<R, T> implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private R result;
	
	private T entity;

	public Body() {
		super();
	}

	public Body(R result, T entity) {
		super();
		this.result = result;
		this.entity = entity;
	}

	public R getResult() {
		return result;
	}

	public void setResult(R result) {
		this.result = result;
	}

	public T getEntity() {
		return entity;
	}

	public void setEntity(T entity) {
		this.entity = entity;
	}
	
}
