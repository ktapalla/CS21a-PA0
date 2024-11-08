package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.House;

class HouseTest {
	
	House h1 = new House(5, 850000, false);
	House h2 = new House(3, 500000, true);

	@Test
	void testHouseInit() {
		assertEquals(5, h1.getRooms());
		assertEquals(850000, h1.getPrice());
		assertEquals(false, h1.petsAllowed());
		
		assertEquals(3, h2.getRooms());
		assertEquals(500000, h2.getPrice());
		assertEquals(true, h2.petsAllowed());
	}

}
