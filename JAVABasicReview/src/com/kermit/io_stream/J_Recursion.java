package com.kermit.io_stream;

public class J_Recursion {

	public static void main(String[] args) {

		
		
		
	}
	
	// 阶乘 num 过大栈内存溢出
	/**
	 * 递归的弊端：
	 * 	不能调用次数过多，容易导致栈溢出
	 * 好处：
	 * 	不用知道循环次数
	 * 
	 *  
	 * */
	public static int func(int num) {
		if (num == 1) {
			return num;
		} else {
			return num * func(num-1);
		}
	}

}
