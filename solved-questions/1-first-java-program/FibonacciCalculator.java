import java.util.Scanner;

public class FibonacciCalculator{
    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        int next;

        System.out.print("Please input the term: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();

        for(int i=0;i<=n;i++) {
            System.out.println(first + " ");
            next = first + second;
            first = second;
            second = next;
        }

    }
}