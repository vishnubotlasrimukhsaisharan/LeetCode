class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> l = new ArrayList<>();
        for(int i=1;i<=n;i++){
            List<Integer> l1 = check(i,l);
            l.add(l1); 
        }
        return l;
    }
    public static List<Integer> check(int i,List<List<Integer>> l){
        ArrayList<Integer> l1 = new ArrayList<>();
        if(i==1){
            l1.add(1);
            return l1;
        }else if(i==2){
            l1.add(1);
            l1.add(1);
            return l1;
        }else{
            l1.add(1);
            int s = l.get(i-2).size();
            List<Integer> l2 = l.get(i-2);
            for(int i1=0;i1<s-1;i1++){
                l1.add(l2.get(i1)+l2.get(i1+1));
            }
            l1.add(1);
            return l1;
        }
    }
}