package com.kermit.io_stream;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class F_FileReader {

	public static void main(String[] args) throws IOException {
		
		
//		basic();
		
//		copy();
		
		
		FileReader fr = new FileReader("ooo.txt");
		FileWriter fw = new FileWriter("yyy.txt");
		char[] arr = new char[1024];
		int len;
		while ((len = fr.read(arr)) != -1) {
			fw.write(arr, 0, len);
		}
		
		fr.close();
		fw.close();
		
	}

	public static void copy() throws FileNotFoundException, IOException {
		
		// copy 推荐使用字节流
		// 程序需要读取一段文本，或者写出一段文本的时候可以使用 字符流
		/**
		 * 读取的时候是按照字符的大小读取的，不会出现半个中文
		 * 写出的时候可以直接将字符串写出，不用转换为字节数组
		 * 
		 * 字符流不可以拷贝非纯文本的文件：
		 * 	读文件的时候会将字节转换为字符，在转换过程中，可能找不到对应的字符，就会用?代替，
		 * 	写出的时候会将字符串转换成字节写出去，如果是?，直接写出之后的文件就乱了
		 * 
		 * */
		
		FileReader fr = new FileReader("xxx.txt");
		FileWriter fw = new FileWriter("ooo.txt");
		
		int c;
		while ((c = fr.read()) != -1) {
			fw.write(c);
		}
		
		fr.close();
		fw.close();		// Writer 类中有一个2k的小缓存区，要是不关流，就会将流写到缓冲区内，关流会将缓冲区的内容刷新，再关闭
	}

	public static void basic() throws FileNotFoundException, IOException {
		/**
		 * 字符流：可以直接写出字符的IO流
		 * 读写字符：字符流读取字符，先读取到字节流数据，然后转为字符，写出字符，需要把字符转为字节再写出
		 * 
		 * */
		FileReader fr = new FileReader("xxx.txt");
		
		int c;
		while ((c = fr.read()) != -1) {	// 通过项目默认的码表一次读取一个字符
			System.out.print((char)c);
		}
		fr.close();
		
		
		
		FileWriter fw = new FileWriter("yyy.txt");
		fw.write("这是一个字符串。。。");
		fw.close();
	}

}
