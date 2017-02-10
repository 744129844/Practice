package com.ren.net.ip;

import java.net.InetAddress;
import java.net.InetSocketAddress;

public class InetSocketDemo01 {
	
	public static void main(String[] args) {
		InetSocketAddress isa = new InetSocketAddress("localhost",9999);
		System.out.println(isa.getHostName());
		System.out.println(isa.getPort());
		InetAddress add = isa.getAddress();
		System.out.println(add.getHostName());
		System.out.println(add.getHostAddress());
	}

}
