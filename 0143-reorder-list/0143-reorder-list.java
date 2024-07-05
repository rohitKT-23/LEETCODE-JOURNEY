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
    public void reorderList(ListNode head) {

        if (head == null || head.next == null) {
            return;
        }

        ListNode slw = head;
        ListNode fst = head;
        ListNode pre = null;

        while (fst != null && fst.next != null) {
            pre = slw;
            slw = slw.next;
            fst = fst.next.next;
        }

        pre.next = null;
        ListNode lst_1 = head;
        ListNode lst_2 = reverse(slw);
        merge(lst_1, lst_2);
    }

    public static ListNode reverse(ListNode head) {

        ListNode pre = null;
        ListNode curr = head;
        ListNode next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }

        return pre;
    }

    public static void merge(ListNode lst_1, ListNode lst_2) {

        while (lst_1 != null) {

            ListNode n1 = lst_1.next;
            ListNode n2 = lst_2.next;
            lst_1.next = lst_2;

            if (n1 == null) {
                break;
            }
    
            lst_2.next = n1;
            lst_1 = n1;
            lst_2 = n2;
        }
    }
}