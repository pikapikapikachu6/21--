class Solution {
  public int missingNumber(int[] nums) {
      int len = nums.length;
      int[] check = new int[len + 1];
      for (int i = 0; i < len; i ++) {
          check[i] = 0;
      }
      for (int i = 0; i < len; i ++) {
          if (nums[i] < len) {
              check[nums[i]] = 1;
          }
      }
      for (int i = 0; i <= len; i ++) {
          if (check[i] == 0) {
              return i;
          }
      }
      return 0;
  }
}