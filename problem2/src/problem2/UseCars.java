package problem2;

import java.util.ArrayList;
import java.util.*;

public class UseCars {
	int sportsCarCounter = 0;
	// Create scanner	
    Scanner input = new Scanner(System.in);
    // Create an ArrayList that stores references of any type of cars
 	static ArrayList<Cars> carsArray = new ArrayList<Cars>();
 	static ArrayList<CarOwners> ownersArray = new ArrayList<CarOwners>();

	public static void main(String[] args) {
		
		// create a few car owners
		CarOwners owner1 = new CarOwners("Barbara Biscuit", "31 Spooner Street, Quahog, Rhode Island");
		ownersArray.add(owner1);
		CarOwners owner2 = new CarOwners("Ingrid Jackson", "320 Fowler Street, Lynbrook, New York");
		ownersArray.add(owner2);
		CarOwners owner3 = new CarOwners("Darius Stone", "1640 Riverside Drive, Hill Valley, California");
		ownersArray.add(owner3);
		CarOwners owner4 = new CarOwners("Johny Madrid", "4 Privet Drive, Little Whinging");
		ownersArray.add(owner4);
		CarOwners owner5 = new CarOwners("Bella Lovelace", "510 Glenview Drive, Detroit, Michigan");
		ownersArray.add(owner5);
				
		// create a few sports cars
		Sports car1 = new Sports("BMW", "M3", 2017, 1, 6, owner1);
		carsArray.add(car1);
		Sports car2 = new Sports("Chevrolet", "Carmaro", 2016, 2, 5, owner2);
		carsArray.add(car2);
		Sports car3 = new Sports("Ford", "Mustang", 2020, 3, 6, owner3);
		carsArray.add(car3);
		Sports car4 = new Sports("Mazda", "Miata", 2000, 4, 4, owner4);
		carsArray.add(car4);
		Sports car5 = new Sports("Nissan", "370z", 2018, 5, 5, owner5);
		carsArray.add(car5);
		
		// create a few sedan cars
		Sedan car6 = new Sedan("Toyota", "Avalon", 1990,  6, 4, 2, owner1);
		carsArray.add(car6);
		Sedan car7 = new Sedan("Audi", "A6", 7, 4, 2010,  3, owner1);
		carsArray.add(car7);
		Sedan car8 = new Sedan("Genesis", "G70", 2020, 8, 4, 1, owner1);
		carsArray.add(car8);
		Sedan car9 = new Sedan("Porsche", "Panamera", 2019, 9, 4, 3, owner2);
		carsArray.add(car9);
		Sedan car10 = new Sedan("Nissan", "Versa", 2018, 10, 4, 2, owner1);
		carsArray.add(car10);
		
		// Call method that gathers information for a new sports car 
		// and add it to the cars array list
		carsArray.add(getNewSportsCarInfo());
		
		// Call method that gathers information for a new sedan car 
		//and add it to the cars array list
		carsArray.add(getNewSedanCarInfo());
		
		// Search for a particular car and display its information 
		System.out.println(vinNumberSearch());
		Scanner searchAgainInput = new Scanner(System.in);
		System.out.println("--------------------------------------");
		System.out.println("Would you like to search again? Enter 1 to search again.  \nEnter any other integer to continue without searching. ");
		while (!searchAgainInput.hasNextInt()) {
			System.out.println("That input was incorrect.  \nPlease enter 1 to search again.  \nEnter any other integer to continue without searching. ");
			searchAgainInput.next();
		}
		int searchAgain = searchAgainInput.nextInt();
			while(searchAgain == 1) {
				System.out.println(vinNumberSearch());
				System.out.println("--------------------------------------");
				System.out.println("Would you like to search again? \nEnter 1 to search again.  Enter any other integer to continue without searching. ");
				System.out.println("--------------------------------------");
				searchAgain = searchAgainInput.nextInt();
			}
	
				
		// display all the cars that are currently stored in the list
		System.out.println("--------------------------------------");
		System.out.println("--------------------------------------");
		System.out.println("--------------------------------------");
		displayCarsArrayInfo();
	
	}
	
	// Create a method that requests information about a new car owner
	public static CarOwners getNewOwner() {
		Scanner ownerInput = new Scanner(System.in);
		CarOwners newOwner = new CarOwners();
        System.out.println("Ok, let's gather some information about the new car owner.");
        System.out.println("----------------------------------------");
        System.out.println("----------------------------------------");
        System.out.println("Please enter the car owner's first name: ");
        String firstName = ownerInput.nextLine();
        System.out.println("Please enter the car owner's last name: ");
        String lastName = ownerInput.nextLine();
        String name = firstName + " " + lastName;
        newOwner.setName(name);
        System.out.println("Thank you.  Now please enter the car owner's address: ");
        String address = ownerInput.nextLine();
        newOwner.setAddress(address);
        // return a reference of a newly instantiated owner
        String newCarOwnerInfo = newOwner.toString();
        return newOwner;
       
	}

	
	/** Create another method that requests information about a sport car.  
	* The method will instantiate a sports car and adds it to the array list. 
	*/
	// !!!CREATE tests for proper input for each of these prompts to avoid termination
	public static Sports getNewSportsCarInfo() {
		Sports newCar = new Sports();
		Scanner sportsInput = new Scanner(System.in);
		System.out.println("Time to enter information about a new sports car.");
		System.out.println("Please enter the make: ");
		String make = sportsInput.nextLine();
		newCar.setMake(make);
		System.out.println("Please enter the model: ");
		String model = sportsInput.nextLine();
		newCar.setModel(model);
		int year;
		do {
			System.out.println("Please enter the model year (between 1886 and 2023) :");
			while (!sportsInput.hasNextInt()) {
				System.out.println ("That's not a year.  Please enter a year between 1886 and 2023 for the car: ");
				sportsInput.next();
			}year = sportsInput.nextInt();
			// advances scanner to next line after nextInt()
			sportsInput.nextLine();
		} while (year < 1886 || year > 2023);
		newCar.setYear(year);
		System.out.println("Please enter the vin number (integer value): ");
		int vinNumber = sportsInput.nextInt();
		// advances scanner to next line after nextInt()
		sportsInput.nextLine();
		for (Cars search : carsArray) {			
			while(search.getVinNumber() == vinNumber) {
				System.out.println("Sorry, " +  vinNumber + " is taken.  Please enter a different integer for the vin number: ");
				vinNumber = sportsInput.nextInt();
				// advances scanner to next line after nextInt()
				sportsInput.nextLine();
			}
		}
		newCar.setVinNumber(vinNumber);
		System.out.println("Please enter the number of seconds needed for the car to reach 60mph from resting: ");
		int raceStats = sportsInput.nextInt();
		// advances scanner to next line after nextInt()
		sportsInput.nextLine();
		newCar.setRaceStats(raceStats);
		System.out.println("Is this car owned by someone already registered as a car owner? ");
		System.out.println("(1)Press 1 for yes and to search for that owner.");
		System.out.println("----");
		System.out.println("OR");
		System.out.println("----");
		System.out.println("(2)Press any other integer for no and to create a new owner in the system: ");
		int ownerType = sportsInput.nextInt();
		// advances scanner to next line after nextInt()
		sportsInput.nextLine();
		String carOwnerSearchResults = "";
		if (ownerType == 1){
			System.out.println("Ok, lets search for the owner." + 
		"\nPlease enter the first and last name of the owner separated by a space." 
					+ "This must be an exact match: ");
			String ownerSearchString = sportsInput.nextLine();
			
			for (CarOwners search : ownersArray) {	
				String ownerSearchName = search.getName();
				if(ownerSearchName.contentEquals(ownerSearchString)) {
					carOwnerSearchResults = "Your search on name: " + ownerSearchString + " yielded the following information: \n ------------------------------------------------\n" + search.toString() + 
							"\n" + ownerSearchString + " will be registered as the owner of this car.";
					newCar.setOwner(search);
					System.out.println(carOwnerSearchResults);
				}
				if (carOwnerSearchResults.isEmpty() == true){
					carOwnerSearchResults = "Your search on name: " + ownerSearchString + " yielded no results.";
					System.out.println(carOwnerSearchResults);
					System.out.println("Let's go ahead and create a new owner to register in the system for this car.");
					
					newCar.setOwner(getNewOwner());
				}
				
			}
			
			
			
		}
		else if (ownerType != 1) {
			newCar.setOwner(getNewOwner());
			
		}
		return newCar;
			
		}
	
	// Create another method that does exactly the same but for sedan cars
	// !!!CREATE tests for proper input for each of these prompts to avoid termination
	public static Sedan getNewSedanCarInfo() {
		Sedan newCar  = new Sedan();
		Scanner sedanInput = new Scanner(System.in);
		System.out.println("Time to enter information about a new sedan car.");
		System.out.println("Please enter the make: ");
		String make = sedanInput.nextLine();
		newCar.setMake(make);
		System.out.println("Please ener the model: ");
		String model = sedanInput.nextLine();
		newCar.setModel(model);
		//*******************
		int year;
		do {
			System.out.println("Please enter the model year (between 1886 and 2023) :");
			while (!sedanInput.hasNextInt()) {
				System.out.println ("That's not a year.  Please enter a year between 1886 and 2023 for the car: ");
				sedanInput.next();
			}year = sedanInput.nextInt();
			// advances scanner to next line after nextInt()
			sedanInput.nextLine();
		} while (year < 1886 || year > 2023);
		newCar.setYear(year);
		
		System.out.println("Please enter the vin number (an integer value): ");
		int vinNumber = sedanInput.nextInt();
		sedanInput.nextLine();
		for (Cars search : carsArray) {			
			while(search.getVinNumber() == vinNumber) {
				System.out.println("Sorry, " +  vinNumber + " is taken.  Please enter a different integer for the vin number: ");
				vinNumber = sedanInput.nextInt();
				// advances scanner to next line after nextInt()
				sedanInput.nextLine();
			}
		}
		newCar.setVinNumber(vinNumber);
		System.out.println("Please enter the number of doors: ");
		int numDoors = sedanInput.nextInt();
		// advances scanner to next line after nextInt()
		sedanInput.nextLine();
		newCar.setNumDoors(numDoors);
		System.out.println("Please enter the cubic feet for the trunk size: ");
		int trunkSize = sedanInput.nextInt();
		// advances scanner to next line after nextInt()
		sedanInput.nextLine();
		newCar.setTrunkSize(trunkSize);
		System.out.println("Is this car owned by someone already registered as a car owner? ");
		System.out.println("(1)Press 1 for yes and to search for that owner.");
		System.out.println("----");
		System.out.println("OR");
		System.out.println("----");
		System.out.println("(2)Press any other integer for no and to create a new owner in the system: ");
		int ownerType = sedanInput.nextInt();
		// advances scanner to next line after nextInt()
		sedanInput.nextLine();
		String carOwnerSearchResults = "";
		if (ownerType == 1){
			System.out.println("Ok, lets search for the owner." + 
		"\nPlease enter the first and last name of the owner separated by a space." 
					+ "This must be an exact match: ");
			String ownerSearchString = sedanInput.nextLine();
			
			for (CarOwners search : ownersArray) {	
				String ownerSearchName = search.getName();
				if(ownerSearchName.contentEquals(ownerSearchString)) {
					carOwnerSearchResults = "Your search on name: " + ownerSearchString + " yielded the following information: \n ------------------------------------------------\n" + search.toString() + 
							"\n" + ownerSearchString + " will be registered as the owner of this car.";
					newCar.setOwner(search);
					System.out.println(carOwnerSearchResults);
				}
				if (carOwnerSearchResults.isEmpty() == true){
					carOwnerSearchResults = "Your search on name: " + ownerSearchString + " yielded no results.";
					System.out.println(carOwnerSearchResults);
					System.out.println("Let's go ahead and create a new owner to register in the system for this car.");
					
					newCar.setOwner(getNewOwner());
				}
				
			}
			

		}
		else if (ownerType != 1) {
			newCar.setOwner(getNewOwner());
			
		}
		return newCar;
			
		}
	/* Create a method that would find and display the information about a given car
	* based on a provided VIN number
	*/
	public static String vinNumberSearch() {
		String vinSearchCarResults = "";
		Scanner vinNumberInput = new Scanner(System.in);
		System.out.println("Please enter a Vin Number (any number from 1 to 2147483647) to search for a car: ");
		int vinSearchNumber = vinNumberInput.nextInt();
		while (vinSearchNumber<=0 || vinSearchNumber >2147483647) {
			System.out.print(vinSearchNumber + " is not within acceptable limits for a vin number. \nPlease enter a value from 1 to 2147483647: ");
			vinSearchNumber = vinNumberInput.nextInt();
		}
		
		for (Cars search : carsArray) {			
			if(search.getVinNumber() == vinSearchNumber) {
				vinSearchCarResults = "Your search on vin number " + vinSearchNumber + " yielded the following information: \n ------------------------------------------------\n" + search.toString();
			}
			if (vinSearchCarResults.isEmpty() == true){
				vinSearchCarResults = "Your search on vin number " + vinSearchNumber + " yielded no results.";
			}
		}
		return vinSearchCarResults;
	}
	// !!!CREATE Could consider printing this information in a different format
	// !!!possibly in table format and possibly using getters to place information precisely
	public static void displayCarsArrayInfo() {
		System.out.println("Here is a list of cars currently in the system.");
		for (Cars getThatInfo : carsArray) {
			System.out.println("\nCar information: ");
			String result = getThatInfo.toString();
			System.out.println(result);
			System.out.println();
			System.out.println("--------------------------------------");
		}
	}

}
