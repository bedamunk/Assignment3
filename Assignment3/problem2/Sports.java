package problem2;
final class Sports extends Cars {
	// instance variables
	protected int raceStats;
	
	public Sports() {
		super();
	}
	// constructors
	public Sports(String make, String model, int vinNumber, String carType, int raceStats) {
		super (make, model, vinNumber, carType);
		this.raceStats = raceStats;
	}
	@Override
	public String toString() {
		String sportscarinfo = "\nCar information: " + "\nVin Number: " + vinNumber + "\nCar Type: " + carType + "\nMake: " + make + 
				"\nModel: " + model + "\nRace Stats: " + raceStats;
		return sportscarinfo;
	}
}

