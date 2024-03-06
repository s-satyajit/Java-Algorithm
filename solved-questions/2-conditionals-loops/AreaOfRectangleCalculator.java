import java.util.Scanner;

public class AreaOfRectangleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter length: ");
        double length = input.nextDouble();

        System.out.print("Enter height: ");
        double height = input.nextDouble();

        input.close();

        double areaOfRectangle = length * height;
        System.out.println("The area of the rectangle is: " + areaOfRectangle);

    }
}