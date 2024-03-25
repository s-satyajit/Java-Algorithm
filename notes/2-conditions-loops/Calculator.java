import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Please enter the second number: ");
        int num2 = input.nextInt();

        System.out.print("Please enter the operator: ");
        char op = input.next().trim().charAt(0);

        int ans = 0;

            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                if(op == '+')
                    ans = num1  + num2;
                if(op == '-')
                    ans = num1 - num2;
                if(op == '*')
                    ans = num1 * num2;
                if (op == '/') {
                    if(num2 != 0)
                        ans = num1 / num2;
                }
                if(op == '%')
                    ans = num1 % num2;   
            }
            else if(op == 'x' || op == 'X')
                System.exit(0);
            else
                System.out.println("Invalid Input!");
            System.out.println(ans);
            
            input.close();
    }
}