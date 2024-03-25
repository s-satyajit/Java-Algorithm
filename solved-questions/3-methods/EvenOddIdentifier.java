import java.util.Scanner;

public class EvenOddIdentifier {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        in.close();
        evenOddChecker(num);
    }
    static void evenOddChecker(int number) {
        if(number  % 2 == 0)
            System.out.print("This is an even number");
        System.out.print("This is an odd number");
    }
}
