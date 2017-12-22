class Solution {
    public int countSegments(String s) {
        
        s=s.trim();
        
        if(s.length()==0){
            return 0;
        }
        
        String [] sp = s.split("\\s+");
                    
        return sp.length;
    }
}