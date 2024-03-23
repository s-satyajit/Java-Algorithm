import java.util.Scanner;

public class PrimeNumberFinder{
    public static void main(String[] args) {
        
    Scanner in = new Scanner(System.in);

    System.out.print("Enter the first number: ");
    int lower = in.nextInt();

    System.out.print("Enter the second number: ");
    int upper = in.nextInt();

    in.close();

    for(int i = lower; i <= upper; i++) {
        if(isPrime(i))
            System.out.print(i + " ");
    }

    }
    static boolean isPrime(int n) {
        if(n == 0 || n == 1)
            return false;
        
        if(n == 2)
            return true;

        int i = 2;
        while(i * i <= n) {
            if(n % i == 0) 
                return false;
            i++;
        }
        return true;
    }

}