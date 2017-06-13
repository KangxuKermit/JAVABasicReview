package com.kermit.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class ListDemo {

	public static void main(String[] args) {

		/**
		 * List 三个子类的特点
		 * 
		 * ArrayList：
		 * 		底层数据结构是数组，查询快，增删慢，线程不安全，效率高
		 * Vector:
		 * 		底层数据结构是数组，查询快，增删慢，线程安全，效率低
		 * Vector 相对 ArrayList 查询慢，线程安全
		 * Vector 相对 LinkedList 增删慢，数组结构
		 * 
		 * LinkedList:
		 * 		底层数据结构是链表，查询慢，增删快，线程不安全，效率高
		 * 
		 * 
		 * Vector 和 ArrayList的区别：【都是数组结构】
		 * 		Vector 线程安全，效率低
		 * 		ArrayList 线程不安全，效率高
		 * 
		 * ArrayList 和 LinkedList的区别：【都是线程不安全】
		 * 		ArrayList底层是数组结构，查询和修改快
		 * 		LinkedList底层是链表结构，增删比较快，查询和修改比较慢
		 * 
		 * 查询多用ArrayList
		 * 增删多用LinkedList
		 * 都多，用ArrayList
		 * 
		 * */
		
//		basicList();
		
		
		linkedList();
		
		
		
		
	}

	
	public static void linkedList() {
		LinkedList list = new LinkedList();
		list.addFirst("a");
		list.addFirst("b");
		list.addFirst("c");
		list.addFirst("d");
		list.addLast("e");
		System.out.println(list);
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		
		System.out.println(list.removeFirst());
		System.out.println(list.removeLast());
		System.out.println(list);
		
		System.out.println(list.get(2));
	}

	public static void basicList() {
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add(1, "e");	// index <= size && index >=0
//		list.add(10,"g");	// IndexOutOfBoundsException
		list.add(3);
		System.out.println(list);
		System.out.println(list.remove(1));	// 将被删除的 元素 返回，删除的时候不会自动装箱，数字就是索引
		System.out.println(list);
		System.out.println(list.get(1));		// 获取索引1处的元素 
		list.set(1, 10);		// 修改指定位置元素
		System.out.println(list);
	}

}
