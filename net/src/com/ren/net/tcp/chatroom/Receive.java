package com.ren.net.tcp.chatroom;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class Receive implements Runnable {
	
	//输入流
	private DataInputStream dis;
	//线程运行标志
	private boolean isRunning = true;
	
	public Receive() {
	}
	
	public Receive(Socket client) {
		try {
			dis = new DataInputStream(client.getInputStream());
		} catch (IOException e) {
			isRunning = false;
			CloseUtil.closeAll(dis);
		}
	}
	
	//接收数据
	public String receive(){
		String msg = null;
		try {
			msg = dis.readUTF();
		} catch (IOException e) {
			isRunning = false;
			CloseUtil.closeAll(dis);
		}
		return msg;
	}

	@Override
	public void run() {
		//线程体
		while(isRunning){
			System.out.println(receive());
		}
	}

}
