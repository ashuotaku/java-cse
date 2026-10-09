/* Enter the basic salary of an employee of an organization through the keyboard.
  His dearness allowance (DA) is 40% of basic salary, and house rent allowance (HRA) is 20% of basic salary.
  Write a Java Program to calculate his gross salary.
  Print the DA, HRA and Gross salary. */

import java.util.Scanner;

public class A2Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter basic salary: ");
		int sal = sc.nextInt();
		double da = 40.0/100.0 * sal;
		double hra = 20.0/100.0 * sal;
		double gross = sal+da+hra;
		System.out.print("DA is "+da+"\nHRA is "+hra+"\nGross salary is "+gross);
	}

}
