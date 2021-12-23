class Solution {
  public boolean findNumberIn2DArray(int[][] matrix, int target) {
      if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
        int row = matrix.length;
      int column = matrix[0].length;
      int i = 0;
      int j = column - 1;
      while (i < row && j >= 0) {
          if (matrix[i][j] == target) return true;
              else if (matrix[i][j] > target) j--;
                  else i ++;
      }
      return false;
  }
}