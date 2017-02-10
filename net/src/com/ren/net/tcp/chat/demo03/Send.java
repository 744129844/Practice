package com.ren.net.tcp.chat.demo03;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Send implements Runnable {
	
	//控制台输入流
	private BufferedReader console;
	//输出流
	private DataOutputStream dos;
	//线程运行标志
	private boolean isRunning = true;
	
	public Send() {
		console = new BufferedReader(new InputStreamReader(System.in));
	}
	
	public Send(Socket client) {
		this();
		try {
			dos = new DataOutputStream(client.getOutputStream());
		} catch (IOException e) {
			isRunning = false;
			CloseUtil.closeAll(dos,console);
		}
	}
	
	//从控制台获取信息
	private String getMsgFromConsole(){
		try {
			return console.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	//发送
	public void send(){
		String msg = getMsgFromConsole();
		if(null!=msg){
			try {
				dos.writeUTF(msg);
				dos.flush();
			} catch (IOException e) {
				isRunning = false;
				CloseUtil.closeAll(dos,console);
			}
		}
	}



	@Override
	public void run() {
		//线程体
		while(isRunning){
			send();
		}
	}

}
