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
  public ListNode middleNode(ListNode head) {
      ListNode current = head;
      int len = 0;
      while (current != null) {
          len = len + 1;
          current = current.next;
      }
      len = len / 2;
      current = head;
      int i = -1;
      while (current != null) {
          i ++;
          if (i == len) {
              return current;
          }
          current = current.next;
      }
      return null;
  }
}