package com.ren.others.pro;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Demo03 {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties pro = new Properties();
		pro.load(new FileReader("d:/others/db.properties"));
		System.out.println(pro.getProperty("user", "bjsxt"));
	}

}
