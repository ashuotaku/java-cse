import java.util.Scanner;

class Swapping {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int no1 = sc.nextInt();
        int no2 = sc.nextInt();
        System.out.println("Before swapping no1 = " + no1 + " no2 = " + no2);

        int temp = no1;
        no1 = no2;
        no2 = temp;

        System.out.println("After swapping no1 = " + no1 + " no2 = " + no2);
    }
}