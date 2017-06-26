package com.kermit.io_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BFileOutputStream {

	public static void main(String[] args) throws IOException {
		
		/**
		 * FileOutputStream 在创建对象的时候如果没有这个文件会自动创建一个，如果有这个文件，
		 * 					就会把这个文件内容先清空，再写入。如果想续写，在第二个参数传 true
		 * 
		 * */
		
//		write();
		
		FileOutputStream fos = new FileOutputStream("zzz.txt",true);		// 创建字节输出的对象，如果没有就自动创建一个
		fos.write(97);			// 虽然写入的是int数，但是写到文件上是一个字节，会自动去除前38位
		fos.write(99);
		fos.write(99);
		fos.close();
		
	}

	public static void write() throws FileNotFoundException, IOException {
		FileOutputStream fos = new FileOutputStream("zzz.txt");		// 创建字节输出的对象，如果没有就自动创建一个
		fos.write(97);			// 虽然写入的是int数，但是写到文件上是一个字节，会自动去除前38位
		fos.write(99);
		fos.write(99);
		fos.close();
	}

}
