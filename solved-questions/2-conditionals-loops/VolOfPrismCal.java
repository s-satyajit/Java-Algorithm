import java.util.Scanner;

public class VolOfPrismCal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base: ");
        double b = input.nextDouble();

        System.out.print("Enter the height: ");
        double h = input.nextDouble();

        input.close();

        double v = b * h;
        System.out.print("Volume of the prism is: " + v);
    }
}
