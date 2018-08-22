class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap();
        for(Character c:magazine.toCharArray()){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else{
                map.put(c, 1);
            }
        }
        
        for(Character c:ransomNote.toCharArray()){
            int val = map.getOrDefault(c, 0);
            if(val==0){
                return false;
            }else{
                if(val==1){
                    map.remove(c);
                }else{
                    map.put(c, val-1);                    
                }
            }
        }
        
        return true;
        
    }
}