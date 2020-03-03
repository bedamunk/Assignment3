package problem2;
public final class Sedan extends Cars {
	// instance variables
	protected int numDoors;
	protected int trunkSize;
	public Sedan() {
		super();
	}
	// constructors
	public Sedan(String make, String model, int vinNumber, String carType, int numDoors, int trunkSize) {
		super (make, model, vinNumber, carType);
		this.numDoors = numDoors;
		this.trunkSize = trunkSize;
	}
	@Override
	public String toString() {
		String sedancarinfo = "\nCar information: " + "\nVin Number: " + vinNumber + "\nCar Type: " + carType + "\nMake: " + make + 
				"\nModel: " + model + "\nNumber of Doors: " + numDoors + "\nTrunk Size: " + trunkSize;
		return sedancarinfo;
	}
}


