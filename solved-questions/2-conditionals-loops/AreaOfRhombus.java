import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        System.out.print("Enter the side: ");

        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        input.close();

        double perimeter = 4 * a;
        System.out.print("Perimeter of the Rhombus is: " + perimeter);
    }
}
