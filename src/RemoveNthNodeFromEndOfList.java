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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode current = head;
        ListNode prev  =head;
        int i = 0;
        while(current.next !=null){
            if(i>=n){
                prev = prev.next;
            }
        current = current.next;
            i++;
        }
        if(i<n){
            return prev.next == current? current:prev.next;
        }
        ListNode next = prev.next.next;
        if(next!=null){
        prev.next.val = next.val;
        prev.next.next = next.next;
               }else{
            prev.next = null;
        }
       
        return head;
    }
}