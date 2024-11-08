/**
 * Remember to include the header comment, even in Test classes! 
 * 
 * You do not need to write JavaDoc comments for Test methods. 
 */

package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


import main.Person;

class PersonTest {

	// Here we instantiate objects that we will reference in our test cases. 
	// You can and should instantiate additional objects here. 

	Person examplePerson1 = new Person("Example Person #1", 50, 50000);
	Person examplePerson2 = new Person("Example Person #2", 18, 0);

	/**
	 * This is an example test case. It tests all of the getters in the Person class.  
	 * 
	 * Getters are very simple methods, so we do not need extensive tests to make sure
	 * that they are working properly. We can also test all 3 getters in the same test case. 
	 * 
	 * 
	 */
	@Test
	void testPersonInit() {
		assertEquals("Example Person #1", examplePerson1.getName());
		assertEquals(50, examplePerson1.getAge());
		assertEquals(50000, examplePerson1.getSalary());
		
		assertEquals("Example Person #2", examplePerson2.getName());
		assertEquals(18, examplePerson2.getAge());
		assertEquals(0, examplePerson2.getSalary());
	}

	/**
	 * More complex methods should have their own test cases, sometimes even more than one. 
	 * Here we have two additional test cases, to test the speak() and toString() methods. 
	 * The speak() method is more complex than a getter, so you should have more than one 
	 * assertion in the test case. Minimally you should test speak() for a child and an adult. 
	 * 
	 * In future assignments you might even have more than one test case per method. Let's say 
	 * you're implementing a List and you want to test the insert() method that you wrote. You 
	 * might have testInsertAtFront, testInsertInMiddle, and testInsertAtEnd test cases. 
	 * 
	 * You should name your test cases in an informative way. The more informative your names 
	 * are and the more modular your test cases are, the easier it will be for you to use 
	 * them to debug your code. 
	 * 
	 * Remember, JUnit tests are always required, and it is in your best interest to write 
	 * thorough, comprehensive tests. The better your tests are the more likely you are to 
	 * pass the grading tests. 
	 * 
	 */
	@Test
	void testSpeak() {
		assertEquals("This house does not have enough rooms to accomodate my family. I would like my family to be assigned to a house with more rooms.", examplePerson1.speak());
		assertEquals("I want a bigger house!", examplePerson2.speak());
	}

	@Test
	void testToString() {
		String expected1 = examplePerson1.getName() + " " + examplePerson1.getAge() + " " + examplePerson1.getSalary() + " ";
		assertEquals("Example Person #1 50 50000 ", expected1);
		String expected2 = examplePerson2.getName() + " " + examplePerson2.getAge() + " " + examplePerson2.getSalary() + " ";
		assertEquals("Example Person #2 18 0 ", expected2);
	}

}
