
public final class Sedan extends Cars {
	
	// instance variables
	private int numDoors;
	private int trunkSize;
	
	// constructors
	public Sedan(String make, String model, int vinNumber, int numDoors, int trunkSize, CarOwners owner) {
		super (make, model, vinNumber,owner);
		this.numDoors = numDoors;
		this.trunkSize = trunkSize;
	}
	@Override
	public String toString() {
		String sedancarinfo = super.toString() + "\nNumber of Doors: " + numDoors + "\nTrunk Size: " + trunkSize;
		return sedancarinfo;
	}
}


