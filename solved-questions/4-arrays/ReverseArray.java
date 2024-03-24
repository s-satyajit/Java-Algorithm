import java.util.Arrays;

public class ReverseArray{
    public static void main(String[] args) {
        int[] arr = {23, 54, 74, 94, 345};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        swap(arr, start, end);
        while(start < end) {
            start++;
            end--;
        }
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}