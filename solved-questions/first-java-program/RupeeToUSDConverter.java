import java.util.Scanner;

public class RupeeToUSDConverter{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter the INR amount here: ");
        double rupee = input.nextDouble();

        System.out.println("USD amount is $" + rupee*0.012);

        input.close();
    }
}