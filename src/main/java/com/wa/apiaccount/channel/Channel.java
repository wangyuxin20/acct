package com.wa.apiaccount.channel;

/**
 * 
 * @author wangyuxin11
 *
 * @param <P>
 */
public interface Channel<P> {
	
	P take() throws InterruptedException;
	
	void put(P product) throws InterruptedException;

}
