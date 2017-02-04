package com.ren.io.file;

import java.io.File;
import java.util.Arrays;

public class Demo05 {
	
	public static void main(String[] args) {
		String path = "d:/xp";
		File parent = new File(path);
		printN(parent);
		
		File[] roots = parent.listRoots();
		System.out.println(Arrays.toString(roots));
	}
	
	public static void printN(File file){
		if(null==file||!file.exists()){
			return;
		}
		System.out.println(file.getAbsolutePath());
		if(file.isDirectory()){
			for (File sub : file.listFiles()) {
				printN(sub);
			}
		}
	}

}
