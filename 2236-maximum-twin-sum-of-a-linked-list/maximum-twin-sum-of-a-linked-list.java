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
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        ListNode nextNode = null;
        int maxTwinSum = 0;
        while (fast != null) {
            fast = fast.next.next;
              nextNode = slow.next;
            slow.next = prev;
            prev = slow;
            slow = nextNode;
        }while (prev != null) {
            int currentSum = prev.val + slow.val;
            if (currentSum > maxTwinSum) {
                maxTwinSum = currentSum;
            }
            prev = prev.next;
            slow = slow.next;
        }

        return maxTwinSum;
    }
}