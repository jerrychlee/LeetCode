class Solution {
    public int longestPalindrome(String s) {
        int []a = new int[26*2];
        for(Character c:s.toCharArray()){
            if(c>=65 && c<=90){
                a[c-65]++;
            }else if(c>=97 && c<=122){
                a[c-97+26]++;                
            }else{
                
            }    
        }
        
        int even = 0;
        int odd = 0;
        int count = 0;
        for(int i:a){
            if(i>0){
                if(i%2==0){
                    even+=i;
                }else{
                    count++;
                    odd+=i-1;
                }
            }
        }
        return (count>0)? even + odd + 1:even;
    }
}