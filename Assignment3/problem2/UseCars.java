package problem2;
import java.util.*;


public class UseCars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Cars> list = new ArrayList<>();
		
		System.out.println("Congrats on the new car!");
		System.out.println("Tell me.");
		System.out.println("What ya get?");
		System.out.println("Select from the list: ");
		System.out.println("1: Sports");
		System.out.println("2: Sedan");
		System.out.print("Which is it? ");
		Scanner type = new Scanner(System.in);
		int typeInput = type.nextInt();
		System.out.print("What is the make?");
		Scanner make = new Scanner(System.in);
		String makeInput = make.nextLine(); 
		System.out.print("Model?");
		Scanner model = new Scanner(System.in);
		String modelInput = model.nextLine(); 
		System.out.print("VIN?");
		Scanner vin = new Scanner(System.in);
		int vinInput = vin.nextInt();
		if(typeInput == 1) {
			System.out.print("Race stats?");
			Scanner race = new Scanner(System.in);
			int raceInput = vin.nextInt();
			String sports = "sports";
			Sports();
		}
		

	}

}
