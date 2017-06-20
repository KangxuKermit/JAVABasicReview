package com.kermit.set;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

import com.kermit.tool.Person;

public class HashSetDemo {

	public static void main(String[] args) {
		
//		basic();
		
//		test1();
		
		test2();
		
		
		
	}

	public static void test2() {
		// 输入一串字符串，去除重复字符
		Scanner sc = new Scanner(System.in);
		System.out.println("palease input a String:");
		HashSet<Character> hs = new HashSet<>();
		String line = sc.nextLine();
		char[] arr = line.toCharArray();
		for (char c : arr) {
			hs.add(c);
		}
		for (Character ch : hs) {
			System.out.print(ch);
		} 
	}

	public static void test1() {
		// 1-20 的不重复的随机数
		Random r = new Random();
		HashSet<Integer> hs = new HashSet<>();
		while (hs.size() < 10) {
			hs.add(r.nextInt(20)+1);
		}
		for (Integer integer : hs) {
			System.out.println(integer);
		}
	}

	public static void basic() {
		/**
		 * Set集合，无索引，不可以重复，无序
		 * 
		 * */
		HashSet<String> hs = new HashSet<>();
		System.out.println(hs.add("a"));
		System.out.println(hs.add("a"));	// 当向set集合中存储重复元素的时候返回false
		System.out.println(hs);				// 继承体系中有重写 toString 方法
		
		// 只要能用迭代器迭代的，就可以用增强for循环遍历
		for (String string : hs) {
			System.out.println(string);
		}
		
		HashSet<Person> hsP = new HashSet<>();
		hsP.add(new Person("10", 10));	// 先调用hashCode方法比较，值一样，再调用equals方法比较
		hsP.add(new Person("10", 10));
		hsP.add(new Person("11", 11));
		hsP.add(new Person("12", 12));
		hsP.add(new Person("13", 13));
		System.out.println(hsP);
	}

}
