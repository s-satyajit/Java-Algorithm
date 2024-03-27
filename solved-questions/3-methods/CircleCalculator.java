import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        int radius = in.nextInt();
        in.close();
        System.out.println("Circumference of the circle is: " + circumference(radius));
        System.out.print("Area of the circle is: " + area(radius));
    }

    static int circumference(int r) {
        int c = (int)(2 * Math.PI * r);
        return c;
    }
    static int area(int r) {
        int a = (int)(Math.PI * Math.pow(r, 2));
        return a;
    }

}
