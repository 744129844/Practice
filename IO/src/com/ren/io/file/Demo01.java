package com.ren.io.file;

import java.io.File;

public class Demo01 {
	
	public static void main(String[] args) {
		System.out.println(File.pathSeparator);
		System.out.println(File.separator);
		
		String path = "e:\\shs\\2.jpg";
		path = "e:"+File.separator+"shs"+File.separator+"2.jpg";
		path = "e:/shs/2.jpg";
	}

}
