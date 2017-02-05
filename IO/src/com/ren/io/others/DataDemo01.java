package com.ren.io.others;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataDemo01 {
	
	public static void main(String[] args) throws IOException {
		write("D:/xp/test/22.txt");
		read("D:/xp/test/22.txt");
	}
	
	public static void read(String srcPath) throws IOException{
		File src = new File(srcPath);
		DataInputStream ios = new DataInputStream(
				new BufferedInputStream(
						new FileInputStream(src)
						)
				);
		double point = ios.readDouble();
		long num = ios.readLong();
		String str = ios.readUTF();
		ios.close();
		System.out.println(point+"|"+num+"|"+str);
	}
	
	public static void write(String destPath) throws IOException{
		double point = 2.5;
		long num = 100L;
		String str = "alkfjlaskjf";
		File dest = new File(destPath);
		DataOutputStream dos = new DataOutputStream(
				new BufferedOutputStream(
						new FileOutputStream(dest)
						)
				);
		dos.writeDouble(point);
		dos.writeLong(num);
		dos.writeUTF(str);
		dos.flush();
		dos.close();
	}

}
