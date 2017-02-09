package com.ren.io.others;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RndDemo01 {
	
	public static void main(String[] args) throws IOException {
		RandomAccessFile rnd = new RandomAccessFile(new File("D:/xp/test/a.txt"), "r");
		rnd.seek(5);
		
		byte[] flush = new byte[20];
		int len = 0;
		while(-1!=(len=rnd.read(flush))){
//			if(len>=20){
//				System.out.println(new String(flush,0,20));
//			}else{
				System.out.println(new String(flush,0,len));
//			}
		}
		rnd.close();
		SplitFile sf = new SplitFile("D:/xp/test/a.txt", 20);
		sf.split("D:/xp/test/");
		sf.mergeFile("D:/xp/test/111.txt");
	}

}
