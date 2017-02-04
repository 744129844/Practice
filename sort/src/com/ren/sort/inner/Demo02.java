package com.ren.sort.inner;

import java.util.Arrays;

public class Demo02 {
	
	public static void main(String[] args) {
		String[] arr = {"ab","b","a","c"};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void sort(String[] arr){
		for (int i = 0; i < arr.length-1; i++) {
			boolean t = true;
			for (int j = 0; j < arr.length-1-i; j++) {
				if(((Comparable)arr[j]).compareTo(arr[j+1])>0){
					String temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					t = false;
				}
			}
			if(t){
				return;
			}
		}
	}

}
