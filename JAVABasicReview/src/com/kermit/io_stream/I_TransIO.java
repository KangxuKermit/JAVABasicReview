package com.kermit.io_stream;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class I_TransIO {

	public static void main(String[] args) throws IOException {

//		defaultCode();
		
		
//		demo1();
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("utf-8.txt"), "utf-8"));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("gbk.txt"), "gbk"));
		
		int ch;
		while ((ch = br.read()) != -1) {
			bw.write(ch);
		}
		br.close();
		bw.close();
		
		
		
		
	}

	public static void demo1() throws UnsupportedEncodingException, FileNotFoundException, IOException {
		InputStreamReader isr = new InputStreamReader(new FileInputStream("utf-8.txt"), "utf-8");
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("gbk.txt"), "gbk");
		
		int c1;
		while ((c1 = isr.read()) != -1) {
			osw.write(c1);
		}
		isr.close();
		osw.close();
	}

	public static void defaultCode() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("utf-8.txt");
		FileWriter fw = new FileWriter("gbk.txt");
		
		int c;
		while ((c = fr.read()) != -1) {
			fw.write(c);
		}
		
		fr.close();
		fw.close();
	}

}
