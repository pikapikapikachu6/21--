class Solution {
  public int searchInsert(int[] nums, int target) {
      int left = 0;
      int right = nums.length - 1;
      int index = (right + left) / 2;
      int current = nums[index];
      if (nums[0] >= target) return 0;
      if (nums[right] == target) return right;
      if (nums[right] < target) return right + 1;
      while (current != target) {
          if (current < target) {
              if (nums[index + 1] >= target) {
                  return index + 1;
              } else {
                  left = index + 1;
              }
          }
          if (current > target) {
              if (nums[index - 1] < target) {
                  return index;
              } else if (nums[index - 1] == target) {
                  return index - 1;
              } else  {
                  right = index - 1;
              }
          }
          if (left == right) {
              return left;
          }
          index = (right + left) / 2;
          current = nums[index];
      }
      return index;
  }
}