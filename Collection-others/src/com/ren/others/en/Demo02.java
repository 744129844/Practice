package com.ren.others.en;

public class Demo02 {
	
	public static void main(String[] args) {
		MyStack<String> backHistory = new MyStack<String>(3);
		backHistory.push("www.baidu.com");
		backHistory.push("www.google.com");
		backHistory.push("www.sina.com");
		backHistory.push("www.360.com");
		System.out.println(backHistory.size());
		String item = null;
		while (null!= (item = backHistory.pop())) {
			System.out.println(item);
		}
	}

}
