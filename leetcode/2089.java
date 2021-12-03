class Solution {
  public List<Integer> targetIndices(int[] nums, int target) {
      int small = 0;
      int same = 0;
      List<Integer> result = new ArrayList();
      for (int i = 0; i < nums.length; i ++) {
          if (nums[i] < target) {
              small = small + 1;
          }
          if (nums[i] == target) {
              same = same + 1;
          }
      }
      for (int i = 0; i < same; i ++) {
          result.add(i + small);
      }
      return result;
  }
}