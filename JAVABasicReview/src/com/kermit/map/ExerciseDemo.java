package com.kermit.map;

import java.util.HashMap;

public class ExerciseDemo {

	public static void main(String[] args) {

		// abcabcabcabacbcbbbcccc
		String s = "abcabcabcabacbcbbbcccc";
		char[] charArr = s.toCharArray();
		HashMap<Character, Integer> map = new HashMap<>();
		
		for (char c : charArr) {
			
//			if (map.containsKey(c)) {
//				map.put(c, map.get(c)+1);
//			} else {
//				map.put(c, 1);
//			}
			map.put(c, map.containsKey(c) ? map.get(c)+1 : 1);
		}
		
		System.out.println(map);
		
	}

}
