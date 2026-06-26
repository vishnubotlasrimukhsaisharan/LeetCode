class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0,maxSum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum<=0&&nums.length!=1) {
                
                 maxSum=Math.max(sum,maxSum);
                 sum=0;
            }
            else{
                maxSum=Math.max(sum,maxSum);
            }
        }
        // if(maxSum=Integer.MIN_VALUE) ma
        return maxSum;
    }
}