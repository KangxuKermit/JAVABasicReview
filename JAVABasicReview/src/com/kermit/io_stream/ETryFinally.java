package com.kermit.io_stream;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ETryFinally {

	public static void main(String[] args) throws IOException {

		

//		jdk1_6();
		
		jdk1_7();
		
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



