package com.kermit.exception;

public class ExceptionDemo {

	public static void main(String[] args) throws Exception {

		// Java程序在运行过程中出现的错误
		
		/**
		 * Throwable
		 * 	| Error
		 * 	| Exception
		 * 		| RuntimeException
		 *
		 * JVM 默认处理异常的方法
		 *	main函数收到问题时有两种处理方式
		 *		自己将该问题处理，继续运行
		 *		自己没有针对的处理方式，交给调用main函数的jvm来处理，jvm有一个默认的异常处理机，就将该异常处理，并将该异常的名称、信息、出现的位置打印在控制台上，同时程序停止运行
		 * 
		 * 
		 * 异常的处理方式： 
		 * 	try...catch...finally	// try 用来检测异常；catch 用来捕获异常；finally 释放资源
		 * 		try catch			// 如果跟多个 catch 小的异常放在前面，大的异常放前面。多态
		 * 		try catch finally
		 * 		try finally
		 * 	throwable
		 * 		getMessage()		// 获取异常信息，返回字符串
		 * 		toString()			// 获取异常类名和异常信息，返回字符串
		 * 		printStackTrace()	// 获取异常类名和异常信息，以及异常在程序中的位置，返回void
		 * 
		 * throws的方式处理异常
		 * 		编译时异常的抛出必须处理
		 * 		运行时异常可以抛出也可以不抛出
		 * 	throws 和 throw 的区别
		 * 		throws
		 * 			用在方法声明后，跟的是异常类名
		 * 			可以跟多个异常类名，用逗号隔开
		 * 			表示抛出异常，由该方法的调用者来处理
		 * 		throw
		 * 			用在方法体内，跟的是异常对象名
		 * 			只能抛出一个异常对象名
		 * 			表示抛出异常，由方法体内的语句处理
		 * 
		 * finally 的特点
		 * 		被finally控制的语句一定会执行，除非在执行finally语句之前jvm退出了（System.exit(0)）??????
		 * finally 的作用
		 * 		用于释放资源，IO流操作和数据库操作中会遇到
		 * 
		 * 
		 * 
		 * 
		 * */
		
//		demo1();
		 
//		demo2();
		
// 		demo3();
		
//		demo4();
		
		try {
			System.out.println(10/2);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			System.exit(0);		// 退出jvm
			return;
		} finally {
			System.out.println("finally func");
		}
		
		
	}

	public static void demo4() throws Exception {
		Person p = new Person();
		p.setAge(-10);
		System.out.println(p.getAge());
	}

	public static void demo3() {
		try {
			System.out.println(1/0);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			System.out.println(e.toString());	//  <=> System.out.println(e);
			e.printStackTrace();				// jvm默认用这种方法处理异常
		}
	}

	public static void demo2() {
		int a = 10; 
		int b = 0;
		int[] arr = {1,2,3,4,55};
		
		try {
			System.out.println(a/b);
			
//			System.out.println(arr[10]);
			
			arr = null;
			System.out.println(arr[0]);
		} catch (ArithmeticException e) { 
			// TODO: handle exception
			System.out.println("除数不能为0");
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("索引越界了");
		} catch (Exception e) {			// Exception e = new NullPointerException();
			// TODO: handle exception
			System.out.println("出错了");
		}
	}

	public static void demo1() {
		try {
			/*
			 Exception in thread "main" java.lang.ArithmeticException: / by zero
				at com.kermit.exception.Demo.div(Exception.java:32)
				at com.kermit.exception.Exception.main(Exception.java:23 
			*/
			System.out.println(Demo.div(10, 2));
		} catch (ArithmeticException a) {
			// TODO: handle exception
			System.out.println("除数不能为0");
		}
	}

}

class Demo {
	
	public static int div(int a, int b) {
		return a/b;
	}
}

class Person {
	private String name;
	private int age;
	
	public Person() {
		super();
		
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) throws AgeOutOfBoundsException {
		if (age > 0 && age <= 150) {
			this.age = age;
		} else {
//			throw new Exception("非法年龄");
			throw new AgeOutOfBoundsException("非法年龄");
		}
		
	}
}

// 自定义异常，通过名字区分到底是什么异常
class AgeOutOfBoundsException extends Exception {

	public AgeOutOfBoundsException() {
		super();
		
	}

	public AgeOutOfBoundsException(String message) {
		super(message);
		
	}

	@Override
	public String getMessage() {
		
		return super.getMessage();
	}

	@Override
	public String toString() {
		
		return super.toString();
	}

	
}



