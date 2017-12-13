class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int l = s.length();
        for(int i=0; i<l/2; i++){
            int len = 1+i;
            String tmp = s.substring(0,len);
            if(l%len==0){
                int m = l/len;
                StringBuilder s1 = new StringBuilder(); 
                for(int j=0; j<m; j++){
                    s1.append(tmp);
                }
                if(s1.toString().compareTo(s)==0){
                    return true;
                }
            }
        }
        return false;
    }
}