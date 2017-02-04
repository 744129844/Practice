package com.ren.collection;

public class MyLinkedList /*implements List*/ {
	
	private Node first;
	private Node last;
	
	private int size;
	
	public void add(Object obj){
		Node n = new Node();
		if (first == null) {
			n.setPrevious(null);
			n.setObj(obj);
			n.setNext(null);
			
			first = n;
			last = n;
		}else{
			n.setPrevious(last);
			n.setObj(obj);
			n.setNext(null);
			
			last.setNext(n);
			
			last = n;
		}
		size++;
	}
	
	public int size(){
		return size;
	}
	
	public Node node(int index) {
		rangeCheck(index);
		Node temp = null;
		if (first != null) {
			if (index > (size >> 1)) {
				temp = first;
				for (int i = 0; i < index; i++) {
					temp = temp.next;
				}
			} else {
				temp = last;
				for (int i = size-1; i >=0; i--) {
					temp = temp.previous;
			}		
			}
		}
		return temp;
	}
	
	public Object get(int index) {
		return node(index).obj;
	}
	
	public void remove(int index) {
		rangeCheck(index);
		Node temp = node(index);
		if(index == 0){
			first = temp.next;
		}else{
			temp.previous.next = temp.next;
		}
		if(index == size-1){
			last = temp.previous;
		}else{
			temp.next.previous = temp.previous;
		}
		size--;
	}
	
	public void add(int index, Object obj) {
		rangeCheck(index);
		Node temp = node(index);
		Node newnode = new Node();
		newnode.obj = obj;
		/*特殊情况的实现有待完善
		if (index == 0) {
			temp.previous = newnode;
			first = newnode;
		}else{
			temp.previous.next = newnode;
			newnode.previous = temp.previous;
		}
		if (index == size){
			temp = last;
			temp.next = newnode;
			newnode.previous = temp;
			last = newnode;
		}else{
			temp.previous = newnode;
			newnode.next = temp;
		}
		*/
		temp.previous.next = newnode;
		newnode.previous = temp.previous;
		temp.previous = newnode;
		newnode.next = temp;
		size++;
		
	}
	
	private void rangeCheck(int index) {
		if (index>=size||index<0) {
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("ddd");
		list.add("eee");
		System.out.println(list.get(3));
	}

}
