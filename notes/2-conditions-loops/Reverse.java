import java.util.Scanner;

public class Reverse{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        input.close();
        int number = 0;

        while(num>0) {
            int rem = num % 10;
            number = number*10 + rem;
            num /= 10;
        }
        System.out.println(number);
    }
}