package com.kermit.collectionandmap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.TreeSet;

import com.kermit.tool.Person;

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
		
//		arrayList();
		
//		linkedList();
		
//		hashSet();
		
//		treeSet();
		
		
		
		
	}

	public static void treeSet() {
		/**
		 * TreeSet 用来对集合进行排序，并且能保证元素唯一
		 * 
		 * */
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(3);
		ts.add(1);
		ts.add(1);
		ts.add(2);
		ts.add(3);
		System.out.println(ts);
		
		/**
		 * Person 实现Comparable接口，重写compareTo方法
		 * compareTo 方法返回0的时候集合中只有一个元素
		 * compareTo 方法返回正数的时候怎么存就怎么取
		 * compareTo 方法返回负数的时候倒序存储
		 * 
		 * */
		TreeSet<Person> ts1 = new TreeSet<>();
		ts1.add(new Person("11", 20));
		ts1.add(new Person("22", 21));
		ts1.add(new Person("33", 22));
		ts1.add(new Person("44", 23));
		System.out.println(ts1);
		
		// 比较器排序
		TreeSet<String> ts2 = new TreeSet<>(new ComparaByLen());
		ts2.add("aaaaa");
		ts2.add("ssss");
		ts2.add("ccc");
		ts2.add("dd");
		System.out.println(ts2);
	}
	
	public static void hashSet() {
		HashSet<String> hs = new HashSet<>();
		System.out.println(hs.add("a"));
		System.out.println(hs.add("a"));	// 当向set集合中存储重复元素的时候返回false
		System.out.println(hs.add("b"));
		System.out.println(hs);				// 继承体系中有重写 toString 方法
		
		// 只要能用迭代器迭代的，就可以用增强for循环遍历
		for (String string : hs) {
			System.out.println(string);
		}
		
		HashSet<Person> hsP = new HashSet<>();
		hsP.add(new Person("张三", 10));	// 先调用hashCode方法比较，值一样，再调用equals方法比较
		hsP.add(new Person("张三", 10));
		hsP.add(new Person("小一", 11));
		hsP.add(new Person("十二", 12));
		hsP.add(new Person("十三", 13));
		System.out.println(hsP);
	}
	
	public static void linkedList() {
		LinkedList<String> list = new LinkedList<>();
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

	public static void arrayList() {
		ArrayList<String> arr1 = new ArrayList<>();
		arr1.add("a");
		arr1.add("b");
		arr1.add("c");
		arr1.add("abc");
		
		ArrayList<String> arr2 = new ArrayList<>();
		arr2.add("1");
		arr2.add("2");
		arr2.add("3");
		arr2.add("123");
		arr2.addAll(arr1);
		
		System.out.println(arr1.size());
		System.out.println(arr1.contains("a"));
		System.out.println(arr1.containsAll(arr2));
		System.out.println(arr1.retainAll(arr2));	// 取交集 如果调用的集合(c1)改变了就返回true，没改变就返回false
		System.out.println(arr1.isEmpty());
		System.out.println(arr2);
		
		String[] strArr = arr1.toArray(new String[0]);
		for (String string : strArr) {
			System.out.println(string);
		}
		
		Iterator<String> it1 = arr1.iterator();
		while (it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		System.out.println(arr2.get(2));
		System.out.println(arr2.remove(2));	// 2 为索引，不会自动装箱
		arr2.set(0, "457");
		System.out.println(arr2);
		
		
		ArrayList<String> arr3 = new ArrayList<>();
		arr3.add("a");
		arr3.add("b");
		arr3.add("c");
		arr3.add("world");
		arr3.add("d");
		arr3.add("e");
		
		ListIterator<String> it3 =  arr3.listIterator();
		while (it3.hasNext()) {
			String s = (String)it3.next();
			if (s.equals("wotld")) {
//				list.add("javaee");	// ConcurrentModificationException 遍历的同时在增加元素，并发修改
				it3.add("javaee");
			}
		}
		System.out.println(arr3);
		while (it3.hasPrevious()) {		// 从后向前 遍历
			System.out.println(it3.previous());	// 往前移
		}
		
		
		
	}
	
}

class ComparaByLen implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		int num = o1.length() - o2.length();
		return num == 0 ? o1.compareTo(o2) : num;
	}

}
