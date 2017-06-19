package com.kermit.tool;

public class Person implements Comparable<Person> {

	private String name;
	private int age;

	public Person(){}

	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	protected void print() {
		System.out.println("print");
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;	// 31是一个质数，31既不大也不小，31好算(2^5-1)
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Person o) {
		int num = this.age - o.age;
		return num == 0 ? 1 : num;
	}

//	@Override
//	public boolean equals(Object obj) {
//		
//		Person p = (Person)obj;
//		return this.name.equals(p.name) && this.age == p.age;
//	}
//
//	@Override
//	public int hashCode() {
//		// hashCode 值一样，继续调用equals比较
//		return name.hashCode() + age;
//	}
	
	
	
	

}
