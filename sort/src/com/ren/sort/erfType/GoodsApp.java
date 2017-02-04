package com.ren.sort.erfType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GoodsApp {
	
	public static void main(String[] args) {
		List<Goods> list = new ArrayList<Goods>();
		list.add(new Goods(2000,100,"ma"));
		list.add(new Goods(20000,50,"gao"));
		list.add(new Goods(1000,0,"pei"));
		System.out.println("排序前："+list);
		Collections.sort(list,new GoodsPriceComp());
		System.out.println("排序后："+list);
	}

}
