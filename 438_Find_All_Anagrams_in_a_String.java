class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        List<Integer> out = new ArrayList();
        int []array = new int[30];
        buildMap(array, p);
        
        int i=0;
        int j=0;
        while(i<=s.length()-p.length()){
            boolean isFound = true;
            char sc = s.charAt(i);
            
            if(i==0){
                for(j=i;j<i+p.length();j++){
                    char c = s.charAt(j);
                    if(!(array[c-'a']>0)){
                        isFound = false;
                    }
                    
                    array[c-'a']--;
                    
                    if(j==(i+p.length()-1)){
                        if(isFound){
                            out.add(i);
                        }
                    }
                }
            }else{

                char c;
                for(j=i;j<i+p.length()-1;j++){
                    c = s.charAt(j);
                    if(!(array[c-'a']>=0)){
                        isFound = false;
                    }
                }

                c = s.charAt(j);
                
                if(!(array[c-'a']>0)){
                    isFound = false;
                }
                
                array[c-'a']--;
                
                if(isFound){
                    out.add(i);
                }
            }
            array[sc-'a']++;
            i++;
        }
        return out;
    }
    
    static void buildMap(int[] array, String p){
        for(int i=0; i<p.length(); i++){
            char c = p.charAt(i);
            array[c-'a']++;
        }
    }
}
