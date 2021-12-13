class Solution {
  public int minEatingSpeed(int[] piles, int h) {
      int lowest = 1;
      int highest = 1000000000;
      while (lowest < highest) {
          int middle = (lowest + highest) / 2;
          if (check(piles, h, middle)) {
              highest = middle;
          } else {
              lowest = middle + 1;
          }
      }
      return lowest;
  }
  public boolean check(int[] piles, int h, int k) {
      int times = 0;
      for (int cur: piles) {
          times = times + (cur - 1) / k + 1;
      }
      return times <= h;
  }
}