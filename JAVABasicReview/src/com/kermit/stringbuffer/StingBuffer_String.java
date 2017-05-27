package com.kermit.stringbuffer;

public class StingBuffer_String {

	public static void main(String[] args) {
		
		
		// String -> StringBuffer
		stringToStringBuffer();
		
		// StringBuffer -> String
		stringBufferToString();
		
		
		
	}

	protected static void stringBufferToString() {
		StringBuffer sb1 = new StringBuffer("string");
		String s1 = new String(sb1);
		System.out.println(s1);
		String s2 = sb1.toString();
		System.out.println(s2);
		String s3 = sb1.substring(0,sb1.length());
		System.out.println(s3);
	}

	protected static void stringToStringBuffer() {
		String s1 = "lalla";
		
		StringBuffer sb1 = new StringBuffer(s1);	// 构造方法
		System.out.println(sb1);
		StringBuffer sb2 = new StringBuffer();
		sb2.append(s1);								// append()
	}

}
