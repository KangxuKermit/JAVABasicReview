package com.kermit.io_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Vector;


public class H_SequenceInputStream {

	public static void main(String[] args) throws IOException {
		
//		demo1();
				
		Vector<FileInputStream> v = new Vector<>();	// 创建集合对象，用来存储流对象
		v.add(new FileInputStream("xxx.txt"));
		v.add(new FileInputStream("yyy.txt"));
		v.add(new FileInputStream("zzz.txt"));
		v.add(new FileInputStream("ooo.txt"));
		
		SequenceInputStream sis = new SequenceInputStream(v.elements());
		FileOutputStream fos = new FileOutputStream("aaa.txt");
		int b;
		while ((b = sis.read()) != -1) {
			fos.write(b);
		}
		
		sis.close();
		fos.close();
		
		

	}

	public static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis1 = new FileInputStream("xxx.txt");
		FileInputStream fis2 = new FileInputStream("yyy.txt");
		SequenceInputStream sis = new SequenceInputStream(fis1, fis2);
		
		FileOutputStream fos = new FileOutputStream("zzz.txt");
		
		int b;
		while ((b = sis.read()) != -1) {
			fos.write(b);
		}
		
		sis.close();
		fos.close();
	}

}
