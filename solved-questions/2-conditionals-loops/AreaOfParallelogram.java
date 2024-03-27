import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter base: ");
    double base = input.nextDouble();

    System.out.print("Enter height: ");
    double height = input.nextDouble();

    input.close();

    double areaOfParallelogram = base * height;
    System.out.println("Area of parallelogram is : " + areaOfParallelogram);

    }
}
