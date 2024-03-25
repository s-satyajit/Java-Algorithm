import java.util.Scanner;

public class NumberFactor{
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        input.close();

        int count=0;
        System.out.print("The factors are: ");

        for(int i=2;i<num;i++){
            if(num%i==0){
                System.out.print(i + ", ");
                count++;
            }
        }
        System.out.println();
        System.out.print("Total factors are: " + count);
    }
}