/* Write a Java Program that takes two positive integers from command-line arguments
 and prints the result of first number raise to the power of second number.Note: Use Math.pow( ) */

import java.util.Scanner;

public class A1P2Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two positive integers: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		if (n1>=0 && n2>=0) {
			int p = (int) Math.pow(n1, n2);
			System.out.print("Power Calculator "+n1+" "+n2+" = "+p);
		}
		else {
			System.out.print("Invalid! Entered number(s) are negative.");
		}
	}

}
