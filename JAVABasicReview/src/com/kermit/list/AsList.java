package com.kermit.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AsList {

	public static void main(String[] args) {

		// 数组转集合，不能增加和减少元素，但是可以用集合的思想操作数组
		String[] arr = {"a","b","c","d"};
		List<String> list = Arrays.asList(arr);	// 数组转集合
		System.out.println(list);		// [a, b, c, d]
		
		
		int[] arr1 = {11,12,33,44};	// 基本数据类型数组转成集合，会将整个数组当成一个对象
		List<int[]> list1 = Arrays.asList(arr1);	// 数组对象
		System.out.println(list1);		// [[I@7852e922]
		
		Integer[] arr2 = {11,12,33,44};
		List<Integer> list2 = Arrays.asList(arr2);
		System.out.println(list2);		// [11, 12, 33, 44]
		
		
		// 集合转数组 带泛型
		ArrayList<String> arrList = new ArrayList<>();
		arrList.add("a");
		arrList.add("b");
		arrList.add("c");
		arrList.add("d");
		arrList.add("e");
		String[] array = arrList.toArray(new String[0]);	
		// 数组长度小于等于集合的size时，转换后的数组长度等于集合长度
		// 数组长度大于集合size时，分配的数组长度就和指定的长度一样
		for (String string : array) {
			System.out.println(string);
		}
		
		
		
 	}

}
