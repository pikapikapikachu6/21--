class MinStack {

  private Stack<Integer> dataStack; 
  private Stack<Integer> minStack; 
  /** initialize your data structure here. */
  public MinStack() {
      dataStack = new Stack<>();
      minStack = new Stack<>();
  }
  public void push(int x) {
      if(minStack.isEmpty() || minStack.peek() > x){
          minStack.push(x);
      }else{
          minStack.push(minStack.peek());
      }
      dataStack.push(x);
  }

  public void pop() {
      minStack.pop();
      dataStack.pop();
  }

  public int top() {
      return dataStack.peek();
  }

  public int min() {
      return minStack.peek();
  }


}

/**
* Your MinStack object will be instantiated and called as such:
* MinStack obj = new MinStack();
* obj.push(x);
* obj.pop();
* int param_3 = obj.top();
* int param_4 = obj.min();
*/