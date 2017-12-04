/*******************************/
/* Version 1                   */
/*******************************/
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int m = n;
        int count = 0;
        for(int i=0; i<32; i++){
            if((m&1)==1){
                count++;
            }
            m>>>=1;
        }
        
        return count;
    }
}

/*******************************/
/* Version 2                   */
/*******************************/
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        for(int i=0; i<32; i++){
            if((n >> i & 1) == 1)
                count++;
        }
        return count;
    }
}
