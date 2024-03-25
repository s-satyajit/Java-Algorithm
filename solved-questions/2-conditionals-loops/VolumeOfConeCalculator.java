import java.util.Scanner;

public class VolumeOfConeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        double r = input.nextDouble();

        System.out.print("Enter the height: ");
        double h = input.nextDouble();

        input.close();

        double v = Math.PI * Math.pow(r, 2) * (h / 3);
        System.out.print("Volume of the cone is: " + v);
    }
}
