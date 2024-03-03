import java.util.Scanner;

public class GreetingMessage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Plese enter your name ");

        System.out.println("Hello " + input.nextLine() + "!");

        input.close();
    }
}