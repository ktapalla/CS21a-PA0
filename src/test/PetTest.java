package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Pet;

class PetTest {

	Pet dog = new Pet("Keoni", "dog", 9);
	Pet cat = new Pet("Bo", "Cat", 3);
	Pet etc = new Pet("Pluto", "turTle", 8);
	
	@Test
	void testPetInit() {
		assertEquals("Keoni", dog.getName());
		assertEquals("dog", dog.getSpecies());
		assertEquals(9, dog.getAge());
		
		assertEquals("Bo", cat.getName());
		assertEquals("cat", cat.getSpecies());
		assertEquals(3, cat.getAge());
		
		assertEquals("Pluto", etc.getName());
		assertEquals("turtle", etc.getSpecies());
		assertEquals(8, etc.getAge());
	}
	
	@Test
	void testMakeSound() {
		assertEquals("bark!", dog.makeSound());
		assertEquals("meow!", cat.makeSound());
		assertEquals("squak!", etc.makeSound());
	}

}
