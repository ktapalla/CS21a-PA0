/**
 * Kirsten Tapalla
 * ktapalla@brandeis.edu
 * September 12, 2021
 * PA0
 * Creates a Person object to be included in the Family
 * No known bugs/errors
 */

package main;

/**
 * NOTE: This class has provided sample Javadoc comments for you. 
 *       In all other classes you must include your own Javadocs.
 *
 */
public class Person {
	
	private String name;
	private int age;
	private int salary;
	
	/**
	 * Creates a Person object with the given name, age, and salary
	 * @param name the name of the Person to be created
	 * @param age the age of the Person to be created
	 * @param salary the salary of the Person to be created
	 */
	public Person(String name, int age, int salary) {
		//TODO: Implement the constructor
		this.name = name;
		this.age = age; 
		this.salary = salary;
	}
	
	/**
	 * returns the name of this Person 
	 * @return a String representing the name of this Person
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * returns the age of this Person
	 * @return an integer representing the age of this Person
	 */
	public int getAge() {
		return this.age;
	}

	/**
	 * returns the salary of this Person
	 * @return an integer representing the salary of this Person
	 */
	public int getSalary() {
		return this.salary;
	}
	
	/**
	 * returns the string said by this Person when they speak
	 * @return String representation of what this Person says
	 */
	public String speak() {
		String s = "";
		if (this.age <= 18) {
			s = "I want a bigger house!";
		} else {
			s = "This house does not have enough rooms to accomodate my family. "
					+ "I would like my family to be assigned to a house with more rooms.";
		}
		return s;
	}
	
	/**
	 * returns a String representation of this Person, including name,age,salary
	 * @return a String representation of this Person 
	 */
	@Override
	public String toString() {
		return this.name + " " + this.age + " " + this.salary;
	}
}

