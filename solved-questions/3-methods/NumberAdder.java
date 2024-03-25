import java.util.Scanner;

public class NumberAdder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int firstNum = in.nextInt();

        System.out.print("Enter the second number: ");
        int secondNum = in.nextInt();

        in.close();

        System.out.print("The sum of numbers is: " + addition(firstNum, secondNum));
    }

    static int addition(int n1, int n2) {
        return n1 + n2;
    }

}
