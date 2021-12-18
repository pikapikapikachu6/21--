class Solution {
  public String reverseLeftWords(String s, int n) {
      String result = "";
      for (int i = n; i < s.length(); i ++) {
          result = result + s.charAt(i);
      }
      for (int i = 0; i < n; i ++) {
          result = result + s.charAt(i);
      }
      return result;
  }
}