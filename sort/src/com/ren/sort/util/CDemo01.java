package com.ren.sort.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CDemo01 {
	
	public static void main(String[] args) {
		List<Integer> cards = new ArrayList<Integer>();
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		list.add(4);
//		list.add(5);
//		System.out.println(list);
//		Collections.reverse(list);
//		System.out.println(list);
//		Collections.shuffle(list);
//		System.out.println(list);
		for (int i = 0; i < 54; i++) {
			cards.add(i+1);
		}
		Collections.shuffle(cards);
		List<Integer> p1 = new ArrayList<Integer>();
		List<Integer> p2 = new ArrayList<Integer>();
		List<Integer> p3 = new ArrayList<Integer>();
		List<Integer> last = new ArrayList<Integer>();
		for (int i = 0; i < 51; i+=3) {
			p1.add(cards.get(i));
			p2.add(cards.get(i+1));
			p3.add(cards.get(i+2));
		}
		for (int i = 51; i < 54; i++) {
			last.add(cards.get(i));
		}
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(last);
	}

}
