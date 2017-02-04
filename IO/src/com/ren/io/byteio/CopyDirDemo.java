package com.ren.io.byteio;

import java.io.File;
import java.io.IOException;

public class CopyDirDemo {
	
	public static void main(String[] args) {
		String srcPath = "d:/xp";
		String destPath = "D:/硕鼠";
		try {
			FileUtil.copyDir(srcPath, destPath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
