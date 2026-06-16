    }
    
    public int ping(int t) {
        q.offer(t);
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
    public RecentCounter() {
class RecentCounter {
    Queue <Integer> q ;
        q = new LinkedList<>();
        while(q.peek() < t-3000){
            q.poll();
        }
        return q.size();
