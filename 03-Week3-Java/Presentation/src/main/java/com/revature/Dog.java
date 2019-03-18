package com.revature;

/**
 * This class extends Pet as a patient to be used in the vet clinic example.
 *
 */
public class Dog extends Pet{
	
	static final String PET_TYPE = "dog";// final type for dogs
	
	public Dog() {
		super();
	}
	
	public Dog(String name, String breed, int age) {
		super(name, breed, age);
	}
	
	@Override
	public String getType() {
		return this.PET_TYPE;
	}
}
