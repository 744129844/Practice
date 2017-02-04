package com.ren.gen01;

import java.util.List;

public class Method {
	
	public static <T> void test(T t) {
		System.out.println(t);
	}
	
	public static <T extends List> void test(T t) {
		System.out.println(t);
		t.add("aaa");
	}
	
	public static void main(String[] args) {
		test("haha");
	}

}
