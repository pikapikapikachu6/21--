class Solution {
  public int search(int[] nums, int target) {
      int find = -1;
      int current = (nums.length - 1) / 2;
      int left = 0;
      int right = nums.length - 1;
      while (nums[current] != target) {
          if (left >= right) {
              find = 0;
              break;
          }
          if (nums[current] < target) {
              left = current + 1;
          } else {
              right = current - 1;
          }
          current = (right + left) / 2;
      }
      if (find == 0) {
          return -1;
      }
      return current;
  }
}