package com.wa.apiaccount.channel.impl;

import java.util.concurrent.BlockingQueue;

import com.wa.apiaccount.channel.Channel;

/**
 * 
 * @author wangyuxin11
 *
 * @param <P>
 */
public class BlockingQueueChannel<P> implements Channel<P> {
	private final BlockingQueue<P> queue;

	public BlockingQueueChannel(BlockingQueue<P> queue){
		this.queue = queue;
	}
	
	
	public P take() throws InterruptedException {
		return queue.take();
	}

	public void put(P product) throws InterruptedException {
		queue.put(product);
	}

}
