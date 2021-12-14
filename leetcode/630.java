class Solution {
  public int scheduleCourse(int[][] courses) {
      int num = courses.length;
      Arrays.sort(courses, (a, b) -> a[1] - b[1]);
      PriorityQueue<Integer> q = new PriorityQueue<Integer>((a, b) -> b - a);
      int total = 0;
      for (int i = 0; i < num; i ++) {
          int t = courses[i][0];
          int d = courses[i][1];
          if (total + t <= d) {
              total = total + t;
              q.offer(t);
          } else if (!q.isEmpty() && q.peek() > t) {
              total = total - q.poll() + t;
              q.offer(t);
          }
      }
      return q.size();
  }
}