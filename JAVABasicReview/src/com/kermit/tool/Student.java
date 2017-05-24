package com.kermit.tool;

public class Student extends Person {

	public Student(){}

	public Student(String name,int age) {
		super(name,age);
	}

	public void method() {
		print();
	}

	@Override
	public boolean equals(Object obj) {
		Student s = (Student)obj;
		return this.getName().equals(s.getName());
	}
	
	@Override
	public String toString() {
		return "name = " + getName() + " ... age = " + getAge();
	}
	
	
	
}
