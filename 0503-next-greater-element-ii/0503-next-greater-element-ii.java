class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] lans = new int[nums.length];
        int[] rans = new int[nums.length];
        Arrays.fill(lans,-1);
        Arrays.fill(rans,-1);
        Stack<Integer> l = new Stack<>();
        Stack<Integer> r = new Stack<>();
        for(int i=0;i<nums.length;i++){
            while(!r.isEmpty()&&nums[i]>nums[r.peek()]){
                rans[r.pop()]  = i; 
            }
            r.push(i);
        }
         for(int i=0;i<nums.length;i++){
            if(rans[i]==-1){
           for(int j=0;j<i;j++){
            if(nums[j]>nums[i]){
                lans[i] = j;
                break;
            }
           }
            }
        }
        int[] ans = new int[nums.length];
        Arrays.fill(ans,-1);
        for(int i=0;i<nums.length;i++){
            if(rans[i]!=-1){
                ans[i] = nums[rans[i]];
            }else if(lans[i]!=-1){
                ans[i] = nums[lans[i]];
            }
        }
        return ans;
    }
}