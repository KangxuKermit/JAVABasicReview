package com.kermit.review;

public class ExtendsReview {
	
	/**
	 * 单继承
	 * 
	 * 继承的注意事项：
	 * 	子类只能继承父类所有非私有的成员（成员变量和方法）
	 * 	子类不能继承父类的构造方法，但是可以通过super关键字去访问父类构造方法
	 * 	不要为了部分功能区继承
	 * 
	 * */

	public static void main(String[] args) {

	}

}

class Father {
	
	String name;
	int age;
	
	public Father() {
//		super();	// 每一个构造方法的第一条语句默认都是：super();
		System.out.println("Father 无参构造方法");
	}
	
	public Father(String name,int age) {
		this.name = name;
		this.age = age;
		System.out.println("Father 有参构造方法");
	}
	
}
class Son extends Father {
	
	public Son() {
//		super();	// 系统默认加上，用来访问父类中的空参构造
		this("",0);	// 调用中本类的构造方法
		System.out.println("Son 无参构造方法");
	}
	
	public Son(String name,int age) {
		super(name,age);
		System.out.println("Son 有参构造方法");
	}
	
}

