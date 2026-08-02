class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0,j=0;
        int max=0;
        HashMap<Character,Integer> m = new HashMap<>();
        while(j<s.length()&&i<s.length()){
           
            if(!m.containsKey(s.charAt(j))){
                 max = Math.max(max,j-i+1);
                m.put(s.charAt(j),j);
                j++;
            }else{
                if(m.get(s.charAt(j))<i){
                     max = Math.max(max, j - i + 1);
                    m.put(s.charAt(j),j);
                    j++;
                }else{
                    i=m.get(s.charAt(j))+1;
                     m.put(s.charAt(j),j);
                     j++;
                }
            }                         
        }
        return max;
    }
}