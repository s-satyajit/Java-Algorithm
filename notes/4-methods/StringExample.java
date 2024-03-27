import java.util.Scanner;

public class StringExample{
    public static void main(String[] args) {
        // greeting();
        // String personalized = greeting2("Satyajit Samal");
        // System.out.println(personalized);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String personalizedName = in.next();
        in.close();
        String personalized = greeting3(personalizedName);
        System.out.print(personalized);
    }

    static void greeting() {
        System.out.println("How are you");
    }

    static String greeting2(String name) {
        String message = "Hey " + name;
        return message;
    }

    static String greeting3(String name2) {
        String message = "Hello " + name2;
        return message;
    }
}