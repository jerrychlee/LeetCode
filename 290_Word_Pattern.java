class Solution {
    public boolean wordPattern(String pattern, String str) {
        String [] s = str.split(" ");  
        
        if(s.length!=pattern.length()){
            return false;
        }
        
        Map<Character,String> map = new HashMap();
        Set<String> set = new HashSet();
        for(int i=0; i<pattern.length(); i++){
            char c = pattern.charAt(i);
            if(map.containsKey(c)){
                if(map.get(c).compareTo(s[i])!=0){
                    return false;
                }
            }else{
                map.put(c, s[i]);
                if(set.contains(s[i])){
                    return false;
                }else{
                    set.add(s[i]);
                }
            }    
        }
        
        return true;
    }
}