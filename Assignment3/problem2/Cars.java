
public class Cars {
	package problem2;

	/*
	 * @author Red Team
	 * Sam Allen
	 * Zachary Clevenger
	 * Amber Ferrebee
	 * Angela Johnson
	 * Bethanie Munkres
	 */

	public class Cars {

		// private instance variables
		protected int make;
		protected int model;
		protected int vinNumber;
		
		// privaate instance variables with aggregation type relationship
		protected String carType
		
		// constructor takes make model vinNumber and carType
		public Cars(int make, int model, int vinNumber, String carType) {
			// set variables equal to the user input
			this.make = make;
			this.model = model;
			this.vinNumber = vinNumber;
			/* testing note:
			 * REMOVE THIS NOTE BEFORE FINALIZING*******************************
			 * this if test will likely be thrown out.  Its a reminder to check
			 * for any conflict til I know how this is being input.  
			 * Feel free to remove if you know when you read this
			 * *****************************************************************
			 */
			// LINES IN QUESTION BEGINNING
			if(carType == null)
				this.carType = neither;		
			// LINIES IN QUESTION END
			this.carType = carType;
		}
		// setters**************************************************************
		
		// setter method to set private data field make
		public void setMake(int newMake) {
			this.make = newMake;
		}
		// setter method to set private data field model
		public void setModel(int newModel) {
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
		public int getMake() {
			return this.make;
		}
		// getter method to return private data field model
		public int getModel() {
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

		/* testing note:
		 * REMOVE THIS NOTE BEFORE FINALIZING*******************************
		 * Unsure about final state of toString()
		 * leaving note to check info given/format or lack of need for toString()
		 * *****************************************************************
		 */
		// toString method
		public String toString() {
			String carinfo = "\nCar information: /nVin Number: " + vinNumber + "/nMake: " + make + 
					"/nModel: " + model;
			return carinfo;
		}
	}


}
