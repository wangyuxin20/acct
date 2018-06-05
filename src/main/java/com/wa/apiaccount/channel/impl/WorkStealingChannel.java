package com.wa.apiaccount.channel.impl;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

import com.wa.apiaccount.channel.WorkStealingEnabledChannel;

/**
 * 
 * @author wangyuxin11
 *
 * @param <T>
 */
public class WorkStealingChannel<T> implements WorkStealingEnabledChannel<T> {
	//受管队列
	private final BlockingDeque<T>[] managedQueues; 
	
	public WorkStealingChannel(BlockingDeque<T>[] managedQueues){
		this.managedQueues = managedQueues;
	}
	
	@Override
	public T take(BlockingDeque<T> preferredQueue) throws InterruptedException {
		//优先从指定的受管队列中取“产品”
		BlockingDeque<T> targetQueue = preferredQueue;
		T product = null;
		
		//尝试从指定的队列首次取“产品”
		if(null != targetQueue){
			product = targetQueue.poll();
		}
		
		int queueIndex = -1;
		
		while(null == product){
			queueIndex = (queueIndex + 1) % managedQueues.length;
			targetQueue = managedQueues[queueIndex];
			//尝试从其他受管队列的队尾“窃取”“产品”
			product = targetQueue.pollLast();
			if(preferredQueue == targetQueue){
				break;
			}
		}
		
		if(null == product){
			//"随机"窃取其他受管队列的“产品”
			queueIndex = (int) (System.currentTimeMillis() % managedQueues.length);
			targetQueue = managedQueues[queueIndex];
			product = targetQueue.takeLast();
			System.out.println("stealed from " + queueIndex + ":" + product);
		}
		
		return product;
	}

	@Override
	public void put(T product) throws InterruptedException {
		int targetIndex = (product.hashCode() % managedQueues.length);
		BlockingQueue<T> targetQueue = managedQueues[targetIndex];
		targetQueue.put(product);
	}

	public T take() throws InterruptedException {
		return take(null);
	}

}
