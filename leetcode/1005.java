class Solution {
  public static void sort(int[] a, int left, int right) {
      int i, j, index;
      if (left > right) {
          return;
      } 
      i = left;
      j = right;
      index = a[i];
      while (i < j) {
          while (i < j && a[j] >= index) {
              j --;
          }
          if (i < j) {
              a[i ++] = a[j];
          }
          while (i < j && a[i] < index) {
              i ++;
          }
          if (i < j) {
              a[j --] = a[i];
          }
      }
      a[i] = index;
      sort(a, left, i -1);
      sort(a, i + 1, right);
  }

  public static void quickSort(int a[]) {
      sort(a, 0, a.length - 1);
  }

  public int largestSumAfterKNegations(int[] nums, int k) {
      quickSort(nums);
      int zero_exit = -1;
      int max_zero = -1;
      for (int i = 0; i < nums.length; i ++) {
          if (k > 0) {
              if (nums[i] < 0) {
                  if (i == nums.length - 1) {
                      max_zero = i;
                  } else if (nums[i + 1] > 0) {
                      max_zero = i;
                  }
                  nums[i] = - nums[i];
                  k --;
              } else if (nums[i] == 0) {
                  zero_exit = i;
              } 
          } else break;
      }  
      if (k > 0) {
          k = k % 2;
          if (k == 1 && zero_exit == -1) {
              if (max_zero == -1) {
                  nums[0] = -nums[0];
              } else if (max_zero == nums.length - 1) {
                  nums[max_zero] = - nums[max_zero];
              } else if (nums[max_zero] > nums[max_zero + 1]) {
                  nums[max_zero + 1] = - nums[max_zero + 1];
              } else {
                  nums[max_zero] = - nums[max_zero];
              }
          }
      }
      int result = 0;
      for (int i = 0; i < nums.length; i ++) {
          result = result + nums[i];
      }
      return result;
  }
}