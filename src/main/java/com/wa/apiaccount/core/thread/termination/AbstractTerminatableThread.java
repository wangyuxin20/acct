package com.wa.apiaccount.core.thread.termination;

/**
 * 可停止的抽象线程
 * 模式角色：Two-phaseTermination
 * 
 * @author wangyuxin11
 *
 */
public abstract class AbstractTerminatableThread extends Thread implements Terminatable {
	//模式角色:Two-phaseTermination.TerminationToken
	public final TerminationToken terminationToken;
	
	public AbstractTerminatableThread(){
		this(new TerminationToken());
	}

	public AbstractTerminatableThread(TerminationToken terminationToken) {
		super();
		this.terminationToken = terminationToken;
		terminationToken.register(this);
	}
	
	/**
	 * 留给子类实现其线程处理逻辑
	 * @throws Exception
	 */
	protected abstract void doRun() throws Exception;
	
	/**
	 * 留给子类实现。用于实现线程停止后的一些清理动作
	 * @param cause
	 */
	protected void doCleanup(Exception cause) {
		//什么都不做
	}
	
	/**
	 * 留给子类实现。用于执行线程停止所需的操作。
	 */
	protected void doTerminate(){
		
	}
	
	public void run(){
		Exception ex = null;
		try{
			for(;;){
				//在执行线程的处理逻辑前先判断线程停止的标志
				if(terminationToken.isToShutDown()
						&& terminationToken.reservations.get() <= 0){
					break;
				}
				doRun();
			}
		} catch(Exception e) {
			//使得线程能够响应 interrupt 调用而退出
			ex = e;
		} finally {
			try {
				doCleanup(ex);
			} finally {
				terminationToken.notifyThreadTermination(this);
			}
		}
	}
	
	public void interrupt() {
		terminate();
	}
	
	public void terminate() {
		terminationToken.setToShutdown(true);
		try{
			doTerminate();
		} finally {
			// 若无待处理的任务，则试图强制终止线程
			if(terminationToken.reservations.get() <= 0){
				super.interrupt();
			}
		}
	}
	
	public void terminate(boolean waitUtilThreadTerminated){
		terminate();
		if(waitUtilThreadTerminated){
			try{
				this.join();
			} catch(InterruptedException e){
				Thread.currentThread().interrupt();
			}
		}
	}

}
