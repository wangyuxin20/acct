package com.wa.apiaccount.channel.biz;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.function.Consumer;

import com.wa.apiaccount.channel.WorkStealingEnabledChannel;
import com.wa.apiaccount.channel.impl.WorkStealingChannel;
import com.wa.apiaccount.core.thread.termination.TerminationToken;

/**
 * 工作窃取算法，该类使用 Two-phase Termination模式
 * 
 * @author wangyuxin11
 *
 */
public class WorkStealingExample {
	private final WorkStealingEnabledChannel<String> channel;
	private final TerminationToken token = new TerminationToken();
	
	public WorkStealingExample(){
		int nCpu = Runtime.getRuntime().availableProcessors();
		int consumerCount = nCpu / 2 + 1;
		
		BlockingDeque<String>[] managedQueues = new LinkedBlockingDeque[consumerCount];
		
		//该通道实例对应了多个队列实例 managedQueues
		channel = new WorkStealingChannel<String>(managedQueues);
		
//		Consumer[] consumers = new Consumer[consumerCount];
//		for(int i = 0; i < consumerCount; i++){
//			managedQueues[i] = new LinkedBlockingDeque<String>();
//			consumers[i] = new Consumer(token, managedQueues[i]);
//			
//			
//		}
		
	}
	

}
