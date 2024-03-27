import java.util.Scanner;

public class PalindromeChecker{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        in.close();
        if(isPalindrome(num))
            System.out.print(num + " is palindrome");
        else
            System.out.println(num + " is not palindrome");
    }

    static boolean isPalindrome(int num) {
        int originalNum = num;
        int number = 0;
        while(num > 0) {
            int rem = num % 10;
            number = number * 10 + rem;
            num /= 10;
        }
        return originalNum == number;
    }

}