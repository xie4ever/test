package com.xie.test.staticInit;

/**
 * @author xie4ever
 *
 */
public class Father {

	{
		System.out.println("father init seq a");
	}

	static {

		System.out.println("father init seq b");
	}

	public Father() {
		
		System.out.println("father init seq c");
	}
	
	public static void main(String[] args) {
		
		new Father();
		System.out.println("father init seq d");
		new Father();
		System.out.println("father init seq e");
	}
}
