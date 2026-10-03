
public class A1Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Integer.MIN_VALUE;
		System.out.println(a);
		System.out.println(a+1);
		System.out.println(2-a);
		System.out.println(-2-a);
		
		// -2147483648 - Minimum Integer Value
		// -2147483647 - Normal calculation, because under limits
		// -2147483646 - Same as previous
		// 2147483646 - Integer underflow by 2
	}

}
