package com.kermit.others;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) throws ParseException {

//		demo1();
		
//		demo2();
		
		// 将时间字符串转换为日期对象
		String str = "2017-06-06 08:08:08";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d = sdf.parse(str);	// 将时间字符串转为日期对象
		System.out.println(d.getTime());
		
		String birthday = "1994-03-28 16:00:00";
		Date md = sdf.parse(birthday);
		System.out.println((d.getTime()-md.getTime())/(1000*60*60*24)/365);
		
	}

	public static void demo2() {
		// DateFormat 抽象类
		
		// DareFormat df1 = new SimpleDateFormat();
		DateFormat df1 = DateFormat.getDateInstance();	// 父类引用指向子类对象，右边的方法返回一个子类对象
		
		Date t = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat();
		System.out.println(sdf.format(t));	// xx-xx-xx 下午x:xx
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		System.out.println(sdf1.format(t));	// xxxx年xx月xx日 xx:xx:xx
	}

	public static void demo1() {
		// util包下的
		Date d1 = new Date();	// 当前时间
		System.out.println(d1);
		
		// 构造方法参数传 0 代表1970-1-1
		Date d2 = new Date(0);
		System.out.println(d2);
		
		// 获取 ms 值
		System.out.println(d1.getTime());
		System.out.println(System.currentTimeMillis());
		
		Date d3 = new Date();
		d3.setTime(1000);	// 设置 ms 值，改变时间值
		System.out.println(d3);
	}

}
