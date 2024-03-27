import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter some input: ");
        int rollno = input.nextInt();
        System.out.println("Your rollno is " + rollno);

        System.out.print("Please enter your name: ");
        String name = input.next();
        System.out.println(name);

        System.out.print("Please enter your marks: ");
        float marks = input.nextFloat();
        System.out.println(marks);

        input.close();
        

    }
}
