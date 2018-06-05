package com.wa.apiaccount.channel;

import java.util.concurrent.BlockingDeque;

/**
 * 
 * @author wangyuxin11
 *
 * @param <P>
 */
public interface WorkStealingEnabledChannel<P> extends Channel<P> {
	P take(BlockingDeque<P> preferredQueue) throws InterruptedException;
}
