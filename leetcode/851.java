class Solution {
  public int[] loudAndRich(int[][] richer, int[] quiet) {
      int len = quiet.length;
      List<Integer>[] check = new List[len];
      for (int i = 0; i < len; i ++) {
          check[i] = new ArrayList<Integer>();
      }
      for (int[] num: richer) {
          check[num[1]].add(num[0]);
      }
      int[] result = new int[len];
      Arrays.fill(result, -1);
      for (int i = 0; i < len; i ++) {
          dfs(i, quiet, check, result);
      }
      return result;
  }

  public void dfs(int current, int[] quiet, List<Integer>[] check, int[] result) {
      if (result[current] != -1) {
          return;
      }
      result[current] = current;
      for (int i: check[current]) {
          dfs(i, quiet, check, result);
          if (quiet[result[i]] < quiet[result[current]]) {
              result[current] = result[i];
          }
      }
  }

}