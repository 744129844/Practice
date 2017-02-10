package com.ren.net.tcp.chat.demo03;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

public class Server {

	public static void main(String[] args) throws UnknownHostException, IOException {
		new Server().start();
	}

	private List<MyChannel> mem = new ArrayList<MyChannel>();

	public void start() throws IOException {
		ServerSocket socket = new ServerSocket(9999);
		while (true) {
			Socket server = socket.accept();
			MyChannel channel = new MyChannel(server);
			mem.add(channel);
			new Thread(channel).start();
		}
	}

	private class MyChannel implements Runnable {

		private DataInputStream dis;
		private DataOutputStream dos;
		private boolean isRunning = true;

		public MyChannel(Socket server) {
			try {
				dis = new DataInputStream(server.getInputStream());
				dos = new DataOutputStream(server.getOutputStream());
			} catch (IOException e) {
				isRunning = false;
				CloseUtil.closeAll(dis, dos);
				mem.remove(this);
			}
		}

		private String receive() {
			String msg = null;
			try {
				msg = dis.readUTF();
			} catch (IOException e) {
				isRunning = false;
				CloseUtil.closeAll(dis);
				mem.remove(this);
			}
			return msg;
		}

		private void send(String msg) {
			if (msg != null) {
				try {
					dos.writeUTF(msg);
					dos.flush();
				} catch (IOException e) {
					isRunning = false;
					CloseUtil.closeAll(dos);
					mem.remove(this);
				}
			}
		}

		private void sendOthers() {
			String msg = receive();
			for (MyChannel temp : mem) {
				if (temp == this) {
					continue;
				}
				temp.send(msg);
			}
		}

		@Override
		public void run() {
			while (isRunning) {
				sendOthers();
			}
		}

	}

}
