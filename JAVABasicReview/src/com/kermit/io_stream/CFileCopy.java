package com.kermit.io_stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CFileCopy {

	public static void main(String[] args) throws IOException {

//		copy1();
		
//		copy2();
		
//		cope3();
		
		bufferedCopy();
		
		/**
		 * flush 和 close 的区别
		 * 
		 * close具备刷新的功能，在关闭流之前，就会先刷新一次缓冲区，将缓冲区的字节全部刷新到文件上，再关闭。close方法刷完之后就不能写了
		 * flush具备刷新功能，刷完之后还能继续写
		 * 
		 * */
		
	}

	public static void bufferedCopy() throws FileNotFoundException, IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("MYB.png"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("MYB_4.png"));
		int b;
		while ((b = bis.read()) != -1) {
			bos.write(b);
		}
		bis.close();
		bos.close();
	}

	public static void cope3() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("MYB.png");
		FileOutputStream fos = new FileOutputStream("MYB_copy3.png");
		
		byte[] arr = new byte[1024*8];
		int len;
		while ((len = fis.read(arr)) != -1) {	// fis.read(arr) 返回读取的字节数，没有读取返回-1；fis.read()返回读取的内容
			fos.write(arr, 0, len);
		}
		
		fis.close();
		fos.close();
	}

	public static void copy2() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("MYB.png");
		FileOutputStream fos = new FileOutputStream("MYB_copy2.png");
		
		int len = fis.available();
		System.out.println(len);
		System.out.println("---");
		
		byte[] arr = new byte[fis.available()];		// 创建与文件大小一样大的字节数组，有肯会内存溢出
		fis.read(arr);
		fos.write(arr);	
		
		fis.close();
		fos.close();
	}

	public static void copy1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("MYB.png");
		FileOutputStream fos = new FileOutputStream("MYB_copy.png");
		
		int b;
		while ((b = fis.read()) != -1) {		// 不断的读取每一个字节
			fos.write(b);						// 将每一个字节写入
		}
		
		fis.close();
		fos.close();
	}

}
