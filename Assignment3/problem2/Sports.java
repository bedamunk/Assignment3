package problem2;

final class Sports extends Cars {
	// instance variables
	private int raceStats;

	// constructors
	public Sports(String make, String model, int vinNumber, int raceStats, CarOwners owner) {
		super(make, model, vinNumber, owner);
		this.raceStats = raceStats;
	}

	public Sports() {

	}

	public int getRaceStats() {
		return raceStats;
	}

	public void setRaceStats(int raceStats) {
		this.raceStats = raceStats;
	}

	@Override
	public String toString() {
		String sportscarinfo = super.toString() + "\nRace Stats: " + raceStats;
		return sportscarinfo;

	}
}
