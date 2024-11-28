class Solution {
    public void rotate(int[] nums, int k) {
        int[] tmp = new int[k];
        for (int i = 0; i < k; i++) {
            if (nums.length == 1) {
                tmp[i] = nums[0];
                break;
            } else {
                int n = Math.abs(nums.length - (k - i)) % nums.length;
                tmp[i] = nums[n];
            }
        }

        for (int i = nums.length - 1; i >= k; i--) {
            nums[i] = nums[i - k];
        }

        for (int i = 0; i < k; i++) {
            if (nums.length == 1) {
                nums[0] = tmp[0];
                break;
            } else {
                nums[i % nums.length] = tmp[i];
            }
        }
    }
}