package com.kermit.others;

import java.util.Random;

public class RandomDemo {
	
	public static void main (String[] args) {
		
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
//			System.out.println(r.nextInt());
			System.out.println(r.nextInt(100));	// [0-99]
		}
		
		Random r2 = new Random(1000);
		int a = r2.nextInt();
		int b = r2.nextInt();
		System.out.println(a+"..."+b);	// 同一个种子计算随机数
		
		
		
		
	}
	

}
