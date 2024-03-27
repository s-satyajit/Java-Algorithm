import java.util.Scanner;

public class AreaOfTriangleCalculator{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please input the base: ");
        double base = input.nextDouble();

        System.out.print("Please input the height: ");
        double height = input.nextDouble();

        double areaOfTriangle = 0.5 * base * height;
        System.out.print("Area of the triangle is: " + areaOfTriangle);

        input.close();
    }
}