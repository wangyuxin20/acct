package com.wd.apiaccount.model.stress;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.wa.apiaccount.util.AESUtil;
import com.wa.apiaccount.util.SHAUtil;


public class Test7102 {

	private static String TEST_URL = new String("http://10.213.129.59/apiaccount/v2/facade");
//	private static String TEST_URL = new String("http://localhost:8080/v2/facade");
	
	static int nThreads = 10;
	
	static String number  = "1132132";  //标记
	
	
	public static void main(String argv[]) {
		Random random = new Random();
		ExecutorService pool = Executors.newFixedThreadPool(nThreads);
		for(int i = 0; i < 1001; i++){
			int j = i;
			pool.execute(new Runnable() {
				@Override
				public void run() {
					String userId = java.util.UUID.randomUUID().toString().replace("-", "");
					long startTime = System.currentTimeMillis();  
					String requestId = userId;
					String response = post(requestId, number, userId);
					System.out.println(response);
					long endTime = System.currentTimeMillis();  
					System.out.println("第"+j+"次");
				}
			});
			try {
				Thread.sleep(100l);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public static String post(String requestId, String number, String userNo) {
		String rev = null;
		try {
			HttpClient httpclient = new DefaultHttpClient();
			HttpPost httppost = new HttpPost(TEST_URL);
			// 添加http头信息
			httppost.addHeader("Authorization", "your token"); // 认证token
			httppost.addHeader("Content-Type", "application/json");
			httppost.addHeader("User-Agent", "imgfornote");
			httppost.addHeader("tranCode", "7102");
			httppost.addHeader("requestId", "YG" + requestId);
			httppost.addHeader("requestNote", "DMS_CTRL");
			httppost.addHeader("requestSysId", "1234");
			httppost.addHeader("requestTime", "20171025143530450");
			httppost.addHeader("requestTimeSpan", "3");

    		JSONObject obj = new JSONObject();
    		
    		Mk7102 s = new Mk7102();
    		s.setAmt("1");  //50拦不住
    		s.setMktSeq("11");
    		s.setUserNo(userNo);
    		s.setNumber(number);
    		s.setNote("批次发放一个飞凡币");
    		String bodySrc = JSON.toJSONString(s);
    		String body = AESUtil.encrypt(bodySrc, AESUtil.PASSWORD);
    		
    		obj.put("body", body);
    		obj.put("sign", SHAUtil.signSHA256(body));
			httppost.setEntity(new StringEntity(obj.toString()));
			HttpResponse response = httpclient.execute(httppost);
			// 检验状态码，如果成功接收数据
			int code = response.getStatusLine().getStatusCode();
			if (code == 200) {
				rev = EntityUtils.toString(response.getEntity());
			}
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rev;
	}
}
