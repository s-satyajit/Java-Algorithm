import java.util.Scanner;

public class TotalSurfaceAreaOfCubeCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter side length of the cube: ");
        double a = input.nextDouble();

        input.close();

        double surfaceArea = 6 * Math.pow(a, 2);
        System.out.print("Total surface area of the cube is: " + surfaceArea);
    }
}
