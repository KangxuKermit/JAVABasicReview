package com.kermit.stringbuffer;

public class StringBuffer_basic {
	
	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1.length());	// 容器中的字符个数，实际值
		System.out.println(sb1.capacity());	// 容器的初始容量，理论值
		
		StringBuffer sb2 = new StringBuffer(10);
		System.out.println(sb2.length());
		System.out.println(sb2.capacity());
		
		StringBuffer sb3 = new StringBuffer("basic");
		System.out.println(sb3.length());	
		System.out.println(sb3.capacity());		// 字符串的length+初始容量
		
		
		sb1.append("abc");
		sb1.insert(2, "1234");
		System.out.println(sb1);
		
		System.out.println(sb1.deleteCharAt(1));
		System.out.println(sb1.delete(0, 2));		// 删除的时候包含头，不包含尾
		System.out.println(sb1.delete(0, sb1.length()));	// 清空buffer缓存
		System.out.println("-----");
		
		StringBuffer ssb1 = new StringBuffer("123456");
		ssb1.replace(0, 2, "abcd");
		System.out.println(ssb1);
		System.out.println(ssb1.reverse());	// 反转
		
		// 截取。返回值为 String
		StringBuffer ssb2 = new StringBuffer("thisisbuffer");
		String ss1 = ssb2.substring(4);
		System.out.println(ss1);
		String ss2 = ssb2.substring(2, 4);	// 不包括结束为止
		System.out.println(ss2);
		System.out.println(ssb2);
		
		
		
		
	}

}
