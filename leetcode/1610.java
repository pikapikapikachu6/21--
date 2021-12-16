class Solution {
  public int visiblePoints(List<List<Integer>> points, int angle, List<Integer> location) {
      int same = 0;
      List<Double> polar = new ArrayList<>();
      int lx = location.get(0);
      int ly = location.get(1);
      for (int i = 0; i < points.size(); i ++) {
          int x = points.get(i).get(0);
          int y = points.get(i).get(1);
          if (x == lx && y == ly) {
              same ++;
              continue;
          }
          Double de = Math.atan2(y - ly, x - lx);
          polar.add(de);
      }
      Collections.sort(polar);
      int m = polar.size();
      for (int i = 0; i < m; i ++) {
          polar.add(polar.get(i) + 2 * Math.PI);
      }
      int max = 0;
      int right = 0;
      double to = angle * Math.PI / 180;
      for (int i = 0; i < m; i ++) {
          Double cur = polar.get(i) + to;
          while (right < polar.size() && polar.get(right) <= cur) {
              right ++;
          }
          max = Math.max(max, right - i);
      }
      return max + same;
  }
}