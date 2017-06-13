package com.kermit.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListTest {

	public static void main(String[] args) {

		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("world");
		list.add("d");
		list.add("e");
		
		/*
		Iterator it = list.iterator();
		while (it.hasNext()) {
			String s = (String)it.next();
			if (s.equals("world")) {
				list.add("javaee");	// ConcurrentModificationException 遍历的同时在增加元素，并发修改
			}
		}
		*/
		
		ListIterator lit =  list.listIterator();
		while (lit.hasNext()) {
			String s = (String)lit.next();
			if (s.equals("wotld")) {
//				list.add("javaee");	// ConcurrentModificationException 遍历的同时在增加元素，并发修改
				lit.add("javaee");
			}
		}
		System.out.println(list);
		while (lit.hasPrevious()) {		// 从后向前 遍历
			System.out.println(lit.previous());	// 往前移
		}
		
	}

}
