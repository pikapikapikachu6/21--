/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
  public int[] reversePrint(ListNode head) {
      ListNode current = head;
      int len = 0;
      while (current != null) {
          current = current.next;
          len = len + 1;
      }
      int[] result = new int[len];
      for (int i = len - 1; i >= 0; i --) {
          result[i] = head.val;
          head = head.next;
      }
      return result;
  }
}