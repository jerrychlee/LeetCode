49. Group Anagrams

Given an array of strings, group anagrams together.

Example:

Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]

=========================================================================================

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String str:strs){
            char[] ca = str.toCharArray();
            Arrays.sort(ca);
            String s = String.valueOf(ca);
            List<String> list = null;
            if(map.containsKey(s)){
                list = map.get(s);
                list.add(str);
            }else{
                list = new ArrayList<String>();
                list.add(str);
                map.put(s, list);
            }
        }
        
        return new ArrayList<List<String>>(map.values());
    }
}

=========================================================================================
