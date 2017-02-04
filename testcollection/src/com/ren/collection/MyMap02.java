package com.ren.collection;
/**
 * 升级版
 * 1.提升查询效率
 * @author RenJie
 *
 */
public class MyMap02 {
	
	int ec = 999;
	MyLinkedList[] ea = new MyLinkedList[ec];
	int size;
	
	public void put(Object key,Object value) {
		MyEntry e = new MyEntry(key, value);
		int hash = key.hashCode();
		hash = hash<0? -hash:hash;
		int a = hash%ec;
		if (ea[a]==null) {
			ea[a].add(e);
		}else{
			MyLinkedList list = new MyLinkedList();
			ea[a] = list;
			ea[a].add(e);
		}
	}
	
	public Object get(Object key) {
		int a = key.hashCode()%ec;
		if (ea[a] != null) {
			for (int i = 0; i < ea[a].size(); i++) {
				if (((MyEntry)ea[a].get(i)).key.equals(key)) {
					return ((MyEntry)ea[a].get(i)).value;
				}
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		MyMap02 m = new MyMap02();
		m.put("gaoqi", "haha");
		m.put("zhangsan", "xixi");
		System.out.println(m.get("zhangsan"));
	}

}
