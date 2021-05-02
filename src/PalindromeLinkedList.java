/*public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
*/
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode head0 = head;
        ListNode head1 = null;
        while(head != null){
            ListNode n = new ListNode(head.val);
            n.next = head1;
            head1 = n;
            head = head.next;
        }
     
        while(head0 != null && head1 !=null)
        {
            if(head0.val != head1.val){
                return false;
            }
            head0 = head0.next;
            head1 = head1.next;
        }
        if(head0 == null && head1 == null) return true;
        return false;
        
    }
}