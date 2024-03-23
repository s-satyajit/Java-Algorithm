import java.util.Scanner;

public class SumOfNaturalNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = in.nextInt();

        in.close();

        System.out.print("The sum of the first " + num + " natural numbers is: " + findSum(num));

    }
    static int findSum(int n) {
        int sum = 0;
        int x = 1;
        while(x <= n) {
            sum = sum + x;
            x++;
        }
        return sum;
    }

}
