import java.util.Scanner;
public class P3 {
	public static void main(String[] args) {
		System.out.print("starting: ");
		Scanner scan = new Scanner(System.in);
		int start = Integer.valueOf(scan.nextLine());
		System.out.print("ending: ");
		int end = Integer.valueOf(scan.nextLine());
		System.out.print("increment: ");
		int increment = Integer.valueOf(scan.nextLine());
		
		if(start>end) {
			System.out.println("Error input!!");
			
		}else {
		System.out.println("US$          S$");
		System.out.println("--------------");
		for(int i=start;i<=end;i=i+increment) {
			System.out.print(i + "           ");
			System.out.println(i*1.82);
			
		}
		System.out.println("US$          S$");
		System.out.println("--------------");
		int j=start;
		while(j<=end) {
			System.out.print(j + "           ");
			System.out.println(j*1.82);
			j=j+increment;
		}
		System.out.println("US$          S$");
		System.out.println("--------------");
		int k=start;
		do {
			System.out.print(k + "           ");
			System.out.println(k*1.82);
			k=k+increment;
		}while(k<=end);
	}
}
}
