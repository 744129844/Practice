package com.ren.io.Util;

import java.io.Closeable;
import java.io.IOException;

public class FileUtil {
	
	public static void close(Closeable ... io){
		for (Closeable temp : io) {
			if(null!=temp){
				try {
					temp.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public static<T extends Closeable> void closeAll(T ... io){
		for (Closeable temp : io) {
			if(null!=temp){
				try {
					temp.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
