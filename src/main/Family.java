/**
 * Kirsten Tapalla
 * ktapalla@brandeis.edu
 * September 12, 2021
 * PA0
 * Creates a Family, which includes all family members 
 * Uses Person class and Pet class
 * No known bugs/errors 
 */

package main;

public class Family {

	private Person[] familyMembers;
	private Pet[] familyPets;

	//TODO: Implement all methods specified in the PDF. You must use the exact method signatures
	// 	specified in the PDF, and include an appropriate visibility modifier. 

	/**
	 * Creates a Family object with a given amount of Pets and People/Persons 
	 * @param humans - amount of human family members 
	 * @param pets - amount of animal family members 
	 */
	public Family(int humans, int pets) {
		this.familyMembers = new Person[humans];
		this.familyPets = new Pet[pets];
	}

	/**
	 * @return - returns array of Person objects representing family members
	 */
	public Person[] getPeople() {
		return this.familyMembers;
	}

	/**
	 * @return - returns array of Pet objects owned by family 
	 */
	public Pet[] getPets() {
		return this.familyPets;
	}

	/**
	 * @return - returns Family's budget 
	 */
	public int getBudget() {
		int b = 0;
		for (Person p : this.familyMembers) {
			b += p.getSalary();
		}
		return b;
	}

	/**
	 * @return - returns amount of People in Family object
	 */
	public int numberOfPeople() {
		return this.familyMembers.length;
	}
	
	/** 
	 * @return - returns array of Person objects representing family members
	 */
	public int numberOfPets() {
		return this.familyPets.length;
	}

	/**
	 * @param p - Person object given to add to the Family  
	 * @return - returns true or false based on whether Person p could be added
	 */
	public boolean addMember(Person p) {
		for (int i = 0; i < this.numberOfPeople(); i++) {
			if (this.familyMembers[i] == null) {
				this.familyMembers[i] = p;
				return true;
			}
		}
		return false;
	}

	/**
	 * @param p - Pet object given to add to the Family  
	 * @return - returns true or false based on whether Pet p could be added
	 */ 
	public boolean addPet(Pet p) {
		for (int i = 0; i < this.numberOfPets(); i++) {
			if (familyPets[i] == null) {
				familyPets[i] = p;
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Overrides usual toString() method
	 */
	public String toString() {
		String s = "";
		for (Person fam : this.familyMembers) {
			if (fam != null) {
				s += fam.toString() + ", ";
			}
		}
		for (Pet pet : this.familyPets) {
			if (pet != null) {
				s += pet.toString() + ", ";
			}	
		}
		return s.substring(0, s.length() - 2);
	}
}

