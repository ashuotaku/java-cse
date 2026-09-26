
public class A1Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2147483647;
		System.out.println(a);
		System.out.println(a+1);
		System.out.println(2-a);
		System.out.println(-2-a);
		System.out.println(2*a);
		System.out.println(4*a);
		
		// Integer Overflow - Best Analogy is clock
		// 2147483647 - integer maximum value
		// -2147483648 - overflow to integer minimum value
		// -2147483645 - normal calculation, because it is under range
		// 2147483647 - underflow
		// -2 - one rotation till -2
		// -4 - double rotation till -4
	}
}
