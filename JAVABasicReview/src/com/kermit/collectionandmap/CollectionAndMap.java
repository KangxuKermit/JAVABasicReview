package com.kermit.collectionandmap;

public class CollectionAndMap {

	public static void main(String[] args) {

		/**
		 * Collection
		 * 		List 存取有序，有索引，可以重复
		 * 			ArrayList 
		 * 				底层是数组实现，线程不安全，查找和修改比较快，增删比较慢
		 * 			LinkedList 
		 * 				底层是链表实现，线程不安全，增删比较快，查找和修改比较慢
		 * 			Vector
		 * 				底层是数组实现，线程安全，增删改查都慢
		 * 			查找和修改多 用ArrayList
		 * 			增删多	   用LinkedList
		 * 			都多		   用ArrayList
		 * 		Set 存取无序，无索引，不可以重复
		 * 			HashSet
		 * 				底层是Hash算法实现
		 * 				LinkedHashSet
		 * 					底层是链表实现，也可以保证元素唯一，和HashSet原理一致
		 * 			TreeSet
		 * 				底层是二叉树算法实现
		 * 			一般在开发的时候不需要对存储的元素排序，所以在开发的时候大多数用HashSet，效率比较高
		 * 			TreeSet，重点掌握几种排序方式，以及区别
		 * 
		 * Map 
		 * 		HashMap		开发中用的比较多
		 * 			底层是Hash算法，针对键
		 * 			LinkedHashMap
		 * 				底层是链表，针对键
		 * 		TreeMap
		 * 			底层是二叉树，针对键
		 *
		 * 
		 * */
		
		
	}

}
