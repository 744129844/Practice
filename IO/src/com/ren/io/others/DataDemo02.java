package com.ren.io.others;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataDemo02 {
	
	public static void main(String[] args) throws IOException {
		byte[] jj = write();
		read(jj);
	}
	
	public static void read(byte[] src) throws IOException{
		ByteArrayInputStream bis = new ByteArrayInputStream(src);
		DataInputStream dis = new DataInputStream(
				new BufferedInputStream(bis)
				);
		double point = dis.readDouble();
		long num = dis.readLong();
		String str = dis.readUTF();
		dis.close();
		bis.close();
		System.out.println(point+"|"+num+"|"+str);
	}
	
	public static byte[] write() throws IOException{
		double point = 2.5;
		long num = 100L;
		String str = "alkfjlaskjf";
		byte[] dest = null;
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(
				new BufferedOutputStream(bos)
				);
		dos.writeDouble(point);
		dos.writeLong(num);
		dos.writeUTF(str);
		dos.flush();
		dest = bos.toByteArray();
		dos.close();
		bos.close();
		return dest;
	}

}
