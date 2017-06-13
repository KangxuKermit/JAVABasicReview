package com.kermit.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {

		Collection c = new ArrayList();
		c.add("a");
		c.add("b");
		c.add("c");
		c.add("d");
		
		// 对集合中的元素迭代-遍历
		Iterator it = c.iterator();			// 取迭代器
		System.out.println(it.hasNext());	// 判断集合中是否有元素，有就返回 true
		System.out.println(it.next());		// a
		System.out.println(it.next());		// b next() 指针往后移动一位
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
