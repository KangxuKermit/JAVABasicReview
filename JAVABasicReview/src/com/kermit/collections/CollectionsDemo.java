package com.kermit.collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {

	public static void main(String[] args) {

		/**
		 * * A:Collections类概述
		 * 针对集合操作 的工具类
		 * B:Collections成员方法
		 * 
			public static <T> void sort(List<T> list)					// 排序
			public static <T> int binarySearch(List<?> list,T key)		// 二分查找法
			public static <T> T max(Collection<?> coll)			
			public static void reverse(List<?> list)					// 集合反转
			public static void shuffle(List<?> list)					// 随机排序
		 * 
		 * */
		
		ArrayList<String> list = new ArrayList<>();
		list.add("c");
		list.add("d");
		list.add("b");
		list.add("h");
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		System.out.println(Collections.binarySearch(list, "a"));
		System.out.println(Collections.binarySearch(list, "d"));
		
		System.out.println(Collections.max(list));
		Collections.reverse(list);
		System.out.println(list);
		
		Collections.shuffle(list);
		System.out.println(list);
	}

}
