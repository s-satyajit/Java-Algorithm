public class MaxFinderArray {
    public static void main(String[] args) {
        int[] arr = {23, 54, 213, 23, 564};
        System.out.println(maxFinder(arr));
    }
    static int maxFinder(int[] arr) {
        if(arr.length == 0)
            return -1;
            
        int maxValue = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > maxValue) 
                maxValue = arr[i];
        }
        return maxValue;
    }
}