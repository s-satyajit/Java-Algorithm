import java.util.Scanner;

public class PerimeterOfSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side: ");
        double a = input.nextDouble();
        input.close();
        
        double perimeter = 4*a;
        System.out.print("Perimeter of the square is: " + perimeter);
    }
}
