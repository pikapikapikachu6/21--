class Solution {
  public boolean validTicTacToe(String[] board) {
      int first = 0;
      int second = 0;
      for (int i = 0; i < board.length; i ++) {
          String current = board[i];
          for (char ch: current.toCharArray()) {
              if (ch == 'X') {
                  first = first + 1;
              }
              if (ch == 'O') {
                  second = second + 1;
              }
          }
      }
      if (first < second) {
          return false;
      }
      if (first - second > 1) {
          return false;
      }
      if (first - second == 1) {
          if (win(board, 'X') == false && win(board, 'O') == true) {
              return false;
          }
          if (win(board, 'X') == true && win(board, 'O') == true) {
              return false;
          }
      }
      if (first == second) {
          if (win(board,'X') == true) {
              return false;
          }
      }
      return true;
  }
  public boolean win(String[] board, char winner) {
      for (int i = 0; i < 3; i ++) {
          if (winner == board[0].charAt(i) && winner == board[1].charAt(i) && winner == board[2].charAt(i)) {
              return true;
          }
          if (winner == board[i].charAt(0) && winner == board[i].charAt(1) && winner == board[i].charAt(2)) {
              return true;
          }
      }
      if (winner == board[0].charAt(0) && winner == board[1].charAt(1) && winner == board[2].charAt(2)) {
          return true;
      }
      if (winner == board[0].charAt(2) && winner == board[1].charAt(1) && winner == board[2].charAt(0)) {
          return true;
      }
      return false;
  }
}