class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int m = s.length()/k;
        int n = s.length()%k;
        
        for(int i=0; i<m; i++){
            if(i%2==0){
                sb.append(revert(s,i*k,i*k+k-1));                
            }else{
                sb.append(s.substring(i*k,i*k+k));                
            }
        }    
        
        if(n!=0){
            if(m%2==0){
                sb.append(revert(s,s.length()-n, s.length()-1));
            }else{
                sb.append(s.substring(s.length()-n,s.length()));
            }
        }
                    
        return sb.toString();
    }
    
    public String revert(String s, int start, int end){
        StringBuilder sb = new StringBuilder();
        sb.append(s.substring(start, end+1));
        return sb.reverse().toString();
    }
}