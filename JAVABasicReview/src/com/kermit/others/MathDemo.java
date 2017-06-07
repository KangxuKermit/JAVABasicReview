package com.kermit.others;

public class MathDemo {

	public static void main(String[] args) {
		
		
		System.out.println(Math.PI);
		System.out.println(Math.abs(-100));	// 取绝对值
		
		System.out.println(Math.ceil(12.3));	// 向上取整。但是结果是double ceil天花板
		System.out.println(Math.ceil(12.99));
		
		System.out.println(Math.floor(12.99));	// 向下取整 double
		
		System.out.println(Math.max(10, 20));
		System.out.println(Math.min(10, 20));
		
		System.out.println(Math.pow(2, 3));	// 2.0^3
		
		System.out.println(Math.random());	// [0.0,1.0) 随机数
			
		System.out.println(Math.round(1.567f));	//	四舍五入 int
		
		System.out.println(Math.sqrt(4.0));		// 平方根 double
		
		
		

	}

}
