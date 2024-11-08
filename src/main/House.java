/**
 * Kirsten Tapalla
 * ktapalla@brandeis.edu
 * September 12, 2021
 * PA0
 * Creates House objects families can be assigned to
 * No known bugs/errors
 */

package main;

public class House {

	private int rooms;
	private int price;
	private boolean petsAllowed;
	private boolean assigned;

	/**
	 * Creates a House object with the given rooms, price, and pet friendliness
	 * @param rooms - number of rooms in House object  
	 * @param price - price of House object
	 * @param petsAllowed - whether or not House object is pet friendly
	 */
	public House(int rooms, int price, boolean petsAllowed) {
		//TODO: Implement constructor
		this.rooms = rooms;
		this.price = price;
		this.petsAllowed = petsAllowed;
		this.assigned = false;
	}

	/**
	 * @return - returns number of rooms in House
	 */
	public int getRooms() {
		return this.rooms;
	}

	/**
	 * @return - return price of House object
	 */
	public int getPrice() {
		return this.price;
	}

	/**
	 * @return - returns whether or not House object allows pets
	 */
	public boolean petsAllowed() {
		return this.petsAllowed;
	}

	/**
	 * Overrides usual toString() method
	 */
	@Override
	public String toString() {
		return "" + this.rooms + " " + this.price + " " + this.petsAllowed;
	}

	/** 
	 * @return - returns whether House object is already assigned to a family
	 */
	public boolean getAssigned() {
		return this.assigned;
	}
	
	/**
	 * Changes this.assigned to true to indicate house has already been assigned to a family
	 */
	public void setAssigned() {
		this.assigned = true;
	}
}


