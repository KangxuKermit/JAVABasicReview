package com.kermit.others;

import java.math.BigDecimal;

public class BigDecimalDemo {

	public static void main(String[] args) {

		// 更精确的存储小数
		
		// 开发中不推荐，不精确
		BigDecimal bd1 = new BigDecimal(2.0);
		BigDecimal bd2 = new BigDecimal(1.1);
		System.out.println(bd1.subtract(bd2));
		
		// 推荐，构造时传入字符串
		BigDecimal bd3 = new BigDecimal("2.0");
		BigDecimal bd4 = new BigDecimal("1.1");
		System.out.println(bd3.subtract(bd4));
		// 同上
		BigDecimal bd5 = BigDecimal.valueOf(2.0);
		BigDecimal bd6 = BigDecimal.valueOf(1.1);
		System.out.println(bd5.subtract(bd6));
		
	}

}
