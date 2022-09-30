package sce.cz2002.lyx.second;
import java.util.Scanner;
import java.lang.*;
public class Lab2p1 {
	 public static void main(String[] args)
	 {
		 int choice;
		 Scanner sc = new Scanner(System.in);
		 do {
			 	System.out.println("Perform the following methods:");
			 	System.out.println("1: multiplication test");
			 	System.out.println("2: quotient using division by subtraction");
			 	System.out.println("3: remainder using division by subtraction");
			 	System.out.println("4: count the number of digits");
			 	System.out.println("5: position of a digit");
			 	System.out.println("6: extract all odd digits");
			 	System.out.println("7: quit");
			 	choice = sc.nextInt();
			 	sc.nextLine();
			 	switch (choice) {
			 		case 1: Lab2p1.mulTest();
			 		break;
			 		case 2: System.out.print("Please enter m: ");
			 				int m = Integer.valueOf(sc.nextLine());
			 				System.out.print("Please enter n: ");
			 				int n = Integer.valueOf(sc.nextLine());
			 				System.out.println(m + " / " + n + " = " + Lab2p1.divide(m, n));
			 				System.out.println("");
			 		break;
			 		case 3: System.out.print("Please enter m: ");
	 						int k = Integer.valueOf(sc.nextLine());
	 						System.out.print("Please enter n: ");
	 						int j = Integer.valueOf(sc.nextLine());
	 						System.out.println(k + " % " + j + " = " + Lab2p1.modulus(k, j));
	 						System.out.println("");
			 		break;
			 		case 4: System.out.print("Please enter any number: ");
							int num = Integer.valueOf(sc.nextLine());
						    System.out.println("");
			 				if(num<1) {
			 					System.out.println("n : "+ num+ " - Error input!!"); 
			 					System.out.println("");
			 				}else {
			 					System.out.println("n : "+ num+ " - count = "+Lab2p1.countDigits(num)); 
			 					System.out.println("");
			 				}
			 		break;
			 		case 5: System.out.print("Please enter a number: ");
			 				int numb = Integer.valueOf(sc.nextLine());
			 				System.out.println("");
			 				System.out.print("Please enter a digit: ");
			 				int digit = Integer.valueOf(sc.nextLine());
			 				System.out.println("position = " + Lab2p1.position(numb, digit));
			 				System.out.println("");
			 		break;
			 		case 6: System.out.print("Please enter a number: ");
	 						int odd = Integer.valueOf(sc.nextLine());
	 						if(odd<0) {
	 							System.out.println("oddDigits = Error input!!");
	 							System.out.println("");
	 						}else {
			 				System.out.println("oddDigits = " + Lab2p1.extractOddDigits(odd));
			 				System.out.println("");
	 						}
			 		break;
			 		case 7: System.out.println("Program terminating ….");
			 	}
			 } while (choice < 7);
	 /* add method code here */		
	}
	public static void mulTest() {
		Scanner sc = new Scanner(System.in);
		int correct = 0;
		for(int i=1;i<=5;i++) {
			int random = (int)(Math.random()*9)+1; 
			int random2 = (int)(Math.random()*9)+1; 
			System.out.print("How much is " + random + " times "+random2+" ?");
			int answer = Integer.valueOf(sc.nextLine());
			if(answer==(random*random2)) {
				correct++;
			}
		}
		System.out.println("");
		System.out.println(correct+" answers out of 5 are correct.");
		System.out.println("");
	}
	public static int divide(int m,int n) {
		int total=m;
		int count=0;
		for(total=m;total>n;total=total-n) {
			count++;
		}
		return count;
	}
	public static int modulus(int m,int n) {
		int total=m;
		int count=0;
		for(total=m;total>=n;total=total-n) {
			count++;
		}
		return total;
	}
	public static int countDigits(int n) {
		int number=n,count=1;
		
		
		for(number=n;number>9;number=number/10) {
			count++;
		}
		return count;
	}
	public static int position(int n,int digit) {
		int count=1,number=n;
		for(number=n;number>0;number=number/10) {
			if(number%10==digit) {
				return count;
			}
			count++;
		}
		return -1;
	}
	public static long extractOddDigits(long n) {
		long number=n;
		long newNumber = 0,division=1;
		for(number=n;number>0;number=number/10) {
			if((number%10)%2==1) {
				newNumber=((number%10)*division)+newNumber;
			}
			else {
				continue;
			}
			division=division*10;
		}
		if(newNumber==0) {
			return -1;
		}
		return newNumber;
	}
}
