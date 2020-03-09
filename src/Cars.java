
public class Cars {
	

	/*
	 * @author Red Team
	 * Sam Allen
	 * Zachary Clevenger
	 * Amber Ferrebee
	 * Angela Johnson
	 * Bethanie Munkres
	 */

		// private instance variables
		protected String make;
		protected String model;
		protected int year;
		protected int vinNumber;
		
		// private instance variable with aggregation type relationship
		protected CarOwners owner;
		
		public Cars(CarOwners owner) { // i agree we need a constructor with the least amount of constructors possible, but if we have a totally arg-less one than it would be possible to create a car without an owner
			
		}
		
		// constructor takes make model vinNumber and carType
		public Cars(String make, String model, int year, int vinNumber, CarOwners owner) {
			// set variables equal to the user input
			this.make = make;
			this.model = model;
			this.vinNumber = vinNumber;
			this.owner = owner;
		}
		// setters**************************************************************
		
		// setter method to set private data field make
		public void setMake(String make) {
			this.make = make;
		}
		// setter method to set private data field model
		public void setModel(String model) {
			this.model = model;
		}
		// setter method to set private data field model
		public void setYear(int year) {
			this.year = year;
		}
		// setter method to set private data field vinNumber
		public void setVinNumber(int vinNumber) {
			this.vinNumber = vinNumber;
		}
		// setter method to set protected data field owner
		public void setOwner(CarOwners owner) {
			this.owner = owner;
		}
		
		// getters**************************************************************
		
		// getter method to return private data field make
		public String getMake() {
			return this.make;
		}
		// getter method to return private data field model
		public String getModel() {
			return this.model;
		}
		// getter method to return private data field model
		public int getYear() {
			return this.year;
		}
		// getter method to return private data field vinNumber
		public int getVinNumber() {
			return this.vinNumber;
		}
		// setter method to set protected data field owner
		public CarOwners getOwner() {
			return this.owner;
		}
		
		// toString method
		public String toString() {
			String carinfo = "Owner: " + owner.toString()+ "\nVin Number: " + vinNumber + "\nMake: " + make + 
			"\nModel: " + model; // added "Owner: " to string since all the other variables have a descriptor before them
			return carinfo;
		}
	
}
