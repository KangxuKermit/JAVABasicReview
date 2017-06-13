package com.kermit.set;

import java.util.Comparator;
import java.util.TreeSet;

import com.kermit.tool.Person;

public class TreeSetDemo {

	public static void main(String[] args) {

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

}

class ComparaByLen implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		int num = o1.length() - o2.length();
		return num == 0 ? o1.compareTo(o2) : num;
	}
	
	
	
}




