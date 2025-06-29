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
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode prev = head;
        ListNode next = head.next;
        prev.next = null;
        while(next != null){
            ListNode tmp = next.next;
            next.next= prev;
            prev = next;
            next = tmp;
        }
        return prev;
    }
}