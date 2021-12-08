class Solution {
  public int[] maxSumOfThreeSubarrays(int[] nums, int k) {
      int[] result = new int[3];
      int sum1 = 0;
      int sum2 = 0;
      int sum3 = 0;
      int maxSum1 = 0;
      int maxSum2 = 0;
      int maxTotal = 0;
      int sum1Index = 0;
      int sum2Index1 = 0;
      int sum2Index2 = 0;
      for (int i = k * 2; i < nums.length; ++i) {
          sum1 = sum1 + nums[i - k * 2];
          sum2 = sum2 + nums[i - k];
          sum3 = sum3 + nums[i];
          if (i >= k * 3 - 1) {
              if (sum1 > maxSum1) {
                  maxSum1 = sum1;
                  sum1Index = i - k * 3 + 1;
              }
              if (maxSum1 + sum2 > maxSum2) {
                  maxSum2 = maxSum1 + sum2;
                  sum2Index1 = sum1Index;
                  sum2Index2 = i - k * 2 + 1;
              }
              if (maxSum2 + sum3 > maxTotal) {
                  maxTotal = maxSum2 + sum3;
                  result[0] = sum2Index1;
                  result[1] = sum2Index2;
                  result[2] = i - k + 1;
              }
              sum1 = sum1 - nums[i - k * 3 + 1];
              sum2 = sum2 - nums[i - k * 2 + 1];
              sum3 = sum3 - nums[i - k + 1];
          }
      }
      return result;
  }
}