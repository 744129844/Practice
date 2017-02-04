package com.ren.io.file;

import java.io.File;
import java.io.FilenameFilter;

public class Demo04 {
	
	public static void main(String[] args) {
		test3();
	}
	
	public static void test3(){
		String path = "d:/xp/test";
		File src = new File(path);
		File[] subFile = src.listFiles();
		subFile = src.listFiles(new FilenameFilter(){

			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				return new File(dir,name).isFile()&&name.endsWith(".txt");
			}
			
		});
		for (File file : subFile) {
			System.out.println(file.getAbsolutePath());
		}
	}
	
	public static void test2(){
		String path = "d:/xp/test";
		File src = new File(path);
		if(src.isDirectory()){
			String[] subNames = src.list();
			for (String temp : subNames) {
				System.out.println(temp);
			}
			
			File[] subFile = src.listFiles();
			for (File file : subFile) {
				System.out.println(file.getAbsolutePath());
			}
		}
	}

	
	public static void test(){
		String path = "d:/xp/test";
		File src = new File(path);
		//src.mkdir();
		src.mkdirs();
	}

}
