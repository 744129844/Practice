package com.ren.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * 自己实现ArrayList
 * @author RenJie
 *
 */
public class MyArrayList/*implements List*/ {
	
	private Object[] elementData;
	
	private int size;
	
	public void add(Object obj) {
		ensuresize(size+1);
		elementData[size++]=obj;
	}
	
	public void add(int index,Object obj) {
		if (index>size||index<0) {
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		ensuresize(size+1);
		System.arraycopy(elementData, index, elementData, index+1, size-index);
		elementData[index] = obj;
		size++;
	}
	
	private void ensuresize(int size) {
		if (size>elementData.length) {
			Object[] newData = new Object[size*2+1];
			System.arraycopy(elementData, 0, newData, 0, elementData.length);
			elementData = newData;
		}
	}
	
	public int size() {
		return size;
	}
	
	public MyArrayList() {
		this(10);
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public Object get(int index) {
		rangeCheck(index);
		return elementData[index];
	}
	
	public void remove(int index) {
		rangeCheck(index);
		int numMoved = size-index-1;
		if (numMoved>0){
			System.arraycopy(elementData, index+1, elementData, index, numMoved);
			elementData[--size] = null;
		}
	}
	
	public void remove(Object obj) {
		for (int i = 0; i < size; i++) {
			if (get(i).equals(obj)) {
				remove(i);
			}
		}
	}
	
	public Object set(int index,Object obj) {
		rangeCheck(index);
		Object oldValue = elementData[index];
		elementData[index] = obj;
		return oldValue;
	}
	
	private void rangeCheck(int index) {
		if (index >= size) {
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public MyArrayList(int initialCapacity) {
		if (initialCapacity<0) {
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		elementData = new Object[initialCapacity];
	}
	
	public static void main(String[] args) {
		MyArrayList list = new MyArrayList(2);
		list.add("22222");
		list.add("22222");
		list.add("22222");
		System.out.println(list.size());
		list.get(2);
	}

}
