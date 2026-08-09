class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        HashSet<List<Integer>> h1 = new HashSet<>();
        Arrays.sort(nums);
        int i=0,j=1;
        while(i<nums.length-2){
            if(hs.contains(-1*(nums[i]+nums[j]))){
                List<Integer> l = new ArrayList<>();
                l.add(nums[i]);
                l.add(nums[j]);
                l.add(-1*(nums[i]+nums[j]));
                Collections.sort(l);
                h1.add(l);
                 hs.add(nums[j]);
               
            }
                hs.add(nums[j]);
                j++;
                if(j>nums.length-1){
                    hs.clear();
                    i++;
                    j=i+1;
                }
            
        }
        List<List<Integer>> l1 = new ArrayList<>();
        for(List<Integer>ll:h1){
            l1.add(ll);
        }
        return l1;
    }
}