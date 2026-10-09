/* Write a Java Program that prints the sum of two random integers between 1 and 6 (such as you might get when rolling dice).
 * Note: Use Math.random( ) */

public class A1P2Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d1 = (int) (Math.random() * 6 + 1);
		int d2 = (int) (Math.random() * 6 + 1);
		System.out.println("First die: "+d1);
		System.out.println("Second die: "+d2);
		System.out.println("Sum: "+(d1+d2));
	}

}
