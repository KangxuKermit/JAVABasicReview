package com.kermit.InnerClass;

public class InnerClassReview {

	public static void main(String[] args) {
		
		
		/**
		 * 内部类的访问特点：
		 * 	内部类可以直接访问外部类的成员，包括私有
		 * 	外部类要访问内部类的成员，必须创建对象
		 * 	
		 * */
		
		// Inner public 外部类名.内部类名 对象名 = 外部类对象.内部类对象
		Outer.Inner oi = new Outer().new Inner();
		oi.print();
		
		// Inner private
		Outer ou = new Outer();
		ou.printInner();
		
		// inner static 外部类名.内部类名 对象名 = 外部类.内部类对象
		Outer.Inner2 oii = new Outer.Inner2();
		oii.print2();
	}
}



class Outer {
	private int num = 10;
	
	public String name;
	public int age;
	
	
	class Inner {
		int num = 20;
		public void print() {
			int num = 30;
			System.out.println("inner.print.num ..." + num);
			System.out.println("inner.num ..." + this.num);
			System.out.println("outer.num ..." + Outer.this.num);
		}
	}
	
	private class Inner1 {
		public void print1() {
			System.out.println("inner ..." + num);
		}
	}
	
	public void printInner() {
		Inner1 in = new Inner1();
		in.print1();
	}
	
	static class Inner2 {
		public void print2() {
			System.out.println("static Inner");
		}
	}
}














