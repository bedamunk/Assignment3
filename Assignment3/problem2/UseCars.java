import java.util.ArrayList;
import java.util.*;

public class UseCars {
	int sportsCarCounter = 0;
	// Create scanner	
    Scanner input = new Scanner(System.in);
    // Create an ArrayList that stores references of any type of cars
 	static ArrayList<Cars> carsArray = new ArrayList<Cars>();

	public static void main(String[] args) {
		
		// create a few car owners
		CarOwners owner1 = new CarOwners("Barbara Biscuit", "31 Spooner Street, Quahog, Rhode Island");
		CarOwners owner2 = new CarOwners("Ingrid Jackson", "320 Fowler Street, Lynbrook, New York");
		CarOwners owner3 = new CarOwners("Darius Stone", "1640 Riverside Drive, Hill Valley, California");
		CarOwners owner4 = new CarOwners("Johny Madrid", "4 Privet Drive, Little Whinging");
		CarOwners owner5 = new CarOwners("Bella Lovelace", "510 Glenview Drive, Detroit, Michigan");
				
		// create a few sports cars
		Sports car1 = new Sports("BMW", "M3", 1, 6, owner1);
		carsArray.add(car1);
		Sports car2 = new Sports("Chevrolet", "Carmaro", 2, 5, owner2);
		carsArray.add(car2);
		Sports car3 = new Sports("Ford", "Mustang", 3, 6, owner3);
		carsArray.add(car3);
		Sports car4 = new Sports("Mazda", "Miata", 4, 4, owner4);
		carsArray.add(car4);
		Sports car5 = new Sports("Nissan", "370z", 5, 5, owner5);
		carsArray.add(car5);
		
		// create a few sedan cars
		Sedan car6 = new Sedan("Toyota", "Avalon", 6, 4, 2, owner1);
		carsArray.add(car6);
		Sedan car7 = new Sedan("Audi", "A6", 7, 4, 3, owner1);
		carsArray.add(car7);
		Sedan car8 = new Sedan("Genesis", "G70", 8, 4, 1, owner1);
		carsArray.add(car8);
		Sedan car9 = new Sedan("Porsche", "Panamera", 9, 4, 3, owner2);
		carsArray.add(car9);
		Sedan car10 = new Sedan("Nissan", "Versa", 10, 4, 2, owner1);
		carsArray.add(car10);
		
		// Call method that gathers information for a new sports car and add it to the array list
		carsArray.add(getNewSportsCarInfo());
		
		// Call method that gathers information for a new sedan car and add it to the array list
		carsArray.add(getNewSedanCarInfo());
		// Search for a particular car and display its information 
		System.out.println(vinNumberSearch());
				
		// final stop is displaying all the cars that are currently stored in the list
		displayCarsArrayInfo();
	
	}
	
	// Create a method that requests information about a new car owner
	public String getNewOwner() {
        // Request account ID from user
        System.out.println("Ok, let's gather some information about the new car owner.");
        System.out.println("Please enter the car owner's first and last name: ");
        String name = input.next();
        System.out.println("Thank you.  Now please enter the car owner's address: ");
        String address = input.next();
        
        CarOwners newOwner1 = new CarOwners(name, address);
        sportsCarCounter ++;
        // return a reference of a newly instantiated owner
        String newCarOwnerInfo = newOwner1.toString();
        return newCarOwnerInfo;
        
	}

	
	/** Create another method that requests information about a sport car.  
	* The method will instantiate a sports car and adds it to the array list. 
	*/
	// !!!CREATE tests for proper input for each of these prompts to avoid termination
	public static Sports getNewSportsCarInfo() {
		Scanner sportsInput = new Scanner(System.in);
		System.out.println("Time to enter information about a new sports car.");
		System.out.println("Please enter the make: ");
		String make = sportsInput.next();
		System.out.println("Please enter the model: ");
		String model = sportsInput.next();
		System.out.println("Please enter the vin number (any number between 11 and 2147483647: ");
		int vinNumber = sportsInput.nextInt();
		System.out.println("Please enter the number of seconds needed for the car to reach 60mph from resting: ");
		int raceStats = sportsInput.nextInt();
		System.out.println("Please enter the name of the owner for this car: ");
		String carOwner = sportsInput.next();
		CarOwners carOwnerz = new CarOwners();
		carOwnerz.setName(carOwner);
		Sports newCar = new Sports(make, model, vinNumber, raceStats, carOwnerz);
		System.out.println();
		return newCar;
	}
	
	// Create another method that does exactly the same but for sedan cars
	// !!!CREATE tests for proper input for each of these prompts to avoid termination
	public static Sedan getNewSedanCarInfo() {
		Scanner sedanInput = new Scanner(System.in);
		System.out.println("Time to enter information about a new sedan car.");
		System.out.println("Please enter the make: ");
		String make = sedanInput.next();
		System.out.println("Please ener the model: ");
		String model = sedanInput.next();
		System.out.println("Please enterthe vin number (any number between 11 and 2147483647: ");
		int vinNumber = sedanInput.nextInt();
		System.out.println("Please enter the number of doors: ");
		int numDoors = sedanInput.nextInt();
		System.out.println("Please enter the number of shoes that should fit in the trunk: ");
		int trunkSize = sedanInput.nextInt();
		System.out.println("Please enter the name of the owner for this car: ");
		String carOwner = sedanInput.next();
		CarOwners carOwnerz = new CarOwners();
		carOwnerz.setName(carOwner);
		Sedan newCar  = new Sedan(make, model, vinNumber, numDoors, trunkSize, carOwnerz);
		System.out.println();
		return newCar;
	}
	/* Create a method that would find and display the information about a given car
	* based on a provided VIN number
	*/
	// obv need to build this out and remove this noooote.
	public static String vinNumberSearch() {
		String vinSearchCarResults = "";
		Scanner vinNumberInput = new Scanner(System.in);
		System.out.println("Please enter a Vin Number (any number from 1 to 2147483647) to search for a car: ");
		int vinSearchNumber = vinNumberInput.nextInt();
		
		// !!!CREATE test for proper input to avoid termination
		
		// !!!CREATE loop to search for existence of vin number and ask again if it doesn't exist
		
		for (Cars search : carsArray) {			
			if(search.getVinNumber() == vinSearchNumber) {
				vinSearchCarResults = "Your search on vin number " + vinSearchNumber + " yielded the following information: \n ------------------------------------------------\n" + search.toString();
			}
		}
		return vinSearchCarResults;
	}
	// !!!CREATE Could consider printing this information in a different format
	// !!!possibly in table format and possibly useing getters to place information precisely
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
