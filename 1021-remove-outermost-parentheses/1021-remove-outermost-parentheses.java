class Solution {
    public String removeOuterParentheses(String s) {
        List<List<Integer>> l = new ArrayList<>();
        String s1 = "";
        int c=0;
        int i=0,j=0;
        while(i<s.length()&&j<s.length()){
            if(s.charAt(j)=='(') {
                c++;
                j++;
            }
            else if(s.charAt(j)==')') {
                c--;
                j++;
            }
            if(c==0){
                List<Integer> l1 = new ArrayList<>();
                l1.add(i);
                l1.add(j);
                l.add(l1);
                i=j;
                
            }
        }

        for(int i11=0;i11<l.size();i11++){
            for(int i1=l.get(i11).get(0)+1;i1<l.get(i11).get(1)-1;i1++){
                s1+=s.charAt(i1);
            }
        }
        return s1;
    }
}