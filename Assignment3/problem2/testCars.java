import problem2.Sedan;
import problem2.Sports;
import problem2.Cars;
import java.util.ArrayList;


public class testCars {
	

	public static void main(String[] args) {


ArrayList<Cars> myList = new ArrayList<Cars>();
Sports car1 = new Sports("Mazda", "Miata", 10, "sports", 55);

Sedan car2 = new Sedan("ClownCarsRUs", "The Biggest", 15, "sedan", 5, 888);

myList.add(car1);
myList.add(car2);
// print array with parameters for object construction
// for comparison with object info
System.out.println("\n--------------------------------");
System.out.println("Information from cars array list: ");
System.out.println(myList);

// get toString of new objects
String carinfo1 = car1.toString();
String carinfo2 = car2.toString();

// print Sports and Sedan object toStrings
System.out.println("\n--------------------------------");
System.out.println("Information from Sports toString(): ");
System.out.printf(carinfo1);
System.out.println("\n--------------------------------");
System.out.println("Information from Sedan toString(): ");
System.out.printf(carinfo2);

}

}
