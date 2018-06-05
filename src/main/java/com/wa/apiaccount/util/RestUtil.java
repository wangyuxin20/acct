package com.wa.apiaccount.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.wa.apiaccount.core.biz.AcctConstant;
import com.wa.apiaccount.core.exception.BusinessException;
import com.wa.apiaccount.core.model.Data;
import com.wa.apiaccount.core.model.Header;
import com.wa.apiaccount.core.model.Message;

public class RestUtil {
	private final static Logger logger = LoggerFactory.getLogger(RestUtil.class);
	
	public static String getRequestParameter(HttpServletRequest request, HttpServletResponse response) {
		if (null == request) {
			return null;
		}
		String method = request.getMethod();
		String param = null;
		if (method.equalsIgnoreCase("GET")) {
			/**
			 * 获取?后面的字符串 http://127.0.0.1:8080/test?username=zhangsan&age=100
			 * -->username=zhangsan&age=100
			 * http://127.0.0.1:8080/test?{"username":"zhangsan"}
			 * -->{"username":"zhangsan"}是json字符串 有了json串就可以映射成对象了
			 */
			param = request.getQueryString();
			// if (Base64.isBase64(param)) {
			// param = new String(Base64.decodeBase64(param),
			// StandardCharsets.UTF_8);
			// }
			System.out.println("param:" + param);
		} else {
			param = getBodyData(request);
			// if (Base64.isBase64(param)) {
			// param = new String(Base64.decodeBase64(param),
			// StandardCharsets.UTF_8);
			// }
			System.out.println("param:" + param);
		}
		return param;
	}

	// 获取请求体中的字符串(POST)
	public static String getBodyData(HttpServletRequest request) {
		Message message = new Message();
		StringBuffer data = new StringBuffer();
		String line = null;
		BufferedReader reader = null;
		try {
			reader = request.getReader();
			while (null != (line = reader.readLine())) {
				data.append(line);
			}
		} catch (IOException e) {

		} finally {

		}
		return data.toString();
	}

	public static void parseRequest(String tranCode, String requestId, String requestSysId, String requestTime,
			String requestIp, String requestNote, HttpServletRequest httpServletRequest, Message message) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(httpServletRequest.getInputStream(), AcctConstant.UTF_8));
			String line = null;
			StringBuilder sb = new StringBuilder();
			while ((line = br.readLine()) != null) {
				sb.append(line);
			}
			br.close();
			// 将资料解码
			String readLines = sb.toString();
			String resultJson = URLDecoder.decode(readLines, AcctConstant.UTF_8); // net.URL解码得到json
			logger.info("receicve http json:" + resultJson);

			/**
			 * Header
			 */
			Header header = new Header();
			header.setTranCode(tranCode);
			header.setRequestId(tranCode + AcctConstant.SYMBOL + requestId);
			header.setRequestIp(requestIp);
			header.setRequestSysId(requestSysId);
			header.setRequestTime(requestTime);
			header.setRequestNote(requestNote);
			message.setHeader(header);

			/**
			 * Data
			 */
			Data data = new Data();
			JSONObject jsonData = JSONObject.parseObject(resultJson); // 取报文
			String body = jsonData.getString("body");
			if (body == null) {
				throw new BusinessException(requestId, "body is null");
			} else {
				data.setBody(AESUtil.decrypt(body, AESUtil.PASSWORD));
			}

			String sign = jsonData.getString("sign");
			if (sign == null) {
				throw new BusinessException(requestId, "sign is null");
			} else {
				//
			}
			message.setData(data);

			/**
			 * Collection
			 */
			Map<String, Object> idx = new HashMap<String, Object>();
			Set<?> acctFlowSet = new HashSet<>();
			Set<?> acctFlowInnerSet = new HashSet<>();
			message.setIdx(idx);
			message.setAcctFlowSet(acctFlowSet);
			message.setAcctFlowInnerSet(acctFlowInnerSet);
		} catch (IOException e1) {
			throw new BusinessException(requestId, "message转换IO异常");
		} catch (JSONException e) {
			throw new BusinessException(requestId, "报文体格式错误");
		} finally {
			try {
				if (null != br) {
					br.close();
				}
			} catch (IOException e) {
				throw new BusinessException(requestId, "BufferedReader close IOException");
			}
		}
	}

}
