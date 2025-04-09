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
    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null) return head;

        ListNode node = head;
        ListNode before = new ListNode(0);
        ListNode btemp = before;
        ListNode after = new ListNode(0);
        ListNode atemp = after;

        while (node != null) {
            if (node.val < x) {
                btemp.next = new ListNode(node.val);
                btemp = btemp.next;
            } else {
                atemp.next = new ListNode(node.val);
                atemp = atemp.next;
            }
            node = node.next;
        }
        atemp.next = null;
        btemp.next = after.next;
        return before.next;
    }
}