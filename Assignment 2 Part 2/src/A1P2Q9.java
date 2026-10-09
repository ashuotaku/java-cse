/* Write a Java Program that prints five uniform random values between 0 and 1,
  their average value, and their minimum and maximum value.
* Note: Use Math.random(), Math.min(), and Math.max(). Don’t use any loop. */

public class A1P2Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n1 = Math.random();
		double n2 = Math.random();
		double n3 = Math.random();
		double n4 = Math.random();
		double n5 = Math.random();
		double avg = (n1+n2+n3+n4+n5)/5;
		double min = Math.min(Math.min(n1, n2), Math.min(Math.min(n3, n4), n5));
		double max = Math.max(Math.max(n1, n2), Math.max(Math.max(n3, n4), n5));
		System.out.println("Random Values:\n"+n1+"\n"+n2+"\n"+n3+"\n"+n4+"\n"+n5);
		System.out.println("Average value: "+avg+"\nMinimum value: "+min+"\nMaximum value: "+max);
	}

}
