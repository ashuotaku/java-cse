/* Write a Java Program that asks the user to enter a number of minutes and displays the equivalent number of hours and remaining minutes.
 * Hint: Use the / and % operators for integer division and remainder. */

import java.util.Scanner;

public class A2Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of minutes: ");
		int min=sc.nextInt();
		int hours=min/60;
		int remMin=min%60;
		System.out.print(min+" minutes is "+hours+" hours and "+remMin+" minutes.");
	}

}
