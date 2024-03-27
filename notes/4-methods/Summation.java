import java.util.Scanner;

public class Summation {
    public static void main(String[] args) {
        // sum();
        // int ans = sum2();
        // System.out.print(ans);
        int ans2 = sum3(20, 30);
        System.out.println(ans2);
        
    }
    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();
        in.close();
        int sum = num1 + num2;
        System.out.print("The sum is " + sum);
    }

    static int sum2() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();
        in.close();
        int sum = num1 + num2;
        return sum;
    }

    static int sum3(int a, int b) {
        int sum = a + b;
        return sum;
    }

}