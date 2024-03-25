import java.util.Scanner;

public class AreaOfCircleCalculator {
    public static void main(String[] args) {
        System.out.print("Enter the radius of the circle: ");
        Scanner input = new Scanner(System.in);
        float r = input.nextFloat();
        input.close();

        double areaOfCircle = Math.PI * r * r;
        System.out.println("Area of the circle is : " + areaOfCircle);
    }
}