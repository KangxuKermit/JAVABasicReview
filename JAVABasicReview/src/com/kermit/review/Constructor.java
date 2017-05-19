package com.kermit.review;


/**
 * 构造方法：
 * 	给对象的数据（属性）初始化
 * 
 * 特点：
 * 	a:方法名与类名相同(大小写也要与类名一致)
 * 	b:没有返回值类型，void都木有
 * 	c:没有具体的返回值 return
 * 
 * 构造方法的重载：
 * 	方法名相同，与返回值类型无关（构造方法无返回值），只看参数列表
 * 
 * 注意事项：
 * 	如果没有给构造方法，系统将自己提供一个无参构造方法
 * 	如果给出了构造方法（无论是有参还是无参），系统将不再提供默认的无参构造方法
 * 		注意：如果我们已经给出了构造方法，我们还想使用无参的构造方法，就必须自己给出。建议，永远自己给出无参构造方法
 * */

public class Constructor {

	public static void main(String[] args) {
		ConstructorDemo1 demo1 = new ConstructorDemo1();	// 在创建对象的时候，系统就已经调用了构造方法
//		demo1.ConstructorDemo1();							// 构造方法不能用对象调用
		demo1.show();
		
		ConstructorDemo2 demo2 = new ConstructorDemo2("name",22);
		demo2.show();
		demo2.setName("newName");
		demo2.show();
		
		ConstructorDemo2 demo22 = new ConstructorDemo2();
		demo22.show();
	}

} 

class ConstructorDemo1 {
	private String name;
	private int age;
	
	// 构造方法	给对象的数据(属性)初始化
	public ConstructorDemo1() {
//		System.out.println("ConstructorDemo1 构造方法");
//		return;		// 构造方法是有return语句的，格式：return;
		
		name = "name";
		age = 20;
	}
	
	public void show() {
		System.out.println(name + "..." + age);
	}
}

class ConstructorDemo2 {
	private String name;
	private int age;
	
	// 构造方法	给对象的数据（属性）初始化
	public ConstructorDemo2() {
		System.out.println("空参的构造");
	}
	
	public ConstructorDemo2(String name,int age) {
		this.name = name;
		this.age = age;
		System.out.println("有参的构造");
	}
	
	public void show() {
		System.out.println(name + "..." + age);
	}
	
	/**
	 * 构造方法给属性进行初始化
	 * 
	 * set方法修改属性值（使用较多，比较灵活）
	 * 
	 * */
	
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
	
}






