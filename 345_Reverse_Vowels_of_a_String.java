class Solution {
    public String reverseVowels(String s) {
        int low = 0;
        int high = s.length()-1;
        char [] cs = s.toCharArray();
        
        while(low<high){
            if(isVowels(cs[low])&&isVowels(cs[high])){
                char tmp = cs[low];
                cs[low] = cs[high];
                cs[high] = tmp;
                low++;
                high--;
            }
            
            while(low<s.length() && !isVowels(cs[low])){
                low++;
            }
            
            while(high>=0 && !isVowels(cs[high])){
                high--;
            }
        }
        
        return new String(cs);
    }
    
    public Boolean isVowels(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||
           c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
            return true;
        else
            return false;
    }
}
