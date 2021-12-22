class Solution {
  public int repeatedStringMatch(String a, String b) {
      int an = a.length(), bn = b.length();
      int index = strStr(a, b);
      if (index == -1) {
          return -1;
      }
      if (an - index >= bn) {
          return 1;
      }
      return (bn + index - an - 1) / an + 2;
  }

  public int strStr(String haystack, String needle) {
      int hlen = haystack.length();
      int nlen = needle.length();
      if (nlen == 0) {
          return 0;
      }
      int[] pi = new int[nlen];
      for (int i = 1, j = 0; i < nlen; i++) {
          while (j > 0 && needle.charAt(i) != needle.charAt(j)) {
              j = pi[j - 1];
          }
          if (needle.charAt(i) == needle.charAt(j)) {
              j++;
          }
          pi[i] = j;
      }
      for (int i = 0, j = 0; i - j < hlen; i++) {
          while (j > 0 && haystack.charAt(i % hlen) != needle.charAt(j)) { 
              j = pi[j - 1];
          }
          if (haystack.charAt(i % hlen) == needle.charAt(j)) {
              j++;
          }
          if (j == nlen) {
              return i - nlen + 1;
          }
      }
      return -1;

  }
}