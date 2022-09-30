import java.util.Scanner;
public class P4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("height = ");
		int height = Integer.valueOf(scan.nextLine());
		if(height==0) {
			System.out.println("Error input!!");
		}
		for(int i=1;i<=height;i++) {
			for(int j=i;j>0;j--) {
				if(j%2==1) {
					System.out.print("AA");
				}else {
					System.out.print("BB");
				}
			}
			System.out.println("");
		}
	}
}
