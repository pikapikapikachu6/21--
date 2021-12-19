class Solution {
  public int findJudge(int n, int[][] trust) {
      int[] check = new int[n];
      int[] human = new int[n];
      int len = trust.length;
      for (int i = 0; i < len; i ++) {
          human[trust[i][0] - 1] = 1;
          check[trust[i][1] - 1] ++;
      }
      for (int i = 0; i < n; i ++) {
          if (check[i] == n - 1 && human[i] != 1){
              return i + 1;
          }
      }
      return -1;
  }
}