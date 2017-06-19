package com.kermit.map;

import java.util.Comparator;
import java.util.TreeMap;

import com.kermit.tool.Student;

public class TreeMapBasic {

	public static void main(String[] args) {

		TreeMap<Student, String> tm = new TreeMap<>(new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				int num = s1.getName().compareTo(s2.getName());
				return num == 0 ? s1.getAge()-s2.getAge() : num;
			}
			
		});
		tm.put(new Student("a张三", 23), "北京");
		tm.put(new Student("z李四", 44), "上海");
		tm.put(new Student("f王五", 35), "广州");
		tm.put(new Student("b赵六", 26), "深圳");
		System.out.println(tm);
		
		
		
	}

}
