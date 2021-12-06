class Solution {
  public String truncateSentence(String s, int k) {
      String [] arr = s.split("\\s+");
      String result = "";
      for (int i = 0; i < k; i ++) {
          if (result == "") {
              result = arr[i];
          } else {
              result = result + " " + arr[i];
          }
      }
      return result;
  }
}