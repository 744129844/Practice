package itetator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Text01 {
	
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		Set set = new HashSet();
		set.add("a");
		set.add("b");
		set.add("c");
		/*
		Iterator iter = set.iterator();
		while(iter.hasNext()){
			String str = (String)iter.next();
			System.out.println(str);
		}
		*/
		for (Iterator iter = set.iterator(); iter.hasNext();) {
			String str = (String) iter.next();
			System.out.println(str);
		}
	}

}
