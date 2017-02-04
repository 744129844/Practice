package com.ren.io.others;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class ByteArrayDemo01 {
	
	public static void main(String[] args) throws IOException {
		read();
	}
	
	public static byte[] write() throws IOException{
		byte[] dest;
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		String msg = "lasjdfhlasud";
		byte[] info = msg.getBytes();
		bos.write(info, 0 , info.length);
		
		dest = bos.toByteArray();
		bos.close();
		return dest;
	}
	
	public static void read() throws IOException{
		String msg = "ahahha";
		byte[] src = msg.getBytes();
		
		InputStream is = new BufferedInputStream(new ByteArrayInputStream(src));
		byte[] flush = new byte[1024];
		int len = 0;
		while(-1!=(len=is.read(flush))){
			System.out.println(new String(flush,0,len));
		}
		is.close();
	}

}
