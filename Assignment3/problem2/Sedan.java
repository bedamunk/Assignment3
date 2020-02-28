
public abstract class Sedan extends Cars {
	// instance variables
	protected int numDoors;
	protected int trunkSize;
	
	// constructors
	public Sedan(int make, int model, int vinNumber, String carType) {
		super (make, model, vinNumber, carType);
		this.numDoors = numDoors;
		this.trunkSize = trunkSize;
	}
}


