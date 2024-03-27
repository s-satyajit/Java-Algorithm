import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        in.close();
        System.out.print(factorial(num));
    }

    static int factorial(int num) {
       int fact = 1;
       int i = 1;
       while(i<=num) {
        fact *= i;  //fact = fact * i;
        i++;
       }
       return fact;
    }

}
