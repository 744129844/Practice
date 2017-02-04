package com.ren.io.chario;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Demo01 {
	
	public static void main(String[] args) throws IOException {
		File src = new File("D:/xp/test/a.txt");
		Reader r = null;
		r = new FileReader(src);
		char[] c = new char[1024];
		int len = 0;
		while(-1!=(len = r.read(c))){
			String str = new String(c,0,len);
			System.out.println(str);
		}
		if (null!=r) {
			r.close();
		}
	}

}
