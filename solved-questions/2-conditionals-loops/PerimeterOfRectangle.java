import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter length: ");
        double length = input.nextDouble();

        System.out.print("Enter bredth: ");
        double bredth = input.nextDouble();

        input.close();

        double perimeter = 2 * (length + bredth);
        System.out.print("The perimeter of the rectangle is: " + perimeter);
    }
}
