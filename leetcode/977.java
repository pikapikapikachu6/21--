class Solution {
  public int[] sortedSquares(int[] nums) {
      List<Integer> negative = new ArrayList<Integer>();
      List<Integer> positive = new ArrayList<Integer>();
      List<Integer> result = new ArrayList<Integer>();
      for (int i = 0; i < nums.length; i ++) {
          if (nums[i] < 0) {
              negative.add(nums[i] * nums[i]);
          } else {
              positive.add(nums[i] * nums[i]);
          }
      } 
      if (positive.size() == 0) {
          for (int i = negative.size() - 1; i >= 0; i --) {
              result.add(negative.get(i));
          }
          return result.stream().mapToInt(Integer::valueOf).toArray();
      }
      if (negative.size() == 0) {
          return positive.stream().mapToInt(Integer::valueOf).toArray();
      }
      int i = negative.size() - 1;
      int j = 0;

      while (i >= 0 && j <= positive.size() - 1) {
          if (negative.get(i) <= positive.get(j)) {
              result.add(negative.get(i));
              i --;
          } else {
              result.add(positive.get(j));
              j ++;
          }
      }
      if (i >= 0) {
          for (; i >= 0; i --) {
              result.add(negative.get(i));
          }
      }
      if (j < positive.size()){
          for (; j <= positive.size() - 1; j ++) {
              result.add(positive.get(j));
          }
      }
      return result.stream().mapToInt(Integer::valueOf).toArray();
  }
}