package com.kermit.io_stream;

public class H_Wrap {

	public static void main(String[] args) {

		SuperStu ss = new SuperStu(new Student());
		ss.code();
		
	}

	
}


interface Coder {
	
	public void code();
	
}

class Student implements Coder {

	@Override
	public void code() { 
		System.out.println("javase");
		System.out.println("javaweb");
	}

}

// 装饰设计模式
class SuperStu implements Coder {
	
	// 获取被装饰类的引用
	private Student s;
	
	// 在构造方法中传入被装饰类的对象
	public SuperStu(Student s) {
		this.s = s;
	}

	// 升级原有功能
	@Override
	public void code() {
		s.code();
		
		System.out.println("ssh");
		System.out.println("mysql");
		System.out.println("xxx");
		System.out.println("ooo");
	}
	
	
}


