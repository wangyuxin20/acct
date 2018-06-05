package com.zh.test;

import java.util.Random;
import java.util.concurrent.Callable;

public class Task implements Callable<String>{
	
	private String id;
    public Task(String id) {
        this.id = id;
    }

	@Override
	public String call() throws Exception {
		//System.out.println("call() begin  "+ Thread.currentThread().getName());
		Thread.sleep(1000+getRandom(500,1000));
		if(id.equals("500")){
			Thread.sleep(10000);
		}
		//return "call() end " + id + "    "+ Thread.currentThread().getName();
		return id;
	}
	
	
	public static long getRandom(int min, int max){
	    Random random = new Random();
	    long s = random.nextInt(max) % (max - min + 1) + min;
	    return s;

	}
	
}
