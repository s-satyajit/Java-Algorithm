public class ArraySearch {
    public static void main(String[] args) {
        int[] nums = {32, 56, 34, 78, 37, 398, 874};
        int target = 78;
        int ans = linearSearch(nums, target);
        int ans2 = linearSearch2(nums, target);
        System.out.println(ans + " " + ans2);
    }

    static int linearSearch2(int[] nums, int target) {
        if(nums.length == 0)
            return -1;

        for(int element : nums) {
            if(element == target)
                return element;
        }
        return -1;
    }

    // search in the array: return the index if item found
    //  otherwise if item not found return -1
    static int linearSearch(int[] nums, int target) {
        if(nums.length == 0)
            return -1;

        // run a for loop
        for(int index = 0; index < nums.length; index++) {
            // check for element at every index if it is = target
            int element = nums[index];
            if(element == target)
                return index;
        }
        // this line will execute if onne of the return statemenets above have executed
        // hence the target not found
        return -1;
    }
} 