package com.kermit.io_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class A_FileInputStream {

	public static void main(String[] args) throws IOException {

//		read();
		
		FileInputStream fis = new FileInputStream("xxx.txt");
		int b;
		while ((b = fis.read()) != -1) {
			System.out.println(b);
		}
		fis.close();
		
		
	}
	
	public static void read() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("xxx.txt");	// 创建流对象
		/**
		 * read() 方法返回值为 int 不是byte
		 * 结束标记为 -1，
		 * 
		 * 10000001 byte类型 -1 的原码
		 * 11111110 -1 的反码
		 * 11111111 -1 的补码
		 * 
		 * int 保证数据都能读完
		 * 
		 * */
		int x = fis.read();	// 从硬盘上读取一个字节
		System.out.println(x);
		int y = fis.read();
		System.out.println(y);
		int a = fis.read();
		System.out.println(a);
		fis.close();	// 关闭释放流资源
	}

}
