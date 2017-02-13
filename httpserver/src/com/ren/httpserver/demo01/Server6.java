package com.ren.httpserver.demo01;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * HttpServer
 * @author RenJie
 *
 */
public class Server6 {
	
	private ServerSocket socket;
	public static void main(String[] args) {
		Server6 server = new Server6();
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
			Requset req = new Requset(server.getInputStream());	
			//响应
			Servlet serv = new Servlet();
			Response rep = new Response(server);
			serv.service(req, rep);
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
