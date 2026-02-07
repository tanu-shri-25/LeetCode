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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode();
        dummy.next=head;
        ListNode n = dummy;
        while(n.next!=null){
            if(n.next.val==val){
            n.next=n.next.next;
            }else{
            n=n.next;
        }
    }
        return dummy.next;
    }
}