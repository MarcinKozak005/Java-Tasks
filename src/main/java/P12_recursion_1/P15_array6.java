package P12_recursion_1;

public class P15_array6 {
    public boolean array6(int[] nums, int index) {
        if (index >= nums.length) return false;
        return nums[index] == 6 || array6(nums, index + 1);
    }

}
