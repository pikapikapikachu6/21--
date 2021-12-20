class Solution {
  public int search(int[] nums, int target) {
      int result = 0;
      for (int i = 0 ; i < nums.length; i ++) {
          if (nums[i] == target) {
              result = result + 1;
          }
          if (nums[i] > target) return result;
      }
      return result;
  }
}