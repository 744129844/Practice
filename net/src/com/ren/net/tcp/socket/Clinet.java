package com.ren.net.tcp.socket;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Clinet {
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket client = new Socket("localhost", 8888);
//		BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
//		System.out.println(br.readLine());
		DataInputStream dis = new DataInputStream(client.getInputStream());
		System.out.println(dis.readUTF());
	}  

}
