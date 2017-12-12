class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> out = new ArrayList();
        if(rowIndex==0){
            out.add(1);    
        }else if(rowIndex==1){
            out.add(1);    
            out.add(1);                            
        }else{
            Queue<Integer> q = new LinkedList();
            q.add(1);
            q.add(1);
            
            for(int i=2; i<=rowIndex; i++){
                Queue<Integer> t = new LinkedList();
                t.add(1);
                int r=-1;
                int c=-1;
                while(q.peek()!=null){
                    if(r==-1){
                        r = q.poll();
                    }else if(c==-1){
                        c = q.poll();
                    }else{
                        r = c;
                        c = q.poll();
                    }
                    if(r!=-1&&c!=-1){
                        t.add(r+c);                    
                    }
                }
                t.add(1);
                q=t;
            }
            for(int e:q){
                out.add(e);
            }
        }

        return out;
            
    }
}