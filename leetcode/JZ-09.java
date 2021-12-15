class CQueue {

  Deque<Integer> queue1;
  Deque<Integer> queue2;

  public CQueue() {
      queue1 = new LinkedList<Integer>();
      queue2 = new LinkedList<Integer>();
  }
  
  public void appendTail(int value) {
      queue1.push(value);
  }
  
  public int deleteHead() {
      if (queue2.isEmpty()) {
          while (!queue1.isEmpty()) {
              queue2.push(queue1.pop());
          }
      } 
      if (queue2.isEmpty()) {
          return -1;
      } else {
          int result = queue2.pop();
          return result;
      }
  }
}

/**
* Your CQueue object will be instantiated and called as such:
* CQueue obj = new CQueue();
* obj.appendTail(value);
* int param_2 = obj.deleteHead();
*/