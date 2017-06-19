package com.kermit.string;

public class StringDemo {

	public static void main(String[] args) {

//		demo();
		
//		demo1();
		
//		demo2();
		
//		demo3();
		
//		demo4();
		
//		demo5();
		
//		demo6();
		
//		demo7();
		
		demo8();
		
//		test1();
		
		

		
		
		
		
	}

	private static void test1() {
		String s = "this is a string TEST";
		String ss = s.substring(0, 1).toUpperCase().concat(s.substring(1).toLowerCase());
		System.out.println(ss);
	}

	private static void demo8() {
		String s1 = "this is a string 嗯";
		
		byte[] arr1 = s1.getBytes();	// 把字符串转换为字节数组
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		
		char[] arr2 = s1.toCharArray();	// 把字符串转换为字符数组
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		
		/**
		 * String类的valueOf可以把任意类型转成字符串
		 * */
		char[] arr3 = {'a','s','d'};
		String ss1 = String.valueOf(arr3);	// return new String(data);
		System.out.println(ss1);
		
		int i = 100;
		String ss2 = String.valueOf(i);		// return Integer.toString(i);
		System.out.println(ss2);
		
		String s2 = "ABCDEF";
		String s3 = "qwer";
		System.out.println(s2.toLowerCase());
		System.out.println(s3.toUpperCase());
		System.out.println(s2.concat(s3));		// 拼接
		
		System.out.println(s2.replace('A', 'x'));
		System.out.println(s2.replace("AB", "xx"));
		
		String s4 = "   test";
		System.out.println(s4.trim());	// 去除前面的空格
		
		String s5 = "abc";
		String s6 = "ABC";
		System.out.println(s5.compareTo(s6));	// 码表值比较
		System.out.println(s5.compareToIgnoreCase(s6));
	
		
	}

	private static void demo7() {
		String s1 = ".12345678.56";
		
		System.out.println(s1.length());
		char c = s1.charAt(2);	// 根据索引获取对应位置的字符
		System.out.println(c);
		
		int i1 = s1.indexOf('8');	// 返回指定字符在此字符串中第一次出现处的索引
		System.out.println(i1);
		int i2 = s1.indexOf("456");	// 返回指定字符串在此字符串中第一次出现处的索引
		System.out.println(i2);
		
		int i3 = s1.indexOf('.', 4);	// 返回指定字符在此字符串中从指定位置后第一次出现出的索引
		System.out.println(i3);
		int i4 = s1.indexOf("56", 8);	// 返回指定字符串在此字符串中重指定位置后第一次出现处的索引
		System.out.println(i4);
		
		int ii1 = s1.lastIndexOf('6');	// 从后往前找，字符第一次出现处的索引。。。。后面几个查询同上
		System.out.println(ii1);
		
		String ss1 = s1.substring(3);	// 从指定位置开始截取字符串，默认到末尾
		System.out.println(ss1);
		String ss2 = s1.substring(3, 6);	// 从指定位置开始到指定位置结束，截取字符串
		System.out.println(ss2);
	}

	private static void demo6() {
		String s1 = "name";
		String s2 = "name";
		String s3 = "Name";
		System.out.println(s1.equals(s2));	// true			
		System.out.println(s1.equals(s3));	// false
		System.out.println(s1.equalsIgnoreCase(s3));	// true
		
		String s4 = "lalalal_name_enenenne";
		System.out.println(s4.contains(s1));	// true
		
		String s5 = "name_is_kt";
		System.out.println(s5.startsWith(s1));	// ture
		System.out.println(s5.endsWith("kt"));	// ture
		System.out.println(s5.isEmpty());		// false
		
		/**
		 * null 和 "" 的区别
		 * 	"" 是字符串常量，同时也是一个String类的对象，可以调用String类的方法
		 *	null 是空常量，不能调用任何方法，否则会出现空指针异常，null常量可以给任意的引用数据类型赋值
		 * */
	}

	private static void demo5() {
		String s1 = "ab";		// 常量池
		String s2 = "abc";		// 常量池
		String s3 = s1 + "c";	// StringBuffer类的 append() 进行拼接，然后调用toString方法
//		StringBuffer buffer = new StringBuffer(s1);
//		String ss3 = buffer.append("c").toString();
//		System.out.println(ss3 == s3);
		System.out.println(s3 == s2);		// false
		System.out.println(s3.equals(s2));	// true
	}

	private static void demo4() {
//		byte b = 3+4;	// 在编译时就变成7，把7赋值给b，常量优化机制
		
		String s1 = "a" + "b" + "c";	// s1 = "abc"
		String s2 = "abc";
		System.out.println(s1 == s2);		// true, java中有常量优化机制
		System.out.println(s1.equals(s2));	// true
	}

	private static void demo() {
		String s = "string";
		System.out.println(s);

		String s1 = new String();
		System.out.println(s1);	//
		
		byte[] arr1 = {97,98,99,100,101,102};
		String s2 = new String(arr1);	// 解码
		System.out.println(s2);	// abcdef
		
		String s3 = new String(arr1,2,3);	// String(byte bytes[], int offset, int length)
		System.out.println(s3);	// ced
		
		char[] arr2 = {'a','b','c','d','e'};
		String s4 = new String(arr2);	// 将字符数组转换成字符串
		System.out.println(s4);	// abcde
		
		String s5 = new String(arr2,1,3);	// String(char value[], int offset, int count)
		System.out.println(s5);	// bcd
		
		String s6 = new String("lalla");
		System.out.println(s6);
	}
	
	public static void demo1() {
		String ss1 = "abc";	// 常量池
		String ss2 = "abc";
		System.out.println(ss1 == ss2);			// ture	ss1 ss2都指向同一地址  "abc"的地址
		System.out.println(ss1.equals(ss2));	// true
	}
	
	public static void demo2() {
		String s1 = new String("abc");	// 常量池"abc"，s1("abc")堆内存  两个对象,地址值不一样
		System.out.println(s1);
	}
	
	public static void demo3() {
		String ss1 = "abc";				// 记录常量池中("abc")的地址值
		String ss2 = new String("abc");	// 记录堆内存"abc" 的地址值
		System.out.println(ss1 == ss2);			// false	
		System.out.println(ss1.equals(ss2));	// true
	}
	
	

}
