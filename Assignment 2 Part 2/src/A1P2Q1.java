/* Write a Java Program that takes two positive integers as command-line arguments and 
 prints true if either evenly divides the other. */

import java.util.Scanner;

public class A1P2Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two positive integers: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		if(n1>=0 && n2>=0) {
			int r1; int r2;
			if(n1==0||n2==0) {
				System.out.println("Evenly Divides "+n1+" "+n2+" ---> true");
			}
			else if (n1%n2==0 || n2%n1==0) {
				System.out.println("Evenly Divides "+n1+" "+n2+" ---> true");
			}
			else {
				System.out.println("Evenly Divides "+n1+" "+n2+" ---> false");
			}
		}
		else {
			System.out.print("Invalid! One or both number is a negative integer. Only positive required.");
		}
	}

}
