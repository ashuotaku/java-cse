/* Write a Java Program that reads an integer between 0 and 1000 and adds all the digits in the integer.
 * For example, if an integer is 932, the sum of all its digits is 14.
 * Hint: Use the % operator to extract digits, and use the / operator to remove the extracted digit.
 * For instance, 932 % 10 = 2 and 932 / 10 = 93. */

import java.util.Scanner;

public class A2Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number between 0 and 1000: ");
		int num=sc.nextInt();
		int sum = 0;
		sum += num % 10;
		num /= 10;
		sum += num % 10;
		num /= 10;
		sum += num % 10;
		System.out.print("The sum of the digits is "+sum);
	}

}
