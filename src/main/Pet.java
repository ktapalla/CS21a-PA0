/**
 * Kirsten Tapalla
 * ktapalla@brandeis.edu
 * September 12, 2021
 * PA0
 * Creates a Person object to be included in the Family
 * No known bugs/errors 
 */

package main;

public class Pet {

	private String name;
	private String species;
	private int age;

	/**
	 * Creates a Pet object with the given name, species, and age
	 * @param name - name of Pet object 
	 * @param species - species of Pet object 
	 * @param age - age of Pet object 
	 */
	public Pet(String name, String species, int age) {
		//TODO: Implement the constructor
		this.name = name;
		this.species = species;
		this.age = age;
	}

	/**
	 * @return - returns String of Pet object's name 
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @return - returns String of Pet object's species
	 */
	public String getSpecies() {
		return this.species.toLowerCase();
	}

	/**
	 * @return - returns String of Pet object's age
	 */
	public int getAge() {
		return this.age;
	}

	/**
	 * @return - returns String of the noise the animal/pet makes
	 */
	public String makeSound() {
		String s = "";
		if (this.getSpecies().equalsIgnoreCase("cat")) {
			s = "meow!";
		} else if(this.getSpecies().equalsIgnoreCase("dog")) {
			s = "bark!";
		} else {
			s = "squak!";
		}
		return s;
	}

	/**
	 * Overrides usual toString() method
	 */
	@Override
	public String toString() {
		return this.name + " " + this.species + " " + this.age;
	}
}

