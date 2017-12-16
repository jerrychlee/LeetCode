class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> map = new HashMap();
        char [] cArray = s.toCharArray();
        for(char c:cArray){
            int val = map.getOrDefault(c, 0);
            if(val==0){
                map.put(c,1);    
            }else{
                map.put(c,val+1);                    
            }
        }

        cArray = t.toCharArray();
        for(char c:cArray){
            int val = map.getOrDefault(c, 0);
            if(val==0){
                return c;    
            }else{
                map.put(c,val-1);                    
            }
        }
        return ' ';
    }    
}