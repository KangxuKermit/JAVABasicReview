package com.kermit.generic;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericDemo {

	public static void main(String[] args) {

		/**
		 * 泛型：
		 * 	提高安全性，将运行期的错误转换到编译期
		 * 	省去强转的麻烦
		 * 
		 * 基本使用：
		 * 	<>中放的必须是引用数据类型
		 * 
		 * 使用注意事项：
		 * 	前后泛型必须一致，或者后面的泛型可以省略不写（1.7的新特性，菱形泛型） 
		 * 		// ArrayList<Object> list = new ArrayList<>();
		 * 
		 * */
		
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		/**
		 * 泛型通配符 <?>
		 * 	当右边泛型不确定的时候，左边可以指定为 ?
		 * 
		 * 	? extends E		// 向下限定，E及其子类
		 * 			
		 * 
		 * */
		
		
		
		
		
	}
}

interface Inter<T> {
	public void show(T t);
}
class Demo implements Inter<String> {	// 推荐这种方式
	
	@Override 
	public void show(String s) {
		System.out.println(s);
	}
}

class Demo1<T> implements Inter<T> {		// 不推荐，没必要在实现接口的时候给自己的类加泛型
	@Override
	public void show(T t) {
		System.out.println(t);
	}
}












