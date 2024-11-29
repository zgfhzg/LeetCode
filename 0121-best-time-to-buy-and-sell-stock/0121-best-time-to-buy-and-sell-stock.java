class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int buy = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] - buy > 0) {
                max = Math.max(max, prices[i] - buy);
            } else {
                buy = prices[i];
            }
        }
        return max;
    }
}