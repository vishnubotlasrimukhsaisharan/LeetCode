class Solution {
    public int longestOnes(int[] nums, int k) {
        int zc=0,oc=0;
        int max=0;
        int ws=0,we=0;
        for(we=0;we<nums.length;we++){
            if(nums[we]==1) oc++;
            else zc++;
            if(zc<=k){
                max = Math.max(max,we-ws+1);
            }else{
                while(ws<=we){
                    if(nums[ws]==0) zc--;
                    else oc--;
                    ws++;
                    if(zc<=k) break;

                }
                max = Math.max(max,we-ws+1);
            }
        }
        return max;
    }
}