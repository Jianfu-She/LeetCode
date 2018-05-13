/**
 * Problem: Given a linked list, remove the n-th node from the end of list and return its head.
 *
 * Example: Given linked list: 1->2->3->4->5, and n = 2.
 *          After removing the second node from the end, the linked list becomes 1->2->3->5.
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode begin = dummy;
        ListNode end = dummy;
        for (int i = 0; i <= n; i++) {
            end = end.next;
        }

        while (end != null) {
            end = end.next;
            begin = begin.next;
        }

        begin.next = begin.next.next;

        return dummy.next;
    }
}