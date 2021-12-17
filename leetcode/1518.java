class Solution {
  public int numWaterBottles(int numBottles, int numExchange) {
      int current = numBottles;
      int add = 0;
      int sum = numBottles;
      while (current >= numExchange) {
          add = current / numExchange;
          sum = sum + add;
          current = current / numExchange + current % numExchange;
      }
      return sum;
  }
}