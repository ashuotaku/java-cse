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
