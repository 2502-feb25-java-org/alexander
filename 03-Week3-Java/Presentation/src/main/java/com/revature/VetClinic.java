package com.revature;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Demonstration of Queue of type Pet in a vet clinic.
 * Cats and dogs form a line of patients and are seen in the First-In-First-Out manner.
 *
 */
public class VetClinic {
	
    public static void main( String[] args ) {
    	// Create the first cat with a default constructor.
    	Cat cat1 = new Cat();
    	cat1.setName("Smokey");
    	cat1.setBreed("Maine Coon");
    	cat1.setAge(4);
    	
    	// Create two cats using the second constructor.
    	Cat cat2 = new Cat("Oscar", "Siamese", 2);
    	Cat cat3 = new Cat("Zoe", "Bengal", 9);
    	
    	// Create the first dog with a default constructor.
    	Dog dog1 = new Dog();
    	dog1.setName("Stella");
    	dog1.setBreed("Bulldog");
    	dog1.setAge(7);
    	
    	// Create the second dog using the second constructor.
    	Dog dog2 = new Dog("Max", "Dalmatian", 5);
    	
    	Queue<Pet> patientQueue = new LinkedList<>(); // a line of patients

    	patientQueue.offer(dog1);
    	patientQueue.offer(cat1);
    	patientQueue.offer(cat2);
    	patientQueue.offer(dog2);
    	Pet seenPatient = patientQueue.poll();
    	patientQueue.poll();
    	patientQueue.offer(cat3);
    	patientQueue.poll();
    	patientQueue.poll();
    	patientQueue.poll();
    	printLineSize(patientQueue);
    	printAllPatients(patientQueue);

    }
    
    // Print the current queue size.
    public static void printLineSize(Queue<Pet> patientQueue) {
    	System.out.println("The current size of the line is " + patientQueue.size());
    }
    
    // Print one patient: cat or dog.
    public static void printPatient(Pet pet) {
    	String name = pet.getName().toString();
    	String breed = pet.getBreed().toString();
    	int age = pet.getAge();
    	
    	System.out.println("Patient's information\n" + "Pet type: " + pet.getType());
    	System.out.println("Name: " + pet.getName());
    	System.out.println("Breed: " + pet.getBreed());
    	System.out.println("Age: " + pet.getAge());
    }
    
    // Print all patients' information calling printPatient for every patient.
    public static void printAllPatients(Queue<Pet> patientQueue) {
    	System.out.println("The current line is: \n");
    	
    	for (Pet pet: patientQueue) {
    		printPatient(pet);
    		System.out.print("\n");
    	}
    	
    }
}
