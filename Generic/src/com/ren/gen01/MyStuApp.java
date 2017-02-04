package com.ren.gen01;

public class MyStuApp {
	
	public static void main(String[] args) {
		MyStudent<Integer> stu = new MyStudent<Integer>();
		stu.setJavase(120);
		int s = stu.getJavase();
		System.out.println(s);
	}

}
