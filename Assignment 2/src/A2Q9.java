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
