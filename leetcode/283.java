class Solution {
  public void moveZeroes(int[] nums) {
      int num = 0;
      int i;
      for (i = 0; i < nums.length; i ++) {
          while (i + num < nums.length) {
              if (nums[i + num] != 0) {
                  nums[i] = nums[i + num];
                  break;
              } else {
                  num ++;
              }
          }
      }
      for (i = 0; i < num; i ++) {
          nums[nums.length - 1 - i] = 0;
      }
  }
}