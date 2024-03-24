public class MaxFinderArrayRange {
    public static void main(String[] args) {
        int[] arr = {993, 43, 43, 23, 645, 13};
        System.out.println(maxFinder(arr, 1, 4));
    }
    static int maxFinder(int[] arr, int start, int end) {
        int maxValue = arr[start];
        for(int i = start; i <= end; i++) {
            if(arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}