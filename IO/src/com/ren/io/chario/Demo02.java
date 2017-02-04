package com.ren.io.chario;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Demo02 {
	
	public static void main(String[] args) throws IOException {
		File dest = new File("D:/xp/test/a.txt");
		Writer wr = null;
		wr = new FileWriter(dest,true);
		String str = "\r\nhahahaha\r\n";
		wr.write(str);
		wr.append("a");
		wr.flush();
		if (null!=wr) {
			wr.close();
		}
	}

}
