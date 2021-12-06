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
  public ListNode removeNthFromEnd(ListNode head, int n) {
      ListNode re = new ListNode(0, head);
      ListNode pre = head;
      ListNode current = re;
      for (int i = 0; i < n; ++i) {
          pre = pre.next;
      }
      while (pre != null) {
          pre = pre.next;
          current = current.next;
      }
      current.next = current.next.next;
      ListNode result = re.next;
      return result;
  }
}