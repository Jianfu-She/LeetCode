/**
 * Problem: Given a linked list, swap every two adjacent nodes and return its head.
 *          Your algorithm should use only constant extra space.
 *          You may not modify the values in the list's nodes, only nodes itself may be changed.
 * 
 * Example: Given 1->2->3->4, you should return the list as 2->1->4->3.
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
    public ListNode swapPairs(ListNode head) {
        
        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode p1 = dummy;
        ListNode p2 = head.next;

        while (p2 != null) {
            p1.next.next = p2.next;
            p2.next = p1.next;
            p1.next = p2;

            p1 = p2.next;
            if (p1.next == null) {
                break;
            }
            p2 = p1.next.next;
        }

        return dummy.next;
    }
}