/* Write a Java Program that takes a double value t from the command-line and 
 prints the value of cos (5t) + sin (7t). Here, t is in radian. */

import java.util.Scanner;

public class A1P2Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of t: ");
		double t = sc.nextDouble();
		double r = Math.cos(5*t)+Math.sin(7*t);
		System.out.print("cos(5*"+t+") + sin(7*"+t+") = "+r);
	}

}
