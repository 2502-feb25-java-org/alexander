package com.revature.design;

public class LazySingleton {
	
	private static LazySingleton instance;
	
	private LazySingleton() {
		System.out.println("constructing lazy singleton");
	}
	
	public static LazySingleton getIstance() {
		if (instance == null) {
			instance = new LazySingleton();
		}
		
		return instance;
	}
}
