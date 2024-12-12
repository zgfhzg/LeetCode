class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList();

        if (nums.length < 3) {
            return result;
        }

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                break;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int tsum = nums[i] + nums[left] + nums[right];
                if (tsum > 0) {
                    right--;
                } else if (tsum < 0) {
                    left++;
                } else {
                    List<Integer> tmp = new ArrayList();
                    tmp.add(nums[i]);
                    tmp.add(nums[left]);
                    tmp.add(nums[right]);
                    result.add(tmp);
                    left++;
                    while (nums[left] == nums[left - 1] && left < right) {
                        left++;
                    }
                }
            }
        }
        return result;
    }
}