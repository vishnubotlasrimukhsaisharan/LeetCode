class Solution {
    public int maxProfit(int[] prices) {
        int[] min = new int[prices.length];
        min[0] = prices[0];
        for(int i=1;i<min.length;i++){
            min[i] = Math.min(min[i-1],prices[i]);
        }
        int max1=0;
        for(int i=0;i<min.length;i++){
            if(prices[i]-min[i]>max1){
                max1=prices[i]-min[i];
            }
        }
        return max1;
    }
}