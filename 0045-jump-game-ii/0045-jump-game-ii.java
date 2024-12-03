class Solution {
    public int jump(int[] nums) {
        int step = 0;
        int current = 0;
        int maxIdx = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            maxIdx = Math.max(maxIdx, i + nums[i]);

            if (i == current) {
                step++;
                current = maxIdx;
            }
        }
        return step;
    }
}