import java.util.Scanner;

public class A2Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of minutes: ");
		int min=sc.nextInt();
		int hours=min/60;
		int remMin=min%60;
		System.out.print(min+" minutes is "+hours+" hours and "+remMin+" minutes.");
	}

}
