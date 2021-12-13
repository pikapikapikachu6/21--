class Solution {
  List<Integer> temp = new ArrayList<Integer>();
  List<List<Integer>> result = new ArrayList<List<Integer>>();

  public List<List<Integer>> combine(int n, int k) {
      dfs(1, n, k);
      return result;
  }

  public void dfs(int current, int n, int k) {
      if (temp.size() + (n - current + 1) < k) {
          return;
      }
      if (temp.size() == k) {
          result.add(new ArrayList<Integer>(temp));
          return;
      }
      temp.add(current);
      dfs(current + 1, n, k);
      temp.remove(temp.size() - 1);
      dfs(current + 1, n, k);
  }
}