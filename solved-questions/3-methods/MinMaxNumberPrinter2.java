import java.util.Scanner;

public class MinMaxNumberPrinter2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNum = in.nextInt();

        System.out.print("Enter the second number: ");
        int secondNum = in.nextInt();

        System.out.print("Enter the third number: ");
        int thirdNum = in.nextInt();

        in.close();

        int large = largestNum(firstNum, secondNum, thirdNum);
        int small = smallestNum(firstNum, secondNum, thirdNum);

        System.out.println("The largest number is: " + large);
        System.out.print("The smallest number is: " + small);

    }

    static int largestNum(int firstNum, int secondNum, int thirdNum) {
        int max = firstNum;
        if(secondNum > firstNum) {
            max = secondNum;
        }
        if(thirdNum > secondNum) {
            max = thirdNum;
        }
        return max;
    }
    
    static int smallestNum(int firstNum, int secondNum, int thirdNum) {
        int  min = firstNum;
        if(secondNum < firstNum) {
            min = secondNum;
        }
        if(thirdNum < secondNum) {
            min = thirdNum;
        }
        return min;
    }

}
