/* Write a Java Program that reads a Celsius degree in a double value from the console,
 then converts it to Fahrenheit and displays the result.
 * The formula for the conversion is as follows:  fahrenheit = (9 / 5) * celsius + 32
 * Hint: In Java, 9 / 5 is 1, but 9.0 / 5 is 1.8 */

import java.util.Scanner;

public class A2Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a degree in Celsius: ");
		Scanner sc = new Scanner(System.in);
		double cel = sc.nextDouble();
		double far = (9.0/5.0) * cel + 32.0;
		System.out.println(cel+" Celsius is "+far+" Fahrenheit");
	}

}
