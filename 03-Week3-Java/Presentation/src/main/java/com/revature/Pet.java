package com.revature;

/**
 *	Abstract class to be used by child classes Cat and Dog.
 *
 */
public abstract class Pet {
	
    private String name;
    private String breed;
    private int age;

    // Empty constructor
    public Pet() {
        this.name = null;
        this.breed = null;
        this.age = 0;
    }

    // Full constructor
    public Pet(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }
    
    public String getName() {
    	return this.name;
    }
    
    public void setName(String name) {
    	this.name = name;
    }
    
    public String getBreed() {
    	return this.breed;
    }
    
    public void setBreed(String breed) {
    	this.breed = breed;
    }
    
    public int getAge() {
    	return this.age;
    }
    
    public void setAge(int age) {
    	this.age = age;
    }
    
    // Print whether it's a cat or a dog
    public abstract String getType();
}
