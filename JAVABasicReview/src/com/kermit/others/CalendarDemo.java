package com.kermit.others;

import java.util.Calendar;

public class CalendarDemo {

	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();	// 父类引用指向子类对象
		
		System.out.println(c.get(Calendar.YEAR));	// 通过字段获取年
		System.out.println(c.get(Calendar.MONTH));	// 通过字段获取月 从 0 开始
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.DAY_OF_WEEK));			// 周日是第一天
		System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));	// 
		System.out.println(c.get(Calendar.DAY_OF_YEAR));
		
		System.out.println("------------");
		
		c.add(Calendar.YEAR, 1);	// 对指定字段进行加减
		System.out.println(c.get(Calendar.YEAR));
		
		c.set(2000, 8, 8);			// 修改指定字段 2000-09-08
		System.out.println(c.get(Calendar.YEAR));
		
		System.out.println(isLeapYear(2000));
	}
	
	public static boolean isLeapYear(int year) {

		Calendar c = Calendar.getInstance();
		// 设置那一年的3月1日
		c.set(year, 2,1);
		c.add(Calendar.DAY_OF_MONTH, -1);
		return  c.get(Calendar.DAY_OF_MONTH) == 29;
		
	}

}
