package com.ren.others.three;

import java.util.EnumMap;

public class EnumMapDemo {
	
	public static void main(String[] args) {
		EnumMap<Season,String> map = new EnumMap<Season,String>(Season.class);
		map.put(Season.SPRING, "1");
		map.put(Season.SUMMER, "2");
		map.put(Season.AUTUMN, "3");
		map.put(Season.WINTER, "4");
		System.out.println(map.size());
	}

}

enum Season{
	SPRING,SUMMER,AUTUMN,WINTER
}
