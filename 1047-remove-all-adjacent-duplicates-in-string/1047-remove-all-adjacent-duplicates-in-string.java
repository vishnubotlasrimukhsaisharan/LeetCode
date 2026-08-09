class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(st.isEmpty()) st.push(c);
            else{
                if(st.peek()==c){
                while(!st.isEmpty()&&st.peek()==c){
                    st.pop();
                }
                }else{
                    st.push(c);
                }
            }
        }
        StringBuilder s1=  new StringBuilder();
        while(!st.isEmpty()){
            s1.append(st.pop());
        }
        return s1.reverse().toString();
    }
}