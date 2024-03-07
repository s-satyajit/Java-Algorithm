import java.util.Scanner;

public class PerimeterOfParallelogramCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base: ");
        double b = input.nextDouble();

        System.out.print("Enter the height: ");
        double h = input.nextDouble();

        input.close();

        double perimeter = 2 * (b + h);
        System.out.print("Perimeter of parallelogram is: " + perimeter);
        
    }
}
