import java.util.Scanner;

public class AreaOfRhombusCalculator{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double areaOfRhombus;

        System.out.print("Enter any side: ");
        double anySide = input.nextDouble();

        System.out.print("Enter height: ");
        double height = input.nextDouble();

        if(anySide != 0 && height != 0) {
            areaOfRhombus = anySide * height;
            System.out.print("The area of the Rhombus is: " + areaOfRhombus);
        }
        else if(anySide != 0 && height == 0) {
            System.out.print("Enter the interior angle: ");
            double interiorAngle = input.nextDouble();
            areaOfRhombus = Math.pow(anySide, 2) * Math.sin(interiorAngle);
            System.out.println("The area of the Rhombus is " + areaOfRhombus);
        }
        else if(anySide == 0 && height == 0) {
            System.out.print("Enter diagonal 1: ");
            double diagonal1 = input.nextDouble();
            System.out.print("Enter diagonal 2: ");
            double diagonal2 = input.nextDouble();
            areaOfRhombus = 0.5 * diagonal1 * diagonal2;
            System.out.println("The area of the Rhombus is " + areaOfRhombus);
        }

        
           

    }
}