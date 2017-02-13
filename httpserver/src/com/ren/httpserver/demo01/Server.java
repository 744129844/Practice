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
public class Server {
	
	private ServerSocket socket;

	public static void main(String[] args) {
		Server server = new Server();
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
			BufferedReader br = new BufferedReader(new InputStreamReader(server.getInputStream()));
			while((msg = br.readLine()).length()>0){
				sb.append(msg+"\r\n");
				if(null==msg){
					break;
				}
			}
			String requestInfo = sb.toString().trim();
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
