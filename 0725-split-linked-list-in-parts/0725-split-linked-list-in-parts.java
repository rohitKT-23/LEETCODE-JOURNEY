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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] prts = new ListNode[k];
        int len = 0;
        for (ListNode node = head; node != null; node = node.next) {
            len++;
        }
        int n = len / k;
        int r = len % k;
        ListNode node = head;
        ListNode prev = null;
        for (int i = 0; node != null && i < k; i++, r--) {
            prts[i] = node;
            for (int j = 0; j < n + (r > 0 ? 1 : 0); j++) {
                prev = node;
                node = node.next;
            }
            prev.next = null;
        }
        return prts;
    }
}