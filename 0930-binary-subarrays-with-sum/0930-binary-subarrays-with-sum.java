class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
           int ans1 = ans(nums,goal);
            int ans2 = ans(nums,goal-1);
            return ans1-ans2;
    }
    int ans(int[] nums,int goal){
             int c=0;
        int sum=0;
        int ws=0,we=0;
        for(we=0;we<nums.length;we++){
            sum += nums[we];
            if(sum<=goal){
                c+=we-ws+1;
            }else {
                while(ws<=we){
                    sum-=nums[ws];
                    ws++;
                    if(sum<=goal) break;
                }
                c+=we-ws+1;
            }
        }
            return c;
    }
}