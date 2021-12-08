class Solution {
  public int lengthOfLongestSubstring(String s) {
      Set<Character> record = new HashSet<Character>();
      int len = s.length();
      int right = -1;
      int result = 0;
      for (int i = 0; i < len; ++i) {
          if (i != 0) {
              record.remove(s.charAt(i - 1));
          }
          while (right + 1 < len && !record.contains(s.charAt(right + 1))) {
              record.add(s.charAt(right + 1));
              ++ right;
          }
          result = Math.max(result, right - i + 1);
      }
      return result;
  }
}