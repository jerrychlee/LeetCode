/*********************************************************************/
/*  Version 1                                                        */
/*********************************************************************/

class MyCalendarTwo {

    List<Event> eList = new<Event>ArrayList(); 
    int eId = 0;
    
    public MyCalendarTwo() {
        
    }
    
    public boolean book(int start, int end) {
        
        boolean isFound = true;
        int eService = 0;
        
        eId++;

        Event sIdx=new Event(start, 0, eId);
        Event eIdx=new Event(end, 1, eId);

        eList.add(sIdx);
        eList.add(eIdx);
        
        Collections.sort(eList,new MyComp());
        for(int i=0; i<eList.size();i++){
            Event e = eList.get(i);
            if(e.type==0){
                eService++;
            }else{
                eService--;                
            }
            
            if(eService>2){
                isFound=false;
            }
        }    

        if(isFound==false){
            eList.remove(sIdx);    
            eList.remove(eIdx);
        }
        
        return isFound;
    }
 
    private class MyComp implements Comparator<Event>{
        @Override
        public int compare(Event e1, Event e2) {
            if(e1.time < e2.time){
                return -1;
            }else if(e1.time > e2.time){
                return 1;
            }else{
                if(e1.type>e2.type)
                    return -1;
                else if(e1.type<e2.type)
                    return 1;
                
                return e1.id-e2.id;
            }           
        }
    }
    
    private class Event{
        int time=0;
        int type=0;
        int id=0;
        Event(int time, int type, int id){
            this.time = time;
            this.type = type;
            this.id = id;
        }
    }
}

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(start,end);
 */

/*********************************************************************/
/*  Version 2                                                        */
/*********************************************************************/
class MyCalendarTwo {
    
    List<Pair<Integer,Integer>> events = null;
    
    public MyCalendarTwo() {
        events = new ArrayList<Pair<Integer,Integer>>();
    }
    
    public boolean book(int start, int end) {
        MyCalendar calendar = new MyCalendar();
        for(Pair p:events){
            if(start<(int)p.getRight() && end>(int)p.getLeft()){
                if(!calendar.book(Math.max(start,(int)p.getLeft()),Math.min(end,(int)p.getRight()))){
                    return false;
                }
            }
        }
        events.add(new Pair(start, end));
        return true;
    }
    
    
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
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(start,end);
 */
