
final class Sports extends Cars {
	// instance variables
	private int raceStats;
	
	// constructors
	public Sports(String make, String model, int vinNumber, int raceStats, CarOwners owner) {
		super (make, model, vinNumber, owner);
		this.raceStats = raceStats;
	}
	@Override
	public String toString() {
		String sportscarinfo = super.toString() +  "\nRace Stats: " + raceStats;
		return sportscarinfo;
	}
}

