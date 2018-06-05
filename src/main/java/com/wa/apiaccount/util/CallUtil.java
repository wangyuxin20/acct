package com.wa.apiaccount.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.ui.ModelMap;

import com.wa.apiaccount.core.biz.process.AbstractProcessor;
import com.wa.apiaccount.core.exception.BusinessException;
import com.wa.apiaccount.core.model.Message;

public class CallUtil {
	private final static Logger logger = LoggerFactory.getLogger(CallUtil.class);
	
	public static void call(ApplicationContext applicationContext, String clsPath, 
			Message message, ModelMap model) {
		Class<?> clazz = null;
		try {
			clazz = Class.forName(clsPath);
		} catch (ClassNotFoundException e) {
			throw new BusinessException(message.getHeader().getRequestId(), 404009,
					"ClassNotFoundException:" + e.getMessage());
		}
		logger.debug("clsName -> " + clazz.getName());
		((AbstractProcessor) applicationContext.getBean(clazz)).doProcess(message, model);
	}

}
