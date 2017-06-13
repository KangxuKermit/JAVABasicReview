package com.kermit.set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		/**
		 * 底层是链表实现的，是set集合中唯一一个能保证怎么存，就怎么取的集合对象
		 * 因为是HashSet的子类，所以也是保证元素唯一的，原理一致
		 * 
		 * */
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.add("a");
		lhs.add("b");
		lhs.add("c");
		lhs.add("d");

	}

}
