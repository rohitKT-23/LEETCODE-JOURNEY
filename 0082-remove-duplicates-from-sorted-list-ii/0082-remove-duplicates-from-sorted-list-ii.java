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
    public ListNode deleteDuplicates(ListNode head) {

        if(head == null || head.next == null) {
            return head;
        }

        ListNode tmp = new ListNode(0);
        tmp.next = head;
        ListNode phelaa = tmp;
        ListNode abhii = head;

        while(abhii != null){
            while(abhii.next != null && abhii.val == abhii.next.val){
                abhii = abhii.next;
            }

            if(phelaa.next == abhii){
                phelaa = phelaa.next;

            }else{
                phelaa.next = abhii.next;
            }

            abhii = abhii.next;
        }
        return tmp.next;
    }
}