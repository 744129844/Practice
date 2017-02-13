package com.ren.httpserver.demo01;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * HttpServer
 * @author RenJie
 *
 */
public class Server4 {
	
	private ServerSocket socket;
	public static void main(String[] args) {
		Server4 server = new Server4();
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
			
			byte[] data = new byte[20480];
			int len = server.getInputStream().read(data);
			
			String requestInfo =new String(data,0,len).trim();
			System.out.println(requestInfo);
			
			//响应
			
			Response rep = new Response(server);
			rep.println("<html><head><title>HTTP响应实例</title>");
			rep.println("</head><body>Hello Tomcat! hahahaha</body></html>");
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
