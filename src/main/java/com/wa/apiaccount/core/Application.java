package com.wa.apiaccount.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

public abstract class Application extends WebMvcConfigurerAdapter implements HealthIndicator { //implements TransactionManagementConfigurer {
	private final static Logger logger = LoggerFactory.getLogger(Application.class);
	
	@Autowired
    CacheManager cacheManager;
	
	//http://localhost:8080/cache/getAllCacheName
	@RequestMapping("/cache/getAllCacheName")
	public void cacheProfile() {
		List<Object> list = new ArrayList<Object>();
		Collection<String> collection = cacheManager.getCacheNames();
		if(!collection.isEmpty()){
			for(String cName : collection) {
				org.springframework.cache.Cache cache = cacheManager.getCache(cName);
				System.out.println(cache.getName());
				System.out.println(cache.get(cache.getName()));
//				list.add(cache.getNativeCache());
			}
		}
	}
	
	@RequestMapping("/cache/delete/{cacheId}")
	public void delete(@PathVariable("cacheId") String cacheId) {
		Cache cache = cacheManager.getCache(cacheId);
		if(null != cache){
			cache.clear();
		}
	}
	
	
	// 增加拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new RequestAdapter());
    }

	/*
	 * 在/health接口调用的时候，返回多一个属性："mySpringBootApplication":{"status":"UP","hello":"world"} 
	 */
	public Health health() {
		return Health.up().withDetail("hello", "world").build();
	}
	

    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        super.configureMessageConverters(converters);
        //1.需要定义一个convert转换消息的对象;
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = new FastJsonHttpMessageConverter();
        //2.添加fastJson的配置信息，比如：是否要格式化返回的json数据;
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
        //3处理中文乱码问题
        List<MediaType> fastMediaTypes = new ArrayList<>();
        fastMediaTypes.add(MediaType.APPLICATION_JSON_UTF8);
        //4.在convert中添加配置信息.
        fastJsonHttpMessageConverter.setSupportedMediaTypes(fastMediaTypes);
        fastJsonHttpMessageConverter.setFastJsonConfig(fastJsonConfig);
        //5.将convert添加到converters当中.
        converters.add(fastJsonHttpMessageConverter);
    }

}

