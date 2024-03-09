import java.util.Scanner;

public class IntegerSumCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number you want to add, press 0 to stop: ");
        int input = in.nextInt();

        int sum = 0;

        while(input >= 0) {
            if(input == 0)
                break;
            else
                sum = sum + input;

            input = in.nextInt();
        }
        System.out.print("The sum of the given numbers are: " + sum);

        in.close();

    }
}