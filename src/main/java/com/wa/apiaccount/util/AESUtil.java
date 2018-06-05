package com.wa.apiaccount.util;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/**
 * AES对称加密.
 * 密碼是2進制(暂时用不变的秘钥：szqy_wyt_v2)
 * 
 */
public class AESUtil {
	public final static String PASSWORD = "szqy_wyt_v2";

	public static void main(String[] args) {
		
//		String content = "wangyuxin11测试";
//		byte[] encryptResult = encrypt(content, PASSWORD);// 加密
//		byte[] decryptResult = decrypt(encryptResult, PASSWORD);// 解密
//		System.out.println("解密后：" + new String(decryptResult));
//
//		/* 容易出错的地方，请看下面代码 */
//		System.out.println("***********************************************");
//		try {
//			String encryptResultStr = new String(encryptResult, "utf-8");
//			decryptResult = decrypt(encryptResultStr.getBytes("utf-8"), PASSWORD);
//			System.out.println("解密后：" + new String(decryptResult));
//		} catch (UnsupportedEncodingException e) {
//			e.printStackTrace();
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		/*
//		 * 则，系统会报出如下异常：javax.crypto.IllegalBlockSizeException: Input length must
//		 * be multiple of 16 when decrypting with padded cipher at
//		 * com.sun.crypto.provider.SunJCE_f.b(DashoA13*..) at
//		 * com.sun.crypto.provider.SunJCE_f.b(DashoA13*..) at
//		 * com.sun.crypto.provider.AESCipher.engineDoFinal(DashoA13*..) at
//		 * javax.crypto.Cipher.doFinal(DashoA13*..) at
//		 * cn.com.songjy.test.ASCHelper.decrypt(ASCHelper.java:131) at
//		 * cn.com.songjy.test.ASCHelper.main(ASCHelper.java:58)
//		 */
//		/*
//		 * 这主要是因为加密后的byte数组是不能强制转换成字符串的, 换言之,字符串和byte数组在这种情况下不是互逆的,
//		 * 要避免这种情况，我们需要做一些修订，可以考虑将二进制数据转换成十六进制表示,
//		 * 主要有两个方法:将二进制转换成16进制(见方法parseByte2HexStr)或是将16进制转换为二进制(
//		 * 见方法parseHexStr2Byte)
//		 */
//
//		/* 然后，我们再修订以上测试代码 */
//		System.out.println("***********************************************");
//		String encryptResultStr = parseByte2HexStr(encryptResult);
//		System.out.println("加密后：" + encryptResultStr);
//		
//		byte[] decryptFrom = parseHexStr2Byte(encryptResultStr);
//		decryptResult = decrypt_(decryptFrom, PASSWORD);// 解码
//		System.out.println("解密后：" + new String(decryptResult));

	}
	
	/**
	 * 加密
	 * @param content
	 * @param password
	 * @return
	 */
	public static String encrypt(String content, String password){
		return parseByte2HexStr(encrypt_(content, password));// 加密
	}
	
	/**
	 * 解密
	 * @param content
	 * @param password
	 * @return
	 */
	public static String decrypt(String content, String password) {
		return new String(decrypt_(parseHexStr2Byte(content), password));
	}

	/**
	 * 加密
	 * 
	 * @method encrypt
	 * @param content
	 *            需要加密的内容
	 * @param password
	 *            加密密码
	 * @return
	 * @throws @since
	 *             v1.0
	 */
	private static byte[] encrypt_(String content, String password) {
		try {
			KeyGenerator kgen = KeyGenerator.getInstance("AES");
			SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG");
			secureRandom.setSeed(password.getBytes());
			//kgen.init(128, new SecureRandom(password.getBytes()));
			kgen.init(128, secureRandom);
			SecretKey secretKey = kgen.generateKey();
			
			byte[] enCodeFormat = secretKey.getEncoded();
			SecretKeySpec key = new SecretKeySpec(enCodeFormat, "AES");
			Cipher cipher = Cipher.getInstance("AES");// 创建密码器
			byte[] byteContent = content.getBytes("utf-8");
			cipher.init(Cipher.ENCRYPT_MODE, key);// 初始化
			byte[] result = cipher.doFinal(byteContent);
			return result; // 加密
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (NoSuchPaddingException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (InvalidKeyException e) {
			e.printStackTrace();
		} catch (IllegalBlockSizeException e) {
			e.printStackTrace();
		} catch (BadPaddingException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 解密
	 * 
	 * @method decrypt
	 * @param content
	 *            待解密内容
	 * @param password
	 *            解密密钥
	 * @return
	 * @throws @since
	 *             v1.0
	 */
	private static byte[] decrypt_(byte[] content, String password) {
		try {
			KeyGenerator kgen = KeyGenerator.getInstance("AES");
			SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG");
			secureRandom.setSeed(password.getBytes());
			//kgen.init(128, new SecureRandom(password.getBytes()));
			kgen.init(128, secureRandom);
			SecretKey secretKey = kgen.generateKey();
			byte[] enCodeFormat = secretKey.getEncoded();
			SecretKeySpec key = new SecretKeySpec(enCodeFormat, "AES");
			Cipher cipher = Cipher.getInstance("AES");// 创建密码器
			cipher.init(Cipher.DECRYPT_MODE, key);// 初始化
			byte[] result = cipher.doFinal(content);
			return result; // 解密
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (NoSuchPaddingException e) {
			e.printStackTrace();
		} catch (InvalidKeyException e) {
			e.printStackTrace();
		} catch (IllegalBlockSizeException e) {
			e.printStackTrace();
		} catch (BadPaddingException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 将二进制转换成16进制
	 * 
	 * @method parseByte2HexStr
	 * @param buf
	 * @return
	 * @throws @since
	 *             v1.0
	 */
	private static String parseByte2HexStr(byte buf[]) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < buf.length; i++) {
			String hex = Integer.toHexString(buf[i] & 0xFF);
			if (hex.length() == 1) {
				hex = '0' + hex;
			}
			sb.append(hex.toUpperCase());
		}
		return sb.toString();
	}

	/**
	 * 将16进制转换为二进制
	 * 
	 * @method parseHexStr2Byte
	 * @param hexStr
	 * @return
	 * @throws @since
	 *             v1.0
	 */
	private static byte[] parseHexStr2Byte(String hexStr) {
		if (hexStr.length() < 1)
			return null;
		byte[] result = new byte[hexStr.length() / 2];
		for (int i = 0; i < hexStr.length() / 2; i++) {
			int high = Integer.parseInt(hexStr.substring(i * 2, i * 2 + 1), 16);
			int low = Integer.parseInt(hexStr.substring(i * 2 + 1, i * 2 + 2), 16);
			result[i] = (byte) (high * 16 + low);
		}
		return result;
	}

	/**
	 * 另外一种加密方式--这种加密方式有两种限制 1、密钥必须是16位的 2、待加密内容的长度必须是16的倍数，如果不是16的倍数，就会出如下异常
	 * javax.crypto.IllegalBlockSizeException: Input length not multiple of 16
	 * bytes at com.sun.crypto.provider.SunJCE_f.a(DashoA13*..) at
	 * com.sun.crypto.provider.SunJCE_f.b(DashoA13*..) at
	 * com.sun.crypto.provider.SunJCE_f.b(DashoA13*..) at
	 * com.sun.crypto.provider.AESCipher.engineDoFinal(DashoA13*..) at
	 * javax.crypto.Cipher.doFinal(DashoA13*..) 要解决如上异常，可以通过补全传入加密内容等方式进行避免。
	 * 
	 * @method encrypt2
	 * @param content
	 *            需要加密的内容
	 * @param password
	 *            加密密码
	 * @return
	 * @throws @since
	 *             v1.0
	 */
	private static byte[] encrypt2(String content, String password) {
		try {
			SecretKeySpec key = new SecretKeySpec(password.getBytes(), "AES");
			Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding");
			byte[] byteContent = content.getBytes("utf-8");
			cipher.init(Cipher.ENCRYPT_MODE, key);// 初始化
			byte[] result = cipher.doFinal(byteContent);
			return result; // 加密
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (NoSuchPaddingException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (InvalidKeyException e) {
			e.printStackTrace();
		} catch (IllegalBlockSizeException e) {
			e.printStackTrace();
		} catch (BadPaddingException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	private static SecretKey getKey(String strKey) {
	    try {
	        if (strKey == null) {
	            strKey = "";
	        }
	        KeyGenerator _generator = KeyGenerator.getInstance("AES");
	        SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG");
	        secureRandom.setSeed(strKey.getBytes());
	        _generator.init(128, secureRandom);
	        return _generator.generateKey();
	    } catch (Exception e) {
	        throw new RuntimeException(" 初始化密钥出现异常 ");
	    }
	}
	
}
