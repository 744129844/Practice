package com.ren.httpserver.demo01;

public class Servlet {
	
	public void service(Requset req,Response rep){
		rep.println("<html><head><title>HTTP响应实例</title>");
		rep.println("</head><body>");
		rep.println("欢迎：").println(req.getParameter("uname")).println("回来");
		rep.println("</body></html>");
	}

}
