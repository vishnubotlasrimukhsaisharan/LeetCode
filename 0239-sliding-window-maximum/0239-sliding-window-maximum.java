class Solution {
    public int[] maxSlidingWindow(int[] a, int k) {
        int[] ans = new int[a.length-k+1];
        Deque<Integer> dq = new ArrayDeque<>();
        int k1=0;
        dq.addLast(0);
        for(int i=1;i<k;i++){
            if(a[i]<a[dq.peekLast()]){
                dq.addLast(i);
            }else{
                while(!dq.isEmpty()&&a[i]>=a[dq.peekLast()]){
                    dq.removeLast();
                }
                dq.addLast(i);
            }
        }
        ans[k1++] = a[dq.peekFirst()];
        for(int i=1;i<a.length-k+1;i++){
            if(a[i+k-1]<a[dq.peekLast()]){
                dq.addLast(i+k-1);
            }else{
                while(!dq.isEmpty()&&a[i+k-1]>=a[dq.peekLast()]){
                    dq.removeLast();
                }
                dq.addLast(i+k-1);
            }
            if(dq.peekFirst()<i){
                dq.removeFirst();
            }
            ans[k1++] = a[dq.peekFirst()];
        }
        return ans;

    }
}