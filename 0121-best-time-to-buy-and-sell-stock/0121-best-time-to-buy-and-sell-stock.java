class Solution {
    public int maxProfit(int[] prices) {
        int max1 = 0, min1 = prices[0];
        for (int i = 1; i < prices.length; i++) {
            min1 = Math.min(min1, prices[i]);
            max1 = Math.max(max1, prices[i] - min1);
        }
        return max1;
    }
}