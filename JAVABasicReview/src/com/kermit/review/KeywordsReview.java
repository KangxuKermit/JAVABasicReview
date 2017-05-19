package com.kermit.review;

public class KeywordsReview {

	public static void main(String[] args) {
		
		/**
		 * public	被jvm调用，所以权限要足够大
		 * static	被jvm调用，不需要创建对象，直接类名调用
		 * void		被jvm调用，不需要任何返回值
		 * main		只有这样写才能被jvm识别，main不是关键字
		 * String[] args	以前是用来接收键盘录入的
		 * */
		
		System.out.println("KeywordsDemo");
		
		
		Person p = new Person();
		Person.country = "China";
		p.name = "zhangsan"; 
		p.setAge(210);
		System.out.println(p.getAge());
		
		for (int i = 0; i < 10; i++) {
			System.err.println(Math.random());
		}
	}

}

class Person {
	
	/**
	 * private 被修饰的成员只能在本类中使用
	 * private 仅仅是封装的一种体现形式
	 * 
	 * 
	 * this	代表当前对象的引用
	 * 
	 * static
	 * 	随着类的加载而加载，优先于对象存在，被类所有对象共享		共性用静态，特性用非静态
	 * 	可以被类名调用（推荐使用）
	 * 	注意：
	 * 		在静态方法中没有this关键字，this随对象创建而存在
	 * 		非静态的成员方法既可以访问静态的成员也可以访问非静态的成员
	 * 		静态方法只能访问静态的成员，不能访问非静态
	 * 在工具类中static修饰的方法，可以被类直接调用，类似iOS中的类方法，
	 * 如果工具类中所有的方法都静态的，需要加上私有构造方法，防止类创建对象失败，不让其他类创建本工具类对象 
	 * 		
	 **/ 
	String name;
	static String country;
	private int age;
	
	public void speak() {
		System.out.println(name + "..." + getAge());
	}

	public void setAge(int age) {
		if (age > 0 && age < 200) {
			this.age = age;
		} else {
			System.out.println("ERROE: age < 0 || age > 200");
		}
		
	}
	
	public int getAge() {
		return age;		// == this.age
	}
	
	// 构造代码块（初始化块）：没创建一次对象就会执行一次，并且在构造方法前执行
	{
		System.out.println("构造代码块");
	}

	/**
	 * 随着类加载而加载，且只执行一次
	 * 	用来给类进行初始化，一般用来加载驱动
	 * 	优先于主方法执行
	 * */
	static {
		System.out.println("静态代码块");
	}
}














