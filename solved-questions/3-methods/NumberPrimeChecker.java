import java.util.Scanner;

public class NumberPrimeChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        in.close();
        System.out.print(isPrime(num));
    }

    static boolean isPrime(int n) {
        int c = 2;
        double sqRoot = Math.sqrt(n);
        while(c <= sqRoot ) {
            if(n % c == 0)
                return false;
            c++;
        }
        return true;
    }

}
