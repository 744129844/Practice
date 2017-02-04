package com.ren.others.synread;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo02 {
	
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("1", "1");
		map.put("2", "2");
		
		Map<String,String> map1 = Collections.unmodifiableMap(map);
		//map1.put("3", "3");
		System.out.println(map1.size());
		
		List<String> list = Collections.singletonList("1");
		System.out.println(list);
		//list.add("2");
		
	}

}
