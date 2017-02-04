package com.ren.io.file;

import java.io.File;


public class Demo03 {
	
	public static void main(String[] args) {
		test2();
	}

	public static void test(){
		File src = new File("e:/shs/2.jpg");
		System.out.println(src.getParent());
	}
	
	public static void test2() {
		File src = new File("2.jpg");
		System.out.println(src.exists());
	}

}
