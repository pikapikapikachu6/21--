class Solution {
  public int climbStairs(int n) {
      int first = 0;
      int second = 0;
      int current = 1;
      for (int i = 1; i <= n; i ++) {
          first = second;
          second = current;
          current = first + second;
      }
      return current;
  }
}