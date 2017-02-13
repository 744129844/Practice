package com.ren.httpserver.demo01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
 * HttpServer
 * @author RenJie
 *
 */
public class Server3 {
	
	private ServerSocket socket;
	private final String CRLF = "\r\n";
	private final String BLANK = " ";

	public static void main(String[] args) {
		Server3 server = new Server3();
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
			
			//响应
			StringBuilder responseContext = new StringBuilder();
			responseContext.append("<html><head><title>HTTP响应实例</title>"
					+ "</head><body>Hello Tomcat!</body></html>");
			StringBuilder response = new StringBuilder();
			response.append("HTTP/1.1").append(BLANK).append("404").append(BLANK).append("OK").append(CRLF);
			response.append("Servser:Ren Server/0.0.1").append(CRLF);
			response.append("Date:").append(new Date()).append(CRLF);
			response.append("Content-type:text/html;charset=UTF-8").append(CRLF);
			response.append("Content-Length:").append(responseContext.toString().getBytes().length).append(CRLF);
			response.append(CRLF);
			response.append(responseContext);
			
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(server.getOutputStream()));
			bw.write(response.toString());
			bw.flush();
			bw.close();
			
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
