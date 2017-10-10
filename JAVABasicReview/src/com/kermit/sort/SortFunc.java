package com.kermit.sort;

import java.util.ArrayList;

public class SortFunc {

	public static void main(String[] args) {
		
		int[] array = {11,33,22,88,44};
//		bubbleSort(array);
		selectionSort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		
		// JDK1.5+
		for (int i : array) {
			System.out.println(i);
		}
		
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		for (String string : list) {
			System.out.println(string);
		}
		
	}
	
	public static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if (arr[j] > arr[j+1]) {
					arr[j] = arr[j] + arr[j+1];
					arr[j+1] = arr[j] - arr[j+1];
					arr[j] = arr[j] - arr[j+1];
				}
			}
		}
	}
	
	public static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					arr[j] = arr[j] + arr[i];
					arr[i] = arr[j] - arr[i];
					arr[j] = arr[j] - arr[i];
				}
			}
		}
	}
	
	
	public static void sort(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i; j < arr.length-1; j++) {
				if (arr[j] > arr[j+1]) {
					arr[j] = arr[j] + arr[j+1];
					arr[j+1] = arr[j] - arr[j+1];
					arr[j] = arr[j] - arr[j+1];
				}
			}
		}
	}
	

	public int show(int i) {
		return i;
	}
}
