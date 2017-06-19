package com.kermit.map;

import java.util.LinkedHashMap;

public class LinkedHashMapBasic {

	public static void main(String[] args) {

		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
		lhm.put("key1", 11);
		lhm.put("key2", 22);
		lhm.put("key3", 33);
		lhm.put("key4", 44);
		System.out.println(lhm);
		
	}

}
