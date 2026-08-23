class Solution {
    public double findMaxAverage(int[] nums, int k) {
       
        double avg=0;
        for(int  i=0;i<k;i++){
            avg+=(double)nums[i];
        }
         double ma=avg/(double)k;
       
        for(int i=1;i<nums.length-k+1;i++){
            int add = nums[i+k-1];
            int rem = nums[i-1];
            avg+=add;
            avg-=rem;
             ma = Math.max(ma,avg/(double)k);
        }
        return ma;
    }
}