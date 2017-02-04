package com.ren.io.file;

import java.io.File;

public class Demo02 {
	
	public static void main(String[] args) {
		String parentPath = "e:/shs/";
		String name = "2.jpg";
		File src = new File(parentPath, name);
		src = new File(new File(parentPath),name);
		System.out.println(src.getName());
		System.out.println(src.getPath());
		
		src = new File("e:/shs/2.jpg");
		
		src = new File("Test.txt");
		System.out.println(src.getAbsolutePath());
	}

}
