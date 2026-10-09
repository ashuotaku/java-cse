/* Write a Java Program that prompts the user to enter the side of a hexagon and displays its area.
 * Formula: Area of a hexagon is = 3√3 2 (side)2 */

import java.util.Scanner;

public class A2Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the side of hexagon: ");
		double side = sc.nextDouble();
		double area = (3 * Math.sqrt(3))/2 * Math.pow(side, 2);
		System.out.print("The area of the hexagon is "+area);
	}

}
