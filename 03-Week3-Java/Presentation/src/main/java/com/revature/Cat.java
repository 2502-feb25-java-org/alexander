package com.revature;

/**
 * This class extends Pet as a patient to be used in the vet clinic example.
 *
 */
public class Cat extends Pet {
	
	static final String PET_TYPE = "cat";	// final type for cats

	public Cat() {
		super();
	}
	
	public Cat(String name, String breed, int age) {
		super(name, breed, age);
	}
	
	@Override
	public String getType() {
		return this.PET_TYPE;
	}
}
