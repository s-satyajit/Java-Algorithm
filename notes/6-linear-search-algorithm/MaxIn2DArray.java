public class MaxIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {23, 4, 1},
            {18, 12, 3, 9},
            {78, 99, 34, 56},
            {18, 12}
        };
        System.out.println(max(arr));
    }

    static int max(int[][] arr) {
        int maxNum = Integer.MIN_VALUE;
        for(int[] ints : arr) {
            for(int element : ints) {
                if(element > maxNum)
                    maxNum = element;
            }
        }
        return maxNum;
    }
}