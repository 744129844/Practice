package com.ren.net.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class MyClient {
	
	public static void main(String[] args) throws IOException {
		
		DatagramSocket client = new DatagramSocket(6666);
		String msg = "UDP Programing";
		byte[] data = msg.getBytes();
		DatagramPacket packet = new DatagramPacket(data, data.length, new InetSocketAddress("localhost",8888));
		client.send(packet);
		client.close();
		
	}

}
