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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null) {
            return null;
        }
        if (left == right) {
            return head;
        }
        ListNode curr = head;
        ListNode prev = new ListNode();
        prev.next = head;
        for (int i = 0; i < left - 1; i++) {
            prev = curr;
            curr = curr.next;
        }
        for (int i = 0; i < right - left; i++) {
            ListNode next = curr.next;
            curr.next = next.next;
            next.next = prev.next;
            prev.next = next;
        }
        if (left == 1) {
            return prev.next;
        } else {
            return head;
        }
    }
}