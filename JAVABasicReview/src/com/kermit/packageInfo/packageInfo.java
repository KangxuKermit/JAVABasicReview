




/**
 * 定义包的注意事项：
 * 	package 语句必须是程序的第一条可执行代码
 * 	package 语句在一个java文件中只能有一个
 * 	如果没有package，默认无包名
 * */
package com.kermit.packageInfo;

public class packageInfo {

	public static void main(String[] args) {
		System.out.println("packageInfo");
	}
	
	/**
	 * 	修饰符		本类		同一包下的子类和无关类		不同包下子类		不同包下-无关类
	 * private		 Y			
	 * 默认			 Y				Y
	 * protected	 Y				Y					Y
	 * public		 Y				Y					Y				 Y
	 * */

}
