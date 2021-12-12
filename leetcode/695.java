class Solution {
  public int maxAreaOfIsland(int[][] grid) {
      int max = 0;
      for (int i = 0; i < grid.length; i ++) {
          for (int j = 0; j < grid[0].length; j ++) {
              max = Math.max(max, dfs(grid, i, j));
          }
      }
      return max;
  }

  public int dfs(int[][] grid, int i, int j) {
      if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] != 1) {
          return 0;
      }
      grid[i][j] = 0;
      int[] dir_j = {1, -1, 0, 0};
      int[] dir_i = {0, 0, 1, -1};
      int result = 1;
      for (int k = 0; k < 4; k ++) {
          int current_i = i + dir_i[k];
          int current_j = j + dir_j[k];
          result = result + dfs(grid, current_i, current_j);
      }
      return result;
  }
}