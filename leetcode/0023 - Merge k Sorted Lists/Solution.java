import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Problem: Merge k sorted linked lists and return it as one sorted list. 
 *          Analyze and describe its complexity.
 * 
 * Example: Input:
 *          [
 *            1->4->5,
 *            1->3->4,
 *            2->6
 *          ]
 *         Output: 1->1->2->3->4->4->5->6
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
    public ListNode mergeKLists(ListNode[] lists) {

        Queue<ListNode> queue = new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode l1, ListNode l2) {
                return l1.val - l2.val;
            }
        });

        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;

        for (ListNode node : lists) {
            if (node != null) {
                queue.add(node);
            }
        }

        while (!queue.isEmpty()) {
            cur.next = queue.poll();
            cur = cur.next;
            if (cur.next != null) {
                queue.add(cur.next);
            }
        }

        return dummy.next;
    }
 }