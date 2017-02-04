package com.ren.io.bufferedbyteio;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedByteDemo {
	public static void main(String[] args) {
		String src = "D:/xp/test/1.jpg";
		String dest = "D:/xp/test/10.jpg";
		try {
			copyFile(src,dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void copyFile(String srcPath,String destPath) throws IOException {
		File src = new File(srcPath);
		File dest = new File(destPath);
		if (! src.isFile()) {
			System.out.println("?");
			return;
		}
		InputStream is = new BufferedInputStream(new FileInputStream(src));
		OutputStream os = new BufferedOutputStream(new FileOutputStream(dest));
		
		byte[] flush = new byte[1024];
		int len = 0;
		while(-1!=(len=is.read(flush))){
			os.write(flush, 0, len);
		}
		os.flush();
		
		os.close();
		is.close();
	}

}
