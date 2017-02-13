package com.ren.httpserver.demo01;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Requset {
	
	private String method;
	private String url;
	private Map<String,List<String>> parametMapValues;
	private final String CRLF = "\r\n";
	private InputStream is;
	private String requestInfo;
	
	public Requset() {
		method = "";
		url = "";
		parametMapValues = new HashMap<String,List<String>>();
		requestInfo = "";
		
	}
	
	public Requset(InputStream is){
		this();
		this.is = is;
		byte[] data = new byte[20480];
		int len;
		try {
			len = is.read(data);
			requestInfo = new String(data, 0, len);
		} catch (IOException e) {
			return;
		}
		parseRequestInfo();
	}
	
	private void parseRequestInfo(){
		if(null==requestInfo||(requestInfo.trim().equals(""))){
			return;
		}
		/**
		 * 解析信息
		 */
		//1.获取请求方式
		String paramString = "";
		String line1 = requestInfo.substring(0,requestInfo.indexOf(CRLF));
		this.method = line1.substring(0, requestInfo.indexOf("/")).trim();
		String urlStr = line1.substring(line1.indexOf("/"), line1.indexOf("HTTP/")).trim();
		//2.不同的请求方式不同的参数处理
		if (this.method.equalsIgnoreCase("post")) {
			this.url = urlStr;
			paramString = requestInfo.substring(requestInfo.lastIndexOf(CRLF)).trim();
		}else if(this.method.equalsIgnoreCase("get")){
			if (urlStr.contains("?")) {
				String[] urlArray = urlStr.split("\\?");
				this.url = urlArray[0];
				paramString = urlArray[1];
			} else {
				this.url = urlStr;
			}
		}
		
		//不存在参数请求
		if(paramString.equals("")){
			return;
		}
		//3将请求参数封装到Map中
		parseParams(paramString);
	}
	
	private void parseParams(String paramString){
		//分割 将字符转成数组
		StringTokenizer token = new StringTokenizer(paramString, "&");
		while(token.hasMoreTokens()){
			String keyValue = token.nextToken();
			String[] keyValues = keyValue.split("=");
			if(1==keyValues.length){
				keyValues = Arrays.copyOf(keyValues, 2);
				keyValues[1] = null;
			}
			
			String key = keyValues[0].trim();
			String value = null==keyValues[1]?null:decode(keyValues[1].trim(),"gbk");
			//转换成Map
			if(!parametMapValues.containsKey(key)){
				parametMapValues.put(key, new ArrayList<String>());
			}
			List<String> values = parametMapValues.get(key);
			values.add(value);
		}
	}
	
	public String getParameter(String name){
		String[] values = getParameterValues(name);
		if(null==values){
			return null;
		}
		return values[0];
	}
	
	public String[] getParameterValues(String name){
		List<String> values = null;
		if(null==(values = parametMapValues.get(name))){
			return null;
		}else{
			return values.toArray(new String[0]);
		}
	}
	
	//解决中文问题
	private String decode(String value,String code){
		try {
			return java.net.URLDecoder.decode(value, code);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public String getUrl() {
		return url;
	}
	
	

}
