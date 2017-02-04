package com.ren.gen03;

import java.util.ArrayList;
import java.util.List;

public class WT {
	
	public static void main(String[] args) {
		
		List<?> list;
		list = new ArrayList<Integer>();
		list = new ArrayList<String>();
		test(list);
	}
	
	public static void test(List<?> list) {
		
	}
	
	class Test<T>{
		
	}

}
