package com.ren.net.tcp.socket;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiServer {
	
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(8888);
		while(true){
			Socket socket = server.accept();
			System.out.println("一个客户端等待连接");
			String msg = "Hello!";
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			dos.writeUTF(msg);
			dos.flush();
		}
	}

}
