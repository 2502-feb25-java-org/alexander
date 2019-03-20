package com.revature.design;

public class Singleton {

	public String name;
	
	private static Singleton instance = new Singleton();
	
	private Singleton() {
		System.out.println("constructing Singleton object");
	}
	
	public static Singleton getInstance() {
		return instance;
	}
	
	static void test() {
		System.out.println("loading our Eager Singleton class");
	}
}
