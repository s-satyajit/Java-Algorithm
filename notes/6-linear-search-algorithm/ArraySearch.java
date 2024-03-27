public class ArraySearch{
    public static void main(String[] args) {
        int[] nums = {23, 65, 34, 76, 98, 45, 867};
        int target = 76;
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