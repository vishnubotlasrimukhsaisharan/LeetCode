class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
         int ans1 = ans(nums,k);
            int ans2 = ans(nums,k-1);
            return ans1-ans2;
    }
     int ans(int[] nums,int goal){
             int c=0;
        int sum=0;
        int ws=0,we=0;
        for(we=0;we<nums.length;we++){
            if(nums[we]%2!=0) sum++;
            if(sum<=goal){
                c+=we-ws+1;
            }else {
                while(ws<=we){
                    if(nums[ws]%2!=0) sum--;
                    ws++;
                    if(sum<=goal) break;
                }
                c+=we-ws+1;
            }
        }
            return c;
    }
}