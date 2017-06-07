package com.kermit.regex;

public class regex_basic {

	public static void main(String[] args) {

		/**
		 * 	
		 	Character classes
			[abc]               a, b, or c (simple class)
			[^abc]              Any character except a, b, or c (negation)
			[a-zA-Z]            a through z or A through Z, inclusive (range)
			[a-d[m-p]]          a through d, or m through p: [a-dm-p] (union)
			[a-z&&[def]]        d, e, or f (intersection)
			[a-z&&[^bc]]        a through z, except for b and c: [ad-z] (subtraction)
			[a-z&&[^m-p]]       a through z, and not m through p: [a-lq-z](subtraction)
			 
			Predefined character classes
			.  		 Any character (may or may not match line terminators)
			\d 		 A digit: [0-9]
			\D 		 A non-digit: [^0-9]
			\s 		 A whitespace character: [ \t\n\x0B\f\r]	// 空白字符
			\S 		 A non-whitespace character: [^\s]
			\w 		 A word character: [a-zA-Z_0-9]
			\W 		 A non-word character: [^\w]
			
			Greedy quantifiers
			X? 		X, once or not at all
			X* 		X, zero or more times
			X+ 		X, one or more times
			X{n} 	X, exactly n times
			X{n,} 	X, at least n times
			X{n,m} 	X, at least n but not more than m times
			
		 * 
		 * */
		
		
//		characterDemo();
		
//		predefinedC();
		
		String regex = "[abc]?";
		System.out.println("a".matches(regex));
		System.out.println("b".matches(regex));
		System.out.println("d".matches(regex));
		System.out.println("".matches(regex));
		

	}

	public static void predefinedC() {
		String regex = ".";
		System.out.println("a".matches(regex));
		System.out.println("ab".matches(regex));
		
		String regex2 = "\\d";	// \代表转义字符 \\d
		System.out.println("0".matches(regex2));
		System.out.println("a".matches(regex2));
	}

	public static void characterDemo() {
		String regex = "[abc]";		// [] 代表单个字符
		System.out.println("a".matches(regex));
		System.out.println("b".matches(regex));
		System.out.println("c".matches(regex));
		System.out.println("%".matches(regex));
		System.out.println("z".matches(regex));
	}

}
