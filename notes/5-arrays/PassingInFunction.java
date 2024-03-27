import java.util.Scanner;
import java.util.Arrays;

public class PassingInFunction {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] nums = new int[5];

        for(int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        in.close();

        System.out.println(Arrays.toString(nums));

        change(nums);

        System.out.println(Arrays.toString(nums));

    }

    static void change(int[] arr) {
        arr[1] = 99;
    }

}