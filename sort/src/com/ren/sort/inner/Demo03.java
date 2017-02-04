package com.ren.sort.inner;

import java.util.Arrays;
import java.util.Date;

public class Demo03 {
	public static void main(String[] args) {
		Date[] arr = new Date[3];
		arr[0] = new Date();
		arr[1] = new Date(System.currentTimeMillis()-1000*60*60);
		arr[2] = new Date(System.currentTimeMillis()+1000*60*60);
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void sort(Date[] arr){
		for (int i = 0; i < arr.length-1; i++) {
			boolean t = true;
			for (int j = 0; j < arr.length-1-i; j++) {
				if(((Comparable)arr[j]).compareTo(arr[j+1])>0){
					Date temp = arr[j];
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
