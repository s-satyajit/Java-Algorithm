import java.util.Arrays;
import java.util.Scanner;

public class Array{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // int[] arr = new int[5];

        // for(int i = 0; i < arr.length; i++) {
        //     arr[i] = in.nextInt();
        // }

        // for(int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }

        // for(int nums: arr) {           //for every element in array, print the element
        //     System.out.print(nums + " ");    //here num represents element of the array
        // }

        // System.out.print(Arrays.toString(arr));

        String[] str = new String[4];

        for(int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }

        // for(int i = 0; i < str.length; i++) {
        //     System.out.print(str[i] + " ");
        // }

        // for(String ref : str) {
        //     System.out.print(ref + " ");
        // }
        
        System.out.println(Arrays.toString(str));

        in.close();

    }
}