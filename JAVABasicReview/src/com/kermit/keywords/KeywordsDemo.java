
package com.kermit.keywords;

public class KeywordsDemo {

	public static void main(String[] args) {
		System.out.println("KeywordsDemo");
		
		
		Person p = new Person();
		p.name = "zhangsan";
		p.setAge(210);
		System.out.println(p.getAge());
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
	 **/ 
	String name;
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

}














