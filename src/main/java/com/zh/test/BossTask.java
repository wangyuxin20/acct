package com.zh.test;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;




import java.util.concurrent.Future;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningExecutorService;

public class BossTask implements Callable<String>{
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	private ProcessPOJO processPOJO;
	
	private ListeningExecutorService process1;
	private ListeningExecutorService process2;
	private ListeningExecutorService process3;
	private Object lock;

    public BossTask(ProcessPOJO processPOJO,ListeningExecutorService process1,
    		ListeningExecutorService process2,ListeningExecutorService process3,Object lock) {
        this.processPOJO = processPOJO;
        this.process1 = process1;
        this.process2 = process2;
        this.process3 = process3;
        this.lock = lock;
    }

	@SuppressWarnings("deprecation")
	@Override
	public String call() throws Exception {
		String no = processPOJO.getProcessNo();
		
		ListenableFuture<ProcessPOJO> fs = null;
		if("1".equals(no)){
			fs = process1.submit(new Process1Task(processPOJO));
		}
		if("2".equals(no)){
			fs = process2.submit(new Process2Task(processPOJO));
		}
		if("3".equals(no)){
			fs = process3.submit(new Process3Task(processPOJO));
		}
		
		
		String hashCode = String.valueOf(fs.hashCode());
		
		logger.debug(hashCode);
		
		ResultMap.register(hashCode, fs);
		
		Futures.addCallback(fs, new FutureCallback<ProcessPOJO>() {
            @Override
            public void onSuccess(ProcessPOJO processPOJO) {
            	synchronized (lock) {
            		lock.notify();
				}
            } 
  
            @Override  
            public void onFailure(final Throwable t) {  
            	synchronized (lock) {
            		lock.notify();
				}
            }
        });  

		return hashCode;
	}
	
	
	public static long getRandom(int min, int max){
	    Random random = new Random();
	    long s = random.nextInt(max) % (max - min + 1) + min;
	    return s;

	}
	
}
