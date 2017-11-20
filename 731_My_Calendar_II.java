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