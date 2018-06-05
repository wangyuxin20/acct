package com.zh.test.controller;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.util.concurrent.ListeningExecutorService;

import zh.test.BossTask;
import zh.test.ProcessPOJO;
import zh.test.ResultMap;


@RestController
public class TestController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Resource(name="boss")
	ExecutorService boss;
	
	@Resource(name="process1")
	ListeningExecutorService p1;
	
	@Resource(name="process2")
	ListeningExecutorService p2;
	
	@Resource(name="process3")
	ListeningExecutorService p3;
	
	@RequestMapping(value = {"/process"})
	public String process(String processNo){
		
		ProcessPOJO processPOJO = new ProcessPOJO();
		processPOJO.setProcessNo(processNo);
		try {
			Object lock = new Object();
			Future<String> fs = boss.submit(new BossTask(processPOJO,p1,p2,p3,lock));
			String hashCode = fs.get();

			synchronized (lock) {
				lock.wait(3000);
			}
			processPOJO = (ProcessPOJO) ResultMap.get(hashCode);
			logger.debug("processPOJO "+processPOJO.getProcessNo()+" = "+processPOJO.getResult());

		} catch (Exception e) {
			
		}
		return "success";
	}

}
