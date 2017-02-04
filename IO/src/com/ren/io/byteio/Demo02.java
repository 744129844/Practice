package com.ren.io.byteio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Demo02 {
	
	public static void main(String[] args) {
		File dest = new File("D:/xp/test/a.txt");
		OutputStream os = null;
		try {
			os = new FileOutputStream(dest,true);
			String str = "\r\nasdfasdf";
			byte[] data = str.getBytes();
			os.write(data, 0, data.length);
			
			os.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(null!=os){
				try {
					os.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
		
	}

}
