package com.ren.others.synread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo01 {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		
		List<String> synList = Collections.synchronizedList(list);
	}

}
