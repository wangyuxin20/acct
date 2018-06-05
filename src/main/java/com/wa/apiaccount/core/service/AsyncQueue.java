package com.wa.apiaccount.core.service;

import java.util.concurrent.BlockingQueue;

/**
 * 
 * @author wangyuxin11
 *
 */
public interface AsyncQueue {
	
    public <T> void addQueue(T t);
    
    public void exceQueue();

	public <T> BlockingQueue<T> getQueue();
	
	public String getName();

}
