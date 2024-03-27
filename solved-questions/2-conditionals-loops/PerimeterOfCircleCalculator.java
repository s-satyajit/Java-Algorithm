import java.util.Scanner;

public class PerimeterOfCircleCalculator {
    public static void main(String[] args) {
        System.out.print("Enter the radius of the circle: ");
        Scanner input = new Scanner(System.in);
        double r = input.nextDouble();

        input.close();

        double perimeterOfCircle = 2 * Math.PI * r;
        System.out.print("Perimeter of the circle is :" + perimeterOfCircle);
    }
}
