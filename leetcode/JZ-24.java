/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
  public ListNode reverseList(ListNode head) {
      ListNode result = null;
      ListNode next = head;
      ListNode current = head;
      while (current != null) {
          next = current.next;
          current.next = result;
          result = current;
          current = next;
      }
      return result;
  }
}