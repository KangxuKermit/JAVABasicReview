package com.kermit.object;

import com.kermit.tool.Person;
import com.kermit.tool.Student;

public class GetClass {

	public static void main(String[] args) {

		
		Student s = new Student("name",20);
		Person p = (Person)s;
		p.getAge();
		Class<? extends Student> clazz = s.getClass();	//  获取该对象的字节码文件
		String name = clazz.getName();	// 获取名称
		System.out.println(name);		// com.kermit.tool.Student
		
	}

}
