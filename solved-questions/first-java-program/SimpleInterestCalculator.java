import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the Principal amount: ");
        double P = input.nextDouble();

        System.out.print("Plese enter the Rate of Interest: ");
        double R = input.nextDouble();

        System.out.print("Plese enter the Time ");
        double T = input.nextDouble();

        System.out.println("The Interest I is : = " + P*R*T);

        input.close();


    }
}