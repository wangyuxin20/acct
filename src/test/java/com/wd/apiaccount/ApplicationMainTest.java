package com.wd.apiaccount;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

public class ApplicationMainTest {
	private static final Logger logger = LoggerFactory.getLogger(ApplicationMainTest.class);

    public static void main(String[] args) {
    	logger.info("DrPay starting!!!!");
    	ApplicationContext app = SpringApplication.run(ApplicationMainTest.class, args);
        logger.info(new SimpleDateFormat("[yyyy-MM-dd HH:mm:ss]").format(new Date())
                + "DrPay started!");
    }

}
