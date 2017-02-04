package com.ren.collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test01 {
	
	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add("aaaa");
		list.add(new Date());
		list.add(1234); //包装类自动装箱
		
		List list2 = new ArrayList();
		
		list2.add("bbbb");
		list2.add("cccc");
		
		list.add(list2);
		
		System.out.println(list.size());
		
		String str = (String)list.get(0);
		System.out.println(str);
		
		list.set(1, "abc");
	}

}
