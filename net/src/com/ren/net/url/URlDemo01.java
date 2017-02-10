package com.ren.net.url;

import java.net.MalformedURLException;
import java.net.URL;

public class URlDemo01 {
	
	public static void main(String[] args) throws MalformedURLException {
		URL u = new URL("https://www.baidu.com:80/index.html?uname=bjsxt");
		System.out.println("协议："+u.getProtocol());
		System.out.println("域名："+u.getHost());
		System.out.println("端口："+u.getPort());
		System.out.println("资源："+u.getFile());
		System.out.println("相对路径："+u.getPath());
		System.out.println("锚点："+u.getRef());
		System.out.println("参数："+u.getQuery());
		
		u = new URL("http://www.baidu.com:80/a/");
		u = new URL(u,"b.txt");
		System.out.println(u.toString());
	}

}
