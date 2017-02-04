package com.ren.io.bufferedbyteio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class BufferedCharDemo {
	public static void main(String[] args) throws IOException {
		File src = new File("D:/xp/test/a.txt");
		BufferedReader r = null;
		r = new BufferedReader(new FileReader(src));
		File dest = new File("D:/xp/test/a1.txt");
		BufferedWriter wr = null;
		wr = new BufferedWriter(new FileWriter(dest,true));
		/*
		char[] c = new char[1024];
		int len = 0;
		while(-1!=(len = r.read(c))){
			wr.write(c,0,len);	
		}
		*/
		
		String line = null;
		while(null!=(line=r.readLine())){
			wr.write(line);
			wr.newLine();
		}
		
		wr.flush();
		
		wr.close();
		r.close();
	}

}
