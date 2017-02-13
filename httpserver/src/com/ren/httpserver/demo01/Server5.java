package com.ren.httpserver.demo01;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * HttpServer
 * @author RenJie
 *
 */
public class Server5 {
	
	private ServerSocket socket;
	public static void main(String[] args) {
		Server5 server = new Server5();
		server.start();

	}
	
	/**
	 * 启动方法
	 */
	public void start() {	
		try {
			socket = new ServerSocket(8888);	
			this.receive();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 接收客户端
	 */
	private void receive() {
		try {
			Socket server = socket.accept();
			//请求
			String s = "";
			s ="1";
			Requset req = new Requset(server.getInputStream());
			
			
			
			//响应
			Response rep = new Response(server);
			rep.println("<html><head><title>HTTP响应实例</title>");
			rep.println("</head><body>");
			rep.println("欢迎：").println(req.getParameter("uname")).println("回来");
			rep.println("</body></html>");
			rep.pushToClient(200);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 停止方法 
	 */
	public void stop(){
		
	}

}
