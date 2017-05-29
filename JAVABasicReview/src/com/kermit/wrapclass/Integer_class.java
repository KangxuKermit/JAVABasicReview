package com.kermit.wrapclass;

public class Integer_class {

	public static void main(String[] args) {

		integerBasic();
		
		dataTypeChange();
		
		newsJDK5();
		
		test();
	}

	private static void test() {
		Integer i1 = 127;
		Integer i2 = 127;
		System.out.println(i1 == i2);			// true
		System.out.println(i1.equals(i2));		// true
		
		Integer i3 = 128;
		Integer i4 = 128;
		System.out.println(i3 == i4);			// false
		System.out.println(i3.equals(i4));		// true
		
		/*
	    public static Integer valueOf(int i) {
	        if (i >= IntegerCache.low && i <= IntegerCache.high)
	            return IntegerCache.cache[i + (-IntegerCache.low)];
	        return new Integer(i);
	    }
	    */
		
		/* -128~127是byte的取值范围，如果在这个取值范围内，自动装箱就不会创建对象，而是从常量池取
		 * 如果超过byte取值范围，就好再创建新对象 */
	}

	private static void newsJDK5() {
		
		int x = 100;
		Integer i = new Integer(x);		// 将基本数据类型包装成对象，装箱
		
		int y = i.intValue();			// 将对象转换为基本数据类型，拆箱
		
		Integer i1 = 100;				// 自动装箱
		int z = i1 + 100;				// 自动拆箱
		
//		Integer i2 = null;		// java.lang.NullPointerException
//		int a = i2 + 100;		// 底层i3调用intValue但是i3为null，调用方法出现空指针异常
	}

	private static void dataTypeChange() {
		// int -> String
		int i = 11111;
		String s1 = i + "";				// 推荐
		String s2 = String.valueOf(i);	// 推荐
		
		Integer integer1 = new Integer(i);
		String s3 = integer1.toString();
		
		String s4 = Integer.toString(i);
		
		// String -> int
		String s = "200";
		Integer it1 = new Integer(s);
		int ii1 = it1.intValue();
		int ii2 = Integer.parseInt(s);	// 推荐
		
		/**
		 * 补充说明：
		 * 	八种数据包装类型只有Character中没有parseXxx方法
		 * 			因为字符串到字符通过toCharAarray()就可以把字符串转换成字符数组
		 * 	其他七种均可以调用parseXxx方法，将其字符串表现形式转成基本数据类型
		 * 
		 * */
		String ss1 = "true";
		boolean b = Boolean.parseBoolean(ss1);
		System.out.println(b);
		
		String ss2 = "abc";
//		char c = Character.parse	// "abc"转成char是数组
		char[] arr = ss2.toCharArray();
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}
	}

	private static void integerBasic() {
		System.out.println(Integer.toBinaryString(10));
		System.out.println(Integer.toHexString(10));
		System.out.println(Integer.toOctalString(10));
		System.out.println(Integer.toString(100));
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		
		Integer i1 = new Integer(100);
		System.out.println(i1);
		Integer i2 = new Integer("120");
		System.out.println(i2);
//		System.out.println(new Integer("abc"));	
		// java.lang.NumberFormatException: For input string: "abc"
	}

}
