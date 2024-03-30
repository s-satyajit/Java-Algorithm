public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {2, 11, 15, 28, 35, 49, 52, 68, 79, 80, 91, 97};
        // int[] arr = {98, 97, 56, 45, 41, 30, 36, 13, 12, 9, 5, 2, 1};
        int target = 52;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0; 
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            int mid = start + (end - start)/2;

            if(arr[mid] == target)
                return mid;

            if(isAsc) {
                if(target > arr[mid])
                    start = mid + 1;
                if(target < arr[mid])
                    end = mid - 1;
            }

            else {
                if(target > arr[mid])
                    end = mid - 1;
                if(target < arr[mid])
                    start = mid + 1;
            }

        }
        return -1;
    }
}