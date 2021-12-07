class Solution {
  public int[][] colorBorder(int[][] grid, int row, int col, int color) {
      int len = grid.length;
      int nlen = grid[0].length;
      boolean[][] visit = new boolean[len][nlen];
      List<int[]> edge = new ArrayList<>();
      int origin = grid[row][col];
      int[][] dir = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
      Deque<int[]> q = new ArrayDeque<>();
      q.offer(new int[]{row, col});
      visit[row][col] = true;
      while (!q.isEmpty()) {
          int[] node = q.poll();
          int x = node[0], y = node[1];

          boolean isBorder = false;
          for (int i = 0; i < 4; i++) {
              int nx = dir[i][0] + x, ny = dir[i][1] + y;
              if (!(nx >= 0 && nx < len && ny >= 0 && ny < nlen && grid[nx][ny] == origin)) {
                  isBorder = true;
              } else if (!visit[nx][ny]) {
                  visit[nx][ny] = true;
                  q.offer(new int[]{nx, ny});
              }         
          }
          if (isBorder) {
              edge.add(new int[]{x, y});
          }
      }
      for (int i = 0; i < edge.size(); i++) {
          int x = edge.get(i)[0], y = edge.get(i)[1];
          grid[x][y] = color;
      }
      return grid;
  }
}