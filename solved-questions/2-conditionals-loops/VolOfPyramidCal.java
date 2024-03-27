import java.util.Scanner;

public class VolOfPyramidCal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter length: ");
        double l = input.nextDouble();

        System.out.print("Enter width: ");
        double w = input.nextDouble();

        System.out.print("Enter height: ");
        double h = input.nextDouble();

        input.close();

        double v = (l * w * h)/3;
        System.out.print("Volume of the pyramid is: " + v);
    }
}
