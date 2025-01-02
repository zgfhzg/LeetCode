class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList();
        int start = 0;
        int end  = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1) {
                list.add(convertRange(nums[start], nums[end]));
                break;
            }

            if (nums[i] + 1 < nums[i + 1]) {
                list.add(convertRange(nums[start], nums[end]));
                start = i + 1;
                end = i + 1;
            } else {
                end++;
            }
        }
        return list;
    }

    private String convertRange(int start, int end) {
        if (start == end) {
            return Integer.toString(start);
        } else {
            return Integer.toString(start) + "->" + Integer.toString(end);
        }
    }
}