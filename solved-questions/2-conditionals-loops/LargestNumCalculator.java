import java.util.Scanner;

public class LargestNumCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int userInput;
        int largestNumber = Integer.MIN_VALUE;

        do {
            System.out.print("Enter an integer (or 0 to end): ");
            userInput = in.nextInt();
            if(userInput != 0 && userInput>largestNumber) 
                largestNumber = userInput;
        } while(userInput != 0);
        in.close();
        
        System.out.print("The largest number is: " + largestNumber);
    }
}