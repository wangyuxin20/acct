package com.wd.apiaccount.model.stress;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
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
import com.wd.apiaccount.model.input.Input;

public class TestQueryAppFlow {
//	
//	private static final String URL_DataBase = "jdbc:mariadb://localhost:3306/apiaccount?useUnicode=true&characterEncoding=UTF8";
//	
//	private static String TEST_URL = new String("http://10.213.129.59/apiaccount/query/appflow");
//	
//	static int nThreads = 20;
//
//	
//	public static void post() throws ClassNotFoundException{
//		// 取用户号
//		List<String> userNoList = null;
//		int idx1 = 0;
//		int idx2 = 100;
//		while (true) {
//			userNoList = new ArrayList<String>();
//			
//			idx1 = idx1 + 100;
//			idx2 = idx2 + 100;
//			
//			Connection conn = null;
//			Statement statement = null;
//			ResultSet resultSet = null;
//			try {
//				Class.forName("org.mariadb.jdbc.Driver");
//				conn = DriverManager.getConnection(URL_DataBase, "root", "root");
//				statement = conn.createStatement();
//				resultSet = statement.executeQuery("select DISTINCT user_no from acct limit " + idx1 + ", " + idx2);
//				while (resultSet.next()) {
//					userNoList.add(resultSet.getString(1));
//				}
//			} catch (SQLException e) {
//				e.printStackTrace();
//			} finally {
//				if (resultSet != null) {
//					try {
//						resultSet.close();
//					} catch (SQLException ignored) {
//						ignored.printStackTrace();
//					}
//				}
//				if (statement != null) {
//					try {
//						statement.close();
//					} catch (SQLException ignored) {
//						ignored.printStackTrace();
//					}
//				}
//				if(conn != null){
//					try {
//						conn.close();
//					} catch (SQLException ignored) {
//						ignored.printStackTrace();
//					}
//				}
//			}
//			
//			if(!userNoList.isEmpty()){
//				for(String userId : userNoList){
//					long startTime = System.currentTimeMillis();
//					
//					HttpClient httpclient = new DefaultHttpClient();
//					HttpPost httppost = new HttpPost(TEST_URL);
//					System.out.println("userId : " + userId);
//
//					// 添加http头信息
//					httppost.addHeader("ip", "127.0.0.1");
//					httppost.addHeader("time", "11111111111111111");
//					httppost.addHeader("sysId", "1234");
//					
//					httppost.addHeader("Content-Type", "application/json;charset=utf-8");
//					
//					Page p = new Page();
//					
//					Input input = new Input();
//					input.setJson(JSON.toJSONString(p));
//					input.setUserId(userId);
//					
//					String inputJson = JSON.toJSONString(input);
//					System.out.println("inputJson : " + inputJson);
//					
//					try {
//						httppost.setEntity(new StringEntity(inputJson));
//						HttpResponse response = httpclient.execute(httppost);
//						// 检验状态码，如果成功接收数据
//						int code = response.getStatusLine().getStatusCode();
//						if (code == 200) {
//							String resp = EntityUtils.toString(response.getEntity());
//							System.out.println(resp);
//							long span = System.currentTimeMillis()-startTime;
//							System.out.println("Cost time : " + String.valueOf(span) + " ms");
//						}
//					} catch (UnsupportedEncodingException e) {
//						e.printStackTrace();
//					} catch (ClientProtocolException e) {
//						e.printStackTrace();
//					} catch (IOException e) {
//						e.printStackTrace();
//					}
//				}
//			}
//			System.out.println("Begin : " + idx1 + " -----> " + idx2);
//			try {
//				Thread.sleep(1000l);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//	
//	public static void main(String[] args) {
//		ExecutorService pool = Executors.newFixedThreadPool(nThreads);
//		for(int i=0; i<100; i++){
//			pool.execute(new Runnable() {
//				@Override
//				public void run() {
//					try {
//						post();
//					} catch (ClassNotFoundException e) {
//						e.printStackTrace();
//					}
//				}
//			});
//		}
//	}
}
 