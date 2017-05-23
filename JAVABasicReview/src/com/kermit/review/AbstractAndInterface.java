package com.kermit.review;

public class AbstractAndInterface {

	public static void main(String[] args) {

		InterfaceDemo1 demo1 = new InterfaceDemo1();
		demo1.print();
	}
	
	
	/**
	 * 抽象类的特点：
	 * 		抽象类和抽象方法必须用abstract关键字修饰。public abstract void eat(); abstract class 类名{};
	 * 		抽象类不一定有抽象方法，有抽象方法的类一定是抽象类，或者是接口
	 * 		抽象类不能实例化，按照多态的方式由具体的子类实例化，抽象类的多态
	 * 		抽象类的子类，要么是抽象类，要么重写抽象类中的所有抽象方法 
	 * 
	 * 
	 * 抽象类的成员特点：
	 * 		成员变量：既可以是变量，也可以是常量。abstract不能修饰成员变量
	 * 		构成方法：有构造方法，用于子类访问父类数据的初始化
	 * 		成员方法：既可以抽象也可以是非抽象。
	 * 抽象类的成员方法特性：
	 * 		抽象方法，强制要求子类做的事情
	 * 		非抽象方法，子类继承的事情，提高代码复用性
	 * 	
	 * */

}

abstract class Ab_Animal {
	public abstract void eat();
}
class ad_Cat extends Ab_Animal {
	public void eat() {
		System.out.println("aaa");
	}
}

/**
 * 接口：狭义-java中的interface；广义-对外提供的规则
 * 特点：
 * 		interface 接口名 {};
 * 		类实现接口调用implements表示
 * 		接口不能实例化
 * 		接口的子类：可以吃抽象类-意义不大；可以是具体类，重写接口中的所有抽象方法
 * 
 * 接口中定义的成员变量：只是常量，并且是静态的公共的。
 * 		默认修饰符：public static final	建议自己手动加上
 * 		成员方法：只能是抽象方法，默认修饰符 public abstract
 * 
 * */

interface Interface_Demo1 {
	
	public static final int num = 10;
//	public Interface_Demo1(){}	// 接口中没有构造方法
	
	// 接口中不能定义非抽象方法
	
	// 接口中的方法都是抽象的
	public abstract void print();
}
class InterfaceDemo1 implements Interface_Demo1 {
	public void print() {
		System.out.println("InderfaceDemo1");
	}
}

abstract class InterfaceDemo2 implements Interface_Demo1 {
	
}












