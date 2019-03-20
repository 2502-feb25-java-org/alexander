package com.revature.design;

public class Factory {
	
	public static Dessert getDessert(String type) {
		switch(type) {
			case "cake": return new Cake();
			case "brownie": return new Brownie();
			case "cookie": return new Cookie();
			default: throw new DessertNotFoundException();
		}
	}
	
}

class DessertNotFoundException extends RuntimeException {
	
	public DessertNotFoundException() {
		super("Did not enter the correct dessert option");
	}
}
	
interface Dessert {
	public String bake();
}

class Cake implements Dessert {
	@Override
	public String bake() {
		return "bake red velvet!";
	}
}

class Cookie implements Dessert {

	@Override
	public String bake() {
		return "everyone loves cholocate chip!";
	}
}

class Brownie implements Dessert {
	
	@Override
	public String bake() {
		return "bake brownie";
	}
	
}
