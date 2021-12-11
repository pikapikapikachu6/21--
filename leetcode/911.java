class TopVotedCandidate {
  List<Integer> top = new ArrayList<Integer>();
  Map<Integer, Integer> vote = new HashMap<Integer, Integer>();
  int[] times;
  public TopVotedCandidate(int[] persons, int[] times) {
      vote.put(-1, -1);
      int current = -1;
      for (int i = 0; i < persons.length; i ++) {
          int p = persons[i];
          vote.put(p, vote.getOrDefault(p, 0) + 1);
          if (vote.get(p) >= vote.get(current)) {
              current = p;
          }
          top.add(current);
      }
      this.times = times;
  }
  
  public int q(int t) {
      int i = 0;
      int len = times.length - 1;
      while (i < len) {
          int cu = i + (len - i + 1) / 2;
          if (times[cu] <= t) {
              i = cu;
          } else {
              len = cu - 1;
          }
      }
      return top.get(i);
  }
}

/**
* Your TopVotedCandidate object will be instantiated and called as such:
* TopVotedCandidate obj = new TopVotedCandidate(persons, times);
* int param_1 = obj.q(t);
*/