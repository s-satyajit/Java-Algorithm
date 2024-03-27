import java.util.Scanner;

public class NumberMultiplier{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int first = in.nextInt();

        System.out.print("Enter the second number: ");
        int second = in.nextInt();

        in.close();

        System.out.print("The product of the two numbers is: " + multiplication(first, second));
    }

    static int multiplication(int n1, int n2) {
        return n1 * n2;
    }

}