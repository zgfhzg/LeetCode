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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;

        ListNode node = new ListNode(0);
        node.next = head;
        ListNode prev = node;
        ListNode cur = node;
        
        int len = 0;
        while (prev.next != null) {
            len++;
            prev = prev.next;
        }

        k = k % len;
        int i = len - k;
        while (i > 0) {
            cur = cur.next;
            i--;
        }

        prev.next = node.next;
        node.next = cur.next;
        cur.next = null;
        return node.next;
    }
}