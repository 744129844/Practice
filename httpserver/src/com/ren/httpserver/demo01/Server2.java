package com.ren.httpserver.demo01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * HttpServer
 * @author RenJie
 *
 */
public class Server2 {
	
	private ServerSocket socket;

	public static void main(String[] args) {
		Server2 server = new Server2();
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
			
			StringBuilder sb = new StringBuilder();
			String msg = null;//接收客户端的请求信息
			byte[] data = new byte[20480];
			int len = server.getInputStream().read(data);
			
			String requestInfo =new String(data,0,len).trim();
			System.out.println(requestInfo);
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
