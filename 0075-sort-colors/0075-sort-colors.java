class Solution {
    public void sortColors(int[] nums) {
       int zeroCount=0,oneCount=0,twoCount=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]==0) zeroCount++;
        else if(nums[i]==1) oneCount++;
        else twoCount++;
       }
      int i=0;
      while(i<zeroCount){
        nums[i] = 0;
        i++;
      }
      while(i-zeroCount<oneCount){
        nums[i] = 1;
        i++;
      }
      while(i-(zeroCount+oneCount)<twoCount){
        nums[i] = 2;
        i++;
      }
      
    }
}