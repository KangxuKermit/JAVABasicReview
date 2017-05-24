package com.kermit.scanner;

import java.util.Scanner;

public class ScannerDemo {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		
		if (sc.hasNextInt()) {
			int i = sc.nextInt();
			System.out.println(i);
		} else {
			System.out.println("input is not int");
		}
		
		
	}

}
