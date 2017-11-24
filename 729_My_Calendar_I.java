class MyCalendar {
    
    List<Pair<Integer,Integer>> events = null;
    
    public MyCalendar() {
        events = new ArrayList<Pair<Integer,Integer>>();
    }
    
    public boolean book(int start, int end) {
        boolean isFree = true;
        for(Pair p:events){
            if(start<(int)p.getRight() && end>(int)p.getLeft()){
                isFree = false;
                break;
            }
        }
        
        if(isFree==true){
            events.add(new Pair(start,end));
        }
        
        return isFree;
    }
    
    /*******************************/
    /*         Pair                */
    /*******************************/
    private class Pair<L,R> {
        private final L left;
        private final R right;
        public Pair(L left, R right) {
            this.left = left;
            this.right = right;
        }
        
        public L getLeft() { return left; }
        public R getRight() { return right; }
        
        @Override
        public int hashCode() { return left.hashCode() ^ right.hashCode(); }
        
        @Override
        public boolean equals(Object o) {
            if (!(o instanceof Pair)) return false;
            Pair pairo = (Pair) o;
            
            return this.left.equals(pairo.getLeft()) && this.right.equals(pairo.getRight());
        }
    }
    
}


/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */
