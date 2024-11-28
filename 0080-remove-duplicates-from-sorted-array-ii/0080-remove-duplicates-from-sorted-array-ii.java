class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if (index < 2 || n > nums[index - 2]) {
                nums[index++] = n;
            }
        }
        return index;
    }
}