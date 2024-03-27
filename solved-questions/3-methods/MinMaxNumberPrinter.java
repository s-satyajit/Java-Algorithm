import java.util.Scanner;

public class MinMaxNumberPrinter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Print the first number: ");
        int firstNum = in.nextInt();
        
        System.out.print("Print the second number: ");
        int secondNum = in.nextInt();

        System.out.print("Print the third number: ");
        int thirdNum = in.nextInt();

        in.close();

        numComparer(firstNum, secondNum, thirdNum);
    }

    static void numComparer(int first, int second, int third) {
        int max = Math.max(first, second);
        max = Math.max(max, third);
        System.out.println("The largest number is: " + max);
        
        int min = Math.min(first, second);
        min = Math.min(min, third);
        System.out.print("The smallest number is: " + min);
    }

}
