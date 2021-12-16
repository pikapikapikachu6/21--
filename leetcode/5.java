class Solution {
  public int[] search(String s, int left, int right) {
      while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
          --left;
          ++right;
      }
      int[] result = new int[2];
      result[0] = left + 1;
      result[1] = right - 1;
      return result;
  }
 
  public String longestPalindrome(String s) {
      if (s.length() == 0) {
          return s;
      }
      int start = 0;
      int end = 0;
      int len = s.length();
      for (int i = 0; i < len; i ++) {
          int[] len1 = search(s, i, i);
          int left1 = len1[0];
          int right1 = len1[1];
          int[] len2 = search(s, i, i + 1);
          int left2 = len2[0];
          int right2 = len2[1];
          if (right1 - left1 > end - start) {
              start = left1;
              end = right1;
          }
          if (right2 - left2 > end - start) {
              start = left2;
              end = right2;
          }
      }
      return s.substring(start, end + 1);
  }
}
