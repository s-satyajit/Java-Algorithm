import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        System.out.print("Enter side of the triangle: ");
        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double perimeterOfTriangle = 3 * a;

        input.close();

        System.out.print("Perimeter of the triangle is: " + perimeterOfTriangle);
    }
}
