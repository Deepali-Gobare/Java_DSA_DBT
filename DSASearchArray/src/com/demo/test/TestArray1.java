package com.demo.test;

public class TestArray1 {
	
	public static int FindMax() {
		int [] arr = {12,13,11,2,4,12};
		int Max = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>Max) {
				Max=arr[i];
			}
		}
		return Max;
	}
}
