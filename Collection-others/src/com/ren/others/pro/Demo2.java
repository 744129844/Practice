package com.ren.others.pro;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Demo2 {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties pro = new Properties();
		pro.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
		pro.setProperty("url", "jdbc:oracle:thin:@localhost:1521:orcl");
		pro.setProperty("user", "scott");
		pro.setProperty("pwd","tiger");
		
		pro.store(new FileOutputStream(new File("d:/others/db.properties")), "db配置");
		pro.storeToXML(new FileOutputStream(new File("d:/others/db.xml")), "db配置");
		
		pro.store(new FileOutputStream(new File("src/com/ren/others/pro/db.properties")), "db配置");
		pro.storeToXML(new FileOutputStream(new File("db.xml")), "db配置");
	}

}
