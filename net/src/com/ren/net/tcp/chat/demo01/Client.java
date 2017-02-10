package com.ren.net.tcp.chat.demo01;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Client {
	
	public static void main(String[] args) throws IOException {
		Socket client = new Socket("localhost", 9999);
		
		//控制台输入流
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		DataOutputStream dos = new DataOutputStream(client.getOutputStream());
		DataInputStream dis = new DataInputStream(client.getInputStream());
		
		String info = console.readLine();
		
		//输出流
		
		dos.writeUTF("客户端-->"+info);;
		dos.flush();
		
		//输入流
		
		String msg = dis.readUTF();
		System.out.println(msg);
	}

}
