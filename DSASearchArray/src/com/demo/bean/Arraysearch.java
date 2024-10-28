package com.demo.bean;

public class Arraysearch {
	public static int findMax(int[] arr) {
		int max =arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max) {
			max=arr[i];
			}
		//	System.out.println("maximum :" + max);	
		}
		
		return max;
	}

	
	public static int findMin(int[] arr) {
		int min =arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<min) {
			min=arr[i];
			}
//			System.out.println("maximum :" + min);	
		}
		
		return min;
	}
	
}
