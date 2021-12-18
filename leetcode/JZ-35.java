/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/
class Solution {
  Map<Node, Node> record = new HashMap<Node, Node>();
  public Node copyRandomList(Node head) {
      if (head == null) {
          return head;
      }
      if (!record.containsKey(head)) {
          Node newN = new Node(head.val);
          record.put(head, newN);
          newN.next = copyRandomList(head.next);
          newN.random = copyRandomList(head.random);
      }
      return record.get(head);
  }
}