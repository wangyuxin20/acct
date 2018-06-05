package com.wa.apiaccount.core.biz.process;

import org.springframework.ui.ModelMap;

import com.wa.apiaccount.core.model.Message;

public abstract class AbstractProcessor extends Processor {

	public void doProcess(Message message, ModelMap model) {
    	doPackage(message);
    	doRegister(message);
    	doTransaction(message, model);
    	doSignature(model);
    }

}