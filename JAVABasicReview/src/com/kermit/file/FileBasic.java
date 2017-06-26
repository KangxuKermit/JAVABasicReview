package com.kermit.file;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileBasic {

	public static void main(String[] args) throws IOException {
		
//		basic();
		 
//		createFileAndMkdir();
		
//		renameAndDelete();
		
//		judge();
		
//		getMethod();
		
		File dir = new File("BBB");
		String[] arr = dir.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				File file = new File(dir, name);
//				System.out.println(file);
				return file.isFile() && file.getName().endsWith(".txt");
			}
		});
		
		for (String string : arr) {
			System.out.println(string);
		}

		
	}

	public static void getMethod() {
		File file1 = new File("xxx.txt");
		System.out.println(file1.getAbsolutePath());	// 获取绝对路径
		System.out.println(file1.getPath());			// 获取构造方法中传入的路径
		System.out.println(file1.getName());			// 获取文件名、文件夹名
		System.out.println(file1.length());				// 获取字节个数
		
		System.out.println(file1.lastModified());		// 获取最后的修改时间 ms
		Date d = new Date(file1.lastModified());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		System.out.println(sdf.format(d));
		
		File dir = new File("BBB");
		String [] arr = dir.list();				// 仅为了获取文件名
		for (String string : arr) {
			System.out.println(string);
		}
		System.out.println("-----");
		File[] subFiles = dir.listFiles();		// 获取所有文件对象和文件夹对象
		for (File file : subFiles) {
			System.out.println(file);
		}
	}

	public static void judge() {
		File file1 = new File("AAA");
		System.out.println(file1.isDirectory());	// 判断是否是一个文件夹
		
		File file2 = new File("yyy.text");
		System.out.println(file2.isFile());			// 判断是否是一个文件
		
		
		file2.setReadable(true);
		file2.setWritable(false);
		System.out.println(file2.canRead());
		System.out.println(file2.canWrite());
		System.out.println(file2.isHidden());
	}

	public static void renameAndDelete() {
		File file1 = new File("xxx.text");
		File file2 = new File("ooo.text");
		System.out.println(file1.renameTo(file2));	// 如果路径相同就是改名，不同就是改名并剪切
		
		System.out.println(file2.delete());		// 删除文件、文件夹(文件夹必须是空的)
	}

	public static void createFileAndMkdir() throws IOException {
		File file = new File("yyy.text");
		 System.out.println(file.createNewFile());	// 如果没有就创建 返回true，有就不创建 返回false
		 
		 File file1 = new File("AAA");
		 System.out.println(file1.mkdir());			// 创建文件夹
		 
		 File file2 = new File("BBB/bbb");
		 System.out.println(file2.mkdirs());		// 创建多级文件夹
	}

	public static void basic() {
		File file = new File("xxx.text");
		 System.out.println(file.exists());	// 文件是否存在
		 
		 String parent = "";
		 String child = "";
		 File file1 = new File(parent, child);
		 System.out.println(file1.exists());
		 
		 File parentFile = new File("");
		 File file2 = new File(parentFile,"");
		 System.out.println(parentFile.exists());
		 System.out.println(file2.exists());
	}

}
