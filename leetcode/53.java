class Solution {
  public int maxSubArray(int[] nums) {
      int current = 0;
      int result = nums[0];
      for (int num: nums) {
          current = Math.max(current + num, num);
          result = Math.max(result, current);
      }
      return result;
  }
}