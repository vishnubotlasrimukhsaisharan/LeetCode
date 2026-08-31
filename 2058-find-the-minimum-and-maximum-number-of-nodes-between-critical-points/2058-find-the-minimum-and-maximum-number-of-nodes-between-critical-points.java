/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        List<Integer> maxi = new ArrayList<>();
       
        ListNode prev,curr,nex;
        ListNode temp = head;
        if(temp==null) return new int[]{-1,-1};
        if(temp.next==null) return new int[]{-1,-1};
        temp = temp.next;
        if(temp.next==null) return new int[]{-1,-1};
        temp = head;
        prev = temp;
        curr = temp.next;
        nex = curr.next;
        int c=2;
        while(nex!=null){
            if(curr.val>prev.val&&curr.val>nex.val){
                maxi.add(c);
             
            }else if(curr.val<prev.val&&curr.val<nex.val){
                maxi.add(c);
                 
            }
                c++;
               prev = curr;
                curr = nex;
                nex = nex.next;
        }
          if(maxi.size() < 2)
            return new int[]{-1, -1};

        Collections.sort(maxi);
        int min = Integer.MAX_VALUE;
        for(int i=1; i<maxi.size();i++) {
            min = Math.min(min, maxi.get(i) - maxi.get(i - 1));
        }
        int max = maxi.get(maxi.size() - 1) - maxi.get(0);
        return new int[]{min, max};
    }
}