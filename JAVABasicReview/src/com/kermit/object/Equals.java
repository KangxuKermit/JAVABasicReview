package com.kermit.object;

import com.kermit.tool.Student;

public class Equals {

	public static void main(String[] args) {

		Student s1 = new Student("name",20);
		Student s2 = new Student("name",20);
		/**
		 * Object中的equals方法是比较对象的地址值的，没什么意义，需要重写，
		 * 因为在开发中通常比较对象的属性值，认为相同属性是同一个对象
		 * */
		boolean b = s1.equals(s2);	// return (this == obj);
		System.out.println(b);
		
		/**
		 * == 和 equeals
		 * 共同点：都可以做比较，返回boolean
		 * 不同点：== 比较的是运算符，既可以是基本数据类型，也可以比较引用数据类型，基本数据类型比较是值，引用数据类型比较的是地址值
		 * 		 equals 只能比较引用数据类型，没重写之前比较的是地址值，底层依赖 ==，没意义。重写equals 方法比较对象中的属性值 
		 * */
		
	}

}
