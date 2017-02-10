package com.ren.net.udp;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class Client {
	
	public static void main(String[] args) throws IOException {
		
		DatagramSocket client = new DatagramSocket(6666);
		double num = 89.12;
		byte[] data = convert(num);
		DatagramPacket packet = new DatagramPacket(data, data.length, new InetSocketAddress("localhost",8888));
		client.send(packet);
		client.close();
		
	}
	
	public static byte[] convert(double num) throws IOException{
		byte[] data = null;
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(bos);
		dos.writeDouble(num);
		dos.flush();
		data = bos.toByteArray();
		dos.close();
		return data;
	}

}
