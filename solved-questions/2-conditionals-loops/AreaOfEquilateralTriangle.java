import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side of the triangle: ");
        double side = input.nextDouble();
        input.close();

        double areaOfTriangle = (Math.sqrt(3) / 4) *( Math.pow(side, 2));
        System.out.print("The area of the triangle is: " + areaOfTriangle);

    }
}