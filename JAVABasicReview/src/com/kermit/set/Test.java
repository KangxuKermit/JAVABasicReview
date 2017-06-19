package com.kermit.set;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {

		
//		test1();
		
//		test2();
		
		test3();
		
		
		
	}

	public static void test3() {
		// 键盘输入多个整数，遇到 quit 时结束，倒序输出
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入多个整数，输入 quit 退出");
		TreeSet<Integer> ts = new TreeSet<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer i1, Integer i2) {
				int num = i2 - i1;	// 倒序
				return num == 0 ? 1 : num;
			}
			
		});
		while (true) {
			String line = sc.nextLine();
			if (line.equals("quit"))
				break;
			try {
				Integer i = Integer.parseInt(line);
				ts.add(i);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("输入错误，请输入整数...");
			}
		}
		for (Integer integer : ts) {
			System.out.println(integer);
		}
	}

	public static void test2() {
		// 从键盘接收一个字符串，对其所有字符进行排序
		Scanner sc = new Scanner(System.in);
		System.out.println("please input a string:");
		String s = sc.nextLine();
		char[] arr = s.toCharArray();
		TreeSet<Character> ts = new TreeSet<>(new Comparator<Character>() {

			@Override
			public int compare(Character c1, Character c2) {
				int num = c1.compareTo(c2);	// 正序
				return num == 0 ? 1 : num;
			}
			
		});
		for (Character character : arr) {
			ts.add(character);
		}
		for (Character character : ts) {
			System.out.print(character);
		}
	}

	public static void test1() {
		// 在一个集合中存储了无序且重复的字符串，定义一个方法，让其有序(字典顺序)，并且不去除重复
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("bb");
		list.add("ccc");
		list.add("dddd");
		list.add("bb");
		list.add("aa");
		list.add("a");
		
		// 因为要保留重复的需要定义比较器，通过比较器进行比较
		TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				int num = o1.compareTo(o2);
				return num == 0 ? 1 : num;
			}
			
		});
		ts.addAll(list);
		list.clear();
		list.addAll(ts);
		System.out.println(list);
	}

}
