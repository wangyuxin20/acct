package com.wd.apiaccount.model;


import com.alibaba.fastjson.JSON;

public class Test {

	
	private String body;
	private String sign;
	
	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public static void main(String[] args) {
//		
//		Test test = new Test();
//		Mk7102 r = new Mk7102();
//		
//		String body = JSON.toJSONString(r);
//		
//		test.setBody(body);
//		test.setSign("");
//		System.out.println("加密前 ---> " + JSON.toJSONString(test));
//		
//		test.setSign(SHAUtil.signSHA256(body));
//		test.setBody(AESUtil.encrypt(body, AESUtil.PASSWORD));		// 加密
//		System.out.println("加密后 ---> ");
//		System.out.println(JSON.toJSONString(test));
//		
//		
//		//解密
//		body = new String(AESUtil.decrypt(test.getBody(), AESUtil.PASSWORD));
//		test.setBody(body);
//		if(SHAUtil.signSHA256(body).equals(test.getSign())){
//			test.setSign("");
//			System.out.println("效验通过解密 ---> " + JSON.toJSONString(test));
//		} else {
//			System.out.println("签名效验失败");
//		}
//		
//		
////		String body1 = "B3C00B93FABEA92ADEFF3C6CD3C0EE66517C37405DBAF01F233E2ECF25DBD3E692421F3E0B84A85CD6FF1AD72616E2C09AC811B65E8EF01518EF36A5CB1C264ACA2D5AFD9A4642F0C8B7E6785588FDF93B2CD3CC530A24A97E42D15614753882460F91DCC26C44F4932BF09D47C1133453932CBCF1D7E42BC0BB64E81E84394A";
////		String sign1 = "304c46d7acc3214736db990118f79e408bbfd2405491318180fc02a3abcb8816"; 
////		
////		byte[] decryptFrom1 = AESUtil.parseHexStr2Byte(body1);
////		byte[] decryptResult1 = AESUtil.decrypt(decryptFrom1, AESUtil.PASSWORD);// 解码
////		String body = new String(decryptResult1);
////		
////		System.out.println(SHAUtil.signSHA256(body));
////		System.out.println(sign1);
	}
	

}