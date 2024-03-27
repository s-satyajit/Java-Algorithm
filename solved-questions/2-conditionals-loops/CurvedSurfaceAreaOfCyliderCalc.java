import java.util.Scanner;

public class CurvedSurfaceAreaOfCyliderCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = input.nextDouble();

        System.out.print("Enter height: ");
        double h = input.nextDouble();

        input.close();

        double surfaceArea = 2 * Math.PI * r * h;
        System.out.print("Curved surface area of the cylinder is: " + surfaceArea);
    }
}
