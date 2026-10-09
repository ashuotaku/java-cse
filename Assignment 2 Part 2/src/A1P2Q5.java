/* Write a Java Program that takes three floating point values x, y, and z as command line arguments
 and prints true if the values are strictly ascending or descending (x < y < z or x > y > z), and false otherwise. */

import java.util.Scanner;

public class A1P2Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter three floating point values: ");
		float n1 = sc.nextFloat();
		float n2 = sc.nextFloat();
		float n3 = sc.nextFloat();
		if ((n1>n2 && n2>n3) || (n3>n2 && n2>n1)){
			System.out.print("System Order Check "+n1+" "+n2+" "+n3+" ----> true");
		}
		else {
			System.out.print("System Order Check "+n1+" "+n2+" "+n3+" ----> false");
		}
	}

}
