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

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode phelaa = dummy;
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
        return dummy.next;
    }
}