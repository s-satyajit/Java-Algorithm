public class ArraySearch {
    public static void main(String[] args) {
        int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int target = 16;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }

    static int linearSearch(int[] nums, int target) {
        if(nums.length == 0)
            return -1;

        for(int index = 0; index < nums.length; index++) {
            int element = nums[index];
            if(element == target)
                return index;
        }

        return -1;
    }
}
