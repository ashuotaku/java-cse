/* Write a Java Program that displays the following table. Cast floating-point numbers into integers. */


public class A2Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("a\tb\tpow(a,b)");
        int a = 1;
        int b = 2;
        System.out.println(a+"\t"+b+"\t"+(int)Math.pow(a, b));
        a = 2;
        b = 3;
        System.out.println(a+"\t"+b+"\t"+(int)Math.pow(a, b));
        a = 3;
        b = 4;
        System.out.println(a+"\t"+b+"\t"+(int)Math.pow(a, b));
        a = 4;
        b = 5;
        System.out.println(a+"\t"+b+"\t"+(int)Math.pow(a, b)); 
        a = 5;
        b = 6;
        System.out.println(a+"\t"+b+"\t"+(int)Math.pow(a, b));
	}

}
