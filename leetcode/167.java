class Solution {
  public int[] twoSum(int[] numbers, int target) {
      int i = 0;
      int j = 1;
      int len = numbers.length;
      int[] result = new int[2];
      while (i < len && j < len) {
          if (numbers[i] + numbers[j] == target) {
              result[0] = i + 1;
              result[1] = j + 1;
              break;
          }
          if (numbers[i] + numbers[j] < target) {
              if (j + 1 < len) {
                  j = j + 1;
              } else {
                  i = i + 1;
                  j = i + 1;
              }
          }
          if (numbers[i] + numbers[j] > target) {
              i = i + 1;
              j = i + 1;
          }
      }
      return result;
  }
}