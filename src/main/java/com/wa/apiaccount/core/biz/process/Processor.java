package com.wa.apiaccount.core.biz.process;

import org.springframework.ui.ModelMap;

import com.wa.apiaccount.core.model.Message;

public abstract class Processor {

	public abstract void doPackage(Message message);
	
	public abstract void doRegister(Message message);
	
	public abstract void doBefore(Message message);
	
	public abstract void doTransaction(Message message, ModelMap model);
	
	public abstract void doAfter(Message message, ModelMap model);
	
	public abstract void doSignature(ModelMap model);
	
	public abstract void doBatch(Message message);

}
