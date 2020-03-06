
import java.util.ArrayList;
import java.util.*;

public class UseCars {
	int sportsCarCounter = 0;
	// Create scanner
	Scanner input = new Scanner(System.in);
	// Create an ArrayList that stores references of any type of cars
	static ArrayList<Cars> carsArray = new ArrayList<Cars>();

	public static void main(String[] args) {
		
		int stubYear = 1776;
		
		// create a few car owners
		CarOwners owner1 = new CarOwners("Barbara Biscuit", "31 Spooner Street, Quahog, Rhode Island");
		CarOwners owner2 = new CarOwners("Ingrid Jackson", "320 Fowler Street, Lynbrook, New York");
		CarOwners owner3 = new CarOwners("Darius Stone", "1640 Riverside Drive, Hill Valley, California");
		CarOwners owner4 = new CarOwners("Johny Madrid", "4 Privet Drive, Little Whinging");
		CarOwners owner5 = new CarOwners("Bella Lovelace", "510 Glenview Drive, Detroit, Michigan");
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
		// Call method that gathers information for a new sports car and add it to the
		// array list
		carsArray.add(getNewSportsCarInfo());
		// Call method that gathers information for a new sedan car and add it to the
		// array list
		carsArray.add(getNewSedanCarInfo());
		// Search for a particular car and display its information
		System.out.println(vinNumberSearch());
		Scanner searchAgainInput = new Scanner(System.in);
		System.out.println(
				"Would you like to search again? Enter 1 to search again.  Enter any other integer to continue without searching. ");
		int searchAgain = searchAgainInput.nextInt();
		while (searchAgain == 1) {
			System.out.println(vinNumberSearch());
			System.out.println(
					"Would you like to search again? Enter 1 to search again.  Enter any other integer to continue without searching. ");
			searchAgain = searchAgainInput.nextInt();
		}
		// display all the cars that are currently stored in the list
		displayCarsArrayInfo();
	}

	// Create a method that requests information about a new car owner
	public String getNewOwner() {
		CarOwners newOwner1 = new CarOwners();
		System.out.println("Ok, let's gather some information about the new car owner.");
		System.out.println("Please enter the car owner's first name: ");
		String firstName = input.next();
		System.out.println("Please enter the car owner's last name: ");
		String lastName = input.next();
		String name = firstName + lastName;
		newOwner1.setName(name);
		System.out.println("Thank you.  Now please enter the car owner's address: ");
		String address = input.next();
		newOwner1.setAddress(address);
		// return a reference of a newly instantiated owner
		String newCarOwnerInfo = newOwner1.toString();
		return newCarOwnerInfo;
	}

	/**
	 * Create another method that requests information about a sport car. The method
	 * will instantiate a sports car and adds it to the array list.
	 */
	// !!!CREATE tests for proper input for each of these prompts to avoid
	// termination
	public static Sports getNewSportsCarInfo() {
		Sports newCar = new Sports();
		Scanner sportsInput = new Scanner(System.in);
		System.out.println("Time to enter information about a new sports car.");
		System.out.println("Please enter the make: ");
		String make = sportsInput.next();
		newCar.setMake(make);
		System.out.println("Please enter the model: ");
		String model = sportsInput.next();
		newCar.setModel(model);
		System.out.println("Please enter the year: ");
		int year = sportsInput.nextInt();
		newCar.setYear(year);
		
		System.out.println("Please enter the vin number (an integer value greater than 0): ");
		int vinNumber = sportsInput.nextInt();
		for (Cars search : carsArray) {
			while (search.getVinNumber() == vinNumber) {
				System.out.println(
						"Sorry, " + vinNumber + " is taken.  Pleae enter a different integer for the vin number: ");
				vinNumber = sportsInput.nextInt();
			}
		}
		newCar.setVinNumber(vinNumber);
		System.out.println("Please enter the number of seconds needed for the car to reach 60mph from resting: ");
		int raceStats = sportsInput.nextInt();
		newCar.setRaceStats(raceStats);
		System.out.println("Please enter the car owner's first name: ");
		String firstName = sportsInput.next();
		System.out.println("Please enter the car owner's last name: ");
		String lastName = sportsInput.next();
		String carOwnerName = firstName + lastName;
		System.out.println("Please enter the address of the owner for this car: ");
		String carOwnerAddress = sportsInput.next();
		CarOwners carOwnerz = new CarOwners();
		carOwnerz.setName(carOwnerName);
		carOwnerz.setAddress(carOwnerAddress);
		newCar.setOwner(carOwnerz);
		System.out.println();
		return newCar;
	}

	// Create another method that does exactly the same but for sedan cars
	// !!!CREATE tests for proper input for each of these prompts to avoid
	// termination
	public static Sedan getNewSedanCarInfo() {
		Sedan newCar = new Sedan();
		Scanner sedanInput = new Scanner(System.in);
		System.out.println("Time to enter information about a new sedan car.");
		System.out.println("Please enter the make: ");
		String make = sedanInput.next();
		newCar.setMake(make);
		System.out.println("Please ener the model: ");
		String model = sedanInput.next();
		newCar.setModel(model);
		System.out.println("Please enter the year: ");
		int year = sedanInput.nextInt();
		newCar.setYear(year);
		
		System.out.println("Please enter the vin number (an integer value): ");
		int vinNumber = sedanInput.nextInt();
		for (Cars search : carsArray) {
			while (search.getVinNumber() == vinNumber) {
				System.out.println(
						"Sorry, " + vinNumber + " is taken.  Pleae enter a different integer for the vin number: ");
				vinNumber = sedanInput.nextInt();
			}
		}
		newCar.setVinNumber(vinNumber);
		System.out.println("Please enter the number of doors: ");
		int numDoors = sedanInput.nextInt();
		newCar.setNumDoors(numDoors);
		System.out.println("Please enter the number of shoes that should fit in the trunk: ");
		int trunkSize = sedanInput.nextInt();
		newCar.setTrunkSize(trunkSize);
		System.out.println("Please enter the car owner's first name: ");
		String firstName = sedanInput.next();
		System.out.println("Please enter the car owner's last name: ");
		String lastName = sedanInput.next();
		String carOwnerName = firstName + lastName;
		System.out.println("Please enter the address of the owner for this car: ");
		String carOwnerAddress = sedanInput.next();
		CarOwners carOwnerz = new CarOwners();
		carOwnerz.setName(carOwnerName);
		carOwnerz.setAddress(carOwnerAddress);
		newCar.setOwner(carOwnerz);
		System.out.println();
		return newCar;
	}

	/*
	 * Create a method that would find and display the information about a given car
	 * based on a provided VIN number
	 */
	public static String vinNumberSearch() {
		String vinSearchCarResults = "";
		Scanner vinNumberInput = new Scanner(System.in);
		System.out.println("Please enter a Vin Number (any number from 1 to 2147483647) to search for a car: ");
		int vinSearchNumber = vinNumberInput.nextInt();
		while (vinSearchNumber <= 0 || vinSearchNumber > 2147483647) {
			System.out.print(vinSearchNumber
					+ " is not within acceptable limits for a vin number. \nPlease enter a value from 1 to 2147483647: ");
			vinSearchNumber = vinNumberInput.nextInt();
		}
		for (Cars search : carsArray) {
			if (search.getVinNumber() == vinSearchNumber) {
				vinSearchCarResults = "Your search on vin number " + vinSearchNumber
						+ " yielded the following information: \n ------------------------------------------------\n"
						+ search.toString();
			}
			if (vinSearchCarResults.isEmpty() == true) {
				vinSearchCarResults = "Your search on vin number " + vinSearchNumber + " yielded no results.";
			}
		}
		return vinSearchCarResults;
	}

	// !!!CREATE Could consider printing this information in a different format
	// !!!possibly in table format and possibly using getters to place information
	// precisely
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