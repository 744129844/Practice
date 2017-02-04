package com.ren.collection;
/**
 * 自定义实现Map功能
 * 暂时不完美
 * 键不能重复
 * @author RenJie
 *
 */
public class MyMap01 {
	
	MyEntry[] ea = new MyEntry[999];
	int size;
	
	public void put(Object key,Object value) {
		for (int i = 0; i < size; i++) {
			if(ea[i].key.equals(key)) {
				ea[i].value = value;
				return;
			}
		}
		MyEntry e = new MyEntry(key, value);
		ea[size++] = e;
	}
	
	public Object get(Object key) {
		for (int i = 0; i < size; i++) {
			if (ea[i].key.equals(key)) {
				return ea[i].value;
			}
		}
		return null;
	}
	
	public void remove(Object key) {
		
	}
	
	public boolean containKey(Object key) {
		for (int i = 0; i < size; i++) {
			if (ea[i].key.equals(key)) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		MyMap01 m = new MyMap01();
		m.put("gaoqi", "haha");
		m.put("zhangsan", "xixi");
		System.out.println(m.get("zhangsan"));
	}

}
