package com.kermit.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapBasic {

	public static void main(String[] args) {

//		basicFunc();
		
//		traversal(); 
		
		traversal1();
		
		
	}

	public static void traversal1() {
		Map<String,Integer> map = new HashMap<>();
		map.put("key1", 1);
		map.put("key2", 2);
		map.put("key3", 3);
		map.put("key4", 4);
		
		// Map.Entry说明Entry是Map的内部接口，将键和值封装成了Entry对象，并存储在Set集合中
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> it = entrySet.iterator();
		while (it.hasNext()) {
			Map.Entry<String, Integer> en = it.next();	// 父类引用，指向子类对象
//			Entry<String, Integer> en = it.next();		// 直接获取子类对象
			String key = en.getKey();
			Integer value = en.getValue();
			System.out.println(key+"="+value);
		}
		
		for (Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
	}

	public static void traversal() {
		Map<String,Integer> map = new HashMap<>();
		// 添加
		map.put("key1", 1);
		map.put("key2", 2);
		map.put("key3", 3);
		map.put("key4", 4);
		
		// Map没有Iterator方法
		Set<String> keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
		while (it.hasNext()) {
			String key =  it.next();
			Integer value = map.get(key);
			System.out.println(key+"="+value);
		}
		
		for (String key : map.keySet()) {
			System.out.println(key+"="+map.get(key));
		}
	}

	public static void basicFunc() {
		Map<String,Integer> map = new HashMap<>();
		
		// 添加
		map.put("key1", 1);
		map.put("key2", 2);
		map.put("key3", 3);
		map.put("key4", 4);
		Integer i = map.put("key3", 30);	// 把覆盖的值返回
		System.out.println(i);
		System.out.println(map);
		
		// 判断
		System.out.println(map.containsKey("key1"));
		System.out.println(map.containsValue(3));
		
		// 长度
		System.out.println(map.size());
		// 获取集合中所有的值
		System.out.println(map.values());
		
		// 删除
		System.out.println(map.remove("key4"));	// 把删除的值返回
		System.out.println(map);
		map.clear();
		System.out.println(map);
	}

}
