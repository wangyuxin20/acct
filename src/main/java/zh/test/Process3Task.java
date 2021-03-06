package zh.test;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

import org.springframework.beans.factory.annotation.Autowired;

public class Process3Task implements Callable<ProcessPOJO>{

	private ProcessPOJO processPOJO;

    public Process3Task(ProcessPOJO processPOJO) {
        this.processPOJO = processPOJO;
    }

	@Override
	public ProcessPOJO call() throws Exception {
		//System.out.println("call() begin  "+ Thread.currentThread().getName());
				Thread.sleep(1000+getRandom(500,1000));
				
				System.out.println("Process3Task is process "+processPOJO.getProcessNo());
				
				long flag = getRandom(0,1);
				if(flag==0){
					processPOJO.setResult("Success");
				}else{
					processPOJO.setResult("Fail");
				}
				
				//return "call() end " + id + "    "+ Thread.currentThread().getName();
				return processPOJO;
	}
	
	
	public static long getRandom(int min, int max){
	    Random random = new Random();
	    long s = random.nextInt(max) % (max - min + 1) + min;
	    return s;

	}
	
}
