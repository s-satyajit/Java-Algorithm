
import java.util.Scanner;

public class ArithmeticOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the first number: ");
        double a = input.nextDouble();

        System.out.print("Please enter the second number: ");
        double b = input.nextDouble();

        System.out.print("Please enter the operator : ");
        String op = input.next();

        if(op.equals("+"))
            System.out.println("The addition is : " + (a+b));
        else if(op.equals("-"))
            System.out.println("The substraction is : " + (a-b));
        else if(op.equals("*"))
            System.out.println("The multiplication is : " + a*b);
        else if(op.equals("/"))
            System.out.println("The division is : " + a/b);
        else
            System.out.println("Please enter a valid operator.");

        input.close();
    }
}