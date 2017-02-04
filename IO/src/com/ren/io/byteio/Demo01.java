package com.ren.io.byteio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Demo01 {
	
	public static void main(String[] args) {
		File src = new File("D:/xp/test/a.txt");
		InputStream is = null;
		try {
			is = new FileInputStream(src);
			byte[] car = new byte[5];
			int len = 0;
			while(-1!=(len=is.read(car))){
				String info = new String(car,0,len);
				System.out.println(info);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(null!=is){
				try {
					is.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
