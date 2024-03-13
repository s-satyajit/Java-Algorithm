import java.util.Scanner;

public class PrimeNumFinder {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        in.close();
        System.out.println(isPrime(num));
    }

    static boolean isPrime(int n) {
        int c = 2;
        while(c * c <= n) {
            if(n % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }

}