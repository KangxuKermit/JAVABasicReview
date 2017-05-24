package com.kermit.object;

import com.kermit.tool.Student;

public class ToString {

	public static void main(String[] args) {

		Student s = new Student("name",24);
		String toStr = s.toString();	// getClass().getName() + "@" + Integer.toHexString(hashCode())
		// Integer.toHexString 十六进制表现形式
		System.out.println(toStr);	// com.kermit.tool.Student@7852e922
		
	}

}
