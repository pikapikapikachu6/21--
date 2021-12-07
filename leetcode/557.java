class Solution {
  public String reverseWords(String s) {
      String result = "";
      String current = "";
      for (int j = 0; j < s.length(); j ++) {
          char ch = s.charAt(j);
          if (ch != ' ') {
              current = current + ch;
          } else {
              if (result.length() != 0) {
                  result = result + " ";
              }
              for (int i = 0; i < current.length(); i ++) {
                  result = result + current.charAt(current.length() - i - 1);
              }
              current = "";
          }
      }
      if (result.length() != 0) {
          result = result + " ";
      }
      for (int i = 0; i < current.length(); i ++) {
          result = result + current.charAt(current.length() - i - 1);
      }
      return result;
  }
}