/* The distance between two cities (in km.) is input through the keyboard.
   Write a Java Program to convert and print this distance in meters, feet, inches and centimeters.
 * Hint: 1km=1000 meter, 1km=3280.8399 feet, 1km= 39370.0787 inch, 1km= 100000 centimeter */

import java.util.Scanner;

public class A2Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the distance in km: ");
		double km = sc.nextDouble();
		double m = km * 1000;
		double feet = km * 3280.8399;
		double inch = km * 39370.0787;
		int cm = (int)(km * 100000);
		System.out.println(km+" km is "+m+" meters");
		System.out.println(km+" km is "+feet+" feet");
		System.out.println(km+" km is "+inch+" inch");
		System.out.println(km+" km is "+cm+" centimeters");
	}
}
