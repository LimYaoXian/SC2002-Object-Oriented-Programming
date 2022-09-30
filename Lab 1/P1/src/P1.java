
import java.util.Scanner;
public class P1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char input = scan.nextLine().charAt(0);
		
		switch(input) {
			case 'A': System.out.println("Action movie fan\n");
					  break;
			case 'a': System.out.println("Action movie fan\n");
					  break;
			case 'C': System.out.println("Comedy movie fan\n");
			  		  break;
			case 'c': System.out.println("Comedy movie fan\n");
			          break;
			case 'D': System.out.println("Drama movie fan\n");
	  		          break;
			case 'd': System.out.println("Drama movie fan\n");
	                  break;
	        default : System.out.println("Invalid choice\n");
		}
		
	}
}
