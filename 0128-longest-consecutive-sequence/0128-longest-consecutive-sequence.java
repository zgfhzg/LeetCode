class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        
        Arrays.sort(nums);
        int result = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] == 1) {
                result++;
            } else if (nums[i] - nums[i - 1] == 0) {
                continue;
            } else {
                return result;
            }
        }
        return result;
    }
}