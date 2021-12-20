class Solution {
  public int findRadius(int[] houses, int[] heaters) {
      int len = houses.length;
      int[] check = new int[len];
      for (int i = 0; i < len; i ++) {
          check[i] = 1000000000;
      }
      for (int i = 0; i < heaters.length; i ++) {
          for (int j = 0; j < len; j ++) {
              int current = Math.abs(houses[j] - heaters[i]);
              check[j] = Math.min(current, check[j]);   
          }
      }
      int result = 0;
      for (int i = 0; i < len; i ++) {
          if (check[i] > result) {
              result = check[i];
          }
      }
      return result;
  }
}