/* Write a Java Program that takes seconds as a positive integer from command-line arguments and
   displays the equivalent number of hours, minutes and remaining seconds.
 * Hint: Use the / and % operators for integer division and remainder.  */

import java.util.Scanner;

public class A1P2Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of seconds: ");
		int s = sc.nextInt();
		int hour = s/3600;
		int min = (s%3600)/60;
		int sec = (s%60);
		System.out.print(s + " seconds is "+hour+" hours, "+min+" minutes and "+sec+" seconds.");
	}

}
