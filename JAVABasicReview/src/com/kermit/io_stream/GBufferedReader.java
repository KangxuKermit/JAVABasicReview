package com.kermit.io_stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;


public class GBufferedReader {

	public static void main(String[] args) throws IOException {

//		basicMethod();
		
//		readlineAndNewline();
		
//		test1();
		
		LineNumberReader lnr = new LineNumberReader(new FileReader("xxx.txt"));
		String line;
		lnr.setLineNumber(100);
		while ((line = lnr.readLine()) != null) {
			System.out.println(lnr.getLineNumber() +  ":" + line);
		}
		lnr.close();
	
	}

	public static void test1() throws FileNotFoundException, IOException {
		// 注意：流对象尽量晚开 早关
		BufferedReader br = new BufferedReader(new FileReader("xxx.txt"));
		ArrayList<String> list = new ArrayList<>();
		String line;
		while ((line = br.readLine()) != null) {
			list.add(line);	
		}
		br.close();
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("revxxx.txt"));
		for (int i = list.size() - 1; i >= 0; i--) {
			bw.write(list.get(i));
			bw.newLine();
		}
		bw.close();
	}

	public static void readlineAndNewline() throws FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader(new FileReader("xxx.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("x_copy2.txt"));
		
		String line;
		while ((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();			// 写出换行符 跨平台换行符
			System.out.println(line);
		}
		br.close();
		bw.close();
	}

	public static void basicMethod() throws FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader(new FileReader("xxx.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("x_copy.txt"));
		
		int c;
		while ((c = br.read()) != -1) {
			bw.write(c);
		}
		br.close();
		bw.close();
	}

}
