class Solution {
    public boolean canJump(int[] nums) {
        int current = nums[0];

        if (nums.length == 1) {
            return true;
        } else if (nums.length > 1 && current == 0) {
            return false;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > current) {
                current = nums[i];
            }
            current--;
            if (current < 0) {
                return false;
            }
        }
        return current >= 0 ? true : false;
    }
}