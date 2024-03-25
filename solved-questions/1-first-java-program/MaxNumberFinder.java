import java.util.Scanner;

public class MaxNumberFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input your first number ");
        double a = input.nextDouble();

        System.out.print("Input your second number ");
        double b = input.nextDouble();
        input.close();

        if(a<b)
            System.out.print(b + " is larger");
        else if(a>b)
            System.out.print(a + " is larger");
        else if(a==b)
            System.out.print("Both numbers "+ a + " & " + b + "are equal");
        else
            System.out.print("Please enter a valid input");
        return;


    }
}