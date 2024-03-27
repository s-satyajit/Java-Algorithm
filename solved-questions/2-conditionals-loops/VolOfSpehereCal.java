import java.util.Scanner;

public class VolOfSpehereCal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        double r = input.nextDouble();

        input.close();

        double v = (4.0/3.0) * Math.PI * Math.pow(r, 3);
        System.out.print("Volume of the sphere is: " + v);

    }
}
