package com.wa.apiaccount.core.thread.termination;//5-4

import java.lang.ref.WeakReference;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 
 * 线程停止标志
 * 
 * @author wangyuxin11
 *
 */
public class TerminationToken {
	//使用volatile修饰，以保证无须显示锁的情况下该变量的内存可见性
	protected volatile boolean toShutdown = false;
	public final AtomicInteger reservations = new AtomicInteger(0);
	
	/**
	 * 在多个可停止线程实例共享一个 TerminationToken 实例的情况下，该队列用于记录那些共享
	 * TerminationToken 实例的可停止线程，以便尽可能减少锁的使用的情况下，实现这些线程的停止。
	 */
	private final Queue<WeakReference<Terminatable>> coordinatedThreads;
	
	public TerminationToken(){
		coordinatedThreads = new ConcurrentLinkedQueue<WeakReference<Terminatable>>();
	}
	
	public boolean isToShutDown(){
		return toShutdown;
	}
	
	protected void setToShutdown(boolean toShutdown){
		this.toShutdown = true;
	}
	
	protected void register(Terminatable thread){
		coordinatedThreads.add(new WeakReference<Terminatable>(thread));
	}
	
	/**
	 * 通知 TerminationToken 实例，共享该实例的所有可停止线程中的一个线程停止了，以便其停止其他未被停止的线程。
	 * @param thread 已停止的线程
	 */
	protected void notifyThreadTermination(Terminatable thread){
		WeakReference<Terminatable> wrThread;
		Terminatable otherThread;
		while(null != (wrThread = coordinatedThreads.poll())){
			otherThread = wrThread.get();
			if(null != otherThread && otherThread != thread){
				otherThread.terminate();
			}
		}
	}

}
