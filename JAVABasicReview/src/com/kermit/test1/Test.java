package com.kermit.test1;

public class Test {
	
	private String name;
	
	
	public Test() {
		
	}
	public Test(String n) {
		this.name = n;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void run() {
		System.out.println("run");
	}
		

}

