class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums2.length];
        Arrays.fill(ans,-1);
        Stack<Integer> wa = new Stack<>();
        for(int i=0;i<nums2.length;i++){
            while(!wa.isEmpty()&&nums2[i]>nums2[wa.peek()]){
                ans[wa.pop()] = i;
            }
            wa.push(i);
        }
       
        Map<Integer,Integer> m = new HashMap<>();
        for(int i=0;i<nums2.length;i++){
            if(!m.containsKey(nums2[i])){
                m.put(nums2[i],i);
            }
        }
       
        int acans[] = new int[nums1.length];
        int i1=0;
        for(int x:nums1){
            int in = m.get(x);
            if(ans[in]!=-1)
            acans[i1++] = nums2[ans[in]];
            else
            acans[i1++] = -1;
        }
        return acans;
    }
}