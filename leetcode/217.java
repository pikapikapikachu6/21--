class Solution {
  public boolean containsDuplicate(int[] nums) {
      Set<Integer> check = new HashSet<Integer>();
      for (int i = 0; i < nums.length; i ++) {
          if (!check.add(nums[i])) {
              return true;
          }
      }
      return false;
  }

}