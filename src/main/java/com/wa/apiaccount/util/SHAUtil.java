package com.wa.apiaccount.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 
 * SHA工具类
 *
 */
public class SHAUtil {
	
	public static void main(String args[]) {
		String signString = "Thank you!";
		String type = "SHA-1";
		String result = sign(signString, type);
		System.out.println("采用" + type + "加密之后的串为：" + result);
		type = "MD5";
		result = sign(signString, type);
		System.out.println("采用" + type + "加密之后的串为：" + result);
		
		type = "SHA-256";
		result = sign(signString, type);
		System.out.println("采用" + type + "加密之后的串为：" + result);
		
		System.out.println("采用" + type + "加密之后的串为：" + result.length());
		
		
		type = "SHA-384";
		result = sign(signString, type);
		System.out.println("采用" + type + "加密之后的串为：" + result);
	}

	public static String signSHA256(String signString){
		return sign(signString, "SHA-256");
	}
	
	// 签名
	public static String sign(String str, String type) {
		String s = Encrypt(str, type);
		return s;
	}

	public static String Encrypt(String strSrc, String encName) {
		MessageDigest md = null;
		String strDes = null;
//		byte[] bt = strSrc.getBytes();
		byte[] bt;
		try {
			bt = strSrc.getBytes("UTF-8");
			md = MessageDigest.getInstance(encName);
			md.update(bt);
			strDes = bytes2Hex(md.digest()); // to HexString
		} catch (NoSuchAlgorithmException e) {
			System.out.println("签名失败！");
			return null;
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
			System.out.println("签名失败！格式错误!");
			return null;
		}
		return strDes;
	}

	public static String bytes2Hex(byte[] bts) {
		String des = "";
		String tmp = null;
		for (int i = 0; i < bts.length; i++) {
			tmp = (Integer.toHexString(bts[i] & 0xFF));
			if (tmp.length() == 1) {
				des += "0";
			}
			des += tmp;
		}
		return des;
	}


}
