package Lab3;

import java.util.Arrays;

public class Plane {
	private PlaneSeat[] seat = new PlaneSeat[12];
	private int numEmptySeat;
	private PlaneSeat[] temp = new PlaneSeat[1];
	
	private PlaneSeat[] temp1 = new PlaneSeat[12];
	public Plane() {
		numEmptySeat=12;
		
		for(int i=0;i<12;i++) {
			PlaneSeat PS = new PlaneSeat(i+1);
			seat[i]=PS;
		}
	}
	private PlaneSeat[] sortSeats() {
		for(int i=0;i<12;i++) {
			temp1[i]=seat[i];
		}
		for(int i=0;i<12;i++) {
			for(int j=i;j>0;j--) {
				if(temp1[j].getCustomerID()<temp1[j-1].getCustomerID()) {
					temp[0]=temp1[j];
					temp1[j]=temp1[j-1];
					temp1[j-1]=temp[0];
					
				}
			}
		}
		return temp1;
	}

	public void showNumEmptySeats() {
		System.out.println("There are " + numEmptySeat + " empty seats");
	}
	
	public void showEmptySeats() {
		for(int i=0;i<12;i++) {
			if(seat[i].getCustomerID()==0) {
				System.out.println("SeatID " + seat[i].getSeatID());
			}
		}
		System.out.println();
	}
	
	public void showAssignedSeats(boolean bySeatId) {
		if(bySeatId) {
			for(int i=0;i<12;i++) {
				for(int j=i;j>0;j--) {
					if(seat[j].getSeatID()<seat[j-1].getSeatID()) {
						temp[0]=seat[j];
						seat[j]=seat[j-1];
						seat[j-1]=temp[0];
						
					}
				}
			}
			for(int i=0;i<12;i++) {
				if(seat[i].getCustomerID()!=0) {
					System.out.println("SeatID " + seat[i].getSeatID()+ " assigned to CustomerID " + seat[i].getCustomerID()+".");
				}
			}
			System.out.println();
		}
		else {
			PlaneSeat [] temp2=sortSeats();
			for(int i=0;i<12;i++) {
				if(temp2[i].getCustomerID()!=0) {
					System.out.println("SeatID " + temp2[i].getSeatID()+ " assigned to CustomerID " + temp2[i].getCustomerID()+".");
				}
			}
			System.out.println();
		}
	}
	
	public void assignSeat(int seatId,int cust_id) {
		if(seat[seatId-1].getCustomerID()!=0) {
			System.out.println("Seat already assigned to a customer.");
			System.out.println();
		}
		for(int i=0;i<12;i++) {
			
			if(seat[i].getCustomerID()==0) {
				if(i+1==seatId) {
				PlaneSeat PS = new PlaneSeat(seatId);
				seat[i]=PS;
				seat[i].assign(cust_id);
				numEmptySeat--;
				System.out.println("Seat Assigned!");
				System.out.println();
				}
			}
		}
	}
	
	public void unAssignSeat(int seatId) {
		for(int i=0;i<12;i++) {
			if(seat[i].getSeatID()==seatId) {
				seat[i].unAssign();
				numEmptySeat++;
			}
		}
	}
	
}
