/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode node1 = headA;
        ListNode node2 = headB;
        int lenA = len(headA), lenB = len(headB);
        if (lenA > lenB) {

            for (int i = 0; i < lenA - lenB; i++)
                node1 = node1.next;
        }
        if (lenB > lenA) {

            for (int i = 0; i < lenB - lenA; i++)
                node2 = node2.next;
        }
        while (node1 != node2) {
            node1 = node1.next;
            node2 = node2.next;
        }
        return node1;
    }

    public static int len(ListNode head) {
        int len = 0;
        while (head != null) {
            head = head.next;
            len++;
        }
        return len;
    }
}
