class Solution {
    public boolean areSentencesSimilar(String[] words1, String[] words2, String[][] pairs) {
        
        Set set = new TreeSet();
        
        if(words1.length!=words2.length)
            return false;
        
        for(String[] p:pairs){
            set.add(p[0]+":"+p[1]);
        }
        
        for(int i=0; i<words1.length; i++){
            if((words1[i].compareTo(words2[i]))!=0
               && !isSimilar(set, words1[i], words2[i])
               && !isSimilar(set, words2[i], words1[i])){
                
                return false;
            }
        }
        
        return true;
        
    }
    
    public boolean isSimilar(Set set, String s1, String s2){
        String sc = s1.concat(":").concat(s2);
        if(set.contains(sc))
            return true;
        else
            return false;
    }
}
