package com.wa.apiaccount.core.thread.termination;

public interface Terminatable {
	
	public void terminate();
	
	public void terminate(boolean waitUtilThreadTerminated);

}
