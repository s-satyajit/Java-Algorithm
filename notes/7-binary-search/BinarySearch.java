public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {9, 16, 23, 34, 38, 41, 56, 58, 60, 67, 77, 89};
        int target = 60;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
    // return the index
    // return -1 if it does not exist
    static int binarySearch(int[] arr, int target) {
        if(arr.length == 0)
            return -1;

        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            // find the middle element
            int mid = start + (end - start)/2;

            if(arr[mid] < target) {
                start = mid + 1;
            }

            else if(arr[mid] > target) {
                end = mid -1;
            }

            else
                return mid;
        }
        return -1;
    }
}