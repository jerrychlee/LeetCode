class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length()!=t.length()){
            return false;
        }
        
        HashMap<Character, Integer> map = new HashMap();
        for(int i=0; i< s.length(); i++){
            char c = s.charAt(i);
            map.put(c , map.getOrDefault(c, 0)+1);
        }
        
        for(int i=0; i<t.length(); i++){
            char c = t.charAt(i);
            int val = map.getOrDefault(c, 0);
            if(val==0){
                return false;
            }else{
                if((val-1)==0){
                    map.remove(c);
                }else{
                    map.put(c , val-1);
                }
            }
        }
        
        return map.size()==0 ? true:false;
        
    }
}
