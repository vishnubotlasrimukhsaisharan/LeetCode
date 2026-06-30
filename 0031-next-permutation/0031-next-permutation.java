class Solution {
    public void nextPermutation(int[] nums) {
        int index = breakPoint(nums);
        if(index == -1){
        Arrays.sort(nums);
        return;
}
       
        int big = justBig(nums);
        int t = nums[big];
        nums[big] = nums[index];
        nums[index] = t;
        Arrays.sort(nums,index+1,nums.length);

    }
    public static int breakPoint(int[] nums){
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                return i;
            }
            
        }
        return -1;
    }
    public static int justBig(int nums[]){
        int breakp=breakPoint(nums);
        int justBigele = Integer.MAX_VALUE;
        int in=0;
        for(int i=breakp+1;i<nums.length;i++){
            if(nums[i]>nums[breakp]&&nums[i]<justBigele){
                justBigele=nums[i];
                in = i;
            }
        }
        return in;
    }
}