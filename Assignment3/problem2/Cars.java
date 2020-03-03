package problem2;
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
		protected int vinNumber;
		
		// private instance variables with aggregation type relationship
		protected String carType;
		
		public Cars() {
			
		}
		// constructor takes make model vinNumber and carType
		public Cars(String make, String model, int vinNumber, String carType) {
			// set variables equal to the user input
			this.make = make;
			this.model = model;
			this.vinNumber = vinNumber;
			this.carType = carType;
		}
		// setters**************************************************************
		
		// setter method to set private data field make
		public void setMake(String newMake) {
			this.make = newMake;
		}
		// setter method to set private data field model
		public void setModel(String newModel) {
			this.model = newModel;
				}
		// setter method to set private data field vinNumber
		public void setVinNumber(int newVinNumber) {
			this.vinNumber = newVinNumber;
				}
		// setter method to set private data field carType
		public void setCarType(String newCarType) {
			this.carType = newCarType;
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
		// getter method to return private data field vinNumber
		public int getVinNumber() {
			return this.vinNumber;
		}
		// getter method to return private data field carType
		public String getCarType() {
			return this.carType;
		}
		
		// toString method
		public String toString() {
			String carinfo = "\nCar information: /nVin Number: " + vinNumber + "/nCar Type: " + carType + "/nMake: " + make + 
			"/nModel: " + model;
			return carinfo;
		}
	
}
