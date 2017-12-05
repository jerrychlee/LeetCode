/*****************************************/
/* Version 1                             */
/*****************************************/
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0)
            return false;
        
        while(n%2==0){
            n/=2;
        }
        
        return (n==1)?true:false;
    }
}

/*****************************************/
/* Version 2                             */
/*****************************************/
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0)
            return false;
        
        return (Math.pow(2,30)%n)==0 ? true:false;
    }
}

/*****************************************/
/* Version 3                             */
/*****************************************/
class Solution {
    public boolean isPowerOfTwo(int n) {
        
        if(n<=0)
            return false;
        
        return ((Math.log10(n)/Math.log10(2)%1) == 0)? true:false;
    }
}
