class SeatManager {
    public SeatManager(int n) {}
  
    public int reserve() {
      if (min_hp.isEmpty())
        return ++num;
      return min_hp.poll();
    }
  
    public void unreserve(int seatNumber) {
      min_hp.offer(seatNumber);
    }
  
    public Queue<Integer> min_hp = new PriorityQueue<>();
    public int num = 0;
  }