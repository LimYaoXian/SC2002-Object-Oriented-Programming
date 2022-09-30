package Lab3;

public class PlaneSeat {
	private int seatId;
	private boolean assigned;
	private int customerId;
	
	public PlaneSeat(int seatId){
		this.seatId=seatId;
		this.assigned=false;
		this.customerId=0;
	}
	
	public int getSeatID() {
		return seatId;
	}
	
	public int getCustomerID() {
		return customerId;
	}
	
	public boolean isOccupied() {
		return true;
	}
	
	public void assign(int cust_id) {
		customerId=cust_id;
	}
	
	public void unAssign() {
		customerId=0;
	}
}
