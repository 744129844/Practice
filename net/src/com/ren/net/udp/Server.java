package com.ren.net.udp;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Server {
	
	public static void main(String[] args) throws IOException {
		
		DatagramSocket server = new DatagramSocket(8888);
		byte[] container = new byte[1024];
		DatagramPacket packet = new DatagramPacket(container, container.length);
		server.receive(packet);
		double data = convert(packet.getData());
		int len = packet.getLength();
		System.out.println(data);
		server.close();
		
	}
	
	public static double convert(byte[] data) throws IOException{
		DataInputStream dis = new DataInputStream(new ByteArrayInputStream(data));
		double num = dis.readDouble();
		dis.close();
		return num;	
	}

}
