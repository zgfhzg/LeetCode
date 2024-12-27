class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int tmp = map.get(nums[i]);
                int diff = i - tmp;
                min = Math.min(min, diff);
            }
            map.put(nums[i], i);
        }
        return (min <= k);
    }
}