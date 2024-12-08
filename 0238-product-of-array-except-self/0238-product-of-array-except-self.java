class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] before = new int[nums.length];
        int tmp = 1;

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                before[i] = 1;
                continue;
            }
            tmp *= nums[i - 1];
            before[i] = tmp;
        }
        tmp = 1;
        for (int j = nums.length - 1; j >= 0; j--) {
            if (j == nums.length - 1) {
                before[nums.length - 1] *= tmp;
                continue;
            }
            tmp *= nums[j + 1];
            before[j] *= tmp;
        }
        return before;
    }
}