package com.wa.apiaccount.core;

import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class RequestAdapter extends HandlerInterceptorAdapter {
	private final static Logger logger = LoggerFactory.getLogger(RequestAdapter.class);

	/**
	 * 前置检查
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String ip = request.getRemoteAddr();
		long startTime = System.currentTimeMillis();
		request.setAttribute("requestStartTime", startTime);
		HandlerMethod handlerMethod = (HandlerMethod) handler;
		// 获取用户token
		Method method = handlerMethod.getMethod();
		logger.info("用户:" + ip + ",访问目标:" + method.getDeclaringClass().getName() + "." + method.getName());

//		/**
//		 * 对请求request对象做一些简单的效验处理
//		 */
//        BufferedReader br = new BufferedReader(new InputStreamReader(
//        		request.getInputStream(),"UTF-8"));
//        String line = null;
//        StringBuilder sb = new StringBuilder();
//        while ((line = br.readLine()) != null) {
//            sb.append(line);
//        }
//        br.close();
//        
//        String reqBody = sb.toString();// 将资料解码
//        //logger.info("reqBody:" + reqBody);
//        String resultJson = URLDecoder.decode(reqBody, "UTF-8");  //net.URL解码得到json
//        logger.info("receicve http json:" + resultJson);
//        
//        JSONObject json1 = JSONObject.parseObject(resultJson); //取报文
//        JSONObject bodyObj = JSONObject.parseObject(json1.getString("body")); //取交易码
//        JSONObject signObj = JSONObject.parseObject(json1.getString("sign")); //取加密
//        logger.info("receicve http json bodyObj:" + bodyObj);
//        logger.info("receicve http json signObj:" + signObj);
		
        
		return true;
	}

	// controller处理完成
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
//		HandlerMethod handlerMethod = (HandlerMethod) handler;
//		Method method = handlerMethod.getMethod();
//		
//		Map map = request.getParameterMap();
//		Set keSet = map.entrySet();
//		for (Iterator itr = keSet.iterator(); itr.hasNext();) {
//			Map.Entry me = (Map.Entry) itr.next();
//			Object ok = me.getKey();
//			Object ov = me.getValue();
//			String[] value = new String[1];
//			if (ov instanceof String[]) {
//				value = (String[]) ov;
//			} else {
//				value[0] = ov.toString();
//			}
//
//			for (int k = 0; k < value.length; k++) {
//				logger.info(ok + "=" + value[k]);
//			}
//		}
//
//
//		long startTime = (Long) request.getAttribute("requestStartTime");
//		long endTime = System.currentTimeMillis();
//		long executeTime = endTime - startTime;
//
//		// log it
//		if (executeTime > 1000) {
//			logger.info("[" + method.getDeclaringClass().getName() + "." + method.getName() + "] 执行耗时 : " 
//		        + executeTime + "ms");
//		} else {
//			logger.info("[" + method.getDeclaringClass().getSimpleName() + "." + method.getName() + "] 执行耗时 : "
//					+ executeTime + "ms");
//		}

	}
}