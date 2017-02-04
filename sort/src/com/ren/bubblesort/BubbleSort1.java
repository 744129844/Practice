package com.ren.bubblesort;

import java.util.Arrays;

public class BubbleSort1 {
	
	public static void main(String[] args) {
		int[] arr = {5,6,7,9,8};
		sort(arr);
	}
	
	public static void sort(int[] arr){
		for (int i = 0; i < arr.length-1; i++) {
			boolean t = true;
			System.out.println("第"+(i+1)+"趟：");
			for (int j = 0; j < arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					t = false;
				}
			System.out.println("第"+(j+1)+"次:"+Arrays.toString(arr));
			}
			if(t){
				return;
			}
		}
	}

}
