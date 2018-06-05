package zh.test;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class AcceptTask implements Callable<ProcessPOJO>{
	
	private ProcessPOJO processPOJO;
	
	private ExecutorService boss;
	
	private ExecutorService p1;
	private ExecutorService p2;
	private ExecutorService p3;

    public AcceptTask(ProcessPOJO processPOJO,ExecutorService boss,ExecutorService p1,ExecutorService p2,ExecutorService p3) {
        this.processPOJO = processPOJO;
        this.boss = boss;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

	@Override
	public ProcessPOJO call() throws Exception {
		return processPOJO;
		//System.out.println("call() begin  "+ Thread.currentThread().getName());
		//Thread.sleep(1000+getRandom(500,1000));
		//Future<ProcessPOJO> fs = boss.submit(new BossTask(processPOJO,p1,p2,p3));
		
		//return "call() end " + id + "    "+ Thread.currentThread().getName();
		//return fs.get();
	}
	
	
	public static long getRandom(int min, int max){
	    Random random = new Random();
	    long s = random.nextInt(max) % (max - min + 1) + min;
	    return s;

	}
	
}
