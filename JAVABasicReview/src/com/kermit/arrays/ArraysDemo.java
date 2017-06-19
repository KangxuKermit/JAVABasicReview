package com.kermit.arrays;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {

		int[] arr = {1,30,22,56,33,88};
		
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println(Arrays.toString(arr));
		
		// 二分法查找  
		System.out.println(Arrays.binarySearch(arr, 22));	// 1
		System.out.println(Arrays.binarySearch(arr, 55));	// -5	-(index+1)
		
		
		
	}

}
