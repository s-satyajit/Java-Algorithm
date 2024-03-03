import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Please enter the number ");
       
       int a = input.nextInt();

       if(a%2==0)
            System.out.println(a + " is an Even number");
        else 
            System.out.println(a + " is an Odd number");

        input.close();
    }
}
