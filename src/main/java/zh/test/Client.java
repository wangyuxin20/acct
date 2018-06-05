package zh.test;


import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.zh.test.util.HttpClientUtil;

public class Client {

	public static long getRandom(int min, int max){
	    Random random = new Random();
	    long s = random.nextInt(max) % (max - min + 1) + min;
	    return s;

	}
	
	public static void main(String[] args) {
		//long beginTime = System.currentTimeMillis(); 
		
		ExecutorService executorService = Executors.newFixedThreadPool(50);
		for(int i=0;i<1000;i++){
			long flag = getRandom(1,3);
			executorService.submit(new Test(flag));
		}
		
		//executorService.shutdown();
	}
}

class Test implements Runnable{

	HttpClientUtil http;
	long i;
	Test(long i){
		this.i = i;
	}
	
	@Override
	public void run() {
		String url = "http://127.0.0.1:8080/process";
		Map<String,	String> map = new HashMap<String,String>();
		ProcessPOJO p = new ProcessPOJO();
		p.setProcessNo(String.valueOf(i));
		map.put("processNo", String.valueOf(i));
		System.out.println("processNo="+i);
		HttpClientUtil.doPost(url, map, null);
	}
	
}
