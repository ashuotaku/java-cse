// Write a Java Program to input a character from command-line and display the ASCII value of the entered character.

import java.util.Scanner;

public class A1P2Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the character to get its ASCII value: ");
		char ch=sc.next().charAt(0);
		System.out.println("ASCII value of "+ch+" is "+(int) ch);
	}

}
