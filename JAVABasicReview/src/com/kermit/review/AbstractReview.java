package com.kermit.review;

public class AbstractReview {

	public static void main(String[] args) {

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
	 * 	
	 * */

}

abstract class Ab_Animal {
	public abstract void eat();
}
class ad_Cat extends Ab_Animal {
	public void eat() {
		
	}
}

