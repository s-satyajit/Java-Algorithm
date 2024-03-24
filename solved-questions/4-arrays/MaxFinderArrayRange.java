public class MaxFinderArrayRange {
    public static void main(String[] args) {
        int[] arr = {23, 53, 2332, 934, 3, 23, 9923};
        System.out.println(maxFinder(arr, 2, 5));
    }
    static int maxFinder(int[] arr, int start,  int end) {
        int maxValue = arr[start];
        for(int i = start; i <= end; i++) {
            if(arr[i] > maxValue) 
                maxValue = arr[i];
        }
        return maxValue;
    }
}