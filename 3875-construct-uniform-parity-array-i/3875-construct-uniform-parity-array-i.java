class Solution {
    public boolean uniformArray(int[] nums1) {
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=i+1;j<nums1.length;j++){
                l.add(Math.abs(nums1[i]-nums1[j]));
            }
        }
        int oc=0,ec=0;
        for(int i=0;i<l.size();i++){
            if(l.get(i)%2==0) ec++;
            else oc++;

        }
        
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]%2==0) ec++;
            else oc++;
        }
        if(ec>=nums1.length||oc>=nums1.length) return true;
        return false;
    }
}