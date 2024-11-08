package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Family;
import main.Person;
import main.Pet;

class FamilyTest {

	Family f = new Family(2, 3);
	Person examplePerson1 = new Person("Example Person #1", 50, 50000);
	Person examplePerson2 = new Person("Example Person #2", 18, 0);
	Pet dog = new Pet("Keoni", "dog", 9);
	Pet cat = new Pet("Bo", "Cat", 3);
	Pet etc = new Pet("Pluto", "turTle", 8);
	Person[] ppl = {examplePerson1, examplePerson2};
	Pet[] pets = {dog, cat, etc};
	
	@Test
	void testFamilyInit() {
		f.addMember(examplePerson1);
		f.addMember(examplePerson2);
		f.addPet(dog);
		f.addPet(cat);
		f.addPet(etc);
		assertArrayEquals(ppl, f.getPeople());
		assertArrayEquals(pets, f.getPets());
		assertEquals(50000, f.getBudget());
	}
	
	@Test
	void testNumberOfPeople() {
		assertEquals(2, f.numberOfPeople());
	}

	@Test
	void testNumberOfPets() {
		assertEquals(3, f.numberOfPets());
	}
}
