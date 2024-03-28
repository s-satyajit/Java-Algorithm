public class ArraySearch {
    public static void main(String[] args) {
        int[] nums = {32, 56, 34, 78, 37, 398, 874};
        int target = 78;
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