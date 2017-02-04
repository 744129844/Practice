package com.ren.iterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Test01 {
	
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("111");
		list.add("222");
		list.add("333");
		/*
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		*/
		Set set = new HashSet();
		set.add("123");
		set.add("321");
		/*
		Iterator iter = set.iterator();
		while (iter.hasNext()){
			String str = (String)iter.next();
			System.out.println(str);
		}
		*/
		for (Iterator iter = set.iterator();iter.hasNext();) {
			String str = (String)iter.next();
			System.out.println(str);
		}
	}

}
