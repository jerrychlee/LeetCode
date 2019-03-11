First Unique Character in a String

Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.
Note: You may assume the string contain only lowercase letters.

===============================================================
class Solution1 {    
    public int firstUniqChar(String s) {
        int [] array = new int[26];
        for(int i=0; i<s.length(); i++){
            array[s.charAt(i)-'a']++;
        }
        
        for(int i=0; i<s.length(); i++){
            if(array[s.charAt(i)-'a']==1)
                return i;
        }
        return -1;
    }
}

===============================================================
class Solution2 {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), i);
            }else{
                map.replace(s.charAt(i), Integer.MAX_VALUE);
            }
        }
        
        int out = Integer.MAX_VALUE;
        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(out > entry.getValue()){
                out = entry.getValue();
            }
        }
        
        if(out == Integer.MAX_VALUE){
            out = -1;
        }
        
        return out;
    }
}
