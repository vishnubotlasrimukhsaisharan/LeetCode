class Solution {
    public int countStudents(int[] students, int[] sand) {
        Map<Integer,Integer> m = new HashMap<>();
        for(int x:students){
            m.put(x,m.getOrDefault(x,0)+1);
        }
        Stack<Integer> st = new Stack<>();
        for(int i=sand.length-1;i>=0;i--){
            st.push(sand[i]);
        }
        while(!st.isEmpty()&&m.size()>0){
            if(m.containsKey(st.peek())&&m.get(st.peek())>0){
                m.put(st.peek(),m.get(st.peek())-1);
                st.pop();
            }else{
               break;
            }
        }
        int c=0;
        for(int ans:m.keySet()){
            if(m.get(ans)>0) c+=m.get(ans);
        }
        return c;
    }
}