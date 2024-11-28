class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        int count = 1;
        int max = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                if (count > max) {
                    result = nums[i];
                    max = count;
                    count = 1;
                }
            } else {
                count++;
            }
        }
        if (count > max) {
            result = nums[nums.length - 1];
        }
        return result;
    }
}