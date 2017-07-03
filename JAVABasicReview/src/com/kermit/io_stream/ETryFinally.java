package com.kermit.io_stream;


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ETryFinally {

	
	public static void main(String[] args) throws IOException {

		

//		jdk1_6();
		
//		jdk1_7();
		
//		encryption();
		
//		test1(); 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入内容：");
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("xxx.txt"));
		while (true) {
			String line = sc.nextLine();
			if (line.equals("quit")) {
				System.out.println("输入结束...");
				break;
			}	
			bos.write(line.getBytes());
			bos.write("\r\n".getBytes());
		}
		bos.close();
		
	}

	public static void test1() throws FileNotFoundException, IOException {
		File file = getFile();
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file.getName()));
		
		int b;
		while ((b = bis.read()) != -1) {
			bos.write(b);
		}
		
		bis.close();
		bos.close();
	}
	
	@SuppressWarnings("resource")
	public static File getFile() {
		/**
		 * 定义一个方法，获取键盘录入的文件路径，并封装成File对象返回
		 * 
		 * */ 
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个文件的路径：");
		while (true) {
			String line = sc.nextLine();
			File file = new File(line);
			if (!file.exists()) {
				System.out.println("文件路径不存在，请重新输入：");
			} else if (!file.isDirectory()) {
				System.out.println("输入的是一个文件夹路径，请输入文件路径：");
			} else {
				return file;
			}
		}
	}

	public static void encryption() throws FileNotFoundException, IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("MYB.png"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("MYB_lock.png"));
		
		int b;
		while ((b = bis.read()) != -1) {
			bos.write(b ^ 1243); 	// 加密 写出的字节 ^ 一个数
		}
		
		bis.close();
		bos.close();
		
		
		BufferedInputStream bis1 = new BufferedInputStream(new FileInputStream("MYB_lock.png"));
		BufferedOutputStream bos1 = new BufferedOutputStream(new FileOutputStream("MYB_unlock.png"));
		
		int b1;
		while ((b1 = bis1.read()) != -1) {
			bos1.write(b1 ^ 1243); 	// 解密 写出的字节 ^ 一个数
		}
		
		bis1.close();
		bos1.close();
	}

	public static void jdk1_7() throws IOException, FileNotFoundException {
		
		try (
				// 这里面的 close 方法会被自动调用
				FileInputStream fis = new FileInputStream("xxx.txt");
				FileOutputStream fos = new FileOutputStream("yyy.txt");
				MyClose mc = new MyClose();
				)
		{
			int b;
			while ((b = fis.read()) != -1) {
				fos.write(b);
			}
		}
	}
	
	

	public static void jdk1_6() throws FileNotFoundException, IOException {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("xxx.txt");
			fos = new FileOutputStream("yyy.txt");
			
			int b;
			while ((b = fis.read()) != -1) {
				fos.write(b);
			}
			
		} finally {
			if (fis != null) 
				fis.close();
			if (fos != null)
				fos.close();
		}
	}

}

class MyClose implements AutoCloseable {
	public void close() {
		System.out.println("MyClose close");
	}
}



