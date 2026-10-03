
public class A1Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(2 + "bc");
		System.out.println(2 + 3 + "bc");
		System.out.println((2+3) + "bc");
		System.out.println("bc" + (2+3));
		System.out.println("bc" + 2 + 3);
		
		// Precedence and Association - 
		// Bracket first, then left to right
		// 2bc
		// 5bc
		// 5bc
		// bc5
		// bc23
		
		double a = 3.14159;
		System.out.println(a);
		System.out.println(a+1);
		System.out.println(8/(int) a);
		System.out.println(8/a);
		System.out.println((int) (8/a));
		
		// Type modifier
		// 3.14159
		// 4.14159
		// 2
		// 2.5464812403910124
		// 2
	}

}
