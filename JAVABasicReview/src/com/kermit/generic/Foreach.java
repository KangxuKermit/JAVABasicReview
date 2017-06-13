package com.kermit.generic;

import java.util.ArrayList;
import java.util.Iterator;

public class Foreach {

	public static void main(String[] args) {

		
		int[] array = {11,33,22,88,44};
		// JDK1.5+ 增强for循环
		for (int i : array) {
			System.out.println(i);
		}
		
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("b");
		for (String string : list) {
			System.out.println(string);
		}
		
		// 1 普通循环 删除
		for (int i = 0; i < array.length; i++) {
			if("b".equals(array[i])) {
				list.remove(i--);
			}
		}
		
		// 2  迭代器删除
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
//			list.remove("b");	// 不能删除，因为迭代中修改会出现并发修改 参照 list
			it.remove();
		}
		
		// 3 增强循环 底层依赖迭代器 只能遍历不能删除
		for (String string : list) {
			if(string.equals("b")) {
				list.remove(string);	// list.remove("b");	// 不能删除
			}
		}
		
		
		
		
		
	}

}
