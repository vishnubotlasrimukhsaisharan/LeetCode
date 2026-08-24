class Solution {
    public int largestRectangleArea(int[] h) {
        int[] r = rsm(h);
        int[] l = lsm(h);
        int max = Integer.MIN_VALUE;
        for(int i=0;i<h.length;i++){
             max = Math.max(max,((r[i]-1)-(l[i]+1)+1)*h[i]);
        }
        return max;
    }
    public static int[] rsm(int[] a){
        int[] ans = new int[a.length];
        Arrays.fill(ans,a.length);
        Stack<Integer> wa = new Stack<>();
        for(int i=0;i<a.length;i++){
                while(!wa.isEmpty()&&a[i]<a[wa.peek()]){
                    ans[wa.pop()] = i; 
                
            }
            wa.push(i);
        }
        return ans;
    }
    public static int[] lsm(int[] a){
        int[] ans = new int[a.length];
        Arrays.fill(ans,-1);
        Stack<Integer> wa = new Stack<>();
        for(int i=a.length-1;i>=0;i--){
                while(!wa.isEmpty()&&a[i]<a[wa.peek()]){
                    ans[wa.pop()] = i; 
                
            }
            wa.push(i);
        }
        return ans;
    }
}