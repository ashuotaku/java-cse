/* Write a Java Program to input a four-digit number from command-line argument
 and find sum of the first and last digit of the number. */

import java.util.Scanner;

public class A1P2Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a four digit number: ");
		int n=sc.nextInt();
		if(n>9999) {
			System.out.print("Invalid! More than four digits.");
		}
		else if(n<1000) {
			System.out.print("Invalid! Less than four digits.");
		}
		else {
			int first = n/1000;
			int last = n%10;
			System.out.print("Sum of the first and last digit of "+n+" is: "+(first+last));
		}
	}
}
