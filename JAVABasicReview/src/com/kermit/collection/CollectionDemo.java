package com.kermit.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

//		arraylistDemo();

//		addDemo();
		
		Collection c1 = new ArrayList();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add("d");
		
		Collection c2 = new ArrayList();
		c2.add("a");
		c2.add("b");
		
		c1.removeAll(c2);	// 删除的是交集
		System.out.println(c1);
		
		System.out.println(c1.containsAll(c2));	// 判断调用的集合是否包含传入的集合
		
		System.out.println(c1.retainAll(c2));	// 取交集 如果调用的集合(c1)改变了就返回true，没改变就返回false
		System.out.println(c1);
		
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void addDemo() {
		Collection c1 = new ArrayList();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add("d");
		
		Collection c2 = new ArrayList();
		c2.add("a");
		c2.add("b");
		c2.add("c");
		c2.add("d");
		
		c1.addAll(c2);	// 将 c2中每个元素 添加到 c1 中
		System.out.println(c1);
		c1.add(c2);		// 将 c2看成对象 添加到 c1 中
		System.out.println(c1);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void arraylistDemo() {
		Collection c = new ArrayList();
		boolean b1 = c.add("abc");	// add方法，如果是List方法一直返回true，如果是Set集合，当存储重复元素的时候就会返回false
		boolean b2 = c.add(true);	// 自动装箱 new Boolean(true);
		System.out.println(c);		// ArrayList的父类的父类重写toString方法，所以打印对象引用的时候输出的不是地址值
		
		c.remove("abc");
		System.out.println(c);
		
		System.out.println(c.size());
		c.clear();
		System.out.println(c);
		System.out.println(c.contains("abc"));
		System.out.println(c.isEmpty());
		
		c.add("a");
		c.add("b");
		c.add("c");
		c.add("d");
		Object[] arr = c.toArray();	// 集合转为数组
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
