class Solution {
    public int maxArea(int[] height) {
        int result = 0;
        int left = 0;
        int right = height.length - 1;
        while(left < right) {
            result = Math.max(result, (right - left) * Math.min(height[left], height[right]));
            if (height[left] > height[right]) {
                right--;
            } else {
                left++;
            }
        }
        return result;
    }
}