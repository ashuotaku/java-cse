import java.util.Scanner;

public class A2Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the original price: ");
		double oriPrice = sc.nextDouble();
		System.out.print("Enter the discount percentage: ");
		double discount = sc.nextDouble();
		double disAmount = discount/100.0 * oriPrice;
		double finPrice = oriPrice - disAmount;
		System.out.print("Discount Amount = "+disAmount+"\nFinal Price = "+finPrice);
	}

}
