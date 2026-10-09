/* Write a Java Program that takes three integer values
 from the command line and prints them in ascending order.
 * Note: Use Math.min() and Math.max(). */

import java.util.Scanner;

public class A1P2Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter three integer values: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int least = Math.min(n1, Math.min(n2, n3));
		int most = Math.max(n1, Math.max(n2, n3));
		int middle = (n1 + n2 + n3) - least - most;
		// int middle = Math.max(Math.min(n1, n2), Math.min(Math.max(n1, n2), n3)); // Another way to find middle number
		System.out.print("Ascending order: "+least+" "+middle+" "+most);
	}

}
