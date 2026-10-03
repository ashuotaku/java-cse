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
