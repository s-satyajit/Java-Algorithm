public class MaxFinderArray {
    public static void main(String[] args) {
        int[] arr = {2, 34, 234, 645, 654};

        System.out.println(maxFinder(arr));
    }

    static int maxFinder(int[] arr) {
        int maxValue = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > maxValue) 
                maxValue = arr[i];
        }
        return maxValue;
    }
}