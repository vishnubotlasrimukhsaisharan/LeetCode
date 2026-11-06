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
    public ListNode oddEvenList(ListNode head) {
        if(head==null) return head;
        ListNode dummy = new ListNode(-888);
        ListNode dummy2 = new ListNode(-888);
        ListNode tail1 = dummy;
        ListNode tail2 = dummy2;
        ListNode temp1 = head;
        
        int c=0;
        while(temp1!=null){
            if(c%2==0){
            tail1.next = new ListNode(temp1.val);
            tail1 = tail1.next;
            }
            else{
            tail2.next = new ListNode(temp1.val);
            tail2 = tail2.next;
            }
            temp1 = temp1.next;
            c++;
            
        }
        tail1.next = dummy2.next;
        return dummy.next;


        
    }
}