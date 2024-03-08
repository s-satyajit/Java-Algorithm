import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.print("Input the number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        input.close();
        int first = 0;
        int second = 1;
        int next;

        int n = 0;
        while(n <= num) {
            next = first + second;
            first = second;
            second = next;
            n++;
        }
        System.out.print("The fibonacci number is: " + second);
    }
}
