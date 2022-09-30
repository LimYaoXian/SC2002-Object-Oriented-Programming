package Lab3;
import java.util.Scanner;

public class PlaneApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choice;
		System.out.println("(1) Show number of empty seats");
		System.out.println("(2) Show the list of empty seats");
		System.out.println("(3) Show the list of seat assignments by seat ID");
		System.out.println("(4) Show the list of seat assignments by customer ID");
		System.out.println("(5) Assign a customer to a seat");
		System.out.println("(6) Remove a seat assignment");
		System.out.println("(7) Exit");
		Plane P = new Plane();
		
		
		do {
			System.out.print("   Enter the number of your choice: ");
			choice = scan.nextInt();
			
			switch(choice) {
				case 1: P.showNumEmptySeats();
						System.out.println();
						break;
				case 2: System.out.println("The following seats are empty:");
					    P.showEmptySeats();
						break;
					
				case 3: P.showAssignedSeats(true);
				        break;
					
				case 4: P.showAssignedSeats(false);
						break;
					
				case 5: System.out.println("Assigning Seat ..");
						System.out.print("  Please enter SeatID: ");
						int Seatid = scan.nextInt();
						System.out.print("  Please enter Customer ID: ");
						int Cus = scan.nextInt();
						P.assignSeat(Seatid, Cus);
						break;
				
					
				case 6: System.out.print("Enter SeatID to unassign customer from: ");
						int SeatId = scan.nextInt();
						P.unAssignSeat(SeatId);
						System.out.println("Seat Unassigned!");
						System.out.println();
						break;
					
				case 7: break;
			}
		}while(choice<7);
		
		
	}
}
