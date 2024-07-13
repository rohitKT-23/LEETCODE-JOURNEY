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
    public int pairSum(ListNode head) {
        // Step 1: Calculate the length of the linked list
        int length = 0;
        ListNode current = head;
        while (current != null) {
            length++;
            current = current.next;
        }
        
        // Step 2: Store values in an array
        int[] values = new int[length];
        current = head;
        for (int i = 0; i < length; i++) {
            values[i] = current.val;
            current = current.next;
        }
        
        // Step 3: Calculate maximum twin sum
        int maxTwinSum = 0;
        for (int i = 0; i < length / 2; i++) {
            int twinSum = values[i] + values[length - 1 - i];
            if (twinSum > maxTwinSum) {
                maxTwinSum = twinSum;
            }
        }
        
        return maxTwinSum;
    }
}