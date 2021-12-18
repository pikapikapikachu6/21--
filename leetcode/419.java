class Solution {
  public int countBattleships(char[][] board) {
      int row = board.length;
      int column = board[0].length;
      int result = 0;
      for (int i = 0; i < row; i ++) {
          for (int j = 0; j < column; j ++) {
              if (board[i][j] == 'X') {
                  board[i][j] = '.';
                  for (int k = i + 1; k < row && board[k][j] == 'X'; k ++) {
                      board[k][j] = '.';
                  }
                  for (int k = j + 1; k < column && board[i][k] == 'X'; k ++) {
                      board[i][k] = '.';
                  }
                  result = result + 1;
              }
          }
      }
      return result;
  }
}