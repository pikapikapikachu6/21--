class Solution {
  public int findRepeatNumber(int[] nums) {
      HashMap<Integer, Integer> check = new HashMap<Integer, Integer>();
      for (int i = 0; i < nums.length; i ++) {
          if (check.containsKey(nums[i])) {
              return nums[i];
          }
          check.put(nums[i], i);
      }
      return 0;
  }
}