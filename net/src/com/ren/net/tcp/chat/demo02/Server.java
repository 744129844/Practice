package com.ren.net.tcp.chat.demo02;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Server {
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		ServerSocket socket = new ServerSocket(9999);
		Socket server = socket.accept();
		DataInputStream dis = new DataInputStream(server.getInputStream());
		DataOutputStream dos = new DataOutputStream(server.getOutputStream());

		while (true) {
			String msg = dis.readUTF();
			System.out.println(msg);
			dos.writeUTF("服务器-->客户端：" + msg);
			dos.flush();
		}
	}

}
