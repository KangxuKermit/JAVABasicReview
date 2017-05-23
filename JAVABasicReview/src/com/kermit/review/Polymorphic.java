package com.kermit.review;

public class Polymorphic {
	public static void main(String[] args) {
		
		/**
		 * 成员变量：
		 * 		编译看左边，运行看左边（内存考虑）
		 * 成员方法：
		 * 		编辑看左边，运行看右边，进栈是子类方法。...动态绑定
		 * 静态方法：
		 * 		编辑看左边，运行看左边。（静态和类相关，算不上重写，所以访问还是左边）
		 * */
		
		Polymorphic_Aniaml p = new Polymorphic_Cat();
		System.out.println("num ..." + p.num);
		p.print();
		p.method();	// Polymorphic_Aniaml.method();
		Polymorphic_Cat cat = (Polymorphic_Cat)p;
		cat.cry();
		
		method(new Polymorphic_Cat());
		
	}
	
	public static void method(Polymorphic_Aniaml animal) {
		// instanceof 判断前面的引用是否是后面的数据类型
		if (animal instanceof Polymorphic_Cat) {
			
			Polymorphic_Cat c = (Polymorphic_Cat)animal;
			c.lazzy();
		} else {
			System.out.println("is not cat");
		}
	}
	
	
}

class Polymorphic_Aniaml {
	
	public int num = 10;
	
	public void eat() {
		System.out.println("Animal eat");
	}
	
	public void print() {
		System.out.println("father");
	}
	
	public static void method() {
		System.out.println("father static method");
	}
}

class Polymorphic_Cat extends Polymorphic_Aniaml {
	
	public int num = 20;
	
	public void eat() {
		System.out.println("Cat eat");
	}
	
	public void print() {
		System.out.println("son");
	}
	
	public static void method() {
		System.out.println("son static method");
	}
	
	public void cry() {
		System.out.println("cry");
	}
	
	public void lazzy() {
		System.out.println("lazzy");
	}
}

class Polymorphic_Dog extends Polymorphic_Aniaml {
	
	public void cry() {
		System.out.println("wwwwww");
	}
	
}

