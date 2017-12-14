package com.xie.test.staticInit;

public class Son extends Father {

	{
		System.out.println("son init seq a");
	}

	static {

		System.out.println("son init seq b");
	}

	public Son() {
		
		System.out.println("son init seq c");
	}
	
	public static void main(String[] args) {
		
		new Son();
	}
}
