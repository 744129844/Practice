package com.ren.io.others;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class PrintStreamDemo01 {
	
	public static void main(String[] args) throws FileNotFoundException {
		System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream("D:/xp/test/22.txt")),true));
		System.out.println("asdfasdf");
		//System.out.flush();
		System.out.close();
	}
	
	public static void test02() throws FileNotFoundException{
		InputStream is = System.in;
		is = new BufferedInputStream(new FileInputStream("D:/xp/test/a.txt"));
		Scanner sc = new Scanner(is);
		System.out.println(sc.next());
	}
	
	public static void test1(){
		Scanner sc = new Scanner(System.in);
		System.out.println("shuru");
		System.out.println(sc.next());
	}
	
	public static void printout(){
		System.out.println("test");
		System.err.println("err");
	}
	
	public static void printin() throws FileNotFoundException{
		System.out.println("test");
		PrintStream ps = System.out;
		ps.println("test2");
		String src = "D:/xp/test/222.txt";
		ps = new PrintStream(new BufferedOutputStream(new FileOutputStream(src)));
		ps.print("hahahah");
		ps.close();
	}

}
