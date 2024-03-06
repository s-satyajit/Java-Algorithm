import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
        System.out.print("Enter a number to find the number of 3s in it: 234");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();
        int count = 0;

        while(n>0) {
            if(n%10 == 3) {
                count++;
            }
            n = n/10; // n /= 10;
        }
        System.out.println(count);
    }
}