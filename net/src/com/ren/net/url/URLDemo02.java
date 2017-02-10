package com.ren.net.url;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;

public class URLDemo02 {
	
	public static void main(String[] args) throws IOException {
		URL u = new URL("https://www.baidu.com");
//		InputStream is = u.openStream();
//		byte[] flush = new byte[1024];
//		int len = 0;
//		while(-1!=(len=is.read(flush))){
//			System.out.println(new String(flush,0,len));
//		}
//		is.close();
		BufferedReader br = new BufferedReader(new InputStreamReader(u.openStream(), "utf-8"));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("baidu.html"),"utf-8"));
		String msg = null;
		while(null!=(msg=br.readLine())){
//			System.out.println(msg);
			bw.write(msg);
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
