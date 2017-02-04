package com.ren.io.chario;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class CopyFileDemo {
	
	public static void main(String[] args) throws IOException {
		File src = new File("D:/xp/test/a.txt");
		Reader r = null;
		r = new FileReader(src);
		File dest = new File("D:/xp/test/aaa.txt");
		Writer wr = null;
		wr = new FileWriter(dest,true);
		char[] c = new char[1024];
		int len = 0;
		while(-1!=(len = r.read(c))){
			wr.write(c,0,len);	
		}
		wr.flush();
		
		wr.close();
		r.close();
	}

}
