/**
 * Kirsten Tapalla
 * ktapalla@brandeis.edu
 * September 12, 2021
 * PA0
 * Main class
 * - Runs program to assign Family objects to House objects when possible
 * No known bugs/errors 
 */

package main;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static Family[] f;
	public static House[] h;
	public static boolean[][] assignments;

	/**
	 * Runs program  
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		// Reads input file; scans file to create families
		System.out.println("Enter file containing list of Families");
		File famFile = new File(console.next());
		Scanner famScan = new Scanner(famFile);
		createFamilies(famScan);
		System.out.println();
		// Reads input file; scans file to create houses
		System.out.println("Enter file containing list of Houses");
		File houseFile = new File(console.next());
		Scanner houseScan = new Scanner(houseFile);
		createHomes(houseScan);
		System.out.println();
		//houses assigned; assignments printed
		assignFamiliesToHomes();
		displayAssignments();
		
		//checks assignment for accuracy/validity
		for (int i = 0; i < f.length; i++) {
			checkAssignment(i);
		}
	}

	/**
	 * Families are logged/created 
	 * All Family members and Pets are added into the family 
	 * Initializes Family[] f array
	 * @param s - Scanner object; reads/scans through Family files 
	 */
	public static void createFamilies(Scanner s) {
		int n = s.nextInt();
		f = new Family[n];
		for(int fInd = 0; fInd < f.length; fInd++) {
			Family fams = f[fInd];
			int humNum = s.nextInt();
			int petNum = s.nextInt();
			fams = new Family(humNum, petNum);
			for (int i = 0; i < humNum; i++) {
				String name = s.next();
				int age = s.nextInt();
				int sal = s.nextInt();
				Person per = new Person(name, age, sal);
				fams.addMember(per);
			}
			for (int i = 0; i < petNum; i++) {
				String name = s.next();
				String spe = s.next();
				int age = s.nextInt();
				Pet pet = new Pet(name, spe, age);
				fams.addPet(pet);
			}
			f[fInd] = fams;
		}
	}

	/**
	 * Houses are logged/created  
	 * Initializes House[] h array
	 * @param s - Scanner object; reads/scans through House files 
	 */
	public static void createHomes(Scanner s) {
		h = new House[s.nextInt()];
		for (int i = 0; i < h.length; i++) {
			int rooms = s.nextInt();
			int price = s.nextInt();
			String petStr = s.next();
			boolean petBool = false;
			if (petStr.equalsIgnoreCase("true")) {
				petBool = true;
			}
			h[i] = new House(rooms, price, petBool);
		}
	}

	/**
	 * Assigns Family to Home if possible 
	 * - Enough rooms for all family members 
	 * - House is within the Family's budget 
	 * - House can accommodate for Pets if needed
	 * - House assigned set to true so only one Family is assigned to each House
	 * - hInd set to h.length so Family is only assigned to the first House that can accommodate them 
	 */
	public static void assignFamiliesToHomes() {
		assignments = new boolean[f.length][h.length];
		for (int fInd = 0; fInd < f.length; fInd++) {
			Family fam = f[fInd];
			for (int hInd = 0; hInd < h.length; hInd++) {
				House house = h[hInd];
				if (house.getAssigned() == false && fam.numberOfPeople() <= house.getRooms() && fam.getBudget() >= house.getPrice()) {
					if (fam.numberOfPets() == 0 || (fam.numberOfPets() > 0 && house.petsAllowed() == true) ) {
						assignments[fInd][hInd] = true;
						hInd = h.length;
						house.setAssigned();
					}
				}
			}
		}
	}

	/**
	 * Prints which House a Family is assigned to
	 * Also indicates which Families aren't assigned to a House 
	 */
	public static void displayAssignments() {
		for(int fInd = 0; fInd < f.length; fInd++) {
			Family fam = f[fInd];
			int tCount = 0;
			for(int hInd = 0; hInd < h.length; hInd++) {
				House house = h[hInd];
				if (assignments[fInd][hInd] == true) {
					System.out.println(fam.toString() + " assigned to - ");
					System.out.println(house.toString());
					System.out.println();
					tCount++;
				} if( (tCount == 0) && (hInd == (h.length-1)) ) {
					System.out.println(fam.toString() + " - ");
					System.out.println("not assigned to home");
					System.out.println();
				}
			}
		}
	}

	/**
	 * Checks if Family assignments are all correct/accurate 
	 * - House can fit Family
	 * - Family can afford House 
	 * - Pets allowed if necessary 
	 * @param familyIndex - integer/index of Family that is being checked
	 */
	public static void checkAssignment(int familyIndex) {
		Family fam = f[familyIndex];
		int aHouse = 0;
		for (int i = 0; i < h.length; i++) {
			House house = h[i];
			if (assignments[familyIndex][i] == true) {
				aHouse++;
				if (fam.numberOfPeople() > house.getRooms()) {
					for (Person ppl : fam.getPeople()) {
						System.out.println(ppl.speak());
					}
				} if (fam.numberOfPets() > 0 && house.petsAllowed() == false) {
					for (Pet pet : fam.getPets()) {
						System.out.println(pet.makeSound());
					}
				} if(fam.getBudget() < house.getPrice()) {
					System.out.println("house over budget"); 
				} if(aHouse > 1) {
					System.out.println("family assigned to more than one house");
				}
			}
		}
	}
}

