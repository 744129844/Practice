package com.ren.io.convert;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class ConvertDemo02 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(
						new FileInputStream(new File("D:/xp/test/a.txt")))
				);
		String info = null;
		while(null!=(info=br.readLine())){
			System.out.println(info);
		}
		br.close();
	}

}
