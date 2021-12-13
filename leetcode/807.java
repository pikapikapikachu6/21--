class Solution {
  public int maxIncreaseKeepingSkyline(int[][] grid) {
      int len = grid.length;
      int[] row = new int[len];
      int[] column = new int[len];
      for (int i = 0; i < len; i ++) {
          for (int j = 0; j < len; j ++) {
              row[i] = Math.max(row[i], grid[i][j]);
              column[j] = Math.max(column[j], grid[i][j]);
          }
      }
      int result = 0;
      for (int i = 0; i < len; i ++) {
          for (int j = 0; j < len; j ++) {
              result = result + Math.min(row[i], column[j]) - grid[i][j];
          }
      }
      return result;
  }
}