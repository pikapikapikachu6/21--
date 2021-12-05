class Solution {
  static final int MOD = 1337;

  public int superPow(int a, int[] b) {
      int result = 1;
      for (int num : b) {
          result = (int) ((long) pow(result, 10) * pow(a, num) % MOD);
      }
      return result;
  }

  public int pow(int num1, int num) {
      int res = 1;
      while (num != 0) {
          if (num % 2 != 0) {
              res = (int) ((long) res * num1 % MOD);
          }
          num1 = (int) ((long) num1 * num1 % MOD);
          num /= 2;
      }
      return res;
  }
}
