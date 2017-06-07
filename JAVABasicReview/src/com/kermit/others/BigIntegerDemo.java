package com.kermit.others;

import java.math.BigInteger;

public class BigIntegerDemo {

	public static void main(String[] args) {

		// 存储很大的整数
		
		BigInteger bi1 = new BigInteger("100");
		BigInteger bi2 = new BigInteger("20");
		
		System.out.println(bi1.add(bi2));			// +
		System.out.println(bi1.subtract(bi2));		// -
		System.out.println(bi1.multiply(bi2));		// *
		System.out.println(bi1.divide(bi2));		// /
		
		
		BigInteger[] arr = bi1.divideAndRemainder(bi2);	// 取除数和余数
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		
		
	}

}
