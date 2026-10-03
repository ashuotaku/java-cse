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
