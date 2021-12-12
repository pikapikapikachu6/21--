class Solution {
  static int[][] dirctions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
  public int[][] updateMatrix(int[][] mat) {
      int len = mat.length;
      int nlen = mat[0].length;
      int[][] result = new int[len][nlen];
      boolean[][] check = new boolean[len][nlen];
      Queue<int[]> queue = new LinkedList<int[]>();
      for (int i = 0; i < len; i ++) {
          for (int j = 0; j < nlen; j ++) {
              if (mat[i][j] == 0) {
                  queue.offer(new int[]{i, j});
                  check[i][j] = true;
              }
          }
      }
      while (!queue.isEmpty()) {
          int[] current = queue.poll();
          int i = current[0];
          int j = current[1];
          for (int d = 0; d < 4; ++d) {
              int current_i = i + dirctions[d][0];
              int current_j = j + dirctions[d][1];
              if (current_i >= 0 && current_i < len && current_j >= 0 && current_j < nlen && !check[current_i][current_j]) {
                  result[current_i][current_j] = result[i][j] + 1;
                  queue.offer(new int[]{current_i, current_j});
                  check[current_i][current_j] = true;
              }
          }
      }
      return result;
  }
}