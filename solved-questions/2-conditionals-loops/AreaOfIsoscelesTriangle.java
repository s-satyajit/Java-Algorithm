import java.util.Scanner;

public class AreaOfIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter base: ");
        double base = input.nextDouble();

        System.out.print("Enter height: ");
        double height = input.nextDouble();

        input.close();

        double areaofIsoscelesTriangle = 0.5 * base * height;
        System.out.print("Area of the isosceles triangle is: " + areaofIsoscelesTriangle);


    }
}
