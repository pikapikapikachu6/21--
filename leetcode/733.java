class Solution {
  int[] dx = {1, 0, 0, -1};
  int[] dy = {0, 1, -1, 0};
  public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
      int current = image[sr][sc];
      if (current != newColor) {
          dfs(image, sr, sc, current, newColor);
      }
      return image;
  }

  public void dfs(int[][] image, int x, int y, int color, int newColor) {
      if (image[x][y] == color) {
          image[x][y] = newColor;
          for (int i = 0; i < 4; i ++) {
              int currx = x + dx[i];
              int curry = y + dy[i];
              if ((currx >= 0 && currx < image.length) && (curry >= 0 && curry < image[0].length)) {
                  dfs(image, currx, curry, color, newColor);
              }
          }
      }
  }
}