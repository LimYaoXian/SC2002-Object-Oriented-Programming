import java.util.Scanner;
public class P2 {
	public static void main(String[] args) {
		System.out.print("Salary: ");
		Scanner scan = new Scanner(System.in);
		int salary = Integer.valueOf(scan.nextLine());
		System.out.print("Merit: ");
		int merit = Integer.valueOf(scan.nextLine());
		
		if(salary>=700 && salary<=899) {
			if(merit<20)
				System.out.println("Grade B");
			else
				System.out.println("Grade A");
		}
		else if(salary>=600 && salary <=799) {
			if(merit<10) {
				System.out.println("Grade C");
			}
			else
				System.out.println("Grade B");
		}
		else
			System.out.println("Grade C");
		
	}
}
