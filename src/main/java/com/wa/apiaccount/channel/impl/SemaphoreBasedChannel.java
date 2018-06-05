package com.wa.apiaccount.channel.impl;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;

import com.wa.apiaccount.channel.Channel;


/**
 * 基于Semaphore的支持流量控制的通道实现。适用于无界队列且需要根据需求变化流量控制。
 * 
 * @author wangyuxin11
 *
 * @param <P>
 */
public class SemaphoreBasedChannel<P> implements Channel<P> {
	private final BlockingQueue<P> queue;
	private final Semaphore semaphore;

	/**
	 * 
	 * @param queue 阻塞队列，通常是一个无界阻塞队列
	 * @param flowLimit 流量限制数
	 */
	public SemaphoreBasedChannel(BlockingQueue<P> queue, int flowLimit){
		this.queue = queue;
		this.semaphore = new Semaphore(flowLimit);
	}
	
	public P take() throws InterruptedException {
		return queue.take();
	}

	public void put(P product) throws InterruptedException {
		semaphore.acquire();
		try{
			queue.put(product);
		} finally {
			semaphore.release();
		}
	}

}
