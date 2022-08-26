package P13_recursion_2;

public class P02_groupSum6 {
    public boolean groupSum6(int start, int[] nums, int target) {
        if (start >= nums.length) return (target == 0);
        if (nums[start] == 6) return groupSum6(start + 1, nums, target - 6);
        if (groupSum6(start + 1, nums, target - nums[start])) return true;
        return groupSum6(start + 1, nums, target);
    }
}
