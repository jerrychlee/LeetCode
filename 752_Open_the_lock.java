class Solution {
    public int openLock(String[] deadends, String target) {
        
        Set<String> deadSet = new HashSet<>(Arrays.asList(deadends));
        if(deadSet.contains(target)||deadSet.contains("0000"))
            return -1;
        
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        
        int steps = 0;
        queue.add("0000");
        visited.add("0000");
        
        while(!queue.isEmpty()){
            int size = queue.size();            
            for(int count = 0; count<size; count++){
                String cur = queue.remove();
                if(cur.equals(target)){
                    System.out.println(cur+" "+target);                            
                    return steps;                    
                }
            
                for(int i=0; i<4; i++){
                    // case + 1
                    char[] c_arr = cur.toCharArray();
                    c_arr[i] = (char)((c_arr[i]-'0'+1 + 10)%10 + '0');                                    
                    String nextString = String.valueOf(c_arr);
                    if(!visited.contains(nextString) && !deadSet.contains(nextString)){                                           
                        queue.add(nextString);
                        visited.add(nextString);
                    }
                    // case -1
                    c_arr = cur.toCharArray();
                    c_arr[i] = (char)((c_arr[i]-'0'-1 + 10)%10 + '0');                                    
                    nextString = String.valueOf(c_arr);
                    if(!visited.contains(nextString) && !deadSet.contains(nextString)){
                        queue.add(nextString);
                        visited.add(nextString);
                    }             
                }
            }
            steps++;
        }
        
        return -1;
    }
}
