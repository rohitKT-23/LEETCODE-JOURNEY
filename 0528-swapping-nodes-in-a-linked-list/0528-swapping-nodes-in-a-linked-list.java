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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode ND = head;
            ListNode fst = null;
            ListNode scnd = null;
            int len = 0;
            while (ND != null) {
                len++;
                if (scnd != null) {
                    scnd = scnd.next;
                }
                if (len == k) {
                    fst = ND;
                    scnd = head;
                }
                ND = ND.next;
            }
            int tmp = fst.val;
            fst.val = scnd.val;
            scnd.val = tmp;
            return head;
    }
}