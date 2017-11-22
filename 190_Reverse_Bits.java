public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int revert = 0;
        int m = n;
        for(int i=0; i<32; i++){
            int mod = m%2;
            revert = revert<<1;
            revert = revert+mod;                
            m>>>=1;
        }
        //debug
        //System.out.println(Integer.toBinaryString(revert));
        return revert;
    }
}
